package defpackage;

/* loaded from: classes.dex */
public class w1<T> extends v1<T> {
    private final Object c;

    public w1(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.v1, defpackage.u1
    public T a() {
        T t;
        synchronized (this.c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // defpackage.v1, defpackage.u1
    public boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }
}
