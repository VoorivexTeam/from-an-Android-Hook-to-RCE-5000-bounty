package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class SuggestionValidationRuleModel implements Serializable {
    public static final int TYPE_IMEI = 4;
    public static final int TYPE_NONE = 1;
    public static final int TYPE_PACKAGE_EXIST = 2;
    public static final int TYPE_PACKAGE_NOT_EXIST = 3;

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
