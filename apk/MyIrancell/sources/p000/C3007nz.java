package p000;

/* renamed from: nz */
/* loaded from: classes.dex */
public class C3007nz extends AbstractC3276tv {

    /* renamed from: d */
    private static final byte[] f12371d = new byte[0];

    /* renamed from: b */
    private byte[] f12372b;

    /* renamed from: c */
    private final int[] f12373c;

    public C3007nz(AbstractC3501yv abstractC3501yv) {
        super(abstractC3501yv);
        this.f12372b = f12371d;
        this.f12373c = new int[32];
    }

    /* renamed from: a */
    private static int m14400a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 <= length / 16) {
            throw C0438aw.m3194a();
        }
        int i11 = i3 - 1;
        int i12 = i11;
        int i13 = -1;
        while (i11 > i5) {
            int i14 = i11 - i5;
            int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
            if (i15 > i13) {
                i12 = i11;
                i13 = i15;
            }
            i11--;
        }
        return i12 << 3;
    }

    /* renamed from: a */
    private void m14401a(int i) {
        if (this.f12372b.length < i) {
            this.f12372b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f12373c[i2] = 0;
        }
    }

    @Override // p000.AbstractC3276tv
    /* renamed from: a */
    public C2531gz mo14402a(int i, C2531gz c2531gz) {
        AbstractC3501yv m15693c = m15693c();
        int m16666c = m15693c.m16666c();
        if (c2531gz == null || c2531gz.m12052c() < m16666c) {
            c2531gz = new C2531gz(m16666c);
        } else {
            c2531gz.m12046a();
        }
        m14401a(m16666c);
        byte[] mo3447a = m15693c.mo3447a(i, this.f12372b);
        int[] iArr = this.f12373c;
        for (int i2 = 0; i2 < m16666c; i2++) {
            int i3 = (mo3447a[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int m14400a = m14400a(iArr);
        int i4 = 1;
        int i5 = mo3447a[0] & 255;
        int i6 = mo3447a[1] & 255;
        while (i4 < m16666c - 1) {
            int i7 = i4 + 1;
            int i8 = mo3447a[i7] & 255;
            if ((((i6 * 4) - i5) - i8) / 2 < m14400a) {
                c2531gz.m12054d(i4);
            }
            i5 = i6;
            i4 = i7;
            i6 = i8;
        }
        return c2531gz;
    }

    @Override // p000.AbstractC3276tv
    /* renamed from: a */
    public C2571hz mo14403a() {
        AbstractC3501yv m15693c = m15693c();
        int m16666c = m15693c.m16666c();
        int m16665a = m15693c.m16665a();
        C2571hz c2571hz = new C2571hz(m16666c, m16665a);
        m14401a(m16666c);
        int[] iArr = this.f12373c;
        for (int i = 1; i < 5; i++) {
            byte[] mo3447a = m15693c.mo3447a((m16665a * i) / 5, this.f12372b);
            int i2 = (m16666c * 4) / 5;
            for (int i3 = m16666c / 5; i3 < i2; i3++) {
                int i4 = (mo3447a[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int m14400a = m14400a(iArr);
        byte[] mo3448b = m15693c.mo3448b();
        for (int i5 = 0; i5 < m16665a; i5++) {
            int i6 = i5 * m16666c;
            for (int i7 = 0; i7 < m16666c; i7++) {
                if ((mo3448b[i6 + i7] & 255) < m14400a) {
                    c2571hz.m12298c(i7, i5);
                }
            }
        }
        return c2571hz;
    }
}
