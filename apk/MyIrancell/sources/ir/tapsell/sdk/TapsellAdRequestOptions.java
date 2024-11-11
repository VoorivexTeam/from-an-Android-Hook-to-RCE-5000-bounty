package ir.tapsell.sdk;

import com.google.gson.annotations.SerializedName;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import java.io.Serializable;
import p000.e50;

/* loaded from: classes.dex */
public class TapsellAdRequestOptions implements NoProguard, Serializable {
    public static final int CACHE_TYPE_CACHED = 1;
    public static final int CACHE_TYPE_STREAMED = 2;

    @SerializedName("cacheType")
    private int cacheType;

    public TapsellAdRequestOptions() {
        this.cacheType = 1;
        this.cacheType = 1;
    }

    public TapsellAdRequestOptions(int i) {
        this.cacheType = 1;
        this.cacheType = i;
    }

    public int getCacheType() {
        return this.cacheType;
    }

    public boolean isContentEqualTo(TapsellAdRequestOptions tapsellAdRequestOptions) {
        return tapsellAdRequestOptions != null && this.cacheType == tapsellAdRequestOptions.getCacheType();
    }

    public void setCacheType(int i) {
        this.cacheType = i;
    }

    public void setSdkPlatform(SdkPlatformEnum sdkPlatformEnum) {
        e50.m11543a(sdkPlatformEnum);
    }
}
