package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
/* loaded from: classes.dex */
public final class C1899u4 {

    /* renamed from: a */
    private final String f8088a;

    /* renamed from: b */
    private final boolean f8089b;

    /* renamed from: c */
    private boolean f8090c;

    /* renamed from: d */
    private boolean f8091d;

    /* renamed from: e */
    private final /* synthetic */ C1877s4 f8092e;

    public C1899u4(C1877s4 c1877s4, String str, boolean z) {
        this.f8092e = c1877s4;
        C1057u.m7296b(str);
        this.f8088a = str;
        this.f8089b = z;
    }

    /* renamed from: a */
    public final void m9794a(boolean z) {
        SharedPreferences.Editor edit = this.f8092e.m9785t().edit();
        edit.putBoolean(this.f8088a, z);
        edit.apply();
        this.f8091d = z;
    }

    /* renamed from: a */
    public final boolean m9795a() {
        if (!this.f8090c) {
            this.f8090c = true;
            this.f8091d = this.f8092e.m9785t().getBoolean(this.f8088a, this.f8089b);
        }
        return this.f8091d;
    }
}
