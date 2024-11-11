package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;
import defpackage.ls;

/* loaded from: classes.dex */
public abstract class t<A extends a.b, L> {
    private final k.a<L> a;

    /* JADX INFO: Access modifiers changed from: protected */
    public t(k.a<L> aVar) {
        this.a = aVar;
    }

    public k.a<L> a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(A a, ls<Boolean> lsVar);
}
