package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class pm extends vm {
    private final long a;
    private final tl b;
    private final pl c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pm(long j, tl tlVar, pl plVar) {
        this.a = j;
        if (tlVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = tlVar;
        if (plVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = plVar;
    }

    @Override // defpackage.vm
    public pl a() {
        return this.c;
    }

    @Override // defpackage.vm
    public long b() {
        return this.a;
    }

    @Override // defpackage.vm
    public tl c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vm)) {
            return false;
        }
        vm vmVar = (vm) obj;
        return this.a == vmVar.b() && this.b.equals(vmVar.c()) && this.c.equals(vmVar.a());
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
