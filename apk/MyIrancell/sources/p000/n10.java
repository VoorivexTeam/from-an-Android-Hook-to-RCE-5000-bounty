package p000;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n10 extends r10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n10(C2531gz c2531gz) {
        super(c2531gz);
    }

    @Override // p000.t10
    /* renamed from: c */
    public String mo13993c() {
        if (m15482b().m12052c() < 48) {
            throw C0438aw.m3194a();
        }
        StringBuilder sb = new StringBuilder();
        m15166a(sb, 8);
        int m3541a = m15481a().m3541a(48, 2);
        sb.append("(393");
        sb.append(m3541a);
        sb.append(')');
        int m3541a2 = m15481a().m3541a(50, 10);
        if (m3541a2 / 100 == 0) {
            sb.append('0');
        }
        if (m3541a2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(m3541a2);
        sb.append(m15481a().m3543a(60, (String) null).m16549b());
        return sb.toString();
    }
}
