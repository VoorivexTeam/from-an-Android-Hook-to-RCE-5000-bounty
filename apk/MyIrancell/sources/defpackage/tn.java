package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class tn implements n30<sn> {
    private final f70<Context> a;
    private final f70<Integer> b;

    public tn(f70<Context> f70Var, f70<Integer> f70Var2) {
        this.a = f70Var;
        this.b = f70Var2;
    }

    public static tn a(f70<Context> f70Var, f70<Integer> f70Var2) {
        return new tn(f70Var, f70Var2);
    }

    @Override // defpackage.f70
    public sn get() {
        return new sn(this.a.get(), this.b.get().intValue());
    }
}
