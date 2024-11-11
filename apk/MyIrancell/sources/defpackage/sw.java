package defpackage;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* loaded from: classes.dex */
final class sw implements Camera.PreviewCallback {
    private static final String d = sw.class.getSimpleName();
    private final ow a;
    private Handler b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sw(ow owVar) {
        this.a = owVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Handler handler, int i) {
        this.b = handler;
        this.c = i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point a = this.a.a();
        Handler handler = this.b;
        if (a == null || handler == null) {
            return;
        }
        handler.obtainMessage(this.c, a.x, a.y, bArr).sendToTarget();
        this.b = null;
    }
}
