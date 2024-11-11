package p000;

import p000.d00;

/* loaded from: classes.dex */
final class a00 {

    /* renamed from: a */
    private final int f16a;

    /* renamed from: b */
    private final byte[] f17b;

    private a00(int i, byte[] bArr) {
        this.f16a = i;
        this.f17b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static a00[] m16a(byte[] bArr, d00 d00Var) {
        d00.C2369c m11234c = d00Var.m11234c();
        d00.C2368b[] m11241a = m11234c.m11241a();
        int i = 0;
        for (d00.C2368b c2368b : m11241a) {
            i += c2368b.m11239a();
        }
        a00[] a00VarArr = new a00[i];
        int i2 = 0;
        for (d00.C2368b c2368b2 : m11241a) {
            int i3 = 0;
            while (i3 < c2368b2.m11239a()) {
                int m11240b = c2368b2.m11240b();
                a00VarArr[i2] = new a00(m11240b, new byte[m11234c.m11242b() + m11240b]);
                i3++;
                i2++;
            }
        }
        int length = a00VarArr[0].f17b.length - m11234c.m11242b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                a00VarArr[i7].f17b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = d00Var.m11238g() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            a00VarArr[i9].f17b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = a00VarArr[0].f17b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                a00VarArr[i11].f17b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
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
    /* renamed from: a */
    public byte[] m17a() {
        return this.f17b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m18b() {
        return this.f16a;
    }
}
