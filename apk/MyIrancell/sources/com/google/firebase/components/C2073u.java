package com.google.firebase.components;

/* renamed from: com.google.firebase.components.u */
/* loaded from: classes.dex */
public final class C2073u {
    /* renamed from: a */
    public static <T> T m10584a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static <T> T m10585a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static void m10586a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m10587b(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
