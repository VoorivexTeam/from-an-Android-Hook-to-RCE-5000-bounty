package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.internal.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o0 implements ServiceConnection {
    private final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    private int b = 2;
    private boolean c;
    private IBinder d;
    private final j.a e;
    private ComponentName f;
    private final /* synthetic */ m0 g;

    public o0(m0 m0Var, j.a aVar) {
        this.g = m0Var;
        this.e = aVar;
    }

    public final IBinder a() {
        return this.d;
    }

    public final void a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        Context context;
        com.google.android.gms.common.stats.a unused;
        Context unused2;
        unused = this.g.f;
        unused2 = this.g.d;
        j.a aVar = this.e;
        context = this.g.d;
        aVar.a(context);
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.a unused;
        Context unused2;
        unused = this.g.f;
        unused2 = this.g.d;
        this.a.remove(serviceConnection);
    }

    public final void a(String str) {
        com.google.android.gms.common.stats.a aVar;
        Context context;
        Context context2;
        com.google.android.gms.common.stats.a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.b = 3;
        aVar = this.g.f;
        context = this.g.d;
        j.a aVar3 = this.e;
        context2 = this.g.d;
        boolean a = aVar.a(context, str, aVar3.a(context2), this, this.e.c());
        this.c = a;
        if (a) {
            handler = this.g.e;
            Message obtainMessage = handler.obtainMessage(1, this.e);
            handler2 = this.g.e;
            j = this.g.h;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.b = 2;
        try {
            aVar2 = this.g.f;
            context3 = this.g.d;
            aVar2.a(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final ComponentName b() {
        return this.f;
    }

    public final void b(String str) {
        Handler handler;
        com.google.android.gms.common.stats.a aVar;
        Context context;
        handler = this.g.e;
        handler.removeMessages(1, this.e);
        aVar = this.g.f;
        context = this.g.d;
        aVar.a(context, this);
        this.c = false;
        this.b = 2;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.a.isEmpty();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.c;
        synchronized (hashMap) {
            handler = this.g.e;
            handler.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator<ServiceConnection> it = this.a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.c;
        synchronized (hashMap) {
            handler = this.g.e;
            handler.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator<ServiceConnection> it = this.a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
