package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.internal.location.a0 */
/* loaded from: classes.dex */
public final class C1159a0 {
    /* renamed from: a */
    public static Looper m7469a() {
        C1057u.m7298b(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }

    /* renamed from: a */
    public static Looper m7470a(Looper looper) {
        return looper != null ? looper : m7469a();
    }
}
