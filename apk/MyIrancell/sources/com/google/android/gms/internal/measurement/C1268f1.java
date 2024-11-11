package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* loaded from: classes.dex */
public class C1268f1 {

    /* renamed from: a */
    private static UserManager f6608a;

    /* renamed from: b */
    private static volatile boolean f6609b = !m7815a();

    private C1268f1() {
    }

    /* renamed from: a */
    public static boolean m7815a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public static boolean m7816a(Context context) {
        return !m7815a() || m7818c(context);
    }

    @TargetApi(24)
    /* renamed from: b */
    private static boolean m7817b(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f6608a == null) {
                f6608a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f6608a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException unused) {
                f6608a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            f6608a = null;
        }
        return z;
    }

    @TargetApi(24)
    /* renamed from: c */
    private static boolean m7818c(Context context) {
        if (f6609b) {
            return true;
        }
        synchronized (C1268f1.class) {
            if (f6609b) {
                return true;
            }
            boolean m7817b = m7817b(context);
            if (m7817b) {
                f6609b = m7817b;
            }
            return m7817b;
        }
    }
}
