package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import defpackage.zo;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class d0 implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue<g0> d;
    private b0 e;
    private boolean f;

    public d0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new zo("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private d0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.d = new ArrayDeque();
        this.f = false;
        this.a = context.getApplicationContext();
        this.b = new Intent(str).setPackage(this.a.getPackageName());
        this.c = scheduledExecutorService;
    }

    private final synchronized void a() {
        Log.isLoggable("FirebaseInstanceId", 3);
        while (!this.d.isEmpty()) {
            Log.isLoggable("FirebaseInstanceId", 3);
            if (this.e == null || !this.e.isBinderAlive()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    boolean z = !this.f;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    sb.toString();
                }
                if (!this.f) {
                    this.f = true;
                    try {
                        if (com.google.android.gms.common.stats.a.a().a(this.a, this.b, this, 65)) {
                            return;
                        }
                    } catch (SecurityException unused) {
                    }
                    this.f = false;
                    b();
                }
                return;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            this.e.a(this.d.poll());
        }
    }

    private final void b() {
        while (!this.d.isEmpty()) {
            this.d.poll().a();
        }
    }

    public final synchronized void a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        Log.isLoggable("FirebaseInstanceId", 3);
        this.d.add(new g0(intent, pendingResult, this.c));
        a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        this.f = false;
        if (iBinder instanceof b0) {
            this.e = (b0) iBinder;
            a();
            return;
        }
        String valueOf2 = String.valueOf(iBinder);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
        sb2.append("Invalid service connection: ");
        sb2.append(valueOf2);
        sb2.toString();
        b();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        a();
    }
}
