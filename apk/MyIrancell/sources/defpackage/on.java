package defpackage;

/* loaded from: classes.dex */
public final class on implements n30<nn> {
    private final f70<wn> a;
    private final f70<wn> b;
    private final f70<rm> c;
    private final f70<sn> d;

    public on(f70<wn> f70Var, f70<wn> f70Var2, f70<rm> f70Var3, f70<sn> f70Var4) {
        this.a = f70Var;
        this.b = f70Var2;
        this.c = f70Var3;
        this.d = f70Var4;
    }

    public static on a(f70<wn> f70Var, f70<wn> f70Var2, f70<rm> f70Var3, f70<sn> f70Var4) {
        return new on(f70Var, f70Var2, f70Var3, f70Var4);
    }

    @Override // defpackage.f70
    public nn get() {
        return new nn(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
