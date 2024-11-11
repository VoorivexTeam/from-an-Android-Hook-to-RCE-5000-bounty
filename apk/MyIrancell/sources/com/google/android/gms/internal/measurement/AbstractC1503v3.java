package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* loaded from: classes.dex */
public abstract class AbstractC1503v3 extends AbstractC1255e3 {

    /* renamed from: b */
    private static final Logger f6965b = Logger.getLogger(AbstractC1503v3.class.getName());

    /* renamed from: c */
    private static final boolean f6966c = C1409o7.m8127a();

    /* renamed from: a */
    C1531x3 f6967a;

    /* renamed from: com.google.android.gms.internal.measurement.v3$a */
    /* loaded from: classes.dex */
    static class a extends AbstractC1503v3 {

        /* renamed from: d */
        private final byte[] f6968d;

        /* renamed from: e */
        private final int f6969e;

        /* renamed from: f */
        private int f6970f;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.f6968d = bArr;
            this.f6970f = 0;
            this.f6969e = i3;
        }

        /* renamed from: c */
        private final void m8613c(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f6968d, this.f6970f, i2);
                this.f6970f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6970f), Integer.valueOf(this.f6969e), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final int mo8579a() {
            return this.f6969e - this.f6970f;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8580a(byte b) {
            try {
                byte[] bArr = this.f6968d;
                int i = this.f6970f;
                this.f6970f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6970f), Integer.valueOf(this.f6969e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8583a(int i) {
            if (i >= 0) {
                mo8600b(i);
            } else {
                mo8593a(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8586a(int i, int i2) {
            mo8600b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8587a(int i, long j) {
            mo8586a(i, 0);
            mo8593a(j);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8588a(int i, AbstractC1300h3 abstractC1300h3) {
            mo8586a(i, 2);
            mo8594a(abstractC1300h3);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8589a(int i, InterfaceC1533x5 interfaceC1533x5) {
            mo8586a(1, 3);
            mo8607c(2, i);
            mo8586a(3, 2);
            mo8595a(interfaceC1533x5);
            mo8586a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        final void mo8590a(int i, InterfaceC1533x5 interfaceC1533x5, InterfaceC1436q6 interfaceC1436q6) {
            mo8586a(i, 2);
            AbstractC1530x2 abstractC1530x2 = (AbstractC1530x2) interfaceC1533x5;
            int mo8095f = abstractC1530x2.mo8095f();
            if (mo8095f == -1) {
                mo8095f = interfaceC1436q6.mo7629d(abstractC1530x2);
                abstractC1530x2.mo8090a(mo8095f);
            }
            mo8600b(mo8095f);
            interfaceC1436q6.mo7623a((InterfaceC1436q6) interfaceC1533x5, (InterfaceC1215b8) this.f6967a);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8591a(int i, String str) {
            mo8586a(i, 2);
            mo8596a(str);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8592a(int i, boolean z) {
            mo8586a(i, 0);
            mo8580a(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8593a(long j) {
            if (AbstractC1503v3.f6966c && mo8579a() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f6968d;
                    int i = this.f6970f;
                    this.f6970f = i + 1;
                    C1409o7.m8126a(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f6968d;
                int i2 = this.f6970f;
                this.f6970f = i2 + 1;
                C1409o7.m8126a(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f6968d;
                    int i3 = this.f6970f;
                    this.f6970f = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6970f), Integer.valueOf(this.f6969e), 1), e);
                }
            }
            byte[] bArr4 = this.f6968d;
            int i4 = this.f6970f;
            this.f6970f = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8594a(AbstractC1300h3 abstractC1300h3) {
            mo8600b(abstractC1300h3.zza());
            abstractC1300h3.mo7878a(this);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8595a(InterfaceC1533x5 interfaceC1533x5) {
            mo8600b(interfaceC1533x5.mo8094c());
            interfaceC1533x5.mo8091a(this);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: a */
        public final void mo8596a(String str) {
            int i = this.f6970f;
            try {
                int m8562g = AbstractC1503v3.m8562g(str.length() * 3);
                int m8562g2 = AbstractC1503v3.m8562g(str.length());
                if (m8562g2 != m8562g) {
                    mo8600b(C1437q7.m8207a(str));
                    this.f6970f = C1437q7.m8208a(str, this.f6968d, this.f6970f, mo8579a());
                    return;
                }
                int i2 = i + m8562g2;
                this.f6970f = i2;
                int m8208a = C1437q7.m8208a(str, this.f6968d, i2, mo8579a());
                this.f6970f = i;
                mo8600b((m8208a - i) - m8562g2);
                this.f6970f = m8208a;
            } catch (C1493u7 e) {
                this.f6970f = i;
                m8597a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1255e3
        /* renamed from: a */
        public final void mo7791a(byte[] bArr, int i, int i2) {
            m8613c(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: b */
        public final void mo8600b(int i) {
            if (!AbstractC1503v3.f6966c || C1195a3.m7528a() || mo8579a() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f6968d;
                        int i2 = this.f6970f;
                        this.f6970f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6970f), Integer.valueOf(this.f6969e), 1), e);
                    }
                }
                byte[] bArr2 = this.f6968d;
                int i3 = this.f6970f;
                this.f6970f = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f6968d;
                int i4 = this.f6970f;
                this.f6970f = i4 + 1;
                C1409o7.m8126a(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.f6968d;
            int i5 = this.f6970f;
            this.f6970f = i5 + 1;
            C1409o7.m8126a(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.f6968d;
                int i7 = this.f6970f;
                this.f6970f = i7 + 1;
                C1409o7.m8126a(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.f6968d;
            int i8 = this.f6970f;
            this.f6970f = i8 + 1;
            C1409o7.m8126a(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.f6968d;
                int i10 = this.f6970f;
                this.f6970f = i10 + 1;
                C1409o7.m8126a(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.f6968d;
            int i11 = this.f6970f;
            this.f6970f = i11 + 1;
            C1409o7.m8126a(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.f6968d;
                int i13 = this.f6970f;
                this.f6970f = i13 + 1;
                C1409o7.m8126a(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.f6968d;
            int i14 = this.f6970f;
            this.f6970f = i14 + 1;
            C1409o7.m8126a(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.f6968d;
            int i15 = this.f6970f;
            this.f6970f = i15 + 1;
            C1409o7.m8126a(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: b */
        public final void mo8601b(int i, int i2) {
            mo8586a(i, 0);
            mo8583a(i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: b */
        public final void mo8603b(int i, AbstractC1300h3 abstractC1300h3) {
            mo8586a(1, 3);
            mo8607c(2, i);
            mo8588a(3, abstractC1300h3);
            mo8586a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: b */
        public final void mo8605b(byte[] bArr, int i, int i2) {
            mo8600b(i2);
            m8613c(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: c */
        public final void mo8607c(int i, int i2) {
            mo8586a(i, 0);
            mo8600b(i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: c */
        public final void mo8608c(int i, long j) {
            mo8586a(i, 1);
            mo8609c(j);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: c */
        public final void mo8609c(long j) {
            try {
                byte[] bArr = this.f6968d;
                int i = this.f6970f;
                int i2 = i + 1;
                this.f6970f = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.f6968d;
                int i3 = i2 + 1;
                this.f6970f = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.f6968d;
                int i4 = i3 + 1;
                this.f6970f = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.f6968d;
                int i5 = i4 + 1;
                this.f6970f = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.f6968d;
                int i6 = i5 + 1;
                this.f6970f = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.f6968d;
                int i7 = i6 + 1;
                this.f6970f = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.f6968d;
                int i8 = i7 + 1;
                this.f6970f = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.f6968d;
                this.f6970f = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6970f), Integer.valueOf(this.f6969e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: d */
        public final void mo8610d(int i) {
            try {
                byte[] bArr = this.f6968d;
                int i2 = this.f6970f;
                int i3 = i2 + 1;
                this.f6970f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f6968d;
                int i4 = i3 + 1;
                this.f6970f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f6968d;
                int i5 = i4 + 1;
                this.f6970f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f6968d;
                this.f6970f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6970f), Integer.valueOf(this.f6969e), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1503v3
        /* renamed from: e */
        public final void mo8612e(int i, int i2) {
            mo8586a(i, 5);
            mo8610d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.v3$b */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC1503v3.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private AbstractC1503v3() {
    }

    /* renamed from: a */
    public static int m8530a(int i, C1272f5 c1272f5) {
        int m8555e = m8555e(i);
        int m7828a = c1272f5.m7828a();
        return m8555e + m8562g(m7828a) + m7828a;
    }

    /* renamed from: a */
    public static int m8531a(C1272f5 c1272f5) {
        int m7828a = c1272f5.m7828a();
        return m8562g(m7828a) + m7828a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8532a(InterfaceC1533x5 interfaceC1533x5, InterfaceC1436q6 interfaceC1436q6) {
        AbstractC1530x2 abstractC1530x2 = (AbstractC1530x2) interfaceC1533x5;
        int mo8095f = abstractC1530x2.mo8095f();
        if (mo8095f == -1) {
            mo8095f = interfaceC1436q6.mo7629d(abstractC1530x2);
            abstractC1530x2.mo8090a(mo8095f);
        }
        return m8562g(mo8095f) + mo8095f;
    }

    /* renamed from: a */
    public static AbstractC1503v3 m8533a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m8534b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m8535b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m8536b(int i, double d) {
        return m8555e(i) + 8;
    }

    /* renamed from: b */
    public static int m8537b(int i, float f) {
        return m8555e(i) + 4;
    }

    /* renamed from: b */
    public static int m8538b(int i, C1272f5 c1272f5) {
        return (m8555e(1) << 1) + m8563g(2, i) + m8530a(3, c1272f5);
    }

    /* renamed from: b */
    public static int m8539b(int i, InterfaceC1533x5 interfaceC1533x5) {
        return (m8555e(1) << 1) + m8563g(2, i) + m8555e(3) + m8544b(interfaceC1533x5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8540b(int i, InterfaceC1533x5 interfaceC1533x5, InterfaceC1436q6 interfaceC1436q6) {
        return m8555e(i) + m8532a(interfaceC1533x5, interfaceC1436q6);
    }

    /* renamed from: b */
    public static int m8541b(int i, String str) {
        return m8555e(i) + m8545b(str);
    }

    /* renamed from: b */
    public static int m8542b(int i, boolean z) {
        return m8555e(i) + 1;
    }

    /* renamed from: b */
    public static int m8543b(AbstractC1300h3 abstractC1300h3) {
        int zza = abstractC1300h3.zza();
        return m8562g(zza) + zza;
    }

    /* renamed from: b */
    public static int m8544b(InterfaceC1533x5 interfaceC1533x5) {
        int mo8094c = interfaceC1533x5.mo8094c();
        return m8562g(mo8094c) + mo8094c;
    }

    /* renamed from: b */
    public static int m8545b(String str) {
        int length;
        try {
            length = C1437q7.m8207a(str);
        } catch (C1493u7 unused) {
            length = str.getBytes(C1448r4.f6862a).length;
        }
        return m8562g(length) + length;
    }

    /* renamed from: b */
    public static int m8546b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m8547b(byte[] bArr) {
        int length = bArr.length;
        return m8562g(length) + length;
    }

    /* renamed from: c */
    public static int m8548c(int i, AbstractC1300h3 abstractC1300h3) {
        int m8555e = m8555e(i);
        int zza = abstractC1300h3.zza();
        return m8555e + m8562g(zza) + zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: c */
    public static int m8549c(int i, InterfaceC1533x5 interfaceC1533x5, InterfaceC1436q6 interfaceC1436q6) {
        int m8555e = m8555e(i) << 1;
        AbstractC1530x2 abstractC1530x2 = (AbstractC1530x2) interfaceC1533x5;
        int mo8095f = abstractC1530x2.mo8095f();
        if (mo8095f == -1) {
            mo8095f = interfaceC1436q6.mo7629d(abstractC1530x2);
            abstractC1530x2.mo8090a(mo8095f);
        }
        return m8555e + mo8095f;
    }

    @Deprecated
    /* renamed from: c */
    public static int m8550c(InterfaceC1533x5 interfaceC1533x5) {
        return interfaceC1533x5.mo8094c();
    }

    /* renamed from: d */
    public static int m8552d(int i, long j) {
        return m8555e(i) + m8557e(j);
    }

    /* renamed from: d */
    public static int m8553d(int i, AbstractC1300h3 abstractC1300h3) {
        return (m8555e(1) << 1) + m8563g(2, i) + m8548c(3, abstractC1300h3);
    }

    /* renamed from: d */
    public static int m8554d(long j) {
        return m8557e(j);
    }

    /* renamed from: e */
    public static int m8555e(int i) {
        return m8562g(i << 3);
    }

    /* renamed from: e */
    public static int m8556e(int i, long j) {
        return m8555e(i) + m8557e(j);
    }

    /* renamed from: e */
    public static int m8557e(long j) {
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

    /* renamed from: f */
    public static int m8558f(int i) {
        if (i >= 0) {
            return m8562g(i);
        }
        return 10;
    }

    /* renamed from: f */
    public static int m8559f(int i, int i2) {
        return m8555e(i) + m8558f(i2);
    }

    /* renamed from: f */
    public static int m8560f(int i, long j) {
        return m8555e(i) + m8557e(m8572i(j));
    }

    /* renamed from: f */
    public static int m8561f(long j) {
        return m8557e(m8572i(j));
    }

    /* renamed from: g */
    public static int m8562g(int i) {
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

    /* renamed from: g */
    public static int m8563g(int i, int i2) {
        return m8555e(i) + m8562g(i2);
    }

    /* renamed from: g */
    public static int m8564g(int i, long j) {
        return m8555e(i) + 8;
    }

    /* renamed from: g */
    public static int m8565g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m8566h(int i) {
        return m8562g(m8578m(i));
    }

    /* renamed from: h */
    public static int m8567h(int i, int i2) {
        return m8555e(i) + m8562g(m8578m(i2));
    }

    /* renamed from: h */
    public static int m8568h(int i, long j) {
        return m8555e(i) + 8;
    }

    /* renamed from: h */
    public static int m8569h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m8570i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m8571i(int i, int i2) {
        return m8555e(i) + 4;
    }

    /* renamed from: i */
    private static long m8572i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m8573j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m8574j(int i, int i2) {
        return m8555e(i) + 4;
    }

    /* renamed from: k */
    public static int m8575k(int i) {
        return m8558f(i);
    }

    /* renamed from: k */
    public static int m8576k(int i, int i2) {
        return m8555e(i) + m8558f(i2);
    }

    @Deprecated
    /* renamed from: l */
    public static int m8577l(int i) {
        return m8562g(i);
    }

    /* renamed from: m */
    private static int m8578m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract int mo8579a();

    /* renamed from: a */
    public abstract void mo8580a(byte b2);

    /* renamed from: a */
    public final void m8581a(double d) {
        mo8609c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void m8582a(float f) {
        mo8610d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo8583a(int i);

    /* renamed from: a */
    public final void m8584a(int i, double d) {
        mo8608c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void m8585a(int i, float f) {
        mo8612e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo8586a(int i, int i2);

    /* renamed from: a */
    public abstract void mo8587a(int i, long j);

    /* renamed from: a */
    public abstract void mo8588a(int i, AbstractC1300h3 abstractC1300h3);

    /* renamed from: a */
    public abstract void mo8589a(int i, InterfaceC1533x5 interfaceC1533x5);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo8590a(int i, InterfaceC1533x5 interfaceC1533x5, InterfaceC1436q6 interfaceC1436q6);

    /* renamed from: a */
    public abstract void mo8591a(int i, String str);

    /* renamed from: a */
    public abstract void mo8592a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo8593a(long j);

    /* renamed from: a */
    public abstract void mo8594a(AbstractC1300h3 abstractC1300h3);

    /* renamed from: a */
    public abstract void mo8595a(InterfaceC1533x5 interfaceC1533x5);

    /* renamed from: a */
    public abstract void mo8596a(String str);

    /* renamed from: a */
    final void m8597a(String str, C1493u7 c1493u7) {
        f6965b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c1493u7);
        byte[] bytes = str.getBytes(C1448r4.f6862a);
        try {
            mo8600b(bytes.length);
            mo7791a(bytes, 0, bytes.length);
        } catch (b e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new b(e2);
        }
    }

    /* renamed from: a */
    public final void m8598a(boolean z) {
        mo8580a(z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: b */
    public final void m8599b() {
        if (mo8579a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public abstract void mo8600b(int i);

    /* renamed from: b */
    public abstract void mo8601b(int i, int i2);

    /* renamed from: b */
    public final void m8602b(int i, long j) {
        mo8587a(i, m8572i(j));
    }

    /* renamed from: b */
    public abstract void mo8603b(int i, AbstractC1300h3 abstractC1300h3);

    /* renamed from: b */
    public final void m8604b(long j) {
        mo8593a(m8572i(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo8605b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public final void m8606c(int i) {
        mo8600b(m8578m(i));
    }

    /* renamed from: c */
    public abstract void mo8607c(int i, int i2);

    /* renamed from: c */
    public abstract void mo8608c(int i, long j);

    /* renamed from: c */
    public abstract void mo8609c(long j);

    /* renamed from: d */
    public abstract void mo8610d(int i);

    /* renamed from: d */
    public final void m8611d(int i, int i2) {
        mo8607c(i, m8578m(i2));
    }

    /* renamed from: e */
    public abstract void mo8612e(int i, int i2);
}
