package ir.tapsell.sdk.bannerads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import ir.metrix.sdk.Metrix;
import ir.tapsell.sdk.C2687f;
import ir.tapsell.sdk.NoProguard;
import ir.tapsell.sdk.utils.C2771m;
import java.util.HashMap;
import p000.z40;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TapsellBannerViewInterface implements NoProguard {
    public static final String INTERFACE_NAME = "JSInterface";
    private static final Integer MIN_PACKAGE_LENGTH = 1;
    private final Context mContext;
    private final TapsellBannerWebView tapsellBannerView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapsellBannerViewInterface(Context context, TapsellBannerWebView tapsellBannerWebView) {
        this.tapsellBannerView = tapsellBannerWebView;
        this.mContext = context;
    }

    @JavascriptInterface
    public void hideBannerView() {
        TapsellBannerWebView tapsellBannerWebView = this.tapsellBannerView;
        if (tapsellBannerWebView != null) {
            tapsellBannerWebView.hideBannerView();
        }
    }

    @JavascriptInterface
    public void onAdWasDoing(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", this.tapsellBannerView.getZoneId());
        hashMap.put("METRIX_DATA_SUGGESTION_ID", str);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("izaft", hashMap, null);
    }

    @JavascriptInterface
    public void onAdWasDone(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", this.tapsellBannerView.getZoneId());
        hashMap.put("METRIX_DATA_SUGGESTION_ID", str);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("lmsmd", hashMap, null);
    }

    @JavascriptInterface
    public void onError(String str) {
        TapsellBannerWebView tapsellBannerWebView = this.tapsellBannerView;
        if (tapsellBannerWebView != null) {
            tapsellBannerWebView.onError(str);
        }
    }

    @JavascriptInterface
    public void onNoAdAvailable() {
        TapsellBannerWebView tapsellBannerWebView = this.tapsellBannerView;
        if (tapsellBannerWebView != null) {
            tapsellBannerWebView.onNoAdAvailable();
        }
    }

    @JavascriptInterface
    public void onRequestClick(String str) {
        try {
            Boolean bool = C2687f.f11025f.get(str);
            if (bool == null || !bool.booleanValue()) {
                HashMap hashMap = new HashMap();
                hashMap.put("METRIX_DATA_ZONE_ID", this.tapsellBannerView.getZoneId());
                hashMap.put("METRIX_DATA_SUGGESTION_ID", str);
                hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
                Metrix.getInstance().newEvent("wzkkm", hashMap, null);
                C2687f.f11025f.put(str, true);
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void onRequestFilled() {
    }

    @JavascriptInterface
    public void onRequestFilled(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("METRIX_DATA_ZONE_ID", this.tapsellBannerView.getZoneId());
        hashMap.put("METRIX_DATA_SUGGESTION_ID", str);
        hashMap.put("METRIX_DATA_TAPSELL_USER_ID", z40.m16734K().m16757n().getUserId());
        Metrix.getInstance().newEvent("qibdk", hashMap, null);
        TapsellBannerWebView tapsellBannerWebView = this.tapsellBannerView;
        if (tapsellBannerWebView != null) {
            tapsellBannerWebView.onRequestFilled();
        }
    }

    @JavascriptInterface
    public void startIntent(String str, String str2, String str3, String str4, String str5) {
        try {
            Intent intent = new Intent(str, Uri.parse(str2));
            if (str5 != null && str5.length() >= MIN_PACKAGE_LENGTH.intValue()) {
                intent.setPackage(str5);
            }
            if (Boolean.parseBoolean(str3)) {
                this.mContext.startService(intent);
                return;
            }
            if ("android.intent.action.VIEW".equalsIgnoreCase(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("Referer", "tapsell");
                bundle.putString("Referrer", "tapsell");
                intent.putExtra("com.android.browser.headers", bundle);
            }
            intent.setFlags(268435456);
            this.mContext.startActivity(intent);
        } catch (Exception unused) {
            C2771m.m13178a(this.mContext, C2771m.m13176a(str2));
        }
    }
}
