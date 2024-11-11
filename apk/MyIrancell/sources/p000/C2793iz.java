package p000;

/* renamed from: iz */
/* loaded from: classes.dex */
public final class C2793iz {

    /* renamed from: a */
    private final byte[] f11372a;

    /* renamed from: b */
    private int f11373b;

    /* renamed from: c */
    private int f11374c;

    public C2793iz(byte[] bArr) {
        this.f11372a = bArr;
    }

    /* renamed from: a */
    public int m13268a() {
        return ((this.f11372a.length - this.f11373b) * 8) - this.f11374c;
    }

    /* renamed from: a */
    public int m13269a(int i) {
        if (i < 1 || i > 32 || i > m13268a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f11374c;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int i5 = i < i4 ? i : i4;
            int i6 = i4 - i5;
            byte[] bArr = this.f11372a;
            int i7 = this.f11373b;
            int i8 = (((255 >> (8 - i5)) << i6) & bArr[i7]) >> i6;
            i -= i5;
            int i9 = this.f11374c + i5;
            this.f11374c = i9;
            if (i9 == 8) {
                this.f11374c = 0;
                this.f11373b = i7 + 1;
            }
            i3 = i8;
        }
        if (i <= 0) {
            return i3;
        }
        while (i >= 8) {
            int i10 = i3 << 8;
            byte[] bArr2 = this.f11372a;
            int i11 = this.f11373b;
            i3 = (bArr2[i11] & 255) | i10;
            this.f11373b = i11 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i3;
        }
        int i12 = 8 - i;
        int i13 = (i3 << i) | ((((255 >> i12) << i12) & this.f11372a[this.f11373b]) >> i12);
        this.f11374c += i;
        return i13;
    }

    /* renamed from: b */
    public int m13270b() {
        return this.f11374c;
    }

    /* renamed from: c */
    public int m13271c() {
        return this.f11373b;
    }
}
