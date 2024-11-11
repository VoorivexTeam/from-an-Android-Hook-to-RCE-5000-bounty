package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.internal.measurement.C1426pa;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* loaded from: classes.dex */
public final class C1694c9 {

    /* renamed from: a */
    private RunnableC1706d9 f7435a;

    /* renamed from: b */
    private final Runnable f7436b = new Runnable(this) { // from class: com.google.android.gms.measurement.internal.b9

        /* renamed from: b */
        private final C1694c9 f7407b;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.f7407b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final C1694c9 c1694c9 = this.f7407b;
            c1694c9.f7437c.mo9320g().m9344a(new Runnable(c1694c9) { // from class: com.google.android.gms.measurement.internal.f9

                /* renamed from: b */
                private final C1694c9 f7555b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f7555b = c1694c9;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1694c9 c1694c92 = this.f7555b;
                    c1694c92.f7437c.mo9194c();
                    c1694c92.f7437c.mo9324k().m9303A().m9365a("Application backgrounded");
                    c1694c92.f7437c.m9197p().m9749b("auto", "_ab", new Bundle());
                }
            });
        }
    };

    /* renamed from: c */
    final /* synthetic */ C1936x8 f7437c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1694c9(C1936x8 c1936x8) {
        this.f7437c = c1936x8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9124a() {
        Handler handler;
        Handler handler2;
        this.f7437c.mo9194c();
        if (this.f7437c.m9326m().m9480a(C1828o.f7813H0)) {
            if (!C1426pa.m8201a() || !this.f7437c.m9326m().m9488e(this.f7437c.m9198q().m9100B(), C1828o.f7839U0)) {
                handler = this.f7437c.f8177c;
                handler.removeCallbacks(this.f7436b);
            } else if (this.f7435a != null) {
                handler2 = this.f7437c.f8177c;
                handler2.removeCallbacks(this.f7435a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9125b() {
        Handler handler;
        Handler handler2;
        if (this.f7437c.m9326m().m9480a(C1828o.f7813H0)) {
            if (!C1426pa.m8201a() || !this.f7437c.m9326m().m9488e(this.f7437c.m9198q().m9100B(), C1828o.f7839U0)) {
                handler = this.f7437c.f8177c;
                handler.postDelayed(this.f7436b, 2000L);
            } else {
                this.f7435a = new RunnableC1706d9(this, this.f7437c.mo9321h().mo7375a());
                handler2 = this.f7437c.f8177c;
                handler2.postDelayed(this.f7435a, 2000L);
            }
        }
    }
}
