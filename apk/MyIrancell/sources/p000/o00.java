package p000;

/* loaded from: classes.dex */
public final class o00 extends y00 {

    /* renamed from: h */
    private final int[] f12375h = new int[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.y00
    /* renamed from: a */
    public int mo14222a(C2531gz c2531gz, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f12375h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12052c = c2531gz.m12052c();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < m12052c; i2++) {
            sb.append((char) (y00.m16536a(c2531gz, iArr2, i, y00.f14085f) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = y00.m16539a(c2531gz, i, true, y00.f14084e)[1];
        for (int i5 = 0; i5 < 4 && i4 < m12052c; i5++) {
            sb.append((char) (y00.m16536a(c2531gz, iArr2, i4, y00.f14085f) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // p000.y00
    /* renamed from: b */
    EnumC3224sv mo14223b() {
        return EnumC3224sv.EAN_8;
    }
}
