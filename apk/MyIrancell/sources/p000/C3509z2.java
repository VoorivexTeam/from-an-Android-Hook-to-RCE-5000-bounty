package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: z2 */
/* loaded from: classes.dex */
public final class C3509z2 {
    /* renamed from: a */
    public static int m16708a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m16709a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
