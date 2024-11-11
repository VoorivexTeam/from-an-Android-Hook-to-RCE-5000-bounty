package ir.metrix.sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.gson.reflect.TypeToken;
import defpackage.pa0;
import ir.metrix.sdk.b;
import ir.metrix.sdk.network.model.AttributionModel;
import ir.metrix.sdk.network.model.ErrorModel;
import ir.metrix.sdk.network.model.ResponseModel;
import java.io.InputStream;
import java.lang.Thread;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class z {
    private x H;
    private InstallReferrerClient K;
    private OnAttributionChangedListener M;
    private OnDeeplinkResponseListener N;
    private long P;
    private long Q;
    private long R;
    private long S;
    private Context q;
    private Application r;
    private j s;
    private aj a = new aj("logThread");
    private boolean b = false;
    private String c = null;
    private int d = 30;
    private int e = 100;
    private int f = 1000;
    private long g = 30000;
    private boolean h = false;
    private int i = 100;
    private long j = 1800000;
    private boolean k = false;
    private boolean l = false;
    private boolean m = true;
    private String n = null;
    private Boolean o = null;
    private Long p = null;
    private String t = null;
    private int u = -1;
    private ad v = null;
    private long w = -1;
    private long x = -1;
    private int y = -1;
    private String z = null;
    private long A = 0;
    private String B = null;
    private ConcurrentMap<String, String> C = null;
    private ConcurrentMap<String, Double> D = null;
    private CopyOnWriteArrayList<String> E = new CopyOnWriteArrayList<>();
    private long F = -1;
    private boolean G = false;
    private AtomicBoolean I = new AtomicBoolean(false);
    private AtomicBoolean J = new AtomicBoolean(false);
    private AtomicBoolean L = new AtomicBoolean(false);
    private long O = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.metrix.sdk.z$16, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass16 extends ir.metrix.sdk.network.d<ResponseModel, ErrorModel> {
        final /* synthetic */ long a;

        AnonymousClass16(long j) {
            this.a = j;
        }

        @Override // ir.metrix.sdk.network.d
        public void a(pa0<ResponseModel> pa0Var, ErrorModel errorModel) {
            z.this.a(new Runnable() { // from class: ir.metrix.sdk.z.16.2
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass16 anonymousClass16 = AnonymousClass16.this;
                    if (anonymousClass16.a >= 0) {
                        z.this.s.b(AnonymousClass16.this.a);
                    }
                    long b = z.this.s.b();
                    long j = z.this.d;
                    z zVar = z.this;
                    if (b > j) {
                        zVar.a.a(new Runnable() { // from class: ir.metrix.sdk.z.16.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                z zVar2 = z.this;
                                zVar2.e(zVar2.h);
                            }
                        });
                        return;
                    }
                    zVar.h = false;
                    z zVar2 = z.this;
                    zVar2.i = zVar2.e;
                    long j2 = z.this.w;
                    AnonymousClass16 anonymousClass162 = AnonymousClass16.this;
                    if (j2 != anonymousClass162.a) {
                        z zVar3 = z.this;
                        zVar3.k(zVar3.g);
                    }
                }
            });
            z.this.J.set(false);
        }

        @Override // ir.metrix.sdk.network.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(pa0<ResponseModel> pa0Var, final ResponseModel responseModel) {
            z.this.a(new Runnable() { // from class: ir.metrix.sdk.z.16.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (responseModel.userId != null) {
                            z.this.B = responseModel.userId;
                            z.this.s.c("metrix_user_id", z.this.B);
                            z.this.o();
                        }
                    } catch (Throwable unused) {
                    }
                    AnonymousClass16 anonymousClass16 = AnonymousClass16.this;
                    if (anonymousClass16.a >= 0) {
                        z.this.s.b(AnonymousClass16.this.a);
                    }
                    long b = z.this.s.b();
                    long j = z.this.d;
                    z zVar = z.this;
                    if (b > j) {
                        zVar.a.a(new Runnable() { // from class: ir.metrix.sdk.z.16.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                z zVar2 = z.this;
                                zVar2.e(zVar2.h);
                            }
                        });
                        return;
                    }
                    zVar.h = false;
                    z zVar2 = z.this;
                    zVar2.i = zVar2.e;
                    long j2 = z.this.w;
                    AnonymousClass16 anonymousClass162 = AnonymousClass16.this;
                    if (j2 != anonymousClass162.a) {
                        z zVar3 = z.this;
                        zVar3.k(zVar3.g);
                    }
                }
            });
            z.this.J.set(false);
        }

        @Override // ir.metrix.sdk.network.a
        public void a(pa0<ResponseModel> pa0Var, Throwable th) {
            z.this.J.set(false);
        }
    }

    /* renamed from: ir.metrix.sdk.z$24, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass24 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AttributionStatus.values().length];
            a = iArr;
            try {
                iArr[AttributionStatus.ATTRIBUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AttributionStatus.ATTRIBUTION_NOT_NEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z() {
        this.a.start();
    }

    private <T extends l> long a(T t) {
        String json = GsonHelper.a().toJson(t);
        if (ai.a(json)) {
            ab.b("Core", "Detected empty event string, skipping");
            return -1L;
        }
        long a = this.s.a(json);
        this.w = a;
        j(a);
        int min = Math.min(Math.max(1, this.f / 10), 20);
        if (this.s.a() > this.f) {
            j jVar = this.s;
            jVar.b(jVar.a(min));
        }
        long b = this.s.b();
        if ((t instanceof ae) && t.b() != null && t.b().a()) {
            this.a.a(new Runnable() { // from class: ir.metrix.sdk.z.13
                @Override // java.lang.Runnable
                public void run() {
                    z.this.n();
                }
            }, 10000L);
        } else if (b >= this.d) {
            n();
        } else {
            k(this.g);
        }
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends l> long a(T t, long j, boolean z) {
        if (Thread.currentThread() != this.a) {
            ab.b("Core", "Events must be logged in logThread.`");
            return -1L;
        }
        if (!(t.a().equals("session_start") || t.a().equals("session_stop")) && !z) {
            if (this.l) {
                e(j);
            } else {
                f(j);
            }
        }
        ab.c(false, "Core", "Logged event to Metrix: " + t.a());
        t.a(this.v);
        t.a(this.C);
        t.b(this.D);
        return a((z) t);
    }

    private Pair<Long, JSONArray> a(List<JSONObject> list, long j) {
        JSONArray jSONArray = new JSONArray();
        long j2 = -1;
        while (true) {
            if (jSONArray.length() >= j) {
                break;
            }
            if (list.isEmpty()) {
                ab.a("Core", String.format(Locale.getDefault(), "mergeEvents: number of events less than expected by " + (j - jSONArray.length()), new Object[0]));
                break;
            }
            JSONObject remove = list.remove(0);
            long j3 = remove.getLong("event_id");
            jSONArray.put(remove);
            j2 = j3;
        }
        return new Pair<>(Long.valueOf(j2), jSONArray);
    }

    private synchronized z a(Application application, Context context, String str) {
        a(application);
        if (context == null) {
            ab.b("Core", "Argument context cannot be null in initialize()");
            return this;
        }
        this.r = application;
        this.q = context.getApplicationContext();
        j a = j.a(application, "_default_instance");
        this.s = a;
        this.c = str;
        boolean booleanValue = a.a("first_app_open", (Boolean) true).booleanValue();
        if (booleanValue) {
            a(false, booleanValue);
        }
        a(new Runnable() { // from class: ir.metrix.sdk.z.21
            @Override // java.lang.Runnable
            public void run() {
                if (z.this.b) {
                    return;
                }
                z.this.g();
            }
        });
        return this;
    }

    private String a(Context context) {
        if (this.c == null) {
            this.c = this.s.b("api_key", (String) null);
        }
        return this.c;
    }

    private String a(JSONObject jSONObject) {
        if (this.O == 0) {
            return null;
        }
        if (this.P < 0 || this.Q < 0 || this.R < 0 || this.S < 0) {
            throw new RuntimeException("app secret is not valid.");
        }
        String b = b(jSONObject);
        if (b == null || b.isEmpty()) {
            return null;
        }
        return ai.a("Signature secret_id=\"%1$d\", signature=\"%2$s\", algorithm=\"%3$s\", headers=\"timestamp app_secret userInfo.deviceInfo\"", Long.valueOf(this.O), ai.f(b), "SHA-256");
    }

    private ConcurrentMap<String, String> a(ConcurrentMap<String, String> concurrentMap) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : concurrentMap.entrySet()) {
            if (!entry.getKey().equals("_order_id") && !entry.getKey().equals("_currency")) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    private void a(int i, long j) {
        long j2 = this.F;
        if (j2 <= 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000 > 2592000 ? 0L : j2;
        if (this.p != null) {
            long j4 = this.x;
            a(j4, this.A + (j4 - l()), j3);
            l(0L);
        }
        long j5 = this.x;
        if (j5 > 0 && i > 0) {
            l(j - j5);
        }
        boolean booleanValue = this.s.a("first_app_open", (Boolean) true).booleanValue();
        this.s.a("first_app_open", false);
        a(i, booleanValue);
        e(j);
        a("startNewSession", ai.a());
        m();
    }

    private void a(int i, boolean z) {
        if (this.u != i) {
            this.u = i;
            this.t = UUID.randomUUID().toString();
            f(i);
            i(this.t);
            a(this.q, this.t, this.u, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, long j2, long j3) {
        if (h("sendSessionStopEvent") && k()) {
            if (this.E == null) {
                ab.b("Core", "screenFlows is null, make sure MetrixCore has initialized before");
                return;
            }
            List<String> q = q();
            ab.c(false, "SessionCycle", "session_stop happened: duration: " + j2 + ", session_interval: " + j3 + ", screenFlows: " + q.toString());
            a((Long) null);
            a((z) new af(this.q, j, j2, q, j3), ai.a(), false);
            p();
        }
    }

    private static void a(final Application application) {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ir.metrix.sdk.z.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                if (z.a(Log.getStackTraceString(th))) {
                    z.a(th, application);
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
    }

    private void a(Context context, String str, int i, boolean z) {
        if (i != 0) {
            z = false;
        }
        this.v = new ad(context, str, Integer.valueOf(i), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar) {
        this.s.c("android_advertising_id", cVar.a());
        this.s.a("limit_ad_tracking_enabled", cVar.b().booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AttributionModel attributionModel) {
        this.s.c("acquisition_ad", attributionModel.getAcquisitionAd());
        this.s.c("acquisition_campaign", attributionModel.getAcquisitionCampaign());
        this.s.c("acquisition_source", attributionModel.getAcquisitionSource());
        this.s.c("acquisition_ad_set", attributionModel.getAcquisitionAdSet());
        this.s.c("tracker_token", attributionModel.getTrackerToken());
        if (attributionModel.getTrackerToken() != null) {
            b(attributionModel.getTrackerToken());
        }
    }

    private void a(Long l) {
        this.p = l;
        this.s.a("last_session_start_time", l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        aj ajVar = this.a;
        if (currentThread != ajVar) {
            ajVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    private void a(String str, long j) {
        h(0L);
        b(str + ".refreshSessionDuration ", j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j, long j2) {
        this.s.c("referrer_time", str);
        this.s.a("referral_time", Long.valueOf(TimeUnit.SECONDS.toMillis(j)));
        this.s.a("install_begin_time", Long.valueOf(TimeUnit.SECONDS.toMillis(j2)));
    }

    private void a(String str, long j, JSONObject jSONObject) {
        String d = ai.d("{\"events\":" + str + "}");
        StringBuilder sb = new StringBuilder();
        sb.append("Events: ");
        sb.append(d);
        ab.c(true, "Core", sb.toString());
        ((ir.metrix.sdk.network.b) ir.metrix.sdk.network.e.a(ir.metrix.sdk.network.b.class)).a(a(this.q), a(jSONObject), d).a(new AnonymousClass16(j));
    }

    private void a(final String str, Double d, MetrixCurrency metrixCurrency, String str2, String str3) {
        if (h(str3)) {
            if (ai.a(str)) {
                ab.b("Core", "slug cannot be null or empty in newRevenue method");
                return;
            }
            if (d == null) {
                ab.b("Core", "revenue cannot be null or empty in newRevenue method");
                return;
            }
            if (metrixCurrency == null) {
                metrixCurrency = MetrixCurrency.IRR;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("_currency", metrixCurrency.name());
            if (str2 != null) {
                hashMap.put("_order_id", str2);
            }
            final HashMap hashMap2 = new HashMap();
            hashMap2.put("_revenue", d);
            a(new Runnable() { // from class: ir.metrix.sdk.z.22
                @Override // java.lang.Runnable
                public void run() {
                    z zVar = z.this;
                    zVar.a((z) new i(zVar.q, ai.a(), hashMap, hashMap2, str), ai.a(), false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Throwable th, Application application) {
        try {
            ((ir.metrix.sdk.network.b) ir.metrix.sdk.network.e.a(ir.metrix.sdk.network.b.class)).a(ir.metrix.sdk.network.c.a(application, th)).a(new ir.metrix.sdk.network.d<Void, Void>() { // from class: ir.metrix.sdk.z.12
                @Override // ir.metrix.sdk.network.a
                public void a(pa0<Void> pa0Var, Throwable th2) {
                }

                @Override // ir.metrix.sdk.network.d
                /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void b(pa0<Void> pa0Var, Void r2) {
                }

                @Override // ir.metrix.sdk.network.d
                /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void a(pa0<Void> pa0Var, Void r2) {
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z, final boolean z2) {
        if (f()) {
            this.K = InstallReferrerClient.newBuilder(this.r).build();
            try {
                this.K.startConnection(new InstallReferrerStateListener() { // from class: ir.metrix.sdk.z.25
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerServiceDisconnected() {
                        if (z) {
                            return;
                        }
                        z.this.d(z2);
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerSetupFinished(int i) {
                        if (i == 0) {
                            try {
                                ReferrerDetails installReferrer = z.this.K.getInstallReferrer();
                                z.this.a(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds());
                                aa.a(z.this.q, z.this.N).a(installReferrer.getInstallReferrer(), z2);
                            } catch (Throwable unused) {
                                if (z) {
                                    return;
                                }
                                z.this.d(z2);
                                return;
                            }
                        }
                        z.this.K.endConnection();
                    }
                });
            } catch (Throwable unused) {
                if (z) {
                    return;
                }
                d(z2);
            }
        }
    }

    private boolean a(AttributionStatus attributionStatus) {
        return attributionStatus.name().equals(this.s.b("attribution_status", (String) null)) || this.s.a("acquisition_request_count", 0) >= 3 || System.currentTimeMillis() - this.s.a("acquisition_last_request_time", 0L) < 86400000 || this.B == null || this.L.getAndSet(true);
    }

    public static boolean a(String str) {
        return str.contains("ir.metrix");
    }

    private boolean a(Map<String, String> map) {
        String str;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals("tracker_token")) {
                str = "cannot add attribute with key \"tracker_token\"";
            } else if (entry.getKey().equals("_order_id")) {
                str = "cannot add attribute with key \"_order_id\"";
            } else if (entry.getKey().equals("_store")) {
                str = "cannot add attribute with key \"_store\"";
            } else if (entry.getKey().equals("_currency")) {
                str = "cannot add attribute with key \"_currency\"";
            }
            ab.b("Core", str);
            return false;
        }
        return true;
    }

    private z b(Application application) {
        if (!h("enableForegroundTracking") || this.k) {
            return this;
        }
        application.registerActivityLifecycleCallbacks(new y(this));
        return this;
    }

    private String b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("userInfo").getJSONObject("deviceInfo");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next));
            }
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList, new Comparator<String>() { // from class: ir.metrix.sdk.z.17
                @Override // java.util.Comparator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(String str, String str2) {
                    return str.compareTo(str2);
                }
            });
            int size = arrayList.size();
            long j = jSONObject.getLong("timestamp");
            int[] iArr = {ai.a(j, size), ai.a(this.P, size), ai.a(this.Q, size), ai.a(this.R, size), ai.a(this.S, size)};
            String str = "";
            for (int i = 0; i < 5; i++) {
                str = str + hashMap.get(arrayList.get(iArr[i]));
            }
            return "" + j + this.P + this.Q + this.R + this.S + str;
        } catch (JSONException e) {
            ab.b("Core", e);
            return null;
        }
    }

    private ConcurrentMap<String, Double> b(ConcurrentMap<String, Object> concurrentMap) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry : concurrentMap.entrySet()) {
            if ((entry.getValue() instanceof Double) || entry.getValue().getClass().equals(Double.TYPE)) {
                if (!entry.getKey().equals("_revenue")) {
                    concurrentHashMap.put(entry.getKey(), (Double) entry.getValue());
                }
            }
        }
        return concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AttributionModel attributionModel) {
        this.s.a("acquisition_last_request_time", Long.valueOf(System.currentTimeMillis()));
        this.s.a("acquisition_request_count", Long.valueOf(r0.a("acquisition_request_count", 0) + 1));
        this.s.c("attribution_status", attributionModel.getAttributionStatus().name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, long j) {
        ab.a(false, "Core", "setSessionPortionStartTime: " + j + ", source: " + str);
        this.s.a("session_portion_start_time", Long.valueOf(j));
    }

    private boolean b(Map<String, Double> map) {
        Iterator<Map.Entry<String, Double>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equals("_revenue")) {
                ab.b("Core", "cannot add metric with key \"_revenue\"");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z) {
        this.a.a(new Runnable() { // from class: ir.metrix.sdk.z.26
            @Override // java.lang.Runnable
            public void run() {
                z.this.a(true, z);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        if (k()) {
            i(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f A[Catch: h -> 0x016c, JSONException -> 0x0186, LOOP:0: B:17:0x004d->B:30:0x012f, LOOP_END, TryCatch #4 {h -> 0x016c, JSONException -> 0x0186, blocks: (B:12:0x0037, B:14:0x0046, B:17:0x004d, B:28:0x0111, B:33:0x013a, B:35:0x0148, B:37:0x014f, B:30:0x012f, B:42:0x010a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(boolean r21) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.metrix.sdk.z.e(boolean):void");
    }

    private void f(int i) {
        this.y = i;
        this.s.a("previous_session_num", Long.valueOf(i));
    }

    private static boolean f() {
        try {
            return Class.forName("com.android.installreferrer.api.InstallReferrerClient").toString() != null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(long j) {
        if (!k()) {
            int i = this.y;
            a(i != -1 ? i + 1 : 0, j);
            return true;
        }
        if (g(j)) {
            e(j);
            return false;
        }
        a(this.u + 1, j);
        return true;
    }

    private z g(Activity activity) {
        if (!h("enableForegroundTracking") || this.k) {
            return this;
        }
        activity.getApplication().registerActivityLifecycleCallbacks(new y(this, activity));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = (CopyOnWriteArrayList) GsonHelper.a().fromJson(this.s.b("screen_flows", (String) null), new TypeToken<CopyOnWriteArrayList<String>>() { // from class: ir.metrix.sdk.z.27
        }.getType());
        if (copyOnWriteArrayList != null) {
            CopyOnWriteArrayList<String> copyOnWriteArrayList2 = this.E;
            this.E = copyOnWriteArrayList;
            copyOnWriteArrayList.addAll(copyOnWriteArrayList2);
        }
        w.a().a(this.s.b("engine_version", ""));
        i();
        h();
        this.F = this.s.a("interval", 0L);
        this.s.c("api_key", this.c);
        this.y = this.s.a("previous_session_num", -1);
        String b = this.s.b("previous_session_identifier", (String) null);
        this.z = b;
        if (this.y >= 0) {
            this.u = this.y;
            this.t = b;
            boolean booleanValue = this.s.a("first_app_open", (Boolean) true).booleanValue();
            this.s.a("first_app_open", false);
            a(this.q, this.t, this.u, booleanValue);
        }
        String b2 = this.s.b("user_attributes", (String) null);
        boolean booleanValue2 = this.s.a("user_attributes_migrate", (Boolean) false).booleanValue();
        try {
            if (b2 == null) {
                this.C = null;
            } else {
                Type type = new TypeToken<ConcurrentMap<String, String>>() { // from class: ir.metrix.sdk.z.28
                }.getType();
                if (booleanValue2) {
                    this.C = (ConcurrentMap) GsonHelper.a().fromJson(b2, type);
                } else {
                    ConcurrentMap<String, String> a = a((ConcurrentMap<String, String>) GsonHelper.a().fromJson(b2, type));
                    this.C = a;
                    a((Map<String, String>) a, true);
                    this.s.a("user_attributes_migrate", true);
                }
            }
        } catch (Throwable unused) {
            this.C = null;
        }
        boolean booleanValue3 = this.s.a("user_metrics_migrate", (Boolean) false).booleanValue();
        String b3 = this.s.b("user_metrics", (String) null);
        try {
            if (b3 == null) {
                this.D = null;
            } else {
                Type type2 = new TypeToken<ConcurrentMap<String, Object>>() { // from class: ir.metrix.sdk.z.29
                }.getType();
                if (booleanValue3) {
                    this.D = (ConcurrentMap) GsonHelper.a().fromJson(b3, new TypeToken<ConcurrentMap<String, Double>>() { // from class: ir.metrix.sdk.z.30
                    }.getType());
                } else {
                    ConcurrentMap<String, Double> b4 = b((ConcurrentMap<String, Object>) GsonHelper.a().fromJson(b3, type2));
                    this.D = b4;
                    b((Map<String, Double>) b4, true);
                    this.s.a("user_metrics_migrate", true);
                }
            }
        } catch (Throwable unused2) {
            this.D = null;
        }
        this.A = this.s.a("session_duration", 0L);
        this.w = this.s.a("last_event_id", -1L);
        this.x = this.s.a("last_event_time", -1L);
        Long valueOf = Long.valueOf(this.s.a("last_session_start_time", -1L));
        this.p = valueOf;
        if (valueOf.longValue() == -1) {
            this.p = null;
        }
        this.B = this.s.b("metrix_user_id", (String) null);
        o();
        j();
        this.b = true;
    }

    private boolean g(long j) {
        long j2 = this.j;
        Long l = this.p;
        return l != null && j - l.longValue() < j2;
    }

    private void h() {
        b.a(this.q, new b.a() { // from class: ir.metrix.sdk.z.2
            @Override // ir.metrix.sdk.b.a
            public void a() {
            }

            @Override // ir.metrix.sdk.b.a
            public void a(c cVar) {
                if (cVar != null) {
                    z.this.a(cVar);
                    z.this.n = cVar.a();
                    z.this.o = cVar.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(long j) {
        if (k()) {
            this.A = j;
            this.s.a("session_duration", Long.valueOf(j));
        }
    }

    private synchronized boolean h(String str) {
        boolean z;
        if (this.q == null) {
            ab.b("Core", "context cannot be null, set context with initialize() before calling " + str);
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    private void i() {
        this.n = this.s.b("android_advertising_id", (String) null);
        this.o = this.s.a("limit_ad_tracking_enabled", (Boolean) null);
    }

    private void i(long j) {
        this.x = j;
        this.s.a("last_event_time", Long.valueOf(j));
    }

    private void i(String str) {
        this.z = str;
        this.s.c("previous_session_identifier", str);
    }

    private void j() {
        try {
            InputStream open = this.q.getAssets().open("metrix_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            ab.b(false, "Core", "metrix_config.properties file read and loaded");
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                b(property);
            }
        } catch (Exception e) {
            ab.a(false, "Core", String.format("%s file not found in this app", e.getMessage()));
        }
    }

    private void j(long j) {
        this.w = j;
        this.s.a("last_event_id", Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(long j) {
        if (this.I.getAndSet(true)) {
            return;
        }
        this.a.a(new Runnable() { // from class: ir.metrix.sdk.z.14
            @Override // java.lang.Runnable
            public void run() {
                z.this.I.set(false);
                z.this.n();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        return this.u >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long l() {
        return this.s.a("session_portion_start_time", ai.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(final long j) {
        this.F = j;
        a(new Runnable() { // from class: ir.metrix.sdk.z.19
            @Override // java.lang.Runnable
            public void run() {
                z.this.s.a("interval", Long.valueOf(j));
            }
        });
    }

    private void m() {
        if (h("sendSessionStartEvent") && k()) {
            ab.c(false, "SessionCycle", "session_start happened : isFirstUsage: " + this.v.a());
            a(Long.valueOf(ai.a()));
            a((z) new ae(this.q), ai.a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (ai.a(a(this.q))) {
            return;
        }
        e(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (a(AttributionStatus.ATTRIBUTED)) {
            return;
        }
        ((ir.metrix.sdk.network.b) ir.metrix.sdk.network.e.a(ir.metrix.sdk.network.b.class)).a("https://api.metrix.ir/analyze/attribution/{apiKey}/app-user-attribution-info".replace("{apiKey}", a(this.q)), this.B).a(new ir.metrix.sdk.network.d<AttributionModel, ErrorModel>() { // from class: ir.metrix.sdk.z.15
            @Override // ir.metrix.sdk.network.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void b(pa0<AttributionModel> pa0Var, final AttributionModel attributionModel) {
                z.this.a(new Runnable() { // from class: ir.metrix.sdk.z.15.1
                    @Override // java.lang.Runnable
                    public void run() {
                        z.this.b(attributionModel);
                        int i = AnonymousClass24.a[attributionModel.getAttributionStatus().ordinal()];
                        if (i == 1) {
                            z.this.a(attributionModel);
                        } else if (i == 2) {
                            z.this.s.a("acquisition_request_count", (Long) 3L);
                        }
                        if (z.this.M != null) {
                            z.this.M.onAttributionChanged(attributionModel);
                        }
                        z.this.L.set(false);
                    }
                });
            }

            @Override // ir.metrix.sdk.network.d
            public void a(pa0<AttributionModel> pa0Var, ErrorModel errorModel) {
                z.this.L.set(false);
            }

            @Override // ir.metrix.sdk.network.a
            public void a(pa0<AttributionModel> pa0Var, Throwable th) {
                z.this.L.set(false);
            }
        });
    }

    private void p() {
        this.E.clear();
        this.s.c("screen_flows", GsonHelper.a().toJson(this.E));
    }

    private List<String> q() {
        ArrayList arrayList = new ArrayList(this.E);
        while (arrayList.size() > 18) {
            arrayList.remove(10);
        }
        arrayList.add(0, "_start");
        arrayList.add("_end");
        return arrayList;
    }

    public z a() {
        a(new Runnable() { // from class: ir.metrix.sdk.z.3
            @Override // java.lang.Runnable
            public void run() {
                if (z.this.v == null) {
                    throw new IllegalStateException("Must initialize before acting on location listening.");
                }
                z.this.v.a(true);
            }
        });
        return this;
    }

    public z a(int i) {
        this.d = i;
        return this;
    }

    public z a(long j) {
        this.j = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z a(Activity activity, String str) {
        z a = a(activity.getApplication(), activity.getApplicationContext(), str);
        a.g(activity);
        this.H = x.a(this);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z a(Application application, String str) {
        z a = a(application, application.getApplicationContext(), str);
        a.b(application);
        this.H = x.a(this);
        return a;
    }

    public z a(boolean z) {
        ab.a(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j, long j2, long j3, long j4, long j5) {
        this.O = j;
        this.P = j2;
        this.Q = j3;
        this.R = j4;
        this.S = j5;
    }

    public void a(Activity activity) {
        if (this.E == null) {
            ab.b("Core", "You must initialize MetrixCore first");
            return;
        }
        e(activity.getClass().getSimpleName());
        if (f(System.currentTimeMillis())) {
            return;
        }
        b("activityDisplayed", System.currentTimeMillis());
    }

    public void a(Activity activity, Bundle bundle) {
        x xVar = this.H;
        if (xVar == null) {
            return;
        }
        xVar.a(activity, bundle);
    }

    public void a(Fragment fragment) {
        if (this.E == null) {
            ab.b("Core", "You must initialize MetrixCore first");
            return;
        }
        e(fragment.getClass().getSimpleName());
        if (f(System.currentTimeMillis())) {
            return;
        }
        b("fragmentDisplayed", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Uri uri) {
        String str;
        if (h("appWillOpenUrl")) {
            if (uri == null) {
                str = "data cannot be null or empty in appWillOpenUrl method";
            } else {
                if (uri.toString().split("\\?").length >= 2 && uri.toString().contains(g.b)) {
                    final HashMap hashMap = new HashMap();
                    try {
                        String[] split = uri.toString().split("\\?")[1].split("&");
                        int i = 0;
                        while (true) {
                            if (i >= split.length) {
                                i = 0;
                                break;
                            } else if (split[i].split("=")[0].equals(g.b)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        hashMap.put(split[i].split("=")[0], split[i].split("=")[1]);
                        a(new Runnable() { // from class: ir.metrix.sdk.z.23
                            @Override // java.lang.Runnable
                            public void run() {
                                z zVar = z.this;
                                zVar.a((z) new i(zVar.q, ai.a(), hashMap, null, g.a), ai.a(), false);
                            }
                        });
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                str = "data not from metrix in appWillOpenUrl method";
            }
            ab.b("Core", str);
        }
    }

    public void a(OnAttributionChangedListener onAttributionChangedListener) {
        if (h("setOnAttributionChangedListener(callback)")) {
            this.M = onAttributionChangedListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(OnDeeplinkResponseListener onDeeplinkResponseListener) {
        if (h("setOnDeeplinkResponseListener(callback)")) {
            this.N = onDeeplinkResponseListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Double d) {
        a(str, d, MetrixCurrency.IRR, (String) null, "newRevenue(slug, revenue)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Double d, MetrixCurrency metrixCurrency) {
        a(str, d, metrixCurrency, (String) null, "newRevenue(slug, revenue, currency)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Double d, MetrixCurrency metrixCurrency, String str2) {
        a(str, d, metrixCurrency, str2, "newRevenue(slug, revenue, currency, orderId)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Double d, String str2) {
        a(str, d, MetrixCurrency.IRR, str2, "newRevenue(slug, revenue, orderId)");
    }

    public void a(final String str, final Map<String, String> map, final Map<String, Double> map2) {
        if (h("logEvent(eventName, customAttributes, customMetrics)")) {
            if (ai.a(str)) {
                ab.b("Core", "eventName cannot be null or empty in newEvent method");
                return;
            }
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    if (map2.get(str2) == null) {
                        ab.b("Core", "Null metric passed for key " + str2 + " in for event with name " + str + ", ignoring event.");
                        return;
                    }
                }
            }
            if (map == null || a(map)) {
                if (map2 == null || b(map2)) {
                    a(new Runnable() { // from class: ir.metrix.sdk.z.9
                        @Override // java.lang.Runnable
                        public void run() {
                            z zVar = z.this;
                            zVar.a((z) new i(zVar.q, ai.a(), map, map2, str), ai.a(), false);
                        }
                    });
                }
            }
        }
    }

    public void a(Map<String, String> map, boolean z) {
        if (h("setUserAttributes")) {
            if (z || a(map)) {
                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
                a(new Runnable() { // from class: ir.metrix.sdk.z.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (z.this.C == null) {
                            z.this.C = new ConcurrentHashMap();
                        }
                        z.this.C.putAll(concurrentHashMap);
                        z.this.s.c("user_attributes", GsonHelper.a().toJson(concurrentHashMap));
                    }
                });
            }
        }
    }

    public z b() {
        a(new Runnable() { // from class: ir.metrix.sdk.z.4
            @Override // java.lang.Runnable
            public void run() {
                if (z.this.v == null) {
                    throw new IllegalStateException("Must initialize before acting on location listening.");
                }
                z.this.v.a(false);
            }
        });
        return this;
    }

    public z b(int i) {
        this.e = i;
        this.i = i;
        return this;
    }

    public z b(boolean z) {
        this.m = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(final long j) {
        a(new Runnable() { // from class: ir.metrix.sdk.z.5
            @Override // java.lang.Runnable
            public void run() {
                if (z.this.q == null) {
                    return;
                }
                z.this.e(j);
                ab.b("Core", "onExitForeground: setSessionDuration, sessionDuration: " + z.this.A + ", timestamp: " + j + ", sessionPortionStartTime: " + z.this.l());
                z zVar = z.this;
                zVar.h(zVar.A + Math.max(0L, j - z.this.l()));
                z.this.l = false;
                ab.c(false, "Core", "exit foreground");
            }
        });
    }

    public void b(Activity activity) {
        x xVar = this.H;
        if (xVar == null) {
            return;
        }
        xVar.a(activity);
    }

    public void b(Activity activity, Bundle bundle) {
        x xVar = this.H;
        if (xVar == null) {
            return;
        }
        xVar.b(activity, bundle);
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        String b = this.s.b("tracker_token", (String) null);
        if (b != null) {
            str = b;
        }
        hashMap.put("tracker_token", str);
        a((Map<String, String>) hashMap, true);
    }

    public void b(Map<String, Double> map, boolean z) {
        if (h("setUserMetrics")) {
            if (z || b(map)) {
                if (map != null) {
                    for (String str : map.keySet()) {
                        if (map.get(str) == null) {
                            ab.b("Core", "Null user metric passed for key " + str + ", ignoring event.");
                            return;
                        }
                    }
                }
                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
                a(new Runnable() { // from class: ir.metrix.sdk.z.11
                    @Override // java.lang.Runnable
                    public void run() {
                        z.this.D = concurrentHashMap;
                        z.this.s.c("user_metrics", GsonHelper.a().toJson(concurrentHashMap));
                    }
                });
            }
        }
    }

    public z c(int i) {
        this.f = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j) {
        ab.b("Core", "onStopped");
        a(new Runnable() { // from class: ir.metrix.sdk.z.6
            @Override // java.lang.Runnable
            public void run() {
                if (z.this.q == null) {
                    return;
                }
                if (z.this.k()) {
                    long j2 = z.this.F <= 0 ? 0L : z.this.F;
                    z.this.a(ai.a(), z.this.A, j2 / 1000 > 2592000 ? 0L : j2);
                    z.this.l(0L);
                }
                if (z.this.m) {
                    z.this.n();
                }
            }
        });
    }

    public void c(Activity activity) {
        x xVar = this.H;
        if (xVar == null) {
            return;
        }
        xVar.b(activity);
    }

    public void c(final String str) {
        if (h("logEvent(eventName)")) {
            if (ai.a(str)) {
                ab.b("Core", "eventName cannot be null or empty in newEvent method");
            } else {
                a(new Runnable() { // from class: ir.metrix.sdk.z.8
                    @Override // java.lang.Runnable
                    public void run() {
                        z zVar = z.this;
                        zVar.a((z) new i(zVar.q, ai.a(), str), ai.a(), false);
                    }
                });
            }
        }
    }

    public void c(boolean z) {
        this.G = z;
    }

    public long d() {
        return this.u;
    }

    public z d(int i) {
        this.g = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(final long j) {
        a(new Runnable() { // from class: ir.metrix.sdk.z.7
            @Override // java.lang.Runnable
            public void run() {
                if (z.this.q == null) {
                    return;
                }
                if (!z.this.b) {
                    z.this.g();
                }
                if (!z.this.f(j)) {
                    z.this.b("onEnterForeground", j);
                }
                z.this.l = true;
            }
        });
    }

    public void d(Activity activity) {
        x xVar = this.H;
        if (xVar == null) {
            return;
        }
        xVar.c(activity);
    }

    public void d(String str) {
        if (this.E == null) {
            ab.b("Core", "You must initialize MetrixCore first");
            return;
        }
        e(str);
        if (f(System.currentTimeMillis())) {
            return;
        }
        b("screenDisplayed", System.currentTimeMillis());
    }

    public z e(int i) {
        ab.a(i);
        return this;
    }

    public void e(Activity activity) {
        x xVar = this.H;
        if (xVar == null) {
            return;
        }
        xVar.d(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.E;
        if (copyOnWriteArrayList == null) {
            ab.b("Core", "screenFlow is null, make sure you have initialized the MetrixCore");
            return;
        }
        if (copyOnWriteArrayList.size() > 18) {
            this.E.remove(10);
        }
        this.E.add(str);
        a(new Runnable() { // from class: ir.metrix.sdk.z.18
            @Override // java.lang.Runnable
            public void run() {
                z.this.s.c("screen_flows", GsonHelper.a().toJson(z.this.E));
            }
        });
    }

    public boolean e() {
        return this.G;
    }

    public void f(Activity activity) {
        x xVar = this.H;
        if (xVar == null) {
            return;
        }
        xVar.e(activity);
    }

    public void f(final String str) {
        if (ai.a(str)) {
            return;
        }
        this.c = str;
        a(new Runnable() { // from class: ir.metrix.sdk.z.20
            @Override // java.lang.Runnable
            public void run() {
                z.this.s.c("api_key", str);
            }
        });
    }

    public void g(String str) {
        if (ai.a(str)) {
            ab.b("Core", "store cannot be null or empty in setStore method");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_store", str);
        a((Map<String, String>) hashMap, true);
    }
}
