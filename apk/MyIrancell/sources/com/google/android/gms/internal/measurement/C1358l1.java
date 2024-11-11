package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.l1 */
/* loaded from: classes.dex */
final class C1358l1 extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C1313i1 f6711a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358l1(C1313i1 c1313i1, Handler handler) {
        super(null);
        this.f6711a = c1313i1;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f6711a.m7915b();
    }
}
