package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class v<T extends IInterface> extends h<T> {
    private final a.h<T> E;

    public a.h<T> F() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.d
    protected T a(IBinder iBinder) {
        return this.E.a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d
    protected void b(int i, T t) {
        this.E.a(i, t);
    }

    @Override // com.google.android.gms.common.internal.d
    protected String g() {
        return this.E.g();
    }

    @Override // com.google.android.gms.common.internal.d
    protected String p() {
        return this.E.p();
    }
}
