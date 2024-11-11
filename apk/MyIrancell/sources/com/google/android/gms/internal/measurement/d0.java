package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends o4<d0, a> implements z5 {
    private static final d0 zzl;
    private static volatile k6<d0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private x4<e0> zzf = o4.o();
    private boolean zzg;
    private f0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<d0, a> implements z5 {
        private a() {
            super(d0.zzl);
        }

        /* synthetic */ a(b0 b0Var) {
            this();
        }

        public final a a(int i, e0 e0Var) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((d0) this.c).a(i, e0Var);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((d0) this.c).a(str);
            return this;
        }

        public final e0 a(int i) {
            return ((d0) this.c).b(i);
        }

        public final int n() {
            return ((d0) this.c).s();
        }

        public final String zza() {
            return ((d0) this.c).q();
        }
    }

    static {
        d0 d0Var = new d0();
        zzl = d0Var;
        o4.a((Class<d0>) d0.class, d0Var);
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, e0 e0Var) {
        e0Var.getClass();
        if (!this.zzf.zza()) {
            this.zzf = o4.a(this.zzf);
        }
        this.zzf.set(i, e0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a z() {
        return zzl.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        b0 b0Var = null;
        switch (b0.a[i - 1]) {
            case 1:
                return new d0();
            case 2:
                return new a(b0Var);
            case 3:
                return o4.a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", e0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                k6<d0> k6Var = zzm;
                if (k6Var == null) {
                    synchronized (d0.class) {
                        k6Var = zzm;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzl);
                            zzm = k6Var;
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

    public final e0 b(int i) {
        return this.zzf.get(i);
    }

    public final int p() {
        return this.zzd;
    }

    public final String q() {
        return this.zze;
    }

    public final List<e0> r() {
        return this.zzf;
    }

    public final int s() {
        return this.zzf.size();
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final f0 u() {
        f0 f0Var = this.zzh;
        return f0Var == null ? f0.y() : f0Var;
    }

    public final boolean v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return (this.zzc & 64) != 0;
    }

    public final boolean y() {
        return this.zzk;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
