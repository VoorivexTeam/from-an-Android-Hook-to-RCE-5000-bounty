package p000;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pm */
/* loaded from: classes.dex */
public final class C3090pm extends AbstractC3364vm {

    /* renamed from: a */
    private final long f12628a;

    /* renamed from: b */
    private final AbstractC3266tl f12629b;

    /* renamed from: c */
    private final AbstractC3089pl f12630c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3090pm(long j, AbstractC3266tl abstractC3266tl, AbstractC3089pl abstractC3089pl) {
        this.f12628a = j;
        if (abstractC3266tl == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f12629b = abstractC3266tl;
        if (abstractC3089pl == null) {
            throw new NullPointerException("Null event");
        }
        this.f12630c = abstractC3089pl;
    }

    @Override // p000.AbstractC3364vm
    /* renamed from: a */
    public AbstractC3089pl mo14810a() {
        return this.f12630c;
    }

    @Override // p000.AbstractC3364vm
    /* renamed from: b */
    public long mo14811b() {
        return this.f12628a;
    }

    @Override // p000.AbstractC3364vm
    /* renamed from: c */
    public AbstractC3266tl mo14812c() {
        return this.f12629b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3364vm)) {
            return false;
        }
        AbstractC3364vm abstractC3364vm = (AbstractC3364vm) obj;
        return this.f12628a == abstractC3364vm.mo14811b() && this.f12629b.equals(abstractC3364vm.mo14812c()) && this.f12630c.equals(abstractC3364vm.mo14810a());
    }

    public int hashCode() {
        long j = this.f12628a;
        return this.f12630c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f12629b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f12628a + ", transportContext=" + this.f12629b + ", event=" + this.f12630c + "}";
    }
}
