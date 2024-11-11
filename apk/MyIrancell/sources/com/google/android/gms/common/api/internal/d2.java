package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d2 implements IBinder.DeathRecipient, c2 {
    private final WeakReference<BasePendingResult<?>> a;
    private final WeakReference<com.google.android.gms.common.api.t> b;
    private final WeakReference<IBinder> c;

    private d2(BasePendingResult<?> basePendingResult, com.google.android.gms.common.api.t tVar, IBinder iBinder) {
        this.b = new WeakReference<>(tVar);
        this.a = new WeakReference<>(basePendingResult);
        this.c = new WeakReference<>(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ d2(BasePendingResult basePendingResult, com.google.android.gms.common.api.t tVar, IBinder iBinder, a2 a2Var) {
        this(basePendingResult, null, iBinder);
    }

    private final void a() {
        BasePendingResult<?> basePendingResult = this.a.get();
        com.google.android.gms.common.api.t tVar = this.b.get();
        if (tVar != null && basePendingResult != null) {
            tVar.a(basePendingResult.d().intValue());
        }
        IBinder iBinder = this.c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.c2
    public final void a(BasePendingResult<?> basePendingResult) {
        a();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a();
    }
}
