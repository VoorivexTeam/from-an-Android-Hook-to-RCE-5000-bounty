package defpackage;

import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public class ti {
    private int a = 0;
    private byte[] c = null;
    private int b = 0;
    private si d = null;

    private xi a(byte[] bArr, int i) {
        String b;
        xi xiVar = new xi();
        if (i == 64 || i == 65 || i == 66) {
            b = b(bArr, 3);
        } else {
            if (i != 128 && i != 129 && i != 130) {
                if (i != 192 && i != 193 && i != 192) {
                    return null;
                }
                xiVar.a(l(bArr));
                return xiVar;
            }
            b = a(g(bArr));
        }
        xiVar.a(b);
        return xiVar;
    }

    private String b(byte[] bArr, int i) {
        if (i == 131) {
            return a(this.a);
        }
        int i2 = this.a;
        if (i2 >= bArr.length) {
            throw new wi(10);
        }
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2++;
        }
        int i3 = this.a;
        String str = new String(bArr, i3, i2 - i3);
        this.a = i2 + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x002a, code lost:
    
        r5.b = l(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private defpackage.qi b(byte[] r6) {
        /*
            r5 = this;
            qi r0 = new qi
            int r1 = r5.b
            r0.<init>(r1)
            int r1 = r5.l(r6)
            r2 = 4
            r3 = 128(0x80, float:1.8E-43)
            if (r1 != r2) goto L1c
            int r1 = r5.l(r6)
            java.lang.String r1 = r5.a(r1)
            r0.a(r1)
            goto L2a
        L1c:
            if (r1 != 0) goto L25
        L1e:
            int r1 = r5.l(r6)
            r5.b = r1
            goto L2a
        L25:
            if (r1 >= r3) goto L91
            r0.a(r1)
        L2a:
            int r1 = r5.a
            int r2 = r6.length
            if (r1 >= r2) goto L90
            int r1 = r5.l(r6)
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
            java.lang.String r1 = r5.f(r6)
            goto L8a
        L5b:
            if (r1 != 0) goto L5e
            goto L1e
        L5e:
            if (r1 < r3) goto L61
            goto L75
        L61:
            int r6 = r5.a
            int r6 = r6 - r2
            r5.a = r6
            goto L90
        L67:
            xi r1 = r5.a(r6, r1)
            int r4 = r1.c()
            if (r4 != 0) goto L7b
            int r1 = r1.b()
        L75:
            int r2 = r5.b
            r0.a(r1, r2)
            goto L2a
        L7b:
            int r4 = r1.c()
            if (r4 != r2) goto L2a
            java.lang.String r1 = r1.a()
            goto L8a
        L86:
            java.lang.String r1 = r5.b(r6, r1)
        L8a:
            int r2 = r5.b
            r0.a(r1, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti.b(byte[]):qi");
    }

    private void c(byte[] bArr) {
        this.d = new si();
        while (this.a < bArr.length) {
            if (l(bArr) == 67) {
                try {
                    this.d.a(b(bArr));
                } catch (wi unused) {
                    throw new wi(8, "Invalid PI value.");
                }
            } else {
                try {
                    this.a--;
                    this.d.a(e(bArr));
                } catch (wi unused2) {
                    throw new wi(9, "Invalid element.");
                }
            }
        }
    }

    private byte[] c(byte[] bArr, int i) {
        if (this.a + i > bArr.length) {
            throw new wi(1);
        }
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = bArr[this.a + i2];
        }
        this.a += i;
        return bArr2;
    }

    private void d(byte[] bArr) {
        try {
            g(bArr);
        } catch (wi unused) {
            throw new wi(4, "Invalid charset.");
        }
    }

    private ui e(byte[] bArr) {
        ui uiVar;
        ui uiVar2;
        ui uiVar3 = new ui(this.b);
        int l = l(bArr);
        int i = l & 63;
        if (i == 4) {
            uiVar3.c(a(l(bArr)));
        } else if (l == 0) {
            this.b = l(bArr);
        } else {
            uiVar3.e(i);
        }
        if ((l & 128) != 0) {
            while (l(bArr) != 1) {
                this.a--;
                uiVar3.a(b(bArr));
            }
        }
        if ((l & 64) != 0) {
            while (true) {
                int l2 = l(bArr);
                if (l2 == 1) {
                    break;
                }
                if (l2 == 3 || l2 == 131) {
                    uiVar = new ui(this.b);
                    uiVar.b(b(bArr, l2));
                } else if (l2 == 64 || l2 == 65 || l2 == 66 || l2 == 128 || l2 == 129 || l2 == 130 || l2 == 192 || l2 == 194 || l2 == 194) {
                    uiVar = new ui(this.b);
                    uiVar.a(a(bArr, l2));
                } else {
                    if (l2 == 2) {
                        uiVar2 = new ui(this.b);
                        uiVar2.b(f(bArr));
                    } else if (l2 == 67) {
                        uiVar2 = new ui(this.b);
                        uiVar2.b(b(bArr));
                    } else if (l2 == 195) {
                        int l3 = l(bArr);
                        uiVar = new ui(this.b);
                        uiVar.a(c(bArr, l3));
                    } else if (l2 == 0) {
                        this.b = l(bArr);
                    } else {
                        this.a--;
                        uiVar2 = e(bArr);
                    }
                    uiVar3.a(uiVar2);
                }
                uiVar3.a(uiVar);
            }
        }
        return uiVar3;
    }

    private String f(byte[] bArr) {
        return Character.toString((char) g(bArr));
    }

    private int g(byte[] bArr) {
        if (this.a >= bArr.length) {
            throw new wi(1);
        }
        int l = l(bArr);
        int i = 0;
        while ((l & 128) != 0) {
            i = (i << 7) | (l & 127);
            l = l(bArr);
        }
        return (i << 7) | l;
    }

    private void h(byte[] bArr) {
        try {
            if (l(bArr) != 0) {
                this.a--;
            }
            g(bArr);
        } catch (wi unused) {
            throw new wi(3, "Invalid public ID.");
        }
    }

    private void i(byte[] bArr) {
        k(bArr);
        h(bArr);
        d(bArr);
        j(bArr);
        c(bArr);
    }

    private void j(byte[] bArr) {
        try {
            int g = g(bArr);
            if (g > 0) {
                try {
                    this.c = c(bArr, g);
                } catch (wi unused) {
                    throw new wi(6, "Invalid string table.");
                }
            }
        } catch (wi unused2) {
            throw new wi(5, "Invalid string table length.");
        }
    }

    private void k(byte[] bArr) {
        try {
            l(bArr);
        } catch (wi unused) {
            throw new wi(2, "Invalid WBXML version.");
        }
    }

    private int l(byte[] bArr) {
        int i = this.a;
        if (i >= bArr.length) {
            throw new wi(1);
        }
        byte b = bArr[i];
        this.a = i + 1;
        return b & 255;
    }

    public String a(int i) {
        if (i < 0 || i >= this.c.length) {
            throw new wi(7);
        }
        int i2 = i;
        while (true) {
            byte[] bArr = this.c;
            if (i2 >= bArr.length || bArr[i2] == 0) {
                break;
            }
            i2++;
        }
        return new ByteArrayInputStream(this.c, i, i2 - i).toString();
    }

    public ui a() {
        si siVar = this.d;
        if (siVar != null) {
            return siVar.a();
        }
        return null;
    }

    public void a(byte[] bArr) {
        i(bArr);
    }
}
