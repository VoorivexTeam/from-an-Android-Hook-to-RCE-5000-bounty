package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.v1 */
/* loaded from: classes.dex */
public final class C1501v1 {

    /* renamed from: a */
    private static volatile AbstractC1284g2<Boolean> f6963a = AbstractC1284g2.m7847c();

    /* renamed from: b */
    private static final Object f6964b = new Object();

    /* renamed from: a */
    private static boolean m8528a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    /* renamed from: a */
    public static boolean m8529a(Context context, Uri uri) {
        ProviderInfo resolveContentProvider;
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            sb.toString();
            return false;
        }
        if (!f6963a.mo7789a()) {
            synchronized (f6964b) {
                if (f6963a.mo7789a()) {
                    return f6963a.mo7790b().booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName()) && ((resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) == null || !"com.google.android.gms".equals(resolveContentProvider.packageName))) {
                    z = false;
                    if (z && m8528a(context)) {
                        z2 = true;
                    }
                    f6963a = AbstractC1284g2.m7846a(Boolean.valueOf(z2));
                }
                z = true;
                if (z) {
                    z2 = true;
                }
                f6963a = AbstractC1284g2.m7846a(Boolean.valueOf(z2));
            }
        }
        return f6963a.mo7790b().booleanValue();
    }
}
