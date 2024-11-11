package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.common.api.internal.C0903h;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1102h;
import com.google.android.gms.common.util.InterfaceC1099e;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.InterfaceC1823n6;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C2440ep;
import p000.C3316ur;

/* renamed from: com.google.android.gms.internal.measurement.ld */
/* loaded from: classes.dex */
public class C1370ld {

    /* renamed from: h */
    private static volatile C1370ld f6722h = null;

    /* renamed from: i */
    private static Boolean f6723i = null;

    /* renamed from: j */
    private static Boolean f6724j = null;

    /* renamed from: k */
    private static boolean f6725k = false;

    /* renamed from: l */
    private static Boolean f6726l = null;

    /* renamed from: m */
    private static String f6727m = "use_dynamite_api";

    /* renamed from: n */
    private static String f6728n = "allow_remote_dynamite";

    /* renamed from: a */
    private final String f6729a;

    /* renamed from: b */
    protected final InterfaceC1099e f6730b;

    /* renamed from: c */
    private final ExecutorService f6731c;

    /* renamed from: d */
    private List<Pair<InterfaceC1823n6, Object>> f6732d;

    /* renamed from: e */
    private int f6733e;

    /* renamed from: f */
    private boolean f6734f;

    /* renamed from: g */
    private InterfaceC1413ob f6735g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.measurement.ld$a */
    /* loaded from: classes.dex */
    public abstract class a implements Runnable {

        /* renamed from: b */
        final long f6736b;

        /* renamed from: c */
        final long f6737c;

