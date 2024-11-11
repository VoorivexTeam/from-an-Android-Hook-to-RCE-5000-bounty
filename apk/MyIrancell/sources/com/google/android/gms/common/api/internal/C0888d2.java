package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.AbstractC0989t;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.d2 */
/* loaded from: classes.dex */
public final class C0888d2 implements IBinder.DeathRecipient, InterfaceC0883c2 {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f5768a;

    /* renamed from: b */
    private final WeakReference<AbstractC0989t> f5769b;

    /* renamed from: c */
    private final WeakReference<IBinder> f5770c;

    private C0888d2(BasePendingResult<?> basePendingResult, AbstractC0989t abstractC0989t, IBinder iBinder) {
        this.f5769b = new WeakReference<>(abstractC0989t);
        this.f5768a = new WeakReference<>(basePendingResult);
        this.f5770c = new WeakReference<>(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C0888d2(BasePendingResult basePendingResult, AbstractC0989t abstractC0989t, IBinder iBinder, C0873a2 c0873a2) {
        this(basePendingResult, null, iBinder);
    }

    /* renamed from: a */
    private final void m6642a() {
        BasePendingResult<?> basePendingResult = this.f5768a.get();
        AbstractC0989t abstractC0989t = this.f5769b.get();
        if (abstractC0989t != null && basePendingResult != null) {
            abstractC0989t.m6945a(basePendingResult.m6589d().intValue());
        }
        IBinder iBinder = this.f5770c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0883c2
    /* renamed from: a */
    public final void mo6606a(BasePendingResult<?> basePendingResult) {
        m6642a();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        m6642a();
    }
}
