package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class ss<TResult> implements ct<TResult> {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    private es c;

    public ss(Executor executor, es esVar) {
        this.a = executor;
        this.c = esVar;
    }

    @Override // defpackage.ct
    public final void a(ks ksVar) {
        if (ksVar.c()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new ts(this));
            }
        }
    }

    @Override // defpackage.ct
    public final void cancel() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
