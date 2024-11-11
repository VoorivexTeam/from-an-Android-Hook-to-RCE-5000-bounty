package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1500v0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t0 */
/* loaded from: classes.dex */
public final class C1472t0 extends AbstractC1406o4<C1472t0, a> implements InterfaceC1561z5 {
    private static final C1472t0 zzi;
    private static volatile InterfaceC1348k6<C1472t0> zzj;
    private int zzc;
    private InterfaceC1532x4<C1500v0> zzd = AbstractC1406o4.m8089o();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* renamed from: com.google.android.gms.internal.measurement.t0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1472t0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1472t0.zzi);
        }

        /* synthetic */ a(C1430q0 c1430q0) {
            this();
        }

        /* renamed from: a */
        public final a m8460a(int i, C1500v0.a aVar) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8433a(i, (C1500v0) ((AbstractC1406o4) aVar.mo7537i()));
            return this;
        }

        /* renamed from: a */
        public final a m8461a(int i, C1500v0 c1500v0) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8433a(i, c1500v0);
            return this;
        }

        /* renamed from: a */
        public final a m8462a(long j) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8434a(j);
            return this;
        }

        /* renamed from: a */
        public final a m8463a(C1500v0.a aVar) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8442a((C1500v0) ((AbstractC1406o4) aVar.mo7537i()));
            return this;
        }

        /* renamed from: a */
        public final a m8464a(C1500v0 c1500v0) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8442a(c1500v0);
            return this;
        }

        /* renamed from: a */
        public final a m8465a(Iterable<? extends C1500v0> iterable) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8443a(iterable);
            return this;
        }

        /* renamed from: a */
        public final a m8466a(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8444a(str);
            return this;
        }

        /* renamed from: a */
        public final C1500v0 m8467a(int i) {
            return ((C1472t0) this.f6791c).m8451b(i);
        }

        /* renamed from: b */
        public final a m8468b(int i) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8447c(i);
            return this;
        }

        /* renamed from: b */
        public final a m8469b(long j) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8445b(j);
            return this;
        }

        /* renamed from: n */
        public final int m8470n() {
            return ((C1472t0) this.f6791c).m8452p();
        }

        /* renamed from: o */
        public final a m8471o() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1472t0) this.f6791c).m8432A();
            return this;
        }

        /* renamed from: p */
        public final String m8472p() {
            return ((C1472t0) this.f6791c).m8453q();
        }

        /* renamed from: q */
        public final long m8473q() {
            return ((C1472t0) this.f6791c).m8455s();
        }

        /* renamed from: r */
        public final long m8474r() {
            return ((C1472t0) this.f6791c).m8457u();
        }

        public final List<C1500v0> zza() {
            return Collections.unmodifiableList(((C1472t0) this.f6791c).zza());
        }
    }

    static {
        C1472t0 c1472t0 = new C1472t0();
        zzi = c1472t0;
        AbstractC1406o4.m8085a((Class<C1472t0>) C1472t0.class, c1472t0);
    }

    private C1472t0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m8432A() {
        this.zzd = AbstractC1406o4.m8089o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8433a(int i, C1500v0 c1500v0) {
        c1500v0.getClass();
        m8450z();
        this.zzd.set(i, c1500v0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8434a(long j) {
        this.zzc |= 2;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8442a(C1500v0 c1500v0) {
        c1500v0.getClass();
        m8450z();
        this.zzd.add(c1500v0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8443a(Iterable<? extends C1500v0> iterable) {
        m8450z();
        AbstractC1530x2.m8879a(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8444a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m8445b(long j) {
        this.zzc |= 4;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m8447c(int i) {
        m8450z();
        this.zzd.remove(i);
    }

    /* renamed from: x */
    public static a m8448x() {
        return zzi.m8098k();
    }

    /* renamed from: z */
    private final void m8450z() {
        if (this.zzd.zza()) {
            return;
        }
        this.zzd = AbstractC1406o4.m8082a(this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1430q0 c1430q0 = null;
        switch (C1430q0.f6843a[i - 1]) {
            case 1:
                return new C1472t0();
            case 2:
                return new a(c1430q0);
            case 3:
                return AbstractC1406o4.m8083a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzc", "zzd", C1500v0.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                InterfaceC1348k6<C1472t0> interfaceC1348k6 = zzj;
                if (interfaceC1348k6 == null) {
                    synchronized (C1472t0.class) {
                        interfaceC1348k6 = zzj;
                        if (interfaceC1348k6 == null) {
                            interfaceC1348k6 = new AbstractC1406o4.c<>(zzi);
                            zzj = interfaceC1348k6;
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
    public final C1500v0 m8451b(int i) {
        return this.zzd.get(i);
    }

    /* renamed from: p */
    public final int m8452p() {
        return this.zzd.size();
    }

    /* renamed from: q */
    public final String m8453q() {
        return this.zze;
    }

    /* renamed from: r */
    public final boolean m8454r() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: s */
    public final long m8455s() {
        return this.zzf;
    }

    /* renamed from: t */
    public final boolean m8456t() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: u */
    public final long m8457u() {
        return this.zzg;
    }

    /* renamed from: v */
    public final boolean m8458v() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: w */
    public final int m8459w() {
        return this.zzh;
    }

    public final List<C1500v0> zza() {
        return this.zzd;
    }
}
