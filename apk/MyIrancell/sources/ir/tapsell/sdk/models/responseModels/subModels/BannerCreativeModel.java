package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class BannerCreativeModel extends BaseCreativeModel implements Serializable {

    @SerializedName("bannerUrl")
    private String bannerUrl;

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    @Override // ir.tapsell.sdk.models.responseModels.subModels.BaseCreativeModel
    public boolean isSupported() {
        return true;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }
}
