package com.google.android.gms.common.api.internal;

import defpackage.fs;
import defpackage.ks;
import defpackage.ls;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [TResult] */
/* loaded from: classes.dex */
public final class v<TResult> implements fs<TResult> {
    private final /* synthetic */ ls a;
    private final /* synthetic */ a3 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(a3 a3Var, ls lsVar) {
        this.b = a3Var;
        this.a = lsVar;
    }

    @Override // defpackage.fs
    public final void a(ks<TResult> ksVar) {
        Map map;
        map = this.b.b;
        map.remove(this.a);
    }
}
