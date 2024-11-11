package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import defpackage.ca;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ga implements ca {
    private static final String u = "ga";
    private int[] a;
    private final int[] b;
    private final ca.a c;
    private ByteBuffer d;
    private byte[] e;
    private short[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private int[] j;
    private int k;
    private ea l;
    private Bitmap m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private Boolean s;
    private Bitmap.Config t;

    public ga(ca.a aVar) {
        this.b = new int[256];
        this.t = Bitmap.Config.ARGB_8888;
        this.c = aVar;
        this.l = new ea();
    }

    public ga(ca.a aVar, ea eaVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        a(eaVar, byteBuffer, i);
    }

    private int a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.p + i; i9++) {
            byte[] bArr = this.i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.p + i11; i12++) {
            byte[] bArr2 = this.i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    private Bitmap a(da daVar, da daVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.j;
        int i3 = 0;
        if (daVar2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                this.c.a(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr, 0);
        }
        if (daVar2 != null && daVar2.g == 3 && this.m == null) {
            Arrays.fill(iArr, 0);
        }
        if (daVar2 != null && (i2 = daVar2.g) > 0) {
            if (i2 == 2) {
                if (!daVar.f) {
                    ea eaVar = this.l;
                    int i4 = eaVar.l;
                    if (daVar.k == null || eaVar.j != daVar.h) {
                        i3 = i4;
                    }
                } else if (this.k == 0) {
                    this.s = true;
                }
                int i5 = daVar2.d;
                int i6 = this.p;
                int i7 = i5 / i6;
                int i8 = daVar2.b / i6;
                int i9 = daVar2.c / i6;
                int i10 = daVar2.a / i6;
                int i11 = this.r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.r;
                }
            } else if (i2 == 3 && (bitmap = this.m) != null) {
                int i16 = this.r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.q);
            }
        }
        c(daVar);
        if (daVar.e || this.p != 1) {
            a(daVar);
        } else {
            b(daVar);
        }
        if (this.n && ((i = daVar.g) == 0 || i == 1)) {
            if (this.m == null) {
                this.m = i();
            }
            Bitmap bitmap3 = this.m;
            int i17 = this.r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.q);
        }
        Bitmap i18 = i();
        int i19 = this.r;
        i18.setPixels(iArr, 0, i19, 0, 0, i19, this.q);
        return i18;
    }

    private void a(da daVar) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.j;
        int i6 = daVar.d;
        int i7 = this.p;
        int i8 = i6 / i7;
        int i9 = daVar.b / i7;
        int i10 = daVar.c / i7;
        int i11 = daVar.a / i7;
        boolean z = this.k == 0;
        int i12 = this.p;
        int i13 = this.r;
        int i14 = this.q;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        Boolean bool2 = this.s;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (true) {
            bool = bool2;
            if (i16 >= i8) {
                break;
            }
            if (daVar.e) {
                if (i17 >= i8) {
                    i = i8;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 != 3) {
                        i18 = i19;
                        if (i19 == 4) {
                            i17 = 1;
                            i15 = 2;
                        }
                    } else {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    }
                } else {
                    i = i8;
                }
                i2 = i17 + i15;
            } else {
                i = i8;
                i2 = i17;
                i17 = i16;
            }
            int i20 = i17 + i9;
            boolean z2 = i12 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i11;
                int i23 = i22 + i10;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i3 = i2;
                int i25 = i16 * i12 * daVar.c;
                if (z2) {
                    int i26 = i22;
                    while (true) {
                        i4 = i9;
                        if (i26 >= i23) {
                            break;
                        }
                        int i27 = iArr2[bArr[i25] & 255];
                        if (i27 != 0) {
                            iArr[i26] = i27;
                        } else if (z && bool == null) {
                            bool = true;
                        }
                        i25 += i12;
                        i26++;
                        i9 = i4;
                    }
                } else {
                    i4 = i9;
                    int i28 = ((i23 - i22) * i12) + i25;
                    int i29 = i22;
                    while (true) {
                        i5 = i10;
                        if (i29 < i23) {
                            int a = a(i25, i28, daVar.c);
                            if (a != 0) {
                                iArr[i29] = a;
                            } else if (z && bool == null) {
                                bool = true;
                            }
                            i25 += i12;
                            i29++;
                            i10 = i5;
                        }
                    }
                    bool2 = bool;
                    i16++;
                    i9 = i4;
                    i10 = i5;
                    i8 = i;
                    i17 = i3;
                }
            } else {
                i3 = i2;
                i4 = i9;
            }
            i5 = i10;
            bool2 = bool;
            i16++;
            i9 = i4;
            i10 = i5;
            i8 = i;
            i17 = i3;
        }
        if (this.s == null) {
            this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void b(da daVar) {
        da daVar2 = daVar;
        int[] iArr = this.j;
        int i = daVar2.d;
        int i2 = daVar2.b;
        int i3 = daVar2.c;
        int i4 = daVar2.a;
        boolean z = this.k == 0;
        int i5 = this.r;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = daVar2.c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & 255;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            daVar2 = daVar;
        }
        this.s = Boolean.valueOf(this.s == null && z && b != -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void c(da daVar) {
        int i;
        int i2;
        short s;
        ga gaVar = this;
        if (daVar != null) {
            gaVar.d.position(daVar.j);
        }
        if (daVar == null) {
            ea eaVar = gaVar.l;
            i = eaVar.f;
            i2 = eaVar.g;
        } else {
            i = daVar.c;
            i2 = daVar.d;
        }
        int i3 = i * i2;
        byte[] bArr = gaVar.i;
        if (bArr == null || bArr.length < i3) {
            gaVar.i = gaVar.c.a(i3);
        }
        byte[] bArr2 = gaVar.i;
        if (gaVar.f == null) {
            gaVar.f = new short[4096];
        }
        short[] sArr = gaVar.f;
        if (gaVar.g == null) {
            gaVar.g = new byte[4096];
        }
        byte[] bArr3 = gaVar.g;
        if (gaVar.h == null) {
            gaVar.h = new byte[4097];
        }
        byte[] bArr4 = gaVar.h;
        int k = k();
        int i4 = 1 << k;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = k + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = gaVar.e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            if (i14 == 0) {
                i14 = j();
                if (i14 <= 0) {
                    gaVar.o = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & 255) << i16;
            i15++;
            i14--;
            int i22 = i16 + 8;
            int i23 = i12;
            int i24 = i11;
            int i25 = i19;
            int i26 = i7;
            int i27 = i20;
            while (true) {
                if (i22 < i24) {
                    i19 = i25;
                    i12 = i23;
                    i16 = i22;
                    gaVar = this;
                    i20 = i27;
                    i7 = i26;
                    i11 = i24;
                    break;
                }
                int i28 = i6;
                int i29 = i17 & i13;
                i17 >>= i24;
                i22 -= i24;
                if (i29 == i4) {
                    i13 = i8;
                    i24 = i26;
                    i23 = i28;
                    i6 = i23;
                    i25 = -1;
                } else {
                    if (i29 == i5) {
                        i16 = i22;
                        i20 = i27;
                        i12 = i23;
                        i7 = i26;
                        i6 = i28;
                        i19 = i25;
                        i11 = i24;
                        gaVar = this;
                        break;
                    }
                    if (i25 == -1) {
                        bArr2[i18] = bArr3[i29];
                        i18++;
                        i9++;
                        i25 = i29;
                        i27 = i25;
                        i6 = i28;
                        i22 = i22;
                    } else {
                        if (i29 >= i23) {
                            bArr4[i21] = (byte) i27;
                            i21++;
                            s = i25;
                        } else {
                            s = i29;
                        }
                        while (s >= i4) {
                            bArr4[i21] = bArr3[s];
                            i21++;
                            s = sArr[s];
                        }
                        i27 = bArr3[s] & 255;
                        byte b = (byte) i27;
                        bArr2[i18] = b;
                        while (true) {
                            i18++;
                            i9++;
                            if (i21 <= 0) {
                                break;
                            }
                            i21--;
                            bArr2[i18] = bArr4[i21];
                        }
                        byte[] bArr6 = bArr4;
                        if (i23 < 4096) {
                            sArr[i23] = (short) i25;
                            bArr3[i23] = b;
                            i23++;
                            if ((i23 & i13) == 0 && i23 < 4096) {
                                i24++;
                                i13 += i23;
                            }
                        }
                        i25 = i29;
                        i6 = i28;
                        i22 = i22;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i18, i3, (byte) 0);
    }

    private Bitmap i() {
        Boolean bool = this.s;
        Bitmap a = this.c.a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        a.setHasAlpha(true);
        return a;
    }

    private int j() {
        int k = k();
        if (k <= 0) {
            return k;
        }
        ByteBuffer byteBuffer = this.d;
        byteBuffer.get(this.e, 0, Math.min(k, byteBuffer.remaining()));
        return k;
    }

    private int k() {
        return this.d.get() & 255;
    }

    @Override // defpackage.ca
    public int a() {
        return this.k;
    }

    public int a(int i) {
        if (i >= 0) {
            ea eaVar = this.l;
            if (i < eaVar.c) {
                return eaVar.e.get(i).i;
            }
        }
        return -1;
    }

    @Override // defpackage.ca
    public void a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    public synchronized void a(ea eaVar, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.o = 0;
        this.l = eaVar;
        this.k = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.d = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.d.order(ByteOrder.LITTLE_ENDIAN);
        this.n = false;
        Iterator<da> it = eaVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g == 3) {
                this.n = true;
                break;
            }
        }
        this.p = highestOneBit;
        this.r = eaVar.f / highestOneBit;
        this.q = eaVar.g / highestOneBit;
        this.i = this.c.a(eaVar.f * eaVar.g);
        this.j = this.c.b(this.r * this.q);
    }

    @Override // defpackage.ca
    public synchronized Bitmap b() {
        if (this.l.c <= 0 || this.k < 0) {
            if (Log.isLoggable(u, 3)) {
                String str = "Unable to decode frame, frameCount=" + this.l.c + ", framePointer=" + this.k;
            }
            this.o = 1;
        }
        if (this.o != 1 && this.o != 2) {
            this.o = 0;
            if (this.e == null) {
                this.e = this.c.a(255);
            }
            da daVar = this.l.e.get(this.k);
            int i = this.k - 1;
            da daVar2 = i >= 0 ? this.l.e.get(i) : null;
            int[] iArr = daVar.k != null ? daVar.k : this.l.a;
            this.a = iArr;
            if (iArr != null) {
                if (daVar.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[daVar.h] = 0;
                }
                return a(daVar, daVar2);
            }
            if (Log.isLoggable(u, 3)) {
                String str2 = "No valid color table found for frame #" + this.k;
            }
            this.o = 1;
            return null;
        }
        if (Log.isLoggable(u, 3)) {
            String str3 = "Unable to decode frame, status=" + this.o;
        }
        return null;
    }

    @Override // defpackage.ca
    public void c() {
        this.k = (this.k + 1) % this.l.c;
    }

    @Override // defpackage.ca
    public void clear() {
        this.l = null;
        byte[] bArr = this.i;
        if (bArr != null) {
            this.c.a(bArr);
        }
        int[] iArr = this.j;
        if (iArr != null) {
            this.c.a(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.c.a(bitmap);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            this.c.a(bArr2);
        }
    }

    @Override // defpackage.ca
    public int d() {
        return this.l.c;
    }

    @Override // defpackage.ca
    public int e() {
        int i;
        if (this.l.c <= 0 || (i = this.k) < 0) {
            return 0;
        }
        return a(i);
    }

    @Override // defpackage.ca
    public int f() {
        return this.d.limit() + this.i.length + (this.j.length * 4);
    }

    @Override // defpackage.ca
    public ByteBuffer g() {
        return this.d;
    }

    @Override // defpackage.ca
    public void h() {
        this.k = -1;
    }
}
