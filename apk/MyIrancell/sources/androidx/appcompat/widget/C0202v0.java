package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: classes.dex */
public class C0202v0 {
    /* renamed from: a */
    public static void m1176a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ViewOnLongClickListenerC0204w0.m1200a(view, charSequence);
        }
    }
}
