package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.tl;
import defpackage.vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements vn.a {
    private final m a;
    private final tl b;

    private i(m mVar, tl tlVar) {
        this.a = mVar;
        this.b = tlVar;
    }

    public static vn.a a(m mVar, tl tlVar) {
        return new i(mVar, tlVar);
    }

    @Override // vn.a
    public Object e() {
        Iterable a;
        a = this.a.c.a(this.b);
        return a;
    }
}
