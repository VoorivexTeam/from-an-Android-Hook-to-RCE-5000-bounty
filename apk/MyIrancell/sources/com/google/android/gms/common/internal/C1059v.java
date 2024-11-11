package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.C0859a;

/* renamed from: com.google.android.gms.common.internal.v */
/* loaded from: classes.dex */
public class C1059v<T extends IInterface> extends AbstractC1028h<T> {

    /* renamed from: E */
    private final C0859a.h<T> f6265E;

    /* renamed from: F */
    public C0859a.h<T> m7302F() {
        return this.f6265E;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    protected T mo6462a(IBinder iBinder) {
        return this.f6265E.m6523a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: b */
    protected void mo7086b(int i, T t) {
        this.f6265E.m6524a(i, t);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected String mo6464g() {
        return this.f6265E.m6525g();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    protected String mo6467p() {
        return this.f6265E.m6526p();
    }
}
