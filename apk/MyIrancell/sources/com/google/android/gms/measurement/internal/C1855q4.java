package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C1057u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q4 */
/* loaded from: classes.dex */
public class C1855q4 extends BroadcastReceiver {

    /* renamed from: a */
    private final C1838o9 f7977a;

    /* renamed from: b */
    private boolean f7978b;

    /* renamed from: c */
    private boolean f7979c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1855q4(C1838o9 c1838o9) {
        C1057u.m7286a(c1838o9);
        this.f7977a = c1838o9;
    }

    /* renamed from: a */
    public final void m9758a() {
        this.f7977a.m9695p();
        this.f7977a.mo9320g().mo9194c();
        if (this.f7978b) {
            return;
        }
        this.f7977a.mo9325l().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f7979c = this.f7977a.m9688e().m9386u();
        this.f7977a.mo9324k().m9304B().m9366a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f7979c));
        this.f7978b = true;
    }

    /* renamed from: b */
    public final void m9759b() {
        this.f7977a.m9695p();
        this.f7977a.mo9320g().mo9194c();
        this.f7977a.mo9320g().mo9194c();
        if (this.f7978b) {
            this.f7977a.mo9324k().m9304B().m9365a("Unregistering connectivity change receiver");
            this.f7978b = false;
            this.f7979c = false;
            try {
                this.f7977a.mo9325l().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f7977a.mo9324k().m9309t().m9366a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f7977a.m9695p();
        String action = intent.getAction();
        this.f7977a.mo9324k().m9304B().m9366a("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f7977a.mo9324k().m9312w().m9366a("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m9386u = this.f7977a.m9688e().m9386u();
        if (this.f7979c != m9386u) {
            this.f7979c = m9386u;
            this.f7977a.mo9320g().m9344a(new RunnableC1844p4(this, m9386u));
        }
    }
}
