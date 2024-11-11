package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class DirectCreativeModel extends BaseCreativeModel implements Serializable {

    @SerializedName("action")
    private ActionModel action;

    @SerializedName("ctaType")
    private Integer ctaType;

    @SerializedName("ctaUrl")
    private String ctaUrl;

    @SerializedName("skipStartPercentage")
    private SkipStartPercentageModel skipStartPercentage;

    @SerializedName("vastTrackingData")
    private VastTrackingData vastTrackingData;

    @SerializedName("vibrationPatterns")
    private List<VibrationPattern> vibrationPatterns;

    public ActionModel getAction() {
        return this.action;
    }

    public Integer getCtaType() {
        return this.ctaType;
    }

    public String getCtaUrl() {
        return this.ctaUrl;
    }

    public SkipStartPercentageModel getSkipStartPercentage() {
        return this.skipStartPercentage;
    }

    public VastTrackingData getVastTrackingData() {
        return this.vastTrackingData;
    }

    public List<VibrationPattern> getVibrationPatterns() {
        return this.vibrationPatterns;
    }

    public void setAction(ActionModel actionModel) {
        this.action = actionModel;
    }

    public void setCtaType(Integer num) {
        this.ctaType = num;
    }

    public void setCtaUrl(String str) {
        this.ctaUrl = str;
    }

    public void setSkipStartPercentage(SkipStartPercentageModel skipStartPercentageModel) {
        this.skipStartPercentage = skipStartPercentageModel;
    }

    public void setVastTrackingData(VastTrackingData vastTrackingData) {
        this.vastTrackingData = vastTrackingData;
    }

    public void setVibrationPatterns(List<VibrationPattern> list) {
        this.vibrationPatterns = list;
    }
}
