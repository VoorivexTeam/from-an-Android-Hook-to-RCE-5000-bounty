package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1406o4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
/* loaded from: classes.dex */
public final class C1237d0 extends AbstractC1406o4<C1237d0, a> implements InterfaceC1561z5 {
    private static final C1237d0 zzl;
    private static volatile InterfaceC1348k6<C1237d0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private InterfaceC1532x4<C1252e0> zzf = AbstractC1406o4.m8089o();
    private boolean zzg;
    private C1267f0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* renamed from: com.google.android.gms.internal.measurement.d0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1406o4.a<C1237d0, a> implements InterfaceC1561z5 {
        private a() {
            super(C1237d0.zzl);
        }

        /* synthetic */ a(C1207b0 c1207b0) {
            this();
        }

        /* renamed from: a */
        public final a m7721a(int i, C1252e0 c1252e0) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1237d0) this.f6791c).m7705a(i, c1252e0);
            return this;
        }

        /* renamed from: a */
        public final a m7722a(String str) {
            if (this.f6792d) {
                m8106k();
                this.f6792d = false;
            }
            ((C1237d0) this.f6791c).m7708a(str);
            return this;
        }

        /* renamed from: a */
        public final C1252e0 m7723a(int i) {
            return ((C1237d0) this.f6791c).m7710b(i);
        }

        /* renamed from: n */
        public final int m7724n() {
            return ((C1237d0) this.f6791c).m7714s();
        }

        public final String zza() {
            return ((C1237d0) this.f6791c).m7712q();
        }
    }

    static {
        C1237d0 c1237d0 = new C1237d0();
        zzl = c1237d0;
        AbstractC1406o4.m8085a((Class<C1237d0>) C1237d0.class, c1237d0);
    }

    private C1237d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7705a(int i, C1252e0 c1252e0) {
        c1252e0.getClass();
        if (!this.zzf.zza()) {
            this.zzf = AbstractC1406o4.m8082a(this.zzf);
        }
        this.zzf.set(i, c1252e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m7708a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* renamed from: z */
    public static a m7709z() {
        return zzl.m8098k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1406o4
    /* renamed from: a */
    public final Object mo7518a(int i, Object obj, Object obj2) {
        C1207b0 c1207b0 = null;
        switch (C1207b0.f6508a[i - 1]) {
            case 1:
                return new C1237d0();
            case 2:
                return new a(c1207b0);
            case 3:
                return AbstractC1406o4.m8083a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C1252e0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                InterfaceC1348k6<C1237d0> interfaceC1348k6 = zzm;
                if (interfaceC1348k6 == null) {
                    synchronized (C1237d0.class) {
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
    public final C1252e0 m7710b(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: p */
    public final int m7711p() {
        return this.zzd;
    }

    /* renamed from: q */
    public final String m7712q() {
        return this.zze;
    }

    /* renamed from: r */
    public final List<C1252e0> m7713r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final int m7714s() {
        return this.zzf.size();
    }

    /* renamed from: t */
    public final boolean m7715t() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: u */
    public final C1267f0 m7716u() {
        C1267f0 c1267f0 = this.zzh;
        return c1267f0 == null ? C1267f0.m7804y() : c1267f0;
    }

    /* renamed from: v */
    public final boolean m7717v() {
        return this.zzi;
    }

    /* renamed from: w */
    public final boolean m7718w() {
        return this.zzj;
    }

    /* renamed from: x */
    public final boolean m7719x() {
        return (this.zzc & 64) != 0;
    }

    /* renamed from: y */
    public final boolean m7720y() {
        return this.zzk;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
