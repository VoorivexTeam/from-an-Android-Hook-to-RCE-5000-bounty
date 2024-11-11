package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
import p000.C2440ep;

/* renamed from: com.google.android.gms.common.internal.w0 */
/* loaded from: classes.dex */
public final class C1062w0 {

    /* renamed from: a */
    private static Object f6268a = new Object();

    /* renamed from: b */
    @GuardedBy("sLock")
    private static boolean f6269b;

    /* renamed from: c */
    private static String f6270c;

    /* renamed from: d */
    private static int f6271d;

    /* renamed from: a */
    public static String m7304a(Context context) {
        m7306c(context);
        return f6270c;
    }

    /* renamed from: b */
    public static int m7305b(Context context) {
        m7306c(context);
        return f6271d;
    }

    /* renamed from: c */
    private static void m7306c(Context context) {
        Bundle bundle;
        synchronized (f6268a) {
            if (f6269b) {
                return;
            }
            f6269b = true;
            try {
                bundle = C2440ep.m11628a(context).m11475a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            f6270c = bundle.getString("com.google.app.id");
            f6271d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
