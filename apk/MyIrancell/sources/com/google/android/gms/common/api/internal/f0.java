package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import defpackage.yr;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0 extends o0 {
    private final Map<a.f, g0> c;
    final /* synthetic */ e0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, Map<a.f, g0> map) {
        super(e0Var, null);
        this.d = e0Var;
        this.c = map;
    }

    @Override // com.google.android.gms.common.api.internal.o0
    @GuardedBy("mLock")
    public final void a() {
        com.google.android.gms.common.d dVar;
        Context context;
        boolean z;
        Context context2;
        z0 z0Var;
        yr yrVar;
        yr yrVar2;
        z0 z0Var2;
        Context context3;
        boolean z2;
        dVar = this.d.d;
        com.google.android.gms.common.internal.l lVar = new com.google.android.gms.common.internal.l(dVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.c.keySet()) {
            if (fVar.h()) {
                z2 = this.c.get(fVar).c;
                if (!z2) {
                    arrayList.add(fVar);
                }
            }
            arrayList2.add(fVar);
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                context = this.d.c;
                i = lVar.a(context, (a.f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                context3 = this.d.c;
                i = lVar.a(context3, (a.f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, null);
            z0Var2 = this.d.a;
            z0Var2.a(new i0(this, this.d, connectionResult));
            return;
        }
        z = this.d.m;
        if (z) {
            yrVar = this.d.k;
            if (yrVar != null) {
                yrVar2 = this.d.k;
                yrVar2.c();
            }
        }
        for (a.f fVar2 : this.c.keySet()) {
            g0 g0Var = this.c.get(fVar2);
            if (fVar2.h()) {
                context2 = this.d.c;
                if (lVar.a(context2, fVar2) != 0) {
                    z0Var = this.d.a;
                    z0Var.a(new h0(this, this.d, g0Var));
                }
            }
            fVar2.a(g0Var);
        }
    }
}
