package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class w40 extends HandlerThread {
    private Handler b;

    public w40(String str) {
        super(str);
    }

    private synchronized void a() {
        if (this.b == null) {
            this.b = new Handler(getLooper());
        }
    }

    public void a(Runnable runnable) {
        a();
        this.b.post(runnable);
    }
}
