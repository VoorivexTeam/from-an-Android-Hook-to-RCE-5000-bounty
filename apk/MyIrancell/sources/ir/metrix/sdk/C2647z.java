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
import ir.metrix.sdk.C2619b;
import ir.metrix.sdk.network.AbstractC2635d;
import ir.metrix.sdk.network.C2634c;
import ir.metrix.sdk.network.C2636e;
import ir.metrix.sdk.network.InterfaceC2633b;
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
import p000.pa0;

/* renamed from: ir.metrix.sdk.z */
/* loaded from: classes.dex */
public class C2647z {

    /* renamed from: H */
    private C2645x f10851H;

    /* renamed from: K */
    private InstallReferrerClient f10854K;

    /* renamed from: M */
    private OnAttributionChangedListener f10856M;

    /* renamed from: N */
    private OnDeeplinkResponseListener f10857N;

    /* renamed from: P */
    private long f10859P;

    /* renamed from: Q */
    private long f10860Q;

    /* renamed from: R */
    private long f10861R;

    /* renamed from: S */
    private long f10862S;

    /* renamed from: q */
    private Context f10879q;

    /* renamed from: r */
    private Application f10880r;

    /* renamed from: s */
    private C2627j f10881s;

    /* renamed from: a */
    private HandlerThreadC2618aj f10863a = new HandlerThreadC2618aj("logThread");

    /* renamed from: b */
    private boolean f10864b = false;

    /* renamed from: c */
    private String f10865c = null;

    /* renamed from: d */
    private int f10866d = 30;

    /* renamed from: e */
    private int f10867e = 100;

    /* renamed from: f */
    private int f10868f = 1000;

    /* renamed from: g */
    private long f10869g = 30000;

    /* renamed from: h */
    private boolean f10870h = false;

    /* renamed from: i */
    private int f10871i = 100;

    /* renamed from: j */
    private long f10872j = 1800000;

    /* renamed from: k */
    private boolean f10873k = false;

    /* renamed from: l */
    private boolean f10874l = false;

    /* renamed from: m */
    private boolean f10875m = true;

    /* renamed from: n */
    private String f10876n = null;

    /* renamed from: o */
    private Boolean f10877o = null;

    /* renamed from: p */
    private Long f10878p = null;

    /* renamed from: t */
    private String f10882t = null;

    /* renamed from: u */
    private int f10883u = -1;

    /* renamed from: v */
    private C2612ad f10884v = null;

    /* renamed from: w */
    private long f10885w = -1;

    /* renamed from: x */
    private long f10886x = -1;

    /* renamed from: y */
    private int f10887y = -1;

    /* renamed from: z */
    private String f10888z = null;

    /* renamed from: A */
    private long f10844A = 0;

    /* renamed from: B */
    private String f10845B = null;

    /* renamed from: C */
    private ConcurrentMap<String, String> f10846C = null;

    /* renamed from: D */
    private ConcurrentMap<String, Double> f10847D = null;

    /* renamed from: E */
    private CopyOnWriteArrayList<String> f10848E = new CopyOnWriteArrayList<>();

    /* renamed from: F */
    private long f10849F = -1;

    /* renamed from: G */
    private boolean f10850G = false;

    /* renamed from: I */
    private AtomicBoolean f10852I = new AtomicBoolean(false);

    /* renamed from: J */
    private AtomicBoolean f10853J = new AtomicBoolean(false);

    /* renamed from: L */
    private AtomicBoolean f10855L = new AtomicBoolean(false);

