package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.h7 */
/* loaded from: classes.dex */
public final class C1304h7 {

    /* renamed from: f */
    private static final C1304h7 f6642f = new C1304h7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f6643a;

    /* renamed from: b */
    private int[] f6644b;

    /* renamed from: c */
    private Object[] f6645c;

    /* renamed from: d */
    private int f6646d;

    /* renamed from: e */
    private boolean f6647e;

    private C1304h7() {
        this(0, new int[8], new Object[8], true);
    }

    private C1304h7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f6646d = -1;
        this.f6643a = i;
        this.f6644b = iArr;
        this.f6645c = objArr;
        this.f6647e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1304h7 m7884a(C1304h7 c1304h7, C1304h7 c1304h72) {
        int i = c1304h7.f6643a + c1304h72.f6643a;
        int[] copyOf = Arrays.copyOf(c1304h7.f6644b, i);
        System.arraycopy(c1304h72.f6644b, 0, copyOf, c1304h7.f6643a, c1304h72.f6643a);
        Object[] copyOf2 = Arrays.copyOf(c1304h7.f6645c, i);
        System.arraycopy(c1304h72.f6645c, 0, copyOf2, c1304h7.f6643a, c1304h72.f6643a);
        return new C1304h7(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    private static void m7885a(int i, Object obj, InterfaceC1215b8 interfaceC1215b8) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            interfaceC1215b8.mo7659e(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            interfaceC1215b8.mo7653c(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            interfaceC1215b8.mo7636a(i2, (AbstractC1300h3) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(C1518w4.m8633d());
            }
            interfaceC1215b8.mo7658e(i2, ((Integer) obj).intValue());
        } else if (interfaceC1215b8.zza() == AbstractC1406o4.f.f6803k) {
            interfaceC1215b8.mo7631a(i2);
            ((C1304h7) obj).m7893b(interfaceC1215b8);
            interfaceC1215b8.mo7645b(i2);
        } else {
            interfaceC1215b8.mo7645b(i2);
            ((C1304h7) obj).m7893b(interfaceC1215b8);
            interfaceC1215b8.mo7631a(i2);
        }
    }

    /* renamed from: d */
    public static C1304h7 m7886d() {
        return f6642f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1304h7 m7887e() {
        return new C1304h7();
    }

    /* renamed from: a */
    public final void m7888a() {
        this.f6647e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7889a(int i, Object obj) {
        if (!this.f6647e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f6643a;
        if (i2 == this.f6644b.length) {
            int i3 = this.f6643a + (i2 < 4 ? 8 : i2 >> 1);
            this.f6644b = Arrays.copyOf(this.f6644b, i3);
            this.f6645c = Arrays.copyOf(this.f6645c, i3);
        }
        int[] iArr = this.f6644b;
        int i4 = this.f6643a;
        iArr[i4] = i;
        this.f6645c[i4] = obj;
        this.f6643a = i4 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7890a(InterfaceC1215b8 interfaceC1215b8) {
        if (interfaceC1215b8.zza() == AbstractC1406o4.f.f6804l) {
            for (int i = this.f6643a - 1; i >= 0; i--) {
                interfaceC1215b8.mo7638a(this.f6644b[i] >>> 3, this.f6645c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f6643a; i2++) {
            interfaceC1215b8.mo7638a(this.f6644b[i2] >>> 3, this.f6645c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7891a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f6643a; i2++) {
            C1228c6.m7699a(sb, i, String.valueOf(this.f6644b[i2] >>> 3), this.f6645c[i2]);
        }
    }

    /* renamed from: b */
    public final int m7892b() {
        int i = this.f6646d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f6643a; i3++) {
            i2 += AbstractC1503v3.m8553d(this.f6644b[i3] >>> 3, (AbstractC1300h3) this.f6645c[i3]);
        }
        this.f6646d = i2;
        return i2;
    }

    /* renamed from: b */
    public final void m7893b(InterfaceC1215b8 interfaceC1215b8) {
        if (this.f6643a == 0) {
            return;
        }
        if (interfaceC1215b8.zza() == AbstractC1406o4.f.f6803k) {
            for (int i = 0; i < this.f6643a; i++) {
                m7885a(this.f6644b[i], this.f6645c[i], interfaceC1215b8);
            }
            return;
        }
        for (int i2 = this.f6643a - 1; i2 >= 0; i2--) {
            m7885a(this.f6644b[i2], this.f6645c[i2], interfaceC1215b8);
        }
    }

    /* renamed from: c */
    public final int m7894c() {
        int m8556e;
        int i = this.f6646d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f6643a; i3++) {
            int i4 = this.f6644b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                m8556e = AbstractC1503v3.m8556e(i5, ((Long) this.f6645c[i3]).longValue());
            } else if (i6 == 1) {
                m8556e = AbstractC1503v3.m8564g(i5, ((Long) this.f6645c[i3]).longValue());
            } else if (i6 == 2) {
                m8556e = AbstractC1503v3.m8548c(i5, (AbstractC1300h3) this.f6645c[i3]);
            } else if (i6 == 3) {
                m8556e = (AbstractC1503v3.m8555e(i5) << 1) + ((C1304h7) this.f6645c[i3]).m7894c();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(C1518w4.m8633d());
                }
                m8556e = AbstractC1503v3.m8571i(i5, ((Integer) this.f6645c[i3]).intValue());
            }
            i2 += m8556e;
        }
        this.f6646d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1304h7)) {
            return false;
        }
        C1304h7 c1304h7 = (C1304h7) obj;
        int i = this.f6643a;
        if (i == c1304h7.f6643a) {
            int[] iArr = this.f6644b;
            int[] iArr2 = c1304h7.f6644b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.f6645c;
                Object[] objArr2 = c1304h7.f6645c;
                int i3 = this.f6643a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    }
                    i4++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f6643a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f6644b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f6645c;
        int i7 = this.f6643a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
