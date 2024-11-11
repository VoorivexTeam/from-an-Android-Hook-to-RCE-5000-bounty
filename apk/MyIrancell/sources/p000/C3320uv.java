package p000;

/* renamed from: uv */
/* loaded from: classes.dex */
public final class C3320uv {

    /* renamed from: a */
    private final AbstractC3276tv f13504a;

    /* renamed from: b */
    private C2571hz f13505b;

    public C3320uv(AbstractC3276tv abstractC3276tv) {
        if (abstractC3276tv == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f13504a = abstractC3276tv;
    }

    /* renamed from: a */
    public C2531gz m15854a(int i, C2531gz c2531gz) {
        return this.f13504a.mo14402a(i, c2531gz);
    }

    /* renamed from: a */
    public C2571hz m15855a() {
        if (this.f13505b == null) {
            this.f13505b = this.f13504a.mo14403a();
        }
        return this.f13505b;
    }

    /* renamed from: b */
    public int m15856b() {
        return this.f13504a.m15692b();
    }

    /* renamed from: c */
    public int m15857c() {
        return this.f13504a.m15694d();
    }

    /* renamed from: d */
    public boolean m15858d() {
        return this.f13504a.m15693c().m16667d();
    }

    /* renamed from: e */
    public C3320uv m15859e() {
        this.f13504a.m15693c().m16668e();
        throw null;
    }

    public String toString() {
        try {
            return m15855a().toString();
        } catch (C0438aw unused) {
            return "";
        }
    }
}
