package ir.metrix.sdk;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ir.metrix.sdk.aj */
/* loaded from: classes.dex */
public class HandlerThreadC2618aj extends HandlerThread {

    /* renamed from: a */
    private Handler f10698a;

    public HandlerThreadC2618aj(String str) {
        super(str);
    }

    /* renamed from: a */
    private synchronized void m12558a() {
        if (this.f10698a == null) {
            this.f10698a = new Handler(getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12559a(Runnable runnable) {
        m12558a();
        this.f10698a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12560a(Runnable runnable, long j) {
        m12558a();
        this.f10698a.postDelayed(runnable, j);
    }
}
