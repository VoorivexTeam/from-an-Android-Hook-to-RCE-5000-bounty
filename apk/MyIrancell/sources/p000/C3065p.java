package p000;

import java.util.concurrent.Executor;

/* renamed from: p */
/* loaded from: classes.dex */
public class C3065p extends AbstractC3146r {

    /* renamed from: c */
    private static volatile C3065p f12541c;

    /* renamed from: a */
    private AbstractC3146r f12542a;

    /* renamed from: b */
    private AbstractC3146r f12543b;

    /* renamed from: p$a */
    /* loaded from: classes.dex */
    static class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C3065p.m14670b().mo14673b(runnable);
        }
    }

    /* renamed from: p$b */
    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C3065p.m14670b().mo14671a(runnable);
        }
    }

    static {
        new a();
        new b();
    }

    private C3065p() {
        C3104q c3104q = new C3104q();
        this.f12543b = c3104q;
        this.f12542a = c3104q;
    }

    /* renamed from: b */
    public static C3065p m14670b() {
        if (f12541c != null) {
            return f12541c;
        }
        synchronized (C3065p.class) {
            if (f12541c == null) {
                f12541c = new C3065p();
            }
        }
        return f12541c;
    }

    @Override // p000.AbstractC3146r
    /* renamed from: a */
    public void mo14671a(Runnable runnable) {
        this.f12542a.mo14671a(runnable);
    }

    @Override // p000.AbstractC3146r
    /* renamed from: a */
    public boolean mo14672a() {
        return this.f12542a.mo14672a();
    }

    @Override // p000.AbstractC3146r
    /* renamed from: b */
    public void mo14673b(Runnable runnable) {
        this.f12542a.mo14673b(runnable);
    }
}
