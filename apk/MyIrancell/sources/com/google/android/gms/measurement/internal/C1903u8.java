package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.measurement.internal.InterfaceC1947y8;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* loaded from: classes.dex */
public final class C1903u8<T extends Context & InterfaceC1947y8> {

    /* renamed from: a */
    private final T f8104a;

    public C1903u8(T t) {
        C1057u.m7286a(t);
        this.f8104a = t;
    }

    /* renamed from: a */
    private final void m9796a(Runnable runnable) {
        C1838o9 m9644a = C1838o9.m9644a(this.f8104a);
        m9644a.mo9320g().m9344a(new RunnableC1914v8(this, m9644a, runnable));
    }

    /* renamed from: c */
    private final C1725f4 m9797c() {
        return C1774j5.m9389a(this.f8104a, (com.google.android.gms.internal.measurement.zzv) null).mo9324k();
    }

    /* renamed from: a */
    public final int m9798a(final Intent intent, int i, final int i2) {
        C1774j5 m9389a = C1774j5.m9389a(this.f8104a, (com.google.android.gms.internal.measurement.zzv) null);
        final C1725f4 mo9324k = m9389a.mo9324k();
        if (intent == null) {
            mo9324k.m9312w().m9365a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m9389a.mo9317d();
        mo9324k.m9304B().m9367a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m9796a(new Runnable(this, i2, mo9324k, intent) { // from class: com.google.android.gms.measurement.internal.t8

                /* renamed from: b */
                private final C1903u8 f8078b;

                /* renamed from: c */
                private final int f8079c;

                /* renamed from: d */
                private final C1725f4 f8080d;

                /* renamed from: e */
                private final Intent f8081e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f8078b = this;
                    this.f8079c = i2;
                    this.f8080d = mo9324k;
                    this.f8081e = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8078b.m9801a(this.f8079c, this.f8080d, this.f8081e);
                }
            });
        }
        return 2;
    }

    /* renamed from: a */
    public final IBinder m9799a(Intent intent) {
        if (intent == null) {
            m9797c().m9309t().m9365a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC1834o5(C1838o9.m9644a(this.f8104a));
        }
        m9797c().m9312w().m9366a("onBind received unknown action", action);
        return null;
    }

    /* renamed from: a */
    public final void m9800a() {
        C1774j5 m9389a = C1774j5.m9389a(this.f8104a, (com.google.android.gms.internal.measurement.zzv) null);
        C1725f4 mo9324k = m9389a.mo9324k();
        m9389a.mo9317d();
        mo9324k.m9304B().m9365a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m9801a(int i, C1725f4 c1725f4, Intent intent) {
        if (this.f8104a.mo9081a(i)) {
            c1725f4.m9304B().m9366a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m9797c().m9304B().m9365a("Completed wakeful intent.");
            this.f8104a.mo9080a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m9802a(C1725f4 c1725f4, JobParameters jobParameters) {
        c1725f4.m9304B().m9365a("AppMeasurementJobService processed last upload request.");
        this.f8104a.mo9079a(jobParameters, false);
    }

    @TargetApi(24)
    /* renamed from: a */
    public final boolean m9803a(final JobParameters jobParameters) {
        C1774j5 m9389a = C1774j5.m9389a(this.f8104a, (com.google.android.gms.internal.measurement.zzv) null);
        final C1725f4 mo9324k = m9389a.mo9324k();
        String string = jobParameters.getExtras().getString("action");
        m9389a.mo9317d();
        mo9324k.m9304B().m9366a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m9796a(new Runnable(this, mo9324k, jobParameters) { // from class: com.google.android.gms.measurement.internal.w8

            /* renamed from: b */
            private final C1903u8 f8146b;

            /* renamed from: c */
            private final C1725f4 f8147c;

            /* renamed from: d */
            private final JobParameters f8148d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8146b = this;
                this.f8147c = mo9324k;
                this.f8148d = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8146b.m9802a(this.f8147c, this.f8148d);
            }
        });
        return true;
    }

    /* renamed from: b */
    public final void m9804b() {
        C1774j5 m9389a = C1774j5.m9389a(this.f8104a, (com.google.android.gms.internal.measurement.zzv) null);
        C1725f4 mo9324k = m9389a.mo9324k();
        m9389a.mo9317d();
        mo9324k.m9304B().m9365a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: b */
    public final boolean m9805b(Intent intent) {
        if (intent == null) {
            m9797c().m9309t().m9365a("onUnbind called with null intent");
            return true;
        }
        m9797c().m9304B().m9366a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: c */
    public final void m9806c(Intent intent) {
        if (intent == null) {
            m9797c().m9309t().m9365a("onRebind called with null intent");
        } else {
            m9797c().m9304B().m9366a("onRebind called. action", intent.getAction());
        }
    }
}
