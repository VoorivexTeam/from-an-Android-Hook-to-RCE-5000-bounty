package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.o4;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o0 extends o4<o0, a> implements z5 {
    private static final o0 zzl;
    private static volatile k6<o0> zzm;
    private int zzc;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private String zze = "";
    private x4<p0> zzg = o4.o();
    private x4<n0> zzh = o4.o();
    private x4<c0> zzi = o4.o();
    private String zzj = "";

    /* loaded from: classes.dex */
    public static final class a extends o4.a<o0, a> implements z5 {
        private a() {
            super(o0.zzl);
        }

        /* synthetic */ a(m0 m0Var) {
            this();
        }

        public final n0 a(int i) {
            return ((o0) this.c).b(i);
        }

        public final a a(int i, n0.a aVar) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((o0) this.c).a(i, (n0) ((o4) aVar.i()));
            return this;
        }

        public final List<c0> n() {
            return Collections.unmodifiableList(((o0) this.c).u());
        }

        public final a o() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((o0) this.c).z();
            return this;
        }

        public final int zza() {
            return ((o0) this.c).t();
        }
    }

    static {
        o0 o0Var = new o0();
        zzl = o0Var;
        o4.a((Class<o0>) o0.class, o0Var);
    }

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, n0 n0Var) {
        n0Var.getClass();
        if (!this.zzh.zza()) {
            this.zzh = o4.a(this.zzh);
        }
        this.zzh.set(i, n0Var);
    }

    public static a w() {
        return zzl.k();
    }

    public static o0 x() {
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        this.zzi = o4.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        m0 m0Var = null;
        switch (m0.a[i - 1]) {
            case 1:
                return new o0();
            case 2:
                return new a(m0Var);
            case 3:
                return o4.a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\b\u0003\b\u0007\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", p0.class, "zzh", n0.class, "zzi", c0.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                k6<o0> k6Var = zzm;
                if (k6Var == null) {
                    synchronized (o0.class) {
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

    public final n0 b(int i) {
        return this.zzh.get(i);
    }

    public final long p() {
        return this.zzd;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final List<p0> s() {
        return this.zzg;
    }

    public final int t() {
        return this.zzh.size();
    }

    public final List<c0> u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzk;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
