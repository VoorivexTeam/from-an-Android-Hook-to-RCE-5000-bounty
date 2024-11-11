package defpackage;

/* loaded from: classes.dex */
final class xs implements Runnable {
    private final /* synthetic */ ks b;
    private final /* synthetic */ ws c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xs(ws wsVar, ks ksVar) {
        this.c = wsVar;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        gs gsVar;
        gs gsVar2;
        obj = this.c.b;
        synchronized (obj) {
            gsVar = this.c.c;
            if (gsVar != null) {
                gsVar2 = this.c.c;
                gsVar2.a(this.b.a());
            }
        }
    }
}
