package defpackage;

/* loaded from: classes.dex */
final class ek<T> extends gk<T> {
    private final Integer a;
    private final T b;
    private final hk c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ek(Integer num, T t, hk hkVar) {
        this.a = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = t;
        if (hkVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = hkVar;
    }

    @Override // defpackage.gk
    public Integer a() {
        return this.a;
    }

    @Override // defpackage.gk
    public T b() {
        return this.b;
    }

    @Override // defpackage.gk
    public hk c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        Integer num = this.a;
        if (num != null ? num.equals(gkVar.a()) : gkVar.a() == null) {
            if (this.b.equals(gkVar.b()) && this.c.equals(gkVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
