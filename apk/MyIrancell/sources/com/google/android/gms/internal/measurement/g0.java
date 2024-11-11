package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class g0 extends o4<g0, a> implements z5 {
    private static final g0 zzj;
    private static volatile k6<g0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private e0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<g0, a> implements z5 {
        private a() {
            super(g0.zzj);
        }

        /* synthetic */ a(b0 b0Var) {
            this();
        }

        public final a a(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((g0) this.c).a(str);
            return this;
        }
    }

    static {
        g0 g0Var = new g0();
        zzj = g0Var;
        o4.a((Class<g0>) g0.class, g0Var);
    }

    private g0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a w() {
        return zzj.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        b0 b0Var = null;
        switch (b0.a[i - 1]) {
            case 1:
                return new g0();
            case 2:
                return new a(b0Var);
            case 3:
                return o4.a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                k6<g0> k6Var = zzk;
                if (k6Var == null) {
                    synchronized (g0.class) {
                        k6Var = zzk;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzj);
                            zzk = k6Var;
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

    public final int p() {
        return this.zzd;
    }

    public final String q() {
        return this.zze;
    }

    public final e0 r() {
        e0 e0Var = this.zzf;
        return e0Var == null ? e0.w() : e0Var;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return (this.zzc & 32) != 0;
    }

    public final boolean v() {
        return this.zzi;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
