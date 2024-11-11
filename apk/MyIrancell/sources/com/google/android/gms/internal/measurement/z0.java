package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.util.List;

/* loaded from: classes.dex */
public final class z0 extends o4<z0, a> implements z5 {
    private static final z0 zzg;
    private static volatile k6<z0> zzh;
    private u4 zzc = o4.n();
    private u4 zzd = o4.n();
    private x4<s0> zze = o4.o();
    private x4<a1> zzf = o4.o();

    /* loaded from: classes.dex */
    public static final class a extends o4.a<z0, a> implements z5 {
        private a() {
            super(z0.zzg);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((z0) this.c).d(i);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((z0) this.c).a(iterable);
            return this;
        }

        public final a b(int i) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((z0) this.c).e(i);
            return this;
        }

        public final a b(Iterable<? extends Long> iterable) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((z0) this.c).b(iterable);
            return this;
        }

        public final a c(Iterable<? extends s0> iterable) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((z0) this.c).c(iterable);
            return this;
        }

        public final a d(Iterable<? extends a1> iterable) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((z0) this.c).d(iterable);
            return this;
        }

        public final a n() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((z0) this.c).A();
            return this;
        }

        public final a zza() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((z0) this.c).z();
            return this;
        }
    }

    static {
        z0 z0Var = new z0();
        zzg = z0Var;
        o4.a((Class<z0>) z0.class, z0Var);
    }

    private z0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        this.zzd = o4.n();
    }

    private final void B() {
        if (this.zze.zza()) {
            return;
        }
        this.zze = o4.a(this.zze);
    }

    private final void C() {
        if (this.zzf.zza()) {
            return;
        }
        this.zzf = o4.a(this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        if (!this.zzc.zza()) {
            this.zzc = o4.a(this.zzc);
        }
        x2.a(iterable, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Iterable<? extends Long> iterable) {
        if (!this.zzd.zza()) {
            this.zzd = o4.a(this.zzd);
        }
        x2.a(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Iterable<? extends s0> iterable) {
        B();
        x2.a(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i) {
        B();
        this.zze.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Iterable<? extends a1> iterable) {
        C();
        x2.a(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i) {
        C();
        this.zzf.remove(i);
    }

    public static a w() {
        return zzg.k();
    }

    public static z0 x() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.zzc = o4.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new z0();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", s0.class, "zzf", a1.class});
            case 4:
                return zzg;
            case 5:
                k6<z0> k6Var = zzh;
                if (k6Var == null) {
                    synchronized (z0.class) {
                        k6Var = zzh;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzg);
                            zzh = k6Var;
                        }
                    }
                }
                return k6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final s0 b(int i) {
        return this.zze.get(i);
    }

    public final a1 c(int i) {
        return this.zzf.get(i);
    }

    public final int p() {
        return this.zzc.size();
    }

    public final List<Long> q() {
        return this.zzd;
    }

    public final int r() {
        return this.zzd.size();
    }

    public final List<s0> s() {
        return this.zze;
    }

    public final int t() {
        return this.zze.size();
    }

    public final List<a1> u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final List<Long> zza() {
        return this.zzc;
    }
}
