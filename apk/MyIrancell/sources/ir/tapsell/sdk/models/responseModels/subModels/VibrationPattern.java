package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class VibrationPattern implements Serializable {

    @SerializedName("pattern")
    private List<Long> pattern;

    @SerializedName("vibrationStartMomentInSeconds")
    private double vibrationStartMomentInSeconds;

    public List<Long> getPattern() {
        return this.pattern;
    }

    public double getVibrationStartMomentInSeconds() {
        return this.vibrationStartMomentInSeconds;
    }

    public void setPattern(List<Long> list) {
        this.pattern = list;
    }

    public void setVibrationStartMomentInSeconds(double d) {
        this.vibrationStartMomentInSeconds = d;
    }
}
