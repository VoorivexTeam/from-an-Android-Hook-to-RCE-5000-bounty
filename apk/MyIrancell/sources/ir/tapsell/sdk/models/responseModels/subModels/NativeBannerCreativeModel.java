package ir.tapsell.sdk.models.responseModels.subModels;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class NativeBannerCreativeModel extends NativeBaseCreativeModel implements Serializable {

    @SerializedName("landscapeStaticImageUrl")
    private String landscapeStaticImageUrl;

    @SerializedName("portraitStaticImageUrl")
    private String portraitStaticImageUrl;

    public String getLandscapeStaticImageUrl() {
        return this.landscapeStaticImageUrl;
    }

    public String getPortraitStaticImageUrl() {
        return this.portraitStaticImageUrl;
    }

    @Override // ir.tapsell.sdk.models.responseModels.subModels.BaseCreativeModel
    public boolean isSupported() {
        return (getIconUrl() == null || getCallToActionText() == null || getCallToActionUrl() == null || (getCreativeType() != 2 && (getCreativeType() != 1 || getRate() == null)) || (getPortraitStaticImageUrl() == null && getLandscapeStaticImageUrl() == null)) ? false : true;
    }

    public void setLandscapeStaticImageUrl(String str) {
        this.landscapeStaticImageUrl = str;
    }

    public void setPortraitStaticImageUrl(String str) {
        this.portraitStaticImageUrl = str;
    }
}
