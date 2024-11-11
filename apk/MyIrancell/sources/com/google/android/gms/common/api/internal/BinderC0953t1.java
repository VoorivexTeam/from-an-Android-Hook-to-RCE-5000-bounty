package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.BinderC1963d;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p000.C3369vr;
import p000.C3448xr;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.common.api.internal.t1 */
/* loaded from: classes.dex */
public final class BinderC0953t1 extends BinderC1963d implements AbstractC0864f.b, AbstractC0864f.c {

    /* renamed from: h */
    private static C0859a.a<? extends InterfaceC3497yr, C3369vr> f5965h = C3448xr.f14061c;

    /* renamed from: a */
    private final Context f5966a;

    /* renamed from: b */
    private final Handler f5967b;

    /* renamed from: c */
    private final C0859a.a<? extends InterfaceC3497yr, C3369vr> f5968c;

    /* renamed from: d */
    private Set<Scope> f5969d;

    /* renamed from: e */
    private C1022e f5970e;

    /* renamed from: f */
    private InterfaceC3497yr f5971f;

    /* renamed from: g */
    private InterfaceC0957u1 f5972g;

    public BinderC0953t1(Context context, Handler handler, C1022e c1022e) {
        this(context, handler, c1022e, f5965h);
    }

    public BinderC0953t1(Context context, Handler handler, C1022e c1022e, C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar) {
        this.f5966a = context;
        this.f5967b = handler;
        C1057u.m7287a(c1022e, "ClientSettings must not be null");
        this.f5970e = c1022e;
        this.f5969d = c1022e.m7125i();
        this.f5968c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m6881b(zak zakVar) {
        ConnectionResult m9983j = zakVar.m9983j();
        if (m9983j.m6488n()) {
            ResolveAccountResponse m9984k = zakVar.m9984k();
            m9983j = m9984k.m7035k();
            if (m9983j.m6488n()) {
                this.f5972g.mo6764a(m9984k.m7034j(), this.f5969d);
                this.f5971f.mo6515b();
            } else {
                String valueOf = String.valueOf(m9983j);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            }
        }
        this.f5972g.mo6765b(m9983j);
        this.f5971f.mo6515b();
    }

    /* renamed from: a */
    public final InterfaceC3497yr m6882a() {
        return this.f5971f;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: a */
    public final void mo6688a(int i) {
        this.f5971f.mo6515b();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0923m
    /* renamed from: a */
    public final void mo6740a(ConnectionResult connectionResult) {
        this.f5972g.mo6765b(connectionResult);
    }

    /* renamed from: a */
    public final void m6883a(InterfaceC0957u1 interfaceC0957u1) {
        InterfaceC3497yr interfaceC3497yr = this.f5971f;
        if (interfaceC3497yr != null) {
            interfaceC3497yr.mo6515b();
        }
        this.f5970e.m7117a(Integer.valueOf(System.identityHashCode(this)));
        C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar = this.f5968c;
        Context context = this.f5966a;
        Looper looper = this.f5967b.getLooper();
        C1022e c1022e = this.f5970e;
        this.f5971f = aVar.mo6386a(context, looper, c1022e, (C1022e) c1022e.m7126j(), (AbstractC0864f.b) this, (AbstractC0864f.c) this);
        this.f5972g = interfaceC0957u1;
        Set<Scope> set = this.f5969d;
        if (set == null || set.isEmpty()) {
            this.f5967b.post(new RunnableC0949s1(this));
        } else {
            this.f5971f.mo9974c();
        }
    }

    @Override // com.google.android.gms.signin.internal.InterfaceC1962c
    /* renamed from: a */
    public final void mo6780a(zak zakVar) {
        this.f5967b.post(new RunnableC0961v1(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: b */
    public final void mo6689b(Bundle bundle) {
        this.f5971f.mo9973a(this);
    }

    /* renamed from: h */
    public final void m6884h() {
        InterfaceC3497yr interfaceC3497yr = this.f5971f;
        if (interfaceC3497yr != null) {
            interfaceC3497yr.mo6515b();
        }
    }
}
