package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class TrackerModel implements Serializable {
    public static final int TRACKER_TYPE_PACKAGE_EXISTS = 1;

    @SerializedName("minVersion")
    private Integer minVersion;

    @SerializedName("packageName")
    private String packageName;

    @SerializedName("type")
    private Integer type;

    public Integer getMinVersion() {
        return this.minVersion;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Integer getType() {
        return this.type;
    }

    public void setMinVersion(Integer num) {
        this.minVersion = num;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }
}
