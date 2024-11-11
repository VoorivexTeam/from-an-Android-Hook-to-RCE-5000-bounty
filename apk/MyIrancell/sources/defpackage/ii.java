package defpackage;

/* loaded from: classes.dex */
public class ii {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public ii() {
    }

    public ii(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ii.class != obj.getClass()) {
            return false;
        }
        ii iiVar = (ii) obj;
        return this.a.equals(iiVar.a) && this.b.equals(iiVar.b) && ki.b(this.c, iiVar.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
