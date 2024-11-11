package ir.tapsell.sdk;

/* loaded from: classes.dex */
public interface TapsellAdRequestListener extends NoProguard {
    void onAdAvailable(TapsellAd tapsellAd);

    void onError(String str);

    void onExpiring(TapsellAd tapsellAd);

    void onNoAdAvailable();

    void onNoNetwork();
}
