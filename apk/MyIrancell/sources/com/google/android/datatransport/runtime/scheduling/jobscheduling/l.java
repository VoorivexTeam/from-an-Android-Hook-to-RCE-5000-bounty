package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.tl;
import defpackage.vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements vn.a {
    private final m a;
    private final tl b;
    private final int c;

    private l(m mVar, tl tlVar, int i) {
        this.a = mVar;
        this.b = tlVar;
        this.c = i;
    }

    public static vn.a a(m mVar, tl tlVar, int i) {
        return new l(mVar, tlVar, i);
    }

    @Override // vn.a
    public Object e() {
        return m.a(this.a, this.b, this.c);
    }
}
