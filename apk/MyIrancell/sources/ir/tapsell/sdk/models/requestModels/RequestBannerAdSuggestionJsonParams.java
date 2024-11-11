package ir.tapsell.sdk.models.requestModels;

import com.google.gson.annotations.SerializedName;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;
import java.io.Serializable;

/* loaded from: classes.dex */
public class RequestBannerAdSuggestionJsonParams implements Serializable {

    @SerializedName("bannerType")
    private Integer bannerType;

    @SerializedName("userExtraInfo")
    private UserExtraInfo userExtraInfo;

    @SerializedName("zoneId")
    private String zoneId;

    public RequestBannerAdSuggestionJsonParams(String str, int i) {
        this.zoneId = str;
        this.bannerType = Integer.valueOf(i);
    }

    public Integer getBannerType() {
        return this.bannerType;
    }

    public UserExtraInfo getUserExtraInfo() {
        return this.userExtraInfo;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setBannerType(Integer num) {
        this.bannerType = num;
    }

    public void setUserExtraInfo(UserExtraInfo userExtraInfo) {
        this.userExtraInfo = userExtraInfo;
    }

    public void setZoneId(String str) {
        this.zoneId = str;
    }
}
