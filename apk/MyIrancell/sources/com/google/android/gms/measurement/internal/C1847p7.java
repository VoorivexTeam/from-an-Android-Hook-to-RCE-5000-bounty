package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* loaded from: classes.dex */
public final class C1847p7 {
    /* renamed from: a */
    public static String m9753a(String str, String[] strArr, String[] strArr2) {
        C1057u.m7286a(strArr);
        C1057u.m7286a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }
}
