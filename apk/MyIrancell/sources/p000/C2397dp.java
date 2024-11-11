package p000;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C1108n;

/* renamed from: dp */
/* loaded from: classes.dex */
public class C2397dp {

    /* renamed from: a */
    private final Context f9875a;

    public C2397dp(Context context) {
        this.f9875a = context;
    }

    /* renamed from: a */
    public int m11473a(String str) {
        return this.f9875a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public int m11474a(String str, String str2) {
        return this.f9875a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: a */
    public ApplicationInfo m11475a(String str, int i) {
        return this.f9875a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public final PackageInfo m11476a(String str, int i, int i2) {
        return this.f9875a.getPackageManager().getPackageInfo(str, 64);
    }

    /* renamed from: a */
    public boolean m11477a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2354cp.m11205a(this.f9875a);
        }
        if (!C1108n.m7404j() || (nameForUid = this.f9875a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f9875a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean m11478a(int i, String str) {
        if (C1108n.m7400f()) {
            try {
                ((AppOpsManager) this.f9875a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f9875a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String[] m11479a(int i) {
        return this.f9875a.getPackageManager().getPackagesForUid(i);
    }

    /* renamed from: b */
    public PackageInfo m11480b(String str, int i) {
        return this.f9875a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: b */
    public CharSequence m11481b(String str) {
        return this.f9875a.getPackageManager().getApplicationLabel(this.f9875a.getPackageManager().getApplicationInfo(str, 0));
    }
}
