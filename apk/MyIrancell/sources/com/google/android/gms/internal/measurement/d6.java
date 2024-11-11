package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class d6<T> implements q6<T> {
    private final x5 a;
    private final i7<?, ?> b;
    private final boolean c;
    private final c4<?> d;

    private d6(i7<?, ?> i7Var, c4<?> c4Var, x5 x5Var) {
        this.b = i7Var;
        this.c = c4Var.a(x5Var);
        this.d = c4Var;
        this.a = x5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> d6<T> a(i7<?, ?> i7Var, c4<?> c4Var, x5 x5Var) {
        return new d6<>(i7Var, c4Var, x5Var);
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final int a(T t) {
        int hashCode = this.b.a(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void a(T t, b8 b8Var) {
        Iterator<Map.Entry<?, Object>> c = this.d.a(t).c();
        while (c.hasNext()) {
            Map.Entry<?, Object> next = c.next();
            f4 f4Var = (f4) next.getKey();
            if (f4Var.b() != c8.MESSAGE || f4Var.a() || f4Var.c()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            b8Var.a(f4Var.zza(), next instanceof d5 ? ((d5) next).a().b() : next.getValue());
        }
        i7<?, ?> i7Var = this.b;
        i7Var.b((i7<?, ?>) i7Var.a(t), b8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.c3 r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.o4 r0 = (com.google.android.gms.internal.measurement.o4) r0
            com.google.android.gms.internal.measurement.h7 r1 = r0.zzb
            com.google.android.gms.internal.measurement.h7 r2 = com.google.android.gms.internal.measurement.h7.d()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.h7 r1 = com.google.android.gms.internal.measurement.h7.e()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.o4$b r10 = (com.google.android.gms.internal.measurement.o4.b) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.d3.a(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.c4<?> r12 = r9.d
            com.google.android.gms.internal.measurement.a4 r0 = r14.d
            com.google.android.gms.internal.measurement.x5 r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.a(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.o4$d r0 = (com.google.android.gms.internal.measurement.o4.d) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.d3.a(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.n6.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.d3.a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.d3.a(r11, r4, r14)
            int r5 = r14.a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.d3.e(r11, r4, r14)
            java.lang.Object r2 = r14.c
            com.google.android.gms.internal.measurement.h3 r2 = (com.google.android.gms.internal.measurement.h3) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.n6.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.d3.a(r11, r4, r14)
            int r12 = r14.a
            com.google.android.gms.internal.measurement.c4<?> r0 = r9.d
            com.google.android.gms.internal.measurement.a4 r5 = r14.d
            com.google.android.gms.internal.measurement.x5 r6 = r9.a
            java.lang.Object r0 = r0.a(r5, r6, r12)
            com.google.android.gms.internal.measurement.o4$d r0 = (com.google.android.gms.internal.measurement.o4.d) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.d3.a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.a(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.w4 r10 = com.google.android.gms.internal.measurement.w4.e()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d6.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.c3):void");
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final boolean a(T t, T t2) {
        if (!this.b.a(t).equals(this.b.a(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.a(t).equals(this.d.a(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void b(T t, T t2) {
        s6.a(this.b, t, t2);
        if (this.c) {
            s6.a(this.d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final boolean b(T t) {
        return this.d.a(t).e();
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void c(T t) {
        this.b.b(t);
        this.d.c(t);
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final int d(T t) {
        i7<?, ?> i7Var = this.b;
        int c = i7Var.c(i7Var.a(t)) + 0;
        return this.c ? c + this.d.a(t).f() : c;
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final T zza() {
        return (T) this.a.j().d();
    }
}
