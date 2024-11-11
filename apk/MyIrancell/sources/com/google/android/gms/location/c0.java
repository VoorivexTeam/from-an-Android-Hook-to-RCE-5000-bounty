package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzad;
import defpackage.ls;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 extends com.google.android.gms.internal.location.e {
    private final /* synthetic */ ls a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(a aVar, ls lsVar) {
        this.a = lsVar;
    }

    @Override // com.google.android.gms.internal.location.d
    public final void a(zzad zzadVar) {
        Status e = zzadVar.e();
        if (e == null) {
            this.a.b((Exception) new com.google.android.gms.common.api.b(new Status(8, "Got null status from location service")));
        } else if (e.j() == 0) {
            this.a.a((ls) true);
        } else {
            this.a.b((Exception) com.google.android.gms.common.internal.b.a(e));
        }
    }
}
