package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class f0 extends o4<f0, a> implements z5 {
    private static final f0 zzi;
    private static volatile k6<f0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    /* loaded from: classes.dex */
    public static final class a extends o4.a<f0, a> implements z5 {
        private a() {
            super(f0.zzi);
        }

        /* synthetic */ a(b0 b0Var) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum b implements q4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);

        private static final t4<b> zzf = new i0();
        private final int zzg;

        b(int i) {
            this.zzg = i;
        }

        public static b zza(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static s4 zzb() {
            return j0.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.q4
        public final int zza() {
            return this.zzg;
        }
    }

    static {
        f0 f0Var = new f0();
        zzi = f0Var;
        o4.a((Class<f0>) f0.class, f0Var);
    }

    private f0() {
    }

    public static f0 y() {
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        b0 b0Var = null;
        switch (b0.a[i - 1]) {
            case 1:
                return new f0();
            case 2:
                return new a(b0Var);
            case 3:
                return o4.a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzc", "zzd", b.zzb(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                k6<f0> k6Var = zzj;
                if (k6Var == null) {
                    synchronized (f0.class) {
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

    public final b p() {
        b zza = b.zza(this.zzd);
        return zza == null ? b.UNKNOWN_COMPARISON_TYPE : zza;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final boolean r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzc & 4) != 0;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzc & 8) != 0;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzc & 16) != 0;
    }

    public final String x() {
        return this.zzh;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
