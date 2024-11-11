package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class s0 extends o4<s0, a> implements z5 {
    private static final s0 zzf;
    private static volatile k6<s0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<s0, a> implements z5 {
        private a() {
            super(s0.zzf);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((s0) this.c).b(i);
            return this;
        }

        public final a a(long j) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((s0) this.c).a(j);
            return this;
        }
    }

    static {
        s0 s0Var = new s0();
        zzf = s0Var;
        o4.a((Class<s0>) s0.class, s0Var);
    }

    private s0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    public static a s() {
        return zzf.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new s0();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                k6<s0> k6Var = zzg;
                if (k6Var == null) {
                    synchronized (s0.class) {
                        k6Var = zzg;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzf);
                            zzg = k6Var;
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

    public final int p() {
        return this.zzd;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final long r() {
        return this.zze;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
