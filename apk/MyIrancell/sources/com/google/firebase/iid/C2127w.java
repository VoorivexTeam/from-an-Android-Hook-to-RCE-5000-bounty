package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import javax.annotation.Nullable;

/* renamed from: com.google.firebase.iid.w */
/* loaded from: classes.dex */
final class C2127w extends BroadcastReceiver {

    /* renamed from: a */
    @Nullable
    private RunnableC2129x f8975a;

    public C2127w(RunnableC2129x runnableC2129x) {
        this.f8975a = runnableC2129x;
    }

    /* renamed from: a */
    public final void m10717a() {
        FirebaseInstanceId.m10600j();
        this.f8975a.m10721a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        RunnableC2129x runnableC2129x = this.f8975a;
        if (runnableC2129x != null && runnableC2129x.m10722b()) {
            FirebaseInstanceId.m10600j();
            FirebaseInstanceId.m10594a(this.f8975a, 0L);
            this.f8975a.m10721a().unregisterReceiver(this);
            this.f8975a = null;
        }
    }
}
