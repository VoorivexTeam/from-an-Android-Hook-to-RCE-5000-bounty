package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k0 extends o0 {
    private final ArrayList<a.f> c;
    private final /* synthetic */ e0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e0 e0Var, ArrayList<a.f> arrayList) {
        super(e0Var, null);
        this.d = e0Var;
        this.c = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public final void a() {
        z0 z0Var;
        Set<Scope> i;
        com.google.android.gms.common.internal.m mVar;
        z0 z0Var2;
        z0Var = this.d.a;
        q0 q0Var = z0Var.n;
        i = this.d.i();
        q0Var.q = i;
        ArrayList<a.f> arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            a.f fVar = arrayList.get(i2);
            i2++;
            mVar = this.d.o;
            z0Var2 = this.d.a;
            fVar.a(mVar, z0Var2.n.q);
        }
    }
}
