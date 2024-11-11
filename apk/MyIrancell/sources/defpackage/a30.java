package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class a30 {
    private final wz a = new wz(uz.l);

    private kz a(w20 w20Var, Map<wv, ?> map) {
        f30 d = w20Var.d();
        b30 b = w20Var.c().b();
        x20[] a = x20.a(w20Var.b(), d, b);
        int i = 0;
        for (x20 x20Var : a) {
            i += x20Var.b();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (x20 x20Var2 : a) {
            byte[] a2 = x20Var2.a();
            int b2 = x20Var2.b();
            a(a2, b2);
            int i3 = 0;
            while (i3 < b2) {
                bArr[i2] = a2[i3];
                i3++;
                i2++;
            }
        }
        return z20.a(bArr, d, b, map);
    }

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

    public kz a(hz hzVar, Map<wv, ?> map) {
        vv e;
        w20 w20Var = new w20(hzVar);
        xv xvVar = null;
        try {
            return a(w20Var, map);
        } catch (vv e2) {
            e = e2;
            try {
                w20Var.e();
                w20Var.a(true);
                w20Var.d();
                w20Var.c();
                w20Var.a();
                kz a = a(w20Var, map);
                a.a(new e30(true));
                return a;
            } catch (vv | xv e3) {
                if (xvVar != null) {
                    throw xvVar;
                }
                if (e != null) {
                    throw e;
                }
                throw e3;
            }
        } catch (xv e4) {
            e = null;
            xvVar = e4;
            w20Var.e();
            w20Var.a(true);
            w20Var.d();
            w20Var.c();
            w20Var.a();
            kz a2 = a(w20Var, map);
            a2.a(new e30(true));
            return a2;
        }
    }
}
