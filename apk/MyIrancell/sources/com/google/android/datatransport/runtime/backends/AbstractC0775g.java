package com.google.android.datatransport.runtime.backends;

/* renamed from: com.google.android.datatransport.runtime.backends.g */
/* loaded from: classes.dex */
public abstract class AbstractC0775g {

    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* renamed from: a */
    public static AbstractC0775g m6280a(long j) {
        return new C0770b(a.OK, j);
    }

    /* renamed from: c */
    public static AbstractC0775g m6281c() {
        return new C0770b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC0775g m6282d() {
        return new C0770b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: a */
    public abstract long mo6272a();

    /* renamed from: b */
    public abstract a mo6273b();
}
