package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.h;

/* loaded from: classes.dex */
public final class e extends h<g> {
    private final a.C0039a E;

    public e(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, a.C0039a c0039a, f.b bVar, f.c cVar) {
        super(context, looper, 68, eVar, bVar, cVar);
        this.E = c0039a;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new h(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String g() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final int i() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String p() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.d
    protected final Bundle x() {
        a.C0039a c0039a = this.E;
        return c0039a == null ? new Bundle() : c0039a.a();
    }
}
