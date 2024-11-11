package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1351k9;
import com.google.android.gms.internal.measurement.C1440qa;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* loaded from: classes.dex */
public final class C1766i9 {

    /* renamed from: a */
    final /* synthetic */ C1936x8 f7637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1766i9(C1936x8 c1936x8) {
        this.f7637a = c1936x8;
    }

    /* renamed from: b */
    private final void m9379b(long j, boolean z) {
        this.f7637a.mo9194c();
        if (C1440qa.m8253a() && this.f7637a.m9326m().m9480a(C1828o.f7842W)) {
            if (!this.f7637a.f7550a.m9411c()) {
                return;
            } else {
                this.f7637a.m9323j().f8040v.m9793a(j);
            }
        }
        this.f7637a.mo9324k().m9304B().m9366a("Session started, time", Long.valueOf(this.f7637a.mo9321h().mo7376b()));
        Long valueOf = this.f7637a.m9326m().m9480a(C1828o.f7828P) ? Long.valueOf(j / 1000) : null;
        this.f7637a.m9197p().m9741a("auto", "_sid", valueOf, j);
        this.f7637a.m9323j().f8036r.m9794a(false);
        Bundle bundle = new Bundle();
        if (this.f7637a.m9326m().m9480a(C1828o.f7828P)) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        if (this.f7637a.m9326m().m9480a(C1828o.f7815I0) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.f7637a.m9197p().m9736a("auto", "_s", j, bundle);
        if (C1351k9.m7955a() && this.f7637a.m9326m().m9480a(C1828o.f7829P0)) {
            String m9807a = this.f7637a.m9323j().f8020B.m9807a();
            if (!TextUtils.isEmpty(m9807a)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m9807a);
                this.f7637a.m9197p().m9736a("auto", "_ssr", j, bundle2);
            }
        }
        if (C1440qa.m8253a() && this.f7637a.m9326m().m9480a(C1828o.f7842W)) {
            return;
        }
        this.f7637a.m9323j().f8040v.m9793a(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9380a() {
        if (C1440qa.m8253a() && this.f7637a.m9326m().m9480a(C1828o.f7842W)) {
            this.f7637a.mo9194c();
            if (this.f7637a.m9323j().m9779a(this.f7637a.mo9321h().mo7375a())) {
                this.f7637a.m9323j().f8036r.m9794a(true);
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance == 100) {
                        this.f7637a.mo9324k().m9304B().m9365a("Detected application was in foreground");
                        m9379b(this.f7637a.mo9321h().mo7375a(), false);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9381a(long j, boolean z) {
        this.f7637a.mo9194c();
        this.f7637a.m9878C();
        if (this.f7637a.m9323j().m9779a(j)) {
            this.f7637a.m9323j().f8036r.m9794a(true);
            this.f7637a.m9323j().f8041w.m9793a(0L);
        }
        if (z && this.f7637a.m9326m().m9480a(C1828o.f7832R)) {
            this.f7637a.m9323j().f8040v.m9793a(j);
        }
        if (this.f7637a.m9323j().f8036r.m9795a()) {
            m9379b(j, z);
        }
    }
}
