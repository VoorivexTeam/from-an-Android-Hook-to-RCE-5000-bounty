package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class w extends BroadcastReceiver {

    @Nullable
    private x a;

    public w(x xVar) {
        this.a = xVar;
    }

    public final void a() {
        FirebaseInstanceId.j();
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        x xVar = this.a;
        if (xVar != null && xVar.b()) {
            FirebaseInstanceId.j();
            FirebaseInstanceId.a(this.a, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
