package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class p0 extends o4<p0, a> implements z5 {
    private static final p0 zzf;
    private static volatile k6<p0> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* loaded from: classes.dex */
    public static final class a extends o4.a<p0, a> implements z5 {
        private a() {
            super(p0.zzf);
        }

        /* synthetic */ a(m0 m0Var) {
            this();
        }
    }

    static {
        p0 p0Var = new p0();
        zzf = p0Var;
        o4.a((Class<p0>) p0.class, p0Var);
    }

    private p0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        m0 m0Var = null;
        switch (m0.a[i - 1]) {
            case 1:
                return new p0();
            case 2:
                return new a(m0Var);
            case 3:
                return o4.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                k6<p0> k6Var = zzg;
                if (k6Var == null) {
                    synchronized (p0.class) {
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

    public final String p() {
        return this.zze;
    }

    public final String zza() {
        return this.zzd;
    }
}
