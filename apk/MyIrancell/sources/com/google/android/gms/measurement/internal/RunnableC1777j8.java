package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1428pc;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j8 */
/* loaded from: classes.dex */
public final class RunnableC1777j8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f7682b;

    /* renamed from: c */
    private final /* synthetic */ String f7683c;

    /* renamed from: d */
    private final /* synthetic */ zzm f7684d;

    /* renamed from: e */
    private final /* synthetic */ InterfaceC1428pc f7685e;

    /* renamed from: f */
    private final /* synthetic */ C1924w7 f7686f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1777j8(C1924w7 c1924w7, String str, String str2, zzm zzmVar, InterfaceC1428pc interfaceC1428pc) {
        this.f7686f = c1924w7;
        this.f7682b = str;
        this.f7683c = str2;
        this.f7684d = zzmVar;
        this.f7685e = interfaceC1428pc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                interfaceC1920w3 = this.f7686f.f8140d;
                if (interfaceC1920w3 == null) {
                    this.f7686f.mo9324k().m9309t().m9367a("Failed to get conditional properties; not connected to service", this.f7682b, this.f7683c);
                } else {
                    arrayList = C1959z9.m9921b(interfaceC1920w3.mo9617a(this.f7682b, this.f7683c, this.f7684d));
                    this.f7686f.m9842J();
                }
            } catch (RemoteException e) {
                this.f7686f.mo9324k().m9309t().m9368a("Failed to get conditional properties; remote exception", this.f7682b, this.f7683c, e);
            }
        } finally {
            this.f7686f.m9322i().m9946a(this.f7685e, arrayList);
        }
    }
}
