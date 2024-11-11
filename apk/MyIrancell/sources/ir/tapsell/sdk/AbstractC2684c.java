package ir.tapsell.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ir.tapsell.sdk.c */
/* loaded from: classes.dex */
abstract class AbstractC2684c implements InterfaceC2685d {
    static TapsellRewardListener listener;
    final Map<String, List<TapsellAdRequestListener>> adRequestSubscribers = Collections.synchronizedMap(new HashMap());
    final Map<String, TapsellAdShowListener> adShowSubscribers = Collections.synchronizedMap(new HashMap());
    final List<TapsellAdRequestListener> defaultSubscribers = getNewRequestSubscribersList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<TapsellAdRequestListener> getNewRequestSubscribersList() {
        return Collections.synchronizedList(new ArrayList());
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void removeZoneListenerAfterDirectAdShowingWasCalled(String str) {
        if (str == null) {
            this.defaultSubscribers.clear();
        } else {
            this.adRequestSubscribers.remove(str);
        }
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void setDirectAdRewardCallback(TapsellRewardListener tapsellRewardListener) {
        listener = tapsellRewardListener;
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void subscribeDirectAdRequestCallbacks(String str, TapsellAdRequestListener tapsellAdRequestListener) {
        List<TapsellAdRequestListener> newRequestSubscribersList;
        if (str == null) {
            this.defaultSubscribers.clear();
            this.defaultSubscribers.add(tapsellAdRequestListener);
            return;
        }
        if (this.adRequestSubscribers.containsKey(str)) {
            newRequestSubscribersList = this.adRequestSubscribers.get(str);
            newRequestSubscribersList.clear();
        } else {
            newRequestSubscribersList = getNewRequestSubscribersList();
        }
        newRequestSubscribersList.add(tapsellAdRequestListener);
        this.adRequestSubscribers.put(str, newRequestSubscribersList);
    }

    @Override // ir.tapsell.sdk.InterfaceC2685d
    public void subscribeDirectAdShowCallbacks(String str, TapsellAdShowListener tapsellAdShowListener) {
        if (tapsellAdShowListener != null) {
            this.adShowSubscribers.put(str, tapsellAdShowListener);
        }
    }

    public void unSubscribeDirectAdRequestCallbacks(String str, TapsellAdRequestListener tapsellAdRequestListener) {
        if (str == null) {
            this.defaultSubscribers.remove(tapsellAdRequestListener);
            return;
        }
        List<TapsellAdRequestListener> newRequestSubscribersList = this.adRequestSubscribers.containsKey(str) ? this.adRequestSubscribers.get(str) : getNewRequestSubscribersList();
        newRequestSubscribersList.remove(tapsellAdRequestListener);
        this.adRequestSubscribers.put(str, newRequestSubscribersList);
    }

    public void unSubscribeDirectAdShowCallbacks(String str, TapsellAdShowListener tapsellAdShowListener) {
        this.adShowSubscribers.remove(str);
    }
}
