package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d6 */
/* loaded from: classes.dex */
final class C1243d6<T> implements InterfaceC1436q6<T> {

    /* renamed from: a */
    private final InterfaceC1533x5 f6566a;

    /* renamed from: b */
    private final AbstractC1319i7<?, ?> f6567b;

    /* renamed from: c */
    private final boolean f6568c;

    /* renamed from: d */
    private final AbstractC1226c4<?> f6569d;

    private C1243d6(AbstractC1319i7<?, ?> abstractC1319i7, AbstractC1226c4<?> abstractC1226c4, InterfaceC1533x5 interfaceC1533x5) {
        this.f6567b = abstractC1319i7;
        this.f6568c = abstractC1226c4.mo7580a(interfaceC1533x5);
        this.f6569d = abstractC1226c4;
        this.f6566a = interfaceC1533x5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> C1243d6<T> m7767a(AbstractC1319i7<?, ?> abstractC1319i7, AbstractC1226c4<?> abstractC1226c4, InterfaceC1533x5 interfaceC1533x5) {
        return new C1243d6<>(abstractC1319i7, abstractC1226c4, interfaceC1533x5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: a */
    public final int mo7621a(T t) {
        int hashCode = this.f6567b.mo7920a(t).hashCode();
        return this.f6568c ? (hashCode * 53) + this.f6569d.mo7577a(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: a */
    public final void mo7623a(T t, InterfaceC1215b8 interfaceC1215b8) {
        Iterator<Map.Entry<?, Object>> m7762c = this.f6569d.mo7577a(t).m7762c();
        while (m7762c.hasNext()) {
            Map.Entry<?, Object> next = m7762c.next();
            InterfaceC1271f4 interfaceC1271f4 = (InterfaceC1271f4) next.getKey();
            if (interfaceC1271f4.mo7825b() != EnumC1230c8.MESSAGE || interfaceC1271f4.mo7824a() || interfaceC1271f4.mo7826c()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            interfaceC1215b8.mo7638a(interfaceC1271f4.zza(), next instanceof C1242d5 ? ((C1242d5) next).m7766a().m7830b() : next.getValue());
        }
        AbstractC1319i7<?, ?> abstractC1319i7 = this.f6567b;
        abstractC1319i7.mo7926b((AbstractC1319i7<?, ?>) abstractC1319i7.mo7920a(t), interfaceC1215b8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7624a(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.C1225c3 r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.o4 r0 = (com.google.android.gms.internal.measurement.AbstractC1406o4) r0
            com.google.android.gms.internal.measurement.h7 r1 = r0.zzb
            com.google.android.gms.internal.measurement.h7 r2 = com.google.android.gms.internal.measurement.C1304h7.m7886d()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.h7 r1 = com.google.android.gms.internal.measurement.C1304h7.m7887e()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.o4$b r10 = (com.google.android.gms.internal.measurement.AbstractC1406o4.b) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.C1240d3.m7738a(r11, r12, r14)
            int r2 = r14.f6541a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.c4<?> r12 = r9.f6569d
            com.google.android.gms.internal.measurement.a4 r0 = r14.f6544d
            com.google.android.gms.internal.measurement.x5 r3 = r9.f6566a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo7578a(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.o4$d r0 = (com.google.android.gms.internal.measurement.AbstractC1406o4.d) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.C1240d3.m7731a(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.C1393n6.m8049a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.C1240d3.m7730a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.C1240d3.m7738a(r11, r4, r14)
            int r5 = r14.f6541a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.C1240d3.m7746e(r11, r4, r14)
            java.lang.Object r2 = r14.f6543c
            com.google.android.gms.internal.measurement.h3 r2 = (com.google.android.gms.internal.measurement.AbstractC1300h3) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.C1393n6.m8049a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.C1240d3.m7738a(r11, r4, r14)
            int r12 = r14.f6541a
            com.google.android.gms.internal.measurement.c4<?> r0 = r9.f6569d
            com.google.android.gms.internal.measurement.a4 r5 = r14.f6544d
            com.google.android.gms.internal.measurement.x5 r6 = r9.f6566a
            java.lang.Object r0 = r0.mo7578a(r5, r6, r12)
            com.google.android.gms.internal.measurement.o4$d r0 = (com.google.android.gms.internal.measurement.AbstractC1406o4.d) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.C1240d3.m7730a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m7889a(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.w4 r10 = com.google.android.gms.internal.measurement.C1518w4.m8634e()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1243d6.mo7624a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.c3):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: a */
    public final boolean mo7625a(T t, T t2) {
        if (!this.f6567b.mo7920a(t).equals(this.f6567b.mo7920a(t2))) {
            return false;
        }
        if (this.f6568c) {
            return this.f6569d.mo7577a(t).equals(this.f6569d.mo7577a(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: b */
    public final void mo7626b(T t, T t2) {
        C1464s6.m8384a(this.f6567b, t, t2);
        if (this.f6568c) {
            C1464s6.m8383a(this.f6569d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: b */
    public final boolean mo7627b(T t) {
        return this.f6569d.mo7577a(t).m7764e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: c */
    public final void mo7628c(T t) {
        this.f6567b.mo7925b(t);
        this.f6569d.mo7582c(t);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    /* renamed from: d */
    public final int mo7629d(T t) {
        AbstractC1319i7<?, ?> abstractC1319i7 = this.f6567b;
        int mo7928c = abstractC1319i7.mo7928c(abstractC1319i7.mo7920a(t)) + 0;
        return this.f6568c ? mo7928c + this.f6569d.mo7577a(t).m7765f() : mo7928c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1436q6
    public final T zza() {
        return (T) this.f6566a.mo8097j().mo7536d();
    }
}
