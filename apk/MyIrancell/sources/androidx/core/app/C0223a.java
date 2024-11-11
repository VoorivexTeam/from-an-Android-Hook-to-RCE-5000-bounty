package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.C0237b;

/* renamed from: androidx.core.app.a */
/* loaded from: classes.dex */
public class C0223a extends C0237b {

    /* renamed from: c */
    private static c f1372c;

    /* renamed from: androidx.core.app.a$a */
    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String[] f1373b;

        /* renamed from: c */
        final /* synthetic */ Activity f1374c;

        /* renamed from: d */
        final /* synthetic */ int f1375d;

        a(String[] strArr, Activity activity, int i) {
            this.f1373b = strArr;
            this.f1374c = activity;
            this.f1375d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f1373b.length];
            PackageManager packageManager = this.f1374c.getPackageManager();
            String packageName = this.f1374c.getPackageName();
            int length = this.f1373b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1373b[i], packageName);
            }
            ((b) this.f1374c).onRequestPermissionsResult(this.f1375d, this.f1373b, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    /* loaded from: classes.dex */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        boolean m1364a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean m1365a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.a$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo1366a(int i);
    }

    /* renamed from: a */
    public static c m1359a() {
        return f1372c;
    }

    /* renamed from: a */
    public static void m1360a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m1361a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1362a(Activity activity, String[] strArr, int i) {
        c cVar = f1372c;
        if (cVar == null || !cVar.m1365a(activity, strArr, i)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).mo1366a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof b) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i));
            }
        }
    }

    /* renamed from: a */
    public static boolean m1363a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
