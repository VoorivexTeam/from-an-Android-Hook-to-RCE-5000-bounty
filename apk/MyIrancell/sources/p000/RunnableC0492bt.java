package p000;

import java.util.concurrent.CancellationException;

/* renamed from: bt */
/* loaded from: classes.dex */
final class RunnableC0492bt implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AbstractC2871ks f2821b;

    /* renamed from: c */
    private final /* synthetic */ C0435at f2822c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0492bt(C0435at c0435at, AbstractC2871ks abstractC2871ks) {
        this.f2822c = c0435at;
        this.f2821b = abstractC2871ks;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2826js interfaceC2826js;
        try {
            interfaceC2826js = this.f2822c.f2647b;
            AbstractC2871ks mo10662a = interfaceC2826js.mo10662a(this.f2821b.mo11819b());
            if (mo10662a == null) {
                this.f2822c.mo3189a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            mo10662a.mo11815a(C2954ms.f12178b, (InterfaceC2564hs) this.f2822c);
            mo10662a.mo11814a(C2954ms.f12178b, (InterfaceC2524gs) this.f2822c);
            mo10662a.mo11812a(C2954ms.f12178b, (InterfaceC2443es) this.f2822c);
        } catch (C2786is e) {
            if (e.getCause() instanceof Exception) {
                this.f2822c.mo3189a((Exception) e.getCause());
            } else {
                this.f2822c.mo3189a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.f2822c.mo3188a();
        } catch (Exception e2) {
            this.f2822c.mo3189a(e2);
        }
    }
}
