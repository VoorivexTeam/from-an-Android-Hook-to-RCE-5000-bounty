package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;

/* loaded from: classes.dex */
public final class y0 extends o4<y0, a> implements z5 {
    private static final y0 zzf;
    private static volatile k6<y0> zzg;
    private int zzc;
    private int zzd = 1;
    private x4<u0> zze = o4.o();

    /* loaded from: classes.dex */
    public static final class a extends o4.a<y0, a> implements z5 {
        private a() {
            super(y0.zzf);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum b implements q4 {
        RADS(1),
        PROVISIONING(2);

        private static final t4<b> zzc = new c1();
        private final int zzd;

        b(int i) {
            this.zzd = i;
        }

        public static b zza(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static s4 zzb() {
            return d1.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.q4
        public final int zza() {
            return this.zzd;
        }
    }

    static {
        y0 y0Var = new y0();
        zzf = y0Var;
        o4.a((Class<y0>) y0.class, y0Var);
    }

    private y0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new y0();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzc", "zzd", b.zzb(), "zze", u0.class});
            case 4:
                return zzf;
            case 5:
                k6<y0> k6Var = zzg;
                if (k6Var == null) {
                    synchronized (y0.class) {
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
