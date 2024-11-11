package p000;

import android.net.Uri;

/* renamed from: wa */
/* loaded from: classes.dex */
public final class C3391wa {
    /* renamed from: a */
    public static boolean m16191a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: a */
    public static boolean m16192a(Uri uri) {
        return m16193b(uri) && !m16195d(uri);
    }

    /* renamed from: b */
    public static boolean m16193b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m16194c(Uri uri) {
        return m16193b(uri) && m16195d(uri);
    }

    /* renamed from: d */
    private static boolean m16195d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
