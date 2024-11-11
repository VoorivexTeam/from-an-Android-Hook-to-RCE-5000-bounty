package p000;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* renamed from: sw */
/* loaded from: classes.dex */
final class C3225sw implements Camera.PreviewCallback {

    /* renamed from: d */
    private static final String f13146d = C3225sw.class.getSimpleName();

    /* renamed from: a */
    private final C3061ow f13147a;

    /* renamed from: b */
    private Handler f13148b;

    /* renamed from: c */
    private int f13149c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3225sw(C3061ow c3061ow) {
        this.f13147a = c3061ow;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15458a(Handler handler, int i) {
        this.f13148b = handler;
        this.f13149c = i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point m14661a = this.f13147a.m14661a();
        Handler handler = this.f13148b;
        if (m14661a == null || handler == null) {
            return;
        }
        handler.obtainMessage(this.f13149c, m14661a.x, m14661a.y, bArr).sendToTarget();
        this.f13148b = null;
    }
}
