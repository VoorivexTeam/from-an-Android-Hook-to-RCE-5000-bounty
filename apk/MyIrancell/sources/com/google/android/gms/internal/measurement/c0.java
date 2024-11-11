package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.o4;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends o4<c0, a> implements z5 {
    private static final c0 zzi;
    private static volatile k6<c0> zzj;
    private int zzc;
    private int zzd;
    private x4<g0> zze = o4.o();
    private x4<d0> zzf = o4.o();
    private boolean zzg;
    private boolean zzh;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<c0, a> implements z5 {
        private a() {
            super(c0.zzi);
        }

        /* synthetic */ a(b0 b0Var) {
            this();
        }

        public final a a(int i, d0.a aVar) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((c0) this.c).a(i, (d0) ((o4) aVar.i()));
            return this;
        }

        public final a a(int i, g0.a aVar) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((c0) this.c).a(i, (g0) ((o4) aVar.i()));
            return this;
        }

        public final g0 a(int i) {
            return ((c0) this.c).b(i);
        }

        public final d0 b(int i) {
            return ((c0) this.c).c(i);
        }

        public final int n() {
            return ((c0) this.c).t();
        }

        public final int zza() {
            return ((c0) this.c).r();
        }
    }

    static {
        c0 c0Var = new c0();
        zzi = c0Var;
        o4.a((Class<c0>) c0.class, c0Var);
    }

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, d0 d0Var) {
        d0Var.getClass();
        if (!this.zzf.zza()) {
            this.zzf = o4.a(this.zzf);
        }
        this.zzf.set(i, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, g0 g0Var) {
        g0Var.getClass();
        if (!this.zze.zza()) {
            this.zze = o4.a(this.zze);
        }
        this.zze.set(i, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        b0 b0Var = null;
        switch (b0.a[i - 1]) {
            case 1:
                return new c0();
            case 2:
                return new a(b0Var);
            case 3:
                return o4.a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new Object[]{"zzc", "zzd", "zze", g0.class, "zzf", d0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                k6<c0> k6Var = zzj;
                if (k6Var == null) {
                    synchronized (c0.class) {
                        k6Var = zzj;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzi);
                            zzj = k6Var;
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

    public final g0 b(int i) {
        return this.zze.get(i);
    }

    public final d0 c(int i) {
        return this.zzf.get(i);
    }

    public final int p() {
        return this.zzd;
    }

    public final List<g0> q() {
        return this.zze;
    }

    public final int r() {
        return this.zze.size();
    }

    public final List<d0> s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
