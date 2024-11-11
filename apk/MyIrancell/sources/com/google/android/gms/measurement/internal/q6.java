package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q6 implements Runnable {
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ long d;
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ String i;
    private final /* synthetic */ p6 j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q6(p6 p6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.j = p6Var;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = bundle;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
