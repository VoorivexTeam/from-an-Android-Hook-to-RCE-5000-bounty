package p000;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
/* renamed from: p3 */
/* loaded from: classes.dex */
public abstract class AbstractC3069p3 extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f12552a = new SparseArray<>();

    /* renamed from: b */
    private static int f12553b = 1;

    /* renamed from: a */
    public static boolean m14708a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f12552a) {
            PowerManager.WakeLock wakeLock = f12552a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f12552a.remove(intExtra);
                return true;
            }
            String str = "No active wake lock id #" + intExtra;
            return true;
        }
    }

    /* renamed from: b */
    public static ComponentName m14709b(Context context, Intent intent) {
        synchronized (f12552a) {
            int i = f12553b;
            int i2 = f12553b + 1;
            f12553b = i2;
            if (i2 <= 0) {
                f12553b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            f12552a.put(i, newWakeLock);
            return startService;
        }
    }
}
