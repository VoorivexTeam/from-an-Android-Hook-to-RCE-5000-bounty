package p000;

/* renamed from: rs */
/* loaded from: classes.dex */
final class RunnableC3177rs implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AbstractC2871ks f12980b;

    /* renamed from: c */
    private final /* synthetic */ C3138qs f12981c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3177rs(C3138qs c3138qs, AbstractC2871ks abstractC2871ks) {
        this.f12981c = c3138qs;
        this.f12980b = abstractC2871ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2485ft c2485ft;
        C2485ft c2485ft2;
        C2485ft c2485ft3;
        InterfaceC2400ds interfaceC2400ds;
        try {
            interfaceC2400ds = this.f12981c.f12825b;
            AbstractC2871ks abstractC2871ks = (AbstractC2871ks) interfaceC2400ds.mo6923a(this.f12980b);
            if (abstractC2871ks == null) {
                this.f12981c.mo3189a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            abstractC2871ks.mo11815a(C2954ms.f12178b, (InterfaceC2564hs) this.f12981c);
            abstractC2871ks.mo11814a(C2954ms.f12178b, (InterfaceC2524gs) this.f12981c);
            abstractC2871ks.mo11812a(C2954ms.f12178b, (InterfaceC2443es) this.f12981c);
        } catch (C2786is e) {
            if (e.getCause() instanceof Exception) {
                c2485ft3 = this.f12981c.f12826c;
                c2485ft3.m11817a((Exception) e.getCause());
            } else {
                c2485ft2 = this.f12981c.f12826c;
                c2485ft2.m11817a((Exception) e);
            }
        } catch (Exception e2) {
            c2485ft = this.f12981c.f12826c;
            c2485ft.m11817a(e2);
        }
    }
}
