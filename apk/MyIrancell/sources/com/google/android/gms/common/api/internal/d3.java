package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class d3 implements Runnable {
    private final /* synthetic */ LifecycleCallback b;
    private final /* synthetic */ String c;
    private final /* synthetic */ e3 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d3(e3 e3Var, LifecycleCallback lifecycleCallback, String str) {
        this.d = e3Var;
        this.b = lifecycleCallback;
        this.c = str;
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
        i = this.d.a0;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.b;
            bundle = this.d.b0;
            if (bundle != null) {
                bundle3 = this.d.b0;
                bundle2 = bundle3.getBundle(this.c);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.a(bundle2);
        }
        i2 = this.d.a0;
        if (i2 >= 2) {
            this.b.d();
        }
        i3 = this.d.a0;
        if (i3 >= 3) {
            this.b.c();
        }
        i4 = this.d.a0;
        if (i4 >= 4) {
            this.b.e();
        }
        i5 = this.d.a0;
        if (i5 >= 5) {
            this.b.b();
        }
    }
}