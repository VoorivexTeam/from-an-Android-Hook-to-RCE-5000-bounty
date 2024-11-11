package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* loaded from: classes.dex */
public final class C1252e0 extends AbstractC1406o4<C1252e0, a> implements InterfaceC1561z5 {
    private static final C1252e0 zzh;
    private static volatile InterfaceC1348k6<C1252e0> zzi;
    private int zzc;
    private C1297h0 zzd;
    private C1267f0 zze;
    private boolean zzf;
    private String zzg = "";

    /* renamed from: com.google.android.gms.internal.measurement.e0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1252e0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1252e0.zzh);
        }

        /* synthetic */ a(C1207b0 c1207b0) {
            this();
        }

        /* renamed from: a */
        public final a m7784a(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1252e0) this.f6791c).m7774a(str);
            return this;
        }
    }

    static {
        C1252e0 c1252e0 = new C1252e0();
        zzh = c1252e0;
        AbstractC1406o4.m8085a((Class<C1252e0>) C1252e0.class, c1252e0);
    }

    private C1252e0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7774a(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    /* renamed from: w */
    public static C1252e0 m7775w() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1207b0 c1207b0 = null;
        switch (C1207b0.f6508a[i - 1]) {
            case 1:
                return new C1252e0();
            case 2:
                return new a(c1207b0);
            case 3:
                return AbstractC1406o4.m8083a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                InterfaceC1348k6<C1252e0> interfaceC1348k6 = zzi;
                if (interfaceC1348k6 == null) {
                    synchronized (C1252e0.class) {
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
    public final C1297h0 m7777p() {
        C1297h0 c1297h0 = this.zzd;
        return c1297h0 == null ? C1297h0.m7858w() : c1297h0;
    }

    /* renamed from: q */
    public final boolean m7778q() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: r */
    public final C1267f0 m7779r() {
        C1267f0 c1267f0 = this.zze;
        return c1267f0 == null ? C1267f0.m7804y() : c1267f0;
    }

    /* renamed from: s */
    public final boolean m7780s() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: t */
    public final boolean m7781t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final boolean m7782u() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: v */
    public final String m7783v() {
        return this.zzg;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
