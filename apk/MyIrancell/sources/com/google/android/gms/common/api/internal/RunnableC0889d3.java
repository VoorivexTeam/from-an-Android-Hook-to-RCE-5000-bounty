package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.d3 */
/* loaded from: classes.dex */
final class RunnableC0889d3 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ LifecycleCallback f5771b;

    /* renamed from: c */
    private final /* synthetic */ String f5772c;

    /* renamed from: d */
    private final /* synthetic */ C0894e3 f5773d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0889d3(C0894e3 c0894e3, LifecycleCallback lifecycleCallback, String str) {
        this.f5773d = c0894e3;
        this.f5771b = lifecycleCallback;
        this.f5772c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        i = this.f5773d.f5800a0;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f5771b;
            bundle = this.f5773d.f5801b0;
            if (bundle != null) {
                bundle3 = this.f5773d.f5801b0;
                bundle2 = bundle3.getBundle(this.f5772c);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo6597a(bundle2);
        }
        i2 = this.f5773d.f5800a0;
        if (i2 >= 2) {
            this.f5771b.mo6602d();
        }
        i3 = this.f5773d.f5800a0;
        if (i3 >= 3) {
            this.f5771b.m6601c();
        }
        i4 = this.f5773d.f5800a0;
        if (i4 >= 4) {
            this.f5771b.mo6603e();
        }
        i5 = this.f5773d.f5800a0;
        if (i5 >= 5) {
            this.f5771b.m6599b();
        }
    }
}
