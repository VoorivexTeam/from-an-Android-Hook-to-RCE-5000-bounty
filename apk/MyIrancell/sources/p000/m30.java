package p000;

/* loaded from: classes.dex */
public final class m30<T> implements f70<T> {

    /* renamed from: c */
    private static final Object f12004c = new Object();

    /* renamed from: a */
    private volatile f70<T> f12005a;

    /* renamed from: b */
    private volatile Object f12006b = f12004c;

    private m30(f70<T> f70Var) {
        this.f12005a = f70Var;
    }

    /* renamed from: a */
    public static <P extends f70<T>, T> f70<T> m14005a(P p) {
        p30.m14710a(p);
        return p instanceof m30 ? p : new m30(p);
    }

    /* renamed from: a */
    public static Object m14006a(Object obj, Object obj2) {
        if (!(obj != f12004c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p000.f70
    public T get() {
        T t = (T) this.f12006b;
        if (t == f12004c) {
            synchronized (this) {
                t = (T) this.f12006b;
                if (t == f12004c) {
                    t = this.f12005a.get();
                    m14006a(this.f12006b, t);
                    this.f12006b = t;
                    this.f12005a = null;
                }
            }
        }
        return t;
    }
}
