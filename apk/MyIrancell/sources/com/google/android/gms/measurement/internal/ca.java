package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ca extends p9 {
    private String d;
    private Set<Integer> e;
    private Map<Integer, ea> f;
    private Long g;
    private Long h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ca(o9 o9Var) {
        super(o9Var);
    }

    private final ea a(int i) {
        if (this.f.containsKey(Integer.valueOf(i))) {
            return this.f.get(Integer.valueOf(i));
        }
        ea eaVar = new ea(this, this.d, null);
        this.f.put(Integer.valueOf(i), eaVar);
        return eaVar;
    }

    private final boolean a(int i, int i2) {
        if (this.f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return ea.a(this.f.get(Integer.valueOf(i))).get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06f0, code lost:
    
        r8 = k().w();
        r11 = com.google.android.gms.measurement.internal.f4.a(r52.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0702, code lost:
    
        if (r9.zza() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0704, code lost:
    
        r9 = java.lang.Integer.valueOf(r9.p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x070e, code lost:
    
        r8.a("Invalid property filter ID. appId, id", r11, java.lang.String.valueOf(r9));
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x070d, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Long, long, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Long, long, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v17, types: [long, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v22, types: [long, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.r0> a(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.t0> r54, java.util.List<com.google.android.gms.internal.measurement.b1> r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ca.a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.p9
    protected final boolean t() {
        return false;
    }
}
