package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.qm;
import defpackage.vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements vn.a {
    private final qm a;

    private k(qm qmVar) {
        this.a = qmVar;
    }

    public static vn.a a(qm qmVar) {
        return new k(qmVar);
    }

    @Override // vn.a
    public Object e() {
        return Integer.valueOf(this.a.b());
    }
}
