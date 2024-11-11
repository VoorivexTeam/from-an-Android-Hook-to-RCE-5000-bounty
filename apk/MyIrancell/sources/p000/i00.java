package p000;

import java.util.Map;

/* loaded from: classes.dex */
public final class i00 {

    /* renamed from: a */
    private final C3416wz f10541a = new C3416wz(C3324uz.f13523o);

    /* renamed from: a */
    private void m12312a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f10541a.m16405a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (C3456xz unused) {
            throw C3373vv.m16057a();
        }
    }

    /* renamed from: a */
    public C2878kz m12313a(C2571hz c2571hz, Map<EnumC3412wv, ?> map) {
        int i;
        byte[] m11862a = new g00(c2571hz).m11862a();
        m12312a(m11862a, 0, 10, 10, 0);
        int i2 = m11862a[0] & 15;
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            m12312a(m11862a, 20, 84, 40, 1);
            m12312a(m11862a, 20, 84, 40, 2);
            i = 94;
        } else {
            if (i2 != 5) {
                throw C3452xv.m16518a();
            }
            m12312a(m11862a, 20, 68, 56, 1);
            m12312a(m11862a, 20, 68, 56, 2);
            i = 78;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(m11862a, 0, bArr, 0, 10);
        System.arraycopy(m11862a, 20, bArr, 10, bArr.length - 10);
        return h00.m12073a(bArr, i2);
    }
}
