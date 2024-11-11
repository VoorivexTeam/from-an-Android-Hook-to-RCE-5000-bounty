package ir.tapsell.sdk.nativeads;

import ir.tapsell.sdk.NoProguard;

@Deprecated
/* loaded from: classes.dex */
public interface TapsellNativeBannerAdLoadListener extends NoProguard {
    void onError(String str);

    void onNoAdAvailable();

    void onNoNetwork();

    void onRequestFilled(TapsellNativeBannerAd tapsellNativeBannerAd);
}
