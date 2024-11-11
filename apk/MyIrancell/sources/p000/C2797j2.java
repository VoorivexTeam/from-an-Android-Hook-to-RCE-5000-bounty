package p000;

import android.view.View;
import android.view.ViewParent;

/* renamed from: j2 */
/* loaded from: classes.dex */
public class C2797j2 {

    /* renamed from: a */
    private ViewParent f11422a;

    /* renamed from: b */
    private ViewParent f11423b;

    /* renamed from: c */
    private final View f11424c;

    /* renamed from: d */
    private boolean f11425d;

    /* renamed from: e */
    private int[] f11426e;

    public C2797j2(View view) {
        this.f11424c = view;
    }

    /* renamed from: a */
    private void m13329a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f11422a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f11423b = viewParent;
        }
    }

    /* renamed from: d */
    private ViewParent m13330d(int i) {
        if (i == 0) {
            return this.f11422a;
        }
        if (i != 1) {
            return null;
        }
        return this.f11423b;
    }

    /* renamed from: a */
    public void m13331a(boolean z) {
        if (this.f11425d) {
            C3107q2.m14879C(this.f11424c);
        }
        this.f11425d = z;
    }

    /* renamed from: a */
    public boolean m13332a() {
        return m13335a(0);
    }

    /* renamed from: a */
    public boolean m13333a(float f, float f2) {
        ViewParent m13330d;
        if (!m13341b() || (m13330d = m13330d(0)) == null) {
            return false;
        }
        return C3232t2.m15487a(m13330d, this.f11424c, f, f2);
    }

    /* renamed from: a */
    public boolean m13334a(float f, float f2, boolean z) {
        ViewParent m13330d;
        if (!m13341b() || (m13330d = m13330d(0)) == null) {
            return false;
        }
        return C3232t2.m15488a(m13330d, this.f11424c, f, f2, z);
    }

    /* renamed from: a */
    public boolean m13335a(int i) {
        return m13330d(i) != null;
    }

    /* renamed from: a */
    public boolean m13336a(int i, int i2) {
        if (m13335a(i2)) {
            return true;
        }
        if (!m13341b()) {
            return false;
        }
        View view = this.f11424c;
        for (ViewParent parent = this.f11424c.getParent(); parent != null; parent = parent.getParent()) {
            if (C3232t2.m15489b(parent, view, this.f11424c, i, i2)) {
                m13329a(i2, parent);
                C3232t2.m15486a(parent, view, this.f11424c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m13337a(int i, int i2, int i3, int i4, int[] iArr) {
        return m13338a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean m13338a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent m13330d;
        int i6;
        int i7;
        if (!m13341b() || (m13330d = m13330d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f11424c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        C3232t2.m15484a(m13330d, this.f11424c, i, i2, i3, i4, i5);
        if (iArr != null) {
            this.f11424c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m13339a(int i, int i2, int[] iArr, int[] iArr2) {
        return m13340a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean m13340a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m13330d;
        int i4;
        int i5;
        if (!m13341b() || (m13330d = m13330d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f11424c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f11426e == null) {
                this.f11426e = new int[2];
            }
            iArr = this.f11426e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C3232t2.m15485a(m13330d, this.f11424c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f11424c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m13341b() {
        return this.f11425d;
    }

    /* renamed from: b */
    public boolean m13342b(int i) {
        return m13336a(i, 0);
    }

    /* renamed from: c */
    public void m13343c() {
        m13344c(0);
    }

    /* renamed from: c */
    public void m13344c(int i) {
        ViewParent m13330d = m13330d(i);
        if (m13330d != null) {
            C3232t2.m15483a(m13330d, this.f11424c, i);
            m13329a(i, (ViewParent) null);
        }
    }
}
