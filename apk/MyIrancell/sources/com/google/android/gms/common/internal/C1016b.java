package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C0860b;
import com.google.android.gms.common.api.C0980k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes.dex */
public class C1016b {
    /* renamed from: a */
    public static C0860b m7043a(Status status) {
        return status.m6499l() ? new C0980k(status) : new C0860b(status);
    }
}
