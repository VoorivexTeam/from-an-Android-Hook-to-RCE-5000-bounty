package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C1903u8;
import com.google.android.gms.measurement.internal.InterfaceC1947y8;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC1947y8 {

    /* renamed from: b */
    private C1903u8<AppMeasurementJobService> f7343b;

    /* renamed from: a */
    private final C1903u8<AppMeasurementJobService> m9078a() {
        if (this.f7343b == null) {
            this.f7343b = new C1903u8<>(this);
        }
        return this.f7343b;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1947y8
    @TargetApi(24)
    /* renamed from: a */
    public final void mo9079a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1947y8
    /* renamed from: a */
    public final void mo9080a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1947y8
    /* renamed from: a */
    public final boolean mo9081a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m9078a().m9800a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m9078a().m9804b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m9078a().m9806c(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return m9078a().m9803a(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return m9078a().m9805b(intent);
    }
}
