package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.internal.C1036l;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import p000.InterfaceC3497yr;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* loaded from: classes.dex */
public final class C0896f0 extends AbstractRunnableC0932o0 {

    /* renamed from: c */
    private final Map<C0859a.f, C0900g0> f5802c;

    /* renamed from: d */
    final /* synthetic */ C0891e0 f5803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0896f0(C0891e0 c0891e0, Map<C0859a.f, C0900g0> map) {
        super(c0891e0, null);
        this.f5803d = c0891e0;
        this.f5802c = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC0932o0
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6690a() {
        C0994d c0994d;
        Context context;
        boolean z;
        Context context2;
        C0976z0 c0976z0;
        InterfaceC3497yr interfaceC3497yr;
        InterfaceC3497yr interfaceC3497yr2;
        C0976z0 c0976z02;
        Context context3;
        boolean z2;
        c0994d = this.f5803d.f5777d;
        C1036l c1036l = new C1036l(c0994d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C0859a.f fVar : this.f5802c.keySet()) {
            if (fVar.m6517h()) {
                z2 = this.f5802c.get(fVar).f5846c;
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
                context = this.f5803d.f5776c;
                i = c1036l.m7172a(context, (C0859a.f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                context3 = this.f5803d.f5776c;
                i = c1036l.m7172a(context3, (C0859a.f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, null);
            c0976z02 = this.f5803d.f5774a;
            c0976z02.m6933a(new C0908i0(this, this.f5803d, connectionResult));
            return;
        }
        z = this.f5803d.f5786m;
        if (z) {
            interfaceC3497yr = this.f5803d.f5784k;
            if (interfaceC3497yr != null) {
                interfaceC3497yr2 = this.f5803d.f5784k;
                interfaceC3497yr2.mo9974c();
            }
        }
        for (C0859a.f fVar2 : this.f5802c.keySet()) {
            C0900g0 c0900g0 = this.f5802c.get(fVar2);
            if (fVar2.m6517h()) {
                context2 = this.f5803d.f5776c;
                if (c1036l.m7172a(context2, fVar2) != 0) {
                    c0976z0 = this.f5803d.f5774a;
                    c0976z0.m6933a(new C0904h0(this, this.f5803d, c0900g0));
                }
            }
            fVar2.m6510a(c0900g0);
        }
    }
}
