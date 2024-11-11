package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
public final class g4 extends com.google.android.gms.common.internal.d<w3> {
    public g4(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.d
    public final /* synthetic */ w3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof w3 ? (w3) queryLocalInterface : new y3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String g() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final int i() {
        return com.google.android.gms.common.h.a;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String p() {
        return "com.google.android.gms.measurement.START";
    }
}
