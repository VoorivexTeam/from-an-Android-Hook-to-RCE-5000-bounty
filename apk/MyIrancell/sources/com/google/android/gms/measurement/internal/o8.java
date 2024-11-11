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
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
public final class o8 implements ServiceConnection, d.a, d.b {
    private volatile boolean a;
    private volatile g4 b;
    final /* synthetic */ w7 c;

    /* JADX INFO: Access modifiers changed from: protected */
    public o8(w7 w7Var) {
        this.c = w7Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(o8 o8Var, boolean z) {
        o8Var.a = false;
        return false;
    }

    public final void a() {
        if (this.b != null && (this.b.a() || this.b.j())) {
            this.b.b();
        }
        this.b = null;
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void a(int i) {
        com.google.android.gms.common.internal.u.a("MeasurementServiceConnection.onConnectionSuspended");
        this.c.k().A().a("Service connection suspended");
        this.c.g().a(new s8(this));
    }

    public final void a(Intent intent) {
        o8 o8Var;
        this.c.c();
        Context l = this.c.l();
        com.google.android.gms.common.stats.a a = com.google.android.gms.common.stats.a.a();
        synchronized (this) {
            if (this.a) {
                this.c.k().B().a("Connection attempt already in progress");
                return;
            }
            this.c.k().B().a("Using local app measurement service");
            this.a = true;
            o8Var = this.c.c;
            a.a(l, intent, o8Var, 129);
        }
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void a(ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.u.a("MeasurementServiceConnection.onConnectionFailed");
        f4 r = this.c.a.r();
        if (r != null) {
            r.w().a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.g().a(new r8(this));
    }

    public final void b() {
        this.c.c();
        Context l = this.c.l();
        synchronized (this) {
            if (this.a) {
                this.c.k().B().a("Connection attempt already in progress");
                return;
            }
            if (this.b != null && (this.b.j() || this.b.a())) {
                this.c.k().B().a("Already awaiting connection attempt");
                return;
            }
            this.b = new g4(l, Looper.getMainLooper(), this, this);
            this.c.k().B().a("Connecting to remote service");
            this.a = true;
            this.b.r();
        }
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void b(Bundle bundle) {
        com.google.android.gms.common.internal.u.a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.g().a(new p8(this, this.b.A()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o8 o8Var;
        com.google.android.gms.common.internal.u.a("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.k().t().a("Service connected with null binder");
                return;
            }
            w3 w3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        w3Var = queryLocalInterface instanceof w3 ? (w3) queryLocalInterface : new y3(iBinder);
                    }
                    this.c.k().B().a("Bound to IMeasurementService interface");
                } else {
                    this.c.k().t().a("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.k().t().a("Service connect failed to get IMeasurementService");
            }
            if (w3Var == null) {
                this.a = false;
                try {
                    com.google.android.gms.common.stats.a a = com.google.android.gms.common.stats.a.a();
                    Context l = this.c.l();
                    o8Var = this.c.c;
                    a.a(l, o8Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.g().a(new n8(this, w3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.u.a("MeasurementServiceConnection.onServiceDisconnected");
        this.c.k().A().a("Service disconnected");
        this.c.g().a(new q8(this, componentName));
    }
}
