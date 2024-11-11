package defpackage;

/* loaded from: classes.dex */
final class mb0<T> implements ta0<T, h80> {
    static final mb0<Object> a = new mb0<>();
    private static final b80 b = b80.a("text/plain; charset=UTF-8");

    private mb0() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ta0
    public h80 a(T t) {
        return h80.a(b, String.valueOf(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ta0
    public /* bridge */ /* synthetic */ h80 a(Object obj) {
        return a((mb0<T>) obj);
    }
}
