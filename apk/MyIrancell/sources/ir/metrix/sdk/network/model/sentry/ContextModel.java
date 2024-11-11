package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class ContextModel {

    @SerializedName("app")
    public AppModel app;

    @SerializedName("device")
    public DeviceModel device;

    @SerializedName("metrix_sdk")
    public SdkModel metrixSdk;

    /* renamed from: os */
    @SerializedName("os")
    public OSModel f10799os;
}
