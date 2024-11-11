package defpackage;

/* loaded from: classes.dex */
final class zs implements Runnable {
    private final /* synthetic */ ks b;
    private final /* synthetic */ ys c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zs(ys ysVar, ks ksVar) {
        this.c = ysVar;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        hs hsVar;
        hs hsVar2;
        obj = this.c.b;
        synchronized (obj) {
            hsVar = this.c.c;
            if (hsVar != null) {
                hsVar2 = this.c.c;
                hsVar2.a(this.b.b());
            }
        }
    }
}
