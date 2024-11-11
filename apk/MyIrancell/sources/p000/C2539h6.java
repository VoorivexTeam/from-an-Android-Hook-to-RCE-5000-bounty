package p000;

/* renamed from: h6 */
/* loaded from: classes.dex */
public class C2539h6<T> {

    /* renamed from: a */
    T f10398a;

    /* renamed from: b */
    T f10399b;

    /* renamed from: b */
    private static boolean m12136b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public void m12137a(T t, T t2) {
        this.f10398a = t;
        this.f10399b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3231t1)) {
            return false;
        }
        C3231t1 c3231t1 = (C3231t1) obj;
        return m12136b(c3231t1.f13167a, this.f10398a) && m12136b(c3231t1.f13168b, this.f10399b);
    }

    public int hashCode() {
        T t = this.f10398a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f10399b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f10398a) + " " + String.valueOf(this.f10399b) + "}";
    }
}
