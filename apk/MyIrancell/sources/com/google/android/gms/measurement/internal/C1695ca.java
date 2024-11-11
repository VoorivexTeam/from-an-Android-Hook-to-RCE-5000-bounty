package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ca */
/* loaded from: classes.dex */
public final class C1695ca extends AbstractC1849p9 {

    /* renamed from: d */
    private String f7438d;

    /* renamed from: e */
    private Set<Integer> f7439e;

    /* renamed from: f */
    private Map<Integer, C1719ea> f7440f;

    /* renamed from: g */
    private Long f7441g;

    /* renamed from: h */
    private Long f7442h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1695ca(C1838o9 c1838o9) {
        super(c1838o9);
    }

    /* renamed from: a */
    private final C1719ea m9126a(int i) {
        if (this.f7440f.containsKey(Integer.valueOf(i))) {
            return this.f7440f.get(Integer.valueOf(i));
        }
        C1719ea c1719ea = new C1719ea(this, this.f7438d, null);
        this.f7440f.put(Integer.valueOf(i), c1719ea);
        return c1719ea;
    }

    /* renamed from: a */
    private final boolean m9127a(int i, int i2) {
        if (this.f7440f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return C1719ea.m9289a(this.f7440f.get(Integer.valueOf(i))).get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06f0, code lost:
    
        r8 = mo9324k().m9312w();
        r11 = com.google.android.gms.measurement.internal.C1725f4.m9298a(r52.f7438d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0702, code lost:
    
        if (r9.zza() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0704, code lost:
    
        r9 = java.lang.Integer.valueOf(r9.m7838p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x070e, code lost:
    
        r8.m9367a("Invalid property filter ID. appId, id", r11, java.lang.String.valueOf(r9));
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x070d, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v17, types: [long, java.lang.Long, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v24, types: [long, java.lang.Long, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v17, types: [long, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v22, types: [long, java.lang.String] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.C1444r0> m9128a(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.C1472t0> r54, java.util.List<com.google.android.gms.internal.measurement.C1208b1> r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1695ca.m9128a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1849p9
    /* renamed from: t */
    protected final boolean mo9129t() {
        return false;
    }
}
