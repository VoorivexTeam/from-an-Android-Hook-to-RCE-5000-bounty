package ir.tapsell.sdk.models.responseModels;

import ir.tapsell.sdk.NoProguard;
import java.io.Serializable;
import p000.d70;

/* loaded from: classes.dex */
public class TapsellNativeBannerAdModel extends TapsellNativeAdModel<d70> implements NoProguard, Serializable {
    private d70 adSuggestion;
    private boolean isTotalTimeCountdownStarted;
    private long totalTimeOnScreen;
    private String zoneId;

    public TapsellNativeBannerAdModel() {
        this.isTotalTimeCountdownStarted = false;
        this.totalTimeOnScreen = 0L;
        this.isFilledStateReported = false;
        this.isDoingStateReported = false;
        this.isDoneStateReported = false;
        this.totalTimeOnScreen = 0L;
        this.isTotalTimeCountdownStarted = false;
    }

    @Override // ir.tapsell.sdk.models.responseModels.TapsellNativeAdModel
    public d70 getAdSuggestion() {
        return this.adSuggestion;
    }

    public long getTotalTimeOnScreen() {
        return this.totalTimeOnScreen;
    }

    public String getZoneId() {
        String str = this.zoneId;
        return (str == null || str.isEmpty()) ? "NATIVE_ZONE_ID" : this.zoneId;
    }

    public boolean isTotalTimeCountdownStarted() {
        return this.isTotalTimeCountdownStarted;
    }

    public void setAdSuggestion(d70 d70Var) {
        this.adSuggestion = d70Var;
    }

    public void setTotalTimeCountdownStarted(boolean z) {
        this.isTotalTimeCountdownStarted = z;
    }

    public void setTotalTimeOnScreen(long j) {
        this.totalTimeOnScreen = j;
    }

    public void setZoneId(String str) {
        this.zoneId = str;
    }
}
