package p000;

import p000.f30;

/* loaded from: classes.dex */
final class x20 {

    /* renamed from: a */
    private final int f13978a;

    /* renamed from: b */
    private final byte[] f13979b;

    private x20(int i, byte[] bArr) {
        this.f13978a = i;
        this.f13979b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static x20[] m16414a(byte[] bArr, f30 f30Var, b30 b30Var) {
        if (bArr.length != f30Var.m11681d()) {
            throw new IllegalArgumentException();
        }
        f30.C2457b m11677a = f30Var.m11677a(b30Var);
        f30.C2456a[] m11685a = m11677a.m11685a();
        int i = 0;
        for (f30.C2456a c2456a : m11685a) {
            i += c2456a.m11683a();
        }
        x20[] x20VarArr = new x20[i];
        int i2 = 0;
        for (f30.C2456a c2456a2 : m11685a) {
            int i3 = 0;
            while (i3 < c2456a2.m11683a()) {
                int m11684b = c2456a2.m11684b();
                x20VarArr[i2] = new x20(m11684b, new byte[m11677a.m11686b() + m11684b]);
                i3++;
                i2++;
            }
        }
        int length = x20VarArr[0].f13979b.length;
        int i4 = i - 1;
        while (i4 >= 0 && x20VarArr[i4].f13979b.length != length) {
            i4--;
        }
        int i5 = i4 + 1;
        int m11686b = length - m11677a.m11686b();
        int i6 = 0;
        for (int i7 = 0; i7 < m11686b; i7++) {
            int i8 = 0;
            while (i8 < i2) {
                x20VarArr[i8].f13979b[i7] = bArr[i6];
                i8++;
                i6++;
            }
        }
        int i9 = i5;
        while (i9 < i2) {
            x20VarArr[i9].f13979b[m11686b] = bArr[i6];
            i9++;
            i6++;
        }
        int length2 = x20VarArr[0].f13979b.length;
        while (m11686b < length2) {
            int i10 = 0;
            while (i10 < i2) {
                x20VarArr[i10].f13979b[i10 < i5 ? m11686b : m11686b + 1] = bArr[i6];
                i10++;
                i6++;
            }
            m11686b++;
        }
        return x20VarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m16415a() {
        return this.f13979b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m16416b() {
        return this.f13978a;
    }
}
