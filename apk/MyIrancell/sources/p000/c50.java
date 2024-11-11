package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Pair;
import ir.tapsell.sdk.networkcacheutils.C2748b;
import ir.tapsell.sdk.networkcacheutils.C2750d;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c50 {
    /* renamed from: a */
    public static long m3592a() {
        return C2748b.m13089c().m13090a();
    }

    /* renamed from: a */
    public static long m3593a(long j) {
        long j2;
        Pair<Integer, Long> m13098b = C2750d.m13098b();
        if (m13098b != null) {
            int intValue = ((Integer) m13098b.first).intValue();
            if (intValue == 0) {
                j2 = 100;
            } else if (intValue != 1) {
                j2 = intValue != 2 ? -1L : ((Long) m13098b.second).longValue();
            } else {
                j2 = ((((Long) m13098b.second).longValue() > j ? j : ((Long) m13098b.second).longValue()) * 100) / j;
            }
            if (j2 < 10) {
                return 10L;
            }
            if (j2 <= 100) {
                return j2;
            }
        }
        return 100L;
    }

    /* renamed from: a */
    public static boolean m3594a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
