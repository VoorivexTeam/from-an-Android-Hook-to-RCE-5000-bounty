package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C0810b;
import com.google.android.gms.auth.api.C0811c;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.internal.AbstractC1028h;
import com.google.android.gms.common.internal.C1022e;

/* renamed from: com.google.android.gms.internal.auth.f */
/* loaded from: classes.dex */
public final class C1153f extends AbstractC1028h<InterfaceC1154g> {

    /* renamed from: E */
    private final Bundle f6415E;

    public C1153f(Context context, Looper looper, C1022e c1022e, C0811c c0811c, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
        super(context, looper, 16, c1022e, bVar, cVar);
        if (c0811c != null) {
            throw new NoSuchMethodError();
        }
        this.f6415E = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    protected final /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof InterfaceC1154g ? (InterfaceC1154g) queryLocalInterface : new C1155h(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected final String mo6464g() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1028h, com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: i */
    public final int mo6465i() {
        return C1006h.f6075a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: n */
    public final boolean mo6521n() {
        C1022e m7148E = m7148E();
        return (TextUtils.isEmpty(m7148E.m7118b()) || m7148E.m7116a(C0810b.f5532c).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    protected final String mo6467p() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: x */
    protected final Bundle mo7099x() {
        return this.f6415E;
    }
}
