package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import defpackage.ls;

/* loaded from: classes.dex */
public abstract class r<A extends a.b, ResultT> {
    private final Feature[] a = null;
    private final boolean b = false;

    @Deprecated
    public r() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(A a, ls<ResultT> lsVar);

    public boolean a() {
        return this.b;
    }

    public final Feature[] b() {
        return this.a;
    }
}
