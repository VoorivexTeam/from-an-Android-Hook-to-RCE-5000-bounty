package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes.dex */
final class k7 implements Runnable {
    private final /* synthetic */ boolean b;
    private final /* synthetic */ Uri c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ h7 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k7(h7 h7Var, boolean z, Uri uri, String str, String str2) {
        this.f = h7Var;
        this.b = z;
        this.c = uri;
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a(this.b, this.c, this.d, this.e);
    }
}
