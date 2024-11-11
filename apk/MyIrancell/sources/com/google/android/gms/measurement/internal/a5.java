package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
final class a5 implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.k2 b;
    private final /* synthetic */ ServiceConnection c;
    private final /* synthetic */ x4 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a5(x4 x4Var, com.google.android.gms.internal.measurement.k2 k2Var, ServiceConnection serviceConnection) {
        this.d = x4Var;
        this.b = k2Var;
        this.c = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        h4 t;
        String str2;
        x4 x4Var = this.d;
        y4 y4Var = x4Var.b;
        str = x4Var.a;
        com.google.android.gms.internal.measurement.k2 k2Var = this.b;
        ServiceConnection serviceConnection = this.c;
        Bundle a = y4Var.a(str, k2Var);
        y4Var.a.g().c();
        if (a != null) {
            long j = a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                t = y4Var.a.k().t();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    t = y4Var.a.k().t();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    y4Var.a.k().B().a("InstallReferrer API result", string);
                    z9 w = y4Var.a.w();
                    String valueOf = String.valueOf(string);
                    Bundle a2 = w.a(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (a2 == null) {
                        t = y4Var.a.k().t();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = a2.getString("medium");
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j2 = a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                t = y4Var.a.k().t();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                a2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == y4Var.a.q().k.a()) {
                            y4Var.a.d();
                            t = y4Var.a.k().B();
                            str2 = "Install Referrer campaign has already been logged";
                        } else if (!com.google.android.gms.internal.measurement.w9.a() || !y4Var.a.p().a(o.W0) || y4Var.a.c()) {
                            y4Var.a.q().k.a(j);
                            y4Var.a.d();
                            y4Var.a.k().B().a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a2.putString("_cis", "referrer API");
                            y4Var.a.v().a("auto", "_cmp", a2);
                        }
                    }
                }
            }
            t.a(str2);
        }
        if (serviceConnection != null) {
            com.google.android.gms.common.stats.a.a().a(y4Var.a.l(), serviceConnection);
        }
    }
}
