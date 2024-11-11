package p000;

import android.os.Process;

/* renamed from: bp */
/* loaded from: classes.dex */
final class RunnableC0488bp implements Runnable {

    /* renamed from: b */
    private final Runnable f2817b;

    /* renamed from: c */
    private final int f2818c;

    public RunnableC0488bp(Runnable runnable, int i) {
        this.f2817b = runnable;
        this.f2818c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2818c);
        this.f2817b.run();
    }
}
