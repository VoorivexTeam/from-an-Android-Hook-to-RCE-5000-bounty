package ir.tapsell.sdk.networkcacheutils;

import android.util.Pair;

/* loaded from: classes.dex */
public class d {
    private static Long a;
    private static Long b;
    private static Integer c;

    public static void a() {
        a = Long.MAX_VALUE;
        b = 100L;
        c = 0;
    }

    public static void a(int i) {
        long j = i;
        if (j < 10) {
            j = 10;
        } else if (j > 100) {
            j = 100;
        }
        a = Long.MAX_VALUE;
        b = Long.valueOf(j);
        c = 2;
    }

    public static void a(long j) {
        a = Long.valueOf(j);
        b = 100L;
        c = 1;
    }

    public static Pair<Integer, Long> b() {
        int e = e();
        if (e == 1) {
            return new Pair<>(1, Long.valueOf(d()));
        }
        if (e != 2) {
            return null;
        }
        return new Pair<>(2, Long.valueOf(c()));
    }

    private static long c() {
        Long l = b;
        if (l == null) {
            return 100L;
        }
        return l.longValue();
    }

    private static long d() {
        Long l = a;
        if (l == null) {
            return Long.MAX_VALUE;
        }
        return l.longValue();
    }

    private static int e() {
        Integer num = c;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
