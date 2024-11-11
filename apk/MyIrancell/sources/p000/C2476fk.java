package p000;

/* renamed from: fk */
/* loaded from: classes.dex */
public final class C2476fk {

    /* renamed from: a */
    private final String f10135a;

    private C2476fk(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f10135a = str;
    }

    /* renamed from: a */
    public static C2476fk m11789a(String str) {
        return new C2476fk(str);
    }

    /* renamed from: a */
    public String m11790a() {
        return this.f10135a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2476fk) {
            return this.f10135a.equals(((C2476fk) obj).f10135a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10135a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f10135a + "\"}";
    }
}
