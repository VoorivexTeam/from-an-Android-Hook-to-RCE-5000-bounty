package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class x3<V> {
    private static final Object h = new Object();
    private final String a;
    private final v3<V> b;
    private final V c;
    private final V d;
    private final Object e;
    private volatile V f;
    private volatile V g;

    private x3(String str, V v, V v2, v3<V> v3Var) {
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.a = str;
        this.c = v;
        this.d = v2;
        this.b = v3Var;
    }

    public final V a(V v) {
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (u3.a == null) {
            return this.c;
        }
        synchronized (h) {
            if (ka.a()) {
                return this.g == null ? this.c : this.g;
            }
            try {
                for (x3 x3Var : o.C0()) {
                    if (ka.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v2 = null;
                    try {
                        if (x3Var.b != null) {
                            v2 = x3Var.b.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (h) {
                        x3Var.g = v2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            v3<V> v3Var = this.b;
            if (v3Var == null) {
                return this.c;
            }
            try {
                return v3Var.zza();
            } catch (IllegalStateException unused3) {
                return this.c;
            } catch (SecurityException unused4) {
                return this.c;
            }
        }
    }

    public final String a() {
        return this.a;
    }
}
