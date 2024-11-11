package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o10 extends s10 {
    private final String c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o10(gz gzVar, String str, String str2) {
        super(gzVar);
        this.c = str2;
        this.d = str;
    }

    private void c(StringBuilder sb, int i) {
        int a = a().a(i, 16);
        if (a == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.c);
        sb.append(')');
        int i2 = a % 32;
        int i3 = a / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i5);
        if (i4 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i4);
        if (i2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i2);
    }

    @Override // defpackage.s10
    protected int a(int i) {
        return i % 100000;
    }

    @Override // defpackage.s10
    protected void b(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // defpackage.t10
    public String c() {
        if (b().c() != 84) {
            throw aw.a();
        }
        StringBuilder sb = new StringBuilder();
        a(sb, 8);
        b(sb, 48, 20);
        c(sb, 68);
        return sb.toString();
    }
}
