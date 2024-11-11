package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.C2047a;
import com.google.firebase.C2052c;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import p000.AbstractC2871ks;
import p000.C3000ns;
import p000.C3542zu;
import p000.InterfaceC0437av;
import p000.InterfaceC2360cv;
import p000.InterfaceC2400ds;
import p000.InterfaceC2487fv;
import p000.InterfaceC2826js;
import p000.InterfaceC3180rv;
import p000.ThreadFactoryC3536zo;

/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: i */
    private static final long f8862i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static C2125v f8863j;

    /* renamed from: k */
    @GuardedBy("FirebaseInstanceId.class")
    private static ScheduledExecutorService f8864k;

    /* renamed from: a */
    private final Executor f8865a;

    /* renamed from: b */
    private final C2052c f8866b;

    /* renamed from: c */
    private final C2103k f8867c;

    /* renamed from: d */
    private final C2114p0 f8868d;

    /* renamed from: e */
    private final C2113p f8869e;

    /* renamed from: f */
    private final C2133z f8870f;

    /* renamed from: g */
    @GuardedBy("this")
    private boolean f8871g;

    /* renamed from: h */
    private final C2077a f8872h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    /* loaded from: classes.dex */
    public class C2077a {

        /* renamed from: a */
        private boolean f8873a;

        /* renamed from: b */
        private final InterfaceC2360cv f8874b;

        /* renamed from: c */
        @GuardedBy("this")
        private boolean f8875c;

        /* renamed from: d */
        @GuardedBy("this")
        private InterfaceC0437av<C2047a> f8876d;

        /* renamed from: e */
        @GuardedBy("this")
        private Boolean f8877e;

        C2077a(InterfaceC2360cv interfaceC2360cv) {
            this.f8874b = interfaceC2360cv;
        }

        /* renamed from: b */
        private final synchronized void m10621b() {
            if (this.f8875c) {
                return;
            }
            this.f8873a = m10623d();
            Boolean m10622c = m10622c();
            this.f8877e = m10622c;
            if (m10622c == null && this.f8873a) {
                InterfaceC0437av<C2047a> interfaceC0437av = new InterfaceC0437av(this) { // from class: com.google.firebase.iid.o0

                    /* renamed from: a */
                    private final FirebaseInstanceId.C2077a f8939a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f8939a = this;
                    }

                    @Override // p000.InterfaceC0437av
                    /* renamed from: a */
                    public final void mo3193a(C3542zu c3542zu) {
                        FirebaseInstanceId.C2077a c2077a = this.f8939a;
                        synchronized (c2077a) {
                            if (c2077a.m10624a()) {
                                FirebaseInstanceId.this.m10601k();
                            }
                        }
                    }
                };
                this.f8876d = interfaceC0437av;
                this.f8874b.mo10581a(C2047a.class, interfaceC0437av);
            }
            this.f8875c = true;
        }

        /* renamed from: c */
        private final Boolean m10622c() {
            ApplicationInfo applicationInfo;
            Context m10503a = FirebaseInstanceId.this.f8866b.m10503a();
            SharedPreferences sharedPreferences = m10503a.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m10503a.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m10503a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: d */
        private final boolean m10623d() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context m10503a = FirebaseInstanceId.this.f8866b.m10503a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(m10503a.getPackageName());
                ResolveInfo resolveService = m10503a.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized boolean m10624a() {
            m10621b();
            if (this.f8877e != null) {
                return this.f8877e.booleanValue();
            }
            return this.f8873a && FirebaseInstanceId.this.f8866b.m10508e();
        }
    }

    private FirebaseInstanceId(C2052c c2052c, C2103k c2103k, Executor executor, Executor executor2, InterfaceC2360cv interfaceC2360cv, InterfaceC3180rv interfaceC3180rv, InterfaceC2487fv interfaceC2487fv) {
        this.f8871g = false;
        if (C2103k.m10655a(c2052c) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f8863j == null) {
                f8863j = new C2125v(c2052c.m10503a());
            }
        }
        this.f8866b = c2052c;
        this.f8867c = c2103k;
        this.f8868d = new C2114p0(c2052c, c2103k, executor, interfaceC3180rv, interfaceC2487fv);
        this.f8865a = executor2;
        this.f8870f = new C2133z(f8863j);
        this.f8872h = new C2077a(interfaceC2360cv);
        this.f8869e = new C2113p(executor);
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.iid.l0

            /* renamed from: b */
            private final FirebaseInstanceId f8926b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8926b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8926b.m10620h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseInstanceId(C2052c c2052c, InterfaceC2360cv interfaceC2360cv, InterfaceC3180rv interfaceC3180rv, InterfaceC2487fv interfaceC2487fv) {
        this(c2052c, new C2103k(c2052c.m10503a()), C2082b.m10639b(), C2082b.m10639b(), interfaceC2360cv, interfaceC3180rv, interfaceC2487fv);
    }

    /* renamed from: a */
    private final <T> T m10593a(AbstractC2871ks<T> abstractC2871ks) {
        try {
            return (T) C3000ns.m14384a(abstractC2871ks, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    m10617e();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10594a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f8864k == null) {
                f8864k = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3536zo("FirebaseInstanceId"));
            }
            f8864k.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: b */
    private final AbstractC2871ks<InterfaceC2079a> m10595b(final String str, String str2) {
        final String m10598c = m10598c(str2);
        return C3000ns.m14385a((Object) null).mo11820b(this.f8865a, new InterfaceC2400ds(this, str, m10598c) { // from class: com.google.firebase.iid.k0

            /* renamed from: a */
            private final FirebaseInstanceId f8923a;

            /* renamed from: b */
            private final String f8924b;

            /* renamed from: c */
            private final String f8925c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8923a = this;
                this.f8924b = str;
                this.f8925c = m10598c;
            }

            @Override // p000.InterfaceC2400ds
            /* renamed from: a */
            public final Object mo6923a(AbstractC2871ks abstractC2871ks) {
                return this.f8923a.m10608a(this.f8924b, this.f8925c, abstractC2871ks);
            }
        });
    }

    /* renamed from: c */
    private static C2123u m10597c(String str, String str2) {
        return f8863j.m10710a("", str, str2);
    }

    /* renamed from: c */
    private static String m10598c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    @Keep
    public static FirebaseInstanceId getInstance(C2052c c2052c) {
        return (FirebaseInstanceId) c2052c.m10504a(FirebaseInstanceId.class);
    }

    /* renamed from: i */
    public static FirebaseInstanceId m10599i() {
        return getInstance(C2052c.m10501i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m10600j() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m10601k() {
        if (m10612a(m10615c()) || this.f8870f.m10729a()) {
            m10602l();
        }
    }

    /* renamed from: l */
    private final synchronized void m10602l() {
        if (!this.f8871g) {
            m10609a(0L);
        }
    }

    /* renamed from: m */
    private static String m10603m() {
        return f8863j.m10714b("").m10719a();
    }

    /* renamed from: a */
    public String m10604a() {
        m10601k();
        return m10603m();
    }

    /* renamed from: a */
    public String m10605a(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InterfaceC2079a) m10593a(m10595b(str, str2))).mo10629a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ AbstractC2871ks m10606a(final String str, final String str2, final String str3) {
        return this.f8868d.m10670a(str, str2, str3).mo11816a(this.f8865a, new InterfaceC2826js(this, str2, str3, str) { // from class: com.google.firebase.iid.m0

            /* renamed from: a */
            private final FirebaseInstanceId f8928a;

            /* renamed from: b */
            private final String f8929b;

            /* renamed from: c */
            private final String f8930c;

            /* renamed from: d */
            private final String f8931d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8928a = this;
                this.f8929b = str2;
                this.f8930c = str3;
                this.f8931d = str;
            }

            @Override // p000.InterfaceC2826js
            /* renamed from: a */
            public final AbstractC2871ks mo10662a(Object obj) {
                return this.f8928a.m10607a(this.f8929b, this.f8930c, this.f8931d, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ AbstractC2871ks m10607a(String str, String str2, String str3, String str4) {
        f8863j.m10713a("", str, str2, str4, this.f8867c.m10659b());
        return C3000ns.m14385a(new C2132y0(str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ AbstractC2871ks m10608a(final String str, final String str2, AbstractC2871ks abstractC2871ks) {
        final String m10603m = m10603m();
        C2123u m10597c = m10597c(str, str2);
        return !m10612a(m10597c) ? C3000ns.m14385a(new C2132y0(m10603m, m10597c.f8967a)) : this.f8869e.m10664a(str, str2, new InterfaceC2117r(this, m10603m, str, str2) { // from class: com.google.firebase.iid.n0

            /* renamed from: a */
            private final FirebaseInstanceId f8933a;

            /* renamed from: b */
            private final String f8934b;

            /* renamed from: c */
            private final String f8935c;

            /* renamed from: d */
            private final String f8936d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8933a = this;
                this.f8934b = m10603m;
                this.f8935c = str;
                this.f8936d = str2;
            }

            @Override // com.google.firebase.iid.InterfaceC2117r
            public final AbstractC2871ks zza() {
                return this.f8933a.m10606a(this.f8934b, this.f8935c, this.f8936d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m10609a(long j) {
        m10594a(new RunnableC2129x(this, this.f8867c, this.f8870f, Math.min(Math.max(30L, j << 1), f8862i)), j);
        this.f8871g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10610a(String str) {
        C2123u m10615c = m10615c();
        if (m10612a(m10615c)) {
            throw new IOException("token not available");
        }
        m10593a(this.f8868d.m10672b(m10603m(), m10615c.f8967a, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m10611a(boolean z) {
        this.f8871g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m10612a(C2123u c2123u) {
        return c2123u == null || c2123u.m10692a(this.f8867c.m10659b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2052c m10613b() {
        return this.f8866b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10614b(String str) {
        C2123u m10615c = m10615c();
        if (m10612a(m10615c)) {
            throw new IOException("token not available");
        }
        m10593a(this.f8868d.m10673c(m10603m(), m10615c.f8967a, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2123u m10615c() {
        return m10597c(C2103k.m10655a(this.f8866b), "*");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final String m10616d() {
        return m10605a(C2103k.m10655a(this.f8866b), "*");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void m10617e() {
        f8863j.m10715b();
        if (this.f8872h.m10624a()) {
            m10602l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean m10618f() {
        return this.f8867c.m10658a() != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m10619g() {
        f8863j.m10716c("");
        m10602l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m10620h() {
        if (this.f8872h.m10624a()) {
            m10601k();
        }
    }
}
