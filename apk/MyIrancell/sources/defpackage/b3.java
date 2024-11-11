package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class b3 {
    private final AccessibilityNodeInfo a;

    /* loaded from: classes.dex */
    public static class a {
        final Object a;

        a(Object obj) {
            this.a = obj;
        }

        public static a a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new a(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new a(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new a(null);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public static b a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new b(null);
        }
    }

    private b3(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static b3 a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new b3(accessibilityNodeInfo);
    }

    private void a(int i, boolean z) {
        Bundle d = d();
        if (d != null) {
            int i2 = d.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            d.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private static String b(int i) {
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

    public int a() {
        return this.a.getActions();
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void a(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((a) obj).a);
        }
    }

    public void a(boolean z) {
        this.a.setCheckable(z);
    }

    public CharSequence b() {
        return this.a.getClassName();
    }

    public void b(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void b(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setError(charSequence);
        }
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((b) obj).a);
        }
    }

    public void b(boolean z) {
        this.a.setChecked(z);
    }

    public CharSequence c() {
        return this.a.getContentDescription();
    }

    public void c(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a.setHintText(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void c(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setContentInvalid(z);
        }
    }

    public Bundle d() {
        return Build.VERSION.SDK_INT >= 19 ? this.a.getExtras() : new Bundle();
    }

    public void d(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void d(boolean z) {
        this.a.setScrollable(z);
    }

    public CharSequence e() {
        return this.a.getPackageName();
    }

    public void e(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
        } else {
            a(4, z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b3.class != obj.getClass()) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((b3) obj).a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return true;
    }

    public CharSequence f() {
        return this.a.getText();
    }

    public String g() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }

    public boolean h() {
        return this.a.isCheckable();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean i() {
        return this.a.isChecked();
    }

    public boolean j() {
        return this.a.isClickable();
    }

    public boolean k() {
        return this.a.isEnabled();
    }

    public boolean l() {
        return this.a.isFocusable();
    }

    public boolean m() {
        return this.a.isFocused();
    }

    public boolean n() {
        return this.a.isLongClickable();
    }

    public boolean o() {
        return this.a.isPassword();
    }

    public boolean p() {
        return this.a.isScrollable();
    }

    public boolean q() {
        return this.a.isSelected();
    }

    public AccessibilityNodeInfo r() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(e());
        sb.append("; className: ");
        sb.append(b());
        sb.append("; text: ");
        sb.append(f());
        sb.append("; contentDescription: ");
        sb.append(c());
        sb.append("; viewId: ");
        sb.append(g());
        sb.append("; checkable: ");
        sb.append(h());
        sb.append("; checked: ");
        sb.append(i());
        sb.append("; focusable: ");
        sb.append(l());
        sb.append("; focused: ");
        sb.append(m());
        sb.append("; selected: ");
        sb.append(q());
        sb.append("; clickable: ");
        sb.append(j());
        sb.append("; longClickable: ");
        sb.append(n());
        sb.append("; enabled: ");
        sb.append(k());
        sb.append("; password: ");
        sb.append(o());
        sb.append("; scrollable: " + p());
        sb.append("; [");
        int a2 = a();
        while (a2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a2);
            a2 &= numberOfTrailingZeros ^ (-1);
            sb.append(b(numberOfTrailingZeros));
            if (a2 != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
