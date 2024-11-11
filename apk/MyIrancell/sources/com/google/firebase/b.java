package com.google.firebase;

import android.content.Context;
import defpackage.iv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements iv {
    private final c a;
    private final Context b;

    private b(c cVar, Context context) {
        this.a = cVar;
        this.b = context;
    }

    public static iv a(c cVar, Context context) {
        return new b(cVar, context);
    }

    @Override // defpackage.iv
    public Object get() {
        return c.a(this.a, this.b);
    }
}
