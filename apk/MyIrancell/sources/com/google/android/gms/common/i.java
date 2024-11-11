package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import defpackage.ep;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* loaded from: classes.dex */
public class i {
    private static i b;
    private final Context a;

    private i(Context context) {
        this.a = context.getApplicationContext();
    }

    public static i a(Context context) {
        com.google.android.gms.common.internal.u.a(context);
        synchronized (i.class) {
            if (b == null) {
                n.a(context);
                b = new i(context);
            }
        }
        return b;
    }

    private static o a(PackageInfo packageInfo, o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        r rVar = new r(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < oVarArr.length; i++) {
            if (oVarArr[i].equals(rVar)) {
                return oVarArr[i];
            }
        }
        return null;
    }

    private final v a(String str, int i) {
        try {
            PackageInfo a = ep.a(this.a).a(str, 64, i);
            boolean e = h.e(this.a);
            if (a == null) {
                return v.a("null pkg");
            }
            if (a.signatures != null && a.signatures.length == 1) {
                r rVar = new r(a.signatures[0].toByteArray());
                String str2 = a.packageName;
                v a2 = n.a(str2, rVar, e, false);
                return (!a2.a || a.applicationInfo == null || (a.applicationInfo.flags & 2) == 0 || !n.a(str2, rVar, false, true).a) ? a2 : v.a("debuggable release cert app rejected");
            }
            return v.a("single cert required");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return v.a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? a(packageInfo, t.a) : a(packageInfo, t.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i) {
        v a;
        String[] a2 = ep.a(this.a).a(i);
        if (a2 == null || a2.length == 0) {
            a = v.a("no pkgs");
        } else {
            a = null;
            for (String str : a2) {
                a = a(str, i);
                if (a.a) {
                    break;
                }
            }
        }
        a.b();
        return a.a;
    }

    public boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (a(packageInfo, false)) {
            return true;
        }
        return a(packageInfo, true) && h.e(this.a);
    }
}
