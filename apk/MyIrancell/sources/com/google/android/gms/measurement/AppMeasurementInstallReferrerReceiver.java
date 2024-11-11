package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C1954z4;
import com.google.android.gms.measurement.internal.InterfaceC1726f5;

/* loaded from: classes.dex */
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements InterfaceC1726f5 {

    /* renamed from: a */
    private C1954z4 f7342a;

    @Override // com.google.android.gms.measurement.internal.InterfaceC1726f5
    /* renamed from: a */
    public final BroadcastReceiver.PendingResult mo9076a() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1726f5
    /* renamed from: a */
    public final void mo9077a(Context context, Intent intent) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f7342a == null) {
            this.f7342a = new C1954z4(this);
        }
        this.f7342a.m9904a(context, intent);
    }
}
