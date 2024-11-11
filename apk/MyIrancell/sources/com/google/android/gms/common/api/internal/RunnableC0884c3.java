package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.c3 */
/* loaded from: classes.dex */
final class RunnableC0884c3 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ LifecycleCallback f5761b;

    /* renamed from: c */
    private final /* synthetic */ String f5762c;

    /* renamed from: d */
    private final /* synthetic */ FragmentC0879b3 f5763d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0884c3(FragmentC0879b3 fragmentC0879b3, LifecycleCallback lifecycleCallback, String str) {
        this.f5763d = fragmentC0879b3;
        this.f5761b = lifecycleCallback;
        this.f5762c = str;
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
        i = this.f5763d.f5752c;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f5761b;
            bundle = this.f5763d.f5753d;
            if (bundle != null) {
                bundle3 = this.f5763d.f5753d;
                bundle2 = bundle3.getBundle(this.f5762c);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo6597a(bundle2);
        }
        i2 = this.f5763d.f5752c;
        if (i2 >= 2) {
            this.f5761b.mo6602d();
        }
        i3 = this.f5763d.f5752c;
        if (i3 >= 3) {
            this.f5761b.m6601c();
        }
        i4 = this.f5763d.f5752c;
        if (i4 >= 4) {
            this.f5761b.mo6603e();
        }
        i5 = this.f5763d.f5752c;
        if (i5 >= 5) {
            this.f5761b.m6599b();
        }
    }
}
