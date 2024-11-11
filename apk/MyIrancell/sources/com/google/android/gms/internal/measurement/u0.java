package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class u0 extends o4<u0, a> implements z5 {
    private static final u0 zzf;
    private static volatile k6<u0> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* loaded from: classes.dex */
    public static final class a extends o4.a<u0, a> implements z5 {
        private a() {
            super(u0.zzf);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }
    }

    static {
        u0 u0Var = new u0();
        zzf = u0Var;
        o4.a((Class<u0>) u0.class, u0Var);
    }

    private u0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new u0();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                k6<u0> k6Var = zzg;
                if (k6Var == null) {
                    synchronized (u0.class) {
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
}
