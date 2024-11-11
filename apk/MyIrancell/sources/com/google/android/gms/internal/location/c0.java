package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public class c0 extends com.google.android.gms.common.internal.h<g> {
    private final String E;
    protected final x<g> F;

    public c0(Context context, Looper looper, f.b bVar, f.c cVar, String str, com.google.android.gms.common.internal.e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.F = new d0(this);
        this.E = str;
    }

    @Override // com.google.android.gms.common.internal.d
    protected /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new h(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d
    protected String g() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public int i() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.d
    protected String p() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.d
    protected Bundle x() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.E);
        return bundle;
    }
}
