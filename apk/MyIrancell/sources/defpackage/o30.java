package defpackage;

/* loaded from: classes.dex */
public final class o30<T> implements n30<T> {
    private final T a;

    static {
        new o30(null);
    }

    private o30(T t) {
        this.a = t;
    }

    public static <T> n30<T> a(T t) {
        p30.a(t, "instance cannot be null");
        return new o30(t);
    }

    @Override // defpackage.f70
    public T get() {
        return this.a;
    }
}
