package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.ep;
import defpackage.ur;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ld {
    private static volatile ld h = null;
    private static Boolean i = null;
    private static Boolean j = null;
    private static boolean k = false;
    private static Boolean l = null;
    private static String m = "use_dynamite_api";
    private static String n = "allow_remote_dynamite";
    private final String a;
    protected final com.google.android.gms.common.util.e b;
    private final ExecutorService c;
    private List<Pair<com.google.android.gms.measurement.internal.n6, Object>> d;
    private int e;
    private boolean f;
    private ob g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class a implements Runnable {
        final long b;
        final long c;
        private final boolean d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ld ldVar) {
            this(true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(boolean z) {
            this.b = ld.this.b.a();
            this.c = ld.this.b.b();
            this.d = z;
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ld.this.f) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                ld.this.a(e, false, this.d);
                b();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            ld.this.a(new u(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            ld.this.a(new z(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ld.this.a(new y(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            ld.this.a(new v(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            m9 m9Var = new m9();
            ld.this.a(new a0(this, activity, m9Var));
            Bundle b = m9Var.b(50L);
            if (b != null) {
                bundle.putAll(b);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            ld.this.a(new w(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            ld.this.a(new x(this, activity));
        }
    }

    private ld(Context context, String str, String str2, String str3, Bundle bundle) {
        this.a = (str == null || !c(str2, str3)) ? "FA" : str;
        this.b = com.google.android.gms.common.util.h.d();
        this.c = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        new ur(this);
        if (!(!f(context) || g())) {
            this.f = true;
            return;
        }
        if (!c(str2, str3) && (str2 == null || str3 == null)) {
            boolean z = (str2 == null) ^ (str3 == null);
        }
        a(new com.google.android.gms.internal.measurement.b(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new b());
    }

    public static ld a(Context context) {
        return a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static ld a(Context context, String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.u.a(context);
        if (h == null) {
            synchronized (ld.class) {
                if (h == null) {
                    h = new ld(context, str, str2, str3, bundle);
                }
            }
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(a aVar) {
        this.c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Exception exc, boolean z, boolean z2) {
        this.f |= z;
        if (!z && z2) {
            a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    private final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        a(new s(this, l2, str, str2, bundle, z, z2));
    }

    private final void a(String str, String str2, Object obj, boolean z) {
        a(new q(this, str, str2, obj, z));
    }

    private static boolean a(Context context, String str) {
        com.google.android.gms.common.internal.u.b(str);
        try {
            ApplicationInfo a2 = ep.a(context).a(context.getPackageName(), 128);
            if (a2 != null && a2.metaData != null) {
                return a2.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean b(Context context) {
        String str;
        boolean z;
        i(context);
        synchronized (ld.class) {
            if (!k) {
                try {
                    try {
                        str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "measurement.dynamite.enabled", "");
                    } catch (Exception unused) {
                        l = null;
                    }
                    if ("true".equals(str)) {
                        z = true;
                    } else if ("false".equals(str)) {
                        z = false;
                    } else {
                        l = null;
                    }
                    l = z;
                } finally {
                    k = true;
                }
            }
        }
        Boolean bool = l;
        if (bool == null) {
            bool = i;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str, String str2) {
        return (str2 == null || str == null || g()) ? false : true;
    }

    private static boolean f(Context context) {
        try {
            com.google.android.gms.common.api.internal.h.a(context);
        } catch (IllegalStateException unused) {
        }
        return com.google.android.gms.common.api.internal.h.a() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    private static boolean g() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Context context) {
        synchronized (ld.class) {
            try {
            } catch (Exception unused) {
                i = false;
                j = false;
            }
            if (i == null || j == null) {
                if (a(context, "app_measurement_internal_disable_startup_flags")) {
                    i = false;
                    j = false;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                i = Boolean.valueOf(sharedPreferences.getBoolean(m, false));
                j = Boolean.valueOf(sharedPreferences.getBoolean(n, false));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(m);
                edit.remove(n);
                edit.apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ob a(Context context, boolean z) {
        try {
            return na.asInterface(DynamiteModule.a(context, z ? DynamiteModule.k : DynamiteModule.i, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            a((Exception) e, true, false);
            return null;
        }
    }

    public final String a() {
        m9 m9Var = new m9();
        a(new i(this, m9Var));
        return m9Var.a(500L);
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        m9 m9Var = new m9();
        a(new l(this, str, str2, z, m9Var));
        Bundle b2 = m9Var.b(5000L);
        if (b2 == null || b2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b2.size());
        for (String str3 : b2.keySet()) {
            Object obj = b2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void a(int i2, String str, Object obj, Object obj2, Object obj3) {
        a(new n(this, false, 5, str, obj, null, null));
    }

    public final void a(Activity activity, String str, String str2) {
        a(new e(this, activity, str, str2));
    }

    public final void a(Bundle bundle) {
        a(new t(this, bundle));
    }

    public final void a(String str) {
        a(new c(this, str));
    }

    public final void a(String str, Bundle bundle) {
        a(null, str, bundle, false, true, null);
    }

    public final void a(String str, String str2) {
        a((String) null, str, (Object) str2, false);
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, null);
    }

    public final void a(String str, String str2, Object obj) {
        a(str, str2, obj, true);
    }

    public final void a(boolean z) {
        a(new p(this, z));
    }

    public final String b() {
        m9 m9Var = new m9();
        a(new h(this, m9Var));
        return m9Var.a(50L);
    }

    public final List<Bundle> b(String str, String str2) {
        m9 m9Var = new m9();
        a(new d(this, str, str2, m9Var));
        List<Bundle> list = (List) m9.a(m9Var.b(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void b(String str) {
        a(new f(this, str));
    }

    public final void b(String str, String str2, Bundle bundle) {
        a(new nd(this, str, str2, bundle));
    }

    public final long c() {
        m9 m9Var = new m9();
        a(new k(this, m9Var));
        Long l2 = (Long) m9.a(m9Var.b(500L), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
        int i2 = this.e + 1;
        this.e = i2;
        return nextLong + i2;
    }

    public final void c(String str) {
        a(new g(this, str));
    }

    public final int d(String str) {
        m9 m9Var = new m9();
        a(new o(this, str, m9Var));
        Integer num = (Integer) m9.a(m9Var.b(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String d() {
        m9 m9Var = new m9();
        a(new j(this, m9Var));
        return m9Var.a(500L);
    }

    public final String e() {
        m9 m9Var = new m9();
        a(new m(this, m9Var));
        return m9Var.a(500L);
    }
}
