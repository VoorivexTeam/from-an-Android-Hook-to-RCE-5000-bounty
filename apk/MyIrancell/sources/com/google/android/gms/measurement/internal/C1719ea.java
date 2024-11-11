package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1309hc;
import com.google.android.gms.internal.measurement.C1439q9;
import com.google.android.gms.internal.measurement.C1556z0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import p000.C0500c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ea */
/* loaded from: classes.dex */
public final class C1719ea {

    /* renamed from: a */
    private String f7526a;

    /* renamed from: b */
    private boolean f7527b;

    /* renamed from: c */
    private C1556z0 f7528c;

    /* renamed from: d */
    private BitSet f7529d;

    /* renamed from: e */
    private BitSet f7530e;

    /* renamed from: f */
    private Map<Integer, Long> f7531f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f7532g;

    /* renamed from: h */
    private final /* synthetic */ C1695ca f7533h;

    private C1719ea(C1695ca c1695ca, String str) {
        this.f7533h = c1695ca;
        this.f7526a = str;
        this.f7527b = true;
        this.f7529d = new BitSet();
        this.f7530e = new BitSet();
        this.f7531f = new C0500c0();
        this.f7532g = new C0500c0();
    }

    private C1719ea(C1695ca c1695ca, String str, C1556z0 c1556z0, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f7533h = c1695ca;
        this.f7526a = str;
        this.f7529d = bitSet;
        this.f7530e = bitSet2;
        this.f7531f = map;
        this.f7532g = new C0500c0();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f7532g.put(num, arrayList);
            }
        }
        this.f7527b = false;
        this.f7528c = c1556z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1719ea(C1695ca c1695ca, String str, C1556z0 c1556z0, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C1731fa c1731fa) {
        this(c1695ca, str, c1556z0, bitSet, bitSet2, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1719ea(C1695ca c1695ca, String str, C1731fa c1731fa) {
        this(c1695ca, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ BitSet m9289a(C1719ea c1719ea) {
        return c1719ea.f7529d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e9, code lost:
    
        if (r17.f7533h.m9326m().m9486d(r17.f7526a, com.google.android.gms.measurement.internal.C1828o.f7887s0) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.C1444r0 m9290a(int r18, java.util.List<java.lang.Integer> r19) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1719ea.m9290a(int, java.util.List):com.google.android.gms.internal.measurement.r0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9291a(AbstractC1779ja abstractC1779ja) {
        int mo9357a = abstractC1779ja.mo9357a();
        Boolean bool = abstractC1779ja.f7690c;
        if (bool != null) {
            this.f7530e.set(mo9357a, bool.booleanValue());
        }
        Boolean bool2 = abstractC1779ja.f7691d;
        if (bool2 != null) {
            this.f7529d.set(mo9357a, bool2.booleanValue());
        }
        if (abstractC1779ja.f7692e != null) {
            Long l = this.f7531f.get(Integer.valueOf(mo9357a));
            long longValue = abstractC1779ja.f7692e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f7531f.put(Integer.valueOf(mo9357a), Long.valueOf(longValue));
            }
        }
        if (abstractC1779ja.f7693f != null) {
            List<Long> list = this.f7532g.get(Integer.valueOf(mo9357a));
            if (list == null) {
                list = new ArrayList<>();
                this.f7532g.put(Integer.valueOf(mo9357a), list);
            }
            if (C1309hc.m7901a() && this.f7533h.m9326m().m9486d(this.f7526a, C1828o.f7887s0) && abstractC1779ja.mo9359b()) {
                list.clear();
            }
            if (C1439q9.m8248a() && this.f7533h.m9326m().m9486d(this.f7526a, C1828o.f7895w0) && abstractC1779ja.mo9360c()) {
                list.clear();
            }
            if (!C1439q9.m8248a() || !this.f7533h.m9326m().m9486d(this.f7526a, C1828o.f7895w0)) {
                list.add(Long.valueOf(abstractC1779ja.f7693f.longValue() / 1000));
                return;
            }
            long longValue2 = abstractC1779ja.f7693f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }
}
