package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.internal.C0899g;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.api.internal.h2 */
/* loaded from: classes.dex */
public final class C0906h2 extends AbstractC0898f2<Void> {

    /* renamed from: b */
    private final AbstractC0927n<C0859a.b, ?> f5858b;

    /* renamed from: c */
    private final AbstractC0951t<C0859a.b, ?> f5859c;

    public C0906h2(C0937p1 c0937p1, C2908ls<Void> c2908ls) {
        super(3, c2908ls);
        this.f5858b = c0937p1.f5911a;
        this.f5859c = c0937p1.f5912b;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0941q1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6682a(C0874a3 c0874a3, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0956u0
    /* renamed from: b */
    public final Feature[] mo6769b(C0899g.a<?> aVar) {
        return this.f5858b.m6818c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0956u0
    /* renamed from: c */
    public final boolean mo6770c(C0899g.a<?> aVar) {
        return this.f5858b.m6819d();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0898f2
    /* renamed from: d */
    public final void mo6691d(C0899g.a<?> aVar) {
        this.f5858b.mo6816a(aVar.m6750f(), this.f5805a);
        if (this.f5858b.m6817b() != null) {
            aVar.m6753i().put(this.f5858b.m6817b(), new C0937p1(this.f5858b, this.f5859c));
        }
    }
}
