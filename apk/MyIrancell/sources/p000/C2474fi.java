package p000;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: fi */
/* loaded from: classes.dex */
public final class C2474fi {

    /* renamed from: a */
    private static final double f10125a;

    static {
        f10125a = Build.VERSION.SDK_INT >= 17 ? 1.0d / Math.pow(10.0d, 6.0d) : 1.0d;
    }

    /* renamed from: a */
    public static double m11767a(long j) {
        double m11768a = m11768a() - j;
        double d = f10125a;
        Double.isNaN(m11768a);
        return m11768a * d;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m11768a() {
        return Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}
