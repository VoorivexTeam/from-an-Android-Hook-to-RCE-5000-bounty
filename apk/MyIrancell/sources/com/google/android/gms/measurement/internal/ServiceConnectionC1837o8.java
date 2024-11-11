package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC1020d;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.stats.C1088a;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1837o8 implements ServiceConnection, AbstractC1020d.a, AbstractC1020d.b {

    /* renamed from: a */
    private volatile boolean f7921a;

    /* renamed from: b */
    private volatile C1737g4 f7922b;

    /* renamed from: c */
    final /* synthetic */ C1924w7 f7923c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC1837o8(C1924w7 c1924w7) {
        this.f7923c = c1924w7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m9635a(ServiceConnectionC1837o8 serviceConnectionC1837o8, boolean z) {
        serviceConnectionC1837o8.f7921a = false;
        return false;
    }

    /* renamed from: a */
    public final void m9636a() {
        if (this.f7922b != null && (this.f7922b.m7084a() || this.f7922b.m7088j())) {
            this.f7922b.mo6515b();
        }
        this.f7922b = null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d.a
    /* renamed from: a */
    public final void mo7044a(int i) {
        C1057u.m7292a("MeasurementServiceConnection.onConnectionSuspended");
        this.f7923c.mo9324k().m9303A().m9365a("Service connection suspended");
        this.f7923c.mo9320g().m9344a(new RunnableC1881s8(this));
    }

    /* renamed from: a */
    public final void m9637a(Intent intent) {
        ServiceConnectionC1837o8 serviceConnectionC1837o8;
        this.f7923c.mo9194c();
        Context l = this.f7923c.mo9325l();
        C1088a m7348a = C1088a.m7348a();
        synchronized (this) {
            if (this.f7921a) {
                this.f7923c.mo9324k().m9304B().m9365a("Connection attempt already in progress");
                return;
            }
            this.f7923c.mo9324k().m9304B().m9365a("Using local app measurement service");
            this.f7921a = true;
            serviceConnectionC1837o8 = this.f7923c.f8139c;
            m7348a.m7350a(l, intent, serviceConnectionC1837o8, 129);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d.b
    /* renamed from: a */
    public final void mo7049a(ConnectionResult connectionResult) {
        C1057u.m7292a("MeasurementServiceConnection.onConnectionFailed");
        C1725f4 m9421r = this.f7923c.f7550a.m9421r();
        if (m9421r != null) {
            m9421r.m9312w().m9366a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f7921a = false;
            this.f7922b = null;
        }
        this.f7923c.mo9320g().m9344a(new RunnableC1870r8(this));
    }

    /* renamed from: b */
    public final void m9638b() {
        this.f7923c.mo9194c();
        Context l = this.f7923c.mo9325l();
        synchronized (this) {
            if (this.f7921a) {
                this.f7923c.mo9324k().m9304B().m9365a("Connection attempt already in progress");
                return;
            }
            if (this.f7922b != null && (this.f7922b.m7088j() || this.f7922b.m7084a())) {
                this.f7923c.mo9324k().m9304B().m9365a("Already awaiting connection attempt");
                return;
            }
            this.f7922b = new C1737g4(l, Looper.getMainLooper(), this, this);
            this.f7923c.mo9324k().m9304B().m9365a("Connecting to remote service");
            this.f7921a = true;
            this.f7922b.m7093r();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d.a
    /* renamed from: b */
    public final void mo7045b(Bundle bundle) {
        C1057u.m7292a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f7923c.mo9320g().m9344a(new RunnableC1848p8(this, this.f7922b.m7070A()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f7922b = null;
                this.f7921a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC1837o8 serviceConnectionC1837o8;
        C1057u.m7292a("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f7921a = false;
                this.f7923c.mo9324k().m9309t().m9365a("Service connected with null binder");
                return;
            }
            InterfaceC1920w3 interfaceC1920w3 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        interfaceC1920w3 = queryLocalInterface instanceof InterfaceC1920w3 ? (InterfaceC1920w3) queryLocalInterface : new C1942y3(iBinder);
                    }
                    this.f7923c.mo9324k().m9304B().m9365a("Bound to IMeasurementService interface");
                } else {
                    this.f7923c.mo9324k().m9309t().m9366a("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f7923c.mo9324k().m9309t().m9365a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC1920w3 == null) {
                this.f7921a = false;
                try {
                    C1088a m7348a = C1088a.m7348a();
                    Context l = this.f7923c.mo9325l();
                    serviceConnectionC1837o8 = this.f7923c.f8139c;
                    m7348a.m7349a(l, serviceConnectionC1837o8);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f7923c.mo9320g().m9344a(new RunnableC1825n8(this, interfaceC1920w3));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1057u.m7292a("MeasurementServiceConnection.onServiceDisconnected");
        this.f7923c.mo9324k().m9303A().m9365a("Service disconnected");
        this.f7923c.mo9320g().m9344a(new RunnableC1859q8(this, componentName));
    }
}
