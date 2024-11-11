package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class VastTrackingData implements Serializable {

    @SerializedName("completeTrackerUrls")
    private List<String> completeTrackerUrls;

    @SerializedName("exitFullscreenTrackerUrls")
    private List<String> exitFullscreenTrackerUrls;

    @SerializedName("firstQuartileTrackerUrls")
    private List<String> firstQuartileTrackerUrls;

    @SerializedName("fullscreenTrackerUrls")
    private List<String> fullscreenTrackerUrls;

    @SerializedName("midpointTrackerUrls")
    private List<String> midpointTrackerUrls;

    @SerializedName("muteTrackerUrls")
    private List<String> muteTrackerUrls;

    @SerializedName("progressTrackingUrls")
    private List<KeyValuePair<String, String>> progressTrackingUrls;

    @SerializedName("replayTrackerUrls")
    private List<String> replayTrackerUrls;

    @SerializedName("skipTrackerUrls")
    private List<String> skipTrackerUrls;

    @SerializedName("startTrackerUrls")
    private List<String> startTrackerUrls;

    @SerializedName("thirdQuartileTrackerUrls")
    private List<String> thirdQuartileTrackerUrls;

    @SerializedName("unmuteTrackerUrls")
    private List<String> unmuteTrackerUrls;

    @SerializedName("isStartTrackerReported")
    private boolean isStartTrackerReported = false;

    @SerializedName("isFirstQuartileTrackerReported")
    private boolean isFirstQuartileTrackerReported = false;

    @SerializedName("isMidpointTrackerReported")
    private boolean isMidpointTrackerReported = false;

    @SerializedName("isThirdQuartileTrackerReported")
    private boolean isThirdQuartileTrackerReported = false;

    @SerializedName("isCompleteTrackerReported")
    private boolean isCompleteTrackerReported = false;

    @SerializedName("isFullscreenTrackerReported")
    private boolean isFullscreenTrackerReported = false;

    @SerializedName("isExitFullscreenTrackerReported")
    private boolean isExitFullscreenTrackerReported = false;

    @SerializedName("isSkipTrackerReported")
    private boolean isSkipTrackerReported = false;

    public List<String> getCompleteTrackerUrls() {
        return this.completeTrackerUrls;
    }

    public List<String> getExitFullscreenTrackerUrls() {
        return this.exitFullscreenTrackerUrls;
    }

    public List<String> getFirstQuartileTrackerUrls() {
        return this.firstQuartileTrackerUrls;
    }

    public List<String> getFullscreenTrackerUrls() {
        return this.fullscreenTrackerUrls;
    }

    public List<String> getMidpointTrackerUrls() {
        return this.midpointTrackerUrls;
    }

    public List<String> getMuteTrackerUrls() {
        return this.muteTrackerUrls;
    }

    public List<KeyValuePair<String, String>> getProgressTrackingUrls() {
        return this.progressTrackingUrls;
    }

    public List<String> getReplayTrackerUrls() {
        return this.replayTrackerUrls;
    }

    public List<String> getSkipTrackerUrls() {
        return this.skipTrackerUrls;
    }

    public List<String> getStartTrackerUrls() {
        return this.startTrackerUrls;
    }

    public List<String> getThirdQuartileTrackerUrls() {
        return this.thirdQuartileTrackerUrls;
    }

    public List<String> getUnmuteTrackerUrls() {
        return this.unmuteTrackerUrls;
    }

    public boolean isCompleteTrackerReported() {
        return this.isCompleteTrackerReported;
    }

    public boolean isExitFullscreenTrackerReported() {
        return this.isExitFullscreenTrackerReported;
    }

    public boolean isFirstQuartileTrackerReported() {
        return this.isFirstQuartileTrackerReported;
    }

    public boolean isFullscreenTrackerReported() {
        return this.isFullscreenTrackerReported;
    }

    public boolean isMidpointTrackerReported() {
        return this.isMidpointTrackerReported;
    }

    public boolean isSkipTrackerReported() {
        return this.isSkipTrackerReported;
    }

    public boolean isStartTrackerReported() {
        return this.isStartTrackerReported;
    }

    public boolean isThirdQuartileTrackerReported() {
        return this.isThirdQuartileTrackerReported;
    }

    public void setCompleteTrackerReported(boolean z) {
        this.isCompleteTrackerReported = z;
    }

    public void setCompleteTrackerUrls(List<String> list) {
        this.completeTrackerUrls = list;
    }

    public void setExitFullscreenTrackerReported(boolean z) {
        this.isExitFullscreenTrackerReported = z;
    }

    public void setExitFullscreenTrackerUrls(List<String> list) {
        this.exitFullscreenTrackerUrls = list;
    }

    public void setFirstQuartileTrackerReported(boolean z) {
        this.isFirstQuartileTrackerReported = z;
    }

    public void setFirstQuartileTrackerUrls(List<String> list) {
        this.firstQuartileTrackerUrls = list;
    }

    public void setFullscreenTrackerReported(boolean z) {
        this.isFullscreenTrackerReported = z;
    }

    public void setFullscreenTrackerUrls(List<String> list) {
        this.fullscreenTrackerUrls = list;
    }

    public void setMidpointTrackerReported(boolean z) {
        this.isMidpointTrackerReported = z;
    }

    public void setMidpointTrackerUrls(List<String> list) {
        this.midpointTrackerUrls = list;
    }

    public void setMuteTrackerUrls(List<String> list) {
        this.muteTrackerUrls = list;
    }

    public void setProgressTrackingUrls(List<KeyValuePair<String, String>> list) {
        this.progressTrackingUrls = list;
    }

    public void setReplayTrackerUrls(List<String> list) {
        this.replayTrackerUrls = list;
    }

    public void setSkipTrackerReported(boolean z) {
        this.isSkipTrackerReported = z;
    }

    public void setSkipTrackerUrls(List<String> list) {
        this.skipTrackerUrls = list;
    }

    public void setStartTrackerReported(boolean z) {
        this.isStartTrackerReported = z;
    }

    public void setStartTrackerUrls(List<String> list) {
        this.startTrackerUrls = list;
    }

    public void setThirdQuartileTrackerReported(boolean z) {
        this.isThirdQuartileTrackerReported = z;
    }

    public void setThirdQuartileTrackerUrls(List<String> list) {
        this.thirdQuartileTrackerUrls = list;
    }

    public void setUnmuteTrackerUrls(List<String> list) {
        this.unmuteTrackerUrls = list;
    }
}
