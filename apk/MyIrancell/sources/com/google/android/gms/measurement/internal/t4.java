package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class t4 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ s4 e;

    public t4(s4 s4Var, String str, long j) {
        this.e = s4Var;
        com.google.android.gms.common.internal.u.b(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.t().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void a(long j) {
        SharedPreferences.Editor edit = this.e.t().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
