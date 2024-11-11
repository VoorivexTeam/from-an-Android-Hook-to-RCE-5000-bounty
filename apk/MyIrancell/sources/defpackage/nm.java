package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

/* loaded from: classes.dex */
public final class nm implements n30<s> {
    private final f70<Context> a;
    private final f70<qm> b;
    private final f70<g> c;
    private final f70<wn> d;

    public nm(f70<Context> f70Var, f70<qm> f70Var2, f70<g> f70Var3, f70<wn> f70Var4) {
        this.a = f70Var;
        this.b = f70Var2;
        this.c = f70Var3;
        this.d = f70Var4;
    }

    public static s a(Context context, qm qmVar, g gVar, wn wnVar) {
        s a = mm.a(context, qmVar, gVar, wnVar);
        p30.a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public static nm a(f70<Context> f70Var, f70<qm> f70Var2, f70<g> f70Var3, f70<wn> f70Var4) {
        return new nm(f70Var, f70Var2, f70Var3, f70Var4);
    }

    @Override // defpackage.f70
    public s get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
