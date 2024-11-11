package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.hc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ea {
    private String a;
    private boolean b;
    private com.google.android.gms.internal.measurement.z0 c;
    private BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    private final /* synthetic */ ca h;

    private ea(ca caVar, String str) {
        this.h = caVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new defpackage.c0();
        this.g = new defpackage.c0();
    }

    private ea(ca caVar, String str, com.google.android.gms.internal.measurement.z0 z0Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.h = caVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new defpackage.c0();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.g.put(num, arrayList);
            }
        }
        this.b = false;
        this.c = z0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ea(ca caVar, String str, com.google.android.gms.internal.measurement.z0 z0Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, fa faVar) {
        this(caVar, str, z0Var, bitSet, bitSet2, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ea(ca caVar, String str, fa faVar) {
        this(caVar, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ BitSet a(ea eaVar) {
        return eaVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e9, code lost:
    
        if (r17.h.m().d(r17.a, com.google.android.gms.measurement.internal.o.s0) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.r0 a(int r18, java.util.List<java.lang.Integer> r19) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ea.a(int, java.util.List):com.google.android.gms.internal.measurement.r0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ja jaVar) {
        int a = jaVar.a();
        Boolean bool = jaVar.c;
        if (bool != null) {
            this.e.set(a, bool.booleanValue());
        }
        Boolean bool2 = jaVar.d;
        if (bool2 != null) {
            this.d.set(a, bool2.booleanValue());
        }
        if (jaVar.e != null) {
            Long l = this.f.get(Integer.valueOf(a));
            long longValue = jaVar.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (jaVar.f != null) {
            List<Long> list = this.g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList<>();
                this.g.put(Integer.valueOf(a), list);
            }
            if (hc.a() && this.h.m().d(this.a, o.s0) && jaVar.b()) {
                list.clear();
            }
            if (com.google.android.gms.internal.measurement.q9.a() && this.h.m().d(this.a, o.w0) && jaVar.c()) {
                list.clear();
            }
            if (!com.google.android.gms.internal.measurement.q9.a() || !this.h.m().d(this.a, o.w0)) {
                list.add(Long.valueOf(jaVar.f.longValue() / 1000));
                return;
            }
            long longValue2 = jaVar.f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }
}
