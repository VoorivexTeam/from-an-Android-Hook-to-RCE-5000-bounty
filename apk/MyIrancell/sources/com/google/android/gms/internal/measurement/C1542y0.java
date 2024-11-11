package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.y0 */
/* loaded from: classes.dex */
public final class C1542y0 extends AbstractC1406o4<C1542y0, a> implements InterfaceC1561z5 {
    private static final C1542y0 zzf;
    private static volatile InterfaceC1348k6<C1542y0> zzg;
    private int zzc;
    private int zzd = 1;
    private InterfaceC1532x4<C1486u0> zze = AbstractC1406o4.m8089o();

    /* renamed from: com.google.android.gms.internal.measurement.y0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1542y0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1542y0.zzf);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.y0$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC1434q4 {
        RADS(1),
        PROVISIONING(2);

        private static final InterfaceC1476t4<b> zzc = new C1223c1();
        private final int zzd;

        b(int i) {
            this.zzd = i;
        }

        public static b zza(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static InterfaceC1462s4 zzb() {
            return C1238d1.f6557a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1434q4
        public final int zza() {
            return this.zzd;
        }
    }

    static {
        C1542y0 c1542y0 = new C1542y0();
        zzf = c1542y0;
        AbstractC1406o4.m8085a((Class<C1542y0>) C1542y0.class, c1542y0);
    }

    private C1542y0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1542y0();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzc", "zzd", b.zzb(), "zze", C1486u0.class});
            case 4:
                return zzf;
            case 5:
                InterfaceC1348k6<C1542y0> interfaceC1348k6 = zzg;
                if (interfaceC1348k6 == null) {
                    synchronized (C1542y0.class) {
                        interfaceC1348k6 = zzg;
                        if (interfaceC1348k6 == null) {
                            interfaceC1348k6 = new AbstractC1406o4.c<>(zzf);
                            zzg = interfaceC1348k6;
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
}
