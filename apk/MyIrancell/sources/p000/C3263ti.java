package p000;

import java.io.ByteArrayInputStream;

/* renamed from: ti */
/* loaded from: classes.dex */
public class C3263ti {

    /* renamed from: a */
    private int f13310a = 0;

    /* renamed from: c */
    private byte[] f13312c = null;

    /* renamed from: b */
    private int f13311b = 0;

    /* renamed from: d */
    private C3211si f13313d = null;

    /* renamed from: a */
    private C3439xi m15634a(byte[] bArr, int i) {
        String m15635b;
        C3439xi c3439xi = new C3439xi();
        if (i == 64 || i == 65 || i == 66) {
            m15635b = m15635b(bArr, 3);
        } else {
            if (i != 128 && i != 129 && i != 130) {
                if (i != 192 && i != 193 && i != 192) {
                    return null;
                }
                c3439xi.m16495a(m15647l(bArr));
                return c3439xi;
            }
            m15635b = m15648a(m15642g(bArr));
        }
        c3439xi.m16496a(m15635b);
        return c3439xi;
    }

    /* renamed from: b */
    private String m15635b(byte[] bArr, int i) {
        if (i == 131) {
            return m15648a(this.f13310a);
        }
        int i2 = this.f13310a;
        if (i2 >= bArr.length) {
            throw new C3399wi(10);
        }
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2++;
        }
        int i3 = this.f13310a;
        String str = new String(bArr, i3, i2 - i3);
        this.f13310a = i2 + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x002a, code lost:
    
        r5.f13311b = m15647l(r6);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private p000.C3128qi m15636b(byte[] r6) {
        /*
            r5 = this;
            qi r0 = new qi
            int r1 = r5.f13311b
            r0.<init>(r1)
            int r1 = r5.m15647l(r6)
            r2 = 4
            r3 = 128(0x80, float:1.8E-43)
            if (r1 != r2) goto L1c
            int r1 = r5.m15647l(r6)
            java.lang.String r1 = r5.m15648a(r1)
            r0.m15099a(r1)
            goto L2a
        L1c:
            if (r1 != 0) goto L25
        L1e:
            int r1 = r5.m15647l(r6)
            r5.f13311b = r1
            goto L2a
        L25:
            if (r1 >= r3) goto L91
            r0.m15097a(r1)
        L2a:
            int r1 = r5.f13310a
            int r2 = r6.length
            if (r1 >= r2) goto L90
            int r1 = r5.m15647l(r6)
            r2 = 3
            if (r1 == r2) goto L86
            r2 = 131(0x83, float:1.84E-43)
            if (r1 != r2) goto L3b
            goto L86
        L3b:
            r2 = 1
            if (r1 == r3) goto L67
            r4 = 129(0x81, float:1.81E-43)
            if (r1 == r4) goto L67
            r4 = 130(0x82, float:1.82E-43)
            if (r1 == r4) goto L67
            r4 = 192(0xc0, float:2.69E-43)
            if (r1 == r4) goto L67
            r4 = 193(0xc1, float:2.7E-43)
            if (r1 == r4) goto L67
            r4 = 194(0xc2, float:2.72E-43)
            if (r1 != r4) goto L53
            goto L67
        L53:
            r4 = 2
            if (r1 != r4) goto L5b
            java.lang.String r1 = r5.m15641f(r6)
            goto L8a
        L5b:
            if (r1 != 0) goto L5e
            goto L1e
        L5e:
            if (r1 < r3) goto L61
            goto L75
        L61:
            int r6 = r5.f13310a
            int r6 = r6 - r2
            r5.f13310a = r6
            goto L90
        L67:
            xi r1 = r5.m15634a(r6, r1)
            int r4 = r1.m16498c()
            if (r4 != 0) goto L7b
            int r1 = r1.m16497b()
        L75:
            int r2 = r5.f13311b
            r0.m15098a(r1, r2)
            goto L2a
        L7b:
            int r4 = r1.m16498c()
            if (r4 != r2) goto L2a
            java.lang.String r1 = r1.m16494a()
            goto L8a
        L86:
            java.lang.String r1 = r5.m15635b(r6, r1)
        L8a:
            int r2 = r5.f13311b
            r0.m15100a(r1, r2)
            goto L2a
        L90:
            return r0
        L91:
            wi r6 = new wi
            r0 = 11
            r6.<init>(r0)
            goto L9a
        L99:
            throw r6
        L9a:
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3263ti.m15636b(byte[]):qi");
    }

    /* renamed from: c */
    private void m15637c(byte[] bArr) {
        this.f13313d = new C3211si();
        while (this.f13310a < bArr.length) {
            if (m15647l(bArr) == 67) {
                try {
                    this.f13313d.m15436a(m15636b(bArr));
                } catch (C3399wi unused) {
                    throw new C3399wi(8, "Invalid PI value.");
                }
            } else {
                try {
                    this.f13310a--;
                    this.f13313d.m15437a(m15640e(bArr));
                } catch (C3399wi unused2) {
                    throw new C3399wi(9, "Invalid element.");
                }
            }
        }
    }

    /* renamed from: c */
    private byte[] m15638c(byte[] bArr, int i) {
        if (this.f13310a + i > bArr.length) {
            throw new C3399wi(1);
        }
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = bArr[this.f13310a + i2];
        }
        this.f13310a += i;
        return bArr2;
    }

