package defpackage;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;

/* loaded from: classes.dex */
public final class am implements n30<yl> {
    private final f70<wn> a;
    private final f70<wn> b;
    private final f70<jm> c;
    private final f70<m> d;
    private final f70<q> e;

    public am(f70<wn> f70Var, f70<wn> f70Var2, f70<jm> f70Var3, f70<m> f70Var4, f70<q> f70Var5) {
        this.a = f70Var;
        this.b = f70Var2;
        this.c = f70Var3;
        this.d = f70Var4;
        this.e = f70Var5;
    }

    public static am a(f70<wn> f70Var, f70<wn> f70Var2, f70<jm> f70Var3, f70<m> f70Var4, f70<q> f70Var5) {
        return new am(f70Var, f70Var2, f70Var3, f70Var4, f70Var5);
    }

    @Override // defpackage.f70
    public yl get() {
        return new yl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
