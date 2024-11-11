package defpackage;

/* loaded from: classes.dex */
public final class o00 extends y00 {
    private final int[] h = new int[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.y00
    public int a(gz gzVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int c = gzVar.c();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < c; i2++) {
            sb.append((char) (y00.a(gzVar, iArr2, i, y00.f) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = y00.a(gzVar, i, true, y00.e)[1];
        for (int i5 = 0; i5 < 4 && i4 < c; i5++) {
            sb.append((char) (y00.a(gzVar, iArr2, i4, y00.f) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // defpackage.y00
    sv b() {
        return sv.EAN_8;
    }
}
