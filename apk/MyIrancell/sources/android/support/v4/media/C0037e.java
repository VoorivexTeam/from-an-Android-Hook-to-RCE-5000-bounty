package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.e */
/* loaded from: classes.dex */
class C0037e {

    /* renamed from: android.support.v4.media.e$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        public static void m259a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m258a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
