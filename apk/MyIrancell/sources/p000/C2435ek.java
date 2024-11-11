package p000;

/* renamed from: ek */
/* loaded from: classes.dex */
final class C2435ek<T> extends AbstractC2516gk<T> {

    /* renamed from: a */
    private final Integer f10024a;

    /* renamed from: b */
    private final T f10025b;

    /* renamed from: c */
    private final EnumC2556hk f10026c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2435ek(Integer num, T t, EnumC2556hk enumC2556hk) {
        this.f10024a = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.f10025b = t;
        if (enumC2556hk == null) {
            throw new NullPointerException("Null priority");
        }
        this.f10026c = enumC2556hk;
    }

    @Override // p000.AbstractC2516gk
    /* renamed from: a */
    public Integer mo11623a() {
        return this.f10024a;
    }

    @Override // p000.AbstractC2516gk
    /* renamed from: b */
    public T mo11624b() {
        return this.f10025b;
    }

    @Override // p000.AbstractC2516gk
    /* renamed from: c */
    public EnumC2556hk mo11625c() {
        return this.f10026c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2516gk)) {
            return false;
        }
        AbstractC2516gk abstractC2516gk = (AbstractC2516gk) obj;
        Integer num = this.f10024a;
        if (num != null ? num.equals(abstractC2516gk.mo11623a()) : abstractC2516gk.mo11623a() == null) {
            if (this.f10025b.equals(abstractC2516gk.mo11624b()) && this.f10026c.equals(abstractC2516gk.mo11625c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f10024a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f10025b.hashCode()) * 1000003) ^ this.f10026c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f10024a + ", payload=" + this.f10025b + ", priority=" + this.f10026c + "}";
    }
}
