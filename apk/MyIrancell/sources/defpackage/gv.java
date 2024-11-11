package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
class gv {
    private static gv b;
    private final SharedPreferences a;

    private gv(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized gv a(Context context) {
        gv gvVar;
        synchronized (gv.class) {
            if (b == null) {
                b = new gv(context);
            }
            gvVar = b;
        }
        return gvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(long j) {
        return a("fire-global", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(String str, long j) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j).apply();
            return true;
        }
        if (j - this.a.getLong(str, -1L) < 86400000) {
            return false;
        }
        this.a.edit().putLong(str, j).apply();
        return true;
    }
}
