package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class e0 extends o4<e0, a> implements z5 {
    private static final e0 zzh;
    private static volatile k6<e0> zzi;
    private int zzc;
    private h0 zzd;
    private f0 zze;
    private boolean zzf;
    private String zzg = "";

    /* loaded from: classes.dex */
    public static final class a extends o4.a<e0, a> implements z5 {
        private a() {
            super(e0.zzh);
        }

        /* synthetic */ a(b0 b0Var) {
            this();
        }

        public final a a(String str) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((e0) this.c).a(str);
            return this;
        }
    }

    static {
        e0 e0Var = new e0();
        zzh = e0Var;
        o4.a((Class<e0>) e0.class, e0Var);
    }

    private e0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    public static e0 w() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        b0 b0Var = null;
        switch (b0.a[i - 1]) {
            case 1:
                return new e0();
            case 2:
                return new a(b0Var);
            case 3:
                return o4.a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                k6<e0> k6Var = zzi;
                if (k6Var == null) {
                    synchronized (e0.class) {
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

    public final h0 p() {
        h0 h0Var = this.zzd;
        return h0Var == null ? h0.w() : h0Var;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final f0 r() {
        f0 f0Var = this.zze;
        return f0Var == null ? f0.y() : f0Var;
    }

    public final boolean s() {
        return (this.zzc & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzc & 8) != 0;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean zza() {
        return (this.zzc & 1) != 0;
    }
}
