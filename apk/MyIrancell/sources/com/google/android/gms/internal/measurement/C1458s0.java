package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* loaded from: classes.dex */
public final class C1458s0 extends AbstractC1406o4<C1458s0, a> implements InterfaceC1561z5 {
    private static final C1458s0 zzf;
    private static volatile InterfaceC1348k6<C1458s0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* renamed from: com.google.android.gms.internal.measurement.s0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1458s0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1458s0.zzf);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }

        /* renamed from: a */
        public final a m8366a(int i) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1458s0) this.f6791c).m8360b(i);
            return this;
        }

        /* renamed from: a */
        public final a m8367a(long j) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1458s0) this.f6791c).m8357a(j);
            return this;
        }
    }

    static {
        C1458s0 c1458s0 = new C1458s0();
        zzf = c1458s0;
        AbstractC1406o4.m8085a((Class<C1458s0>) C1458s0.class, c1458s0);
    }

    private C1458s0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8357a(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m8360b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* renamed from: s */
    public static a m8361s() {
        return zzf.m8098k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1458s0();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC1348k6<C1458s0> interfaceC1348k6 = zzg;
                if (interfaceC1348k6 == null) {
                    synchronized (C1458s0.class) {
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
    public final int m8363p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final boolean m8364q() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: r */
    public final long m8365r() {
        return this.zze;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
