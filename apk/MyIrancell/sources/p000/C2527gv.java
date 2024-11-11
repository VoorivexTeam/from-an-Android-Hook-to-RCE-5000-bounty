package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gv */
/* loaded from: classes.dex */
class C2527gv {

    /* renamed from: b */
    private static C2527gv f10341b;

    /* renamed from: a */
    private final SharedPreferences f10342a;

    private C2527gv(Context context) {
        this.f10342a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C2527gv m12040a(Context context) {
        C2527gv c2527gv;
        synchronized (C2527gv.class) {
            if (f10341b == null) {
                f10341b = new C2527gv(context);
            }
            c2527gv = f10341b;
        }
        return c2527gv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m12041a(long j) {
        return m12042a("fire-global", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m12042a(String str, long j) {
        if (!this.f10342a.contains(str)) {
            this.f10342a.edit().putLong(str, j).apply();
            return true;
        }
        if (j - this.f10342a.getLong(str, -1L) < 86400000) {
            return false;
        }
        this.f10342a.edit().putLong(str, j).apply();
        return true;
    }
}
