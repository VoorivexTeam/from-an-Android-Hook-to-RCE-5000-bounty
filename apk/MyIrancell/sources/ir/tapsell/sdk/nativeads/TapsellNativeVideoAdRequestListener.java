package ir.tapsell.sdk.nativeads;

import ir.tapsell.sdk.NoProguard;
import p000.e70;

/* loaded from: classes.dex */
public interface TapsellNativeVideoAdRequestListener extends NoProguard {
    void onAdAvailable(e70 e70Var);

    void onError(String str);

    void onNoAdAvailable();

    void onNoNetwork();
}