    /* renamed from: O */
    private long f10858O = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ir.metrix.sdk.z$16, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass16 extends AbstractC2635d<ResponseModel, ErrorModel> {

        /* renamed from: a */
        final /* synthetic */ long f10900a;

        AnonymousClass16(long j) {
            this.f10900a = j;
        }

        @Override // ir.metrix.sdk.network.AbstractC2635d
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo12670a(pa0<ResponseModel> pa0Var, ErrorModel errorModel) {
            C2647z.this.m12727a(new Runnable() { // from class: ir.metrix.sdk.z.16.2
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass16 anonymousClass16 = AnonymousClass16.this;
                    if (anonymousClass16.f10900a >= 0) {
                        C2647z.this.f10881s.m12601b(AnonymousClass16.this.f10900a);
                    }
                    long m12599b = C2647z.this.f10881s.m12599b();
                    long j = C2647z.this.f10866d;
                    C2647z c2647z = C2647z.this;
                    if (m12599b > j) {
                        c2647z.f10863a.m12559a(new Runnable() { // from class: ir.metrix.sdk.z.16.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C2647z c2647z2 = C2647z.this;
                                c2647z2.m12760e(c2647z2.f10870h);
                            }
                        });
                        return;
                    }
                    c2647z.f10870h = false;
                    C2647z c2647z2 = C2647z.this;
                    c2647z2.f10871i = c2647z2.f10867e;
                    long j2 = C2647z.this.f10885w;
                    AnonymousClass16 anonymousClass162 = AnonymousClass16.this;
                    if (j2 != anonymousClass162.f10900a) {
                        C2647z c2647z3 = C2647z.this;
                        c2647z3.m12780k(c2647z3.f10869g);
                    }
                }
            });
            C2647z.this.f10853J.set(false);
        }

        @Override // ir.metrix.sdk.network.AbstractC2635d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12671b(pa0<ResponseModel> pa0Var, final ResponseModel responseModel) {
            C2647z.this.m12727a(new Runnable() { // from class: ir.metrix.sdk.z.16.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (responseModel.userId != null) {
                            C2647z.this.f10845B = responseModel.userId;
                            C2647z.this.f10881s.m12602c("metrix_user_id", C2647z.this.f10845B);
                            C2647z.this.m12791o();
                        }
                    } catch (Throwable unused) {
                    }
                    AnonymousClass16 anonymousClass16 = AnonymousClass16.this;
                    if (anonymousClass16.f10900a >= 0) {
                        C2647z.this.f10881s.m12601b(AnonymousClass16.this.f10900a);
                    }
                    long m12599b = C2647z.this.f10881s.m12599b();
                    long j = C2647z.this.f10866d;
                    C2647z c2647z = C2647z.this;
                    if (m12599b > j) {
                        c2647z.f10863a.m12559a(new Runnable() { // from class: ir.metrix.sdk.z.16.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C2647z c2647z2 = C2647z.this;
                                c2647z2.m12760e(c2647z2.f10870h);
                            }
                        });
                        return;
                    }
                    c2647z.f10870h = false;
                    C2647z c2647z2 = C2647z.this;
                    c2647z2.f10871i = c2647z2.f10867e;
                    long j2 = C2647z.this.f10885w;
                    AnonymousClass16 anonymousClass162 = AnonymousClass16.this;
                    if (j2 != anonymousClass162.f10900a) {
                        C2647z c2647z3 = C2647z.this;
                        c2647z3.m12780k(c2647z3.f10869g);
                    }
                }
            });
            C2647z.this.f10853J.set(false);
        }

        @Override // ir.metrix.sdk.network.AbstractC2632a
        /* renamed from: a */
        public void mo12512a(pa0<ResponseModel> pa0Var, Throwable th) {
            C2647z.this.f10853J.set(false);
        }
    }

    /* renamed from: ir.metrix.sdk.z$24, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass24 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10921a;

        static {
            int[] iArr = new int[AttributionStatus.values().length];
            f10921a = iArr;
            try {
                iArr[AttributionStatus.ATTRIBUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10921a[AttributionStatus.ATTRIBUTION_NOT_NEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2647z() {
        this.f10863a.start();
    }

    /* renamed from: a */
    private <T extends AbstractC2629l> long m12699a(T t) {
        String json = GsonHelper.m12497a().toJson(t);
        if (C2617ai.m12552a(json)) {
            C2610ab.m12529b("Core", "Detected empty event string, skipping");
            return -1L;
        }
        long m12589a = this.f10881s.m12589a(json);
        this.f10885w = m12589a;
        m12779j(m12589a);
        int min = Math.min(Math.max(1, this.f10868f / 10), 20);
        if (this.f10881s.m12587a() > this.f10868f) {
            C2627j c2627j = this.f10881s;
            c2627j.m12601b(c2627j.m12588a(min));
        }
        long m12599b = this.f10881s.m12599b();
        if ((t instanceof C2613ae) && t.m12645b() != null && t.m12645b().m12540a()) {
            this.f10863a.m12560a(new Runnable() { // from class: ir.metrix.sdk.z.13
                @Override // java.lang.Runnable
                public void run() {
                    C2647z.this.m12789n();
                }
            }, 10000L);
        } else if (m12599b >= this.f10866d) {
            m12789n();
        } else {
            m12780k(this.f10869g);
        }
        return this.f10885w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public <T extends AbstractC2629l> long m12700a(T t, long j, boolean z) {
        if (Thread.currentThread() != this.f10863a) {
            C2610ab.m12529b("Core", "Events must be logged in logThread.`");
            return -1L;
        }
        if (!(t.m12642a().equals("session_start") || t.m12642a().equals("session_stop")) && !z) {
            if (this.f10874l) {
                m12758e(j);
            } else {
                m12764f(j);
            }
        }
        C2610ab.m12532c(false, "Core", "Logged event to Metrix: " + t.m12642a());
        t.m12643a(this.f10884v);
        t.m12644a(this.f10846C);
        t.m12647b(this.f10847D);
        return m12699a((C2647z) t);
    }

    /* renamed from: a */
    private Pair<Long, JSONArray> m12702a(List<JSONObject> list, long j) {
        JSONArray jSONArray = new JSONArray();
        long j2 = -1;
        while (true) {
            if (jSONArray.length() >= j) {
                break;
            }
            if (list.isEmpty()) {
                C2610ab.m12517a("Core", String.format(Locale.getDefault(), "mergeEvents: number of events less than expected by " + (j - jSONArray.length()), new Object[0]));
                break;
            }
            JSONObject remove = list.remove(0);
            long j3 = remove.getLong("event_id");
            jSONArray.put(remove);
            j2 = j3;
        }
        return new Pair<>(Long.valueOf(j2), jSONArray);
    }

    /* renamed from: a */
    private synchronized C2647z m12703a(Application application, Context context, String str) {
        m12713a(application);
        if (context == null) {
            C2610ab.m12529b("Core", "Argument context cannot be null in initialize()");
            return this;
        }
        this.f10880r = application;
        this.f10879q = context.getApplicationContext();
        C2627j m12572a = C2627j.m12572a(application, "_default_instance");
        this.f10881s = m12572a;
        this.f10865c = str;
        boolean booleanValue = m12572a.m12592a("first_app_open", (Boolean) true).booleanValue();
        if (booleanValue) {
            m12733a(false, booleanValue);
        }
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.21
            @Override // java.lang.Runnable
            public void run() {
                if (C2647z.this.f10864b) {
                    return;
                }
                C2647z.this.m12767g();
            }
        });
        return this;
    }

    /* renamed from: a */
    private String m12705a(Context context) {
        if (this.f10865c == null) {
            this.f10865c = this.f10881s.m12600b("api_key", (String) null);
        }
        return this.f10865c;
    }

    /* renamed from: a */
    private String m12707a(JSONObject jSONObject) {
        if (this.f10858O == 0) {
            return null;
        }
        if (this.f10859P < 0 || this.f10860Q < 0 || this.f10861R < 0 || this.f10862S < 0) {
            throw new RuntimeException("app secret is not valid.");
        }
        String m12740b = m12740b(jSONObject);
        if (m12740b == null || m12740b.isEmpty()) {
            return null;
        }
        return C2617ai.m12550a("Signature secret_id=\"%1$d\", signature=\"%2$s\", algorithm=\"%3$s\", headers=\"timestamp app_secret userInfo.deviceInfo\"", Long.valueOf(this.f10858O), C2617ai.m12557f(m12740b), "SHA-256");
    }

    /* renamed from: a */
    private ConcurrentMap<String, String> m12709a(ConcurrentMap<String, String> concurrentMap) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : concurrentMap.entrySet()) {
            if (!entry.getKey().equals("_order_id") && !entry.getKey().equals("_currency")) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    private void m12710a(int i, long j) {
        long j2 = this.f10849F;
        if (j2 <= 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000 > 2592000 ? 0L : j2;
        if (this.f10878p != null) {
            long j4 = this.f10886x;
            m12712a(j4, this.f10844A + (j4 - m12783l()), j3);
            m12784l(0L);
        }
        long j5 = this.f10886x;
        if (j5 > 0 && i > 0) {
            m12784l(j - j5);
        }
        boolean booleanValue = this.f10881s.m12592a("first_app_open", (Boolean) true).booleanValue();
        this.f10881s.m12598a("first_app_open", false);
        m12711a(i, booleanValue);
        m12758e(j);
        m12728a("startNewSession", C2617ai.m12548a());
        m12787m();
    }

    /* renamed from: a */
    private void m12711a(int i, boolean z) {
        if (this.f10883u != i) {
            this.f10883u = i;
            this.f10882t = UUID.randomUUID().toString();
            m12762f(i);
            m12775i(this.f10882t);
            m12714a(this.f10879q, this.f10882t, this.f10883u, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12712a(long j, long j2, long j3) {
        if (m12772h("sendSessionStopEvent") && m12781k()) {
            if (this.f10848E == null) {
                C2610ab.m12529b("Core", "screenFlows is null, make sure MetrixCore has initialized before");
                return;
            }
            List<String> m12794q = m12794q();
            C2610ab.m12532c(false, "SessionCycle", "session_stop happened: duration: " + j2 + ", session_interval: " + j3 + ", screenFlows: " + m12794q.toString());
            m12726a((Long) null);
            m12700a((C2647z) new C2614af(this.f10879q, j, j2, m12794q, j3), C2617ai.m12548a(), false);
            m12793p();
        }
    }

    /* renamed from: a */
    private static void m12713a(final Application application) {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ir.metrix.sdk.z.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                if (C2647z.m12736a(Log.getStackTraceString(th))) {
                    C2647z.m12732a(th, application);
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
    }

    /* renamed from: a */
    private void m12714a(Context context, String str, int i, boolean z) {
        if (i != 0) {
            z = false;
        }
        this.f10884v = new C2612ad(context, str, Integer.valueOf(i), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12715a(C2620c c2620c) {
        this.f10881s.m12602c("android_advertising_id", c2620c.m12564a());
        this.f10881s.m12598a("limit_ad_tracking_enabled", c2620c.m12567b().booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12716a(AttributionModel attributionModel) {
        this.f10881s.m12602c("acquisition_ad", attributionModel.getAcquisitionAd());
        this.f10881s.m12602c("acquisition_campaign", attributionModel.getAcquisitionCampaign());
        this.f10881s.m12602c("acquisition_source", attributionModel.getAcquisitionSource());
        this.f10881s.m12602c("acquisition_ad_set", attributionModel.getAcquisitionAdSet());
        this.f10881s.m12602c("tracker_token", attributionModel.getTrackerToken());
        if (attributionModel.getTrackerToken() != null) {
            m12830b(attributionModel.getTrackerToken());
        }
    }

    /* renamed from: a */
    private void m12726a(Long l) {
        this.f10878p = l;
        this.f10881s.m12597a("last_session_start_time", l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12727a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        HandlerThreadC2618aj handlerThreadC2618aj = this.f10863a;
        if (currentThread != handlerThreadC2618aj) {
            handlerThreadC2618aj.m12559a(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    private void m12728a(String str, long j) {
        m12771h(0L);
        m12747b(str + ".refreshSessionDuration ", j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12729a(String str, long j, long j2) {
        this.f10881s.m12602c("referrer_time", str);
        this.f10881s.m12597a("referral_time", Long.valueOf(TimeUnit.SECONDS.toMillis(j)));
        this.f10881s.m12597a("install_begin_time", Long.valueOf(TimeUnit.SECONDS.toMillis(j2)));
    }

    /* renamed from: a */
    private void m12730a(String str, long j, JSONObject jSONObject) {
        String m12555d = C2617ai.m12555d("{\"events\":" + str + "}");
        StringBuilder sb = new StringBuilder();
        sb.append("Events: ");
        sb.append(m12555d);
        C2610ab.m12532c(true, "Core", sb.toString());
        ((InterfaceC2633b) C2636e.m12672a(InterfaceC2633b.class)).m12658a(m12705a(this.f10879q), m12707a(jSONObject), m12555d).mo14741a(new AnonymousClass16(j));
    }

    /* renamed from: a */
    private void m12731a(final String str, Double d, MetrixCurrency metrixCurrency, String str2, String str3) {
        if (m12772h(str3)) {
            if (C2617ai.m12552a(str)) {
                C2610ab.m12529b("Core", "slug cannot be null or empty in newRevenue method");
                return;
            }
            if (d == null) {
                C2610ab.m12529b("Core", "revenue cannot be null or empty in newRevenue method");
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
            m12727a(new Runnable() { // from class: ir.metrix.sdk.z.22
                @Override // java.lang.Runnable
                public void run() {
                    C2647z c2647z = C2647z.this;
                    c2647z.m12700a((C2647z) new C2626i(c2647z.f10879q, C2617ai.m12548a(), hashMap, hashMap2, str), C2617ai.m12548a(), false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12732a(Throwable th, Application application) {
        try {
            ((InterfaceC2633b) C2636e.m12672a(InterfaceC2633b.class)).m12655a(C2634c.m12660a(application, th)).mo14741a(new AbstractC2635d<Void, Void>() { // from class: ir.metrix.sdk.z.12
                @Override // ir.metrix.sdk.network.AbstractC2632a
                /* renamed from: a */
                public void mo12512a(pa0<Void> pa0Var, Throwable th2) {
                }

                @Override // ir.metrix.sdk.network.AbstractC2635d
                /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo12671b(pa0<Void> pa0Var, Void r2) {
                }

                @Override // ir.metrix.sdk.network.AbstractC2635d
                /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo12670a(pa0<Void> pa0Var, Void r2) {
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12733a(final boolean z, final boolean z2) {
        if (m12763f()) {
            this.f10854K = InstallReferrerClient.newBuilder(this.f10880r).build();
            try {
                this.f10854K.startConnection(new InstallReferrerStateListener() { // from class: ir.metrix.sdk.z.25
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerServiceDisconnected() {
                        if (z) {
                            return;
                        }
                        C2647z.this.m12754d(z2);
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerSetupFinished(int i) {
                        if (i == 0) {
                            try {
                                ReferrerDetails installReferrer = C2647z.this.f10854K.getInstallReferrer();
                                C2647z.this.m12729a(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds());
                                C2609aa.m12506a(C2647z.this.f10879q, C2647z.this.f10857N).m12510a(installReferrer.getInstallReferrer(), z2);
                            } catch (Throwable unused) {
                                if (z) {
                                    return;
                                }
                                C2647z.this.m12754d(z2);
                                return;
                            }
                        }
                        C2647z.this.f10854K.endConnection();
                    }
                });
            } catch (Throwable unused) {
                if (z) {
                    return;
                }
                m12754d(z2);
            }
        }
    }

    /* renamed from: a */
    private boolean m12734a(AttributionStatus attributionStatus) {
        return attributionStatus.name().equals(this.f10881s.m12600b("attribution_status", (String) null)) || this.f10881s.m12586a("acquisition_request_count", 0) >= 3 || System.currentTimeMillis() - this.f10881s.m12590a("acquisition_last_request_time", 0L) < 86400000 || this.f10845B == null || this.f10855L.getAndSet(true);
    }

    /* renamed from: a */
    public static boolean m12736a(String str) {
        return str.contains("ir.metrix");
    }

    /* renamed from: a */
    private boolean m12737a(Map<String, String> map) {
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
            C2610ab.m12529b("Core", str);
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private C2647z m12738b(Application application) {
        if (!m12772h("enableForegroundTracking") || this.f10873k) {
            return this;
        }
        application.registerActivityLifecycleCallbacks(new C2646y(this));
        return this;
    }

    /* renamed from: b */
    private String m12740b(JSONObject jSONObject) {
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
            int[] iArr = {C2617ai.m12547a(j, size), C2617ai.m12547a(this.f10859P, size), C2617ai.m12547a(this.f10860Q, size), C2617ai.m12547a(this.f10861R, size), C2617ai.m12547a(this.f10862S, size)};
            String str = "";
            for (int i = 0; i < 5; i++) {
                str = str + hashMap.get(arrayList.get(iArr[i]));
            }
            return "" + j + this.f10859P + this.f10860Q + this.f10861R + this.f10862S + str;
        } catch (JSONException e) {
            C2610ab.m12530b("Core", e);
            return null;
        }
    }

    /* renamed from: b */
    private ConcurrentMap<String, Double> m12742b(ConcurrentMap<String, Object> concurrentMap) {
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
    /* renamed from: b */
    public void m12743b(AttributionModel attributionModel) {
        this.f10881s.m12597a("acquisition_last_request_time", Long.valueOf(System.currentTimeMillis()));
        this.f10881s.m12597a("acquisition_request_count", Long.valueOf(r0.m12586a("acquisition_request_count", 0) + 1));
        this.f10881s.m12602c("attribution_status", attributionModel.getAttributionStatus().name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12747b(String str, long j) {
        C2610ab.m12524a(false, "Core", "setSessionPortionStartTime: " + j + ", source: " + str);
        this.f10881s.m12597a("session_portion_start_time", Long.valueOf(j));
    }

    /* renamed from: b */
    private boolean m12749b(Map<String, Double> map) {
        Iterator<Map.Entry<String, Double>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equals("_revenue")) {
                C2610ab.m12529b("Core", "cannot add metric with key \"_revenue\"");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m12754d(final boolean z) {
        this.f10863a.m12560a(new Runnable() { // from class: ir.metrix.sdk.z.26
            @Override // java.lang.Runnable
            public void run() {
                C2647z.this.m12733a(true, z);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m12758e(long j) {
        if (m12781k()) {
            m12774i(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f A[Catch: h -> 0x016c, JSONException -> 0x0186, LOOP:0: B:17:0x004d->B:30:0x012f, LOOP_END, TryCatch #4 {h -> 0x016c, JSONException -> 0x0186, blocks: (B:12:0x0037, B:14:0x0046, B:17:0x004d, B:28:0x0111, B:33:0x013a, B:35:0x0148, B:37:0x014f, B:30:0x012f, B:42:0x010a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m12760e(boolean r21) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.metrix.sdk.C2647z.m12760e(boolean):void");
    }

    /* renamed from: f */
    private void m12762f(int i) {
        this.f10887y = i;
        this.f10881s.m12597a("previous_session_num", Long.valueOf(i));
    }

    /* renamed from: f */
    private static boolean m12763f() {
        try {
            return Class.forName("com.android.installreferrer.api.InstallReferrerClient").toString() != null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m12764f(long j) {
        if (!m12781k()) {
            int i = this.f10887y;
            m12710a(i != -1 ? i + 1 : 0, j);
            return true;
        }
        if (m12768g(j)) {
            m12758e(j);
            return false;
        }
        m12710a(this.f10883u + 1, j);
        return true;
    }

    /* renamed from: g */
    private C2647z m12766g(Activity activity) {
        if (!m12772h("enableForegroundTracking") || this.f10873k) {
            return this;
        }
        activity.getApplication().registerActivityLifecycleCallbacks(new C2646y(this, activity));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public synchronized void m12767g() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = (CopyOnWriteArrayList) GsonHelper.m12497a().fromJson(this.f10881s.m12600b("screen_flows", (String) null), new TypeToken<CopyOnWriteArrayList<String>>() { // from class: ir.metrix.sdk.z.27
        }.getType());
        if (copyOnWriteArrayList != null) {
            CopyOnWriteArrayList<String> copyOnWriteArrayList2 = this.f10848E;
            this.f10848E = copyOnWriteArrayList;
            copyOnWriteArrayList.addAll(copyOnWriteArrayList2);
        }
        C2644w.m12685a().m12686a(this.f10881s.m12600b("engine_version", ""));
        m12773i();
        m12770h();
        this.f10849F = this.f10881s.m12590a("interval", 0L);
        this.f10881s.m12602c("api_key", this.f10865c);
        this.f10887y = this.f10881s.m12586a("previous_session_num", -1);
        String m12600b = this.f10881s.m12600b("previous_session_identifier", (String) null);
        this.f10888z = m12600b;
        if (this.f10887y >= 0) {
            this.f10883u = this.f10887y;
            this.f10882t = m12600b;
            boolean booleanValue = this.f10881s.m12592a("first_app_open", (Boolean) true).booleanValue();
            this.f10881s.m12598a("first_app_open", false);
            m12714a(this.f10879q, this.f10882t, this.f10883u, booleanValue);
        }
        String m12600b2 = this.f10881s.m12600b("user_attributes", (String) null);
        boolean booleanValue2 = this.f10881s.m12592a("user_attributes_migrate", (Boolean) false).booleanValue();
        try {
            if (m12600b2 == null) {
                this.f10846C = null;
            } else {
                Type type = new TypeToken<ConcurrentMap<String, String>>() { // from class: ir.metrix.sdk.z.28
                }.getType();
                if (booleanValue2) {
                    this.f10846C = (ConcurrentMap) GsonHelper.m12497a().fromJson(m12600b2, type);
                } else {
                    ConcurrentMap<String, String> m12709a = m12709a((ConcurrentMap<String, String>) GsonHelper.m12497a().fromJson(m12600b2, type));
                    this.f10846C = m12709a;
                    m12823a((Map<String, String>) m12709a, true);
                    this.f10881s.m12598a("user_attributes_migrate", true);
                }
            }
        } catch (Throwable unused) {
            this.f10846C = null;
        }
        boolean booleanValue3 = this.f10881s.m12592a("user_metrics_migrate", (Boolean) false).booleanValue();
        String m12600b3 = this.f10881s.m12600b("user_metrics", (String) null);
        try {
            if (m12600b3 == null) {
                this.f10847D = null;
            } else {
                Type type2 = new TypeToken<ConcurrentMap<String, Object>>() { // from class: ir.metrix.sdk.z.29
                }.getType();
                if (booleanValue3) {
                    this.f10847D = (ConcurrentMap) GsonHelper.m12497a().fromJson(m12600b3, new TypeToken<ConcurrentMap<String, Double>>() { // from class: ir.metrix.sdk.z.30
                    }.getType());
                } else {
                    ConcurrentMap<String, Double> m12742b = m12742b((ConcurrentMap<String, Object>) GsonHelper.m12497a().fromJson(m12600b3, type2));
                    this.f10847D = m12742b;
                    m12831b((Map<String, Double>) m12742b, true);
                    this.f10881s.m12598a("user_metrics_migrate", true);
                }
            }
        } catch (Throwable unused2) {
            this.f10847D = null;
        }
        this.f10844A = this.f10881s.m12590a("session_duration", 0L);
        this.f10885w = this.f10881s.m12590a("last_event_id", -1L);
        this.f10886x = this.f10881s.m12590a("last_event_time", -1L);
        Long valueOf = Long.valueOf(this.f10881s.m12590a("last_session_start_time", -1L));
        this.f10878p = valueOf;
        if (valueOf.longValue() == -1) {
            this.f10878p = null;
        }
        this.f10845B = this.f10881s.m12600b("metrix_user_id", (String) null);
        m12791o();
        m12778j();
        this.f10864b = true;
    }

    /* renamed from: g */
    private boolean m12768g(long j) {
        long j2 = this.f10872j;
        Long l = this.f10878p;
        return l != null && j - l.longValue() < j2;
    }

    /* renamed from: h */
    private void m12770h() {
        C2619b.m12561a(this.f10879q, new C2619b.a() { // from class: ir.metrix.sdk.z.2
            @Override // ir.metrix.sdk.C2619b.a
            /* renamed from: a */
            public void mo12562a() {
            }

            @Override // ir.metrix.sdk.C2619b.a
            /* renamed from: a */
            public void mo12563a(C2620c c2620c) {
                if (c2620c != null) {
                    C2647z.this.m12715a(c2620c);
                    C2647z.this.f10876n = c2620c.m12564a();
                    C2647z.this.f10877o = c2620c.m12567b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m12771h(long j) {
        if (m12781k()) {
            this.f10844A = j;
            this.f10881s.m12597a("session_duration", Long.valueOf(j));
        }
    }

    /* renamed from: h */
    private synchronized boolean m12772h(String str) {
        boolean z;
        if (this.f10879q == null) {
            C2610ab.m12529b("Core", "context cannot be null, set context with initialize() before calling " + str);
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    private void m12773i() {
        this.f10876n = this.f10881s.m12600b("android_advertising_id", (String) null);
        this.f10877o = this.f10881s.m12592a("limit_ad_tracking_enabled", (Boolean) null);
    }

    /* renamed from: i */
    private void m12774i(long j) {
        this.f10886x = j;
        this.f10881s.m12597a("last_event_time", Long.valueOf(j));
    }

    /* renamed from: i */
    private void m12775i(String str) {
        this.f10888z = str;
        this.f10881s.m12602c("previous_session_identifier", str);
    }

    /* renamed from: j */
    private void m12778j() {
        try {
            InputStream open = this.f10879q.getAssets().open("metrix_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            C2610ab.m12531b(false, "Core", "metrix_config.properties file read and loaded");
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                m12830b(property);
            }
        } catch (Exception e) {
            C2610ab.m12524a(false, "Core", String.format("%s file not found in this app", e.getMessage()));
        }
    }

    /* renamed from: j */
    private void m12779j(long j) {
        this.f10885w = j;
        this.f10881s.m12597a("last_event_id", Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m12780k(long j) {
        if (this.f10852I.getAndSet(true)) {
            return;
        }
        this.f10863a.m12560a(new Runnable() { // from class: ir.metrix.sdk.z.14
            @Override // java.lang.Runnable
            public void run() {
                C2647z.this.f10852I.set(false);
                C2647z.this.m12789n();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public boolean m12781k() {
        return this.f10883u >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public long m12783l() {
        return this.f10881s.m12590a("session_portion_start_time", C2617ai.m12548a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m12784l(final long j) {
        this.f10849F = j;
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.19
            @Override // java.lang.Runnable
            public void run() {
                C2647z.this.f10881s.m12597a("interval", Long.valueOf(j));
            }
        });
    }

    /* renamed from: m */
    private void m12787m() {
        if (m12772h("sendSessionStartEvent") && m12781k()) {
            C2610ab.m12532c(false, "SessionCycle", "session_start happened : isFirstUsage: " + this.f10884v.m12540a());
            m12726a(Long.valueOf(C2617ai.m12548a()));
            m12700a((C2647z) new C2613ae(this.f10879q), C2617ai.m12548a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m12789n() {
        if (C2617ai.m12552a(m12705a(this.f10879q))) {
            return;
        }
        m12760e(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m12791o() {
        if (m12734a(AttributionStatus.ATTRIBUTED)) {
            return;
        }
        ((InterfaceC2633b) C2636e.m12672a(InterfaceC2633b.class)).m12657a("https://api.metrix.ir/analyze/attribution/{apiKey}/app-user-attribution-info".replace("{apiKey}", m12705a(this.f10879q)), this.f10845B).mo14741a(new AbstractC2635d<AttributionModel, ErrorModel>() { // from class: ir.metrix.sdk.z.15
            @Override // ir.metrix.sdk.network.AbstractC2635d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo12671b(pa0<AttributionModel> pa0Var, final AttributionModel attributionModel) {
                C2647z.this.m12727a(new Runnable() { // from class: ir.metrix.sdk.z.15.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2647z.this.m12743b(attributionModel);
                        int i = AnonymousClass24.f10921a[attributionModel.getAttributionStatus().ordinal()];
                        if (i == 1) {
                            C2647z.this.m12716a(attributionModel);
                        } else if (i == 2) {
                            C2647z.this.f10881s.m12597a("acquisition_request_count", (Long) 3L);
                        }
                        if (C2647z.this.f10856M != null) {
                            C2647z.this.f10856M.onAttributionChanged(attributionModel);
                        }
                        C2647z.this.f10855L.set(false);
                    }
                });
            }

            @Override // ir.metrix.sdk.network.AbstractC2635d
            /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo12670a(pa0<AttributionModel> pa0Var, ErrorModel errorModel) {
                C2647z.this.f10855L.set(false);
            }

            @Override // ir.metrix.sdk.network.AbstractC2632a
            /* renamed from: a */
            public void mo12512a(pa0<AttributionModel> pa0Var, Throwable th) {
                C2647z.this.f10855L.set(false);
            }
        });
    }

    /* renamed from: p */
    private void m12793p() {
        this.f10848E.clear();
        this.f10881s.m12602c("screen_flows", GsonHelper.m12497a().toJson(this.f10848E));
    }

    /* renamed from: q */
    private List<String> m12794q() {
        ArrayList arrayList = new ArrayList(this.f10848E);
        while (arrayList.size() > 18) {
            arrayList.remove(10);
        }
        arrayList.add(0, "_start");
        arrayList.add("_end");
        return arrayList;
    }

    /* renamed from: a */
    public C2647z m12805a() {
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.3
            @Override // java.lang.Runnable
            public void run() {
                if (C2647z.this.f10884v == null) {
                    throw new IllegalStateException("Must initialize before acting on location listening.");
                }
                C2647z.this.f10884v.m12539a(true);
            }
        });
        return this;
    }

    /* renamed from: a */
    public C2647z m12806a(int i) {
        this.f10866d = i;
        return this;
    }

    /* renamed from: a */
    public C2647z m12807a(long j) {
        this.f10872j = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2647z m12808a(Activity activity, String str) {
        C2647z m12703a = m12703a(activity.getApplication(), activity.getApplicationContext(), str);
        m12703a.m12766g(activity);
        this.f10851H = C2645x.m12688a(this);
        return m12703a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2647z m12809a(Application application, String str) {
        C2647z m12703a = m12703a(application, application.getApplicationContext(), str);
        m12703a.m12738b(application);
        this.f10851H = C2645x.m12688a(this);
        return m12703a;
    }

    /* renamed from: a */
    public C2647z m12810a(boolean z) {
        C2610ab.m12520a(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12811a(long j, long j2, long j3, long j4, long j5) {
        this.f10858O = j;
        this.f10859P = j2;
        this.f10860Q = j3;
        this.f10861R = j4;
        this.f10862S = j5;
    }

    /* renamed from: a */
    public void m12812a(Activity activity) {
        if (this.f10848E == null) {
            C2610ab.m12529b("Core", "You must initialize MetrixCore first");
            return;
        }
        m12845e(activity.getClass().getSimpleName());
        if (m12764f(System.currentTimeMillis())) {
            return;
        }
        m12747b("activityDisplayed", System.currentTimeMillis());
    }

    /* renamed from: a */
    public void m12813a(Activity activity, Bundle bundle) {
        C2645x c2645x = this.f10851H;
        if (c2645x == null) {
            return;
        }
        c2645x.m12691a(activity, bundle);
    }

    /* renamed from: a */
    public void m12814a(Fragment fragment) {
        if (this.f10848E == null) {
            C2610ab.m12529b("Core", "You must initialize MetrixCore first");
            return;
        }
        m12845e(fragment.getClass().getSimpleName());
        if (m12764f(System.currentTimeMillis())) {
            return;
        }
        m12747b("fragmentDisplayed", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12815a(Uri uri) {
        String str;
        if (m12772h("appWillOpenUrl")) {
            if (uri == null) {
                str = "data cannot be null or empty in appWillOpenUrl method";
            } else {
                if (uri.toString().split("\\?").length >= 2 && uri.toString().contains(C2624g.f10726b)) {
                    final HashMap hashMap = new HashMap();
                    try {
                        String[] split = uri.toString().split("\\?")[1].split("&");
                        int i = 0;
                        while (true) {
                            if (i >= split.length) {
                                i = 0;
                                break;
                            } else if (split[i].split("=")[0].equals(C2624g.f10726b)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        hashMap.put(split[i].split("=")[0], split[i].split("=")[1]);
                        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.23
                            @Override // java.lang.Runnable
                            public void run() {
                                C2647z c2647z = C2647z.this;
                                c2647z.m12700a((C2647z) new C2626i(c2647z.f10879q, C2617ai.m12548a(), hashMap, null, C2624g.f10725a), C2617ai.m12548a(), false);
                            }
                        });
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                str = "data not from metrix in appWillOpenUrl method";
            }
            C2610ab.m12529b("Core", str);
        }
    }

    /* renamed from: a */
    public void m12816a(OnAttributionChangedListener onAttributionChangedListener) {
        if (m12772h("setOnAttributionChangedListener(callback)")) {
            this.f10856M = onAttributionChangedListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12817a(OnDeeplinkResponseListener onDeeplinkResponseListener) {
        if (m12772h("setOnDeeplinkResponseListener(callback)")) {
            this.f10857N = onDeeplinkResponseListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12818a(String str, Double d) {
        m12731a(str, d, MetrixCurrency.IRR, (String) null, "newRevenue(slug, revenue)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12819a(String str, Double d, MetrixCurrency metrixCurrency) {
        m12731a(str, d, metrixCurrency, (String) null, "newRevenue(slug, revenue, currency)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12820a(String str, Double d, MetrixCurrency metrixCurrency, String str2) {
        m12731a(str, d, metrixCurrency, str2, "newRevenue(slug, revenue, currency, orderId)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12821a(String str, Double d, String str2) {
        m12731a(str, d, MetrixCurrency.IRR, str2, "newRevenue(slug, revenue, orderId)");
    }

    /* renamed from: a */
    public void m12822a(final String str, final Map<String, String> map, final Map<String, Double> map2) {
        if (m12772h("logEvent(eventName, customAttributes, customMetrics)")) {
            if (C2617ai.m12552a(str)) {
                C2610ab.m12529b("Core", "eventName cannot be null or empty in newEvent method");
                return;
            }
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    if (map2.get(str2) == null) {
                        C2610ab.m12529b("Core", "Null metric passed for key " + str2 + " in for event with name " + str + ", ignoring event.");
                        return;
                    }
                }
            }
            if (map == null || m12737a(map)) {
                if (map2 == null || m12749b(map2)) {
                    m12727a(new Runnable() { // from class: ir.metrix.sdk.z.9
                        @Override // java.lang.Runnable
                        public void run() {
                            C2647z c2647z = C2647z.this;
                            c2647z.m12700a((C2647z) new C2626i(c2647z.f10879q, C2617ai.m12548a(), map, map2, str), C2617ai.m12548a(), false);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public void m12823a(Map<String, String> map, boolean z) {
        if (m12772h("setUserAttributes")) {
            if (z || m12737a(map)) {
                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
                m12727a(new Runnable() { // from class: ir.metrix.sdk.z.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C2647z.this.f10846C == null) {
                            C2647z.this.f10846C = new ConcurrentHashMap();
                        }
                        C2647z.this.f10846C.putAll(concurrentHashMap);
                        C2647z.this.f10881s.m12602c("user_attributes", GsonHelper.m12497a().toJson(concurrentHashMap));
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public C2647z m12824b() {
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.4
            @Override // java.lang.Runnable
            public void run() {
                if (C2647z.this.f10884v == null) {
                    throw new IllegalStateException("Must initialize before acting on location listening.");
                }
                C2647z.this.f10884v.m12539a(false);
            }
        });
        return this;
    }

    /* renamed from: b */
    public C2647z m12825b(int i) {
        this.f10867e = i;
        this.f10871i = i;
        return this;
    }

    /* renamed from: b */
    public C2647z m12826b(boolean z) {
        this.f10875m = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m12827b(final long j) {
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.5
            @Override // java.lang.Runnable
            public void run() {
                if (C2647z.this.f10879q == null) {
                    return;
                }
                C2647z.this.m12758e(j);
                C2610ab.m12529b("Core", "onExitForeground: setSessionDuration, sessionDuration: " + C2647z.this.f10844A + ", timestamp: " + j + ", sessionPortionStartTime: " + C2647z.this.m12783l());
                C2647z c2647z = C2647z.this;
                c2647z.m12771h(c2647z.f10844A + Math.max(0L, j - C2647z.this.m12783l()));
                C2647z.this.f10874l = false;
                C2610ab.m12532c(false, "Core", "exit foreground");
            }
        });
    }

    /* renamed from: b */
    public void m12828b(Activity activity) {
        C2645x c2645x = this.f10851H;
        if (c2645x == null) {
            return;
        }
        c2645x.m12690a(activity);
    }

    /* renamed from: b */
    public void m12829b(Activity activity, Bundle bundle) {
        C2645x c2645x = this.f10851H;
        if (c2645x == null) {
            return;
        }
        c2645x.m12693b(activity, bundle);
    }

    /* renamed from: b */
    public void m12830b(String str) {
        HashMap hashMap = new HashMap();
        String m12600b = this.f10881s.m12600b("tracker_token", (String) null);
        if (m12600b != null) {
            str = m12600b;
        }
        hashMap.put("tracker_token", str);
        m12823a((Map<String, String>) hashMap, true);
    }

    /* renamed from: b */
    public void m12831b(Map<String, Double> map, boolean z) {
        if (m12772h("setUserMetrics")) {
            if (z || m12749b(map)) {
                if (map != null) {
                    for (String str : map.keySet()) {
                        if (map.get(str) == null) {
                            C2610ab.m12529b("Core", "Null user metric passed for key " + str + ", ignoring event.");
                            return;
                        }
                    }
                }
                final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
                m12727a(new Runnable() { // from class: ir.metrix.sdk.z.11
                    @Override // java.lang.Runnable
                    public void run() {
                        C2647z.this.f10847D = concurrentHashMap;
                        C2647z.this.f10881s.m12602c("user_metrics", GsonHelper.m12497a().toJson(concurrentHashMap));
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public C2647z m12832c(int i) {
        this.f10868f = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m12833c() {
        this.f10873k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m12834c(long j) {
        C2610ab.m12529b("Core", "onStopped");
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.6
            @Override // java.lang.Runnable
            public void run() {
                if (C2647z.this.f10879q == null) {
                    return;
                }
                if (C2647z.this.m12781k()) {
                    long j2 = C2647z.this.f10849F <= 0 ? 0L : C2647z.this.f10849F;
                    C2647z.this.m12712a(C2617ai.m12548a(), C2647z.this.f10844A, j2 / 1000 > 2592000 ? 0L : j2);
                    C2647z.this.m12784l(0L);
                }
                if (C2647z.this.f10875m) {
                    C2647z.this.m12789n();
                }
            }
        });
    }

    /* renamed from: c */
    public void m12835c(Activity activity) {
        C2645x c2645x = this.f10851H;
        if (c2645x == null) {
            return;
        }
        c2645x.m12692b(activity);
    }

    /* renamed from: c */
    public void m12836c(final String str) {
        if (m12772h("logEvent(eventName)")) {
            if (C2617ai.m12552a(str)) {
                C2610ab.m12529b("Core", "eventName cannot be null or empty in newEvent method");
            } else {
                m12727a(new Runnable() { // from class: ir.metrix.sdk.z.8
                    @Override // java.lang.Runnable
                    public void run() {
                        C2647z c2647z = C2647z.this;
                        c2647z.m12700a((C2647z) new C2626i(c2647z.f10879q, C2617ai.m12548a(), str), C2617ai.m12548a(), false);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public void m12837c(boolean z) {
        this.f10850G = z;
    }

    /* renamed from: d */
    public long m12838d() {
        return this.f10883u;
    }

    /* renamed from: d */
    public C2647z m12839d(int i) {
        this.f10869g = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m12840d(final long j) {
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.7
            @Override // java.lang.Runnable
            public void run() {
                if (C2647z.this.f10879q == null) {
                    return;
                }
                if (!C2647z.this.f10864b) {
                    C2647z.this.m12767g();
                }
                if (!C2647z.this.m12764f(j)) {
                    C2647z.this.m12747b("onEnterForeground", j);
                }
                C2647z.this.f10874l = true;
            }
        });
    }

    /* renamed from: d */
    public void m12841d(Activity activity) {
        C2645x c2645x = this.f10851H;
        if (c2645x == null) {
            return;
        }
        c2645x.m12694c(activity);
    }

    /* renamed from: d */
    public void m12842d(String str) {
        if (this.f10848E == null) {
            C2610ab.m12529b("Core", "You must initialize MetrixCore first");
            return;
        }
        m12845e(str);
        if (m12764f(System.currentTimeMillis())) {
            return;
        }
        m12747b("screenDisplayed", System.currentTimeMillis());
    }

    /* renamed from: e */
    public C2647z m12843e(int i) {
        C2610ab.m12514a(i);
        return this;
    }

    /* renamed from: e */
    public void m12844e(Activity activity) {
        C2645x c2645x = this.f10851H;
        if (c2645x == null) {
            return;
        }
        c2645x.m12695d(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m12845e(String str) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.f10848E;
        if (copyOnWriteArrayList == null) {
            C2610ab.m12529b("Core", "screenFlow is null, make sure you have initialized the MetrixCore");
            return;
        }
        if (copyOnWriteArrayList.size() > 18) {
            this.f10848E.remove(10);
        }
        this.f10848E.add(str);
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.18
            @Override // java.lang.Runnable
            public void run() {
                C2647z.this.f10881s.m12602c("screen_flows", GsonHelper.m12497a().toJson(C2647z.this.f10848E));
            }
        });
    }

    /* renamed from: e */
    public boolean m12846e() {
        return this.f10850G;
    }

    /* renamed from: f */
    public void m12847f(Activity activity) {
        C2645x c2645x = this.f10851H;
        if (c2645x == null) {
            return;
        }
        c2645x.m12696e(activity);
    }

    /* renamed from: f */
    public void m12848f(final String str) {
        if (C2617ai.m12552a(str)) {
            return;
        }
        this.f10865c = str;
        m12727a(new Runnable() { // from class: ir.metrix.sdk.z.20
            @Override // java.lang.Runnable
            public void run() {
                C2647z.this.f10881s.m12602c("api_key", str);
            }
        });
    }

    /* renamed from: g */
    public void m12849g(String str) {
        if (C2617ai.m12552a(str)) {
            C2610ab.m12529b("Core", "store cannot be null or empty in setStore method");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_store", str);
        m12823a((Map<String, String>) hashMap, true);
    }
}
