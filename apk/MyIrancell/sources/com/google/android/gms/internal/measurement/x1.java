package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class x1<T> {

    @SuppressLint({"StaticFieldLeak"})
    private static Context g;
    private static m2<g2<t1>> h;
    private final d2 a;
    private final String b;
    private final T c;
    private volatile int d;
    private volatile T e;
    private static final Object f = new Object();
    private static final AtomicInteger i = new AtomicInteger();

    private x1(d2 d2Var, String str, T t) {
        this.d = -1;
        if (d2Var.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = d2Var;
        this.b = str;
        this.c = t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ x1(d2 d2Var, String str, Object obj, z1 z1Var) {
        this(d2Var, str, obj);
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static void a(Context context) {
        synchronized (f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (g != context) {
                i1.d();
                c2.a();
                o1.a();
                i.incrementAndGet();
                g = context;
                h = l2.a(w1.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x1<Double> b(d2 d2Var, String str, double d) {
        return new b2(d2Var, str, Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x1<Long> b(d2 d2Var, String str, long j) {
        return new z1(d2Var, str, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x1<String> b(d2 d2Var, String str, String str2) {
        return new a2(d2Var, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x1<Boolean> b(d2 d2Var, String str, boolean z) {
        return new y1(d2Var, str, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        i.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ g2 d() {
        new s1();
        return s1.a(g);
    }

    abstract T a(Object obj);

    public final String a() {
        return a(this.a.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[Catch: all -> 0x00ee, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:16:0x0035, B:18:0x003b, B:20:0x0047, B:22:0x0060, B:24:0x006a, B:27:0x00b4, B:29:0x00c2, B:31:0x00d8, B:32:0x00db, B:33:0x00df, B:34:0x0095, B:36:0x00a9, B:39:0x00b2, B:43:0x0058, B:44:0x006f, B:46:0x0078, B:48:0x0088, B:49:0x008c, B:51:0x00e4, B:52:0x00eb, B:54:0x00ec), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[Catch: all -> 0x00ee, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:16:0x0035, B:18:0x003b, B:20:0x0047, B:22:0x0060, B:24:0x006a, B:27:0x00b4, B:29:0x00c2, B:31:0x00d8, B:32:0x00db, B:33:0x00df, B:34:0x0095, B:36:0x00a9, B:39:0x00b2, B:43:0x0058, B:44:0x006f, B:46:0x0078, B:48:0x0088, B:49:0x008c, B:51:0x00e4, B:52:0x00eb, B:54:0x00ec), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T b() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x1.b():java.lang.Object");
    }
}
