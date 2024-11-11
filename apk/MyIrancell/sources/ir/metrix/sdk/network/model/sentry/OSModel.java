package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class OSModel {

    @SerializedName("build")
    public String build;

    @SerializedName("name")
    public String name;

    @SerializedName("rooted")
    public boolean rooted;

    @SerializedName("sdk_version")
    public int sdkVersion;

    @SerializedName("version")
    public String version;
}
