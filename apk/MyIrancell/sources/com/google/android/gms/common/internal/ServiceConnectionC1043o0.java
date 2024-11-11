package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.internal.AbstractC1032j;
import com.google.android.gms.common.stats.C1088a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.o0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1043o0 implements ServiceConnection {

    /* renamed from: a */
    private final Map<ServiceConnection, ServiceConnection> f6247a = new HashMap();

    /* renamed from: b */
    private int f6248b = 2;

    /* renamed from: c */
    private boolean f6249c;

    /* renamed from: d */
    private IBinder f6250d;

    /* renamed from: e */
    private final AbstractC1032j.a f6251e;

    /* renamed from: f */
    private ComponentName f6252f;

    /* renamed from: g */
    private final /* synthetic */ C1039m0 f6253g;

    public ServiceConnectionC1043o0(C1039m0 c1039m0, AbstractC1032j.a aVar) {
        this.f6253g = c1039m0;
        this.f6251e = aVar;
    }

    /* renamed from: a */
    public final IBinder m7185a() {
        return this.f6250d;
    }

    /* renamed from: a */
    public final void m7186a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        Context context;
        C1088a unused;
        Context unused2;
        unused = this.f6253g.f6242f;
        unused2 = this.f6253g.f6240d;
        AbstractC1032j.a aVar = this.f6251e;
        context = this.f6253g.f6240d;
        aVar.m7163a(context);
        this.f6247a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: a */
    public final void m7187a(ServiceConnection serviceConnection, String str) {
        C1088a unused;
        Context unused2;
        unused = this.f6253g.f6242f;
        unused2 = this.f6253g.f6240d;
        this.f6247a.remove(serviceConnection);
    }

    /* renamed from: a */
    public final void m7188a(String str) {
        C1088a c1088a;
        Context context;
        Context context2;
        C1088a c1088a2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f6248b = 3;
        c1088a = this.f6253g.f6242f;
        context = this.f6253g.f6240d;
        AbstractC1032j.a aVar = this.f6251e;
        context2 = this.f6253g.f6240d;
        boolean m7351a = c1088a.m7351a(context, str, aVar.m7163a(context2), this, this.f6251e.m7165c());
        this.f6249c = m7351a;
        if (m7351a) {
            handler = this.f6253g.f6241e;
            Message obtainMessage = handler.obtainMessage(1, this.f6251e);
            handler2 = this.f6253g.f6241e;
            j = this.f6253g.f6244h;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.f6248b = 2;
        try {
            c1088a2 = this.f6253g.f6242f;
            context3 = this.f6253g.f6240d;
            c1088a2.m7349a(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final boolean m7189a(ServiceConnection serviceConnection) {
        return this.f6247a.containsKey(serviceConnection);
    }

    /* renamed from: b */
    public final ComponentName m7190b() {
        return this.f6252f;
    }

    /* renamed from: b */
    public final void m7191b(String str) {
        Handler handler;
        C1088a c1088a;
        Context context;
        handler = this.f6253g.f6241e;
        handler.removeMessages(1, this.f6251e);
        c1088a = this.f6253g.f6242f;
        context = this.f6253g.f6240d;
        c1088a.m7349a(context, this);
        this.f6249c = false;
        this.f6248b = 2;
    }

    /* renamed from: c */
    public final int m7192c() {
        return this.f6248b;
    }

    /* renamed from: d */
    public final boolean m7193d() {
        return this.f6249c;
    }

    /* renamed from: e */
    public final boolean m7194e() {
        return this.f6247a.isEmpty();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f6253g.f6239c;
        synchronized (hashMap) {
            handler = this.f6253g.f6241e;
            handler.removeMessages(1, this.f6251e);
            this.f6250d = iBinder;
            this.f6252f = componentName;
            Iterator<ServiceConnection> it = this.f6247a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f6248b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f6253g.f6239c;
        synchronized (hashMap) {
            handler = this.f6253g.f6241e;
            handler.removeMessages(1, this.f6251e);
            this.f6250d = null;
            this.f6252f = componentName;
            Iterator<ServiceConnection> it = this.f6247a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f6248b = 2;
        }
    }
}
