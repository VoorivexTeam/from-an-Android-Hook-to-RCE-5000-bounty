package defpackage;

import defpackage.f30;

/* loaded from: classes.dex */
final class x20 {
    private final int a;
    private final byte[] b;

    private x20(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x20[] a(byte[] bArr, f30 f30Var, b30 b30Var) {
        if (bArr.length != f30Var.d()) {
            throw new IllegalArgumentException();
        }
        f30.b a = f30Var.a(b30Var);
        f30.a[] a2 = a.a();
        int i = 0;
        for (f30.a aVar : a2) {
            i += aVar.a();
        }
        x20[] x20VarArr = new x20[i];
        int i2 = 0;
        for (f30.a aVar2 : a2) {
            int i3 = 0;
            while (i3 < aVar2.a()) {
                int b = aVar2.b();
                x20VarArr[i2] = new x20(b, new byte[a.b() + b]);
                i3++;
                i2++;
            }
        }
        int length = x20VarArr[0].b.length;
        int i4 = i - 1;
        while (i4 >= 0 && x20VarArr[i4].b.length != length) {
            i4--;
        }
        int i5 = i4 + 1;
        int b2 = length - a.b();
        int i6 = 0;
        for (int i7 = 0; i7 < b2; i7++) {
            int i8 = 0;
            while (i8 < i2) {
                x20VarArr[i8].b[i7] = bArr[i6];
                i8++;
                i6++;
            }
        }
        int i9 = i5;
        while (i9 < i2) {
            x20VarArr[i9].b[b2] = bArr[i6];
            i9++;
            i6++;
        }
        int length2 = x20VarArr[0].b.length;
        while (b2 < length2) {
            int i10 = 0;
            while (i10 < i2) {
                x20VarArr[i10].b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                i10++;
                i6++;
            }
            b2++;
        }
        return x20VarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.a;
    }
}
