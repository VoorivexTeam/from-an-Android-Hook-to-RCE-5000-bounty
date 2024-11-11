package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {

    /* renamed from: d */
    private final String f130d;

    /* renamed from: e */
    private final Bundle f131e;

    /* renamed from: f */
    private final AbstractC0035c f132f;

    @Override // android.support.v4.os.ResultReceiver
    /* renamed from: a */
    protected void mo220a(int i, Bundle bundle) {
        MediaSessionCompat.m268a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f132f.m238a(this.f130d, this.f131e);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.f132f.m239a(this.f130d, this.f131e, arrayList);
    }
}
