package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.internal.AbstractC1028h;
import com.google.android.gms.common.internal.C1022e;

/* renamed from: com.google.android.gms.internal.location.c0 */
/* loaded from: classes.dex */
public class C1163c0 extends AbstractC1028h<InterfaceC1170g> {

    /* renamed from: E */
    private final String f6431E;

    /* renamed from: F */
    protected final InterfaceC1188x<InterfaceC1170g> f6432F;

    public C1163c0(Context context, Looper looper, AbstractC0864f.b bVar, AbstractC0864f.c cVar, String str, C1022e c1022e) {
        super(context, looper, 23, c1022e, bVar, cVar);
        this.f6432F = new C1165d0(this);
        this.f6431E = str;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    protected /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof InterfaceC1170g ? (InterfaceC1170g) queryLocalInterface : new C1172h(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected String mo6464g() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1028h, com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: i */
    public int mo6465i() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    protected String mo6467p() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: x */
    protected Bundle mo7099x() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f6431E);
        return bundle;
    }
}
