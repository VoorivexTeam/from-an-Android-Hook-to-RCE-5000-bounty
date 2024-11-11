package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.C1059v;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* loaded from: classes.dex */
public final class C0975z implements InterfaceC0964w0 {

    /* renamed from: a */
    private final C0976z0 f6022a;

    /* renamed from: b */
    private boolean f6023b = false;

    public C0975z(C0976z0 c0976z0) {
        this.f6022a = c0976z0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6673a(T t) {
        try {
            this.f6022a.f6037n.f5936y.m6620a(t);
            C0940q0 c0940q0 = this.f6022a.f6037n;
            C0859a.f fVar = c0940q0.f5927p.get(t.m6641h());
            C1057u.m7287a(fVar, "Appropriate Api was not requested.");
            if (fVar.m6514a() || !this.f6022a.f6030g.containsKey(t.m6641h())) {
                boolean z = fVar instanceof C1059v;
                A a = fVar;
                if (z) {
                    a = ((C1059v) fVar).m7302F();
                }
                t.m6637b(a);
            } else {
                t.m6639c(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f6022a.m6933a(new C0881c0(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final void mo6674a() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final void mo6675a(int i) {
        this.f6022a.m6932a((ConnectionResult) null);
        this.f6022a.f6038o.mo6820a(i, this.f6023b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final void mo6676a(ConnectionResult connectionResult, C0859a<?> c0859a, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: b */
    public final <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6677b(T t) {
        mo6673a((C0975z) t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: b */
    public final void mo6678b(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: b */
    public final boolean mo6679b() {
        if (this.f6023b) {
            return false;
        }
        if (!this.f6022a.f6037n.m6842m()) {
            this.f6022a.m6932a((ConnectionResult) null);
            return true;
        }
        this.f6023b = true;
        Iterator<C0965w1> it = this.f6022a.f6037n.f5935x.iterator();
        while (it.hasNext()) {
            it.next().m6895a();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: c */
    public final void mo6680c() {
        if (this.f6023b) {
            this.f6023b = false;
            this.f6022a.m6933a(new C0876b0(this, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m6929d() {
        if (this.f6023b) {
            this.f6023b = false;
            this.f6022a.f6037n.f5936y.m6619a();
            mo6679b();
        }
    }
}
