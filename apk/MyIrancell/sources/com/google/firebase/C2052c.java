package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0880c;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1097c;
import com.google.android.gms.common.util.C1108n;
import com.google.android.gms.common.util.C1109o;
import com.google.firebase.components.C2056d;
import com.google.firebase.components.C2058f;
import com.google.firebase.components.C2064l;
import com.google.firebase.components.C2071s;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.InterfaceC2060h;
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
import p000.C0500c0;
import p000.C2446ev;
import p000.C2534h1;
import p000.C2829jv;
import p000.C2957mv;
import p000.C3060ov;
import p000.C3141qv;
import p000.InterfaceC0494bv;

/* renamed from: com.google.firebase.c */
/* loaded from: classes.dex */
public class C2052c {

    /* renamed from: i */
    private static final Object f8791i = new Object();

    /* renamed from: j */
    private static final Executor f8792j = new d();

    /* renamed from: k */
    @GuardedBy("LOCK")
    static final Map<String, C2052c> f8793k = new C0500c0();

    /* renamed from: a */
    private final Context f8794a;

    /* renamed from: b */
    private final String f8795b;

    /* renamed from: c */
    private final C2075d f8796c;

    /* renamed from: d */
    private final C2064l f8797d;

    /* renamed from: g */
    private final C2071s<C2829jv> f8800g;

    /* renamed from: e */
    private final AtomicBoolean f8798e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f8799f = new AtomicBoolean();

    /* renamed from: h */
    private final List<b> f8801h = new CopyOnWriteArrayList();

    /* renamed from: com.google.firebase.c$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m10510a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: com.google.firebase.c$c */
    /* loaded from: classes.dex */
    public static class c implements ComponentCallbacks2C0880c.a {

