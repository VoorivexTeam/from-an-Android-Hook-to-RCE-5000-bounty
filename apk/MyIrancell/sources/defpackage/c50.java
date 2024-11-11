package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Pair;
import ir.tapsell.sdk.networkcacheutils.b;
import ir.tapsell.sdk.networkcacheutils.d;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c50 {
    public static long a() {
        return b.c().a();
    }

    public static long a(long j) {
        long j2;
        Pair<Integer, Long> b = d.b();
        if (b != null) {
            int intValue = ((Integer) b.first).intValue();
            if (intValue == 0) {
                j2 = 100;
            } else if (intValue != 1) {
                j2 = intValue != 2 ? -1L : ((Long) b.second).longValue();
            } else {
                j2 = ((((Long) b.second).longValue() > j ? j : ((Long) b.second).longValue()) * 100) / j;
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

    public static boolean a(Context context) {
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
