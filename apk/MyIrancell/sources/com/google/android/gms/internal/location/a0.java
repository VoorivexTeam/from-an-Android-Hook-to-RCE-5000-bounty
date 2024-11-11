package com.google.android.gms.internal.location;

import android.os.Looper;

/* loaded from: classes.dex */
public final class a0 {
    public static Looper a() {
        com.google.android.gms.common.internal.u.b(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }

    public static Looper a(Looper looper) {
        return looper != null ? looper : a();
    }
}
