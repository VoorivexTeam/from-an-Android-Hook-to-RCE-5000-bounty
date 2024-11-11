package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c1 implements c.a {
    private final /* synthetic */ g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        this.a.m.sendMessage(this.a.m.obtainMessage(1, Boolean.valueOf(z)));
    }
}
