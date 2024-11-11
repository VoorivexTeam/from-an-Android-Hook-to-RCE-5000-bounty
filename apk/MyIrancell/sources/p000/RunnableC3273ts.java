package p000;

/* renamed from: ts */
/* loaded from: classes.dex */
final class RunnableC3273ts implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C3221ss f13340b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3273ts(C3221ss c3221ss) {
        this.f13340b = c3221ss;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC2443es interfaceC2443es;
        InterfaceC2443es interfaceC2443es2;
        obj = this.f13340b.f13144b;
        synchronized (obj) {
            interfaceC2443es = this.f13340b.f13145c;
            if (interfaceC2443es != null) {
                interfaceC2443es2 = this.f13340b.f13145c;
                interfaceC2443es2.mo3188a();
            }
        }
    }
}
