package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class et implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
