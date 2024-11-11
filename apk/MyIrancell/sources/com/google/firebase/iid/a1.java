package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import defpackage.xq;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a1 implements ServiceConnection {

    @GuardedBy("this")
    int a;
    final Messenger b;
    h c;

    @GuardedBy("this")
    final Queue<j<?>> d;

    @GuardedBy("this")
    final SparseArray<j<?>> e;
    final /* synthetic */ z0 f;

    private a1(z0 z0Var) {
        this.f = z0Var;
        this.a = 0;
        this.b = new Messenger(new xq(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.d1
            private final a1 a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.a(message);
            }
        }));
        this.d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f.b;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.firebase.iid.c
            private final a1 b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final j<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final a1 a1Var = this.b;
                while (true) {
                    synchronized (a1Var) {
                        if (a1Var.a != 2) {
                            return;
                        }
                        if (a1Var.d.isEmpty()) {
                            a1Var.b();
                            return;
                        }
                        poll = a1Var.d.poll();
                        a1Var.e.put(poll.a, poll);
                        scheduledExecutorService2 = a1Var.f.b;
                        scheduledExecutorService2.schedule(new Runnable(a1Var, poll) { // from class: com.google.firebase.iid.e
                            private final a1 b;
                            private final j c;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.b = a1Var;
                                this.c = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.b.a(this.c.a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        sb.toString();
                    }
                    context = a1Var.f.a;
                    Messenger messenger = a1Var.b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.c;
                    obtain.arg1 = poll.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.d);
                    obtain.setData(bundle);
                    try {
                        a1Var.c.a(obtain);
                    } catch (RemoteException e) {
                        a1Var.a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        j<?> jVar = this.e.get(i);
        if (jVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            sb.toString();
            this.e.remove(i);
            jVar.a(new i(3, "Timed out waiting for response"));
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                this.a = 4;
                return;
            } else {
                if (i2 == 4) {
                    return;
                }
                int i3 = this.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.a = 4;
        com.google.android.gms.common.stats.a a = com.google.android.gms.common.stats.a.a();
        context = this.f.a;
        a.a(context, this);
        i iVar = new i(i, str);
        Iterator<j<?>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a(iVar);
        }
        this.d.clear();
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            this.e.valueAt(i4).a(iVar);
        }
        this.e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            sb.toString();
        }
        synchronized (this) {
            j<?> jVar = this.e.get(i);
            if (jVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                sb2.toString();
                return true;
            }
            this.e.remove(i);
            b();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                jVar.a(new i(4, "Not supported by GmsCore"));
            } else {
                jVar.a(data);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a(j<?> jVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.a;
        if (i == 0) {
            this.d.add(jVar);
            com.google.android.gms.common.internal.u.b(this.a == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            com.google.android.gms.common.stats.a a = com.google.android.gms.common.stats.a.a();
            context = this.f.a;
            if (a.a(context, intent, this, 1)) {
                scheduledExecutorService = this.f.b;
                scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.firebase.iid.c1
                    private final a1 b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b.c();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
            return true;
        }
        if (i == 1) {
            this.d.add(jVar);
            return true;
        }
        if (i == 2) {
            this.d.add(jVar);
            a();
            return true;
        }
        if (i != 3 && i != 4) {
            int i2 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        Context context;
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 3;
            com.google.android.gms.common.stats.a a = com.google.android.gms.common.stats.a.a();
            context = this.f.a;
            a.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.f.b;
        scheduledExecutorService.execute(new Runnable(this, iBinder) { // from class: com.google.firebase.iid.d
            private final a1 b;
            private final IBinder c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = this;
                this.c = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a1 a1Var = this.b;
                IBinder iBinder2 = this.c;
                synchronized (a1Var) {
                    try {
                        if (iBinder2 == null) {
                            a1Var.a(0, "Null service connection");
                            return;
                        }
                        try {
                            a1Var.c = new h(iBinder2);
                            a1Var.a = 2;
                            a1Var.a();
                        } catch (RemoteException e) {
                            a1Var.a(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.f.b;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.firebase.iid.f
            private final a1 b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.a(2, "Service disconnected");
            }
        });
    }
}
