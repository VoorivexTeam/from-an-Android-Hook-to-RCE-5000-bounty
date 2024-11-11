package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import com.google.android.gms.internal.measurement.C1237d0;
import com.google.android.gms.internal.measurement.C1282g0;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* loaded from: classes.dex */
public final class C1222c0 extends AbstractC1406o4<C1222c0, a> implements InterfaceC1561z5 {
    private static final C1222c0 zzi;
    private static volatile InterfaceC1348k6<C1222c0> zzj;
    private int zzc;
    private int zzd;
    private InterfaceC1532x4<C1282g0> zze = AbstractC1406o4.m8089o();
    private InterfaceC1532x4<C1237d0> zzf = AbstractC1406o4.m8089o();
    private boolean zzg;
    private boolean zzh;

    /* renamed from: com.google.android.gms.internal.measurement.c0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1222c0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1222c0.zzi);
        }

        /* synthetic */ a(C1207b0 c1207b0) {
            this();
        }

        /* renamed from: a */
        public final a m7686a(int i, C1237d0.a aVar) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1222c0) this.f6791c).m7674a(i, (C1237d0) ((AbstractC1406o4) aVar.mo7537i()));
            return this;
        }

        /* renamed from: a */
        public final a m7687a(int i, C1282g0.a aVar) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1222c0) this.f6791c).m7675a(i, (C1282g0) ((AbstractC1406o4) aVar.mo7537i()));
            return this;
        }

        /* renamed from: a */
        public final C1282g0 m7688a(int i) {
            return ((C1222c0) this.f6791c).m7679b(i);
        }

        /* renamed from: b */
        public final C1237d0 m7689b(int i) {
            return ((C1222c0) this.f6791c).m7680c(i);
        }

        /* renamed from: n */
        public final int m7690n() {
            return ((C1222c0) this.f6791c).m7685t();
        }

        public final int zza() {
            return ((C1222c0) this.f6791c).m7683r();
        }
    }

    static {
        C1222c0 c1222c0 = new C1222c0();
        zzi = c1222c0;
        AbstractC1406o4.m8085a((Class<C1222c0>) C1222c0.class, c1222c0);
    }

    private C1222c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7674a(int i, C1237d0 c1237d0) {
        c1237d0.getClass();
        if (!this.zzf.zza()) {
            this.zzf = AbstractC1406o4.m8082a(this.zzf);
        }
        this.zzf.set(i, c1237d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7675a(int i, C1282g0 c1282g0) {
        c1282g0.getClass();
        if (!this.zze.zza()) {
            this.zze = AbstractC1406o4.m8082a(this.zze);
        }
        this.zze.set(i, c1282g0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1207b0 c1207b0 = null;
        switch (C1207b0.f6508a[i - 1]) {
            case 1:
                return new C1222c0();
            case 2:
                return new a(c1207b0);
            case 3:
                return AbstractC1406o4.m8083a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new Object[]{"zzc", "zzd", "zze", C1282g0.class, "zzf", C1237d0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                InterfaceC1348k6<C1222c0> interfaceC1348k6 = zzj;
                if (interfaceC1348k6 == null) {
                    synchronized (C1222c0.class) {
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
    public final C1282g0 m7679b(int i) {
        return this.zze.get(i);
    }

    /* renamed from: c */
    public final C1237d0 m7680c(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: p */
    public final int m7681p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final List<C1282g0> m7682q() {
        return this.zze;
    }

    /* renamed from: r */
    public final int m7683r() {
        return this.zze.size();
    }

    /* renamed from: s */
    public final List<C1237d0> m7684s() {
        return this.zzf;
    }

    /* renamed from: t */
    public final int m7685t() {
        return this.zzf.size();
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
