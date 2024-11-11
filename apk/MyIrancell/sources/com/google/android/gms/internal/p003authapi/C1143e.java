package com.google.android.gms.internal.p003authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C0804a;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.internal.AbstractC1028h;
import com.google.android.gms.common.internal.C1022e;

/* renamed from: com.google.android.gms.internal.auth-api.e */
/* loaded from: classes.dex */
public final class C1143e extends AbstractC1028h<InterfaceC1145g> {

    /* renamed from: E */
    private final C0804a.a f6411E;

    public C1143e(Context context, Looper looper, C1022e c1022e, C0804a.a aVar, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
        super(context, looper, 68, c1022e, bVar, cVar);
        this.f6411E = aVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    protected final /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof InterfaceC1145g ? (InterfaceC1145g) queryLocalInterface : new C1146h(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected final String mo6464g() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1028h, com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: i */
    public final int mo6465i() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    protected final String mo6467p() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: x */
    protected final Bundle mo7099x() {
        C0804a.a aVar = this.f6411E;
        return aVar == null ? new Bundle() : aVar.m6348a();
    }
}
