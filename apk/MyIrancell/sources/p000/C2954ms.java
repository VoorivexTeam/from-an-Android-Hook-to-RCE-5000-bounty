package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ms */
/* loaded from: classes.dex */
public final class C2954ms {

    /* renamed from: a */
    public static final Executor f12177a = new a();

    /* renamed from: b */
    static final Executor f12178b = new ExecutorC2444et();

    /* renamed from: ms$a */
    /* loaded from: classes.dex */
    private static final class a implements Executor {

        /* renamed from: a */
        private final Handler f12179a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f12179a.post(runnable);
        }
    }
}
