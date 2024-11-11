package p000;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class h30 {

    /* renamed from: a */
    private final C2571hz f10372a;

    /* renamed from: c */
    private final int f10374c;

    /* renamed from: d */
    private final int f10375d;

    /* renamed from: e */
    private final int f10376e;

    /* renamed from: f */
    private final int f10377f;

    /* renamed from: g */
    private final float f10378g;

    /* renamed from: i */
    private final InterfaceC2790iw f10380i;

    /* renamed from: b */
    private final List<g30> f10373b = new ArrayList(5);

    /* renamed from: h */
    private final int[] f10379h = new int[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public h30(C2571hz c2571hz, int i, int i2, int i3, int i4, float f, InterfaceC2790iw interfaceC2790iw) {
        this.f10372a = c2571hz;
        this.f10374c = i;
        this.f10375d = i2;
        this.f10376e = i3;
        this.f10377f = i4;
        this.f10378g = f;
        this.f10380i = interfaceC2790iw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r2[1] <= r12) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r10 >= r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        if (r0.m12295b(r11, r10) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (r2[2] > r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        r2[2] = r2[2] + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r2[2] <= r12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if ((java.lang.Math.abs(((r2[0] + r2[1]) + r2[2]) - r13) * 5) < (r13 * 2)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
    
        if (m12090a(r2) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
    
        return m12088a(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return Float.NaN;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float m12087a(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            hz r0 = r9.f10372a
            int r1 = r0.m12297c()
            int[] r2 = r9.f10379h
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r5 = 2
            r2[r5] = r3
            r6 = r10
        L12:
            if (r6 < 0) goto L26
            boolean r7 = r0.m12295b(r11, r6)
            if (r7 == 0) goto L26
            r7 = r2[r4]
            if (r7 > r12) goto L26
            r7 = r2[r4]
            int r7 = r7 + r4
            r2[r4] = r7
            int r6 = r6 + (-1)
            goto L12
        L26:
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r6 < 0) goto L9c
            r8 = r2[r4]
            if (r8 <= r12) goto L30
            goto L9c
        L30:
            if (r6 < 0) goto L44
            boolean r8 = r0.m12295b(r11, r6)
            if (r8 != 0) goto L44
            r8 = r2[r3]
            if (r8 > r12) goto L44
            r8 = r2[r3]
            int r8 = r8 + r4
            r2[r3] = r8
            int r6 = r6 + (-1)
            goto L30
        L44:
            r6 = r2[r3]
            if (r6 <= r12) goto L49
            return r7
        L49:
            int r10 = r10 + r4
        L4a:
            if (r10 >= r1) goto L5e
            boolean r6 = r0.m12295b(r11, r10)
            if (r6 == 0) goto L5e
            r6 = r2[r4]
            if (r6 > r12) goto L5e
            r6 = r2[r4]
            int r6 = r6 + r4
            r2[r4] = r6
            int r10 = r10 + 1
            goto L4a
        L5e:
            if (r10 == r1) goto L9c
            r6 = r2[r4]
            if (r6 <= r12) goto L65
            goto L9c
        L65:
            if (r10 >= r1) goto L79
            boolean r6 = r0.m12295b(r11, r10)
            if (r6 != 0) goto L79
            r6 = r2[r5]
            if (r6 > r12) goto L79
            r6 = r2[r5]
            int r6 = r6 + r4
            r2[r5] = r6
            int r10 = r10 + 1
            goto L65
        L79:
            r11 = r2[r5]
            if (r11 <= r12) goto L7e
            return r7
        L7e:
            r11 = r2[r3]
            r12 = r2[r4]
            int r11 = r11 + r12
            r12 = r2[r5]
            int r11 = r11 + r12
            int r11 = r11 - r13
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 * 5
            int r13 = r13 * 2
            if (r11 < r13) goto L92
            return r7
        L92:
            boolean r11 = r9.m12090a(r2)
            if (r11 == 0) goto L9c
            float r7 = m12088a(r2, r10)
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h30.m12087a(int, int, int, int):float");
    }

    /* renamed from: a */
    private static float m12088a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* renamed from: a */
    private g30 m12089a(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float m12088a = m12088a(iArr, i2);
        float m12087a = m12087a(i, (int) m12088a, iArr[1] * 2, i3);
        if (Float.isNaN(m12087a)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (g30 g30Var : this.f10373b) {
            if (g30Var.m11880a(f, m12087a, m12088a)) {
                return g30Var.m11881b(m12087a, m12088a, f);
            }
        }
        g30 g30Var2 = new g30(m12088a, m12087a, f);
        this.f10373b.add(g30Var2);
        InterfaceC2790iw interfaceC2790iw = this.f10380i;
        if (interfaceC2790iw == null) {
            return null;
        }
        interfaceC2790iw.mo10907a(g30Var2);
        return null;
    }

    /* renamed from: a */
    private boolean m12090a(int[] iArr) {
        float f = this.f10378g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public g30 m12091a() {
        g30 m12089a;
        g30 m12089a2;
        int i = this.f10374c;
        int i2 = this.f10377f;
        int i3 = this.f10376e + i;
        int i4 = this.f10375d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f10372a.m12295b(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f10372a.m12295b(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else {
                    if (m12090a(iArr) && (m12089a2 = m12089a(iArr, i6, i7)) != null) {
                        return m12089a2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m12090a(iArr) && (m12089a = m12089a(iArr, i6, i3)) != null) {
                return m12089a;
            }
        }
        if (this.f10373b.isEmpty()) {
            throw C0438aw.m3194a();
        }
        return this.f10373b.get(0);
    }
}
