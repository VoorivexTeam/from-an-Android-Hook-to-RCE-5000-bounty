package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements Runnable {
    private final /* synthetic */ h6 b;
    private final /* synthetic */ g c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(g gVar, h6 h6Var) {
        this.c = gVar;
        this.b = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d();
        if (ka.a()) {
            this.b.g().a(this);
            return;
        }
        boolean b = this.c.b();
        g.a(this.c, 0L);
        if (b) {
            this.c.a();
        }
    }
}
