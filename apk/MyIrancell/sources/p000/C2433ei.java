package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ei */
/* loaded from: classes.dex */
public final class C2433ei {

    /* renamed from: a */
    private static final Executor f10015a = new a();

    /* renamed from: b */
    private static final Executor f10016b = new b();

    /* renamed from: ei$a */
    /* loaded from: classes.dex */
    class a implements Executor {

        /* renamed from: a */
        private final Handler f10017a = new Handler(Looper.getMainLooper());

        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f10017a.post(runnable);
        }
    }

    /* renamed from: ei$b */
    /* loaded from: classes.dex */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m11612a() {
        return f10016b;
    }

    /* renamed from: b */
    public static Executor m11613b() {
        return f10015a;
    }
}
