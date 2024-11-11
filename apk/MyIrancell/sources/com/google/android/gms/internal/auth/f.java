package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.h<g> {
    private final Bundle E;

    public f(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, com.google.android.gms.auth.api.c cVar, f.b bVar, f.c cVar2) {
        super(context, looper, 16, eVar, bVar, cVar2);
        if (cVar != null) {
            throw new NoSuchMethodError();
        }
        this.E = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.d
    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new h(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String g() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final int i() {
        return com.google.android.gms.common.h.a;
    }

    @Override // com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final boolean n() {
        com.google.android.gms.common.internal.e E = E();
        return (TextUtils.isEmpty(E.b()) || E.a(com.google.android.gms.auth.api.b.c).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String p() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.d
    protected final Bundle x() {
        return this.E;
    }
}
