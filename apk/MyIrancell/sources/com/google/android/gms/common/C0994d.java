package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1041n0;
import com.google.android.gms.common.util.C1103i;
import p000.C2440ep;

/* renamed from: com.google.android.gms.common.d */
/* loaded from: classes.dex */
public class C0994d {

    /* renamed from: a */
    public static final int f6050a = C1006h.f6075a;

    /* renamed from: b */
    private static final C0994d f6051b = new C0994d();

    /* renamed from: a */
    public static C0994d m6968a() {
        return f6051b;
    }

    /* renamed from: b */
    private static String m6969b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f6050a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C2440ep.m11628a(context).m11480b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo6953a(Context context, int i) {
        int m7000b = C1006h.m7000b(context, i);
        if (C1006h.m7005d(context, m7000b)) {
            return 18;
        }
        return m7000b;
    }

    /* renamed from: a */
    public PendingIntent mo6956a(Context context, int i, int i2) {
        return m6970a(context, i, i2, null);
    }

    /* renamed from: a */
    public PendingIntent m6970a(Context context, int i, int i2, String str) {
        Intent mo6958a = mo6958a(context, i, str);
        if (mo6958a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, mo6958a, 134217728);
    }

    @Deprecated
    /* renamed from: a */
    public Intent m6971a(int i) {
        return mo6958a((Context) null, i, (String) null);
    }

    /* renamed from: a */
    public Intent mo6958a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !C1103i.m7388b(context)) ? C1041n0.m7183a("com.google.android.gms", m6969b(context, str)) : C1041n0.m7181a();
        }
        if (i != 3) {
            return null;
        }
        return C1041n0.m7182a("com.google.android.gms");
    }

    /* renamed from: a */
    public void m6972a(Context context) {
        C1006h.m6995a(context);
    }

    /* renamed from: a */
    public boolean m6973a(Context context, String str) {
        return C1006h.m6998a(context, str);
    }

    /* renamed from: b */
    public int m6974b(Context context) {
        return C1006h.m6999b(context);
    }

    /* renamed from: b */
    public String mo6962b(int i) {
        return C1006h.m6994a(i);
    }

    /* renamed from: b */
    public boolean m6975b(Context context, int i) {
        return C1006h.m7005d(context, i);
    }

    /* renamed from: c */
    public int mo6964c(Context context) {
        return mo6953a(context, f6050a);
    }

    /* renamed from: c */
    public void m6976c(Context context, int i) {
        C1006h.m6996a(context, i);
    }

    /* renamed from: c */
    public boolean mo6965c(int i) {
        return C1006h.m7001b(i);
    }
}
