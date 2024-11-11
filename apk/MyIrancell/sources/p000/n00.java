package p000;

/* loaded from: classes.dex */
public final class n00 extends y00 {

    /* renamed from: i */
    static final int[] f12209i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h */
    private final int[] f12210h = new int[4];

    /* renamed from: a */
    private static void m14221a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f12209i[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C0438aw.m3194a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.y00
    /* renamed from: a */
    public int mo14222a(C2531gz c2531gz, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f12210h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12052c = c2531gz.m12052c();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m12052c; i3++) {
            int m16536a = y00.m16536a(c2531gz, iArr2, i, y00.f14086g);
            sb.append((char) ((m16536a % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m16536a >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m14221a(sb, i2);
        int i5 = y00.m16539a(c2531gz, i, true, y00.f14084e)[1];
        for (int i6 = 0; i6 < 6 && i5 < m12052c; i6++) {
            sb.append((char) (y00.m16536a(c2531gz, iArr2, i5, y00.f14085f) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // p000.y00
    /* renamed from: b */
    EnumC3224sv mo14223b() {
        return EnumC3224sv.EAN_13;
    }
}
