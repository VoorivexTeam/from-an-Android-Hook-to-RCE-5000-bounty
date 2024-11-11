package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.f0 */
/* loaded from: classes.dex */
public final class C1267f0 extends AbstractC1406o4<C1267f0, a> implements InterfaceC1561z5 {
    private static final C1267f0 zzi;
    private static volatile InterfaceC1348k6<C1267f0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    /* renamed from: com.google.android.gms.internal.measurement.f0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1267f0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1267f0.zzi);
        }

        /* synthetic */ a(C1207b0 c1207b0) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.f0$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC1434q4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);

        private static final InterfaceC1476t4<b> zzf = new C1312i0();
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

        public static InterfaceC1462s4 zzb() {
            return C1327j0.f6672a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1434q4
        public final int zza() {
            return this.zzg;
        }
    }

    static {
        C1267f0 c1267f0 = new C1267f0();
        zzi = c1267f0;
        AbstractC1406o4.m8085a((Class<C1267f0>) C1267f0.class, c1267f0);
    }

    private C1267f0() {
    }

    /* renamed from: y */
    public static C1267f0 m7804y() {
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1207b0 c1207b0 = null;
        switch (C1207b0.f6508a[i - 1]) {
            case 1:
                return new C1267f0();
            case 2:
                return new a(c1207b0);
            case 3:
                return AbstractC1406o4.m8083a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzc", "zzd", b.zzb(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                InterfaceC1348k6<C1267f0> interfaceC1348k6 = zzj;
                if (interfaceC1348k6 == null) {
                    synchronized (C1267f0.class) {
                        interfaceC1348k6 = zzj;
                        if (interfaceC1348k6 == null) {
                            interfaceC1348k6 = new AbstractC1406o4.c<>(zzi);
                            zzj = interfaceC1348k6;
                        }
                    }
                }
                return interfaceC1348k6;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    public final b m7806p() {
        b zza = b.zza(this.zzd);
        return zza == null ? b.UNKNOWN_COMPARISON_TYPE : zza;
    }

    /* renamed from: q */
    public final boolean m7807q() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: r */
    public final boolean m7808r() {
        return this.zze;
    }

    /* renamed from: s */
    public final boolean m7809s() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: t */
    public final String m7810t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final boolean m7811u() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: v */
    public final String m7812v() {
        return this.zzg;
    }

    /* renamed from: w */
    public final boolean m7813w() {
        return (this.zzc & 16) != 0;
    }

    /* renamed from: x */
    public final String m7814x() {
        return this.zzh;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
