package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.p0 */
/* loaded from: classes.dex */
public final class C1416p0 extends AbstractC1406o4<C1416p0, a> implements InterfaceC1561z5 {
    private static final C1416p0 zzf;
    private static volatile InterfaceC1348k6<C1416p0> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.measurement.p0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1416p0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1416p0.zzf);
        }

        /* synthetic */ a(C1372m0 c1372m0) {
            this();
        }
    }

    static {
        C1416p0 c1416p0 = new C1416p0();
        zzf = c1416p0;
        AbstractC1406o4.m8085a((Class<C1416p0>) C1416p0.class, c1416p0);
    }

    private C1416p0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1372m0 c1372m0 = null;
        switch (C1372m0.f6743a[i - 1]) {
            case 1:
                return new C1416p0();
            case 2:
                return new a(c1372m0);
            case 3:
                return AbstractC1406o4.m8083a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC1348k6<C1416p0> interfaceC1348k6 = zzg;
                if (interfaceC1348k6 == null) {
                    synchronized (C1416p0.class) {
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

    /* renamed from: p */
    public final String m8169p() {
        return this.zze;
    }

    public final String zza() {
        return this.zzd;
    }
}
