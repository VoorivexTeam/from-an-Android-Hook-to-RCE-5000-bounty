package p000;

import java.util.List;

/* renamed from: qk */
/* loaded from: classes.dex */
final class C3130qk extends AbstractC3401wk {

    /* renamed from: a */
    private final List<AbstractC2393dl> f12820a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3130qk(List<AbstractC2393dl> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f12820a = list;
    }

    @Override // p000.AbstractC3401wk
    /* renamed from: a */
    public List<AbstractC2393dl> mo15126a() {
        return this.f12820a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3401wk) {
            return this.f12820a.equals(((AbstractC3401wk) obj).mo15126a());
        }
        return false;
    }

    public int hashCode() {
        return this.f12820a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f12820a + "}";
    }
}
