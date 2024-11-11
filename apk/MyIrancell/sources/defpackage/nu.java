package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class nu implements Executor {
    static final Executor a = new nu();

    private nu() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
