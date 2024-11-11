package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p000.InterfaceC0513ca;

/* renamed from: ga */
/* loaded from: classes.dex */
public class C2504ga implements InterfaceC0513ca {

    /* renamed from: u */
    private static final String f10253u = "ga";

    /* renamed from: a */
    private int[] f10254a;

    /* renamed from: b */
    private final int[] f10255b;

    /* renamed from: c */
    private final InterfaceC0513ca.a f10256c;

    /* renamed from: d */
    private ByteBuffer f10257d;

    /* renamed from: e */
    private byte[] f10258e;

    /* renamed from: f */
    private short[] f10259f;

    /* renamed from: g */
    private byte[] f10260g;

    /* renamed from: h */
    private byte[] f10261h;

    /* renamed from: i */
    private byte[] f10262i;

    /* renamed from: j */
    private int[] f10263j;

    /* renamed from: k */
    private int f10264k;

    /* renamed from: l */
    private C2423ea f10265l;

    /* renamed from: m */
    private Bitmap f10266m;

    /* renamed from: n */
    private boolean f10267n;

    /* renamed from: o */
    private int f10268o;

    /* renamed from: p */
    private int f10269p;

    /* renamed from: q */
    private int f10270q;

    /* renamed from: r */
    private int f10271r;

    /* renamed from: s */
    private Boolean f10272s;

    /* renamed from: t */
    private Bitmap.Config f10273t;

    public C2504ga(InterfaceC0513ca.a aVar) {
        this.f10255b = new int[256];
        this.f10273t = Bitmap.Config.ARGB_8888;
        this.f10256c = aVar;
        this.f10265l = new C2423ea();
    }

    public C2504ga(InterfaceC0513ca.a aVar, C2423ea c2423ea, ByteBuffer byteBuffer, int i) {
        this(aVar);
        m11949a(c2423ea, byteBuffer, i);
    }

