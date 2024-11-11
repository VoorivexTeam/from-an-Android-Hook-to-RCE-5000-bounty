package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class v3 extends e3 {
    private static final Logger b = Logger.getLogger(v3.class.getName());
    private static final boolean c = o7.a();
    x3 a;

    /* loaded from: classes.dex */
    static class a extends v3 {
        private final byte[] d;
        private final int e;
        private int f;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.d = bArr;
            this.f = 0;
            this.e = i3;
        }

        private final void c(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final int a() {
            return this.e - this.f;
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(byte b) {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(int i, h3 h3Var) {
            a(i, 2);
            a(h3Var);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(int i, x5 x5Var) {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(x5Var);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        final void a(int i, x5 x5Var, q6 q6Var) {
            a(i, 2);
            x2 x2Var = (x2) x5Var;
            int f = x2Var.f();
            if (f == -1) {
                f = q6Var.d(x2Var);
                x2Var.a(f);
            }
            b(f);
            q6Var.a((q6) x5Var, (b8) this.a);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(long j) {
            if (v3.c && a() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int i = this.f;
                    this.f = i + 1;
                    o7.a(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                o7.a(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int i4 = this.f;
            this.f = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(h3 h3Var) {
            b(h3Var.zza());
            h3Var.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(x5 x5Var) {
            b(x5Var.c());
            x5Var.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void a(String str) {
            int i = this.f;
            try {
                int g = v3.g(str.length() * 3);
                int g2 = v3.g(str.length());
                if (g2 != g) {
                    b(q7.a(str));
                    this.f = q7.a(str, this.d, this.f, a());
                    return;
                }
                int i2 = i + g2;
                this.f = i2;
                int a = q7.a(str, this.d, i2, a());
                this.f = i;
                b((a - i) - g2);
                this.f = a;
            } catch (u7 e) {
                this.f = i;
                a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.e3
        public final void a(byte[] bArr, int i, int i2) {
            c(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void b(int i) {
            if (!v3.c || a3.a() || a() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.d;
                        int i2 = this.f;
                        this.f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                    }
                }
                byte[] bArr2 = this.d;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                o7.a(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.d;
            int i5 = this.f;
            this.f = i5 + 1;
            o7.a(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.d;
                int i7 = this.f;
                this.f = i7 + 1;
                o7.a(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.d;
            int i8 = this.f;
            this.f = i8 + 1;
            o7.a(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.d;
                int i10 = this.f;
                this.f = i10 + 1;
                o7.a(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.d;
            int i11 = this.f;
            this.f = i11 + 1;
            o7.a(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.d;
                int i13 = this.f;
                this.f = i13 + 1;
                o7.a(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.d;
            int i14 = this.f;
            this.f = i14 + 1;
            o7.a(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.d;
            int i15 = this.f;
            this.f = i15 + 1;
            o7.a(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void b(int i, h3 h3Var) {
            a(1, 3);
            c(2, i);
            a(3, h3Var);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void b(byte[] bArr, int i, int i2) {
            b(i2);
            c(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void c(long j) {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.d;
                int i3 = i2 + 1;
                this.f = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.d;
                int i4 = i3 + 1;
                this.f = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.d;
                int i5 = i4 + 1;
                this.f = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.d;
                int i6 = i5 + 1;
                this.f = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.d;
                int i7 = i6 + 1;
                this.f = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.d;
                int i8 = i7 + 1;
                this.f = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.d;
                this.f = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void d(int i) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                this.f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.d;
                int i4 = i3 + 1;
                this.f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.d;
                int i5 = i4 + 1;
                this.f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.d;
                this.f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.v3
        public final void e(int i, int i2) {
            a(i, 5);
            d(i2);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v3.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private v3() {
    }

    public static int a(int i, f5 f5Var) {
        int e = e(i);
        int a2 = f5Var.a();
        return e + g(a2) + a2;
    }

    public static int a(f5 f5Var) {
        int a2 = f5Var.a();
        return g(a2) + a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(x5 x5Var, q6 q6Var) {
        x2 x2Var = (x2) x5Var;
        int f = x2Var.f();
        if (f == -1) {
            f = q6Var.d(x2Var);
            x2Var.a(f);
        }
        return g(f) + f;
    }

    public static v3 a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b(double d) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(int i, double d) {
        return e(i) + 8;
    }

    public static int b(int i, float f) {
        return e(i) + 4;
    }

    public static int b(int i, f5 f5Var) {
        return (e(1) << 1) + g(2, i) + a(3, f5Var);
    }

    public static int b(int i, x5 x5Var) {
        return (e(1) << 1) + g(2, i) + e(3) + b(x5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, x5 x5Var, q6 q6Var) {
        return e(i) + a(x5Var, q6Var);
    }

    public static int b(int i, String str) {
        return e(i) + b(str);
    }

    public static int b(int i, boolean z) {
        return e(i) + 1;
    }

    public static int b(h3 h3Var) {
        int zza = h3Var.zza();
        return g(zza) + zza;
    }

    public static int b(x5 x5Var) {
        int c2 = x5Var.c();
        return g(c2) + c2;
    }

    public static int b(String str) {
        int length;
        try {
            length = q7.a(str);
        } catch (u7 unused) {
            length = str.getBytes(r4.a).length;
        }
        return g(length) + length;
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return g(length) + length;
    }

    public static int c(int i, h3 h3Var) {
        int e = e(i);
        int zza = h3Var.zza();
        return e + g(zza) + zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int c(int i, x5 x5Var, q6 q6Var) {
        int e = e(i) << 1;
        x2 x2Var = (x2) x5Var;
        int f = x2Var.f();
        if (f == -1) {
            f = q6Var.d(x2Var);
            x2Var.a(f);
        }
        return e + f;
    }

    @Deprecated
    public static int c(x5 x5Var) {
        return x5Var.c();
    }

    public static int d(int i, long j) {
        return e(i) + e(j);
    }

    public static int d(int i, h3 h3Var) {
        return (e(1) << 1) + g(2, i) + c(3, h3Var);
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(int i) {
        return g(i << 3);
    }

    public static int e(int i, long j) {
        return e(i) + e(j);
    }

    public static int e(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int f(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int f(int i, int i2) {
        return e(i) + f(i2);
    }

    public static int f(int i, long j) {
        return e(i) + e(i(j));
    }

    public static int f(long j) {
        return e(i(j));
    }

    public static int g(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(int i, int i2) {
        return e(i) + g(i2);
    }

    public static int g(int i, long j) {
        return e(i) + 8;
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return g(m(i));
    }

    public static int h(int i, int i2) {
        return e(i) + g(m(i2));
    }

    public static int h(int i, long j) {
        return e(i) + 8;
    }

    public static int h(long j) {
        return 8;
    }

    public static int i(int i) {
        return 4;
    }

    public static int i(int i, int i2) {
        return e(i) + 4;
    }

    private static long i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int j(int i) {
        return 4;
    }

    public static int j(int i, int i2) {
        return e(i) + 4;
    }

    public static int k(int i) {
        return f(i);
    }

    public static int k(int i, int i2) {
        return e(i) + f(i2);
    }

    @Deprecated
    public static int l(int i) {
        return g(i);
    }

    private static int m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public final void a(double d) {
        c(Double.doubleToRawLongBits(d));
    }

    public final void a(float f) {
        d(Float.floatToRawIntBits(f));
    }

    public abstract void a(int i);

    public final void a(int i, double d) {
        c(i, Double.doubleToRawLongBits(d));
    }

    public final void a(int i, float f) {
        e(i, Float.floatToRawIntBits(f));
    }

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, h3 h3Var);

    public abstract void a(int i, x5 x5Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(int i, x5 x5Var, q6 q6Var);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(h3 h3Var);

    public abstract void a(x5 x5Var);

    public abstract void a(String str);

    final void a(String str, u7 u7Var) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) u7Var);
        byte[] bytes = str.getBytes(r4.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new b(e2);
        }
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public final void b(int i, long j) {
        a(i, i(j));
    }

    public abstract void b(int i, h3 h3Var);

    public final void b(long j) {
        a(i(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(byte[] bArr, int i, int i2);

    public final void c(int i) {
        b(m(i));
    }

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void d(int i);

    public final void d(int i, int i2) {
        c(i, m(i2));
    }

    public abstract void e(int i, int i2);
}
