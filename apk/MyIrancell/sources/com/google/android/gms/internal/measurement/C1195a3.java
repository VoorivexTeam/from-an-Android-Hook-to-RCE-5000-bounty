package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a3 */
/* loaded from: classes.dex */
final class C1195a3 {

    /* renamed from: a */
    private static final Class<?> f6486a = m7527a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f6487b;

    static {
        f6487b = m7527a("org.robolectric.Robolectric") != null;
    }

    /* renamed from: a */
    private static <T> Class<T> m7527a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m7528a() {
        return (f6486a == null || f6487b) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Class<?> m7529b() {
        return f6486a;
    }
}
