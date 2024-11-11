package ir.tapsell.sdk.nativeads;

import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.models.responseModels.TapsellNativeBannerAdModel;

@Deprecated
/* loaded from: classes.dex */
public class TapsellNativeAdHolder implements NoProguard {
    private TapsellNativeBannerAdModel adWrapper;

    public TapsellNativeAdHolder(TapsellNativeBannerAdModel tapsellNativeBannerAdModel) {
        this.adWrapper = tapsellNativeBannerAdModel;
    }

    public TapsellNativeBannerAdModel getAdWrapper() {
        return this.adWrapper;
    }
}
