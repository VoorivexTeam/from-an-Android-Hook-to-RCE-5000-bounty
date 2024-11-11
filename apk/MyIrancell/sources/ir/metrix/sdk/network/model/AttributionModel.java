package ir.metrix.sdk.network.model;

import com.google.gson.annotations.SerializedName;
import ir.metrix.sdk.AttributionStatus;
import ir.metrix.sdk.NoProguard;

/* loaded from: classes.dex */
public class AttributionModel implements NoProguard {

    @SerializedName("acquisitionAd")
    private String acquisitionAd;

    @SerializedName("acquisitionAdSet")
    private String acquisitionAdSet;

    @SerializedName("acquisitionCampaign")
    private String acquisitionCampaign;

    @SerializedName("acquisitionSource")
    private String acquisitionSource;

    @SerializedName("attributionStatus")
    private AttributionStatus attributionStatus;

    @SerializedName("trackerToken")
    private String trackerToken;

    public String getAcquisitionAd() {
        return this.acquisitionAd;
    }

    public String getAcquisitionAdSet() {
        return this.acquisitionAdSet;
    }

    public String getAcquisitionCampaign() {
        return this.acquisitionCampaign;
    }

    public String getAcquisitionSource() {
        return this.acquisitionSource;
    }

    public AttributionStatus getAttributionStatus() {
        AttributionStatus attributionStatus = this.attributionStatus;
        return attributionStatus != null ? attributionStatus : AttributionStatus.UNKNOWN;
    }

    public String getTrackerToken() {
        return this.trackerToken;
    }

    public void setAcquisitionAd(String str) {
        this.acquisitionAd = str;
    }

    public void setAcquisitionAdSet(String str) {
        this.acquisitionAdSet = str;
    }

    public void setAcquisitionCampaign(String str) {
        this.acquisitionCampaign = str;
    }

    public void setAcquisitionSource(String str) {
        this.acquisitionSource = str;
    }

    public void setAttributionStatus(AttributionStatus attributionStatus) {
        this.attributionStatus = attributionStatus;
    }

    public void setTrackerToken(String str) {
        this.trackerToken = str;
    }
}
