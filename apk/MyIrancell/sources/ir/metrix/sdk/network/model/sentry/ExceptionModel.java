package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class ExceptionModel {

    @SerializedName("module")
    public String module;

    @SerializedName("stacktrace")
    public StackTraceModel stacktrace;

    @SerializedName("type")
    public String type;

    @SerializedName("value")
    public String value;
}
