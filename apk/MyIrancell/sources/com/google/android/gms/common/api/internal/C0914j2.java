package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.internal.C1057u;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.j2 */
/* loaded from: classes.dex */
public class C0914j2 extends AbstractDialogInterfaceOnCancelListenerC0922l2 {

    /* renamed from: g */
    private final SparseArray<a> f5868g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.j2$a */
    /* loaded from: classes.dex */
    public class a implements AbstractC0864f.c {

        /* renamed from: a */
        public final int f5869a;

        /* renamed from: b */
        public final AbstractC0864f f5870b;

        /* renamed from: c */
        public final AbstractC0864f.c f5871c;

        public a(int i, AbstractC0864f abstractC0864f, AbstractC0864f.c cVar) {
            this.f5869a = i;
            this.f5870b = abstractC0864f;
            this.f5871c = cVar;
            abstractC0864f.mo6553a(this);
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC0923m
        /* renamed from: a */
        public final void mo6740a(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            sb.toString();
            C0914j2.this.m6803b(connectionResult, this.f5869a);
        }
    }

    private C0914j2(InterfaceC0911j interfaceC0911j) {
        super(interfaceC0911j);
        this.f5868g = new SparseArray<>();
        this.f5733b.mo6626a("AutoManageHelper", this);
    }

    /* renamed from: b */
    private final a m6781b(int i) {
        if (this.f5868g.size() <= i) {
            return null;
        }
        SparseArray<a> sparseArray = this.f5868g;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: b */
    public static C0914j2 m6782b(C0907i c0907i) {
        InterfaceC0911j m6594a = LifecycleCallback.m6594a(c0907i);
        C0914j2 c0914j2 = (C0914j2) m6594a.mo6625a("AutoManageHelper", C0914j2.class);
        return c0914j2 != null ? c0914j2 : new C0914j2(m6594a);
    }

    /* renamed from: a */
    public final void m6783a(int i) {
        a aVar = this.f5868g.get(i);
        this.f5868g.remove(i);
        if (aVar != null) {
            aVar.f5870b.mo6559b(aVar);
            aVar.f5870b.mo6561d();
        }
    }

    /* renamed from: a */
    public final void m6784a(int i, AbstractC0864f abstractC0864f, AbstractC0864f.c cVar) {
        C1057u.m7287a(abstractC0864f, "GoogleApiClient instance cannot be null");
        boolean z = this.f5868g.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C1057u.m7298b(z, sb.toString());
        C0930n2 c0930n2 = this.f5891d.get();
        boolean z2 = this.f5890c;
        String valueOf = String.valueOf(c0930n2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        sb2.toString();
        this.f5868g.put(i, new a(i, abstractC0864f, cVar));
        if (this.f5890c && c0930n2 == null) {
            String valueOf2 = String.valueOf(abstractC0864f);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            sb3.toString();
            abstractC0864f.mo6560c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC0922l2
    /* renamed from: a */
    public final void mo6785a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar = this.f5868g.get(i);
        if (aVar != null) {
            m6783a(i);
            AbstractC0864f.c cVar = aVar.f5871c;
            if (cVar != null) {
                cVar.mo6740a(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public void mo6598a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f5868g.size(); i++) {
            a m6781b = m6781b(i);
            if (m6781b != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(m6781b.f5869a);
                printWriter.println(":");
                m6781b.f5870b.mo6555a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC0922l2, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public void mo6602d() {
        super.mo6602d();
        boolean z = this.f5890c;
        String valueOf = String.valueOf(this.f5868g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        if (this.f5891d.get() == null) {
            for (int i = 0; i < this.f5868g.size(); i++) {
                a m6781b = m6781b(i);
                if (m6781b != null) {
                    m6781b.f5870b.mo6560c();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC0922l2, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public void mo6603e() {
        super.mo6603e();
        for (int i = 0; i < this.f5868g.size(); i++) {
            a m6781b = m6781b(i);
            if (m6781b != null) {
                m6781b.f5870b.mo6561d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC0922l2
    /* renamed from: f */
    protected final void mo6786f() {
        for (int i = 0; i < this.f5868g.size(); i++) {
            a m6781b = m6781b(i);
            if (m6781b != null) {
                m6781b.f5870b.mo6560c();
            }
        }
    }
}
