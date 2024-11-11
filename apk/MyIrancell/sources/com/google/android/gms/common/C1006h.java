package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.C1062w0;
import com.google.android.gms.common.util.C1103i;
import com.google.android.gms.common.util.C1108n;
import com.google.android.gms.common.util.C1111q;
import com.google.android.gms.common.util.C1114t;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C2440ep;

/* renamed from: com.google.android.gms.common.h */
/* loaded from: classes.dex */
public class C1006h {

    /* renamed from: a */
    @Deprecated
    public static final int f6075a = 12451000;

    /* renamed from: b */
    private static boolean f6076b = false;

    /* renamed from: c */
    private static boolean f6077c = false;

    /* renamed from: d */
    static final AtomicBoolean f6078d = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f6079e = new AtomicBoolean();

    /* renamed from: a */
    private static int m6993a(Context context, boolean z, int i) {
        C1057u.m7293a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1007i.m7008a(context);
            if (!C1007i.m7011a(packageInfo2, true)) {
                return 9;
            }
            if (z && (!C1007i.m7011a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (C1114t.m7428a(packageInfo2.versionCode) >= C1114t.m7428a(i)) {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            int i2 = packageInfo2.versionCode;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Google Play services out of date.  Requires ");
            sb.append(i);
            sb.append(" but found ");
            sb.append(i2);
            sb.toString();
            return 2;
        } catch (PackageManager.NameNotFoundException unused2) {
            return 1;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static String m6994a(int i) {
        return ConnectionResult.m6483a(i);
    }

    @Deprecated
    /* renamed from: a */
    public static void m6995a(Context context) {
        if (f6078d.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m6996a(Context context, int i) {
        int mo6953a = C0994d.m6968a().mo6953a(context, i);
        if (mo6953a != 0) {
            Intent mo6958a = C0994d.m6968a().mo6958a(context, mo6953a, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(mo6953a);
            sb.toString();
            if (mo6958a != null) {
                throw new C1004f(mo6953a, "Google Play Services not available", mo6958a);
            }
            throw new C1003e(mo6953a);
        }
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: a */
    public static boolean m6997a(Context context, int i, String str) {
        return C1111q.m7411a(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: a */
    public static boolean m6998a(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C1108n.m7402h()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !m7007f(context);
    }

    @Deprecated
    /* renamed from: b */
    public static int m6999b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static int m7000b(Context context, int i) {
        try {
            context.getResources().getString(R$string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f6079e.get()) {
            int m7305b = C1062w0.m7305b(context);
            if (m7305b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (m7305b != f6075a) {
                int i2 = f6075a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(m7305b);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return m6993a(context, (C1103i.m7388b(context) || C1103i.m7390d(context)) ? false : true, i);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m7001b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* renamed from: c */
    public static Context m7002c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m7003c(Context context, int i) {
        return C1111q.m7410a(context, i);
    }

    /* renamed from: d */
    public static Resources m7004d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m7005d(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m6998a(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m7006e(Context context) {
        if (!f6077c) {
            try {
                PackageInfo m11480b = C2440ep.m11628a(context).m11480b("com.google.android.gms", 64);
                C1007i.m7008a(context);
                if (m11480b == null || C1007i.m7011a(m11480b, false) || !C1007i.m7011a(m11480b, true)) {
                    f6076b = false;
                } else {
                    f6076b = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                f6077c = true;
                throw th;
            }
            f6077c = true;
        }
        return f6076b || !C1103i.m7386a();
    }

    @TargetApi(18)
    /* renamed from: f */
    public static boolean m7007f(Context context) {
        Bundle applicationRestrictions;
        return C1108n.m7399e() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }
}
