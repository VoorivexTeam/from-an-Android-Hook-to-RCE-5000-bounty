package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.internal.AbstractC1020d;

/* renamed from: com.google.android.gms.measurement.internal.g4 */
/* loaded from: classes.dex */
public final class C1737g4 extends AbstractC1020d<InterfaceC1920w3> {
    public C1737g4(Context context, Looper looper, AbstractC1020d.a aVar, AbstractC1020d.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1920w3 mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC1920w3 ? (InterfaceC1920w3) queryLocalInterface : new C1942y3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected final String mo6464g() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: i */
    public final int mo6465i() {
        return C1006h.f6075a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    protected final String mo6467p() {
        return "com.google.android.gms.measurement.START";
    }
}
