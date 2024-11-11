package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC1347k5;
import com.google.android.gms.internal.measurement.InterfaceC1344k2;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1932x4 implements ServiceConnection {

    /* renamed from: a */
    private final String f8166a;

    /* renamed from: b */
    final /* synthetic */ C1943y4 f8167b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC1932x4(C1943y4 c1943y4, String str) {
        this.f8167b = c1943y4;
        this.f8166a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f8167b.f8185a.mo9324k().m9312w().m9365a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC1344k2 m7953a = AbstractBinderC1347k5.m7953a(iBinder);
            if (m7953a == null) {
                this.f8167b.f8185a.mo9324k().m9312w().m9365a("Install Referrer Service implementation was not found");
            } else {
                this.f8167b.f8185a.mo9324k().m9304B().m9365a("Install Referrer Service connected");
                this.f8167b.f8185a.mo9320g().m9344a(new RunnableC1666a5(this, m7953a, this));
            }
        } catch (Exception e) {
            this.f8167b.f8185a.mo9324k().m9312w().m9366a("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8167b.f8185a.mo9324k().m9304B().m9365a("Install Referrer Service disconnected");
    }
}