        /* renamed from: d */
        private final boolean f6738d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(C1370ld c1370ld) {
            this(true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(boolean z) {
            this.f6736b = C1370ld.this.f6730b.mo7375a();
            this.f6737c = C1370ld.this.f6730b.mo7376b();
            this.f6738d = z;
        }

        /* renamed from: a */
        abstract void mo7506a();

        /* renamed from: b */
        protected void mo7703b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1370ld.this.f6734f) {
                mo7703b();
                return;
            }
            try {
                mo7506a();
            } catch (Exception e) {
                C1370ld.this.m7980a(e, false, this.f6738d);
                mo7703b();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.ld$b */
    /* loaded from: classes.dex */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C1370ld.this.m7977a(new C1485u(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C1370ld.this.m7977a(new C1555z(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C1370ld.this.m7977a(new C1541y(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C1370ld.this.m7977a(new C1499v(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            BinderC1381m9 binderC1381m9 = new BinderC1381m9();
            C1370ld.this.m7977a(new C1192a0(this, activity, binderC1381m9));
            Bundle m8031b = binderC1381m9.m8031b(50L);
            if (m8031b != null) {
                bundle.putAll(m8031b);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C1370ld.this.m7977a(new C1513w(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C1370ld.this.m7977a(new C1527x(this, activity));
        }
    }

    private C1370ld(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f6729a = (str == null || !m7990c(str2, str3)) ? "FA" : str;
        this.f6730b = C1102h.m7385d();
        this.f6731c = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        new C3316ur(this);
        if (!(!m7994f(context) || m7996g())) {
            this.f6734f = true;
            return;
        }
        if (!m7990c(str2, str3) && (str2 == null || str3 == null)) {
            boolean z = (str2 == null) ^ (str3 == null);
        }
        m7977a(new C1206b(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new b());
    }

    /* renamed from: a */
    public static C1370ld m7973a(Context context) {
        return m7974a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    /* renamed from: a */
    public static C1370ld m7974a(Context context, String str, String str2, String str3, Bundle bundle) {
        C1057u.m7286a(context);
        if (f6722h == null) {
            synchronized (C1370ld.class) {
                if (f6722h == null) {
                    f6722h = new C1370ld(context, str, str2, str3, bundle);
                }
            }
        }
        return f6722h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7977a(a aVar) {
        this.f6731c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7980a(Exception exc, boolean z, boolean z2) {
        this.f6734f |= z;
        if (!z && z2) {
            m8002a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m7981a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m7977a(new C1457s(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: a */
    private final void m7982a(String str, String str2, Object obj, boolean z) {
        m7977a(new C1429q(this, str, str2, obj, z));
    }

    /* renamed from: a */
    private static boolean m7983a(Context context, String str) {
        C1057u.m7296b(str);
        try {
            ApplicationInfo m11475a = C2440ep.m11628a(context).m11475a(context.getPackageName(), 128);
            if (m11475a != null && m11475a.metaData != null) {
                return m11475a.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m7987b(Context context) {
        String str;
        boolean z;
        m7998i(context);
        synchronized (C1370ld.class) {
            if (!f6725k) {
                try {
                    try {
                        str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "measurement.dynamite.enabled", "");
                    } catch (Exception unused) {
                        f6726l = null;
                    }
                    if ("true".equals(str)) {
                        z = true;
                    } else if ("false".equals(str)) {
                        z = false;
                    } else {
                        f6726l = null;
                    }
                    f6726l = z;
                } finally {
                    f6725k = true;
                }
            }
        }
        Boolean bool = f6726l;
        if (bool == null) {
            bool = f6723i;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m7990c(String str, String str2) {
        return (str2 == null || str == null || m7996g()) ? false : true;
    }

    /* renamed from: f */
    private static boolean m7994f(Context context) {
        try {
            C0903h.m6771a(context);
        } catch (IllegalStateException unused) {
        }
        return C0903h.m6773a() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static int m7995g(Context context) {
        return DynamiteModule.m7445b(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: g */
    private static boolean m7996g() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m7997h(Context context) {
        return DynamiteModule.m7438a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static void m7998i(Context context) {
        synchronized (C1370ld.class) {
            try {
            } catch (Exception unused) {
                f6723i = false;
                f6724j = false;
            }
            if (f6723i == null || f6724j == null) {
                if (m7983a(context, "app_measurement_internal_disable_startup_flags")) {
                    f6723i = false;
                    f6724j = false;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f6723i = Boolean.valueOf(sharedPreferences.getBoolean(f6727m, false));
                f6724j = Boolean.valueOf(sharedPreferences.getBoolean(f6728n, false));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(f6727m);
                edit.remove(f6728n);
                edit.apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final InterfaceC1413ob m7999a(Context context, boolean z) {
        try {
            return AbstractBinderC1397na.asInterface(DynamiteModule.m7440a(context, z ? DynamiteModule.f6385k : DynamiteModule.f6383i, ModuleDescriptor.MODULE_ID).m7450a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C1120a e) {
            m7980a((Exception) e, true, false);
            return null;
        }
    }

    /* renamed from: a */
    public final String m8000a() {
        BinderC1381m9 binderC1381m9 = new BinderC1381m9();
        m7977a(new C1311i(this, binderC1381m9));
        return binderC1381m9.m8030a(500L);
    }

    /* renamed from: a */
    public final Map<String, Object> m8001a(String str, String str2, boolean z) {
        BinderC1381m9 binderC1381m9 = new BinderC1381m9();
        m7977a(new C1356l(this, str, str2, z, binderC1381m9));
        Bundle m8031b = binderC1381m9.m8031b(5000L);
        if (m8031b == null || m8031b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(m8031b.size());
        for (String str3 : m8031b.keySet()) {
            Object obj = m8031b.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void m8002a(int i, String str, Object obj, Object obj2, Object obj3) {
        m7977a(new C1386n(this, false, 5, str, obj, null, null));
    }

    /* renamed from: a */
    public final void m8003a(Activity activity, String str, String str2) {
        m7977a(new C1251e(this, activity, str, str2));
    }

    /* renamed from: a */
    public final void m8004a(Bundle bundle) {
        m7977a(new C1471t(this, bundle));
    }

    /* renamed from: a */
    public final void m8005a(String str) {
        m7977a(new C1221c(this, str));
    }

    /* renamed from: a */
    public final void m8006a(String str, Bundle bundle) {
        m7981a(null, str, bundle, false, true, null);
    }

    /* renamed from: a */
    public final void m8007a(String str, String str2) {
        m7982a((String) null, str, (Object) str2, false);
    }

    /* renamed from: a */
    public final void m8008a(String str, String str2, Bundle bundle) {
        m7981a(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void m8009a(String str, String str2, Object obj) {
        m7982a(str, str2, obj, true);
    }

    /* renamed from: a */
    public final void m8010a(boolean z) {
        m7977a(new C1415p(this, z));
    }

    /* renamed from: b */
    public final String m8011b() {
        BinderC1381m9 binderC1381m9 = new BinderC1381m9();
        m7977a(new C1296h(this, binderC1381m9));
        return binderC1381m9.m8030a(50L);
    }

    /* renamed from: b */
    public final List<Bundle> m8012b(String str, String str2) {
        BinderC1381m9 binderC1381m9 = new BinderC1381m9();
        m7977a(new C1236d(this, str, str2, binderC1381m9));
        List<Bundle> list = (List) BinderC1381m9.m8029a(binderC1381m9.m8031b(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: b */
    public final void m8013b(String str) {
        m7977a(new C1266f(this, str));
    }

    /* renamed from: b */
    public final void m8014b(String str, String str2, Bundle bundle) {
        m7977a(new C1400nd(this, str, str2, bundle));
    }

    /* renamed from: c */
    public final long m8015c() {
        BinderC1381m9 binderC1381m9 = new BinderC1381m9();
        m7977a(new C1341k(this, binderC1381m9));
        Long l = (Long) BinderC1381m9.m8029a(binderC1381m9.m8031b(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f6730b.mo7375a()).nextLong();
        int i = this.f6733e + 1;
        this.f6733e = i;
        return nextLong + i;
    }

    /* renamed from: c */
    public final void m8016c(String str) {
        m7977a(new C1281g(this, str));
    }

    /* renamed from: d */
    public final int m8017d(String str) {
        BinderC1381m9 binderC1381m9 = new BinderC1381m9();
        m7977a(new C1401o(this, str, binderC1381m9));
        Integer num = (Integer) BinderC1381m9.m8029a(binderC1381m9.m8031b(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public final String m8018d() {
        BinderC1381m9 binderC1381m9 = new BinderC1381m9();
        m7977a(new C1326j(this, binderC1381m9));
        return binderC1381m9.m8030a(500L);
    }

    /* renamed from: e */
    public final String m8019e() {
        BinderC1381m9 binderC1381m9 = new BinderC1381m9();
        m7977a(new C1371m(this, binderC1381m9));
        return binderC1381m9.m8030a(500L);
    }
}
