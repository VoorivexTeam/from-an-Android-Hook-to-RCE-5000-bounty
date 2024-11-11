package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class NativeVideoCreativeModel extends NativeBaseCreativeModel implements Serializable {

    @SerializedName("vastTrackingData")
    private VastTrackingData vastTrackingData;

    @SerializedName("vibrationPatterns")
    private List<VibrationPattern> vibrationPatterns;

    @SerializedName("videoUrl")
    private String videoUrl;

    public VastTrackingData getVastTrackingData() {
        return this.vastTrackingData;
    }

    public List<VibrationPattern> getVibrationPatterns() {
        return this.vibrationPatterns;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // ir.tapsell.sdk.models.responseModels.subModels.BaseCreativeModel
    public boolean isSupported() {
        return (getIconUrl() == null || getCallToActionText() == null || getCallToActionUrl() == null || (getCreativeType() != 2 && (getCreativeType() != 1 || getRate() == null)) || getVideoUrl() == null) ? false : true;
    }

    public void setVastTrackingData(VastTrackingData vastTrackingData) {
        this.vastTrackingData = vastTrackingData;
    }

    public void setVibrationPatterns(List<VibrationPattern> list) {
        this.vibrationPatterns = list;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }
}
