package p000;

/* loaded from: classes.dex */
final class w10 {

    /* renamed from: a */
    private int f13733a = 0;

    /* renamed from: b */
    private EnumC3381a f13734b = EnumC3381a.NUMERIC;

    /* renamed from: w10$a */
    /* loaded from: classes.dex */
    private enum EnumC3381a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m16104a() {
        return this.f13733a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16105a(int i) {
        this.f13733a += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m16106b(int i) {
        this.f13733a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m16107b() {
        return this.f13734b == EnumC3381a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m16108c() {
        return this.f13734b == EnumC3381a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m16109d() {
        this.f13734b = EnumC3381a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m16110e() {
        this.f13734b = EnumC3381a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m16111f() {
        this.f13734b = EnumC3381a.NUMERIC;
    }
}
