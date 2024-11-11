package defpackage;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class im implements n30<hm> {
    private final f70<Executor> a;
    private final f70<e> b;
    private final f70<s> c;
    private final f70<qm> d;
    private final f70<vn> e;

    public im(f70<Executor> f70Var, f70<e> f70Var2, f70<s> f70Var3, f70<qm> f70Var4, f70<vn> f70Var5) {
        this.a = f70Var;
        this.b = f70Var2;
        this.c = f70Var3;
        this.d = f70Var4;
        this.e = f70Var5;
    }

    public static im a(f70<Executor> f70Var, f70<e> f70Var2, f70<s> f70Var3, f70<qm> f70Var4, f70<vn> f70Var5) {
        return new im(f70Var, f70Var2, f70Var3, f70Var4, f70Var5);
    }

    @Override // defpackage.f70
    public hm get() {
        return new hm(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
