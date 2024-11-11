package defpackage;

import android.content.Context;
import ir.tapsell.sdk.f;
import ir.tapsell.sdk.g;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;

/* loaded from: classes.dex */
public class z40 {
    private static z40 f;
    private Context a;
    private String b;
    private SdkPlatformEnum c;
    private String d;
    private UserExtraInfo e;

    private z40(Context context, String str, SdkPlatformEnum sdkPlatformEnum) {
        this.a = context;
        this.b = str;
        this.c = sdkPlatformEnum;
    }

    private void H() {
        a50.a(this.e);
        a50.b(this.a, this.e);
        a50.a(this.a, this.e, true);
        x40.a(this.a, this.e);
        e50.a(this.e);
        this.e.setDataAvailability(c50.a(this.a));
        this.e.setDeviceLanguage(a50.a());
        this.e.setNpa(true);
    }

    private boolean I() {
        if (g.j().h()) {
            return false;
        }
        String i = g.j().i();
        if (i != null && !i.isEmpty()) {
            return !i.equals("GDPR_OUTSIDE_EU");
        }
        r50.a();
        return true;
    }

    private void J() {
    }

    public static z40 K() {
        return f;
    }

    public static void a(Context context, String str, SdkPlatformEnum sdkPlatformEnum) {
        if (f == null) {
            f = new z40(context, str, sdkPlatformEnum);
        }
    }

    public Boolean A() {
        if (this.e.getAdInfo() == null) {
            return null;
        }
        return this.e.getAdInfo().getLimitAdTrackingEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int B() {
        UserExtraInfo userExtraInfo = this.e;
        if (userExtraInfo == null) {
            return 0;
        }
        return userExtraInfo.getAppVersionCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String C() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getAppVersionName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        UserExtraInfo userExtraInfo = this.e;
        if (userExtraInfo == null) {
            return false;
        }
        return userExtraInfo.getDataAvailability();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String E() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getDeviceBrand();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String F() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getDeviceLanguage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float G() {
        UserExtraInfo userExtraInfo = this.e;
        if (userExtraInfo == null) {
            return 0.0f;
        }
        return userExtraInfo.getScreenDensity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        UserExtraInfo userExtraInfo = this.e;
        if (userExtraInfo == null) {
            return 0;
        }
        return userExtraInfo.getScreenHeight();
    }

    public void a(String str) {
        this.e.setUserId(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        UserExtraInfo userExtraInfo = this.e;
        if (userExtraInfo == null) {
            return 0;
        }
        return userExtraInfo.getScreenOrientation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        UserExtraInfo userExtraInfo = this.e;
        if (userExtraInfo == null) {
            return 0;
        }
        return userExtraInfo.getScreenWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getUserId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getCustomerUserId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return e50.b();
    }

    public void g() {
        i();
    }

    public String h() {
        String str = this.d;
        return str == null ? "" : str;
    }

    public void i() {
        this.e = new UserExtraInfo();
        this.d = a50.b();
        e50.a(this.b);
        e50.a(this.c);
        if (f.b && I()) {
            H();
            return;
        }
        a50.b(this.e);
        a50.a(this.a, this.e);
        a50.a(this.e);
        a50.b(this.a, this.e);
        a50.a(this.a, this.e, false);
        x40.a(this.a, this.e);
        e50.a(this.e);
        this.e.setDataAvailability(c50.a(this.a));
        this.e.setDeviceLanguage(a50.a());
        this.e.setNpa(false);
    }

    public String j() {
        return this.a.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getImei();
    }

    public String l() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : String.valueOf(userExtraInfo.getNetworkType());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String m() {
        return String.valueOf(c50.a(c50.a()));
    }

    public UserExtraInfo n() {
        J();
        return this.e;
    }

    public String o() {
        return e50.a();
    }

    public String p() {
        return e50.f().name().toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String q() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String r() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getOs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String s() {
        return e50.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String t() {
        return e50.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String u() {
        return this.e.getAdInfo() == null ? "" : this.e.getAdInfo().getAdvertisingId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int v() {
        return a50.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String w() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getDeviceManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String x() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getCarrier();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String y() {
        return e50.d();
    }

    public String z() {
        UserExtraInfo userExtraInfo = this.e;
        return userExtraInfo == null ? "" : userExtraInfo.getAndroidId();
    }
}
