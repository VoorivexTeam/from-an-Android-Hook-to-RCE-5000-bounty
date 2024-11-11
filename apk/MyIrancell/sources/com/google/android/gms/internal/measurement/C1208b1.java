package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* loaded from: classes.dex */
public final class C1208b1 extends AbstractC1406o4<C1208b1, a> implements InterfaceC1561z5 {
    private static final C1208b1 zzj;
    private static volatile InterfaceC1348k6<C1208b1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    /* renamed from: com.google.android.gms.internal.measurement.b1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1208b1, a> implements InterfaceC1561z5 {
        private a() {
            super(C1208b1.zzj);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }

        /* renamed from: a */
        public final a m7567a(double d) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1208b1) this.f6791c).m7543a(d);
            return this;
        }

        /* renamed from: a */
        public final a m7568a(long j) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1208b1) this.f6791c).m7544a(j);
            return this;
        }

        /* renamed from: a */
        public final a m7569a(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1208b1) this.f6791c).m7549a(str);
            return this;
        }

        /* renamed from: b */
        public final a m7570b(long j) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1208b1) this.f6791c).m7550b(j);
            return this;
        }

        /* renamed from: b */
        public final a m7571b(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1208b1) this.f6791c).m7554b(str);
            return this;
        }

        /* renamed from: n */
        public final a m7572n() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1208b1) this.f6791c).m7541A();
            return this;
        }

        /* renamed from: o */
        public final a m7573o() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1208b1) this.f6791c).m7542B();
            return this;
        }

        public final a zza() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1208b1) this.f6791c).m7558z();
            return this;
        }
    }

    static {
        C1208b1 c1208b1 = new C1208b1();
        zzj = c1208b1;
        AbstractC1406o4.m8085a((Class<C1208b1>) C1208b1.class, c1208b1);
    }

    private C1208b1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m7541A() {
        this.zzc &= -9;
        this.zzg = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m7542B() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7543a(double d) {
        this.zzc |= 32;
        this.zzi = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7544a(long j) {
        this.zzc |= 1;
        this.zzd = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7549a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m7550b(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m7554b(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    /* renamed from: x */
    public static a m7556x() {
        return zzj.m8098k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m7558z() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1208b1();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                InterfaceC1348k6<C1208b1> interfaceC1348k6 = zzk;
                if (interfaceC1348k6 == null) {
                    synchronized (C1208b1.class) {
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
    public final long m7559p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final String m7560q() {
        return this.zze;
    }

    /* renamed from: r */
    public final boolean m7561r() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: s */
    public final String m7562s() {
        return this.zzf;
    }

    /* renamed from: t */
    public final boolean m7563t() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: u */
    public final long m7564u() {
        return this.zzg;
    }

    /* renamed from: v */
    public final boolean m7565v() {
        return (this.zzc & 32) != 0;
    }

    /* renamed from: w */
    public final double m7566w() {
        return this.zzi;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
