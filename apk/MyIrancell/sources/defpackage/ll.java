package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.j;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import defpackage.zl;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ll extends zl {
    private f70<Executor> b;
    private f70<Context> c;
    private f70 d;
    private f70 e;
    private f70 f;
    private f70<nn> g;
    private f70<g> h;
    private f70<s> i;
    private f70<hm> j;
    private f70<m> k;
    private f70<q> l;
    private f70<yl> m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements zl.a {
        private Context a;

        private b() {
        }

        @Override // zl.a
        public b a(Context context) {
            p30.a(context);
            this.a = context;
            return this;
        }

        @Override // zl.a
        public /* bridge */ /* synthetic */ zl.a a(Context context) {
            a(context);
            return this;
        }

        @Override // zl.a
        public zl a() {
            p30.a(this.a, (Class<Context>) Context.class);
            return new ll(this.a);
        }
    }

    private ll(Context context) {
        a(context);
    }

    private void a(Context context) {
        this.b = m30.a(rl.a());
        n30 a2 = o30.a(context);
        this.c = a2;
        j a3 = j.a(a2, yn.a(), zn.a());
        this.d = a3;
        this.e = m30.a(l.a(this.c, a3));
        this.f = tn.a(this.c, tm.a());
        this.g = m30.a(on.a(yn.a(), zn.a(), um.a(), this.f));
        lm a4 = lm.a(yn.a());
        this.h = a4;
        nm a5 = nm.a(this.c, this.g, a4, zn.a());
        this.i = a5;
        f70<Executor> f70Var = this.b;
        f70 f70Var2 = this.e;
        f70<nn> f70Var3 = this.g;
        this.j = im.a(f70Var, f70Var2, a5, f70Var3, f70Var3);
        f70<Context> f70Var4 = this.c;
        f70 f70Var5 = this.e;
        f70<nn> f70Var6 = this.g;
        this.k = n.a(f70Var4, f70Var5, f70Var6, this.i, this.b, f70Var6, yn.a());
        f70<Executor> f70Var7 = this.b;
        f70<nn> f70Var8 = this.g;
        this.l = r.a(f70Var7, f70Var8, this.i, f70Var8);
        this.m = m30.a(am.a(yn.a(), zn.a(), this.j, this.k, this.l));
    }

    public static zl.a d() {
        return new b();
    }

    @Override // defpackage.zl
    qm a() {
        return this.g.get();
    }

    @Override // defpackage.zl
    yl c() {
        return this.m.get();
    }
}
