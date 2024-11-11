package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
/* loaded from: classes.dex */
public final class C1888t4 {

    /* renamed from: a */
    private final String f8066a;

    /* renamed from: b */
    private final long f8067b;

    /* renamed from: c */
    private boolean f8068c;

    /* renamed from: d */
    private long f8069d;

    /* renamed from: e */
    private final /* synthetic */ C1877s4 f8070e;

    public C1888t4(C1877s4 c1877s4, String str, long j) {
        this.f8070e = c1877s4;
        C1057u.m7296b(str);
        this.f8066a = str;
        this.f8067b = j;
    }

    /* renamed from: a */
    public final long m9792a() {
        if (!this.f8068c) {
            this.f8068c = true;
            this.f8069d = this.f8070e.m9785t().getLong(this.f8066a, this.f8067b);
        }
        return this.f8069d;
    }

    /* renamed from: a */
    public final void m9793a(long j) {
        SharedPreferences.Editor edit = this.f8070e.m9785t().edit();
        edit.putLong(this.f8066a, j);
        edit.apply();
        this.f8069d = j;
    }
}
