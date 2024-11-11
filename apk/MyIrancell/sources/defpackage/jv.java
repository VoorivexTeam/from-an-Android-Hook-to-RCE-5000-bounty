package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class jv {
    private final Context a;
    private final SharedPreferences b;
    private final AtomicBoolean c = new AtomicBoolean(b());

    public jv(Context context, String str, bv bvVar) {
        this.a = a(context);
        this.b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
    }

    private static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || b.d(context)) ? context : b.a(context);
    }

    private boolean b() {
        ApplicationInfo applicationInfo;
        if (this.b.contains("firebase_data_collection_default_enabled")) {
            return this.b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public boolean a() {
        return this.c.get();
    }
}
