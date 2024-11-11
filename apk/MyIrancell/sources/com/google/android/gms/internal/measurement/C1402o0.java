package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1387n0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* loaded from: classes.dex */
public final class C1402o0 extends AbstractC1406o4<C1402o0, a> implements InterfaceC1561z5 {
    private static final C1402o0 zzl;
    private static volatile InterfaceC1348k6<C1402o0> zzm;
    private int zzc;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private String zze = "";
    private InterfaceC1532x4<C1416p0> zzg = AbstractC1406o4.m8089o();
    private InterfaceC1532x4<C1387n0> zzh = AbstractC1406o4.m8089o();
    private InterfaceC1532x4<C1222c0> zzi = AbstractC1406o4.m8089o();
    private String zzj = "";

    /* renamed from: com.google.android.gms.internal.measurement.o0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1402o0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1402o0.zzl);
        }

        /* synthetic */ a(C1372m0 c1372m0) {
            this();
        }

        /* renamed from: a */
        public final C1387n0 m8072a(int i) {
            return ((C1402o0) this.f6791c).m8064b(i);
        }

        /* renamed from: a */
        public final a m8073a(int i, C1387n0.a aVar) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1402o0) this.f6791c).m8057a(i, (C1387n0) ((AbstractC1406o4) aVar.mo7537i()));
            return this;
        }

        /* renamed from: n */
        public final List<C1222c0> m8074n() {
            return Collections.unmodifiableList(((C1402o0) this.f6791c).m8070u());
        }

        /* renamed from: o */
        public final a m8075o() {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1402o0) this.f6791c).m8063z();
            return this;
        }

        public final int zza() {
            return ((C1402o0) this.f6791c).m8069t();
        }
    }

    static {
        C1402o0 c1402o0 = new C1402o0();
        zzl = c1402o0;
        AbstractC1406o4.m8085a((Class<C1402o0>) C1402o0.class, c1402o0);
    }

    private C1402o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m8057a(int i, C1387n0 c1387n0) {
        c1387n0.getClass();
        if (!this.zzh.zza()) {
            this.zzh = AbstractC1406o4.m8082a(this.zzh);
        }
        this.zzh.set(i, c1387n0);
    }

    /* renamed from: w */
    public static a m8060w() {
        return zzl.m8098k();
    }

    /* renamed from: x */
    public static C1402o0 m8061x() {
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m8063z() {
        this.zzi = AbstractC1406o4.m8089o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1372m0 c1372m0 = null;
        switch (C1372m0.f6743a[i - 1]) {
            case 1:
                return new C1402o0();
            case 2:
                return new a(c1372m0);
            case 3:
                return AbstractC1406o4.m8083a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\b\u0003\b\u0007\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C1416p0.class, "zzh", C1387n0.class, "zzi", C1222c0.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                InterfaceC1348k6<C1402o0> interfaceC1348k6 = zzm;
                if (interfaceC1348k6 == null) {
                    synchronized (C1402o0.class) {
                        interfaceC1348k6 = zzm;
                        if (interfaceC1348k6 == null) {
                            interfaceC1348k6 = new AbstractC1406o4.c<>(zzl);
                            zzm = interfaceC1348k6;
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
    public final C1387n0 m8064b(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: p */
    public final long m8065p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final boolean m8066q() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: r */
    public final String m8067r() {
        return this.zze;
    }

    /* renamed from: s */
    public final List<C1416p0> m8068s() {
        return this.zzg;
    }

    /* renamed from: t */
    public final int m8069t() {
        return this.zzh.size();
    }

    /* renamed from: u */
    public final List<C1222c0> m8070u() {
        return this.zzi;
    }

    /* renamed from: v */
    public final boolean m8071v() {
        return this.zzk;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
