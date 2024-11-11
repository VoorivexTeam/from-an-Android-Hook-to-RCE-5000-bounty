package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1556z0;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* loaded from: classes.dex */
public final class C1444r0 extends AbstractC1406o4<C1444r0, a> implements InterfaceC1561z5 {
    private static final C1444r0 zzh;
    private static volatile InterfaceC1348k6<C1444r0> zzi;
    private int zzc;
    private int zzd;
    private C1556z0 zze;
    private C1556z0 zzf;
    private boolean zzg;

    /* renamed from: com.google.android.gms.internal.measurement.r0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1444r0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1444r0.zzh);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }

        /* renamed from: a */
        public final a m8280a(int i) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1444r0) this.f6791c).m8269b(i);
            return this;
        }

        /* renamed from: a */
        public final a m8281a(C1556z0.a aVar) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1444r0) this.f6791c).m8267a((C1556z0) ((AbstractC1406o4) aVar.mo7537i()));
            return this;
        }

        /* renamed from: a */
        public final a m8282a(C1556z0 c1556z0) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1444r0) this.f6791c).m8271b(c1556z0);
            return this;
        }

        /* renamed from: a */
        public final a m8283a(boolean z) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1444r0) this.f6791c).m8268a(z);
            return this;
        }

        /* renamed from: n */
        public final C1556z0 m8284n() {
            return ((C1444r0) this.f6791c).m8277s();
        }

        public final boolean zza() {
            return ((C1444r0) this.f6791c).m8276r();
        }
    }

    static {
        C1444r0 c1444r0 = new C1444r0();
        zzh = c1444r0;
        AbstractC1406o4.m8085a((Class<C1444r0>) C1444r0.class, c1444r0);
    }

    private C1444r0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8267a(C1556z0 c1556z0) {
        c1556z0.getClass();
        this.zze = c1556z0;
        this.zzc |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8268a(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m8269b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m8271b(C1556z0 c1556z0) {
        c1556z0.getClass();
        this.zzf = c1556z0;
        this.zzc |= 4;
    }

    /* renamed from: v */
    public static a m8272v() {
        return zzh.m8098k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1444r0();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                InterfaceC1348k6<C1444r0> interfaceC1348k6 = zzi;
                if (interfaceC1348k6 == null) {
                    synchronized (C1444r0.class) {
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
    public final int m8274p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final C1556z0 m8275q() {
        C1556z0 c1556z0 = this.zze;
        return c1556z0 == null ? C1556z0.m8910x() : c1556z0;
    }

    /* renamed from: r */
    public final boolean m8276r() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: s */
    public final C1556z0 m8277s() {
        C1556z0 c1556z0 = this.zzf;
        return c1556z0 == null ? C1556z0.m8910x() : c1556z0;
    }

    /* renamed from: t */
    public final boolean m8278t() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: u */
    public final boolean m8279u() {
        return this.zzg;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
