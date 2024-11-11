package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class w40 extends HandlerThread {

    /* renamed from: b */
    private Handler f13768b;

    public w40(String str) {
        super(str);
    }

    /* renamed from: a */
    private synchronized void m16133a() {
        if (this.f13768b == null) {
            this.f13768b = new Handler(getLooper());
        }
    }

    /* renamed from: a */
    public void m16134a(Runnable runnable) {
        m16133a();
        this.f13768b.post(runnable);
    }
}
