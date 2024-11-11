package defpackage;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;

/* loaded from: classes.dex */
public final class lm implements n30<g> {
    private final f70<wn> a;

    public lm(f70<wn> f70Var) {
        this.a = f70Var;
    }

    public static g a(wn wnVar) {
        g a = km.a(wnVar);
        p30.a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public static lm a(f70<wn> f70Var) {
        return new lm(f70Var);
    }

    @Override // defpackage.f70
    public g get() {
        return a(this.a.get());
    }
}
