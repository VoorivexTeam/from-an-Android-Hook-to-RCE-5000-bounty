package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* loaded from: classes.dex */
public final class C1931x3<V> {

    /* renamed from: h */
    private static final Object f8158h = new Object();

    /* renamed from: a */
    private final String f8159a;

    /* renamed from: b */
    private final InterfaceC1909v3<V> f8160b;

    /* renamed from: c */
    private final V f8161c;

    /* renamed from: d */
    private final V f8162d;

    /* renamed from: e */
    private final Object f8163e;

    /* renamed from: f */
    private volatile V f8164f;

    /* renamed from: g */
    private volatile V f8165g;

    private C1931x3(String str, V v, V v2, InterfaceC1909v3<V> interfaceC1909v3) {
        this.f8163e = new Object();
        this.f8164f = null;
        this.f8165g = null;
        this.f8159a = str;
        this.f8161c = v;
        this.f8162d = v2;
        this.f8160b = interfaceC1909v3;
    }

    /* renamed from: a */
    public final V m9875a(V v) {
        synchronized (this.f8163e) {
        }
        if (v != null) {
            return v;
        }
        if (C1898u3.f8087a == null) {
            return this.f8161c;
        }
        synchronized (f8158h) {
            if (C1791ka.m9464a()) {
                return this.f8165g == null ? this.f8161c : this.f8165g;
            }
            try {
                for (C1931x3 c1931x3 : C1828o.m9511C0()) {
                    if (C1791ka.m9464a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v2 = null;
                    try {
                        if (c1931x3.f8160b != null) {
                            v2 = c1931x3.f8160b.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f8158h) {
                        c1931x3.f8165g = v2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            InterfaceC1909v3<V> interfaceC1909v3 = this.f8160b;
            if (interfaceC1909v3 == null) {
                return this.f8161c;
            }
            try {
                return interfaceC1909v3.zza();
            } catch (IllegalStateException unused3) {
                return this.f8161c;
            } catch (SecurityException unused4) {
                return this.f8161c;
            }
        }
    }

    /* renamed from: a */
    public final String m9876a() {
        return this.f8159a;
    }
}
