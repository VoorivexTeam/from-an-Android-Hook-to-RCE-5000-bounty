package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.v0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t0 extends o4<t0, a> implements z5 {
    private static final t0 zzi;
    private static volatile k6<t0> zzj;
    private int zzc;
    private x4<v0> zzd = o4.o();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<t0, a> implements z5 {
        private a() {
            super(t0.zzi);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public final a a(int i, v0.a aVar) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).a(i, (v0) ((o4) aVar.i()));
            return this;
        }

        public final a a(int i, v0 v0Var) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).a(i, v0Var);
            return this;
        }

        public final a a(long j) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).a(j);
            return this;
        }

        public final a a(v0.a aVar) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).a((v0) ((o4) aVar.i()));
            return this;
        }

        public final a a(v0 v0Var) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).a(v0Var);
            return this;
        }

        public final a a(Iterable<? extends v0> iterable) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).a(iterable);
            return this;
        }

        public final a a(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).a(str);
            return this;
        }

        public final v0 a(int i) {
            return ((t0) this.c).b(i);
        }

        public final a b(int i) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).c(i);
            return this;
        }

        public final a b(long j) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).b(j);
            return this;
        }

        public final int n() {
            return ((t0) this.c).p();
        }

        public final a o() {
            if (this.d) {
                k();
                this.d = false;
            }
            ((t0) this.c).A();
            return this;
        }

        public final String p() {
            return ((t0) this.c).q();
        }

        public final long q() {
            return ((t0) this.c).s();
        }

        public final long r() {
            return ((t0) this.c).u();
        }

        public final List<v0> zza() {
            return Collections.unmodifiableList(((t0) this.c).zza());
        }
    }

    static {
        t0 t0Var = new t0();
        zzi = t0Var;
        o4.a((Class<t0>) t0.class, t0Var);
    }

    private t0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        this.zzd = o4.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, v0 v0Var) {
        v0Var.getClass();
        z();
        this.zzd.set(i, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 2;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(v0 v0Var) {
        v0Var.getClass();
        z();
        this.zzd.add(v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Iterable<? extends v0> iterable) {
        z();
        x2.a(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long j) {
        this.zzc |= 4;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i) {
        z();
        this.zzd.remove(i);
    }

    public static a x() {
        return zzi.k();
    }

    private final void z() {
        if (this.zzd.zza()) {
            return;
        }
        this.zzd = o4.a(this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new t0();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzc", "zzd", v0.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                k6<t0> k6Var = zzj;
                if (k6Var == null) {
                    synchronized (t0.class) {
                        k6Var = zzj;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzi);
                            zzj = k6Var;
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

    public final v0 b(int i) {
        return this.zzd.get(i);
    }

    public final int p() {
        return this.zzd.size();
    }

    public final String q() {
        return this.zze;
    }

    public final boolean r() {
        return (this.zzc & 2) != 0;
    }

    public final long s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzc & 4) != 0;
    }

    public final long u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzc & 8) != 0;
    }

    public final int w() {
        return this.zzh;
    }

    public final List<v0> zza() {
        return this.zzd;
    }
}
