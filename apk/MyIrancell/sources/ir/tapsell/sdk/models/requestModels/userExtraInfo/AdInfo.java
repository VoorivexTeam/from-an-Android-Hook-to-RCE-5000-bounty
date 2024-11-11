package ir.tapsell.sdk.models.requestModels.userExtraInfo;

import com.google.gson.annotations.SerializedName;
import ir.tapsell.sdk.NoProguard;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AdInfo implements NoProguard, Serializable {

    @SerializedName("advertisingId")
    private String advertisingId;

    @SerializedName("limitAdTrackingEnabled")
    private Boolean limitAdTrackingEnabled;

    @SerializedName("userAdvertisingId")
    private String userAdvertisingId;

    public AdInfo(String str, Boolean bool) {
        setAdvertisingId(str);
        setLimitAdTrackingEnabled(bool);
    }

    public AdInfo(String str, Boolean bool, String str2) {
        setAdvertisingId(str);
        setLimitAdTrackingEnabled(bool);
        this.userAdvertisingId = str2;
    }

    public String getAdvertisingId() {
        return this.advertisingId;
    }

    public Boolean getLimitAdTrackingEnabled() {
        return this.limitAdTrackingEnabled;
    }

    public String getUserAdvertisingId() {
        return this.userAdvertisingId;
    }

    public void setAdvertisingId(String str) {
        this.advertisingId = str;
    }

    public void setLimitAdTrackingEnabled(Boolean bool) {
        this.limitAdTrackingEnabled = bool;
    }

    public void setUserAdvertisingId(String str) {
        this.userAdvertisingId = str;
    }
}
