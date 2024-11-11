package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class l1 extends ContentObserver {
    private final /* synthetic */ i1 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(i1 i1Var, Handler handler) {
        super(null);
        this.a = i1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b();
    }
}
