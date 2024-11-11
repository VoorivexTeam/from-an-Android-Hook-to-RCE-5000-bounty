package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class z extends g {
    private final /* synthetic */ Intent b;
    private final /* synthetic */ Activity c;
    private final /* synthetic */ int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Intent intent, Activity activity, int i) {
        this.b = intent;
        this.c = activity;
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
