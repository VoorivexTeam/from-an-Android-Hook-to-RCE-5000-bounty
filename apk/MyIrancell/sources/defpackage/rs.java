package defpackage;

/* loaded from: classes.dex */
final class rs implements Runnable {
    private final /* synthetic */ ks b;
    private final /* synthetic */ qs c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rs(qs qsVar, ks ksVar) {
        this.c = qsVar;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ft ftVar;
        ft ftVar2;
        ft ftVar3;
        ds dsVar;
        try {
            dsVar = this.c.b;
            ks ksVar = (ks) dsVar.a(this.b);
            if (ksVar == null) {
                this.c.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            ksVar.a(ms.b, (hs) this.c);
            ksVar.a(ms.b, (gs) this.c);
            ksVar.a(ms.b, (es) this.c);
        } catch (is e) {
            if (e.getCause() instanceof Exception) {
                ftVar3 = this.c.c;
                ftVar3.a((Exception) e.getCause());
            } else {
                ftVar2 = this.c.c;
                ftVar2.a((Exception) e);
            }
        } catch (Exception e2) {
            ftVar = this.c.c;
            ftVar.a(e2);
        }
    }
}
