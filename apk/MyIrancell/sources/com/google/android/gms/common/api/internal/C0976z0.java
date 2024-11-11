package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.internal.C1022e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p000.C3369vr;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
/* loaded from: classes.dex */
public final class C0976z0 implements InterfaceC0925m1, InterfaceC0950s2 {

    /* renamed from: a */
    private final Lock f6024a;

    /* renamed from: b */
    private final Condition f6025b;

    /* renamed from: c */
    private final Context f6026c;

    /* renamed from: d */
    private final C0994d f6027d;

    /* renamed from: e */
    private final HandlerC0877b1 f6028e;

    /* renamed from: f */
    final Map<C0859a.c<?>, C0859a.f> f6029f;

    /* renamed from: h */
    private final C1022e f6031h;

    /* renamed from: i */
    private final Map<C0859a<?>, Boolean> f6032i;

    /* renamed from: j */
    private final C0859a.a<? extends InterfaceC3497yr, C3369vr> f6033j;

    /* renamed from: k */
    private volatile InterfaceC0964w0 f6034k;

    /* renamed from: m */
    int f6036m;

    /* renamed from: n */
    final C0940q0 f6037n;

    /* renamed from: o */
    final InterfaceC0929n1 f6038o;

    /* renamed from: g */
    final Map<C0859a.c<?>, ConnectionResult> f6030g = new HashMap();

    /* renamed from: l */
    private ConnectionResult f6035l = null;

    public C0976z0(Context context, C0940q0 c0940q0, Lock lock, Looper looper, C0994d c0994d, Map<C0859a.c<?>, C0859a.f> map, C1022e c1022e, Map<C0859a<?>, Boolean> map2, C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar, ArrayList<C0942q2> arrayList, InterfaceC0929n1 interfaceC0929n1) {
        this.f6026c = context;
        this.f6024a = lock;
        this.f6027d = c0994d;
        this.f6029f = map;
        this.f6031h = c1022e;
        this.f6032i = map2;
        this.f6033j = aVar;
        this.f6037n = c0940q0;
        this.f6038o = interfaceC0929n1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C0942q2 c0942q2 = arrayList.get(i);
            i++;
            c0942q2.m6847a(this);
        }
        this.f6028e = new HandlerC0877b1(this, looper);
        this.f6025b = lock.newCondition();
        this.f6034k = new C0928n0(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: a */
    public final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6805a(T t) {
        t.m6591f();
        return (T) this.f6034k.mo6673a((InterfaceC0964w0) t);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: a */
    public final void mo6688a(int i) {
        this.f6024a.lock();
        try {
            this.f6034k.mo6675a(i);
        } finally {
            this.f6024a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6932a(ConnectionResult connectionResult) {
        this.f6024a.lock();
        try {
            this.f6035l = connectionResult;
            this.f6034k = new C0928n0(this);
            this.f6034k.mo6674a();
            this.f6025b.signalAll();
        } finally {
            this.f6024a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0950s2
    /* renamed from: a */
    public final void mo6741a(ConnectionResult connectionResult, C0859a<?> c0859a, boolean z) {
        this.f6024a.lock();
        try {
            this.f6034k.mo6676a(connectionResult, c0859a, z);
        } finally {
            this.f6024a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6933a(AbstractC0972y0 abstractC0972y0) {
        this.f6028e.sendMessage(this.f6028e.obtainMessage(1, abstractC0972y0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6934a(RuntimeException runtimeException) {
        this.f6028e.sendMessage(this.f6028e.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final void mo6806a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f6034k);
        for (C0859a<?> c0859a : this.f6032i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c0859a.m6503b()).println(":");
            this.f6029f.get(c0859a.m6502a()).m6513a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final boolean mo6807a() {
        return this.f6034k instanceof C0975z;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final boolean mo6808a(InterfaceC0931o interfaceC0931o) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: b */
    public final <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6809b(T t) {
        t.m6591f();
        return (T) this.f6034k.mo6677b((InterfaceC0964w0) t);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo6810b() {
        if (this.f6034k.mo6679b()) {
            this.f6030g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: b */
    public final void mo6689b(Bundle bundle) {
        this.f6024a.lock();
        try {
            this.f6034k.mo6678b(bundle);
        } finally {
            this.f6024a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo6811c() {
        this.f6034k.mo6680c();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: d */
    public final void mo6812d() {
        if (mo6807a()) {
            ((C0975z) this.f6034k).m6929d();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: e */
    public final ConnectionResult mo6813e() {
        mo6811c();
        while (m6935g()) {
            try {
                this.f6025b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo6807a()) {
            return ConnectionResult.f5655f;
        }
        ConnectionResult connectionResult = this.f6035l;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: f */
    public final void mo6814f() {
    }

    /* renamed from: g */
    public final boolean m6935g() {
        return this.f6034k instanceof C0891e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m6936h() {
        this.f6024a.lock();
        try {
            this.f6034k = new C0891e0(this, this.f6031h, this.f6032i, this.f6027d, this.f6033j, this.f6024a, this.f6026c);
            this.f6034k.mo6674a();
            this.f6025b.signalAll();
        } finally {
            this.f6024a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m6937i() {
        this.f6024a.lock();
        try {
            this.f6037n.m6841l();
            this.f6034k = new C0975z(this);
            this.f6034k.mo6674a();
            this.f6025b.signalAll();
        } finally {
            this.f6024a.unlock();
        }
    }
}
