package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {

    /* renamed from: d */
    private final String f126d;

    /* renamed from: e */
    private final AbstractC0034b f127e;

    @Override // android.support.v4.os.ResultReceiver
    /* renamed from: a */
    protected void mo220a(int i, Bundle bundle) {
        MediaSessionCompat.m268a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f127e.m237a(this.f126d);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f127e.m236a((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f127e.m237a(this.f126d);
        }
    }
}
