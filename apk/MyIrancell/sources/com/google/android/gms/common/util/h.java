package com.google.android.gms.common.util;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class h implements e {
    private static final h a = new h();

    private h() {
    }

    public static e d() {
        return a;
    }

    @Override // com.google.android.gms.common.util.e
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.e
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.e
    public long c() {
        return System.nanoTime();
    }
}
