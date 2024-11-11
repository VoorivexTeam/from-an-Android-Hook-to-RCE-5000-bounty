package p000;

/* renamed from: xs */
/* loaded from: classes.dex */
final class RunnableC3449xs implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AbstractC2871ks f14064b;

    /* renamed from: c */
    private final /* synthetic */ C3409ws f14065c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3449xs(C3409ws c3409ws, AbstractC2871ks abstractC2871ks) {
        this.f14065c = c3409ws;
        this.f14064b = abstractC2871ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC2524gs interfaceC2524gs;
        InterfaceC2524gs interfaceC2524gs2;
        obj = this.f14065c.f13966b;
        synchronized (obj) {
            interfaceC2524gs = this.f14065c.f13967c;
            if (interfaceC2524gs != null) {
                interfaceC2524gs2 = this.f14065c.f13967c;
                interfaceC2524gs2.mo3189a(this.f14064b.mo11802a());
            }
        }
    }
}
