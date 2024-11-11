package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.auth.a */
/* loaded from: classes.dex */
public class C1148a implements IInterface {

    /* renamed from: a */
    private final IBinder f6414a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1148a(IBinder iBinder, String str) {
        this.f6414a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f6414a;
    }
}
