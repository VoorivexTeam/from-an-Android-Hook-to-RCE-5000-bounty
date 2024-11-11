package com.google.android.gms.location;

import com.google.android.gms.common.api.C0860b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1016b;
import com.google.android.gms.internal.location.AbstractBinderC1166e;
import com.google.android.gms.internal.location.zzad;
import p000.C2908ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.location.c0 */
/* loaded from: classes.dex */
public final class BinderC1577c0 extends AbstractBinderC1166e {

    /* renamed from: a */
    private final /* synthetic */ C2908ls f7098a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1577c0(C1572a c1572a, C2908ls c2908ls) {
        this.f7098a = c2908ls;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1164d
    /* renamed from: a */
    public final void mo7476a(zzad zzadVar) {
        Status mo6496e = zzadVar.mo6496e();
        if (mo6496e == null) {
            this.f7098a.m13927b((Exception) new C0860b(new Status(8, "Got null status from location service")));
        } else if (mo6496e.m6497j() == 0) {
            this.f7098a.m13926a((C2908ls) true);
        } else {
            this.f7098a.m13927b((Exception) C1016b.m7043a(mo6496e));
        }
    }
}
