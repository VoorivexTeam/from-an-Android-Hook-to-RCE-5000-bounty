package ir.tapsell.sdk.bannerads;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public enum TapsellBannerType implements NoProguard {
    BANNER_320x50(1),
    BANNER_320x100(2),
    BANNER_250x250(3),
    BANNER_300x250(4);

    private int mValue;

    TapsellBannerType(int i) {
        this.mValue = i;
    }

    public static TapsellBannerType fromValue(int i) {
        for (TapsellBannerType tapsellBannerType : values()) {
            if (tapsellBannerType.getValue() == i) {
                return tapsellBannerType;
            }
        }
        return null;
    }

    public int getValue() {
        return this.mValue;
    }
}
