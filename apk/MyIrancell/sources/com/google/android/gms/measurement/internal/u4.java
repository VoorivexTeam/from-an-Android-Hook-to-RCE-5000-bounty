package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class u4 {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final /* synthetic */ s4 e;

    public u4(s4 s4Var, String str, boolean z) {
        this.e = s4Var;
        com.google.android.gms.common.internal.u.b(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.t().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.t().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
