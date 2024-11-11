package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 extends o4<h0, b> implements z5 {
    private static final h0 zzh;
    private static volatile k6<h0> zzi;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private x4<String> zzg = o4.o();

    /* loaded from: classes.dex */
    public enum a implements q4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);

        private static final t4<a> zzh = new l0();
        private final int zzi;

        a(int i) {
            this.zzi = i;
        }

        public static a zza(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static s4 zzb() {
            return k0.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.q4
        public final int zza() {
            return this.zzi;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends o4.a<h0, b> implements z5 {
        private b() {
            super(h0.zzh);
        }

        /* synthetic */ b(b0 b0Var) {
            this();
        }
    }

    static {
        h0 h0Var = new h0();
        zzh = h0Var;
        o4.a((Class<h0>) h0.class, h0Var);
    }

    private h0() {
    }

    public static h0 w() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        b0 b0Var = null;
        switch (b0.a[i - 1]) {
            case 1:
                return new h0();
            case 2:
                return new b(b0Var);
            case 3:
                return o4.a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzc", "zzd", a.zzb(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                k6<h0> k6Var = zzi;
                if (k6Var == null) {
                    synchronized (h0.class) {
                        k6Var = zzi;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzh);
                            zzi = k6Var;
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

    public final a p() {
        a zza = a.zza(this.zzd);
        return zza == null ? a.UNKNOWN_MATCH_TYPE : zza;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzc & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final List<String> u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
