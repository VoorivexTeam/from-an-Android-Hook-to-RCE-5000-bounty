package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class us<TResult> implements ct<TResult> {
    private final Executor a;
    private final Object b = new Object();

    @GuardedBy("mLock")
    private fs<TResult> c;

    public us(Executor executor, fs<TResult> fsVar) {
        this.a = executor;
        this.c = fsVar;
    }

    @Override // defpackage.ct
    public final void a(ks<TResult> ksVar) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new vs(this, ksVar));
        }
    }

    @Override // defpackage.ct
    public final void cancel() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
