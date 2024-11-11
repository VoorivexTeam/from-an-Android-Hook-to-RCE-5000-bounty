package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NativeBaseCreativeModel extends BaseCreativeModel implements Serializable {

    @SerializedName("callToActionText")
    private String callToActionText;

    @SerializedName("callToActionUrl")
    private String callToActionUrl;

    @SerializedName("creativeType")
    private int creativeType;

    @SerializedName("iconUrl")
    private String iconUrl;

    @SerializedName("price")
    private String price;

    @SerializedName("rate")
    private Double rate;

    @SerializedName("storeName")
    private String storeName;

    @SerializedName("thirdPartyTrackingUrls")
    private List<String> thirdPartyTrackingUrls;

    public String getCallToActionText() {
        return this.callToActionText;
    }

    public String getCallToActionUrl() {
        return this.callToActionUrl;
    }

    public int getCreativeType() {
        return this.creativeType;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getPrice() {
        return this.price;
    }

    public Double getRate() {
        return this.rate;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public List<String> getThirdPartyTrackingUrls() {
        return this.thirdPartyTrackingUrls;
    }

    public void setCallToActionText(String str) {
        this.callToActionText = str;
    }

    public void setCallToActionUrl(String str) {
        this.callToActionUrl = str;
    }

    public void setCreativeType(int i) {
        this.creativeType = i;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setRate(Double d) {
        this.rate = d;
    }

    public void setStoreName(String str) {
        this.storeName = str;
    }

    public void setThirdPartyTrackingUrls(List<String> list) {
        this.thirdPartyTrackingUrls = list;
    }
}
