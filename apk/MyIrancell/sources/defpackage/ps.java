package defpackage;

/* loaded from: classes.dex */
final class ps implements Runnable {
    private final /* synthetic */ ks b;
    private final /* synthetic */ os c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ps(os osVar, ks ksVar) {
        this.c = osVar;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ft ftVar;
        ft ftVar2;
        ft ftVar3;
        ds dsVar;
        ft ftVar4;
        ft ftVar5;
        if (this.b.c()) {
            ftVar5 = this.c.c;
            ftVar5.f();
            return;
        }
        try {
            dsVar = this.c.b;
            Object a = dsVar.a(this.b);
            ftVar4 = this.c.c;
            ftVar4.a((ft) a);
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
