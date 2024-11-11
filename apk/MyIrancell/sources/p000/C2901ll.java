package p000;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C0778j;
import com.google.android.datatransport.runtime.backends.C0780l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0794m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0795n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0798q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0799r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC0800s;
import java.util.concurrent.Executor;
import p000.AbstractC3533zl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ll */
/* loaded from: classes.dex */
public final class C2901ll extends AbstractC3533zl {

    /* renamed from: b */
    private f70<Executor> f11901b;

    /* renamed from: c */
    private f70<Context> f11902c;

    /* renamed from: d */
    private f70 f11903d;

    /* renamed from: e */
    private f70 f11904e;

    /* renamed from: f */
    private f70 f11905f;

    /* renamed from: g */
    private f70<C2995nn> f11906g;

    /* renamed from: h */
    private f70<AbstractC0788g> f11907h;

    /* renamed from: i */
    private f70<InterfaceC0800s> f11908i;

    /* renamed from: j */
    private f70<C2558hm> f11909j;

    /* renamed from: k */
    private f70<C0794m> f11910k;

    /* renamed from: l */
    private f70<C0798q> f11911l;

    /* renamed from: m */
    private f70<C3491yl> f11912m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ll$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC3533zl.a {

        /* renamed from: a */
        private Context f11913a;

        private b() {
        }

        @Override // p000.AbstractC3533zl.a
        /* renamed from: a */
        public b mo13917a(Context context) {
            p30.m14710a(context);
            this.f11913a = context;
            return this;
        }

        @Override // p000.AbstractC3533zl.a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ AbstractC3533zl.a mo13917a(Context context) {
            mo13917a(context);
            return this;
        }

        @Override // p000.AbstractC3533zl.a
        /* renamed from: a */
        public AbstractC3533zl mo13918a() {
            p30.m14712a(this.f11913a, (Class<Context>) Context.class);
            return new C2901ll(this.f11913a);
        }
    }

    private C2901ll(Context context) {
        m13913a(context);
    }

    /* renamed from: a */
    private void m13913a(Context context) {
        this.f11901b = m30.m14005a(C3170rl.m15286a());
        n30 m14420a = o30.m14420a(context);
        this.f11902c = m14420a;
        C0778j m6285a = C0778j.m6285a(m14420a, C3493yn.m16655a(), C3535zn.m16952a());
        this.f11903d = m6285a;
        this.f11904e = m30.m14005a(C0780l.m6290a(this.f11902c, m6285a));
        this.f11905f = C3268tn.m15661a(this.f11902c, C3267tm.m15659a());
        this.f11906g = m30.m14005a(C3052on.m14646a(C3493yn.m16655a(), C3535zn.m16952a(), C3311um.m15844a(), this.f11905f));
        C2902lm m13920a = C2902lm.m13920a(C3493yn.m16655a());
        this.f11907h = m13920a;
        C2994nm m14338a = C2994nm.m14338a(this.f11902c, this.f11906g, m13920a, C3535zn.m16952a());
        this.f11908i = m14338a;
        f70<Executor> f70Var = this.f11901b;
        f70 f70Var2 = this.f11904e;
        f70<C2995nn> f70Var3 = this.f11906g;
        this.f11909j = C2600im.m12492a(f70Var, f70Var2, m14338a, f70Var3, f70Var3);
        f70<Context> f70Var4 = this.f11902c;
        f70 f70Var5 = this.f11904e;
        f70<C2995nn> f70Var6 = this.f11906g;
        this.f11910k = C0795n.m6332a(f70Var4, f70Var5, f70Var6, this.f11908i, this.f11901b, f70Var6, C3493yn.m16655a());
        f70<Executor> f70Var7 = this.f11901b;
        f70<C2995nn> f70Var8 = this.f11906g;
        this.f11911l = C0799r.m6338a(f70Var7, f70Var8, this.f11908i, f70Var8);
        this.f11912m = m30.m14005a(C0026am.m217a(C3493yn.m16655a(), C3535zn.m16952a(), this.f11909j, this.f11910k, this.f11911l));
    }

    /* renamed from: d */
    public static AbstractC3533zl.a m13914d() {
        return new b();
    }

    @Override // p000.AbstractC3533zl
    /* renamed from: a */
    InterfaceC3132qm mo13915a() {
        return this.f11906g.get();
    }

    @Override // p000.AbstractC3533zl
    /* renamed from: c */
    C3491yl mo13916c() {
        return this.f11912m.get();
    }
}
