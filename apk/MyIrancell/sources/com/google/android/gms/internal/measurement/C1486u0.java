package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.u0 */
/* loaded from: classes.dex */
public final class C1486u0 extends AbstractC1406o4<C1486u0, a> implements InterfaceC1561z5 {
    private static final C1486u0 zzf;
    private static volatile InterfaceC1348k6<C1486u0> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* renamed from: com.google.android.gms.internal.measurement.u0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1486u0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1486u0.zzf);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }
    }

    static {
        C1486u0 c1486u0 = new C1486u0();
        zzf = c1486u0;
        AbstractC1406o4.m8085a((Class<C1486u0>) C1486u0.class, c1486u0);
    }

    private C1486u0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1486u0();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC1348k6<C1486u0> interfaceC1348k6 = zzg;
                if (interfaceC1348k6 == null) {
                    synchronized (C1486u0.class) {
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
