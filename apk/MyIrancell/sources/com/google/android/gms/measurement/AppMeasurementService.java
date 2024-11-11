package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C1903u8;
import com.google.android.gms.measurement.internal.InterfaceC1947y8;
import p000.AbstractC3069p3;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC1947y8 {

    /* renamed from: b */
    private C1903u8<AppMeasurementService> f7345b;

    /* renamed from: a */
    private final C1903u8<AppMeasurementService> m9082a() {
        if (this.f7345b == null) {
            this.f7345b = new C1903u8<>(this);
        }
        return this.f7345b;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1947y8
    /* renamed from: a */
    public final void mo9079a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1947y8
    /* renamed from: a */
    public final void mo9080a(Intent intent) {
        AbstractC3069p3.m14708a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1947y8
    /* renamed from: a */
    public final boolean mo9081a(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return m9082a().m9799a(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m9082a().m9800a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m9082a().m9804b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m9082a().m9806c(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return m9082a().m9798a(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return m9082a().m9805b(intent);
    }
}
