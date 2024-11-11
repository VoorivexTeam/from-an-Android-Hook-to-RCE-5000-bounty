package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v0 */
/* loaded from: classes.dex */
public final class C1500v0 extends AbstractC1406o4<C1500v0, a> implements InterfaceC1561z5 {
    private static final C1500v0 zzj;
    private static volatile InterfaceC1348k6<C1500v0> zzk;
    private int zzc;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private InterfaceC1532x4<C1500v0> zzi = AbstractC1406o4.m8089o();

    /* renamed from: com.google.android.gms.internal.measurement.v0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1500v0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1500v0.zzj);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }

        /* renamed from: a */
        public final a m8522a(double d) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1500v0) this.f6791c).m8500a(d);
            return this;
        }

        /* renamed from: a */
        public final a m8523a(long j) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1500v0) this.f6791c).m8501a(j);
            return this;
        }

        /* renamed from: a */
        public final a m8524a(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1500v0) this.f6791c).m8506a(str);
            return this;
        }

        /* renamed from: b */
        public final a m8525b(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1500v0) this.f6791c).m8509b(str);
            return this;
        }

        /* renamed from: n */
        public final a m8526n() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1500v0) this.f6791c).m8498B();
            return this;
        }

        /* renamed from: o */
        public final a m8527o() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1500v0) this.f6791c).m8499C();
            return this;
        }

        public final a zza() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1500v0) this.f6791c).m8497A();
            return this;
        }
    }

    static {
        C1500v0 c1500v0 = new C1500v0();
        zzj = c1500v0;
        AbstractC1406o4.m8085a((Class<C1500v0>) C1500v0.class, c1500v0);
    }

    private C1500v0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m8497A() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m8498B() {
        this.zzc &= -5;
        this.zzf = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m8499C() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8500a(double d) {
        this.zzc |= 16;
        this.zzh = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8501a(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8506a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m8509b(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* renamed from: y */
    public static a m8511y() {
        return zzj.m8098k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1500v0();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", C1500v0.class});
            case 4:
                return zzj;
            case 5:
                InterfaceC1348k6<C1500v0> interfaceC1348k6 = zzk;
                if (interfaceC1348k6 == null) {
                    synchronized (C1500v0.class) {
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
    public final String m8513p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final boolean m8514q() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: r */
    public final String m8515r() {
        return this.zze;
    }

    /* renamed from: s */
    public final boolean m8516s() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: t */
    public final long m8517t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final boolean m8518u() {
        return (this.zzc & 16) != 0;
    }

    /* renamed from: v */
    public final double m8519v() {
        return this.zzh;
    }

    /* renamed from: w */
    public final List<C1500v0> m8520w() {
        return this.zzi;
    }

    /* renamed from: x */
    public final int m8521x() {
        return this.zzi.size();
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
