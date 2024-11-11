package com.google.android.gms.common.internal;

import android.content.Intent;

/* loaded from: classes.dex */
final class a0 extends g {
    private final /* synthetic */ Intent b;
    private final /* synthetic */ com.google.android.gms.common.api.internal.j c;
    private final /* synthetic */ int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Intent intent, com.google.android.gms.common.api.internal.j jVar, int i) {
        this.b = intent;
        this.c = jVar;
        this.d = i;
    }

    @Override // com.google.android.gms.common.internal.g
    public final void a() {
        Intent intent = this.b;
        if (intent != null) {
            this.c.startActivityForResult(intent, this.d);
        }
    }
}
