package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class SentryCrashModel {

    @SerializedName("contexts")
    public ContextModel contexts;

    @SerializedName("sentry.interfaces.Exception")
    public ExceptionModel crashElement;

    @SerializedName("message")
    public String message;

    @SerializedName("platform")
    public String platform;

    @SerializedName("tags")
    public TagsModel tags;

    @SerializedName("timestamp")
    public String timestamp;

    @SerializedName("sentry.interfaces.User")
    public UserModel user;
}
