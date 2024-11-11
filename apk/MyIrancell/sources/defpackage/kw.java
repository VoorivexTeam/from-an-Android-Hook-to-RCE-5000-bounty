package defpackage;

/* loaded from: classes.dex */
public final class kw implements dw {
    @Override // defpackage.dw
    public fw a(uv uvVar) {
        return a(uvVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[LOOP:0: B:23:0x005b->B:24:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // defpackage.dw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.fw a(defpackage.uv r6, java.util.Map<defpackage.wv, ?> r7) {
        /*
            r5 = this;
            mw r0 = new mw
            hz r6 = r6.a()
            r0.<init>(r6)
            r6 = 0
            r1 = 0
            jw r2 = r0.a(r6)     // Catch: defpackage.xv -> L25 defpackage.aw -> L2b
            hw[] r3 = r2.b()     // Catch: defpackage.xv -> L25 defpackage.aw -> L2b
            lw r4 = new lw     // Catch: defpackage.xv -> L21 defpackage.aw -> L23
            r4.<init>()     // Catch: defpackage.xv -> L21 defpackage.aw -> L23
            kz r2 = r4.a(r2)     // Catch: defpackage.xv -> L21 defpackage.aw -> L23
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L2f
        L21:
            r2 = move-exception
            goto L27
        L23:
            r2 = move-exception
            goto L2d
        L25:
            r2 = move-exception
            r3 = r1
        L27:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L2f
        L2b:
            r2 = move-exception
            r3 = r1
        L2d:
            r4 = r3
            r3 = r1
        L2f:
            if (r1 != 0) goto L4e
            r1 = 1
            jw r0 = r0.a(r1)     // Catch: defpackage.xv -> L44 defpackage.aw -> L46
            hw[] r4 = r0.b()     // Catch: defpackage.xv -> L44 defpackage.aw -> L46
            lw r1 = new lw     // Catch: defpackage.xv -> L44 defpackage.aw -> L46
            r1.<init>()     // Catch: defpackage.xv -> L44 defpackage.aw -> L46
            kz r1 = r1.a(r0)     // Catch: defpackage.xv -> L44 defpackage.aw -> L46
            goto L4e
        L44:
            r6 = move-exception
            goto L47
        L46:
            r6 = move-exception
        L47:
            if (r2 != 0) goto L4d
            if (r3 == 0) goto L4c
            throw r3
        L4c:
            throw r6
        L4d:
            throw r2
        L4e:
            if (r7 == 0) goto L65
            wv r0 = defpackage.wv.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r7 = r7.get(r0)
            iw r7 = (defpackage.iw) r7
            if (r7 == 0) goto L65
            int r0 = r4.length
        L5b:
            if (r6 >= r0) goto L65
            r2 = r4[r6]
            r7.a(r2)
            int r6 = r6 + 1
            goto L5b
        L65:
            fw r6 = new fw
            java.lang.String r7 = r1.g()
            byte[] r0 = r1.d()
            sv r2 = defpackage.sv.AZTEC
            r6.<init>(r7, r0, r4, r2)
            java.util.List r7 = r1.a()
            if (r7 == 0) goto L7f
            gw r0 = defpackage.gw.BYTE_SEGMENTS
            r6.a(r0, r7)
        L7f:
            java.lang.String r7 = r1.b()
            if (r7 == 0) goto L8a
            gw r0 = defpackage.gw.ERROR_CORRECTION_LEVEL
            r6.a(r0, r7)
        L8a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw.a(uv, java.util.Map):fw");
    }

    @Override // defpackage.dw
    public void a() {
    }
}
