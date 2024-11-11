package defpackage;

/* loaded from: classes.dex */
final class vs implements Runnable {
    private final /* synthetic */ ks b;
    private final /* synthetic */ us c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vs(us usVar, ks ksVar) {
        this.c = usVar;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        fs fsVar;
        fs fsVar2;
        obj = this.c.b;
        synchronized (obj) {
            fsVar = this.c.c;
            if (fsVar != null) {
                fsVar2 = this.c.c;
                fsVar2.a(this.b);
            }
        }
    }
}
