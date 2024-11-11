package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 extends o4<a1, a> implements z5 {
    private static final a1 zzf;
    private static volatile k6<a1> zzg;
    private int zzc;
    private int zzd;
    private u4 zze = o4.n();

    /* loaded from: classes.dex */
    public static final class a extends o4.a<a1, a> implements z5 {
        private a() {
            super(a1.zzf);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((a1) this.c).c(i);
            return this;
        }

        public final a a(long j) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((a1) this.c).a(j);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((a1) this.c).a(iterable);
            return this;
        }

        public final a zza() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((a1) this.c).v();
            return this;
        }
    }

    static {
        a1 a1Var = new a1();
        zzf = a1Var;
        o4.a((Class<a1>) a1.class, a1Var);
    }

    private a1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        u();
        this.zze.a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        u();
        x2.a(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    public static a s() {
        return zzf.k();
    }

    private final void u() {
        if (this.zze.zza()) {
            return;
        }
        this.zze = o4.a(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        this.zze = o4.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new a1();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                k6<a1> k6Var = zzg;
                if (k6Var == null) {
                    synchronized (a1.class) {
                        k6Var = zzg;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzf);
                            zzg = k6Var;
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

    public final long b(int i) {
        return this.zze.b(i);
    }

    public final int p() {
        return this.zzd;
    }

    public final List<Long> q() {
        return this.zze;
    }

    public final int r() {
        return this.zze.size();
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
