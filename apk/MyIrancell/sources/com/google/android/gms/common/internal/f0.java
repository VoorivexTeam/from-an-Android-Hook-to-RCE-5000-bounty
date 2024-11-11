package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.t;
import defpackage.ls;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class f0 implements h.a {
    private final /* synthetic */ com.google.android.gms.common.api.h a;
    private final /* synthetic */ ls b;
    private final /* synthetic */ t.a c;
    private final /* synthetic */ t.b d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(com.google.android.gms.common.api.h hVar, ls lsVar, t.a aVar, t.b bVar) {
        this.a = hVar;
        this.b = lsVar;
        this.c = aVar;
        this.d = bVar;
    }

    @Override // com.google.android.gms.common.api.h.a
    public final void a(Status status) {
        if (!status.m()) {
            this.b.a((Exception) this.d.a(status));
        } else {
            this.b.a((ls) this.c.a(this.a.a(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
