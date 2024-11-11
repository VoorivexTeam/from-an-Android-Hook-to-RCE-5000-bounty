package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.qa;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i9 {
    final /* synthetic */ x8 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9(x8 x8Var) {
        this.a = x8Var;
    }

    private final void b(long j, boolean z) {
        this.a.c();
        if (qa.a() && this.a.m().a(o.W)) {
            if (!this.a.a.c()) {
                return;
            } else {
                this.a.j().v.a(j);
            }
        }
        this.a.k().B().a("Session started, time", Long.valueOf(this.a.h().b()));
        Long valueOf = this.a.m().a(o.P) ? Long.valueOf(j / 1000) : null;
        this.a.p().a("auto", "_sid", valueOf, j);
        this.a.j().r.a(false);
        Bundle bundle = new Bundle();
        if (this.a.m().a(o.P)) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        if (this.a.m().a(o.I0) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.a.p().a("auto", "_s", j, bundle);
        if (com.google.android.gms.internal.measurement.k9.a() && this.a.m().a(o.P0)) {
            String a = this.a.j().B.a();
            if (!TextUtils.isEmpty(a)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a);
                this.a.p().a("auto", "_ssr", j, bundle2);
            }
        }
        if (qa.a() && this.a.m().a(o.W)) {
            return;
        }
        this.a.j().v.a(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (qa.a() && this.a.m().a(o.W)) {
            this.a.c();
            if (this.a.j().a(this.a.h().a())) {
                this.a.j().r.a(true);
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance == 100) {
                        this.a.k().B().a("Detected application was in foreground");
                        b(this.a.h().a(), false);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j, boolean z) {
        this.a.c();
        this.a.C();
        if (this.a.j().a(j)) {
            this.a.j().r.a(true);
            this.a.j().w.a(0L);
        }
        if (z && this.a.m().a(o.R)) {
            this.a.j().v.a(j);
        }
        if (this.a.j().r.a()) {
            b(j, z);
        }
    }
}
