package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class w {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new u(viewGroup) : t.a(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            y.a(viewGroup, z);
        } else {
            x.a(viewGroup, z);
        }
    }
}
