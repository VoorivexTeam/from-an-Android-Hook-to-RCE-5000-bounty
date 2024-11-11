package ir.tapsell.sdk;

import java.util.List;
import java.util.Map;
import p000.g50;

/* loaded from: classes.dex */
public class TapsellAndroid extends AbstractC2684c implements NoProguard {
    @Override // ir.tapsell.sdk.InterfaceC2685d
    public boolean needsDirectAdCaching() {
        return false;
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void onDirectAdAvailable(String str, TapsellAd tapsellAd) {
        if (str == null) {
            List<TapsellAdRequestListener> list = this.defaultSubscribers;
            if (list != null) {
                for (TapsellAdRequestListener tapsellAdRequestListener : list) {
                    if (tapsellAdRequestListener != null) {
                        tapsellAdRequestListener.onAdAvailable(tapsellAd);
                    }
                }
                return;
            }
            return;
        }
        Map<String, List<TapsellAdRequestListener>> map = this.adRequestSubscribers;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        for (TapsellAdRequestListener tapsellAdRequestListener2 : this.adRequestSubscribers.get(str)) {
            if (tapsellAdRequestListener2 != null) {
                tapsellAdRequestListener2.onAdAvailable(tapsellAd);
            }
        }
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void onDirectAdClosed(String str, TapsellAd tapsellAd) {
        Map<String, TapsellAdShowListener> map = this.adShowSubscribers;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        TapsellAdShowListener tapsellAdShowListener = this.adShowSubscribers.get(str);
        if (tapsellAdShowListener != null) {
            tapsellAdShowListener.onClosed(tapsellAd);
        }
        this.adShowSubscribers.remove(str);
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void onDirectAdExpiring(String str, TapsellAd tapsellAd) {
        if (str == null) {
            List<TapsellAdRequestListener> list = this.defaultSubscribers;
            if (list != null) {
                for (TapsellAdRequestListener tapsellAdRequestListener : list) {
                    if (tapsellAdRequestListener != null) {
                        tapsellAdRequestListener.onExpiring(tapsellAd);
                    }
                }
                this.defaultSubscribers.clear();
                return;
            }
            return;
        }
        Map<String, List<TapsellAdRequestListener>> map = this.adRequestSubscribers;
        if (map != null) {
            try {
                for (TapsellAdRequestListener tapsellAdRequestListener2 : map.containsKey(str) ? this.adRequestSubscribers.get(str) : getNewRequestSubscribersList()) {
                    if (tapsellAdRequestListener2 != null) {
                        tapsellAdRequestListener2.onExpiring(tapsellAd);
                    }
                }
            } catch (Throwable th) {
                g50.m11895a(th);
            }
            this.adRequestSubscribers.remove(str);
        }
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void onDirectAdOpened(String str, TapsellAd tapsellAd) {
        TapsellAdShowListener tapsellAdShowListener;
        Map<String, TapsellAdShowListener> map = this.adShowSubscribers;
        if (map == null || !map.containsKey(str) || (tapsellAdShowListener = this.adShowSubscribers.get(str)) == null) {
            return;
        }
        tapsellAdShowListener.onOpened(tapsellAd);
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void onDirectAdShowFinished(String str, TapsellAd tapsellAd, boolean z) {
        TapsellRewardListener tapsellRewardListener = AbstractC2684c.listener;
        if (tapsellRewardListener != null) {
            tapsellRewardListener.onAdShowFinished(tapsellAd, z);
        }
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void onDirectError(String str, String str2) {
        if (str != null) {
            Map<String, List<TapsellAdRequestListener>> map = this.adRequestSubscribers;
            if (map != null) {
                for (TapsellAdRequestListener tapsellAdRequestListener : map.containsKey(str) ? this.adRequestSubscribers.get(str) : getNewRequestSubscribersList()) {
                    if (tapsellAdRequestListener != null) {
                        tapsellAdRequestListener.onError(str2);
                    }
                }
                this.adRequestSubscribers.remove(str);
                return;
            }
            return;
        }
        List<TapsellAdRequestListener> list = this.defaultSubscribers;
        if (list != null) {
            try {
                for (TapsellAdRequestListener tapsellAdRequestListener2 : list) {
                    if (tapsellAdRequestListener2 != null) {
                        tapsellAdRequestListener2.onError(str2);
                    }
                }
            } catch (Throwable th) {
                g50.m11895a(th);
            }
            this.defaultSubscribers.clear();
        }
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void onDirectNoAdAvailable(String str) {
        if (str == null) {
            List<TapsellAdRequestListener> list = this.defaultSubscribers;
            if (list != null) {
                for (TapsellAdRequestListener tapsellAdRequestListener : list) {
                    if (tapsellAdRequestListener != null) {
                        tapsellAdRequestListener.onNoAdAvailable();
                    }
                }
                this.defaultSubscribers.clear();
                return;
            }
            return;
        }
        Map<String, List<TapsellAdRequestListener>> map = this.adRequestSubscribers;
        if (map != null) {
            for (TapsellAdRequestListener tapsellAdRequestListener2 : map.containsKey(str) ? this.adRequestSubscribers.get(str) : getNewRequestSubscribersList()) {
                if (tapsellAdRequestListener2 != null) {
                    tapsellAdRequestListener2.onNoAdAvailable();
                }
            }
            this.adRequestSubscribers.remove(str);
        }
    }

    public void onDirectNoNetwork(String str) {
        if (str == null) {
            List<TapsellAdRequestListener> list = this.defaultSubscribers;
            if (list != null) {
                for (TapsellAdRequestListener tapsellAdRequestListener : list) {
                    if (tapsellAdRequestListener != null) {
                        tapsellAdRequestListener.onNoNetwork();
                    }
                }
                this.defaultSubscribers.clear();
                return;
            }
            return;
        }
        Map<String, List<TapsellAdRequestListener>> map = this.adRequestSubscribers;
        if (map != null) {
            for (TapsellAdRequestListener tapsellAdRequestListener2 : map.containsKey(str) ? this.adRequestSubscribers.get(str) : getNewRequestSubscribersList()) {
                if (tapsellAdRequestListener2 != null) {
                    tapsellAdRequestListener2.onNoNetwork();
                }
            }
            this.adRequestSubscribers.remove(str);
        }
    }

    @Override // ir.tapsell.sdk.AbstractC2684c, ir.tapsell.sdk.InterfaceC2685d
    public /* bridge */ /* synthetic */ void removeZoneListenerAfterDirectAdShowingWasCalled(String str) {
        super.removeZoneListenerAfterDirectAdShowingWasCalled(str);
    }

    @Override // ir.tapsell.sdk.AbstractC2684c, ir.tapsell.sdk.InterfaceC2685d
    public /* bridge */ /* synthetic */ void setDirectAdRewardCallback(TapsellRewardListener tapsellRewardListener) {
        super.setDirectAdRewardCallback(tapsellRewardListener);
    }

    @Override // ir.tapsell.sdk.AbstractC2684c, ir.tapsell.sdk.InterfaceC2685d
    public /* bridge */ /* synthetic */ void subscribeDirectAdRequestCallbacks(String str, TapsellAdRequestListener tapsellAdRequestListener) {
        super.subscribeDirectAdRequestCallbacks(str, tapsellAdRequestListener);
    }

    @Override // ir.tapsell.sdk.AbstractC2684c, ir.tapsell.sdk.InterfaceC2685d
    public /* bridge */ /* synthetic */ void subscribeDirectAdShowCallbacks(String str, TapsellAdShowListener tapsellAdShowListener) {
        super.subscribeDirectAdShowCallbacks(str, tapsellAdShowListener);
    }

    @Override // ir.tapsell.sdk.AbstractC2684c
    public /* bridge */ /* synthetic */ void unSubscribeDirectAdRequestCallbacks(String str, TapsellAdRequestListener tapsellAdRequestListener) {
        super.unSubscribeDirectAdRequestCallbacks(str, tapsellAdRequestListener);
    }

    @Override // ir.tapsell.sdk.AbstractC2684c
    public /* bridge */ /* synthetic */ void unSubscribeDirectAdShowCallbacks(String str, TapsellAdShowListener tapsellAdShowListener) {
        super.unSubscribeDirectAdShowCallbacks(str, tapsellAdShowListener);
    }
}
