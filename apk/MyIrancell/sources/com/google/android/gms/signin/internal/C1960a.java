package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.C0834b;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.internal.AbstractC1020d;
import com.google.android.gms.common.internal.AbstractC1028h;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.InterfaceC1038m;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import p000.C3369vr;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.signin.internal.a */
/* loaded from: classes.dex */
public class C1960a extends AbstractC1028h<InterfaceC1964e> implements InterfaceC3497yr {

    /* renamed from: E */
    private final boolean f8265E;

    /* renamed from: F */
    private final C1022e f8266F;

    /* renamed from: G */
    private final Bundle f8267G;

    /* renamed from: H */
    private Integer f8268H;

    private C1960a(Context context, Looper looper, boolean z, C1022e c1022e, Bundle bundle, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
        super(context, looper, 44, c1022e, bVar, cVar);
        this.f8265E = true;
        this.f8266F = c1022e;
        this.f8267G = bundle;
        this.f8268H = c1022e.m7121e();
    }

    public C1960a(Context context, Looper looper, boolean z, C1022e c1022e, C3369vr c3369vr, AbstractC0864f.b bVar, AbstractC0864f.c cVar) {
        this(context, looper, true, c1022e, m9971a(c1022e), bVar, cVar);
    }

    /* renamed from: a */
    public static Bundle m9971a(C1022e c1022e) {
        C3369vr m7126j = c1022e.m7126j();
        Integer m7121e = c1022e.m7121e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1022e.m7115a());
        if (m7121e != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m7121e.intValue());
        }
        if (m7126j != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", m7126j.m16052j());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", m7126j.m16051h());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", m7126j.m16049f());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", m7126j.m16050g());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", m7126j.m16046b());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", m7126j.m16047c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", m7126j.m16053k());
            if (m7126j.m16045a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", m7126j.m16045a().longValue());
            }
            if (m7126j.m16048e() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", m7126j.m16048e().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: a */
    protected /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof InterfaceC1964e ? (InterfaceC1964e) queryLocalInterface : new C1966g(iBinder);
    }

    @Override // p000.InterfaceC3497yr
    /* renamed from: a */
    public final void mo9972a(InterfaceC1038m interfaceC1038m, boolean z) {
        try {
            ((InterfaceC1964e) m7070A()).mo9980a(interfaceC1038m, this.f8268H.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    @Override // p000.InterfaceC3497yr
    /* renamed from: a */
    public final void mo9973a(InterfaceC1962c interfaceC1962c) {
        C1057u.m7287a(interfaceC1962c, "Expecting a valid ISignInCallbacks");
        try {
            Account m7119c = this.f8266F.m7119c();
            ((InterfaceC1964e) m7070A()).mo9981a(new zai(new ResolveAccountRequest(m7119c, this.f8268H.intValue(), "<<default account>>".equals(m7119c.name) ? C0834b.m6442a(m7098w()).m6450b() : null)), interfaceC1962c);
        } catch (RemoteException e) {
            try {
                interfaceC1962c.mo6780a(new zak(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // p000.InterfaceC3497yr
    /* renamed from: c */
    public final void mo9974c() {
        m7079a(new AbstractC1020d.d());
    }

    @Override // p000.InterfaceC3497yr
    /* renamed from: d */
    public final void mo9975d() {
        try {
            ((InterfaceC1964e) m7070A()).mo9982c(this.f8268H.intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: g */
    protected String mo6464g() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1028h, com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: i */
    public int mo6465i() {
        return C1006h.f6075a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: n */
    public boolean mo6521n() {
        return this.f8265E;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: p */
    protected String mo6467p() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d
    /* renamed from: x */
    protected Bundle mo7099x() {
        if (!m7098w().getPackageName().equals(this.f8266F.m7124h())) {
            this.f8267G.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f8266F.m7124h());
        }
        return this.f8267G;
    }
}
