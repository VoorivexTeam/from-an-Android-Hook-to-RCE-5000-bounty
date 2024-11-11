package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.C0223a;
import androidx.core.content.C0237b;

/* renamed from: com.comviva.webaxn.utils.m1 */
/* loaded from: classes.dex */
public class C0722m1 {
    /* renamed from: a */
    public static void m5885a(Context context, String[] strArr, int i) {
        C0223a.m1362a((Activity) context, strArr, i);
    }

    /* renamed from: a */
    public static boolean m5886a(Context context, String str) {
        return C0223a.m1363a((Activity) context, str);
    }

    /* renamed from: a */
    public static boolean m5887a(Context context, String[] strArr) {
        boolean z = false;
        for (String str : strArr) {
            z = C0237b.m1459a(context, str) == 0;
            if (!z) {
                break;
            }
        }
        return z;
    }
}
