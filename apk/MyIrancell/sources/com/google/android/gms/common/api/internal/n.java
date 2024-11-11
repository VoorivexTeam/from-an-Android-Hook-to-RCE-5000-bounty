package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;
import defpackage.ls;

/* loaded from: classes.dex */
public abstract class n<A extends a.b, L> {
    private final k<L> a;
    private final Feature[] b = null;
    private final boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public n(k<L> kVar) {
        this.a = kVar;
    }

    public void a() {
        this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(A a, ls<Void> lsVar);

    public k.a<L> b() {
        return this.a.b();
    }

    public Feature[] c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }
}
