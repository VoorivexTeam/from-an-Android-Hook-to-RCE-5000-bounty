package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class b1 extends o4<b1, a> implements z5 {
    private static final b1 zzj;
    private static volatile k6<b1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<b1, a> implements z5 {
        private a() {
            super(b1.zzj);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public final a a(double d) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((b1) this.c).a(d);
            return this;
        }

        public final a a(long j) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((b1) this.c).a(j);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((b1) this.c).a(str);
            return this;
        }

        public final a b(long j) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((b1) this.c).b(j);
            return this;
        }

        public final a b(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((b1) this.c).b(str);
            return this;
        }

        public final a n() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((b1) this.c).A();
            return this;
        }

        public final a o() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((b1) this.c).B();
            return this;
        }

        public final a zza() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((b1) this.c).z();
            return this;
        }
    }

    static {
        b1 b1Var = new b1();
        zzj = b1Var;
        o4.a((Class<b1>) b1.class, b1Var);
    }

    private b1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        this.zzc &= -9;
        this.zzg = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(double d) {
        this.zzc |= 32;
        this.zzi = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 1;
        this.zzd = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    public static a x() {
        return zzj.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new b1();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                k6<b1> k6Var = zzk;
                if (k6Var == null) {
                    synchronized (b1.class) {
                        k6Var = zzk;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzj);
                            zzk = k6Var;
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

    public final long p() {
        return this.zzd;
    }

    public final String q() {
        return this.zze;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final String s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final long u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzc & 32) != 0;
    }

    public final double w() {
        return this.zzi;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
