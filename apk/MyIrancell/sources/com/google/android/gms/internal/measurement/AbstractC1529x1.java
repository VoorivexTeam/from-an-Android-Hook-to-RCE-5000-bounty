package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.measurement.x1 */
/* loaded from: classes.dex */
public abstract class AbstractC1529x1<T> {

    /* renamed from: g */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f6994g;

    /* renamed from: h */
    private static InterfaceC1374m2<AbstractC1284g2<C1473t1>> f6995h;

    /* renamed from: a */
    private final C1239d2 f6997a;

    /* renamed from: b */
    private final String f6998b;

    /* renamed from: c */
    private final T f6999c;

    /* renamed from: d */
    private volatile int f7000d;

    /* renamed from: e */
    private volatile T f7001e;

    /* renamed from: f */
    private static final Object f6993f = new Object();

    /* renamed from: i */
    private static final AtomicInteger f6996i = new AtomicInteger();

    private AbstractC1529x1(C1239d2 c1239d2, String str, T t) {
        this.f7000d = -1;
        if (c1239d2.f6558a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f6997a = c1239d2;
        this.f6998b = str;
        this.f6999c = t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC1529x1(C1239d2 c1239d2, String str, Object obj, C1557z1 c1557z1) {
        this(c1239d2, str, obj);
    }

    /* renamed from: a */
    private final String m8869a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f6998b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f6998b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public static void m8870a(Context context) {
        synchronized (f6993f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f6994g != context) {
                C1313i1.m7912d();
                C1224c2.m7692a();
                C1403o1.m8077a();
                f6996i.incrementAndGet();
                f6994g = context;
                f6995h = C1359l2.m7958a(C1515w1.f6980b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static AbstractC1529x1<Double> m8871b(C1239d2 c1239d2, String str, double d) {
        return new C1209b2(c1239d2, str, Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static AbstractC1529x1<Long> m8872b(C1239d2 c1239d2, String str, long j) {
        return new C1557z1(c1239d2, str, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static AbstractC1529x1<String> m8873b(C1239d2 c1239d2, String str, String str2) {
        return new C1194a2(c1239d2, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static AbstractC1529x1<Boolean> m8874b(C1239d2 c1239d2, String str, boolean z) {
        return new C1543y1(c1239d2, str, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m8875c() {
        f6996i.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static final /* synthetic */ AbstractC1284g2 m8876d() {
        new C1459s1();
        return C1459s1.m8368a(f6994g);
    }

    /* renamed from: a */
    abstract T mo7526a(Object obj);

    /* renamed from: a */
    public final String m8877a() {
        return m8869a(this.f6997a.f6560c);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[Catch: all -> 0x00ee, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:16:0x0035, B:18:0x003b, B:20:0x0047, B:22:0x0060, B:24:0x006a, B:27:0x00b4, B:29:0x00c2, B:31:0x00d8, B:32:0x00db, B:33:0x00df, B:34:0x0095, B:36:0x00a9, B:39:0x00b2, B:43:0x0058, B:44:0x006f, B:46:0x0078, B:48:0x0088, B:49:0x008c, B:51:0x00e4, B:52:0x00eb, B:54:0x00ec), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[Catch: all -> 0x00ee, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:16:0x0035, B:18:0x003b, B:20:0x0047, B:22:0x0060, B:24:0x006a, B:27:0x00b4, B:29:0x00c2, B:31:0x00d8, B:32:0x00db, B:33:0x00df, B:34:0x0095, B:36:0x00a9, B:39:0x00b2, B:43:0x0058, B:44:0x006f, B:46:0x0078, B:48:0x0088, B:49:0x008c, B:51:0x00e4, B:52:0x00eb, B:54:0x00ec), top: B:4:0x000b }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T m8878b() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC1529x1.m8878b():java.lang.Object");
    }
}
