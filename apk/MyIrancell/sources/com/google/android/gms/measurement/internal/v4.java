package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class v4 {
    private final String a;
    private boolean b;
    private String c;
    private final /* synthetic */ s4 d;

    public v4(s4 s4Var, String str, String str2) {
        this.d = s4Var;
        com.google.android.gms.common.internal.u.b(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.t().getString(this.a, null);
        }
        return this.c;
    }

    public final void a(String str) {
        if (this.d.m().a(o.R0) || !z9.c(str, this.c)) {
            SharedPreferences.Editor edit = this.d.t().edit();
            edit.putString(this.a, str);
            edit.apply();
            this.c = str;
        }
    }
}
