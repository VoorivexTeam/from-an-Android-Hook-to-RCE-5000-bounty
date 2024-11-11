package ir.tapsell.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.z40;
import ir.tapsell.sdk.models.responseModels.SdkConfigurationResponseModel;
import ir.tapsell.sdk.utils.GsonHelper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class g {
    private static g d;
    private SharedPreferences a;
    private final Boolean b = true;
    private final Boolean c = true;

    static {
        TimeUnit.MINUTES.toMillis(15L);
    }

    private void a(String str, String str2) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(str, str2);
        edit.apply();
    }

    private void a(String str, boolean z) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    private boolean b(String str, boolean z) {
        return k().getBoolean(str, z);
    }

    private String g(String str) {
        return k().getString(str, "");
    }

    public static g j() {
        if (d == null) {
            d = new g();
        }
        return d;
    }

    private SharedPreferences k() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new RuntimeException("pref is null");
    }

    public String a() {
        return g("developer-key");
    }

    public void a(Context context) {
        if (this.a != null) {
            return;
        }
        this.a = context.getSharedPreferences("TapseelPreferences", 0);
    }

    public void a(String str) {
        a("developer-key", str);
    }

    public void a(boolean z) {
        a("debug-mode-key", z);
    }

    public void b(String str) {
        a("tapsell-user-id", str);
        z40.K().a(str);
    }

    public void b(boolean z) {
        a("limit-ad-tracking-enabled", z);
    }

    public boolean b() {
        return b("debug-mode-key", false);
    }

    public String c() {
        return g("tapsell-user-id");
    }

    public void c(String str) {
        a("authorization", str);
    }

    public void c(boolean z) {
        a("gdprConsent", z);
    }

    public String d() {
        return g("authorization");
    }

    public void d(String str) {
        a("advertising-client-id", str);
    }

    public String e() {
        return g("advertising-client-id");
    }

    public void e(String str) {
        a("user_advertising_id", str);
    }

    public void f(String str) {
        a("gdprLocation", str);
    }

    public boolean f() {
        return b("limit-ad-tracking-enabled", false);
    }

    public SdkConfigurationResponseModel g() {
        SdkConfigurationResponseModel sdkConfigurationResponseModel = (SdkConfigurationResponseModel) GsonHelper.getCustomGson().fromJson(g("sdk-configuration-key"), SdkConfigurationResponseModel.class);
        if (sdkConfigurationResponseModel != null) {
            return sdkConfigurationResponseModel;
        }
        SdkConfigurationResponseModel sdkConfigurationResponseModel2 = new SdkConfigurationResponseModel();
        sdkConfigurationResponseModel2.setEnableAppData(this.b);
        sdkConfigurationResponseModel2.setEnable(this.c);
        sdkConfigurationResponseModel2.setAppKey(null);
        sdkConfigurationResponseModel2.setTapsellLatestSdkVersion("4.3.5-MTN");
        return sdkConfigurationResponseModel2;
    }

    public boolean h() {
        return b("gdprConsent", false);
    }

    public String i() {
        return g("gdprLocation");
    }
}
