package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m8 implements Runnable {
    private final /* synthetic */ AtomicReference b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ zzm g;
    private final /* synthetic */ w7 h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m8(w7 w7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzm zzmVar) {
        this.h = w7Var;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        w3 w3Var;
        AtomicReference atomicReference2;
        List<zzkq> a;
        synchronized (this.b) {
            try {
                try {
                    w3Var = this.h.d;
                } catch (RemoteException e) {
                    this.h.k().t().a("(legacy) Failed to get user properties; remote exception", f4.a(this.c), this.d, e);
                    this.b.set(Collections.emptyList());
                    atomicReference = this.b;
                }
                if (w3Var == null) {
                    this.h.k().t().a("(legacy) Failed to get user properties; not connected to service", f4.a(this.c), this.d, this.e);
                    this.b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.c)) {
                    atomicReference2 = this.b;
                    a = w3Var.a(this.d, this.e, this.f, this.g);
                } else {
                    atomicReference2 = this.b;
                    a = w3Var.a(this.c, this.d, this.e, this.f);
                }
                atomicReference2.set(a);
                this.h.J();
                atomicReference = this.b;
                atomicReference.notify();
            } finally {
                this.b.notify();
            }
        }
    }
}
