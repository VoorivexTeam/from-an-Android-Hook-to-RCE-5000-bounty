package p000;

import java.util.concurrent.Executor;

/* renamed from: nu */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC3002nu implements Executor {

    /* renamed from: a */
    static final Executor f12356a = new ExecutorC3002nu();

    private ExecutorC3002nu() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
