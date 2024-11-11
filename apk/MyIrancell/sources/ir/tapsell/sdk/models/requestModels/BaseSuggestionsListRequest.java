package ir.tapsell.sdk.models.requestModels;

import com.google.gson.annotations.SerializedName;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class BaseSuggestionsListRequest implements Serializable {

    @SerializedName("userExtraInfo")
    private UserExtraInfo userExtraInfo;

    @SerializedName("zoneId")
    private String zoneId;

    public abstract Integer calculateCacheType();

    public UserExtraInfo getUserExtraInfo() {
        return this.userExtraInfo;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setUserExtraInfo(UserExtraInfo userExtraInfo) {
        this.userExtraInfo = userExtraInfo;
    }

    public void setZoneId(String str) {
        this.zoneId = str;
    }
}
