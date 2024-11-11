package p000;

/* loaded from: classes.dex */
public final class q20 {

    /* renamed from: a */
    private final r20 f12672a = r20.f12861f;

    /* renamed from: a */
    private int[] m14943a(s20 s20Var) {
        int m15322a = s20Var.m15322a();
        int[] iArr = new int[m15322a];
        int i = 0;
        for (int i2 = 1; i2 < this.f12672a.m15177b() && i < m15322a; i2++) {
            if (s20Var.m15323a(i2) == 0) {
                iArr[i] = this.f12672a.m15178b(i2);
                i++;
            }
        }
        if (i == m15322a) {
            return iArr;
        }
        throw C3373vv.m16057a();
    }

    /* renamed from: a */
    private int[] m14944a(s20 s20Var, s20 s20Var2, int[] iArr) {
        int m15322a = s20Var2.m15322a();
        int[] iArr2 = new int[m15322a];
        for (int i = 1; i <= m15322a; i++) {
            iArr2[m15322a - i] = this.f12672a.m15181c(i, s20Var2.m15326b(i));
        }
        s20 s20Var3 = new s20(this.f12672a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m15178b = this.f12672a.m15178b(iArr[i2]);
            iArr3[i2] = this.f12672a.m15181c(this.f12672a.m15183d(0, s20Var.m15323a(m15178b)), this.f12672a.m15178b(s20Var3.m15323a(m15178b)));
        }
        return iArr3;
    }

    /* renamed from: a */
    private s20[] m14945a(s20 s20Var, s20 s20Var2, int i) {
        if (s20Var.m15322a() < s20Var2.m15322a()) {
            s20Var2 = s20Var;
            s20Var = s20Var2;
        }
        s20 m15182c = this.f12672a.m15182c();
        s20 m15176a = this.f12672a.m15176a();
        while (true) {
            s20 s20Var3 = s20Var2;
            s20Var2 = s20Var;
            s20Var = s20Var3;
            s20 s20Var4 = m15176a;
            s20 s20Var5 = m15182c;
            m15182c = s20Var4;
            if (s20Var.m15322a() < i / 2) {
                int m15326b = m15182c.m15326b(0);
                if (m15326b == 0) {
                    throw C3373vv.m16057a();
                }
                int m15178b = this.f12672a.m15178b(m15326b);
                return new s20[]{m15182c.m15330c(m15178b), s20Var.m15330c(m15178b)};
            }
            if (s20Var.m15328b()) {
                throw C3373vv.m16057a();
            }
            s20 m15182c2 = this.f12672a.m15182c();
            int m15178b2 = this.f12672a.m15178b(s20Var.m15326b(s20Var.m15322a()));
            while (s20Var2.m15322a() >= s20Var.m15322a() && !s20Var2.m15328b()) {
                int m15322a = s20Var2.m15322a() - s20Var.m15322a();
                int m15181c = this.f12672a.m15181c(s20Var2.m15326b(s20Var2.m15322a()), m15178b2);
                m15182c2 = m15182c2.m15325a(this.f12672a.m15179b(m15322a, m15181c));
                s20Var2 = s20Var2.m15331c(s20Var.m15324a(m15322a, m15181c));
            }
            m15176a = m15182c2.m15327b(m15182c).m15331c(s20Var5).m15329c();
        }
    }

    /* renamed from: a */
    public int m14946a(int[] iArr, int i, int[] iArr2) {
        s20 s20Var = new s20(this.f12672a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int m15323a = s20Var.m15323a(this.f12672a.m15174a(i2));
            iArr3[i - i2] = m15323a;
            if (m15323a != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        s20 m15176a = this.f12672a.m15176a();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int m15174a = this.f12672a.m15174a((iArr.length - 1) - i3);
                r20 r20Var = this.f12672a;
                m15176a = m15176a.m15327b(new s20(r20Var, new int[]{r20Var.m15183d(0, m15174a), 1}));
            }
        }
        s20[] m14945a = m14945a(this.f12672a.m15179b(i, 1), new s20(this.f12672a, iArr3), i);
        s20 s20Var2 = m14945a[0];
        s20 s20Var3 = m14945a[1];
        int[] m14943a = m14943a(s20Var2);
        int[] m14944a = m14944a(s20Var3, s20Var2, m14943a);
        for (int i4 = 0; i4 < m14943a.length; i4++) {
            int length = (iArr.length - 1) - this.f12672a.m15180c(m14943a[i4]);
            if (length < 0) {
                throw C3373vv.m16057a();
            }
            iArr[length] = this.f12672a.m15183d(iArr[length], m14944a[i4]);
        }
        return m14943a.length;
    }
}
