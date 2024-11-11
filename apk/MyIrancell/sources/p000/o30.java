package p000;

/* loaded from: classes.dex */
public final class o30<T> implements n30<T> {

    /* renamed from: a */
    private final T f12390a;

    static {
        new o30(null);
    }

    private o30(T t) {
        this.f12390a = t;
    }

    /* renamed from: a */
    public static <T> n30<T> m14420a(T t) {
        p30.m14711a(t, "instance cannot be null");
        return new o30(t);
    }

    @Override // p000.f70
    public T get() {
        return this.f12390a;
    }
}
