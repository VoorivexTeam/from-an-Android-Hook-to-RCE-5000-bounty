package com.google.firebase.components;

import defpackage.iv;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements iv {
    private final Set a;

    private j(Set set) {
        this.a = set;
    }

    public static iv a(Set set) {
        return new j(set);
    }

    @Override // defpackage.iv
    public Object get() {
        return l.a(this.a);
    }
}
