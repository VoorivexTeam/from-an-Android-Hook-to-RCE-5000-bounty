package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1440qa;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t6 */
/* loaded from: classes.dex */
public final class RunnableC1890t6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ long f8073b;

    /* renamed from: c */
    private final /* synthetic */ C1846p6 f8074c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1890t6(C1846p6 c1846p6, long j) {
        this.f8074c = c1846p6;
        this.f8073b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1846p6 c1846p6 = this.f8074c;
        long j = this.f8073b;
        c1846p6.mo9194c();
        c1846p6.mo9193a();
        c1846p6.m9110x();
        c1846p6.mo9324k().m9303A().m9365a("Resetting analytics data (FE)");
        C1936x8 u = c1846p6.m9202u();
        u.mo9194c();
        u.f8179e.m9352a();
        boolean m9411c = c1846p6.f7550a.m9411c();
        C1877s4 j2 = c1846p6.m9323j();
        j2.f8028j.m9793a(j);
        if (!TextUtils.isEmpty(j2.m9323j().f8020B.m9807a())) {
            j2.f8020B.m9808a(null);
        }
        if (C1440qa.m8253a() && j2.m9326m().m9480a(C1828o.f7831Q0)) {
            j2.f8040v.m9793a(0L);
        }
        if (!j2.m9326m().m9493p()) {
            j2.m9783c(!m9411c);
        }
        c1846p6.m9199r().m9857D();
        if (C1440qa.m8253a() && c1846p6.m9326m().m9480a(C1828o.f7831Q0)) {
            c1846p6.m9202u().f8178d.m9380a();
        }
        c1846p6.f7968h = !m9411c;
        this.f8074c.m9199r().m9872a(new AtomicReference<>());
    }
}
