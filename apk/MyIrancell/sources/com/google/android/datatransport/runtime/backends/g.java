package com.google.android.datatransport.runtime.backends;

/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static g a(long j) {
        return new b(a.OK, j);
    }

    public static g c() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long a();

    public abstract a b();
}
