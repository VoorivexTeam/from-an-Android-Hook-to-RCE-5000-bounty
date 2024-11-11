package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.C1088a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p000.ThreadFactoryC3536zo;

/* renamed from: com.google.firebase.iid.d0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2089d0 implements ServiceConnection {

    /* renamed from: a */
    private final Context f8893a;

    /* renamed from: b */
    private final Intent f8894b;

    /* renamed from: c */
    private final ScheduledExecutorService f8895c;

    /* renamed from: d */
    private final Queue<C2096g0> f8896d;

    /* renamed from: e */
    private BinderC2083b0 f8897e;

    /* renamed from: f */
    private boolean f8898f;

    public ServiceConnectionC2089d0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC3536zo("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private ServiceConnectionC2089d0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8896d = new ArrayDeque();
        this.f8898f = false;
        this.f8893a = context.getApplicationContext();
        this.f8894b = new Intent(str).setPackage(this.f8893a.getPackageName());
        this.f8895c = scheduledExecutorService;
    }

    /* renamed from: a */
    private final synchronized void m10643a() {
        Log.isLoggable("FirebaseInstanceId", 3);
        while (!this.f8896d.isEmpty()) {
            Log.isLoggable("FirebaseInstanceId", 3);
            if (this.f8897e == null || !this.f8897e.isBinderAlive()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    boolean z = !this.f8898f;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    sb.toString();
                }
                if (!this.f8898f) {
                    this.f8898f = true;
                    try {
                        if (C1088a.m7348a().m7350a(this.f8893a, this.f8894b, this, 65)) {
                            return;
                        }
                    } catch (SecurityException unused) {
                    }
                    this.f8898f = false;
                    m10644b();
                }
                return;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            this.f8897e.m10641a(this.f8896d.poll());
        }
    }

    /* renamed from: b */
    private final void m10644b() {
        while (!this.f8896d.isEmpty()) {
            this.f8896d.poll().m10649a();
        }
    }

    /* renamed from: a */
    public final synchronized void m10645a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        Log.isLoggable("FirebaseInstanceId", 3);
        this.f8896d.add(new C2096g0(intent, pendingResult, this.f8895c));
        m10643a();
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
        this.f8898f = false;
        if (iBinder instanceof BinderC2083b0) {
            this.f8897e = (BinderC2083b0) iBinder;
            m10643a();
            return;
        }
        String valueOf2 = String.valueOf(iBinder);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
        sb2.append("Invalid service connection: ");
        sb2.append(valueOf2);
        sb2.toString();
        m10644b();
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
        m10643a();
    }
}
