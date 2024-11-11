package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.common.api.internal.n2 */
/* loaded from: classes.dex */
final class C0930n2 {

    /* renamed from: a */
    private final int f5902a;

    /* renamed from: b */
    private final ConnectionResult f5903b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0930n2(ConnectionResult connectionResult, int i) {
        C1057u.m7286a(connectionResult);
        this.f5903b = connectionResult;
        this.f5902a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final ConnectionResult m6823a() {
        return this.f5903b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m6824b() {
        return this.f5902a;
    }
}
