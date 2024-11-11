package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class n0 extends o4<n0, a> implements z5 {
    private static final n0 zzh;
    private static volatile k6<n0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<n0, a> implements z5 {
        private a() {
            super(n0.zzh);
        }

        /* synthetic */ a(m0 m0Var) {
            this();
        }

        public final a a(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((n0) this.c).a(str);
            return this;
        }

        public final boolean n() {
            return ((n0) this.c).p();
        }

        public final boolean o() {
            return ((n0) this.c).q();
        }

        public final boolean p() {
            return ((n0) this.c).r();
        }

        public final int q() {
            return ((n0) this.c).s();
        }

        public final String zza() {
            return ((n0) this.c).zza();
        }
    }

    static {
        n0 n0Var = new n0();
        zzh = n0Var;
        o4.a((Class<n0>) n0.class, n0Var);
    }

    private n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        m0 m0Var = null;
        switch (m0.a[i - 1]) {
            case 1:
                return new n0();
            case 2:
                return new a(m0Var);
            case 3:
                return o4.a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                k6<n0> k6Var = zzi;
                if (k6Var == null) {
                    synchronized (n0.class) {
                        k6Var = zzi;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzh);
                            zzi = k6Var;
                        }
                    }
                }
                return k6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean p() {
        return this.zze;
    }

    public final boolean q() {
        return this.zzf;
    }

    public final boolean r() {
        return (this.zzc & 8) != 0;
    }

    public final int s() {
        return this.zzg;
    }

    public final String zza() {
        return this.zzd;
    }
}
