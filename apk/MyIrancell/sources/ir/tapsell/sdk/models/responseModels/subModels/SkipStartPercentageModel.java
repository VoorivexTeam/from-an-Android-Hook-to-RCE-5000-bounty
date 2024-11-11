package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class SkipStartPercentageModel implements Serializable {
    public static final int TYPE_DISABLE_BACK = 1;

    @SerializedName("skipStartPercentage")
    private Integer skipStartPercentage;

    @SerializedName("type")
    private Integer type;

    public Integer getSkipStartPercentage() {
        return this.skipStartPercentage;
    }

    public Integer getType() {
        return this.type;
    }

    public void setSkipStartPercentage(Integer num) {
        this.skipStartPercentage = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }
}
