package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* loaded from: classes.dex */
final class RunnableC1788k7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ boolean f7714b;

    /* renamed from: c */
    private final /* synthetic */ Uri f7715c;

    /* renamed from: d */
    private final /* synthetic */ String f7716d;

    /* renamed from: e */
    private final /* synthetic */ String f7717e;

    /* renamed from: f */
    private final /* synthetic */ C1752h7 f7718f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1788k7(C1752h7 c1752h7, boolean z, Uri uri, String str, String str2) {
        this.f7718f = c1752h7;
        this.f7714b = z;
        this.f7715c = uri;
        this.f7716d = str;
        this.f7717e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7718f.m9370a(this.f7714b, this.f7715c, this.f7716d, this.f7717e);
    }
}
