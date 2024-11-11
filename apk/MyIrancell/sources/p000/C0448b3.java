package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: b3 */
/* loaded from: classes.dex */
public class C0448b3 {

    /* renamed from: a */
    private final AccessibilityNodeInfo f2709a;

    /* renamed from: b3$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Object f2710a;

        a(Object obj) {
            this.f2710a = obj;
        }

        /* renamed from: a */
        public static a m3310a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new a(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new a(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new a(null);
        }
    }

    /* renamed from: b3$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final Object f2711a;

        b(Object obj) {
            this.f2711a = obj;
        }

        /* renamed from: a */
        public static b m3311a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new b(null);
        }
    }

    private C0448b3(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2709a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0448b3 m3275a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0448b3(accessibilityNodeInfo);
    }

    /* renamed from: a */
    private void m3276a(int i, boolean z) {
        Bundle m3292d = m3292d();
        if (m3292d != null) {
            int i2 = m3292d.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            m3292d.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: b */
    private static String m3277b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public int m3278a() {
        return this.f2709a.getActions();
    }

    /* renamed from: a */
    public void m3279a(int i) {
        this.f2709a.addAction(i);
    }

    /* renamed from: a */
    public void m3280a(Rect rect) {
        this.f2709a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void m3281a(CharSequence charSequence) {
        this.f2709a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void m3282a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2709a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((a) obj).f2710a);
        }
    }

    /* renamed from: a */
    public void m3283a(boolean z) {
        this.f2709a.setCheckable(z);
    }

    /* renamed from: b */
    public CharSequence m3284b() {
        return this.f2709a.getClassName();
    }

    /* renamed from: b */
    public void m3285b(Rect rect) {
        this.f2709a.getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public void m3286b(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2709a.setError(charSequence);
        }
    }

    /* renamed from: b */
    public void m3287b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2709a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((b) obj).f2711a);
        }
    }

    /* renamed from: b */
    public void m3288b(boolean z) {
        this.f2709a.setChecked(z);
    }

    /* renamed from: c */
    public CharSequence m3289c() {
        return this.f2709a.getContentDescription();
    }

    /* renamed from: c */
    public void m3290c(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f2709a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f2709a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: c */
    public void m3291c(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2709a.setContentInvalid(z);
        }
    }

    /* renamed from: d */
    public Bundle m3292d() {
        return Build.VERSION.SDK_INT >= 19 ? this.f2709a.getExtras() : new Bundle();
    }

    /* renamed from: d */
    public void m3293d(CharSequence charSequence) {
        this.f2709a.setText(charSequence);
    }

    /* renamed from: d */
    public void m3294d(boolean z) {
        this.f2709a.setScrollable(z);
    }

    /* renamed from: e */
    public CharSequence m3295e() {
        return this.f2709a.getPackageName();
    }

    /* renamed from: e */
    public void m3296e(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2709a.setShowingHintText(z);
        } else {
            m3276a(4, z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0448b3.class != obj.getClass()) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2709a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((C0448b3) obj).f2709a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public CharSequence m3297f() {
        return this.f2709a.getText();
    }

    /* renamed from: g */
    public String m3298g() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2709a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: h */
    public boolean m3299h() {
        return this.f2709a.isCheckable();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2709a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public boolean m3300i() {
        return this.f2709a.isChecked();
    }

    /* renamed from: j */
    public boolean m3301j() {
        return this.f2709a.isClickable();
    }

    /* renamed from: k */
    public boolean m3302k() {
        return this.f2709a.isEnabled();
    }

    /* renamed from: l */
    public boolean m3303l() {
        return this.f2709a.isFocusable();
    }

    /* renamed from: m */
    public boolean m3304m() {
        return this.f2709a.isFocused();
    }

    /* renamed from: n */
    public boolean m3305n() {
        return this.f2709a.isLongClickable();
    }

    /* renamed from: o */
    public boolean m3306o() {
        return this.f2709a.isPassword();
    }

    /* renamed from: p */
    public boolean m3307p() {
        return this.f2709a.isScrollable();
    }

    /* renamed from: q */
    public boolean m3308q() {
        return this.f2709a.isSelected();
    }

    /* renamed from: r */
    public AccessibilityNodeInfo m3309r() {
        return this.f2709a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m3280a(rect);
        sb.append("; boundsInParent: " + rect);
        m3285b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m3295e());
        sb.append("; className: ");
        sb.append(m3284b());
        sb.append("; text: ");
        sb.append(m3297f());
        sb.append("; contentDescription: ");
        sb.append(m3289c());
        sb.append("; viewId: ");
        sb.append(m3298g());
        sb.append("; checkable: ");
        sb.append(m3299h());
        sb.append("; checked: ");
        sb.append(m3300i());
        sb.append("; focusable: ");
        sb.append(m3303l());
        sb.append("; focused: ");
        sb.append(m3304m());
        sb.append("; selected: ");
        sb.append(m3308q());
        sb.append("; clickable: ");
        sb.append(m3301j());
        sb.append("; longClickable: ");
        sb.append(m3305n());
        sb.append("; enabled: ");
        sb.append(m3302k());
        sb.append("; password: ");
        sb.append(m3306o());
        sb.append("; scrollable: " + m3307p());
        sb.append("; [");
        int m3278a = m3278a();
        while (m3278a != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m3278a);
            m3278a &= numberOfTrailingZeros ^ (-1);
            sb.append(m3277b(numberOfTrailingZeros));
            if (m3278a != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
