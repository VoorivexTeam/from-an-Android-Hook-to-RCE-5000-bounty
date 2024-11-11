package ir.metrix.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.gson.annotations.SerializedName;
import java.io.File;

/* loaded from: classes.dex */
class d {

    @SerializedName("versionCode")
    private Integer a;

    @SerializedName("versionName")
    private String b;

    @SerializedName("packageName")
    private String c;

    @SerializedName("sdkVersion")
    private String d = "0.11.0";

    @SerializedName("firstInstallTime")
    private String e;

    @SerializedName("lastUpdateTime")
    private String f;

    @SerializedName("engineVersion")
    private String g;

    @SerializedName("engineName")
    private String h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, String str, String str2) {
        this.c = context.getPackageName();
        this.h = str;
        this.g = str2;
        PackageManager packageManager = context.getPackageManager();
        try {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.c, 0);
                this.a = Integer.valueOf(packageInfo.versionCode);
                this.b = packageInfo.versionName;
                this.e = String.valueOf(packageInfo.firstInstallTime);
                this.f = String.valueOf(packageInfo.lastUpdateTime);
            } catch (PackageManager.NameNotFoundException unused) {
                long lastModified = new File(packageManager.getApplicationInfo(this.c, 0).sourceDir).lastModified();
                this.e = String.valueOf(lastModified);
                this.f = String.valueOf(lastModified);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            this.e = "";
            this.f = "";
        }
    }
}
