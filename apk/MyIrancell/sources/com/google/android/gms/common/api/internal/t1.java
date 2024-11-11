package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zak;
import defpackage.vr;
import defpackage.xr;
import defpackage.yr;
import java.util.Set;

/* loaded from: classes.dex */
public final class t1 extends com.google.android.gms.signin.internal.d implements f.b, f.c {
    private static a.AbstractC0041a<? extends yr, vr> h = xr.c;
    private final Context a;
    private final Handler b;
    private final a.AbstractC0041a<? extends yr, vr> c;
    private Set<Scope> d;
    private com.google.android.gms.common.internal.e e;
    private yr f;
    private u1 g;

    public t1(Context context, Handler handler, com.google.android.gms.common.internal.e eVar) {
        this(context, handler, eVar, h);
    }

    public t1(Context context, Handler handler, com.google.android.gms.common.internal.e eVar, a.AbstractC0041a<? extends yr, vr> abstractC0041a) {
        this.a = context;
        this.b = handler;
        com.google.android.gms.common.internal.u.a(eVar, "ClientSettings must not be null");
        this.e = eVar;
        this.d = eVar.i();
        this.c = abstractC0041a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(zak zakVar) {
        ConnectionResult j = zakVar.j();
        if (j.n()) {
            ResolveAccountResponse k = zakVar.k();
            j = k.k();
            if (j.n()) {
                this.g.a(k.j(), this.d);
                this.f.b();
            } else {
                String valueOf = String.valueOf(j);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            }
        }
        this.g.b(j);
        this.f.b();
    }

    public final yr a() {
        return this.f;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a(int i) {
        this.f.b();
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
        this.g.b(connectionResult);
    }

    public final void a(u1 u1Var) {
        yr yrVar = this.f;
        if (yrVar != null) {
            yrVar.b();
        }
        this.e.a(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0041a<? extends yr, vr> abstractC0041a = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        com.google.android.gms.common.internal.e eVar = this.e;
        this.f = abstractC0041a.a(context, looper, eVar, (com.google.android.gms.common.internal.e) eVar.j(), (f.b) this, (f.c) this);
        this.g = u1Var;
        Set<Scope> set = this.d;
        if (set == null || set.isEmpty()) {
            this.b.post(new s1(this));
        } else {
            this.f.c();
        }
    }

    @Override // com.google.android.gms.signin.internal.c
    public final void a(zak zakVar) {
        this.b.post(new v1(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(Bundle bundle) {
        this.f.a(this);
    }

    public final void h() {
        yr yrVar = this.f;
        if (yrVar != null) {
            yrVar.b();
        }
    }
}
