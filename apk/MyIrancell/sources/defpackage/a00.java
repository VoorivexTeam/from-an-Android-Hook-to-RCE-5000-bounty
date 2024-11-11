package defpackage;

import defpackage.d00;

/* loaded from: classes.dex */
final class a00 {
    private final int a;
    private final byte[] b;

    private a00(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a00[] a(byte[] bArr, d00 d00Var) {
        d00.c c = d00Var.c();
        d00.b[] a = c.a();
        int i = 0;
        for (d00.b bVar : a) {
            i += bVar.a();
        }
        a00[] a00VarArr = new a00[i];
        int i2 = 0;
        for (d00.b bVar2 : a) {
            int i3 = 0;
            while (i3 < bVar2.a()) {
                int b = bVar2.b();
                a00VarArr[i2] = new a00(b, new byte[c.b() + b]);
                i3++;
                i2++;
            }
        }
        int length = a00VarArr[0].b.length - c.b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                a00VarArr[i7].b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = d00Var.g() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            a00VarArr[i9].b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = a00VarArr[0].b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                a00VarArr[i11].b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return a00VarArr;
        }
        throw new IllegalArgumentException();
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
