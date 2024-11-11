package defpackage;

/* loaded from: classes.dex */
public final class n00 extends y00 {
    static final int[] i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private final int[] h = new int[4];

    private static void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            if (i2 == i[i3]) {
                sb.insert(0, (char) (i3 + 48));
                return;
            }
        }
        throw aw.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.y00
    public int a(gz gzVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int c = gzVar.c();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < c; i4++) {
            int a = y00.a(gzVar, iArr2, i2, y00.g);
            sb.append((char) ((a % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (a >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        a(sb, i3);
        int i6 = y00.a(gzVar, i2, true, y00.e)[1];
        for (int i7 = 0; i7 < 6 && i6 < c; i7++) {
            sb.append((char) (y00.a(gzVar, iArr2, i6, y00.f) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    @Override // defpackage.y00
    sv b() {
        return sv.EAN_13;
    }
}
