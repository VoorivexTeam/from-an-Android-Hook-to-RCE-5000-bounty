package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.C0237b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jv */
/* loaded from: classes.dex */
public class C2829jv {

    /* renamed from: a */
    private final Context f11546a;

    /* renamed from: b */
    private final SharedPreferences f11547b;

    /* renamed from: c */
    private final AtomicBoolean f11548c = new AtomicBoolean(m13519b());

    public C2829jv(Context context, String str, InterfaceC0494bv interfaceC0494bv) {
        this.f11546a = m13518a(context);
        this.f11547b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
    }

    /* renamed from: a */
    private static Context m13518a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || C0237b.m1468d(context)) ? context : C0237b.m1460a(context);
    }

    /* renamed from: b */
    private boolean m13519b() {
        ApplicationInfo applicationInfo;
        if (this.f11547b.contains("firebase_data_collection_default_enabled")) {
            return this.f11547b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f11546a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f11546a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: a */
    public boolean m13520a() {
        return this.f11548c.get();
    }
}
