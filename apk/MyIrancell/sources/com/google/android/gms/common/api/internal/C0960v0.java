package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.C0834b;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.InterfaceC0983n;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.v0 */
/* loaded from: classes.dex */
public final class C0960v0 implements InterfaceC0983n<Status> {

    /* renamed from: a */
    private final /* synthetic */ C0939q f5979a;

    /* renamed from: b */
    private final /* synthetic */ boolean f5980b;

    /* renamed from: c */
    private final /* synthetic */ AbstractC0864f f5981c;

    /* renamed from: d */
    private final /* synthetic */ C0940q0 f5982d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0960v0(C0940q0 c0940q0, C0939q c0939q, boolean z, AbstractC0864f abstractC0864f) {
        this.f5982d = c0940q0;
        this.f5979a = c0939q;
        this.f5980b = z;
        this.f5981c = abstractC0864f;
    }

    @Override // com.google.android.gms.common.api.InterfaceC0983n
    /* renamed from: a */
    public final /* synthetic */ void mo6886a(Status status) {
        Context context;
        Status status2 = status;
        context = this.f5982d.f5918g;
        C0834b.m6442a(context).m6453e();
        if (status2.m6500m() && this.f5982d.m6839j()) {
            this.f5982d.m6840k();
        }
        this.f5979a.m6585a((C0939q) status2);
        if (this.f5980b) {
            this.f5981c.mo6561d();
        }
    }
}
