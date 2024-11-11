package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import defpackage.vr;
import defpackage.yr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class z0 implements m1, s2 {
    private final Lock a;
    private final Condition b;
    private final Context c;
    private final com.google.android.gms.common.d d;
    private final b1 e;
    final Map<a.c<?>, a.f> f;
    private final com.google.android.gms.common.internal.e h;
    private final Map<com.google.android.gms.common.api.a<?>, Boolean> i;
    private final a.AbstractC0041a<? extends yr, vr> j;
    private volatile w0 k;
    int m;
    final q0 n;
    final n1 o;
    final Map<a.c<?>, ConnectionResult> g = new HashMap();
    private ConnectionResult l = null;

    public z0(Context context, q0 q0Var, Lock lock, Looper looper, com.google.android.gms.common.d dVar, Map<a.c<?>, a.f> map, com.google.android.gms.common.internal.e eVar, Map<com.google.android.gms.common.api.a<?>, Boolean> map2, a.AbstractC0041a<? extends yr, vr> abstractC0041a, ArrayList<q2> arrayList, n1 n1Var) {
        this.c = context;
        this.a = lock;
        this.d = dVar;
        this.f = map;
        this.h = eVar;
        this.i = map2;
        this.j = abstractC0041a;
        this.n = q0Var;
        this.o = n1Var;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            q2 q2Var = arrayList.get(i);
            i++;
            q2Var.a(this);
        }
        this.e = new b1(this, looper);
        this.b = lock.newCondition();
        this.k = new n0(this);
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T a(T t) {
        t.f();
        return (T) this.k.a((w0) t);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a(int i) {
        this.a.lock();
        try {
            this.k.a(i);
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.l = connectionResult;
            this.k = new n0(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.s2
    public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, boolean z) {
        this.a.lock();
        try {
            this.k.a(connectionResult, aVar, z);
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(y0 y0Var) {
        this.e.sendMessage(this.e.obtainMessage(1, y0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(RuntimeException runtimeException) {
        this.e.sendMessage(this.e.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.k);
        for (com.google.android.gms.common.api.a<?> aVar : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.b()).println(":");
            this.f.get(aVar.a()).a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final boolean a() {
        return this.k instanceof z;
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final boolean a(o oVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T b(T t) {
        t.f();
        return (T) this.k.b((w0) t);
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final void b() {
        if (this.k.b()) {
            this.g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(Bundle bundle) {
        this.a.lock();
        try {
            this.k.b(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final void c() {
        this.k.c();
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final void d() {
        if (a()) {
            ((z) this.k).d();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final ConnectionResult e() {
        c();
        while (g()) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (a()) {
            return ConnectionResult.f;
        }
        ConnectionResult connectionResult = this.l;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void f() {
    }

    public final boolean g() {
        return this.k instanceof e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.a.lock();
        try {
            this.k = new e0(this, this.h, this.i, this.d, this.j, this.a, this.c);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.a.lock();
        try {
            this.n.l();
            this.k = new z(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }
}
