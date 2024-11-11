package p000;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o10 extends s10 {

    /* renamed from: c */
    private final String f12384c;

    /* renamed from: d */
    private final String f12385d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o10(C2531gz c2531gz, String str, String str2) {
        super(c2531gz);
        this.f12384c = str2;
        this.f12385d = str;
    }

    /* renamed from: c */
    private void m14412c(StringBuilder sb, int i) {
        int m3541a = m15481a().m3541a(i, 16);
        if (m3541a == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.f12384c);
        sb.append(')');
        int i2 = m3541a % 32;
        int i3 = m3541a / 32;
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

    @Override // p000.s10
    /* renamed from: a */
    protected int mo13537a(int i) {
        return i % 100000;
    }

    @Override // p000.s10
    /* renamed from: b */
    protected void mo13538b(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f12385d);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // p000.t10
    /* renamed from: c */
    public String mo13993c() {
        if (m15482b().m12052c() != 84) {
            throw C0438aw.m3194a();
        }
        StringBuilder sb = new StringBuilder();
        m15166a(sb, 8);
        m15320b(sb, 48, 20);
        m14412c(sb, 68);
        return sb.toString();
    }
}
