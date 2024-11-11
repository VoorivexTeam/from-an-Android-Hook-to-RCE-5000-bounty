package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.m;
import defpackage.bq;
import defpackage.cq;

/* loaded from: classes.dex */
public final class g extends bq implements e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.signin.internal.e
    public final void a(m mVar, int i, boolean z) {
        Parcel a = a();
        cq.a(a, mVar);
        a.writeInt(i);
        cq.a(a, z);
        a(9, a);
    }

    @Override // com.google.android.gms.signin.internal.e
    public final void a(zai zaiVar, c cVar) {
        Parcel a = a();
        cq.a(a, zaiVar);
        cq.a(a, cVar);
        a(12, a);
    }

    @Override // com.google.android.gms.signin.internal.e
    public final void c(int i) {
        Parcel a = a();
        a.writeInt(i);
        a(7, a);
    }
}
