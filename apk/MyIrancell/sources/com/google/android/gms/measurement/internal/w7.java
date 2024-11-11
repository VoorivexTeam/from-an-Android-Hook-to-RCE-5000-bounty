package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.pc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w7 extends c3 {
    private final o8 c;
    private w3 d;
    private volatile Boolean e;
    private final g f;
    private final l9 g;
    private final List<Runnable> h;
    private final g i;

    /* JADX INFO: Access modifiers changed from: protected */
    public w7(j5 j5Var) {
        super(j5Var);
        this.h = new ArrayList();
        this.g = new l9(j5Var.h());
        this.c = new o8(this);
        this.f = new v7(this, j5Var);
        this.i = new g8(this, j5Var);
    }

    private final boolean I() {
        d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        c();
        this.g.a();
        this.f.a(o.G.a(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        c();
        if (B()) {
            k().B().a("Inactivity, disconnecting from the service");
            H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        c();
        k().B().a("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        Iterator<Runnable> it = this.h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e) {
                k().t().a("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ w3 a(w7 w7Var, w3 w3Var) {
        w7Var.d = null;
        return null;
    }

    private final zzm a(boolean z) {
        d();
        return q().a(z ? k().C() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ComponentName componentName) {
        c();
        if (this.d != null) {
            this.d = null;
            k().B().a("Disconnected from device MeasurementService", componentName);
            c();
            F();
        }
    }

    private final void a(Runnable runnable) {
        c();
        if (B()) {
            runnable.run();
        } else {
            if (this.h.size() >= 1000) {
                k().t().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.h.add(runnable);
            this.i.a(60000L);
            F();
        }
    }

    @Override // com.google.android.gms.measurement.internal.c3
    protected final boolean A() {
        return false;
    }

    public final boolean B() {
        c();
        x();
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        c();
        x();
        a(new f8(this, a(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        c();
        a();
        x();
        zzm a = a(false);
        if (I()) {
            t().B();
        }
        a(new z7(this, a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E() {
        c();
        x();
        zzm a = a(true);
        boolean a2 = m().a(o.y0);
        if (a2) {
            t().C();
        }
        a(new a8(this, a, a2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w7.F():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean G() {
        return this.e;
    }

    public final void H() {
        c();
        x();
        this.c.a();
        try {
            com.google.android.gms.common.stats.a.a().a(l(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void a(pc pcVar) {
        c();
        x();
        a(new b8(this, a(false), pcVar));
    }

    public final void a(pc pcVar, zzan zzanVar, String str) {
        c();
        x();
        if (i().a(com.google.android.gms.common.h.a) == 0) {
            a(new c8(this, zzanVar, str, pcVar));
        } else {
            k().w().a("Not bundling data. Service unavailable or out of date");
            i().a(pcVar, new byte[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(pc pcVar, String str, String str2) {
        c();
        x();
        a(new j8(this, str, str2, a(false), pcVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(pc pcVar, String str, String str2, boolean z) {
        c();
        x();
        a(new l8(this, str, str2, z, a(false), pcVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(s7 s7Var) {
        c();
        x();
        a(new e8(this, s7Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(w3 w3Var) {
        c();
        com.google.android.gms.common.internal.u.a(w3Var);
        this.d = w3Var;
        J();
        L();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(w3 w3Var, AbstractSafeParcelable abstractSafeParcelable, zzm zzmVar) {
        int i;
        h4 t;
        String str;
        List<AbstractSafeParcelable> a;
        c();
        a();
        x();
        boolean I = I();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!I || (a = t().a(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(a);
                i = a.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzan) {
                    try {
                        w3Var.a((zzan) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e) {
                        e = e;
                        t = k().t();
                        str = "Failed to send event to the service";
                        t.a(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkq) {
                    try {
                        w3Var.a((zzkq) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        t = k().t();
                        str = "Failed to send user property to the service";
                        t.a(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzv) {
                    try {
                        w3Var.a((zzv) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        t = k().t();
                        str = "Failed to send conditional user property to the service";
                        t.a(str, e);
                    }
                } else {
                    k().t().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(zzan zzanVar, String str) {
        com.google.android.gms.common.internal.u.a(zzanVar);
        c();
        x();
        boolean I = I();
        a(new i8(this, I, I && t().a(zzanVar), zzanVar, a(true), str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(zzkq zzkqVar) {
        c();
        x();
        a(new x7(this, I() && t().a(zzkqVar), zzkqVar, a(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(zzv zzvVar) {
        com.google.android.gms.common.internal.u.a(zzvVar);
        c();
        x();
        d();
        a(new h8(this, true, t().a(zzvVar), new zzv(zzvVar), a(true), zzvVar));
    }

    public final void a(AtomicReference<String> atomicReference) {
        c();
        x();
        a(new y7(this, atomicReference, a(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(AtomicReference<List<zzv>> atomicReference, String str, String str2, String str3) {
        c();
        x();
        a(new k8(this, atomicReference, str, str2, str3, a(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(AtomicReference<List<zzkq>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        x();
        a(new m8(this, atomicReference, str, str2, str3, z, a(false)));
    }
}
