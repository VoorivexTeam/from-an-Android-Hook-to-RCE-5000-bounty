package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import defpackage.wn;

/* loaded from: classes.dex */
class i {
    private final Context a;
    private final wn b;
    private final wn c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, wn wnVar, wn wnVar2) {
        this.a = context;
        this.b = wnVar;
        this.c = wnVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h a(String str) {
        return h.a(this.a, this.b, this.c, str);
    }
}
