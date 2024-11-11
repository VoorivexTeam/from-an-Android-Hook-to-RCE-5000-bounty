package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class yb {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((vb) message.obj).b();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(vb<?> vbVar) {
        if (this.a) {
            this.b.obtainMessage(1, vbVar).sendToTarget();
        } else {
            this.a = true;
            vbVar.b();
            this.a = false;
        }
    }
}
