package ir.metrix.sdk;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class aj extends HandlerThread {
    private Handler a;

    public aj(String str) {
        super(str);
    }

    private synchronized void a() {
        if (this.a == null) {
            this.a = new Handler(getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        a();
        this.a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable, long j) {
        a();
        this.a.postDelayed(runnable, j);
    }
}
