package ir.tapsell.sdk.nativeads;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public interface TapsellNativeVideoAdLoadListener extends NoProguard {
    void onError(String str);

    void onNoAdAvailable();

    void onNoNetwork();

    void onRequestFilled(TapsellNativeVideoAd tapsellNativeVideoAd);
}
