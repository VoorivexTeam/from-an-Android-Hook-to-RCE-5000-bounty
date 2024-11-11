package com.google.android.gms.common.util;

import android.content.Context;
import defpackage.ep;

/* loaded from: classes.dex */
public class d {
    public static boolean a() {
        return false;
    }

    public static boolean a(Context context, String str) {
        "com.google.android.gms".equals(str);
        return (ep.a(context).a(str, 0).flags & 2097152) != 0;
    }
}
