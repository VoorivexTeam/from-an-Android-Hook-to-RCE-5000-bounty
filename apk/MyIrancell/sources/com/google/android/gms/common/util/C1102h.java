package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
/* loaded from: classes.dex */
public class C1102h implements InterfaceC1099e {

    /* renamed from: a */
    private static final C1102h f6352a = new C1102h();

    private C1102h() {
    }

    /* renamed from: d */
    public static InterfaceC1099e m7385d() {
        return f6352a;
    }

    @Override // com.google.android.gms.common.util.InterfaceC1099e
    /* renamed from: a */
    public long mo7375a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.InterfaceC1099e
    /* renamed from: b */
    public long mo7376b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.InterfaceC1099e
    /* renamed from: c */
    public long mo7377c() {
        return System.nanoTime();
    }
}