    /* renamed from: d */
    private void m15639d(byte[] bArr) {
        try {
            m15642g(bArr);
        } catch (C3399wi unused) {
            throw new C3399wi(4, "Invalid charset.");
        }
    }

    /* renamed from: e */
    private C3307ui m15640e(byte[] bArr) {
        C3307ui c3307ui;
        C3307ui c3307ui2;
        C3307ui c3307ui3 = new C3307ui(this.f13311b);
        int m15647l = m15647l(bArr);
        int i = m15647l & 63;
        if (i == 4) {
            c3307ui3.m15820c(m15648a(m15647l(bArr)));
        } else if (m15647l == 0) {
            this.f13311b = m15647l(bArr);
        } else {
            c3307ui3.m15823e(i);
        }
        if ((m15647l & 128) != 0) {
            while (m15647l(bArr) != 1) {
                this.f13310a--;
                c3307ui3.m15812a(m15636b(bArr));
            }
        }
        if ((m15647l & 64) != 0) {
            while (true) {
                int m15647l2 = m15647l(bArr);
                if (m15647l2 == 1) {
                    break;
                }
                if (m15647l2 == 3 || m15647l2 == 131) {
                    c3307ui = new C3307ui(this.f13311b);
                    c3307ui.m15817b(m15635b(bArr, m15647l2));
                } else if (m15647l2 == 64 || m15647l2 == 65 || m15647l2 == 66 || m15647l2 == 128 || m15647l2 == 129 || m15647l2 == 130 || m15647l2 == 192 || m15647l2 == 194 || m15647l2 == 194) {
                    c3307ui = new C3307ui(this.f13311b);
                    c3307ui.m15814a(m15634a(bArr, m15647l2));
                } else {
                    if (m15647l2 == 2) {
                        c3307ui2 = new C3307ui(this.f13311b);
                        c3307ui2.m15817b(m15641f(bArr));
                    } else if (m15647l2 == 67) {
                        c3307ui2 = new C3307ui(this.f13311b);
                        c3307ui2.m15818b(m15636b(bArr));
                    } else if (m15647l2 == 195) {
                        int m15647l3 = m15647l(bArr);
                        c3307ui = new C3307ui(this.f13311b);
                        c3307ui.m15815a(m15638c(bArr, m15647l3));
                    } else if (m15647l2 == 0) {
                        this.f13311b = m15647l(bArr);
                    } else {
                        this.f13310a--;
                        c3307ui2 = m15640e(bArr);
                    }
                    c3307ui3.m15813a(c3307ui2);
                }
                c3307ui3.m15813a(c3307ui);
            }
        }
        return c3307ui3;
    }

    /* renamed from: f */
    private String m15641f(byte[] bArr) {
        return Character.toString((char) m15642g(bArr));
    }

    /* renamed from: g */
    private int m15642g(byte[] bArr) {
        if (this.f13310a >= bArr.length) {
            throw new C3399wi(1);
        }
        int m15647l = m15647l(bArr);
        int i = 0;
        while ((m15647l & 128) != 0) {
            i = (i << 7) | (m15647l & 127);
            m15647l = m15647l(bArr);
        }
        return (i << 7) | m15647l;
    }

    /* renamed from: h */
    private void m15643h(byte[] bArr) {
        try {
            if (m15647l(bArr) != 0) {
                this.f13310a--;
            }
            m15642g(bArr);
        } catch (C3399wi unused) {
            throw new C3399wi(3, "Invalid public ID.");
        }
    }

    /* renamed from: i */
    private void m15644i(byte[] bArr) {
        m15646k(bArr);
        m15643h(bArr);
        m15639d(bArr);
        m15645j(bArr);
        m15637c(bArr);
    }

    /* renamed from: j */
    private void m15645j(byte[] bArr) {
        try {
            int m15642g = m15642g(bArr);
            if (m15642g > 0) {
                try {
                    this.f13312c = m15638c(bArr, m15642g);
                } catch (C3399wi unused) {
                    throw new C3399wi(6, "Invalid string table.");
                }
            }
        } catch (C3399wi unused2) {
            throw new C3399wi(5, "Invalid string table length.");
        }
    }

    /* renamed from: k */
    private void m15646k(byte[] bArr) {
        try {
            m15647l(bArr);
        } catch (C3399wi unused) {
            throw new C3399wi(2, "Invalid WBXML version.");
        }
    }

    /* renamed from: l */
    private int m15647l(byte[] bArr) {
        int i = this.f13310a;
        if (i >= bArr.length) {
            throw new C3399wi(1);
        }
        byte b = bArr[i];
        this.f13310a = i + 1;
        return b & 255;
    }

    /* renamed from: a */
    public String m15648a(int i) {
        if (i < 0 || i >= this.f13312c.length) {
            throw new C3399wi(7);
        }
        int i2 = i;
        while (true) {
            byte[] bArr = this.f13312c;
            if (i2 >= bArr.length || bArr[i2] == 0) {
                break;
            }
            i2++;
        }
        return new ByteArrayInputStream(this.f13312c, i, i2 - i).toString();
    }

    /* renamed from: a */
    public C3307ui m15649a() {
        C3211si c3211si = this.f13313d;
        if (c3211si != null) {
            return c3211si.m15435a();
        }
        return null;
    }

    /* renamed from: a */
    public void m15650a(byte[] bArr) {
        m15644i(bArr);
    }
}
