package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
final class bp implements Runnable {
    private final Runnable b;
    private final int c;

    public bp(Runnable runnable, int i) {
        this.b = runnable;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.c);
        this.b.run();
    }
}
