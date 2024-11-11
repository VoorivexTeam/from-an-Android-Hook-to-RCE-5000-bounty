package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.n0;
import defpackage.ep;

/* loaded from: classes.dex */
public class d {
    public static final int a = h.a;
    private static final d b = new d();

    public static d a() {
        return b;
    }

    private static String b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
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
                sb.append(ep.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context, int i) {
        int b2 = h.b(context, i);
        if (h.d(context, b2)) {
            return 18;
        }
        return b2;
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        Intent a2 = a(context, i, str);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a2, 134217728);
    }

    @Deprecated
    public Intent a(int i) {
        return a((Context) null, i, (String) null);
    }

    public Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !com.google.android.gms.common.util.i.b(context)) ? n0.a("com.google.android.gms", b(context, str)) : n0.a();
        }
        if (i != 3) {
            return null;
        }
        return n0.a("com.google.android.gms");
    }

    public void a(Context context) {
        h.a(context);
    }

    public boolean a(Context context, String str) {
        return h.a(context, str);
    }

    public int b(Context context) {
        return h.b(context);
    }

    public String b(int i) {
        return h.a(i);
    }

    public boolean b(Context context, int i) {
        return h.d(context, i);
    }

    public int c(Context context) {
        return a(context, a);
    }

    public void c(Context context, int i) {
        h.a(context, i);
    }

    public boolean c(int i) {
        return h.b(i);
    }
}
