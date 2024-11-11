package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: yo */
/* loaded from: classes.dex */
public class ExecutorC3494yo implements Executor {

    /* renamed from: a */
    private final Handler f14276a;

    public ExecutorC3494yo(Looper looper) {
        this.f14276a = new HandlerC3175rq(looper);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f14276a.post(runnable);
    }
}
