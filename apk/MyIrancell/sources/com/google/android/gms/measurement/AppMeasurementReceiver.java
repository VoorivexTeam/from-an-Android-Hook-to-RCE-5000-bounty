package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C1954z4;
import com.google.android.gms.measurement.internal.InterfaceC1726f5;
import p000.AbstractC3069p3;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC3069p3 implements InterfaceC1726f5 {

    /* renamed from: c */
    private C1954z4 f7344c;

    @Override // com.google.android.gms.measurement.internal.InterfaceC1726f5
    /* renamed from: a */
    public final BroadcastReceiver.PendingResult mo9076a() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1726f5
    /* renamed from: a */
    public final void mo9077a(Context context, Intent intent) {
        AbstractC3069p3.m14709b(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f7344c == null) {
            this.f7344c = new C1954z4(this);
        }
        this.f7344c.m9904a(context, intent);
    }
}
