package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* loaded from: classes.dex */
public final class C1910v4 {

    /* renamed from: a */
    private final String f8110a;

    /* renamed from: b */
    private boolean f8111b;

    /* renamed from: c */
    private String f8112c;

    /* renamed from: d */
    private final /* synthetic */ C1877s4 f8113d;

    public C1910v4(C1877s4 c1877s4, String str, String str2) {
        this.f8113d = c1877s4;
        C1057u.m7296b(str);
        this.f8110a = str;
    }

    /* renamed from: a */
    public final String m9807a() {
        if (!this.f8111b) {
            this.f8111b = true;
            this.f8112c = this.f8113d.m9785t().getString(this.f8110a, null);
        }
        return this.f8112c;
    }

    /* renamed from: a */
    public final void m9808a(String str) {
        if (this.f8113d.m9326m().m9480a(C1828o.f7833R0) || !C1959z9.m9924c(str, this.f8112c)) {
            SharedPreferences.Editor edit = this.f8113d.m9785t().edit();
            edit.putString(this.f8110a, str);
            edit.apply();
            this.f8112c = str;
        }
    }
}
