package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a1 */
/* loaded from: classes.dex */
public final class C1193a1 extends AbstractC1406o4<C1193a1, a> implements InterfaceC1561z5 {
    private static final C1193a1 zzf;
    private static volatile InterfaceC1348k6<C1193a1> zzg;
    private int zzc;
    private int zzd;
    private InterfaceC1490u4 zze = AbstractC1406o4.m8088n();

    /* renamed from: com.google.android.gms.internal.measurement.a1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1193a1, a> implements InterfaceC1561z5 {
        private a() {
            super(C1193a1.zzf);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }

        /* renamed from: a */
        public final a m7523a(int i) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1193a1) this.f6791c).m7513c(i);
            return this;
        }

        /* renamed from: a */
        public final a m7524a(long j) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1193a1) this.f6791c).m7507a(j);
            return this;
        }

        /* renamed from: a */
        public final a m7525a(Iterable<? extends Long> iterable) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1193a1) this.f6791c).m7512a(iterable);
            return this;
        }

        public final a zza() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1193a1) this.f6791c).m7517v();
            return this;
        }
    }

    static {
        C1193a1 c1193a1 = new C1193a1();
        zzf = c1193a1;
        AbstractC1406o4.m8085a((Class<C1193a1>) C1193a1.class, c1193a1);
    }

    private C1193a1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7507a(long j) {
        m7516u();
        this.zze.mo7964a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7512a(Iterable<? extends Long> iterable) {
        m7516u();
        AbstractC1530x2.m8879a(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m7513c(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* renamed from: s */
    public static a m7514s() {
        return zzf.m8098k();
    }

    /* renamed from: u */
    private final void m7516u() {
        if (this.zze.zza()) {
            return;
        }
        this.zze = AbstractC1406o4.m8081a(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m7517v() {
        this.zze = AbstractC1406o4.m8088n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1193a1();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                InterfaceC1348k6<C1193a1> interfaceC1348k6 = zzg;
                if (interfaceC1348k6 == null) {
                    synchronized (C1193a1.class) {
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

    /* renamed from: b */
    public final long m7519b(int i) {
        return this.zze.mo7965b(i);
    }

    /* renamed from: p */
    public final int m7520p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final List<Long> m7521q() {
        return this.zze;
    }

    /* renamed from: r */
    public final int m7522r() {
        return this.zze.size();
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
