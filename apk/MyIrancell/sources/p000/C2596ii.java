package p000;

/* renamed from: ii */
/* loaded from: classes.dex */
public class C2596ii {

    /* renamed from: a */
    private Class<?> f10627a;

    /* renamed from: b */
    private Class<?> f10628b;

    /* renamed from: c */
    private Class<?> f10629c;

    public C2596ii() {
    }

    public C2596ii(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m12458a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void m12458a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f10627a = cls;
        this.f10628b = cls2;
        this.f10629c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2596ii.class != obj.getClass()) {
            return false;
        }
        C2596ii c2596ii = (C2596ii) obj;
        return this.f10627a.equals(c2596ii.f10627a) && this.f10628b.equals(c2596ii.f10628b) && C2861ki.m13733b(this.f10629c, c2596ii.f10629c);
    }

    public int hashCode() {
        int hashCode = ((this.f10627a.hashCode() * 31) + this.f10628b.hashCode()) * 31;
        Class<?> cls = this.f10629c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f10627a + ", second=" + this.f10628b + '}';
    }
}
