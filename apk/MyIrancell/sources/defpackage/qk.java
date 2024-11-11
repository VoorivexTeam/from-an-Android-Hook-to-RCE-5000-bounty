package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class qk extends wk {
    private final List<dl> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qk(List<dl> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.a = list;
    }

    @Override // defpackage.wk
    public List<dl> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wk) {
            return this.a.equals(((wk) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
