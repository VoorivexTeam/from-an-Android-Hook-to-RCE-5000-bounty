package androidx.lifecycle;

/* loaded from: classes.dex */
public class q {
    private final a a;
    private final r b;

    /* loaded from: classes.dex */
    public interface a {
        <T extends p> T a(Class<T> cls);
    }

    public q(r rVar, a aVar) {
        this.a = aVar;
        this.b = rVar;
    }

    public <T extends p> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends p> T a(String str, Class<T> cls) {
        T t = (T) this.b.a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.a.a(cls);
        this.b.a(str, t2);
        return t2;
    }
}
