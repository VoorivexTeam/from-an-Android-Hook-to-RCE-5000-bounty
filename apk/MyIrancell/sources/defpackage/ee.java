package defpackage;

/* loaded from: classes.dex */
public class ee<T> implements vb<T> {
    protected final T b;

    public ee(T t) {
        ji.a(t);
        this.b = t;
    }

    @Override // defpackage.vb
    public void b() {
    }

    @Override // defpackage.vb
    public final int c() {
        return 1;
    }

    @Override // defpackage.vb
    public Class<T> d() {
        return (Class<T>) this.b.getClass();
    }

    @Override // defpackage.vb
    public final T get() {
        return this.b;
    }
}