    /* renamed from: a */
    private int m11940a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f10269p + i; i9++) {
            byte[] bArr = this.f10262i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f10254a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f10269p + i11; i12++) {
            byte[] bArr2 = this.f10262i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f10254a[bArr2[i12] & 255];
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

    /* renamed from: a */
    private Bitmap m11941a(C2381da c2381da, C2381da c2381da2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f10263j;
        int i3 = 0;
        if (c2381da2 == null) {
            Bitmap bitmap2 = this.f10266m;
            if (bitmap2 != null) {
                this.f10256c.mo3629a(bitmap2);
            }
            this.f10266m = null;
            Arrays.fill(iArr, 0);
        }
        if (c2381da2 != null && c2381da2.f9782g == 3 && this.f10266m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c2381da2 != null && (i2 = c2381da2.f9782g) > 0) {
            if (i2 == 2) {
                if (!c2381da.f9781f) {
                    C2423ea c2423ea = this.f10265l;
                    int i4 = c2423ea.f9962l;
                    if (c2381da.f9786k == null || c2423ea.f9960j != c2381da.f9783h) {
                        i3 = i4;
                    }
                } else if (this.f10264k == 0) {
                    this.f10272s = true;
                }
                int i5 = c2381da2.f9779d;
                int i6 = this.f10269p;
                int i7 = i5 / i6;
                int i8 = c2381da2.f9777b / i6;
                int i9 = c2381da2.f9778c / i6;
                int i10 = c2381da2.f9776a / i6;
                int i11 = this.f10271r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f10271r;
                }
            } else if (i2 == 3 && (bitmap = this.f10266m) != null) {
                int i16 = this.f10271r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f10270q);
            }
        }
        m11944c(c2381da);
        if (c2381da.f9780e || this.f10269p != 1) {
            m11942a(c2381da);
        } else {
            m11943b(c2381da);
        }
        if (this.f10267n && ((i = c2381da.f9782g) == 0 || i == 1)) {
            if (this.f10266m == null) {
                this.f10266m = m11945i();
            }
            Bitmap bitmap3 = this.f10266m;
            int i17 = this.f10271r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f10270q);
        }
        Bitmap m11945i = m11945i();
        int i18 = this.f10271r;
        m11945i.setPixels(iArr, 0, i18, 0, 0, i18, this.f10270q);
        return m11945i;
    }

    /* renamed from: a */
    private void m11942a(C2381da c2381da) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f10263j;
        int i6 = c2381da.f9779d;
        int i7 = this.f10269p;
        int i8 = i6 / i7;
        int i9 = c2381da.f9777b / i7;
        int i10 = c2381da.f9778c / i7;
        int i11 = c2381da.f9776a / i7;
        boolean z = this.f10264k == 0;
        int i12 = this.f10269p;
        int i13 = this.f10271r;
        int i14 = this.f10270q;
        byte[] bArr = this.f10262i;
        int[] iArr2 = this.f10254a;
        Boolean bool2 = this.f10272s;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (true) {
            bool = bool2;
            if (i16 >= i8) {
                break;
            }
            if (c2381da.f9780e) {
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
                int i25 = i16 * i12 * c2381da.f9778c;
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
                            int m11940a = m11940a(i25, i28, c2381da.f9778c);
                            if (m11940a != 0) {
                                iArr[i29] = m11940a;
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
        if (this.f10272s == null) {
            this.f10272s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: b */
    private void m11943b(C2381da c2381da) {
        C2381da c2381da2 = c2381da;
        int[] iArr = this.f10263j;
        int i = c2381da2.f9779d;
        int i2 = c2381da2.f9777b;
        int i3 = c2381da2.f9778c;
        int i4 = c2381da2.f9776a;
        boolean z = this.f10264k == 0;
        int i5 = this.f10271r;
        byte[] bArr = this.f10262i;
        int[] iArr2 = this.f10254a;
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
            int i11 = c2381da2.f9778c * i6;
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
            c2381da2 = c2381da;
        }
        this.f10272s = Boolean.valueOf(this.f10272s == null && z && b != -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* renamed from: c */
    private void m11944c(C2381da c2381da) {
        int i;
        int i2;
        short s;
        C2504ga c2504ga = this;
        if (c2381da != null) {
            c2504ga.f10257d.position(c2381da.f9785j);
        }
        if (c2381da == null) {
            C2423ea c2423ea = c2504ga.f10265l;
            i = c2423ea.f9956f;
            i2 = c2423ea.f9957g;
        } else {
            i = c2381da.f9778c;
            i2 = c2381da.f9779d;
        }
        int i3 = i * i2;
        byte[] bArr = c2504ga.f10262i;
        if (bArr == null || bArr.length < i3) {
            c2504ga.f10262i = c2504ga.f10256c.mo3632a(i3);
        }
        byte[] bArr2 = c2504ga.f10262i;
        if (c2504ga.f10259f == null) {
            c2504ga.f10259f = new short[4096];
        }
        short[] sArr = c2504ga.f10259f;
        if (c2504ga.f10260g == null) {
            c2504ga.f10260g = new byte[4096];
        }
        byte[] bArr3 = c2504ga.f10260g;
        if (c2504ga.f10261h == null) {
            c2504ga.f10261h = new byte[4097];
        }
        byte[] bArr4 = c2504ga.f10261h;
        int m11947k = m11947k();
        int i4 = 1 << m11947k;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = m11947k + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = c2504ga.f10258e;
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
                i14 = m11946j();
                if (i14 <= 0) {
                    c2504ga.f10268o = 3;
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
                    c2504ga = this;
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
                        c2504ga = this;
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

    /* renamed from: i */
    private Bitmap m11945i() {
        Boolean bool = this.f10272s;
        Bitmap mo3628a = this.f10256c.mo3628a(this.f10271r, this.f10270q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f10273t);
        mo3628a.setHasAlpha(true);
        return mo3628a;
    }

    /* renamed from: j */
    private int m11946j() {
        int m11947k = m11947k();
        if (m11947k <= 0) {
            return m11947k;
        }
        ByteBuffer byteBuffer = this.f10257d;
        byteBuffer.get(this.f10258e, 0, Math.min(m11947k, byteBuffer.remaining()));
        return m11947k;
    }

    /* renamed from: k */
    private int m11947k() {
        return this.f10257d.get() & 255;
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: a */
    public int mo3619a() {
        return this.f10264k;
    }

    /* renamed from: a */
    public int m11948a(int i) {
        if (i >= 0) {
            C2423ea c2423ea = this.f10265l;
            if (i < c2423ea.f9953c) {
                return c2423ea.f9955e.get(i).f9784i;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: a */
    public void mo3620a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f10273t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    public synchronized void m11949a(C2423ea c2423ea, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.f10268o = 0;
        this.f10265l = c2423ea;
        this.f10264k = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f10257d = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f10257d.order(ByteOrder.LITTLE_ENDIAN);
        this.f10267n = false;
        Iterator<C2381da> it = c2423ea.f9955e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f9782g == 3) {
                this.f10267n = true;
                break;
            }
        }
        this.f10269p = highestOneBit;
        this.f10271r = c2423ea.f9956f / highestOneBit;
        this.f10270q = c2423ea.f9957g / highestOneBit;
        this.f10262i = this.f10256c.mo3632a(c2423ea.f9956f * c2423ea.f9957g);
        this.f10263j = this.f10256c.mo3633b(this.f10271r * this.f10270q);
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: b */
    public synchronized Bitmap mo3621b() {
        if (this.f10265l.f9953c <= 0 || this.f10264k < 0) {
            if (Log.isLoggable(f10253u, 3)) {
                String str = "Unable to decode frame, frameCount=" + this.f10265l.f9953c + ", framePointer=" + this.f10264k;
            }
            this.f10268o = 1;
        }
        if (this.f10268o != 1 && this.f10268o != 2) {
            this.f10268o = 0;
            if (this.f10258e == null) {
                this.f10258e = this.f10256c.mo3632a(255);
            }
            C2381da c2381da = this.f10265l.f9955e.get(this.f10264k);
            int i = this.f10264k - 1;
            C2381da c2381da2 = i >= 0 ? this.f10265l.f9955e.get(i) : null;
            int[] iArr = c2381da.f9786k != null ? c2381da.f9786k : this.f10265l.f9951a;
            this.f10254a = iArr;
            if (iArr != null) {
                if (c2381da.f9781f) {
                    System.arraycopy(iArr, 0, this.f10255b, 0, iArr.length);
                    int[] iArr2 = this.f10255b;
                    this.f10254a = iArr2;
                    iArr2[c2381da.f9783h] = 0;
                }
                return m11941a(c2381da, c2381da2);
            }
            if (Log.isLoggable(f10253u, 3)) {
                String str2 = "No valid color table found for frame #" + this.f10264k;
            }
            this.f10268o = 1;
            return null;
        }
        if (Log.isLoggable(f10253u, 3)) {
            String str3 = "Unable to decode frame, status=" + this.f10268o;
        }
        return null;
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: c */
    public void mo3622c() {
        this.f10264k = (this.f10264k + 1) % this.f10265l.f9953c;
    }

    @Override // p000.InterfaceC0513ca
    public void clear() {
        this.f10265l = null;
        byte[] bArr = this.f10262i;
        if (bArr != null) {
            this.f10256c.mo3630a(bArr);
        }
        int[] iArr = this.f10263j;
        if (iArr != null) {
            this.f10256c.mo3631a(iArr);
        }
        Bitmap bitmap = this.f10266m;
        if (bitmap != null) {
            this.f10256c.mo3629a(bitmap);
        }
        this.f10266m = null;
        this.f10257d = null;
        this.f10272s = null;
        byte[] bArr2 = this.f10258e;
        if (bArr2 != null) {
            this.f10256c.mo3630a(bArr2);
        }
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: d */
    public int mo3623d() {
        return this.f10265l.f9953c;
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: e */
    public int mo3624e() {
        int i;
        if (this.f10265l.f9953c <= 0 || (i = this.f10264k) < 0) {
            return 0;
        }
        return m11948a(i);
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: f */
    public int mo3625f() {
        return this.f10257d.limit() + this.f10262i.length + (this.f10263j.length * 4);
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: g */
    public ByteBuffer mo3626g() {
        return this.f10257d;
    }

    @Override // p000.InterfaceC0513ca
    /* renamed from: h */
    public void mo3627h() {
        this.f10264k = -1;
    }
}
