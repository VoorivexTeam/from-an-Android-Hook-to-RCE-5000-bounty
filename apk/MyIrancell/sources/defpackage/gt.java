package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class gt implements Runnable {
    private final /* synthetic */ ft b;
    private final /* synthetic */ Callable c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gt(ft ftVar, Callable callable) {
        this.b = ftVar;
        this.c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a((ft) this.c.call());
        } catch (Exception e) {
            this.b.a(e);
        }
    }
}
