package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.g0 */
/* loaded from: classes.dex */
public final class C1282g0 extends AbstractC1406o4<C1282g0, a> implements InterfaceC1561z5 {
    private static final C1282g0 zzj;
    private static volatile InterfaceC1348k6<C1282g0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private C1252e0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* renamed from: com.google.android.gms.internal.measurement.g0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1282g0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1282g0.zzj);
        }

        /* synthetic */ a(C1207b0 c1207b0) {
            this();
        }

        /* renamed from: a */
        public final a m7845a(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1282g0) this.f6791c).m7835a(str);
            return this;
        }
    }

    static {
        C1282g0 c1282g0 = new C1282g0();
        zzj = c1282g0;
        AbstractC1406o4.m8085a((Class<C1282g0>) C1282g0.class, c1282g0);
    }

    private C1282g0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7835a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* renamed from: w */
    public static a m7836w() {
        return zzj.m8098k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1207b0 c1207b0 = null;
        switch (C1207b0.f6508a[i - 1]) {
            case 1:
                return new C1282g0();
            case 2:
                return new a(c1207b0);
            case 3:
                return AbstractC1406o4.m8083a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                InterfaceC1348k6<C1282g0> interfaceC1348k6 = zzk;
                if (interfaceC1348k6 == null) {
                    synchronized (C1282g0.class) {
                        interfaceC1348k6 = zzk;
                        if (interfaceC1348k6 == null) {
                            interfaceC1348k6 = new AbstractC1406o4.c<>(zzj);
                            zzk = interfaceC1348k6;
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
    public final int m7838p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final String m7839q() {
        return this.zze;
    }

    /* renamed from: r */
    public final C1252e0 m7840r() {
        C1252e0 c1252e0 = this.zzf;
        return c1252e0 == null ? C1252e0.m7775w() : c1252e0;
    }

    /* renamed from: s */
    public final boolean m7841s() {
        return this.zzg;
    }

    /* renamed from: t */
    public final boolean m7842t() {
        return this.zzh;
    }

    /* renamed from: u */
    public final boolean m7843u() {
        return (this.zzc & 32) != 0;
    }

    /* renamed from: v */
    public final boolean m7844v() {
        return this.zzi;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
