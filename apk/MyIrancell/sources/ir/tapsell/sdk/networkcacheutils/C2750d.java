package ir.tapsell.sdk.networkcacheutils;

import android.util.Pair;

/* renamed from: ir.tapsell.sdk.networkcacheutils.d */
/* loaded from: classes.dex */
public class C2750d {

    /* renamed from: a */
    private static Long f11232a;

    /* renamed from: b */
    private static Long f11233b;

    /* renamed from: c */
    private static Integer f11234c;

    /* renamed from: a */
    public static void m13095a() {
        f11232a = Long.MAX_VALUE;
        f11233b = 100L;
        f11234c = 0;
    }

    /* renamed from: a */
    public static void m13096a(int i) {
        long j = i;
        if (j < 10) {
            j = 10;
        } else if (j > 100) {
            j = 100;
        }
        f11232a = Long.MAX_VALUE;
        f11233b = Long.valueOf(j);
        f11234c = 2;
    }

    /* renamed from: a */
    public static void m13097a(long j) {
        f11232a = Long.valueOf(j);
        f11233b = 100L;
        f11234c = 1;
    }

    /* renamed from: b */
    public static Pair<Integer, Long> m13098b() {
        int m13101e = m13101e();
        if (m13101e == 1) {
            return new Pair<>(1, Long.valueOf(m13100d()));
        }
        if (m13101e != 2) {
            return null;
        }
        return new Pair<>(2, Long.valueOf(m13099c()));
    }

    /* renamed from: c */
    private static long m13099c() {
        Long l = f11233b;
        if (l == null) {
            return 100L;
        }
        return l.longValue();
    }

    /* renamed from: d */
    private static long m13100d() {
        Long l = f11232a;
        if (l == null) {
            return Long.MAX_VALUE;
        }
        return l.longValue();
    }

    /* renamed from: e */
    private static int m13101e() {
        Integer num = f11234c;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
