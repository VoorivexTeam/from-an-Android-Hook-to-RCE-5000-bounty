package p000;

import android.content.Context;

/* renamed from: tn */
/* loaded from: classes.dex */
public final class C3268tn implements n30<C3216sn> {

    /* renamed from: a */
    private final f70<Context> f13337a;

    /* renamed from: b */
    private final f70<Integer> f13338b;

    public C3268tn(f70<Context> f70Var, f70<Integer> f70Var2) {
        this.f13337a = f70Var;
        this.f13338b = f70Var2;
    }

    /* renamed from: a */
    public static C3268tn m15661a(f70<Context> f70Var, f70<Integer> f70Var2) {
        return new C3268tn(f70Var, f70Var2);
    }

    @Override // p000.f70
    public C3216sn get() {
        return new C3216sn(this.f13337a.get(), this.f13338b.get().intValue());
    }
}
