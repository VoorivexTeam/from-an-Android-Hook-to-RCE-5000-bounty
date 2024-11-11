package ir.metrix.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.gson.annotations.SerializedName;
import java.io.File;

/* renamed from: ir.metrix.sdk.d */
/* loaded from: classes.dex */
class C2621d {

    /* renamed from: a */
    @SerializedName("versionCode")
    private Integer f10703a;

    /* renamed from: b */
    @SerializedName("versionName")
    private String f10704b;

    /* renamed from: c */
    @SerializedName("packageName")
    private String f10705c;

    /* renamed from: d */
    @SerializedName("sdkVersion")
    private String f10706d = "0.11.0";

    /* renamed from: e */
    @SerializedName("firstInstallTime")
    private String f10707e;

    /* renamed from: f */
    @SerializedName("lastUpdateTime")
    private String f10708f;

    /* renamed from: g */
    @SerializedName("engineVersion")
    private String f10709g;

    /* renamed from: h */
    @SerializedName("engineName")
    private String f10710h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2621d(Context context, String str, String str2) {
        this.f10705c = context.getPackageName();
        this.f10710h = str;
        this.f10709g = str2;
        PackageManager packageManager = context.getPackageManager();
        try {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.f10705c, 0);
                this.f10703a = Integer.valueOf(packageInfo.versionCode);
                this.f10704b = packageInfo.versionName;
                this.f10707e = String.valueOf(packageInfo.firstInstallTime);
                this.f10708f = String.valueOf(packageInfo.lastUpdateTime);
            } catch (PackageManager.NameNotFoundException unused) {
                long lastModified = new File(packageManager.getApplicationInfo(this.f10705c, 0).sourceDir).lastModified();
                this.f10707e = String.valueOf(lastModified);
                this.f10708f = String.valueOf(lastModified);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            this.f10707e = "";
            this.f10708f = "";
        }
    }
}
