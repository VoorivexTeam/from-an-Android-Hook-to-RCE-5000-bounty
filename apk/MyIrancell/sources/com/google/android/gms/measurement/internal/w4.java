package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes.dex */
public final class w4 {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final /* synthetic */ s4 e;

    private w4(s4 s4Var, String str, long j) {
        this.e = s4Var;
        com.google.android.gms.common.internal.u.b(str);
        com.google.android.gms.common.internal.u.a(j > 0);
        this.a = String.valueOf(str).concat(":start");
        this.b = String.valueOf(str).concat(":count");
        this.c = String.valueOf(str).concat(":value");
        this.d = j;
    }

    private final void b() {
        this.e.c();
        long a = this.e.h().a();
        SharedPreferences.Editor edit = this.e.t().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a);
        edit.apply();
    }

    private final long c() {
        return this.e.t().getLong(this.a, 0L);
    }

    public final Pair<String, Long> a() {
        long abs;
        this.e.c();
        this.e.c();
        long c = c();
        if (c == 0) {
            b();
            abs = 0;
        } else {
            abs = Math.abs(c - this.e.h().a());
        }
        long j = this.d;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            b();
            return null;
        }
        String string = this.e.t().getString(this.c, null);
        long j2 = this.e.t().getLong(this.b, 0L);
        b();
        return (string == null || j2 <= 0) ? s4.C : new Pair<>(string, Long.valueOf(j2));
    }

    public final void a(String str, long j) {
        this.e.c();
        if (c() == 0) {
            b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.t().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.t().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.e.i().u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.e.t().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }
}
