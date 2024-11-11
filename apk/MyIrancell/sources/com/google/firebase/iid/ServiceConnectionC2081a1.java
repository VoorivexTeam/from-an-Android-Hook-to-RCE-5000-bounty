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
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.stats.C1088a;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p000.HandlerC3447xq;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.a1 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2081a1 implements ServiceConnection {

    /* renamed from: a */
    @GuardedBy("this")
    int f8881a;

    /* renamed from: b */
    final Messenger f8882b;

    /* renamed from: c */
    C2097h f8883c;

    /* renamed from: d */
    @GuardedBy("this")
    final Queue<AbstractC2101j<?>> f8884d;

    /* renamed from: e */
    @GuardedBy("this")
    final SparseArray<AbstractC2101j<?>> f8885e;

    /* renamed from: f */
    final /* synthetic */ C2134z0 f8886f;

    private ServiceConnectionC2081a1(C2134z0 c2134z0) {
        this.f8886f = c2134z0;
        this.f8881a = 0;
        this.f8882b = new Messenger(new HandlerC3447xq(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.d1

            /* renamed from: a */
            private final ServiceConnectionC2081a1 f8899a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8899a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f8899a.m10633a(message);
            }
        }));
        this.f8884d = new ArrayDeque();
        this.f8885e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10630a() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f8886f.f8991b;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.firebase.iid.c

            /* renamed from: b */
            private final ServiceConnectionC2081a1 f8889b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8889b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC2101j<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final ServiceConnectionC2081a1 serviceConnectionC2081a1 = this.f8889b;
                while (true) {
                    synchronized (serviceConnectionC2081a1) {
                        if (serviceConnectionC2081a1.f8881a != 2) {
                            return;
                        }
                        if (serviceConnectionC2081a1.f8884d.isEmpty()) {
                            serviceConnectionC2081a1.m10635b();
                            return;
                        }
                        poll = serviceConnectionC2081a1.f8884d.poll();
                        serviceConnectionC2081a1.f8885e.put(poll.f8914a, poll);
                        scheduledExecutorService2 = serviceConnectionC2081a1.f8886f.f8991b;
                        scheduledExecutorService2.schedule(new Runnable(serviceConnectionC2081a1, poll) { // from class: com.google.firebase.iid.e

                            /* renamed from: b */
                            private final ServiceConnectionC2081a1 f8900b;

                            /* renamed from: c */
                            private final AbstractC2101j f8901c;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.f8900b = serviceConnectionC2081a1;
                                this.f8901c = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f8900b.m10631a(this.f8901c.f8914a);
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
                    context = serviceConnectionC2081a1.f8886f.f8990a;
                    Messenger messenger = serviceConnectionC2081a1.f8882b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f8916c;
                    obtain.arg1 = poll.f8914a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo10648a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.f8917d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC2081a1.f8883c.m10650a(obtain);
                    } catch (RemoteException e) {
                        serviceConnectionC2081a1.m10632a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m10631a(int i) {
        AbstractC2101j<?> abstractC2101j = this.f8885e.get(i);
        if (abstractC2101j != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            sb.toString();
            this.f8885e.remove(i);
            abstractC2101j.m10652a(new C2099i(3, "Timed out waiting for response"));
            m10635b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m10632a(int i, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i2 = this.f8881a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                this.f8881a = 4;
                return;
            } else {
                if (i2 == 4) {
                    return;
                }
                int i3 = this.f8881a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.f8881a = 4;
        C1088a m7348a = C1088a.m7348a();
        context = this.f8886f.f8990a;
        m7348a.m7349a(context, this);
        C2099i c2099i = new C2099i(i, str);
        Iterator<AbstractC2101j<?>> it = this.f8884d.iterator();
        while (it.hasNext()) {
            it.next().m10652a(c2099i);
        }
        this.f8884d.clear();
        for (int i4 = 0; i4 < this.f8885e.size(); i4++) {
            this.f8885e.valueAt(i4).m10652a(c2099i);
        }
        this.f8885e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m10633a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            sb.toString();
        }
        synchronized (this) {
            AbstractC2101j<?> abstractC2101j = this.f8885e.get(i);
            if (abstractC2101j == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                sb2.toString();
                return true;
            }
            this.f8885e.remove(i);
            m10635b();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                abstractC2101j.m10652a(new C2099i(4, "Not supported by GmsCore"));
            } else {
                abstractC2101j.mo10647a(data);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean m10634a(AbstractC2101j<?> abstractC2101j) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.f8881a;
        if (i == 0) {
            this.f8884d.add(abstractC2101j);
            C1057u.m7297b(this.f8881a == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.f8881a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            C1088a m7348a = C1088a.m7348a();
            context = this.f8886f.f8990a;
            if (m7348a.m7350a(context, intent, this, 1)) {
                scheduledExecutorService = this.f8886f.f8991b;
                scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.firebase.iid.c1

                    /* renamed from: b */
                    private final ServiceConnectionC2081a1 f8890b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f8890b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8890b.m10636c();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m10632a(0, "Unable to bind to service");
            }
            return true;
        }
        if (i == 1) {
            this.f8884d.add(abstractC2101j);
            return true;
        }
        if (i == 2) {
            this.f8884d.add(abstractC2101j);
            m10630a();
            return true;
        }
        if (i != 3 && i != 4) {
            int i2 = this.f8881a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void m10635b() {
        Context context;
        if (this.f8881a == 2 && this.f8884d.isEmpty() && this.f8885e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f8881a = 3;
            C1088a m7348a = C1088a.m7348a();
            context = this.f8886f.f8990a;
            m7348a.m7349a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void m10636c() {
        if (this.f8881a == 1) {
            m10632a(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.f8886f.f8991b;
        scheduledExecutorService.execute(new Runnable(this, iBinder) { // from class: com.google.firebase.iid.d

            /* renamed from: b */
            private final ServiceConnectionC2081a1 f8891b;

            /* renamed from: c */
            private final IBinder f8892c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8891b = this;
                this.f8892c = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2081a1 serviceConnectionC2081a1 = this.f8891b;
                IBinder iBinder2 = this.f8892c;
                synchronized (serviceConnectionC2081a1) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC2081a1.m10632a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC2081a1.f8883c = new C2097h(iBinder2);
                            serviceConnectionC2081a1.f8881a = 2;
                            serviceConnectionC2081a1.m10630a();
                        } catch (RemoteException e) {
                            serviceConnectionC2081a1.m10632a(0, e.getMessage());
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
        scheduledExecutorService = this.f8886f.f8991b;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.firebase.iid.f

            /* renamed from: b */
            private final ServiceConnectionC2081a1 f8902b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8902b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8902b.m10632a(2, "Service disconnected");
            }
        });
    }
}
