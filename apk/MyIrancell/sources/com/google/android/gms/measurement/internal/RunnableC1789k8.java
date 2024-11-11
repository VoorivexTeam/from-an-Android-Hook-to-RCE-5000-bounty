package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k8 */
/* loaded from: classes.dex */
public final class RunnableC1789k8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f7719b;

    /* renamed from: c */
    private final /* synthetic */ String f7720c;

    /* renamed from: d */
    private final /* synthetic */ String f7721d;

    /* renamed from: e */
    private final /* synthetic */ String f7722e;

    /* renamed from: f */
    private final /* synthetic */ zzm f7723f;

    /* renamed from: g */
    private final /* synthetic */ C1924w7 f7724g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1789k8(C1924w7 c1924w7, AtomicReference atomicReference, String str, String str2, String str3, zzm zzmVar) {
        this.f7724g = c1924w7;
        this.f7719b = atomicReference;
        this.f7720c = str;
        this.f7721d = str2;
        this.f7722e = str3;
        this.f7723f = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC1920w3 interfaceC1920w3;
        AtomicReference atomicReference2;
        List<zzv> mo9618a;
        synchronized (this.f7719b) {
            try {
                try {
                    interfaceC1920w3 = this.f7724g.f8140d;
                } catch (RemoteException e) {
                    this.f7724g.mo9324k().m9309t().m9368a("(legacy) Failed to get conditional properties; remote exception", C1725f4.m9298a(this.f7720c), this.f7721d, e);
                    this.f7719b.set(Collections.emptyList());
                    atomicReference = this.f7719b;
                }
                if (interfaceC1920w3 == null) {
                    this.f7724g.mo9324k().m9309t().m9368a("(legacy) Failed to get conditional properties; not connected to service", C1725f4.m9298a(this.f7720c), this.f7721d, this.f7722e);
                    this.f7719b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f7720c)) {
                    atomicReference2 = this.f7719b;
                    mo9618a = interfaceC1920w3.mo9617a(this.f7721d, this.f7722e, this.f7723f);
                } else {
                    atomicReference2 = this.f7719b;
                    mo9618a = interfaceC1920w3.mo9618a(this.f7720c, this.f7721d, this.f7722e);
                }
                atomicReference2.set(mo9618a);
                this.f7724g.m9842J();
                atomicReference = this.f7719b;
                atomicReference.notify();
            } finally {
                this.f7719b.notify();
            }
        }
    }
}
