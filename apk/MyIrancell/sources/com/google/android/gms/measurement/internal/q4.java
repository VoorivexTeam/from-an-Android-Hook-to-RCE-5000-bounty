package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q4 extends BroadcastReceiver {
    private final o9 a;
    private boolean b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q4(o9 o9Var) {
        com.google.android.gms.common.internal.u.a(o9Var);
        this.a = o9Var;
    }

    public final void a() {
        this.a.p();
        this.a.g().c();
        if (this.b) {
            return;
        }
        this.a.l().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.e().u();
        this.a.k().B().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    public final void b() {
        this.a.p();
        this.a.g().c();
        this.a.g().c();
        if (this.b) {
            this.a.k().B().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.l().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.k().t().a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.p();
        String action = intent.getAction();
        this.a.k().B().a("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.a.k().w().a("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean u = this.a.e().u();
        if (this.c != u) {
            this.c = u;
            this.a.g().a(new p4(this, u));
        }
    }
}
