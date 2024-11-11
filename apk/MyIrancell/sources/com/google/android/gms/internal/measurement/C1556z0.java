package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z0 */
/* loaded from: classes.dex */
public final class C1556z0 extends AbstractC1406o4<C1556z0, a> implements InterfaceC1561z5 {
    private static final C1556z0 zzg;
    private static volatile InterfaceC1348k6<C1556z0> zzh;
    private InterfaceC1490u4 zzc = AbstractC1406o4.m8088n();
    private InterfaceC1490u4 zzd = AbstractC1406o4.m8088n();
    private InterfaceC1532x4<C1458s0> zze = AbstractC1406o4.m8089o();
    private InterfaceC1532x4<C1193a1> zzf = AbstractC1406o4.m8089o();

    /* renamed from: com.google.android.gms.internal.measurement.z0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1556z0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1556z0.zzg);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }

        /* renamed from: a */
        public final a m8922a(int i) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1556z0) this.f6791c).m8905d(i);
            return this;
        }

        /* renamed from: a */
        public final a m8923a(Iterable<? extends Long> iterable) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1556z0) this.f6791c).m8898a(iterable);
            return this;
        }

        /* renamed from: b */
        public final a m8924b(int i) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1556z0) this.f6791c).m8908e(i);
            return this;
        }

        /* renamed from: b */
        public final a m8925b(Iterable<? extends Long> iterable) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1556z0) this.f6791c).m8902b(iterable);
            return this;
        }

        /* renamed from: c */
        public final a m8926c(Iterable<? extends C1458s0> iterable) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1556z0) this.f6791c).m8904c(iterable);
            return this;
        }

        /* renamed from: d */
        public final a m8927d(Iterable<? extends C1193a1> iterable) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1556z0) this.f6791c).m8907d(iterable);
            return this;
        }

        /* renamed from: n */
        public final a m8928n() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1556z0) this.f6791c).m8892A();
            return this;
        }

        public final a zza() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1556z0) this.f6791c).m8912z();
            return this;
        }
    }

    static {
        C1556z0 c1556z0 = new C1556z0();
        zzg = c1556z0;
        AbstractC1406o4.m8085a((Class<C1556z0>) C1556z0.class, c1556z0);
    }

    private C1556z0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m8892A() {
        this.zzd = AbstractC1406o4.m8088n();
    }

    /* renamed from: B */
    private final void m8893B() {
        if (this.zze.zza()) {
            return;
        }
        this.zze = AbstractC1406o4.m8082a(this.zze);
    }

    /* renamed from: C */
    private final void m8894C() {
        if (this.zzf.zza()) {
            return;
        }
        this.zzf = AbstractC1406o4.m8082a(this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8898a(Iterable<? extends Long> iterable) {
        if (!this.zzc.zza()) {
            this.zzc = AbstractC1406o4.m8081a(this.zzc);
        }
        AbstractC1530x2.m8879a(iterable, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m8902b(Iterable<? extends Long> iterable) {
        if (!this.zzd.zza()) {
            this.zzd = AbstractC1406o4.m8081a(this.zzd);
        }
        AbstractC1530x2.m8879a(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m8904c(Iterable<? extends C1458s0> iterable) {
        m8893B();
        AbstractC1530x2.m8879a(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m8905d(int i) {
        m8893B();
        this.zze.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m8907d(Iterable<? extends C1193a1> iterable) {
        m8894C();
        AbstractC1530x2.m8879a(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m8908e(int i) {
        m8894C();
        this.zzf.remove(i);
    }

    /* renamed from: w */
    public static a m8909w() {
        return zzg.m8098k();
    }

    /* renamed from: x */
    public static C1556z0 m8910x() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m8912z() {
        this.zzc = AbstractC1406o4.m8088n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1556z0();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", C1458s0.class, "zzf", C1193a1.class});
            case 4:
                return zzg;
            case 5:
                InterfaceC1348k6<C1556z0> interfaceC1348k6 = zzh;
                if (interfaceC1348k6 == null) {
                    synchronized (C1556z0.class) {
                        interfaceC1348k6 = zzh;
                        if (interfaceC1348k6 == null) {
                            interfaceC1348k6 = new AbstractC1406o4.c<>(zzg);
                            zzh = interfaceC1348k6;
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

    /* renamed from: b */
    public final C1458s0 m8913b(int i) {
        return this.zze.get(i);
    }

    /* renamed from: c */
    public final C1193a1 m8914c(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: p */
    public final int m8915p() {
        return this.zzc.size();
    }

    /* renamed from: q */
    public final List<Long> m8916q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final int m8917r() {
        return this.zzd.size();
    }

    /* renamed from: s */
    public final List<C1458s0> m8918s() {
        return this.zze;
    }

    /* renamed from: t */
    public final int m8919t() {
        return this.zze.size();
    }

    /* renamed from: u */
    public final List<C1193a1> m8920u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final int m8921v() {
        return this.zzf.size();
    }

    public final List<Long> zza() {
        return this.zzc;
    }
}
