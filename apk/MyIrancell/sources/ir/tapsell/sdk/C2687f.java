package ir.tapsell.sdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import ir.tapsell.sdk.utils.C2763e;
import ir.tapsell.sdk.utils.C2765g;
import java.lang.Thread;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.g50;
import p000.i50;
import p000.k50;
import p000.s40;
import p000.u40;
import p000.v40;
import p000.z40;

/* renamed from: ir.tapsell.sdk.f */
/* loaded from: classes.dex */
public class C2687f {

    /* renamed from: a */
    public static String f11020a = null;

    /* renamed from: b */
    public static boolean f11021b = false;

    /* renamed from: c */
    private static final Map<String, TapsellAd> f11022c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private static final Handler f11023d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private static boolean f11024e = false;

    /* renamed from: f */
    public static HashMap<String, Boolean> f11025f = new HashMap<>();

    /* renamed from: ir.tapsell.sdk.f$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2686e.m12883b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.f$b */
    /* loaded from: classes.dex */
    public class b implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Context f11026a;

        /* renamed from: b */
        final /* synthetic */ Thread.UncaughtExceptionHandler f11027b;

        b(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f11026a = context;
            this.f11027b = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (C2765g.m13164a(Log.getStackTraceString(th))) {
                try {
                    k50.m13612a(this.f11026a, th);
                } catch (Throwable th2) {
                    g50.m11895a(th2);
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11027b;
            if (uncaughtExceptionHandler != null) {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                this.f11027b.uncaughtException(thread, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.f$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f11028b;

        /* renamed from: c */
        final /* synthetic */ TapsellConfiguration f11029c;

        /* renamed from: d */
        final /* synthetic */ String f11030d;

        c(Context context, TapsellConfiguration tapsellConfiguration, String str) {
            this.f11028b = context;
            this.f11029c = tapsellConfiguration;
            this.f11030d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11028b == null) {
                i50.m12368a("Null context");
                return;
            }
            TapsellConfiguration tapsellConfiguration = this.f11029c;
            if (tapsellConfiguration != null) {
                i50.m12370a(tapsellConfiguration.getDebugMode());
                C2688g.m12913j().m12918a(this.f11029c.getDebugMode());
                if (this.f11029c.getMaxAllowedBandwidthUsage() > 0) {
                    C2686e.m12877a(this.f11029c.getMaxAllowedBandwidthUsage());
                } else if (this.f11029c.getMaxAllowedBandwidthUsagePercentage() > 0) {
                    C2686e.m12876a(this.f11029c.getMaxAllowedBandwidthUsagePercentage());
                }
            }
            C2688g.m12913j().m12917a(this.f11030d);
            u40.m15721a(this.f11028b.getApplicationContext());
            C2686e.m12878a(this.f11028b.getApplicationContext());
            i50.m12376d("Tapsell SDK v. 4.3.5-MTN initialized successfully.");
        }
    }

    /* renamed from: ir.tapsell.sdk.f$d */
    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f11031b;

        /* renamed from: c */
        final /* synthetic */ TapsellAdRequestListener f11032c;

        /* renamed from: d */
        final /* synthetic */ String f11033d;

        /* renamed from: e */
        final /* synthetic */ TapsellAdRequestOptions f11034e;

        /* renamed from: ir.tapsell.sdk.f$d$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                C2687f.m12903b(dVar.f11031b, dVar.f11033d, dVar.f11034e);
            }
        }

        d(Context context, TapsellAdRequestListener tapsellAdRequestListener, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
            this.f11031b = context;
            this.f11032c = tapsellAdRequestListener;
            this.f11033d = str;
            this.f11034e = tapsellAdRequestOptions;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11031b == null) {
                i50.m12368a("Null context");
                TapsellAdRequestListener tapsellAdRequestListener = this.f11032c;
                if (tapsellAdRequestListener != null) {
                    tapsellAdRequestListener.onError("Null context");
                    return;
                }
                return;
            }
            if (C2688g.m12913j().m12915a() != null) {
                if (this.f11032c != null) {
                    v40.m15925a().m15932a(this.f11033d, this.f11032c);
                }
                C2687f.f11023d.post(new a());
            } else {
                i50.m12368a("Tapsell must be initialized before requesting ad");
                TapsellAdRequestListener tapsellAdRequestListener2 = this.f11032c;
                if (tapsellAdRequestListener2 != null) {
                    tapsellAdRequestListener2.onError("Tapsell must be initialized before requesting ad");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.tapsell.sdk.f$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f11036b;

        /* renamed from: c */
        final /* synthetic */ TapsellAdRequestOptions f11037c;

        /* renamed from: d */
        final /* synthetic */ Context f11038d;

        e(String str, TapsellAdRequestOptions tapsellAdRequestOptions, Context context) {
            this.f11036b = str;
            this.f11037c = tapsellAdRequestOptions;
            this.f11038d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f11036b;
            TapsellAdRequestOptions tapsellAdRequestOptions = this.f11037c;
            if ("".equals(str)) {
                i50.m12368a("Empty zoneId was replaced with null.");
                str = null;
            }
            if (tapsellAdRequestOptions == null) {
                tapsellAdRequestOptions = new TapsellAdRequestOptions();
            }
            TapsellAd m12882b = C2686e.m12882b(this.f11038d.getApplicationContext(), str, null);
            if (m12882b != null) {
                i50.m12368a("Ad is found and valid! returning to listener");
                v40.m15925a().m15931a(str, m12882b);
            } else {
                i50.m12368a("Ad is not found :-( fetching new ad ...");
                C2686e.m12879a(this.f11038d.getApplicationContext(), str, tapsellAdRequestOptions);
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.f$f */
    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f11039b;

        f(int i) {
            this.f11039b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2686e.m12877a(this.f11039b);
        }
    }

    /* renamed from: ir.tapsell.sdk.f$g */
    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f11040b;

        g(int i) {
            this.f11040b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2686e.m12876a(this.f11040b);
        }
    }

    /* renamed from: a */
    public static String m12889a() {
        return "4.3.5-MTN";
    }

    /* renamed from: a */
    public static void m12890a(int i) {
        C2763e.m13143a(new f(i));
    }

    /* renamed from: a */
    public static void m12891a(Application application, TapsellConfiguration tapsellConfiguration, String str, String str2) {
        m12908e();
        m12892a(application.getApplicationContext(), tapsellConfiguration, str, str2);
    }

    /* renamed from: a */
    public static void m12892a(Context context, TapsellConfiguration tapsellConfiguration, String str, String str2) {
        f11020a = str2;
        if (f11024e) {
            return;
        }
        context.getApplicationContext();
        C2688g.m12913j().m12916a(context.getApplicationContext());
        z40.m16735a(context.getApplicationContext(), str, SdkPlatformEnum.TAPSELL);
        z40.m16734K().m16752i();
        f11024e = true;
        m12902b(context);
        Metrix.initialize((Application) context.getApplicationContext(), "mstkgmzsaxiqfqb");
        C2763e.m13143a(new c(context, tapsellConfiguration, str));
        m12908e();
    }

    /* renamed from: a */
    public static void m12894a(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions, TapsellAdRequestListener tapsellAdRequestListener) {
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", str);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("mxzqz", hashMap, null);
        C2763e.m13143a(new d(context, tapsellAdRequestListener, str, tapsellAdRequestOptions));
    }

    /* renamed from: a */
    public static void m12895a(Context context, boolean z) {
        i50.m12370a(z);
        C2688g.m12913j().m12918a(z);
    }

    /* renamed from: a */
    public static void m12896a(TapsellAd tapsellAd) {
        if (tapsellAd == null || tapsellAd.getId() == null) {
            return;
        }
        f11022c.put(tapsellAd.getId(), tapsellAd);
    }

    /* renamed from: a */
    public static void m12897a(String str) {
        C2688g.m12913j().m12928e(str);
    }

    /* renamed from: a */
    public static void m12898a(boolean z) {
        f11021b = z;
    }

    /* renamed from: a */
    public static boolean m12899a(Context context) {
        return C2688g.m12913j().m12921b();
    }

    /* renamed from: b */
    public static void m12900b() {
        C2763e.m13143a(new a());
    }

    /* renamed from: b */
    public static void m12901b(int i) {
        C2763e.m13143a(new g(i));
    }

    /* renamed from: b */
    private static void m12902b(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new b(context, Thread.getDefaultUncaughtExceptionHandler()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m12903b(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        C2763e.m13143a(new e(str, tapsellAdRequestOptions, context));
    }

    /* renamed from: b */
    public static void m12904b(TapsellAd tapsellAd) {
        if (tapsellAd == null || tapsellAd.getId() == null) {
            return;
        }
        f11022c.remove(tapsellAd.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m12905b(boolean z) {
        C2688g.m12913j().m12924c(z);
        z40.m16734K().m16750g();
    }

    /* renamed from: d */
    private static boolean m12907d() {
        String str;
        String str2;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String str3 = null;
        try {
            str = Class.forName("android.app.Application").toString();
        } catch (ClassNotFoundException unused) {
            str = null;
        }
        try {
            str2 = Class.forName("y3").toString();
        } catch (ClassNotFoundException unused2) {
            str2 = null;
        }
        try {
            str3 = Class.forName("y3").toString();
        } catch (ClassNotFoundException unused3) {
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            try {
                String cls = Class.forName(stackTraceElement.getClassName()).getSuperclass().toString();
                if (cls != null) {
                    if (cls.equals(str) || cls.equals(str2)) {
                        return true;
                    }
                    if (cls.equals(str3) && stackTraceElement.getMethodName().equals("onCreate")) {
                        return true;
                    }
                }
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: e */
    private static void m12908e() {
        if (m12907d()) {
            return;
        }
        s40.m15354a();
    }
}
