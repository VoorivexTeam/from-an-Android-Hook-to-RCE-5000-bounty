package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: yb */
/* loaded from: classes.dex */
class C3481yb {

    /* renamed from: a */
    private boolean f14122a;

    /* renamed from: b */
    private final Handler f14123b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: yb$a */
    /* loaded from: classes.dex */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC3353vb) message.obj).mo3383b();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m16616a(InterfaceC3353vb<?> interfaceC3353vb) {
        if (this.f14122a) {
            this.f14123b.obtainMessage(1, interfaceC3353vb).sendToTarget();
        } else {
            this.f14122a = true;
            interfaceC3353vb.mo3383b();
            this.f14122a = false;
        }
    }
}
