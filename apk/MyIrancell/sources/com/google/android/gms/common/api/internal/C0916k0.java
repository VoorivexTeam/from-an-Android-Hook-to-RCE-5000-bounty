package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC1038m;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* loaded from: classes.dex */
public final class C0916k0 extends AbstractRunnableC0932o0 {

    /* renamed from: c */
    private final ArrayList<C0859a.f> f5879c;

    /* renamed from: d */
    private final /* synthetic */ C0891e0 f5880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0916k0(C0891e0 c0891e0, ArrayList<C0859a.f> arrayList) {
        super(c0891e0, null);
        this.f5880d = c0891e0;
        this.f5879c = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC0932o0
    /* renamed from: a */
    public final void mo6690a() {
        C0976z0 c0976z0;
        Set<Scope> m6669i;
        InterfaceC1038m interfaceC1038m;
        C0976z0 c0976z02;
        c0976z0 = this.f5880d.f5774a;
        C0940q0 c0940q0 = c0976z0.f6037n;
        m6669i = this.f5880d.m6669i();
        c0940q0.f5928q = m6669i;
        ArrayList<C0859a.f> arrayList = this.f5879c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C0859a.f fVar = arrayList.get(i);
            i++;
            interfaceC1038m = this.f5880d.f5788o;
            c0976z02 = this.f5880d.f5774a;
            fVar.m6512a(interfaceC1038m, c0976z02.f6037n.f5928q);
        }
    }
}
