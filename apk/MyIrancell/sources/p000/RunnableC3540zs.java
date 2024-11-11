package p000;

/* renamed from: zs */
/* loaded from: classes.dex */
final class RunnableC3540zs implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AbstractC2871ks f14533b;

    /* renamed from: c */
    private final /* synthetic */ C3498ys f14534c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3540zs(C3498ys c3498ys, AbstractC2871ks abstractC2871ks) {
        this.f14534c = c3498ys;
        this.f14533b = abstractC2871ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC2564hs interfaceC2564hs;
        InterfaceC2564hs interfaceC2564hs2;
        obj = this.f14534c.f14279b;
        synchronized (obj) {
            interfaceC2564hs = this.f14534c.f14280c;
            if (interfaceC2564hs != null) {
                interfaceC2564hs2 = this.f14534c.f14280c;
                interfaceC2564hs2.mo3190a(this.f14533b.mo11819b());
            }
        }
    }
}
