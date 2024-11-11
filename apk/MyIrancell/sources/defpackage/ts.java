package defpackage;

/* loaded from: classes.dex */
final class ts implements Runnable {
    private final /* synthetic */ ss b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ts(ss ssVar) {
        this.b = ssVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        es esVar;
        es esVar2;
        obj = this.b.b;
        synchronized (obj) {
            esVar = this.b.c;
            if (esVar != null) {
                esVar2 = this.b.c;
                esVar2.a();
            }
        }
    }
}
