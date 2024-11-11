package com.google.firebase.components;

import defpackage.iv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements iv {
    private final l a;
    private final d b;

    private i(l lVar, d dVar) {
        this.a = lVar;
        this.b = dVar;
    }

    public static iv a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    @Override // defpackage.iv
    public Object get() {
        Object a;
        a = r1.b().a(new v(this.b, this.a));
        return a;
    }
}
