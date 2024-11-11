package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* loaded from: classes.dex */
public final class RunnableC1813m8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f7769b;

    /* renamed from: c */
    private final /* synthetic */ String f7770c;

    /* renamed from: d */
    private final /* synthetic */ String f7771d;

    /* renamed from: e */
    private final /* synthetic */ String f7772e;

    /* renamed from: f */
    private final /* synthetic */ boolean f7773f;

    /* renamed from: g */
    private final /* synthetic */ zzm f7774g;

    /* renamed from: h */
    private final /* synthetic */ C1924w7 f7775h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1813m8(C1924w7 c1924w7, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzm zzmVar) {
        this.f7775h = c1924w7;
        this.f7769b = atomicReference;
        this.f7770c = str;
        this.f7771d = str2;
        this.f7772e = str3;
        this.f7773f = z;
        this.f7774g = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC1920w3 interfaceC1920w3;
        AtomicReference atomicReference2;
        List<zzkq> mo9619a;
        synchronized (this.f7769b) {
            try {
                try {
                    interfaceC1920w3 = this.f7775h.f8140d;
                } catch (RemoteException e) {
                    this.f7775h.mo9324k().m9309t().m9368a("(legacy) Failed to get user properties; remote exception", C1725f4.m9298a(this.f7770c), this.f7771d, e);
                    this.f7769b.set(Collections.emptyList());
                    atomicReference = this.f7769b;
                }
                if (interfaceC1920w3 == null) {
                    this.f7775h.mo9324k().m9309t().m9368a("(legacy) Failed to get user properties; not connected to service", C1725f4.m9298a(this.f7770c), this.f7771d, this.f7772e);
                    this.f7769b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f7770c)) {
                    atomicReference2 = this.f7769b;
                    mo9619a = interfaceC1920w3.mo9620a(this.f7771d, this.f7772e, this.f7773f, this.f7774g);
                } else {
                    atomicReference2 = this.f7769b;
                    mo9619a = interfaceC1920w3.mo9619a(this.f7770c, this.f7771d, this.f7772e, this.f7773f);
                }
                atomicReference2.set(mo9619a);
                this.f7775h.m9842J();
                atomicReference = this.f7769b;
                atomicReference.notify();
            } finally {
                this.f7769b.notify();
            }
        }
    }
}
