package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class SdkModel {

    @SerializedName("sdk_build_type")
    public String sdkBuildType;

    @SerializedName("sdk_platform")
    public String sdkPlatform;

    @SerializedName("sdk_plugin_version")
    public String sdkPluginVersion;

    @SerializedName("sdk_version_code")
    public int sdkVersionCode;

    @SerializedName("sdk_version_name")
    public String sdkVersionName;
}
