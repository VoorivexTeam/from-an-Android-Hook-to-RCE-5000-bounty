package p000;

import android.content.Context;
import ir.tapsell.sdk.C2687f;
import ir.tapsell.sdk.C2688g;
import ir.tapsell.sdk.models.SdkPlatformEnum;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.UserExtraInfo;

/* loaded from: classes.dex */
public class z40 {

    /* renamed from: f */
    private static z40 f14335f;

    /* renamed from: a */
    private Context f14336a;

    /* renamed from: b */
    private String f14337b;

    /* renamed from: c */
    private SdkPlatformEnum f14338c;

    /* renamed from: d */
    private String f14339d;

    /* renamed from: e */
    private UserExtraInfo f14340e;

    private z40(Context context, String str, SdkPlatformEnum sdkPlatformEnum) {
        this.f14336a = context;
        this.f14337b = str;
        this.f14338c = sdkPlatformEnum;
    }

    /* renamed from: H */
    private void m16731H() {
        a50.m61a(this.f14340e);
        a50.m67b(this.f14336a, this.f14340e);
        a50.m60a(this.f14336a, this.f14340e, true);
        x40.m16440a(this.f14336a, this.f14340e);
        e50.m11544a(this.f14340e);
        this.f14340e.setDataAvailability(c50.m3594a(this.f14336a));
        this.f14340e.setDeviceLanguage(a50.m55a());
        this.f14340e.setNpa(true);
    }

    /* renamed from: I */
    private boolean m16732I() {
        if (C2688g.m12913j().m12932h()) {
            return false;
        }
        String m12933i = C2688g.m12913j().m12933i();
        if (m12933i != null && !m12933i.isEmpty()) {
            return !m12933i.equals("GDPR_OUTSIDE_EU");
        }
        r50.m15206a();
        return true;
    }

    /* renamed from: J */
    private void m16733J() {
    }

    /* renamed from: K */
    public static z40 m16734K() {
        return f14335f;
    }

    /* renamed from: a */
    public static void m16735a(Context context, String str, SdkPlatformEnum sdkPlatformEnum) {
        if (f14335f == null) {
            f14335f = new z40(context, str, sdkPlatformEnum);
        }
    }

    /* renamed from: A */
    public Boolean m16736A() {
        if (this.f14340e.getAdInfo() == null) {
            return null;
        }
        return this.f14340e.getAdInfo().getLimitAdTrackingEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public int m16737B() {
        UserExtraInfo userExtraInfo = this.f14340e;
        if (userExtraInfo == null) {
            return 0;
        }
        return userExtraInfo.getAppVersionCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public String m16738C() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getAppVersionName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m16739D() {
        UserExtraInfo userExtraInfo = this.f14340e;
        if (userExtraInfo == null) {
            return false;
        }
        return userExtraInfo.getDataAvailability();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public String m16740E() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getDeviceBrand();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public String m16741F() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getDeviceLanguage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public float m16742G() {
        UserExtraInfo userExtraInfo = this.f14340e;
        if (userExtraInfo == null) {
            return 0.0f;
        }
        return userExtraInfo.getScreenDensity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m16743a() {
        UserExtraInfo userExtraInfo = this.f14340e;
        if (userExtraInfo == null) {
            return 0;
        }
        return userExtraInfo.getScreenHeight();
    }

    /* renamed from: a */
    public void m16744a(String str) {
        this.f14340e.setUserId(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m16745b() {
        UserExtraInfo userExtraInfo = this.f14340e;
        if (userExtraInfo == null) {
            return 0;
        }
        return userExtraInfo.getScreenOrientation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m16746c() {
        UserExtraInfo userExtraInfo = this.f14340e;
        if (userExtraInfo == null) {
            return 0;
        }
        return userExtraInfo.getScreenWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m16747d() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getUserId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m16748e() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getCustomerUserId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m16749f() {
        return e50.m11546b();
    }

    /* renamed from: g */
    public void m16750g() {
        m16752i();
    }

    /* renamed from: h */
    public String m16751h() {
        String str = this.f14339d;
        return str == null ? "" : str;
    }

    /* renamed from: i */
    public void m16752i() {
        this.f14340e = new UserExtraInfo();
        this.f14339d = a50.m66b();
        e50.m11545a(this.f14337b);
        e50.m11543a(this.f14338c);
        if (C2687f.f11021b && m16732I()) {
            m16731H();
            return;
        }
        a50.m68b(this.f14340e);
        a50.m59a(this.f14336a, this.f14340e);
        a50.m61a(this.f14340e);
        a50.m67b(this.f14336a, this.f14340e);
        a50.m60a(this.f14336a, this.f14340e, false);
        x40.m16440a(this.f14336a, this.f14340e);
        e50.m11544a(this.f14340e);
        this.f14340e.setDataAvailability(c50.m3594a(this.f14336a));
        this.f14340e.setDeviceLanguage(a50.m55a());
        this.f14340e.setNpa(false);
    }

    /* renamed from: j */
    public String m16753j() {
        return this.f14336a.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public String m16754k() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getImei();
    }

    /* renamed from: l */
    public String m16755l() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : String.valueOf(userExtraInfo.getNetworkType());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public String m16756m() {
        return String.valueOf(c50.m3593a(c50.m3592a()));
    }

    /* renamed from: n */
    public UserExtraInfo m16757n() {
        m16733J();
        return this.f14340e;
    }

    /* renamed from: o */
    public String m16758o() {
        return e50.m11542a();
    }

    /* renamed from: p */
    public String m16759p() {
        return e50.m11552f().name().toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public String m16760q() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public String m16761r() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getOs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public String m16762s() {
        return e50.m11548c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public String m16763t() {
        return e50.m11551e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public String m16764u() {
        return this.f14340e.getAdInfo() == null ? "" : this.f14340e.getAdInfo().getAdvertisingId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public int m16765v() {
        return a50.m69c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public String m16766w() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getDeviceManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public String m16767x() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getCarrier();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public String m16768y() {
        return e50.m11550d();
    }

    /* renamed from: z */
    public String m16769z() {
        UserExtraInfo userExtraInfo = this.f14340e;
        return userExtraInfo == null ? "" : userExtraInfo.getAndroidId();
    }
}
