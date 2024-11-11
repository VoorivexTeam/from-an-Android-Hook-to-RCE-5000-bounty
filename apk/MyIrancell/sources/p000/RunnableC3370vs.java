package p000;

/* renamed from: vs */
/* loaded from: classes.dex */
final class RunnableC3370vs implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AbstractC2871ks f13715b;

    /* renamed from: c */
    private final /* synthetic */ C3317us f13716c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3370vs(C3317us c3317us, AbstractC2871ks abstractC2871ks) {
        this.f13716c = c3317us;
        this.f13715b = abstractC2871ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC2484fs interfaceC2484fs;
        InterfaceC2484fs interfaceC2484fs2;
        obj = this.f13716c.f13501b;
        synchronized (obj) {
            interfaceC2484fs = this.f13716c.f13502c;
            if (interfaceC2484fs != null) {
                interfaceC2484fs2 = this.f13716c.f13502c;
                interfaceC2484fs2.mo5523a(this.f13715b);
            }
        }
    }
}
