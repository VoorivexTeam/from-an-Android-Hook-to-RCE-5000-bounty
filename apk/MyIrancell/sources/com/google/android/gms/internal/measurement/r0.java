package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.z0;

/* loaded from: classes.dex */
public final class r0 extends o4<r0, a> implements z5 {
    private static final r0 zzh;
    private static volatile k6<r0> zzi;
    private int zzc;
    private int zzd;
    private z0 zze;
    private z0 zzf;
    private boolean zzg;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<r0, a> implements z5 {
        private a() {
            super(r0.zzh);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public final a a(int i) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((r0) this.c).b(i);
            return this;
        }

        public final a a(z0.a aVar) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((r0) this.c).a((z0) ((o4) aVar.i()));
            return this;
        }

        public final a a(z0 z0Var) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((r0) this.c).b(z0Var);
            return this;
        }

        public final a a(boolean z) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((r0) this.c).a(z);
            return this;
        }

        public final z0 n() {
            return ((r0) this.c).s();
        }

        public final boolean zza() {
            return ((r0) this.c).r();
        }
    }

    static {
        r0 r0Var = new r0();
        zzh = r0Var;
        o4.a((Class<r0>) r0.class, r0Var);
    }

    private r0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(z0 z0Var) {
        z0Var.getClass();
        this.zze = z0Var;
        this.zzc |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(z0 z0Var) {
        z0Var.getClass();
        this.zzf = z0Var;
        this.zzc |= 4;
    }

    public static a v() {
        return zzh.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new r0();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                k6<r0> k6Var = zzi;
                if (k6Var == null) {
                    synchronized (r0.class) {
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

    public final int p() {
        return this.zzd;
    }

    public final z0 q() {
        z0 z0Var = this.zze;
        return z0Var == null ? z0.x() : z0Var;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final z0 s() {
        z0 z0Var = this.zzf;
        return z0Var == null ? z0.x() : z0Var;
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
