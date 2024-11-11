package p000;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c20 {

    /* renamed from: a */
    private final C2531gz f2900a;

    /* renamed from: b */
    private final w10 f2901b = new w10();

    /* renamed from: c */
    private final StringBuilder f2902c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c20(C2531gz c2531gz) {
        this.f2900a = c2531gz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m3527a(C2531gz c2531gz, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (c2531gz.m12048a(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    private v10 m3528a() {
        while (m3538g(this.f2901b.m16104a())) {
            x10 m3529a = m3529a(this.f2901b.m16104a());
            this.f2901b.m16106b(m3529a.m40a());
            if (m3529a.m16413c()) {
                return new v10(new y10(this.f2901b.m16104a(), this.f2902c.toString()), true);
            }
            this.f2902c.append(m3529a.m16412b());
        }
        if (m3535d(this.f2901b.m16104a())) {
            this.f2901b.m16105a(3);
            this.f2901b.m16111f();
        } else if (m3536e(this.f2901b.m16104a())) {
            if (this.f2901b.m16104a() + 5 < this.f2900a.m12052c()) {
                this.f2901b.m16105a(5);
            } else {
                this.f2901b.m16106b(this.f2900a.m12052c());
            }
            this.f2901b.m16110e();
        }
        return new v10(false);
    }

    /* renamed from: a */
    private x10 m3529a(int i) {
        char c;
        int m3541a = m3541a(i, 5);
        if (m3541a == 15) {
            return new x10(i + 5, '$');
        }
        if (m3541a >= 5 && m3541a < 15) {
            return new x10(i + 5, (char) ((m3541a + 48) - 5));
        }
        int m3541a2 = m3541a(i, 6);
        if (m3541a2 >= 32 && m3541a2 < 58) {
            return new x10(i + 6, (char) (m3541a2 + 33));
        }
        switch (m3541a2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + m3541a2);
        }
        return new x10(i + 6, c);
    }

    /* renamed from: b */
    private x10 m3530b(int i) {
        char c;
        int m3541a = m3541a(i, 5);
        if (m3541a == 15) {
            return new x10(i + 5, '$');
        }
        if (m3541a >= 5 && m3541a < 15) {
            return new x10(i + 5, (char) ((m3541a + 48) - 5));
        }
        int m3541a2 = m3541a(i, 7);
        if (m3541a2 >= 64 && m3541a2 < 90) {
            return new x10(i + 7, (char) (m3541a2 + 1));
        }
        if (m3541a2 >= 90 && m3541a2 < 116) {
            return new x10(i + 7, (char) (m3541a2 + 7));
        }
        switch (m3541a(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C3452xv.m16518a();
        }
        return new x10(i + 8, c);
    }

    /* renamed from: b */
    private y10 m3531b() {
        v10 m3528a;
        boolean m15896b;
        do {
            int m16104a = this.f2901b.m16104a();
            m3528a = this.f2901b.m16107b() ? m3528a() : this.f2901b.m16108c() ? m3532c() : m3534d();
            m15896b = m3528a.m15896b();
            if (!(m16104a != this.f2901b.m16104a()) && !m15896b) {
                break;
            }
        } while (!m15896b);
        return m3528a.m15895a();
    }

    /* renamed from: c */
    private v10 m3532c() {
        while (m3539h(this.f2901b.m16104a())) {
            x10 m3530b = m3530b(this.f2901b.m16104a());
            this.f2901b.m16106b(m3530b.m40a());
            if (m3530b.m16413c()) {
                return new v10(new y10(this.f2901b.m16104a(), this.f2902c.toString()), true);
            }
            this.f2902c.append(m3530b.m16412b());
        }
        if (m3535d(this.f2901b.m16104a())) {
            this.f2901b.m16105a(3);
            this.f2901b.m16111f();
        } else if (m3536e(this.f2901b.m16104a())) {
            if (this.f2901b.m16104a() + 5 < this.f2900a.m12052c()) {
                this.f2901b.m16105a(5);
            } else {
                this.f2901b.m16106b(this.f2900a.m12052c());
            }
            this.f2901b.m16109d();
        }
        return new v10(false);
    }

    /* renamed from: c */
    private z10 m3533c(int i) {
        int i2 = i + 7;
        if (i2 > this.f2900a.m12052c()) {
            int m3541a = m3541a(i, 4);
            return m3541a == 0 ? new z10(this.f2900a.m12052c(), 10, 10) : new z10(this.f2900a.m12052c(), m3541a - 1, 10);
        }
        int m3541a2 = m3541a(i, 7) - 8;
        return new z10(i2, m3541a2 / 11, m3541a2 % 11);
    }

    /* renamed from: d */
    private v10 m3534d() {
        while (m3540i(this.f2901b.m16104a())) {
            z10 m3533c = m3533c(this.f2901b.m16104a());
            this.f2901b.m16106b(m3533c.m40a());
            if (m3533c.m16706d()) {
                return new v10(m3533c.m16707e() ? new y10(this.f2901b.m16104a(), this.f2902c.toString()) : new y10(this.f2901b.m16104a(), this.f2902c.toString(), m3533c.m16705c()), true);
            }
            this.f2902c.append(m3533c.m16704b());
            if (m3533c.m16707e()) {
                return new v10(new y10(this.f2901b.m16104a(), this.f2902c.toString()), true);
            }
            this.f2902c.append(m3533c.m16705c());
        }
        if (m3537f(this.f2901b.m16104a())) {
            this.f2901b.m16109d();
            this.f2901b.m16105a(4);
        }
        return new v10(false);
    }

    /* renamed from: d */
    private boolean m3535d(int i) {
        int i2 = i + 3;
        if (i2 > this.f2900a.m12052c()) {
            return false;
        }
        while (i < i2) {
            if (this.f2900a.m12048a(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m3536e(int i) {
        int i2;
        if (i + 1 > this.f2900a.m12052c()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f2900a.m12052c(); i3++) {
            if (i3 == 2) {
                if (!this.f2900a.m12048a(i + 2)) {
                    return false;
                }
            } else if (this.f2900a.m12048a(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private boolean m3537f(int i) {
        int i2;
        if (i + 1 > this.f2900a.m12052c()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f2900a.m12052c(); i3++) {
            if (this.f2900a.m12048a(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private boolean m3538g(int i) {
        int m3541a;
        if (i + 5 > this.f2900a.m12052c()) {
            return false;
        }
        int m3541a2 = m3541a(i, 5);
        if (m3541a2 < 5 || m3541a2 >= 16) {
            return i + 6 <= this.f2900a.m12052c() && (m3541a = m3541a(i, 6)) >= 16 && m3541a < 63;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m3539h(int i) {
        int m3541a;
        if (i + 5 > this.f2900a.m12052c()) {
            return false;
        }
        int m3541a2 = m3541a(i, 5);
        if (m3541a2 >= 5 && m3541a2 < 16) {
            return true;
        }
        if (i + 7 > this.f2900a.m12052c()) {
            return false;
        }
        int m3541a3 = m3541a(i, 7);
        if (m3541a3 < 64 || m3541a3 >= 116) {
            return i + 8 <= this.f2900a.m12052c() && (m3541a = m3541a(i, 8)) >= 232 && m3541a < 253;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m3540i(int i) {
        if (i + 7 > this.f2900a.m12052c()) {
            return i + 4 <= this.f2900a.m12052c();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f2900a.m12048a(i3);
            }
            if (this.f2900a.m12048a(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m3541a(int i, int i2) {
        return m3527a(this.f2900a, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m3542a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            y10 m3543a = m3543a(i, str);
            String m3273a = b20.m3273a(m3543a.m16549b());
            if (m3273a != null) {
                sb.append(m3273a);
            }
            String valueOf = m3543a.m16551d() ? String.valueOf(m3543a.m16550c()) : null;
            if (i == m3543a.m40a()) {
                return sb.toString();
            }
            i = m3543a.m40a();
            str = valueOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public y10 m3543a(int i, String str) {
        this.f2902c.setLength(0);
        if (str != null) {
            this.f2902c.append(str);
        }
        this.f2901b.m16106b(i);
        y10 m3531b = m3531b();
        return (m3531b == null || !m3531b.m16551d()) ? new y10(this.f2901b.m16104a(), this.f2902c.toString()) : new y10(this.f2901b.m16104a(), this.f2902c.toString(), m3531b.m16550c());
    }
}
