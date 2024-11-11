package ir.tapsell.sdk;

import android.app.Application;
import android.content.Context;
import p000.v40;

/* loaded from: classes.dex */
public class Tapsell implements NoProguard {
    public static void clearBandwidthUsageConstrains() {
        C2687f.m12900b();
    }

    public static String getVersion() {
        return C2687f.m12889a();
    }

    public static void initialize(Application application, TapsellConfiguration tapsellConfiguration, String str) {
        C2687f.m12891a(application, tapsellConfiguration, str, "-");
    }

    public static void initialize(Application application, String str) {
        C2687f.m12891a(application, (TapsellConfiguration) null, str, "-");
    }

    @Deprecated
    public static void initialize(Context context, TapsellConfiguration tapsellConfiguration, String str) {
        C2687f.m12892a(context.getApplicationContext(), tapsellConfiguration, str, "-");
    }

    @Deprecated
    public static void initialize(Context context, String str) {
        C2687f.m12892a(context.getApplicationContext(), (TapsellConfiguration) null, str, "-");
    }

    public static boolean isDebugMode(Context context) {
        return C2687f.m12899a(context);
    }

    public static void requestAd(Context context, String str) {
        C2687f.m12894a(context, str, (TapsellAdRequestOptions) null, (TapsellAdRequestListener) null);
    }

    public static void requestAd(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions) {
        C2687f.m12894a(context, str, tapsellAdRequestOptions, (TapsellAdRequestListener) null);
    }

    public static void requestAd(Context context, String str, TapsellAdRequestOptions tapsellAdRequestOptions, TapsellAdRequestListener tapsellAdRequestListener) {
        C2687f.m12894a(context, str, tapsellAdRequestOptions, tapsellAdRequestListener);
    }

    public static void setAdvertisingId(String str) {
        C2687f.m12897a(str);
    }

    public static void setDebugMode(Context context, boolean z) {
        C2687f.m12895a(context, z);
    }

    public static void setGDPR(boolean z) {
        C2687f.m12898a(z);
    }

    public static void setGDPRConsent(boolean z) {
        C2687f.m12905b(z);
    }

    public static void setMaxAllowedBandwidthUsage(int i) {
        C2687f.m12890a(i);
    }

    public static void setMaxAllowedBandwidthUsagePercentage(int i) {
        C2687f.m12901b(i);
    }

    public static void setRewardListener(TapsellRewardListener tapsellRewardListener) {
        v40.m15925a().m15929a(tapsellRewardListener);
    }
}
