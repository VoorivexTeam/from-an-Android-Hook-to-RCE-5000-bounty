package defpackage;

import android.os.Build;
import android.os.Trace;

/* loaded from: classes.dex */
public final class g1 {
    public static void a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
