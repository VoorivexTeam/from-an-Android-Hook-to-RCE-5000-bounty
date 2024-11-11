package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.x0;
import java.util.List;

/* loaded from: classes.dex */
public final class w0 extends o4<w0, a> implements z5 {
    private static final w0 zzd;
    private static volatile k6<w0> zze;
    private x4<x0> zzc = o4.o();

    /* loaded from: classes.dex */
    public static final class a extends o4.a<w0, a> implements z5 {
        private a() {
            super(w0.zzd);
        }

        /* synthetic */ a(q0 q0Var) {
            this();
        }

        public final a a(x0.a aVar) {
            if (this.d) {
                k();
                this.d = false;
            }
            ((w0) this.c).a((x0) ((o4) aVar.i()));
            return this;
        }

        public final x0 a(int i) {
            return ((w0) this.c).b(0);
        }
    }

    static {
        w0 w0Var = new w0();
        zzd = w0Var;
        o4.a((Class<w0>) w0.class, w0Var);
    }

    private w0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(x0 x0Var) {
        x0Var.getClass();
        if (!this.zzc.zza()) {
            this.zzc = o4.a(this.zzc);
        }
        this.zzc.add(x0Var);
    }

    public static a p() {
        return zzd.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.o4
    public final Object a(int i, Object obj, Object obj2) {
        q0 q0Var = null;
        switch (q0.a[i - 1]) {
            case 1:
                return new w0();
            case 2:
                return new a(q0Var);
            case 3:
                return o4.a(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", x0.class});
            case 4:
                return zzd;
            case 5:
                k6<w0> k6Var = zze;
                if (k6Var == null) {
                    synchronized (w0.class) {
                        k6Var = zze;
                        if (k6Var == null) {
                            k6Var = new o4.c<>(zzd);
                            zze = k6Var;
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

    public final x0 b(int i) {
        return this.zzc.get(0);
    }

    public final List<x0> zza() {
        return this.zzc;
    }
}
