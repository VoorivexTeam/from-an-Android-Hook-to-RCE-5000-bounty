package ir.tapsell.sdk;

/* loaded from: classes.dex */
public interface d {
    boolean needsDirectAdCaching();

    void onDirectAdAvailable(String str, TapsellAd tapsellAd);

    void onDirectAdClosed(String str, TapsellAd tapsellAd);

    void onDirectAdExpiring(String str, TapsellAd tapsellAd);

    void onDirectAdOpened(String str, TapsellAd tapsellAd);

    void onDirectAdShowFinished(String str, TapsellAd tapsellAd, boolean z);

    void onDirectError(String str, String str2);

    void onDirectNoAdAvailable(String str);

    void removeZoneListenerAfterDirectAdShowingWasCalled(String str);

    void setDirectAdRewardCallback(TapsellRewardListener tapsellRewardListener);

    void subscribeDirectAdRequestCallbacks(String str, TapsellAdRequestListener tapsellAdRequestListener);

    void subscribeDirectAdShowCallbacks(String str, TapsellAdShowListener tapsellAdShowListener);
}
