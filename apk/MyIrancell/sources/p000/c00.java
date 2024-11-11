package p000;

/* loaded from: classes.dex */
public final class c00 {

    /* renamed from: a */
    private final C3416wz f2892a = new C3416wz(C3324uz.f13521m);

    /* renamed from: a */
    private void m3516a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f2892a.m16405a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C3456xz unused) {
            throw C3373vv.m16057a();
        }
    }

    /* renamed from: a */
    public C2878kz m3517a(C2571hz c2571hz) {
        C3547zz c3547zz = new C3547zz(c2571hz);
        a00[] m16a = a00.m16a(c3547zz.m16975b(), c3547zz.m16970a());
        int length = m16a.length;
        int i = 0;
        for (a00 a00Var : m16a) {
            i += a00Var.m18b();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2++) {
            a00 a00Var2 = m16a[i2];
            byte[] m17a = a00Var2.m17a();
            int m18b = a00Var2.m18b();
            m3516a(m17a, m18b);
            for (int i3 = 0; i3 < m18b; i3++) {
                bArr[(i3 * length) + i2] = m17a[i3];
            }
        }
        return b00.m3261a(bArr);
    }
}
