package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c20 {
    private final gz a;
    private final w10 b = new w10();
    private final StringBuilder c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c20(gz gzVar) {
        this.a = gzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(gz gzVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (gzVar.a(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    private v10 a() {
        while (g(this.b.a())) {
            x10 a = a(this.b.a());
            this.b.b(a.a());
            if (a.c()) {
                return new v10(new y10(this.b.a(), this.c.toString()), true);
            }
            this.c.append(a.b());
        }
        if (d(this.b.a())) {
            this.b.a(3);
            this.b.f();
        } else if (e(this.b.a())) {
            if (this.b.a() + 5 < this.a.c()) {
                this.b.a(5);
            } else {
                this.b.b(this.a.c());
            }
            this.b.e();
        }
        return new v10(false);
    }

    private x10 a(int i) {
        char c;
        int a = a(i, 5);
        if (a == 15) {
            return new x10(i + 5, '$');
        }
        if (a >= 5 && a < 15) {
            return new x10(i + 5, (char) ((a + 48) - 5));
        }
        int a2 = a(i, 6);
        if (a2 >= 32 && a2 < 58) {
            return new x10(i + 6, (char) (a2 + 33));
        }
        switch (a2) {
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
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + a2);
        }
        return new x10(i + 6, c);
    }

    private x10 b(int i) {
        char c;
        int a = a(i, 5);
        if (a == 15) {
            return new x10(i + 5, '$');
        }
        if (a >= 5 && a < 15) {
            return new x10(i + 5, (char) ((a + 48) - 5));
        }
        int a2 = a(i, 7);
        if (a2 >= 64 && a2 < 90) {
            return new x10(i + 7, (char) (a2 + 1));
        }
        if (a2 >= 90 && a2 < 116) {
            return new x10(i + 7, (char) (a2 + 7));
        }
        switch (a(i, 8)) {
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
                throw xv.a();
        }
        return new x10(i + 8, c);
    }

    private y10 b() {
        v10 a;
        boolean b;
        do {
            int a2 = this.b.a();
            a = this.b.b() ? a() : this.b.c() ? c() : d();
            b = a.b();
            if (!(a2 != this.b.a()) && !b) {
                break;
            }
        } while (!b);
        return a.a();
    }

    private v10 c() {
        while (h(this.b.a())) {
            x10 b = b(this.b.a());
            this.b.b(b.a());
            if (b.c()) {
                return new v10(new y10(this.b.a(), this.c.toString()), true);
            }
            this.c.append(b.b());
        }
        if (d(this.b.a())) {
            this.b.a(3);
            this.b.f();
        } else if (e(this.b.a())) {
            if (this.b.a() + 5 < this.a.c()) {
                this.b.a(5);
            } else {
                this.b.b(this.a.c());
            }
            this.b.d();
        }
        return new v10(false);
    }

    private z10 c(int i) {
        int i2 = i + 7;
        if (i2 > this.a.c()) {
            int a = a(i, 4);
            return a == 0 ? new z10(this.a.c(), 10, 10) : new z10(this.a.c(), a - 1, 10);
        }
        int a2 = a(i, 7) - 8;
        return new z10(i2, a2 / 11, a2 % 11);
    }

    private v10 d() {
        while (i(this.b.a())) {
            z10 c = c(this.b.a());
            this.b.b(c.a());
            if (c.d()) {
                return new v10(c.e() ? new y10(this.b.a(), this.c.toString()) : new y10(this.b.a(), this.c.toString(), c.c()), true);
            }
            this.c.append(c.b());
            if (c.e()) {
                return new v10(new y10(this.b.a(), this.c.toString()), true);
            }
            this.c.append(c.c());
        }
        if (f(this.b.a())) {
            this.b.d();
            this.b.a(4);
        }
        return new v10(false);
    }

    private boolean d(int i) {
        int i2 = i + 3;
        if (i2 > this.a.c()) {
            return false;
        }
        while (i < i2) {
            if (this.a.a(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean e(int i) {
        int i2;
        if (i + 1 > this.a.c()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.a.c(); i3++) {
            if (i3 == 2) {
                if (!this.a.a(i + 2)) {
                    return false;
                }
            } else if (this.a.a(i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean f(int i) {
        int i2;
        if (i + 1 > this.a.c()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.a.c(); i3++) {
            if (this.a.a(i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean g(int i) {
        int a;
        if (i + 5 > this.a.c()) {
            return false;
        }
        int a2 = a(i, 5);
        if (a2 < 5 || a2 >= 16) {
            return i + 6 <= this.a.c() && (a = a(i, 6)) >= 16 && a < 63;
        }
        return true;
    }

    private boolean h(int i) {
        int a;
        if (i + 5 > this.a.c()) {
            return false;
        }
        int a2 = a(i, 5);
        if (a2 >= 5 && a2 < 16) {
            return true;
        }
        if (i + 7 > this.a.c()) {
            return false;
        }
        int a3 = a(i, 7);
        if (a3 < 64 || a3 >= 116) {
            return i + 8 <= this.a.c() && (a = a(i, 8)) >= 232 && a < 253;
        }
        return true;
    }

    private boolean i(int i) {
        if (i + 7 > this.a.c()) {
            return i + 4 <= this.a.c();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.a.a(i3);
            }
            if (this.a.a(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i, int i2) {
        return a(this.a, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            y10 a = a(i, str);
            String a2 = b20.a(a.b());
            if (a2 != null) {
                sb.append(a2);
            }
            String valueOf = a.d() ? String.valueOf(a.c()) : null;
            if (i == a.a()) {
                return sb.toString();
            }
            i = a.a();
            str = valueOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y10 a(int i, String str) {
        this.c.setLength(0);
        if (str != null) {
            this.c.append(str);
        }
        this.b.b(i);
        y10 b = b();
        return (b == null || !b.d()) ? new y10(this.b.a(), this.c.toString()) : new y10(this.b.a(), this.c.toString(), b.c());
    }
}
