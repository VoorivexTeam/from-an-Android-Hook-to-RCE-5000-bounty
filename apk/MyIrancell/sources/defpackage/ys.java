package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ys<TResult> implements ct<TResult> {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    private hs<? super TResult> c;

    public ys(Executor executor, hs<? super TResult> hsVar) {
        this.a = executor;
        this.c = hsVar;
    }

    @Override // defpackage.ct
    public final void a(ks<TResult> ksVar) {
        if (ksVar.e()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new zs(this, ksVar));
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
