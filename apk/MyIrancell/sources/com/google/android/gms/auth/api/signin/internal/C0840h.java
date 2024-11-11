package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1028h;
import com.google.android.gms.common.internal.C1022e;
import java.util.Iterator;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
/* loaded from: classes.dex */
public final class C0840h extends AbstractC1028h<InterfaceC0850r> {

    /* renamed from: E */
    private final GoogleSignInOptions f5647E;

    public C0840h(Context context, Looper looper, C1022e c1022e, GoogleSignInOptions googleSignInOptions, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
        super(context, looper, 91, c1022e, bVar, cVar);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.C0825a().m6427a() : googleSignInOptions;
        if (!c1022e.m7120d().isEmpty()) {
            GoogleSignInOptions.C0825a c0825a = new GoogleSignInOptions.C0825a(googleSignInOptions);
            Iterator<Scope> it = c1022e.m7120d().iterator();
            while (it.hasNext()) {
                c0825a.m6426a(it.next(), new Scope[0]);
            }
            googleSignInOptions = c0825a.m6427a();
        }
        this.f5647E = googleSignInOptions;
    }

    /* renamed from: F */
    public final GoogleSignInOptions m6461F() {
        return this.f5647E;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    protected final /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof InterfaceC0850r ? (InterfaceC0850r) queryLocalInterface : new C0851s(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: e */
    public final boolean mo6463e() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected final String mo6464g() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1028h, com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: i */
    public final int mo6465i() {
        return C1006h.f6075a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: m */
    public final Intent mo6466m() {
        return C0841i.m6468a(m7098w(), this.f5647E);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    protected final String mo6467p() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
