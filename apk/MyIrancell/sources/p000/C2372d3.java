package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: d3 */
/* loaded from: classes.dex */
public class C2372d3 {
    /* renamed from: a */
    public static void m11253a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m11254b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }
}
