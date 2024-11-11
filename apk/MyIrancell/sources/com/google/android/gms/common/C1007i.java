package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.internal.C1057u;
import javax.annotation.CheckReturnValue;
import p000.C2440ep;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.i */
/* loaded from: classes.dex */
public class C1007i {

    /* renamed from: b */
    private static C1007i f6080b;

    /* renamed from: a */
    private final Context f6081a;

    private C1007i(Context context) {
        this.f6081a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1007i m7008a(Context context) {
        C1057u.m7286a(context);
        synchronized (C1007i.class) {
            if (f6080b == null) {
                C1072n.m7310a(context);
                f6080b = new C1007i(context);
            }
        }
        return f6080b;
    }

    /* renamed from: a */
    private static AbstractBinderC1073o m7009a(PackageInfo packageInfo, AbstractBinderC1073o... abstractBinderC1073oArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        BinderC1076r binderC1076r = new BinderC1076r(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC1073oArr.length; i++) {
            if (abstractBinderC1073oArr[i].equals(binderC1076r)) {
                return abstractBinderC1073oArr[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    private final C1116v m7010a(String str, int i) {
        try {
            PackageInfo m11476a = C2440ep.m11628a(this.f6081a).m11476a(str, 64, i);
            boolean m7006e = C1006h.m7006e(this.f6081a);
            if (m11476a == null) {
                return C1116v.m7430a("null pkg");
            }
            if (m11476a.signatures != null && m11476a.signatures.length == 1) {
                BinderC1076r binderC1076r = new BinderC1076r(m11476a.signatures[0].toByteArray());
                String str2 = m11476a.packageName;
                C1116v m7308a = C1072n.m7308a(str2, binderC1076r, m7006e, false);
                return (!m7308a.f6368a || m11476a.applicationInfo == null || (m11476a.applicationInfo.flags & 2) == 0 || !C1072n.m7308a(str2, binderC1076r, false, true).f6368a) ? m7308a : C1116v.m7430a("debuggable release cert app rejected");
            }
            return C1116v.m7430a("single cert required");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return C1116v.m7430a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    /* renamed from: a */
    public static boolean m7011a(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m7009a(packageInfo, C1093t.f6351a) : m7009a(packageInfo, C1093t.f6351a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m7012a(int i) {
        C1116v m7430a;
        String[] m11479a = C2440ep.m11628a(this.f6081a).m11479a(i);
        if (m11479a == null || m11479a.length == 0) {
            m7430a = C1116v.m7430a("no pkgs");
        } else {
            m7430a = null;
            for (String str : m11479a) {
                m7430a = m7010a(str, i);
                if (m7430a.f6368a) {
                    break;
                }
            }
        }
        m7430a.m7436b();
        return m7430a.f6368a;
    }

    /* renamed from: a */
    public boolean m7013a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m7011a(packageInfo, false)) {
            return true;
        }
        return m7011a(packageInfo, true) && C1006h.m7006e(this.f6081a);
    }
}
