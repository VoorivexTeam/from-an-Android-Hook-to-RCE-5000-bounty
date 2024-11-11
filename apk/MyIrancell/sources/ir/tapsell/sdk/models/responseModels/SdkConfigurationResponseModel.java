package ir.tapsell.sdk.models.responseModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class SdkConfigurationResponseModel implements Serializable {

    @SerializedName("appKey")
    private String appKey;

    @SerializedName("eType")
    private int eType;

    @SerializedName("enable")
    private Boolean enable;

    @SerializedName("ead")
    private Boolean enableAppData;

    @SerializedName("forceHttps")
    private boolean forceHttps;

    @SerializedName("tapsellLatestSdkVersion")
    private String tapsellLatestSdkVersion;

    public String getAppKey() {
        return this.appKey;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public Boolean getEnableAppData() {
        return this.enableAppData;
    }

    public String getTapsellLatestSdkVersion() {
        return this.tapsellLatestSdkVersion;
    }

    public int geteType() {
        return this.eType;
    }

    public boolean isForceHttps() {
        return this.forceHttps;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public void setEnableAppData(Boolean bool) {
        this.enableAppData = bool;
    }

    public void setForceHttps(boolean z) {
        this.forceHttps = z;
    }

    public void setTapsellLatestSdkVersion(String str) {
        this.tapsellLatestSdkVersion = str;
    }

    public void seteType(int i) {
        this.eType = i;
    }

    public String toString() {
        return "SdkConfigurationResponseModel{forceHttps=" + this.forceHttps + ", enable=" + this.enable + ", appKey='" + this.appKey + "', enableAppData=" + this.enableAppData + ", tapsellLatestSdkVersion='" + this.tapsellLatestSdkVersion + "', eType=" + this.eType + '}';
    }
}
