package defpackage;

/* loaded from: classes.dex */
public final class c00 {
    private final wz a = new wz(uz.m);

    private void a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (xz unused) {
            throw vv.a();
        }
    }

    public kz a(hz hzVar) {
        zz zzVar = new zz(hzVar);
        a00[] a = a00.a(zzVar.b(), zzVar.a());
        int length = a.length;
        int i = 0;
        for (a00 a00Var : a) {
            i += a00Var.b();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2++) {
            a00 a00Var2 = a[i2];
            byte[] a2 = a00Var2.a();
            int b = a00Var2.b();
            a(a2, b);
            for (int i3 = 0; i3 < b; i3++) {
                bArr[(i3 * length) + i2] = a2[i3];
            }
        }
        return b00.a(bArr);
    }
}
