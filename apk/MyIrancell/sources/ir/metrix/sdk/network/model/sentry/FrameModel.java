package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class FrameModel {

    @SerializedName("filename")
    public String filename;

    @SerializedName("function")
    public String function;

    @SerializedName("in_app")
    public boolean inApp;

    @SerializedName("lineno")
    public int lineno;

    @SerializedName("module")
    public String module;
}
