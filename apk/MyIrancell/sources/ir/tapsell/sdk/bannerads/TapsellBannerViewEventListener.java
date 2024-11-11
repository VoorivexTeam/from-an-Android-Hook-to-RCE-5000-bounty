package ir.tapsell.sdk.bannerads;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public interface TapsellBannerViewEventListener extends NoProguard {
    void onError(String str);

    void onHideBannerView();

    void onNoAdAvailable();

    void onNoNetwork();

    void onRequestFilled();
}
