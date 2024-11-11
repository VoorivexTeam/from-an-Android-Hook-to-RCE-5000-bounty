package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.internal.measurement.pa;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c9 {
    private d9 a;
    private final Runnable b = new Runnable(this) { // from class: com.google.android.gms.measurement.internal.b9
        private final c9 b;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final c9 c9Var = this.b;
            c9Var.c.g().a(new Runnable(c9Var) { // from class: com.google.android.gms.measurement.internal.f9
                private final c9 b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = c9Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c9 c9Var2 = this.b;
                    c9Var2.c.c();
                    c9Var2.c.k().A().a("Application backgrounded");
                    c9Var2.c.p().b("auto", "_ab", new Bundle());
                }
            });
        }
    };
    final /* synthetic */ x8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c9(x8 x8Var) {
        this.c = x8Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Handler handler;
        Handler handler2;
        this.c.c();
        if (this.c.m().a(o.H0)) {
            if (!pa.a() || !this.c.m().e(this.c.q().B(), o.U0)) {
                handler = this.c.c;
                handler.removeCallbacks(this.b);
            } else if (this.a != null) {
                handler2 = this.c.c;
                handler2.removeCallbacks(this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Handler handler;
        Handler handler2;
        if (this.c.m().a(o.H0)) {
            if (!pa.a() || !this.c.m().e(this.c.q().B(), o.U0)) {
                handler = this.c.c;
                handler.postDelayed(this.b, 2000L);
            } else {
                this.a = new d9(this, this.c.h().a());
                handler2 = this.c.c;
                handler2.postDelayed(this.a, 2000L);
            }
        }
    }
}
