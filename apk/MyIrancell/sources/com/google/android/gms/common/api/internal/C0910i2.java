package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C0899g;
import com.google.android.gms.common.api.internal.C0915k;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.api.internal.i2 */
/* loaded from: classes.dex */
public final class C0910i2 extends AbstractC0898f2<Boolean> {

    /* renamed from: b */
    private final C0915k.a<?> f5864b;

    public C0910i2(C0915k.a<?> aVar, C2908ls<Boolean> c2908ls) {
        super(4, c2908ls);
        this.f5864b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6682a(C0874a3 c0874a3, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0956u0
    /* renamed from: b */
    public final Feature[] mo6769b(C0899g.a<?> aVar) {
        C0937p1 c0937p1 = aVar.m6753i().get(this.f5864b);
        if (c0937p1 == null) {
            return null;
        }
        return c0937p1.f5911a.m6818c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0956u0
    /* renamed from: c */
    public final boolean mo6770c(C0899g.a<?> aVar) {
        C0937p1 c0937p1 = aVar.m6753i().get(this.f5864b);
        return c0937p1 != null && c0937p1.f5911a.m6819d();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0898f2
    /* renamed from: d */
    public final void mo6691d(C0899g.a<?> aVar) {
        C0937p1 remove = aVar.m6753i().remove(this.f5864b);
        if (remove == null) {
            this.f5805a.m13928b((C2908ls<T>) false);
        } else {
            remove.f5912b.mo6878a(aVar.m6750f(), this.f5805a);
            remove.f5911a.m6815a();
        }
    }
}
