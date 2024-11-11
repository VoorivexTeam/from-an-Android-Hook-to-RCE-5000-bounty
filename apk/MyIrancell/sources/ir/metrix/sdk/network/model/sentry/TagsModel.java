package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class TagsModel {

    @SerializedName("app_id")
    public String appId;

    @SerializedName("app_target")
    public int appTarget;

    @SerializedName("brand")
    public String brand;

    @SerializedName("sdk_platform")
    public String sdkPlatform;

    @SerializedName("sdk_version")
    public String sdkVersion;
}
