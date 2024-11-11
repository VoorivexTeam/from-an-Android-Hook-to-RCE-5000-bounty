package p000;

/* renamed from: t1 */
/* loaded from: classes.dex */
public class C3231t1<F, S> {

    /* renamed from: a */
    public final F f13167a;

    /* renamed from: b */
    public final S f13168b;

    public C3231t1(F f, S s) {
        this.f13167a = f;
        this.f13168b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3231t1)) {
            return false;
        }
        C3231t1 c3231t1 = (C3231t1) obj;
        return C3187s1.m15319a(c3231t1.f13167a, this.f13167a) && C3187s1.m15319a(c3231t1.f13168b, this.f13168b);
    }

    public int hashCode() {
        F f = this.f13167a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f13168b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f13167a) + " " + String.valueOf(this.f13168b) + "}";
    }
}
