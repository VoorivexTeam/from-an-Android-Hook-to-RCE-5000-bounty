package androidx.lifecycle;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public class C0311q {

    /* renamed from: a */
    private final a f1921a;

    /* renamed from: b */
    private final C0312r f1922b;

    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        <T extends AbstractC0310p> T mo2071a(Class<T> cls);
    }

    public C0311q(C0312r c0312r, a aVar) {
        this.f1921a = aVar;
        this.f1922b = c0312r;
    }

    /* renamed from: a */
    public <T extends AbstractC0310p> T m2069a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m2070a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* renamed from: a */
    public <T extends AbstractC0310p> T m2070a(String str, Class<T> cls) {
        T t = (T) this.f1922b.m2072a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f1921a.mo2071a(cls);
        this.f1922b.m2074a(str, t2);
        return t2;
    }
}
