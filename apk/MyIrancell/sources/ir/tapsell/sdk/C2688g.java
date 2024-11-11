package ir.tapsell.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import ir.tapsell.sdk.models.responseModels.SdkConfigurationResponseModel;
import ir.tapsell.sdk.utils.GsonHelper;
import java.util.concurrent.TimeUnit;
import p000.z40;

/* renamed from: ir.tapsell.sdk.g */
/* loaded from: classes.dex */
public class C2688g {

    /* renamed from: d */
    private static C2688g f11041d;

    /* renamed from: a */
    private SharedPreferences f11042a;

    /* renamed from: b */
    private final Boolean f11043b = true;

    /* renamed from: c */
    private final Boolean f11044c = true;

    static {
        TimeUnit.MINUTES.toMillis(15L);
    }

    /* renamed from: a */
    private void m12909a(String str, String str2) {
        SharedPreferences.Editor edit = m12914k().edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: a */
    private void m12910a(String str, boolean z) {
        SharedPreferences.Editor edit = m12914k().edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: b */
    private boolean m12911b(String str, boolean z) {
        return m12914k().getBoolean(str, z);
    }

    /* renamed from: g */
    private String m12912g(String str) {
        return m12914k().getString(str, "");
    }

    /* renamed from: j */
    public static C2688g m12913j() {
        if (f11041d == null) {
            f11041d = new C2688g();
        }
        return f11041d;
    }

    /* renamed from: k */
    private SharedPreferences m12914k() {
        SharedPreferences sharedPreferences = this.f11042a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new RuntimeException("pref is null");
    }

    /* renamed from: a */
    public String m12915a() {
        return m12912g("developer-key");
    }

    /* renamed from: a */
    public void m12916a(Context context) {
        if (this.f11042a != null) {
            return;
        }
        this.f11042a = context.getSharedPreferences("TapseelPreferences", 0);
    }

    /* renamed from: a */
    public void m12917a(String str) {
        m12909a("developer-key", str);
    }

    /* renamed from: a */
    public void m12918a(boolean z) {
        m12910a("debug-mode-key", z);
    }

    /* renamed from: b */
    public void m12919b(String str) {
        m12909a("tapsell-user-id", str);
        z40.m16734K().m16744a(str);
    }

    /* renamed from: b */
    public void m12920b(boolean z) {
        m12910a("limit-ad-tracking-enabled", z);
    }

    /* renamed from: b */
    public boolean m12921b() {
        return m12911b("debug-mode-key", false);
    }

    /* renamed from: c */
    public String m12922c() {
        return m12912g("tapsell-user-id");
    }

    /* renamed from: c */
    public void m12923c(String str) {
        m12909a("authorization", str);
    }

    /* renamed from: c */
    public void m12924c(boolean z) {
        m12910a("gdprConsent", z);
    }

    /* renamed from: d */
    public String m12925d() {
        return m12912g("authorization");
    }

    /* renamed from: d */
    public void m12926d(String str) {
        m12909a("advertising-client-id", str);
    }

    /* renamed from: e */
    public String m12927e() {
        return m12912g("advertising-client-id");
    }

    /* renamed from: e */
    public void m12928e(String str) {
        m12909a("user_advertising_id", str);
    }

    /* renamed from: f */
    public void m12929f(String str) {
        m12909a("gdprLocation", str);
    }

    /* renamed from: f */
    public boolean m12930f() {
        return m12911b("limit-ad-tracking-enabled", false);
    }

    /* renamed from: g */
    public SdkConfigurationResponseModel m12931g() {
        SdkConfigurationResponseModel sdkConfigurationResponseModel = (SdkConfigurationResponseModel) GsonHelper.getCustomGson().fromJson(m12912g("sdk-configuration-key"), SdkConfigurationResponseModel.class);
        if (sdkConfigurationResponseModel != null) {
            return sdkConfigurationResponseModel;
        }
        SdkConfigurationResponseModel sdkConfigurationResponseModel2 = new SdkConfigurationResponseModel();
        sdkConfigurationResponseModel2.setEnableAppData(this.f11043b);
        sdkConfigurationResponseModel2.setEnable(this.f11044c);
        sdkConfigurationResponseModel2.setAppKey(null);
        sdkConfigurationResponseModel2.setTapsellLatestSdkVersion("4.3.5-MTN");
        return sdkConfigurationResponseModel2;
    }

    /* renamed from: h */
    public boolean m12932h() {
        return m12911b("gdprConsent", false);
    }

    /* renamed from: i */
    public String m12933i() {
        return m12912g("gdprLocation");
    }
}
