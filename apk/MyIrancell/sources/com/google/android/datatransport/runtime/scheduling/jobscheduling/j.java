package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.tl;
import defpackage.vn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements vn.a {
    private final m a;
    private final com.google.android.datatransport.runtime.backends.g b;
    private final Iterable c;
    private final tl d;
    private final int e;

    private j(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, tl tlVar, int i) {
        this.a = mVar;
        this.b = gVar;
        this.c = iterable;
        this.d = tlVar;
        this.e = i;
    }

    public static vn.a a(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, tl tlVar, int i) {
        return new j(mVar, gVar, iterable, tlVar, i);
    }

    @Override // vn.a
    public Object e() {
        return m.a(this.a, this.b, this.c, this.d, this.e);
    }
}
