package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.u;
import defpackage.vr;
import defpackage.yr;

/* loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.h<e> implements yr {
    private final boolean E;
    private final com.google.android.gms.common.internal.e F;
    private final Bundle G;
    private Integer H;

    private a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.e eVar, Bundle bundle, f.b bVar, f.c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.E = true;
        this.F = eVar;
        this.G = bundle;
        this.H = eVar.e();
    }

    public a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.e eVar, vr vrVar, f.b bVar, f.c cVar) {
        this(context, looper, true, eVar, a(eVar), bVar, cVar);
    }

    public static Bundle a(com.google.android.gms.common.internal.e eVar) {
        vr j = eVar.j();
        Integer e = eVar.e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (e != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", e.intValue());
        }
        if (j != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", j.j());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", j.h());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", j.f());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", j.g());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", j.b());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", j.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", j.k());
            if (j.a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", j.a().longValue());
            }
            if (j.e() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", j.e().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.d
    protected /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new g(iBinder);
    }

    @Override // defpackage.yr
    public final void a(m mVar, boolean z) {
        try {
            ((e) A()).a(mVar, this.H.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.yr
    public final void a(c cVar) {
        u.a(cVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.F.c();
            ((e) A()).a(new zai(new ResolveAccountRequest(c, this.H.intValue(), "<<default account>>".equals(c.name) ? com.google.android.gms.auth.api.signin.internal.b.a(w()).b() : null)), cVar);
        } catch (RemoteException e) {
            try {
                cVar.a(new zak(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.yr
    public final void c() {
        a(new d.C0045d());
    }

    @Override // defpackage.yr
    public final void d() {
        try {
            ((e) A()).c(this.H.intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.d
    protected String g() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public int i() {
        return com.google.android.gms.common.h.a;
    }

    @Override // com.google.android.gms.common.internal.d, com.google.android.gms.common.api.a.f
    public boolean n() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.d
    protected String p() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.d
    protected Bundle x() {
        if (!w().getPackageName().equals(this.F.h())) {
            this.G.putString("com.google.android.gms.signin.internal.realClientPackageName", this.F.h());
        }
        return this.G;
    }
}
