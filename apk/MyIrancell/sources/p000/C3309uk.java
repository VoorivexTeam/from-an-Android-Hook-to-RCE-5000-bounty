package p000;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: uk */
/* loaded from: classes.dex */
public final class C3309uk extends AbstractC2477fl {

    /* renamed from: a */
    private final long f13495a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3309uk(long j) {
        this.f13495a = j;
    }

    @Override // p000.AbstractC2477fl
    /* renamed from: a */
    public long mo11792a() {
        return this.f13495a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC2477fl) && this.f13495a == ((AbstractC2477fl) obj).mo11792a();
    }

    public int hashCode() {
        long j = this.f13495a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f13495a + "}";
    }
}
