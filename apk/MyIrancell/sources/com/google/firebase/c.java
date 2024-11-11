package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.n;
import com.google.android.gms.common.util.o;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.f;
import com.google.firebase.components.h;
import com.google.firebase.components.l;
import com.google.firebase.components.s;
import defpackage.bv;
import defpackage.c0;
import defpackage.ev;
import defpackage.h1;
import defpackage.jv;
import defpackage.mv;
import defpackage.ov;
import defpackage.qv;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class c {
    private static final Object i = new Object();
    private static final Executor j = new d();

    @GuardedBy("LOCK")
    static final Map<String, c> k = new c0();
    private final Context a;
    private final String b;
    private final com.google.firebase.d c;
    private final l d;
    private final s<jv> g;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final List<b> h = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: com.google.firebase.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0052c implements c.a {
        private static AtomicReference<C0052c> a = new AtomicReference<>();

        private C0052c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (n.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    C0052c c0052c = new C0052c();
                    if (a.compareAndSet(null, c0052c)) {
                        com.google.android.gms.common.api.internal.c.a(application);
                        com.google.android.gms.common.api.internal.c.b().a(c0052c);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z) {
            synchronized (c.i) {
                Iterator it = new ArrayList(c.k.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e.get()) {
                        cVar.a(z);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class d implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(24)
    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {
        private static AtomicReference<e> b = new AtomicReference<>();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                e eVar = new e(context);
                if (b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void a() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (c.i) {
                Iterator<c> it = c.k.values().iterator();
                while (it.hasNext()) {
                    it.next().j();
                }
            }
            a();
        }
    }

    protected c(Context context, String str, com.google.firebase.d dVar) {
        new CopyOnWriteArrayList();
        u.a(context);
        this.a = context;
        u.b(str);
        this.b = str;
        u.a(dVar);
        this.c = dVar;
        List<h> a2 = f.a(context, ComponentDiscoveryService.class).a();
        String a3 = ov.a();
        Executor executor = j;
        com.google.firebase.components.d[] dVarArr = new com.google.firebase.components.d[8];
        dVarArr[0] = com.google.firebase.components.d.a(context, Context.class, new Class[0]);
        dVarArr[1] = com.google.firebase.components.d.a(this, c.class, new Class[0]);
        dVarArr[2] = com.google.firebase.components.d.a(dVar, com.google.firebase.d.class, new Class[0]);
        dVarArr[3] = qv.a("fire-android", "");
        dVarArr[4] = qv.a("fire-core", "19.3.0");
        dVarArr[5] = a3 != null ? qv.a("kotlin", a3) : null;
        dVarArr[6] = mv.b();
        dVarArr[7] = ev.a();
        this.d = new l(executor, a2, dVarArr);
        this.g = new s<>(com.google.firebase.b.a(this, context));
    }

    public static c a(Context context) {
        synchronized (i) {
            if (k.containsKey("[DEFAULT]")) {
                return i();
            }
            com.google.firebase.d a2 = com.google.firebase.d.a(context);
            if (a2 == null) {
                return null;
            }
            return a(context, a2);
        }
    }

    public static c a(Context context, com.google.firebase.d dVar) {
        return a(context, dVar, "[DEFAULT]");
    }

    public static c a(Context context, com.google.firebase.d dVar, String str) {
        c cVar;
        C0052c.b(context);
        String a2 = a(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (i) {
            u.b(!k.containsKey(a2), "FirebaseApp name " + a2 + " already exists!");
            u.a(context, "Application context cannot be null.");
            cVar = new c(context, a2, dVar);
            k.put(a2, cVar);
        }
        cVar.j();
        return cVar;
    }

    private static String a(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ jv a(c cVar, Context context) {
        return new jv(context, cVar.d(), (bv) cVar.d.a(bv.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Iterator<b> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    private void h() {
        u.b(!this.f.get(), "FirebaseApp was deleted");
    }

    public static c i() {
        c cVar;
        synchronized (i) {
            cVar = k.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!h1.a(this.a)) {
            e.b(this.a);
        } else {
            this.d.a(f());
        }
    }

    public Context a() {
        h();
        return this.a;
    }

    public <T> T a(Class<T> cls) {
        h();
        return (T) this.d.a(cls);
    }

    public String b() {
        h();
        return this.b;
    }

    public com.google.firebase.d c() {
        h();
        return this.c;
    }

    public String d() {
        return com.google.android.gms.common.util.c.c(b().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.c(c().a().getBytes(Charset.defaultCharset()));
    }

    public boolean e() {
        h();
        return this.g.get().a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.b.equals(((c) obj).b());
        }
        return false;
    }

    public boolean f() {
        return "[DEFAULT]".equals(b());
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        s.a a2 = com.google.android.gms.common.internal.s.a(this);
        a2.a("name", this.b);
        a2.a("options", this.c);
        return a2.toString();
    }
}
