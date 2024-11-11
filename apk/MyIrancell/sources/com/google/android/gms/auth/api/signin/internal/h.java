package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends com.google.android.gms.common.internal.h<r> {
    private final GoogleSignInOptions E;

    public h(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, GoogleSignInOptions googleSignInOptions, f.b bVar, f.c cVar) {
        super(context, looper, 91, eVar, bVar, cVar);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.a().a() : googleSignInOptions;
        if (!eVar.d().isEmpty()) {
            GoogleSignInOptions.a aVar = new GoogleSignInOptions.a(googleSignInOptions);
            Iterator<Scope> it = eVar.d().iterator();
            while (it.hasNext()) {
                aVar.a(it.next(), new Scope[0]);
            }
            googleSignInOptions = aVar.a();
        }
        this.E = googleSignInOptions;
    }

    public final GoogleSignInOptions F() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new s(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String g() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final int i() {
        return com.google.android.gms.common.h.a;
    }

    @Override // com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public final Intent m() {
        return i.a(w(), this.E);
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String p() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
