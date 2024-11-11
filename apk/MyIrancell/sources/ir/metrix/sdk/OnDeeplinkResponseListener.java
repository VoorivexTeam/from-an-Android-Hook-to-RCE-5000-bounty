package ir.metrix.sdk;

import android.net.Uri;

/* loaded from: classes.dex */
public interface OnDeeplinkResponseListener extends NoProguard {
    boolean launchReceivedDeeplink(Uri uri);
}
