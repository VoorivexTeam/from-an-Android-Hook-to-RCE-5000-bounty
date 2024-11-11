package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class bt implements Runnable {
    private final /* synthetic */ ks b;
    private final /* synthetic */ at c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bt(at atVar, ks ksVar) {
        this.c = atVar;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        js jsVar;
        try {
            jsVar = this.c.b;
            ks a = jsVar.a(this.b.b());
            if (a == null) {
                this.c.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.a(ms.b, (hs) this.c);
            a.a(ms.b, (gs) this.c);
            a.a(ms.b, (es) this.c);
        } catch (is e) {
            if (e.getCause() instanceof Exception) {
                this.c.a((Exception) e.getCause());
            } else {
                this.c.a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.c.a();
        } catch (Exception e2) {
            this.c.a(e2);
        }
    }
}
