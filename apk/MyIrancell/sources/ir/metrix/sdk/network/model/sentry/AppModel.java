package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class AppModel {

    @SerializedName("app_id")
    public String appId;

    @SerializedName("app_min_sdk_version")
    public int appMinSdkVersion;

    @SerializedName("app_name")
    public String appName;

    @SerializedName("app_package_name")
    public String appPackageName;

    @SerializedName("app_target_sdk_version")
    public int appTargetSdkVersion;

    @SerializedName("app_version")
    public String appVersion;

    @SerializedName("app_version_code")
    public long appVersionCode;
}
