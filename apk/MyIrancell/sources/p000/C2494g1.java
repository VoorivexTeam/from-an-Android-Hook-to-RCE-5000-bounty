package p000;

import android.os.Build;
import android.os.Trace;

/* renamed from: g1 */
/* loaded from: classes.dex */
public final class C2494g1 {
    /* renamed from: a */
    public static void m11863a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m11864a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
