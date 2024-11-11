package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.util.List;

/* loaded from: classes.dex */
public final class v0 extends o4<v0, a> implements z5 {
    private static final v0 zzj;
    private static volatile k6<v0> zzk;
    private int zzc;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private x4<v0> zzi = o4.o();

    /* loaded from: classes.dex */
    public static final class a extends o4.a<v0, a> implements z5 {
        private a() {
            super(v0.zzj);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public final a a(double d) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((v0) this.c).a(d);
            return this;
        }

        public final a a(long j) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((v0) this.c).a(j);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((v0) this.c).a(str);
            return this;
        }

        public final a b(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((v0) this.c).b(str);
            return this;
        }

        public final a n() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((v0) this.c).B();
            return this;
        }

        public final a o() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((v0) this.c).C();
            return this;
        }

        public final a zza() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((v0) this.c).A();
            return this;
        }
    }

    static {
        v0 v0Var = new v0();
        zzj = v0Var;
        o4.a((Class<v0>) v0.class, v0Var);
    }

    private v0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        this.zzc &= -5;
        this.zzf = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(double d) {
        this.zzc |= 16;
        this.zzh = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a y() {
        return zzj.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new v0();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", v0.class});
            case 4:
                return zzj;
            case 5:
                k6<v0> k6Var = zzk;
                if (k6Var == null) {
                    synchronized (v0.class) {
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

    public final String p() {
        return this.zzd;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzc & 4) != 0;
    }

    public final long t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzc & 16) != 0;
    }

    public final double v() {
        return this.zzh;
    }

    public final List<v0> w() {
        return this.zzi;
    }

    public final int x() {
        return this.zzi.size();
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
