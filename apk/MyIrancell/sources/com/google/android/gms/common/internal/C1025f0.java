package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1055t;
import java.util.concurrent.TimeUnit;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.internal.f0 */
/* loaded from: classes.dex */
final class C1025f0 implements AbstractC0866h.a {

    /* renamed from: a */
    private final /* synthetic */ AbstractC0866h f6211a;

    /* renamed from: b */
    private final /* synthetic */ C2908ls f6212b;

    /* renamed from: c */
    private final /* synthetic */ C1055t.a f6213c;

    /* renamed from: d */
    private final /* synthetic */ C1055t.b f6214d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1025f0(AbstractC0866h abstractC0866h, C2908ls c2908ls, C1055t.a aVar, C1055t.b bVar) {
        this.f6211a = abstractC0866h;
        this.f6212b = c2908ls;
        this.f6213c = aVar;
        this.f6214d = bVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC0866h.a
    /* renamed from: a */
    public final void mo6575a(Status status) {
        if (!status.m6500m()) {
            this.f6212b.m13925a((Exception) this.f6214d.mo7114a(status));
        } else {
            this.f6212b.m13926a((C2908ls) this.f6213c.mo7133a(this.f6211a.mo6572a(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