        /* renamed from: a */
        private static AtomicReference<c> f8802a = new AtomicReference<>();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m10512b(Context context) {
            if (C1108n.m7395a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f8802a.get() == null) {
                    c cVar = new c();
                    if (f8802a.compareAndSet(null, cVar)) {
                        ComponentCallbacks2C0880c.m6628a(application);
                        ComponentCallbacks2C0880c.m6629b().m6631a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0880c.a
        /* renamed from: a */
        public void mo6634a(boolean z) {
            synchronized (C2052c.f8791i) {
                Iterator it = new ArrayList(C2052c.f8793k.values()).iterator();
                while (it.hasNext()) {
                    C2052c c2052c = (C2052c) it.next();
                    if (c2052c.f8798e.get()) {
                        c2052c.m10497a(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.c$d */
    /* loaded from: classes.dex */
    private static class d implements Executor {

        /* renamed from: a */
        private static final Handler f8803a = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f8803a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(24)
    /* renamed from: com.google.firebase.c$e */
    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<e> f8804b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f8805a;

        public e(Context context) {
            this.f8805a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m10514b(Context context) {
            if (f8804b.get() == null) {
                e eVar = new e(context);
                if (f8804b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: a */
        public void m10515a() {
            this.f8805a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C2052c.f8791i) {
                Iterator<C2052c> it = C2052c.f8793k.values().iterator();
                while (it.hasNext()) {
                    it.next().m10502j();
                }
            }
            m10515a();
        }
    }

    protected C2052c(Context context, String str, C2075d c2075d) {
        new CopyOnWriteArrayList();
        C1057u.m7286a(context);
        this.f8794a = context;
        C1057u.m7296b(str);
        this.f8795b = str;
        C1057u.m7286a(c2075d);
        this.f8796c = c2075d;
        List<InterfaceC2060h> m10547a = C2058f.m10545a(context, ComponentDiscoveryService.class).m10547a();
        String m14658a = C3060ov.m14658a();
        Executor executor = f8792j;
        C2056d[] c2056dArr = new C2056d[8];
        c2056dArr[0] = C2056d.m10523a(context, Context.class, new Class[0]);
        c2056dArr[1] = C2056d.m10523a(this, C2052c.class, new Class[0]);
        c2056dArr[2] = C2056d.m10523a(c2075d, C2075d.class, new Class[0]);
        c2056dArr[3] = C3141qv.m15134a("fire-android", "");
        c2056dArr[4] = C3141qv.m15134a("fire-core", "19.3.0");
        c2056dArr[5] = m14658a != null ? C3141qv.m15134a("kotlin", m14658a) : null;
        c2056dArr[6] = C2957mv.m14183b();
        c2056dArr[7] = C2446ev.m11637a();
        this.f8797d = new C2064l(executor, m10547a, c2056dArr);
        this.f8800g = new C2071s<>(C2051b.m10489a(this, context));
    }

    /* renamed from: a */
    public static C2052c m10490a(Context context) {
        synchronized (f8791i) {
            if (f8793k.containsKey("[DEFAULT]")) {
                return m10501i();
            }
            C2075d m10588a = C2075d.m10588a(context);
            if (m10588a == null) {
                return null;
            }
            return m10491a(context, m10588a);
        }
    }

    /* renamed from: a */
    public static C2052c m10491a(Context context, C2075d c2075d) {
        return m10492a(context, c2075d, "[DEFAULT]");
    }

    /* renamed from: a */
    public static C2052c m10492a(Context context, C2075d c2075d, String str) {
        C2052c c2052c;
        c.m10512b(context);
        String m10493a = m10493a(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f8791i) {
            C1057u.m7298b(!f8793k.containsKey(m10493a), "FirebaseApp name " + m10493a + " already exists!");
            C1057u.m7287a(context, "Application context cannot be null.");
            c2052c = new C2052c(context, m10493a, c2075d);
            f8793k.put(m10493a, c2052c);
        }
        c2052c.m10502j();
        return c2052c;
    }

    /* renamed from: a */
    private static String m10493a(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ C2829jv m10494a(C2052c c2052c, Context context) {
        return new C2829jv(context, c2052c.m10507d(), (InterfaceC0494bv) c2052c.f8797d.mo10516a(InterfaceC0494bv.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10497a(boolean z) {
        Iterator<b> it = this.f8801h.iterator();
        while (it.hasNext()) {
            it.next().m10510a(z);
        }
    }

    /* renamed from: h */
    private void m10500h() {
        C1057u.m7298b(!this.f8799f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: i */
    public static C2052c m10501i() {
        C2052c c2052c;
        synchronized (f8791i) {
            c2052c = f8793k.get("[DEFAULT]");
            if (c2052c == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C1109o.m7407a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c2052c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m10502j() {
        if (!C2534h1.m12078a(this.f8794a)) {
            e.m10514b(this.f8794a);
        } else {
            this.f8797d.m10558a(m10509f());
        }
    }

    /* renamed from: a */
    public Context m10503a() {
        m10500h();
        return this.f8794a;
    }

    /* renamed from: a */
    public <T> T m10504a(Class<T> cls) {
        m10500h();
        return (T) this.f8797d.mo10516a(cls);
    }

    /* renamed from: b */
    public String m10505b() {
        m10500h();
        return this.f8795b;
    }

    /* renamed from: c */
    public C2075d m10506c() {
        m10500h();
        return this.f8796c;
    }

    /* renamed from: d */
    public String m10507d() {
        return C1097c.m7372c(m10505b().getBytes(Charset.defaultCharset())) + "+" + C1097c.m7372c(m10506c().m10589a().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: e */
    public boolean m10508e() {
        m10500h();
        return this.f8800g.get().m13520a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2052c) {
            return this.f8795b.equals(((C2052c) obj).m10505b());
        }
        return false;
    }

    /* renamed from: f */
    public boolean m10509f() {
        return "[DEFAULT]".equals(m10505b());
    }

    public int hashCode() {
        return this.f8795b.hashCode();
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("name", this.f8795b);
        m7204a.m7206a("options", this.f8796c);
        return m7204a.toString();
    }
}
