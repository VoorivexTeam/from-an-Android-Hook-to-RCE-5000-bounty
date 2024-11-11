package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
/* loaded from: classes.dex */
final class RunnableC1859q8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ ComponentName f7991b;

    /* renamed from: c */
    private final /* synthetic */ ServiceConnectionC1837o8 f7992c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1859q8(ServiceConnectionC1837o8 serviceConnectionC1837o8, ComponentName componentName) {
        this.f7992c = serviceConnectionC1837o8;
        this.f7991b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7992c.f7923c.m9848a(this.f7991b);
    }
}
