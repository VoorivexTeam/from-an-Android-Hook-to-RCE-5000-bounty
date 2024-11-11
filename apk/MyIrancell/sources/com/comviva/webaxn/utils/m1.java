package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public class m1 {
    public static void a(Context context, String[] strArr, int i) {
        androidx.core.app.a.a((Activity) context, strArr, i);
    }

    public static boolean a(Context context, String str) {
        return androidx.core.app.a.a((Activity) context, str);
    }

    public static boolean a(Context context, String[] strArr) {
        boolean z = false;
        for (String str : strArr) {
            z = androidx.core.content.b.a(context, str) == 0;
            if (!z) {
                break;
            }
        }
        return z;
    }
}
