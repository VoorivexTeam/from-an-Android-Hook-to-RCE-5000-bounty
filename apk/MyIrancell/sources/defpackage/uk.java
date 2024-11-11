package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class uk extends fl {
    private final long a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uk(long j) {
        this.a = j;
    }

    @Override // defpackage.fl
    public long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof fl) && this.a == ((fl) obj).a();
    }

    public int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
