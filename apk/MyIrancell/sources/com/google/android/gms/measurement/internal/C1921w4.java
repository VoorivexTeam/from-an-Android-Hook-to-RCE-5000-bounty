package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* loaded from: classes.dex */
public final class C1921w4 {

    /* renamed from: a */
    private final String f8126a;

    /* renamed from: b */
    private final String f8127b;

    /* renamed from: c */
    private final String f8128c;

    /* renamed from: d */
    private final long f8129d;

    /* renamed from: e */
    private final /* synthetic */ C1877s4 f8130e;

    private C1921w4(C1877s4 c1877s4, String str, long j) {
        this.f8130e = c1877s4;
        C1057u.m7296b(str);
        C1057u.m7293a(j > 0);
        this.f8126a = String.valueOf(str).concat(":start");
        this.f8127b = String.valueOf(str).concat(":count");
        this.f8128c = String.valueOf(str).concat(":value");
        this.f8129d = j;
    }

    /* renamed from: b */
    private final void m9837b() {
        this.f8130e.mo9194c();
        long mo7375a = this.f8130e.mo9321h().mo7375a();
        SharedPreferences.Editor edit = this.f8130e.m9785t().edit();
        edit.remove(this.f8127b);
        edit.remove(this.f8128c);
        edit.putLong(this.f8126a, mo7375a);
        edit.apply();
    }

    /* renamed from: c */
    private final long m9838c() {
        return this.f8130e.m9785t().getLong(this.f8126a, 0L);
    }

    /* renamed from: a */
    public final Pair<String, Long> m9839a() {
        long abs;
        this.f8130e.mo9194c();
        this.f8130e.mo9194c();
        long m9838c = m9838c();
        if (m9838c == 0) {
            m9837b();
            abs = 0;
        } else {
            abs = Math.abs(m9838c - this.f8130e.mo9321h().mo7375a());
        }
        long j = this.f8129d;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            m9837b();
            return null;
        }
        String string = this.f8130e.m9785t().getString(this.f8128c, null);
        long j2 = this.f8130e.m9785t().getLong(this.f8127b, 0L);
        m9837b();
        return (string == null || j2 <= 0) ? C1877s4.f8018C : new Pair<>(string, Long.valueOf(j2));
    }

    /* renamed from: a */
    public final void m9840a(String str, long j) {
        this.f8130e.mo9194c();
        if (m9838c() == 0) {
            m9837b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f8130e.m9785t().getLong(this.f8127b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f8130e.m9785t().edit();
            edit.putString(this.f8128c, str);
            edit.putLong(this.f8127b, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f8130e.m9322i().m9962u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f8130e.m9785t().edit();
        if (z) {
            edit2.putString(this.f8128c, str);
        }
        edit2.putLong(this.f8127b, j3);
        edit2.apply();
    }
}
