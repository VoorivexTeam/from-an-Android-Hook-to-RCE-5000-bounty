package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.p */
/* loaded from: classes.dex */
public class C1110p {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    /* renamed from: a */
    public static boolean m7409a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
