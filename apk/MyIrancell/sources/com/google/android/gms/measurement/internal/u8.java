package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.y8;

/* loaded from: classes.dex */
public final class u8<T extends Context & y8> {
    private final T a;

    public u8(T t) {
        com.google.android.gms.common.internal.u.a(t);
        this.a = t;
    }

    private final void a(Runnable runnable) {
        o9 a = o9.a(this.a);
        a.g().a(new v8(this, a, runnable));
    }

    private final f4 c() {
        return j5.a(this.a, (com.google.android.gms.internal.measurement.zzv) null).k();
    }

    public final int a(final Intent intent, int i, final int i2) {
        j5 a = j5.a(this.a, (com.google.android.gms.internal.measurement.zzv) null);
        final f4 k = a.k();
        if (intent == null) {
            k.w().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.d();
        k.B().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            a(new Runnable(this, i2, k, intent) { // from class: com.google.android.gms.measurement.internal.t8
                private final u8 b;
                private final int c;
                private final f4 d;
                private final Intent e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = this;
                    this.c = i2;
                    this.d = k;
                    this.e = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.b.a(this.c, this.d, this.e);
                }
            });
        }
        return 2;
    }

    public final IBinder a(Intent intent) {
        if (intent == null) {
            c().t().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new o5(o9.a(this.a));
        }
        c().w().a("onBind received unknown action", action);
        return null;
    }

    public final void a() {
        j5 a = j5.a(this.a, (com.google.android.gms.internal.measurement.zzv) null);
        f4 k = a.k();
        a.d();
        k.B().a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, f4 f4Var, Intent intent) {
        if (this.a.a(i)) {
            f4Var.B().a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            c().B().a("Completed wakeful intent.");
            this.a.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(f4 f4Var, JobParameters jobParameters) {
        f4Var.B().a("AppMeasurementJobService processed last upload request.");
        this.a.a(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean a(final JobParameters jobParameters) {
        j5 a = j5.a(this.a, (com.google.android.gms.internal.measurement.zzv) null);
        final f4 k = a.k();
        String string = jobParameters.getExtras().getString("action");
        a.d();
        k.B().a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a(new Runnable(this, k, jobParameters) { // from class: com.google.android.gms.measurement.internal.w8
            private final u8 b;
            private final f4 c;
            private final JobParameters d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = this;
                this.c = k;
                this.d = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.a(this.c, this.d);
            }
        });
        return true;
    }

    public final void b() {
        j5 a = j5.a(this.a, (com.google.android.gms.internal.measurement.zzv) null);
        f4 k = a.k();
        a.d();
        k.B().a("Local AppMeasurementService is shutting down");
    }

    public final boolean b(Intent intent) {
        if (intent == null) {
            c().t().a("onUnbind called with null intent");
            return true;
        }
        c().B().a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void c(Intent intent) {
        if (intent == null) {
            c().t().a("onRebind called with null intent");
        } else {
            c().B().a("onRebind called. action", intent.getAction());
        }
    }
}
