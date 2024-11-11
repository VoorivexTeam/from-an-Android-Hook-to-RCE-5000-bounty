package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h0 */
/* loaded from: classes.dex */
public final class C1297h0 extends AbstractC1406o4<C1297h0, b> implements InterfaceC1561z5 {
    private static final C1297h0 zzh;
    private static volatile InterfaceC1348k6<C1297h0> zzi;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC1532x4<String> zzg = AbstractC1406o4.m8089o();

    /* renamed from: com.google.android.gms.internal.measurement.h0$a */
    /* loaded from: classes.dex */
    public enum a implements InterfaceC1434q4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);

        private static final InterfaceC1476t4<a> zzh = new C1357l0();
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

        public static InterfaceC1462s4 zzb() {
            return C1342k0.f6693a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1434q4
        public final int zza() {
            return this.zzi;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.h0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1406o4.a<C1297h0, b> implements InterfaceC1561z5 {
        private b() {
            super(C1297h0.zzh);
        }

        /* synthetic */ b(C1207b0 c1207b0) {
            this();
        }
    }

    static {
        C1297h0 c1297h0 = new C1297h0();
        zzh = c1297h0;
        AbstractC1406o4.m8085a((Class<C1297h0>) C1297h0.class, c1297h0);
    }

    private C1297h0() {
    }

    /* renamed from: w */
    public static C1297h0 m7858w() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1207b0 c1207b0 = null;
        switch (C1207b0.f6508a[i - 1]) {
            case 1:
                return new C1297h0();
            case 2:
                return new b(c1207b0);
            case 3:
                return AbstractC1406o4.m8083a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzc", "zzd", a.zzb(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                InterfaceC1348k6<C1297h0> interfaceC1348k6 = zzi;
                if (interfaceC1348k6 == null) {
                    synchronized (C1297h0.class) {
                        interfaceC1348k6 = zzi;
                        if (interfaceC1348k6 == null) {
                            interfaceC1348k6 = new AbstractC1406o4.c<>(zzh);
                            zzi = interfaceC1348k6;
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
    public final a m7860p() {
        a zza = a.zza(this.zzd);
        return zza == null ? a.UNKNOWN_MATCH_TYPE : zza;
    }

    /* renamed from: q */
    public final boolean m7861q() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: r */
    public final String m7862r() {
        return this.zze;
    }

    /* renamed from: s */
    public final boolean m7863s() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: t */
    public final boolean m7864t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final List<String> m7865u() {
        return this.zzg;
    }

    /* renamed from: v */
    public final int m7866v() {
        return this.zzg.size();
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
