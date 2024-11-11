package p000;

/* renamed from: wz */
/* loaded from: classes.dex */
public final class C3416wz {

    /* renamed from: a */
    private final C3324uz f13971a;

    public C3416wz(C3324uz c3324uz) {
        this.f13971a = c3324uz;
    }

    /* renamed from: a */
    private int[] m16402a(C3377vz c3377vz) {
        int m16061a = c3377vz.m16061a();
        int i = 0;
        if (m16061a == 1) {
            return new int[]{c3377vz.m16065b(1)};
        }
        int[] iArr = new int[m16061a];
        for (int i2 = 1; i2 < this.f13971a.m15882c() && i < m16061a; i2++) {
            if (c3377vz.m16062a(i2) == 0) {
                iArr[i] = this.f13971a.m15879b(i2);
                i++;
            }
        }
        if (i == m16061a) {
            return iArr;
        }
        throw new C3456xz("Error locator degree does not match number of roots");
    }

    /* renamed from: a */
    private int[] m16403a(C3377vz c3377vz, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int m15879b = this.f13971a.m15879b(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int m15880b = this.f13971a.m15880b(iArr[i3], m15879b);
                    i2 = this.f13971a.m15880b(i2, (m15880b & 1) == 0 ? m15880b | 1 : m15880b & (-2));
                }
            }
            iArr2[i] = this.f13971a.m15880b(c3377vz.m16062a(m15879b), this.f13971a.m15879b(i2));
            if (this.f13971a.m15876a() != 0) {
                iArr2[i] = this.f13971a.m15880b(iArr2[i], m15879b);
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private C3377vz[] m16404a(C3377vz c3377vz, C3377vz c3377vz2, int i) {
        if (c3377vz.m16061a() < c3377vz2.m16061a()) {
            c3377vz2 = c3377vz;
            c3377vz = c3377vz2;
        }
        C3377vz m15884d = this.f13971a.m15884d();
        C3377vz m15881b = this.f13971a.m15881b();
        do {
            C3377vz c3377vz3 = c3377vz2;
            c3377vz2 = c3377vz;
            c3377vz = c3377vz3;
            C3377vz c3377vz4 = m15881b;
            C3377vz c3377vz5 = m15884d;
            m15884d = c3377vz4;
            if (c3377vz.m16061a() < i / 2) {
                int m16065b = m15884d.m16065b(0);
                if (m16065b == 0) {
                    throw new C3456xz("sigmaTilde(0) was zero");
                }
                int m15879b = this.f13971a.m15879b(m16065b);
                return new C3377vz[]{m15884d.m16068c(m15879b), c3377vz.m16068c(m15879b)};
            }
            if (c3377vz.m16067b()) {
                throw new C3456xz("r_{i-1} was zero");
            }
            C3377vz m15884d2 = this.f13971a.m15884d();
            int m15879b2 = this.f13971a.m15879b(c3377vz.m16065b(c3377vz.m16061a()));
            while (c3377vz2.m16061a() >= c3377vz.m16061a() && !c3377vz2.m16067b()) {
                int m16061a = c3377vz2.m16061a() - c3377vz.m16061a();
                int m15880b = this.f13971a.m15880b(c3377vz2.m16065b(c3377vz2.m16061a()), m15879b2);
                m15884d2 = m15884d2.m16064a(this.f13971a.m15878a(m16061a, m15880b));
                c3377vz2 = c3377vz2.m16064a(c3377vz.m16063a(m16061a, m15880b));
            }
            m15881b = m15884d2.m16066b(m15884d).m16064a(c3377vz5);
        } while (c3377vz2.m16061a() < c3377vz.m16061a());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void m16405a(int[] iArr, int i) {
        C3377vz c3377vz = new C3377vz(this.f13971a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C3324uz c3324uz = this.f13971a;
            int m16062a = c3377vz.m16062a(c3324uz.m15877a(c3324uz.m15876a() + i2));
            iArr2[(i - 1) - i2] = m16062a;
            if (m16062a != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        C3377vz[] m16404a = m16404a(this.f13971a.m15878a(i, 1), new C3377vz(this.f13971a, iArr2), i);
        C3377vz c3377vz2 = m16404a[0];
        C3377vz c3377vz3 = m16404a[1];
        int[] m16402a = m16402a(c3377vz2);
        int[] m16403a = m16403a(c3377vz3, m16402a);
        for (int i3 = 0; i3 < m16402a.length; i3++) {
            int length = (iArr.length - 1) - this.f13971a.m15883c(m16402a[i3]);
            if (length < 0) {
                throw new C3456xz("Bad error location");
            }
            iArr[length] = C3324uz.m15875c(iArr[length], m16403a[i3]);
        }
    }
}
