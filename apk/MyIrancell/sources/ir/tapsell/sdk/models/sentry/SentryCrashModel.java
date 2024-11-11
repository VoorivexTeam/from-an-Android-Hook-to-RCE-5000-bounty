package ir.tapsell.sdk.models.sentry;

import com.google.gson.annotations.SerializedName;
import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class SentryCrashModel implements NoProguard {
    public ContextModel contexts;

    @SerializedName("sentry.interfaces.Exception")
    public ExeptionModel crashElement;
    public String message;
    public String platform;
    public TagsModel tags;
    public String timestamp;

    @SerializedName("sentry.interfaces.User")
    public UserModel user;
}
