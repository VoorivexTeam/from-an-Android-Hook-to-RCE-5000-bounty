package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.qa;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t6 implements Runnable {
    private final /* synthetic */ long b;
    private final /* synthetic */ p6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t6(p6 p6Var, long j) {
        this.c = p6Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p6 p6Var = this.c;
        long j = this.b;
        p6Var.c();
        p6Var.a();
        p6Var.x();
        p6Var.k().A().a("Resetting analytics data (FE)");
        x8 u = p6Var.u();
        u.c();
        u.e.a();
        boolean c = p6Var.a.c();
        s4 j2 = p6Var.j();
        j2.j.a(j);
        if (!TextUtils.isEmpty(j2.j().B.a())) {
            j2.B.a(null);
        }
        if (qa.a() && j2.m().a(o.Q0)) {
            j2.v.a(0L);
        }
        if (!j2.m().p()) {
            j2.c(!c);
        }
        p6Var.r().D();
        if (qa.a() && p6Var.m().a(o.Q0)) {
            p6Var.u().d.a();
        }
        p6Var.h = !c;
        this.c.r().a(new AtomicReference<>());
    }
}
