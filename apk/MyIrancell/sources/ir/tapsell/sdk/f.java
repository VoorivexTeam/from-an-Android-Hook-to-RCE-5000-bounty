package ir.tapsell.sdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.g50;
import defpackage.i50;
import defpackage.k50;
import defpackage.s40;
import defpackage.u40;
import defpackage.v40;
import defpackage.z40;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import java.lang.Thread;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {
    public static String a = null;
    public static boolean b = false;
    private static final Map<String, TapsellAd> c = Collections.synchronizedMap(new HashMap());
    private static final Handler d = new Handler(Looper.getMainLooper());
    private static boolean e = false;
    public static HashMap<String, Boolean> f = new HashMap<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ir.tapsell.sdk.e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Context a;
        final /* synthetic */ Thread.UncaughtExceptionHandler b;

        b(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = context;
            this.b = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (ir.tapsell.sdk.utils.g.a(Log.getStackTraceString(th))) {
                try {
                    k50.a(this.a, th);
                } catch (Throwable th2) {
                    g50.a(th2);
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                this.b.uncaughtException(thread, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        final /* synthetic */ Context b;
        final /* synthetic */ TapsellConfiguration c;
        final /* synthetic */ String d;

        c(Context context, TapsellConfiguration tapsellConfiguration, String str) {
            this.b = context;
            this.c = tapsellConfiguration;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b == null) {
                i50.a("Null context");
                return;
            }
            TapsellConfiguration tapsellConfiguration = this.c;
            if (tapsellConfiguration != null) {
                i50.a(tapsellConfiguration.getDebugMode());
                ir.tapsell.sdk.g.j().a(this.c.getDebugMode());
                if (this.c.getMaxAllowedBandwidthUsage() > 0) {
                    ir.tapsell.sdk.e.a(this.c.getMaxAllowedBandwidthUsage());
                } else if (this.c.getMaxAllowedBandwidthUsagePercentage() > 0) {
                    ir.tapsell.sdk.e.a(this.c.getMaxAllowedBandwidthUsagePercentage());
                }
            }
            ir.tapsell.sdk.g.j().a(this.d);
            u40.a(this.b.getApplicationContext());
            ir.tapsell.sdk.e.a(this.b.getApplicationContext());
            i50.d("Tapsell SDK v. 4.3.5-MTN initialized successfully.");
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        final /* synthetic */ Context b;
        final /* synthetic */ TapsellAdRequestListener c;
        final /* synthetic */ String d;
        final /* synthetic */ TapsellAdRequestOptions e;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                f.b(dVar.b, dVar.d, dVar.e);
            }
        }

        d(Context context, TapsellAdRequestListener tapsellAdRequestListener, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
            this.b = context;
            this.c = tapsellAdRequestListener;
            this.d = str;
            this.e = tapsellAdRequestOptions;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b == null) {
                i50.a("Null context");
                TapsellAdRequestListener tapsellAdRequestListener = this.c;
                if (tapsellAdRequestListener != null) {
                    tapsellAdRequestListener.onError("Null context");
                    return;
                }
                return;
            }
            if (ir.tapsell.sdk.g.j().a() != null) {
                if (this.c != null) {
                    v40.a().a(this.d, this.c);
                }
                f.d.post(new a());
            } else {
                i50.a("Tapsell must be initialized before requesting ad");
                TapsellAdRequestListener tapsellAdRequestListener2 = this.c;
                if (tapsellAdRequestListener2 != null) {
                    tapsellAdRequestListener2.onError("Tapsell must be initialized before requesting ad");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        final /* synthetic */ String b;
        final /* synthetic */ TapsellAdRequestOptions c;
        final /* synthetic */ Context d;

        e(String str, TapsellAdRequestOptions tapsellAdRequestOptions, Context context) {
            this.b = str;
            this.c = tapsellAdRequestOptions;
            this.d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.b;
            TapsellAdRequestOptions tapsellAdRequestOptions = this.c;
            if ("".equals(str)) {
                i50.a("Empty zoneId was replaced with null.");
                str = null;
            }
            if (tapsellAdRequestOptions == null) {
                tapsellAdRequestOptions = new TapsellAdRequestOptions();
            }
            TapsellAd b = ir.tapsell.sdk.e.b(this.d.getApplicationContext(), str, null);
            if (b != null) {
                i50.a("Ad is found and valid! returning to listener");
                v40.a().a(str, b);
            } else {
                i50.a("Ad is not found :-( fetching new ad ...");
                ir.tapsell.sdk.e.a(this.d.getApplicationContext(), str, tapsellAdRequestOptions);
            }
        }
    }

    /* renamed from: ir.tapsell.sdk.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0066f implements Runnable {
        final /* synthetic */ int b;

        RunnableC0066f(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ir.tapsell.sdk.e.a(this.b);
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {
        final /* synthetic */ int b;

        g(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ir.tapsell.sdk.e.a(this.b);
        }
    }

    public static String a() {
        return "4.3.5-MTN";
    }

    public static void a(int i) {
        ir.tapsell.sdk.utils.e.a(new RunnableC0066f(i));
    }

    public static void a(Application application, TapsellConfiguration tapsellConfiguration, String str, String str2) {
        e();
        a(application.getApplicationContext(), tapsellConfiguration, str, str2);
    }

    public static void a(Context context, TapsellConfiguration tapsellConfiguration, String str, String str2) {
        a = str2;
        if (e) {
            return;
        }
        context.getApplicationContext();
        ir.tapsell.sdk.g.j().a(context.getApplicationContext());
        z40.a(context.getApplicationContext(), str, SdkPlatformEnum.TAPSELL);
        z40.K().i();
        e = true;
        b(context);
        Metrix.initialize((Application) context.getApplicationContext(), "mstkgmzsaxiqfqb");
        ir.tapsell.sdk.utils.e.a(new c(context, tapsellConfiguration, str));
        e();
    }

    public static void a(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions, TapsellAdRequestListener tapsellAdRequestListener) {
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", str);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.K().n().getUserId());
        Metrix.getInstance().newEvent("mxzqz", hashMap, null);
        ir.tapsell.sdk.utils.e.a(new d(context, tapsellAdRequestListener, str, tapsellAdRequestOptions));
    }

    public static void a(Context context, boolean z) {
        i50.a(z);
        ir.tapsell.sdk.g.j().a(z);
    }

    public static void a(TapsellAd tapsellAd) {
        if (tapsellAd == null || tapsellAd.getId() == null) {
            return;
        }
        c.put(tapsellAd.getId(), tapsellAd);
    }

    public static void a(String str) {
        ir.tapsell.sdk.g.j().e(str);
    }

    public static void a(boolean z) {
        b = z;
    }

    public static boolean a(Context context) {
        return ir.tapsell.sdk.g.j().b();
    }

    public static void b() {
        ir.tapsell.sdk.utils.e.a(new a());
    }

    public static void b(int i) {
        ir.tapsell.sdk.utils.e.a(new g(i));
    }

    private static void b(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new b(context, Thread.getDefaultUncaughtExceptionHandler()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        ir.tapsell.sdk.utils.e.a(new e(str, tapsellAdRequestOptions, context));
    }

    public static void b(TapsellAd tapsellAd) {
        if (tapsellAd == null || tapsellAd.getId() == null) {
            return;
        }
        c.remove(tapsellAd.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(boolean z) {
        ir.tapsell.sdk.g.j().c(z);
        z40.K().g();
    }

    private static boolean d() {
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

    private static void e() {
        if (d()) {
            return;
        }
        s40.a();
    }
}
