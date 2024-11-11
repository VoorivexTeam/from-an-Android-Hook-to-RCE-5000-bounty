package ir.tapsell.sdk.nativeads;

import ir.tapsell.sdk.NoProguard;

/* loaded from: classes.dex */
public class TapsellNativeBanner implements NoProguard {
    public String adId;
    public String callToActionText;
    public String description;
    public String iconUrl;
    public String landscapeImageUrl;
    public String portraitImageUrl;
    public String title;

    public TapsellNativeBanner(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.adId = str;
        this.title = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.callToActionText = str5;
        this.portraitImageUrl = str6;
        this.landscapeImageUrl = str7;
    }
}
