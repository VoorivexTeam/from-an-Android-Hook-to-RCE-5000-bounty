package defpackage;

/* loaded from: classes.dex */
public final class m30<T> implements f70<T> {
    private static final Object c = new Object();
    private volatile f70<T> a;
    private volatile Object b = c;

    private m30(f70<T> f70Var) {
        this.a = f70Var;
    }

    public static <P extends f70<T>, T> f70<T> a(P p) {
        p30.a(p);
        return p instanceof m30 ? p : new m30(p);
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // defpackage.f70
    public T get() {
        T t = (T) this.b;
        if (t == c) {
            synchronized (this) {
                t = (T) this.b;
                if (t == c) {
                    t = this.a.get();
                    a(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
