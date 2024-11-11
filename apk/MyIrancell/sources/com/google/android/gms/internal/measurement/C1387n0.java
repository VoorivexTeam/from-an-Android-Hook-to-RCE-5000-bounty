package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.n0 */
/* loaded from: classes.dex */
public final class C1387n0 extends AbstractC1406o4<C1387n0, a> implements InterfaceC1561z5 {
    private static final C1387n0 zzh;
    private static volatile InterfaceC1348k6<C1387n0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.measurement.n0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1387n0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1387n0.zzh);
        }

        /* synthetic */ a(C1372m0 c1372m0) {
            this();
        }

        /* renamed from: a */
        public final a m8042a(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1387n0) this.f6791c).m8036a(str);
            return this;
        }

        /* renamed from: n */
        public final boolean m8043n() {
            return ((C1387n0) this.f6791c).m8038p();
        }

        /* renamed from: o */
        public final boolean m8044o() {
            return ((C1387n0) this.f6791c).m8039q();
        }

        /* renamed from: p */
        public final boolean m8045p() {
            return ((C1387n0) this.f6791c).m8040r();
        }

        /* renamed from: q */
        public final int m8046q() {
            return ((C1387n0) this.f6791c).m8041s();
        }

        public final String zza() {
            return ((C1387n0) this.f6791c).zza();
        }
    }

    static {
        C1387n0 c1387n0 = new C1387n0();
        zzh = c1387n0;
        AbstractC1406o4.m8085a((Class<C1387n0>) C1387n0.class, c1387n0);
    }

    private C1387n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8036a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1372m0 c1372m0 = null;
        switch (C1372m0.f6743a[i - 1]) {
            case 1:
                return new C1387n0();
            case 2:
                return new a(c1372m0);
            case 3:
                return AbstractC1406o4.m8083a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                InterfaceC1348k6<C1387n0> interfaceC1348k6 = zzi;
                if (interfaceC1348k6 == null) {
                    synchronized (C1387n0.class) {
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
    public final boolean m8038p() {
        return this.zze;
    }

    /* renamed from: q */
    public final boolean m8039q() {
        return this.zzf;
    }

    /* renamed from: r */
    public final boolean m8040r() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: s */
    public final int m8041s() {
        return this.zzg;
    }

    public final String zza() {
        return this.zzd;
    }
}
