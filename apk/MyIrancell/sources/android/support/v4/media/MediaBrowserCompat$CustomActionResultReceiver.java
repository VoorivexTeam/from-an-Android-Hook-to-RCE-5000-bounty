package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver {

    /* renamed from: d */
    private final String f123d;

    /* renamed from: e */
    private final Bundle f124e;

    /* renamed from: f */
    private final AbstractC0033a f125f;

    @Override // android.support.v4.os.ResultReceiver
    /* renamed from: a */
    protected void mo220a(int i, Bundle bundle) {
        if (this.f125f == null) {
            return;
        }
        MediaSessionCompat.m268a(bundle);
        if (i == -1) {
            this.f125f.m233a(this.f123d, this.f124e, bundle);
            return;
        }
        if (i == 0) {
            this.f125f.m235c(this.f123d, this.f124e, bundle);
            return;
        }
        if (i == 1) {
            this.f125f.m234b(this.f123d, this.f124e, bundle);
            return;
        }
        String str = "Unknown result code: " + i + " (extras=" + this.f124e + ", resultData=" + bundle + ")";
    }
}
