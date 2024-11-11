package p000;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: y2 */
/* loaded from: classes.dex */
public class C3460y2 {

    /* renamed from: a */
    private final Object f14095a;

    private C3460y2(Object obj) {
        this.f14095a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m16552a(C3460y2 c3460y2) {
        if (c3460y2 == null) {
            return null;
        }
        return c3460y2.f14095a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3460y2 m16553a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C3460y2(obj);
    }

    /* renamed from: a */
    public int m16554a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f14095a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: a */
    public C3460y2 m16555a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C3460y2(((WindowInsets) this.f14095a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int m16556b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f14095a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int m16557c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f14095a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int m16558d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f14095a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean m16559e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f14095a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3460y2.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f14095a;
        Object obj3 = ((C3460y2) obj).f14095a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f14095a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
