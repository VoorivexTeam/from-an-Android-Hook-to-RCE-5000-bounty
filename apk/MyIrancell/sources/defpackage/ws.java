package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ws<TResult> implements ct<TResult> {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    private gs c;

    public ws(Executor executor, gs gsVar) {
        this.a = executor;
        this.c = gsVar;
    }

    @Override // defpackage.ct
    public final void a(ks<TResult> ksVar) {
        if (ksVar.e() || ksVar.c()) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new xs(this, ksVar));
        }
    }

    @Override // defpackage.ct
    public final void cancel() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
