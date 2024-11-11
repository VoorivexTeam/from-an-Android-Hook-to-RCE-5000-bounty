package p000;

import java.util.Map;

/* loaded from: classes.dex */
public final class a30 {

    /* renamed from: a */
    private final C3416wz f27a = new C3416wz(C3324uz.f13520l);

    /* renamed from: a */
    private C2878kz m43a(w20 w20Var, Map<EnumC3412wv, ?> map) {
        f30 m16117d = w20Var.m16117d();
        b30 m3549b = w20Var.m16116c().m3549b();
        x20[] m16414a = x20.m16414a(w20Var.m16115b(), m16117d, m3549b);
        int i = 0;
        for (x20 x20Var : m16414a) {
            i += x20Var.m16416b();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (x20 x20Var2 : m16414a) {
            byte[] m16415a = x20Var2.m16415a();
            int m16416b = x20Var2.m16416b();
            m44a(m16415a, m16416b);
            int i3 = 0;
            while (i3 < m16416b) {
                bArr[i2] = m16415a[i3];
                i3++;
                i2++;
            }
        }
        return z20.m16712a(bArr, m16117d, m3549b, map);
    }

    /* renamed from: a */
    private void m44a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f27a.m16405a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C3456xz unused) {
            throw C3373vv.m16057a();
        }
    }

    /* renamed from: a */
    public C2878kz m45a(C2571hz c2571hz, Map<EnumC3412wv, ?> map) {
        C3373vv e;
        w20 w20Var = new w20(c2571hz);
        C3452xv c3452xv = null;
        try {
            return m43a(w20Var, map);
        } catch (C3373vv e2) {
            e = e2;
            try {
                w20Var.m16118e();
                w20Var.m16114a(true);
                w20Var.m16117d();
                w20Var.m16116c();
                w20Var.m16113a();
                C2878kz m43a = m43a(w20Var, map);
                m43a.m13755a(new e30(true));
                return m43a;
            } catch (C3373vv | C3452xv e3) {
                if (c3452xv != null) {
                    throw c3452xv;
                }
                if (e != null) {
                    throw e;
                }
                throw e3;
            }
        } catch (C3452xv e4) {
            e = null;
            c3452xv = e4;
            w20Var.m16118e();
            w20Var.m16114a(true);
            w20Var.m16117d();
            w20Var.m16116c();
            w20Var.m16113a();
            C2878kz m43a2 = m43a(w20Var, map);
            m43a2.m13755a(new e30(true));
            return m43a2;
        }
    }
}
