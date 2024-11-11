package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1428pc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b8 */
/* loaded from: classes.dex */
public final class RunnableC1681b8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzm f7404b;

    /* renamed from: c */
    private final /* synthetic */ InterfaceC1428pc f7405c;

    /* renamed from: d */
    private final /* synthetic */ C1924w7 f7406d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1681b8(C1924w7 c1924w7, zzm zzmVar, InterfaceC1428pc interfaceC1428pc) {
        this.f7406d = c1924w7;
        this.f7404b = zzmVar;
        this.f7405c = interfaceC1428pc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1920w3 interfaceC1920w3;
        String str = null;
        try {
            try {
                interfaceC1920w3 = this.f7406d.f8140d;
                if (interfaceC1920w3 == null) {
                    this.f7406d.mo9324k().m9309t().m9365a("Failed to get app instance id");
                } else {
                    str = interfaceC1920w3.mo9630b(this.f7404b);
                    if (str != null) {
                        this.f7406d.m9197p().m9735a(str);
                        this.f7406d.m9323j().f8030l.m9808a(str);
                    }
                    this.f7406d.m9842J();
                }
            } catch (RemoteException e) {
                this.f7406d.mo9324k().m9309t().m9366a("Failed to get app instance id", e);
            }
        } finally {
            this.f7406d.m9322i().m9945a(this.f7405c, (String) null);
        }
    }
}
