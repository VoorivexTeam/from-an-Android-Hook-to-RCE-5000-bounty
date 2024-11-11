package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* loaded from: classes.dex */
public final class C1283g1 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1283g1(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C1253e1.f6585e;
        atomicBoolean.set(true);
    }
}
