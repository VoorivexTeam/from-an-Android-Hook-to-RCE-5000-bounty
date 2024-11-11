package p000;

/* renamed from: ps */
/* loaded from: classes.dex */
final class RunnableC3096ps implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AbstractC2871ks f12633b;

    /* renamed from: c */
    private final /* synthetic */ C3057os f12634c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3096ps(C3057os c3057os, AbstractC2871ks abstractC2871ks) {
        this.f12634c = c3057os;
        this.f12633b = abstractC2871ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2485ft c2485ft;
        C2485ft c2485ft2;
        C2485ft c2485ft3;
        InterfaceC2400ds interfaceC2400ds;
        C2485ft c2485ft4;
        C2485ft c2485ft5;
        if (this.f12633b.mo11823c()) {
            c2485ft5 = this.f12634c.f12527c;
            c2485ft5.m11826f();
            return;
        }
        try {
            interfaceC2400ds = this.f12634c.f12526b;
            Object mo6923a = interfaceC2400ds.mo6923a(this.f12633b);
            c2485ft4 = this.f12634c.f12527c;
            c2485ft4.m11818a((C2485ft) mo6923a);
        } catch (C2786is e) {
            if (e.getCause() instanceof Exception) {
                c2485ft3 = this.f12634c.f12527c;
                c2485ft3.m11817a((Exception) e.getCause());
            } else {
                c2485ft2 = this.f12634c.f12527c;
                c2485ft2.m11817a((Exception) e);
            }
        } catch (Exception e2) {
            c2485ft = this.f12634c.f12527c;
            c2485ft.m11817a(e2);
        }
    }
}
