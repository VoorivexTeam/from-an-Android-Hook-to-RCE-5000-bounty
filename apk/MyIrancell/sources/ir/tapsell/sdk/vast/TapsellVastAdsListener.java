package ir.tapsell.sdk.vast;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public interface TapsellVastAdsListener extends NoProguard {
    void onAdError(String str);

    void onAdEvent(AdEvent adEvent);
}
