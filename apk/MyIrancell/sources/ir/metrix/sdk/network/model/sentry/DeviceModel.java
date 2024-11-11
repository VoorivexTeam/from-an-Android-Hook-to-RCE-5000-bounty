package ir.metrix.sdk.network.model.sentry;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class DeviceModel {

    @SerializedName("brand")
    public String brand;

    @SerializedName("device_id")
    public String deviceId;

    @SerializedName("finger_print")
    public String fingerPrint;

    @SerializedName("free_memory")
    public long freeMemory;

    @SerializedName("low_memory")
    public boolean lowMemory;

    @SerializedName("manufacturer")
    public String manufacturer;

    @SerializedName("memory_size")
    public long memorySize;

    @SerializedName("model")
    public String model;

    @SerializedName("model_id")
    public String modelId;

    @SerializedName("online")
    public boolean online;

    @SerializedName("orientation")
    public String orientation;

    @SerializedName("simulator")
    public boolean simulator;

    @SerializedName("version")
    public String version;
}
