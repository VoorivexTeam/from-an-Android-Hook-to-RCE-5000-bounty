package ir.tapsell.sdk.models.requestModels;

import com.google.gson.annotations.SerializedName;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;
import java.io.Serializable;
import p000.z40;

/* loaded from: classes.dex */
public class RequestAdSuggestionJsonParams implements Serializable {
    public static final int CACHE_TYPE_CACHED = 1;
    public static final int CACHE_TYPE_STREAMED = 2;

    @SerializedName("clientRequestedCacheType")
    private Integer clientRequestedCacheType;

    @SerializedName("userExtraInfo")
    private UserExtraInfo userExtraInfo;

    @SerializedName("zoneId")
    private String zoneId;

    public RequestAdSuggestionJsonParams(String str, int i) {
        this.zoneId = str;
        this.clientRequestedCacheType = Integer.valueOf(i);
        setUserExtraInfo();
    }

    private void setUserExtraInfo() {
        this.userExtraInfo = z40.m16734K().m16757n();
    }

    public Integer getClientRequestedCacheType() {
        return this.clientRequestedCacheType;
    }

    public UserExtraInfo getUserExtraInfo() {
        return this.userExtraInfo;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setClientRequestedCacheType(Integer num) {
        this.clientRequestedCacheType = num;
    }

    public void setZoneId(String str) {
        this.zoneId = str;
    }
}
