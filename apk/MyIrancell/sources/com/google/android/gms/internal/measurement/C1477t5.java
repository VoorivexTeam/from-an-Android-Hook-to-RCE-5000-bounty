package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t5 */
/* loaded from: classes.dex */
final class C1477t5 implements InterfaceC1491u5 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1491u5
    /* renamed from: a */
    public final int mo8479a(int i, Object obj, Object obj2) {
        C1449r5 c1449r5 = (C1449r5) obj;
        if (c1449r5.isEmpty()) {
            return 0;
        }
        Iterator it = c1449r5.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1491u5
    /* renamed from: a */
    public final Object mo8480a(Object obj, Object obj2) {
        C1449r5 c1449r5 = (C1449r5) obj;
        C1449r5 c1449r52 = (C1449r5) obj2;
        if (!c1449r52.isEmpty()) {
            if (!c1449r5.m8302c()) {
                c1449r5 = c1449r5.m8299a();
            }
            c1449r5.m8300a(c1449r52);
        }
        return c1449r5;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1491u5
    /* renamed from: a */
    public final Map<?, ?> mo8481a(Object obj) {
        return (C1449r5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1491u5
    /* renamed from: b */
    public final boolean mo8482b(Object obj) {
        return !((C1449r5) obj).m8302c();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1491u5
    /* renamed from: c */
    public final Map<?, ?> mo8483c(Object obj) {
        return (C1449r5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1491u5
    /* renamed from: d */
    public final C1463s5<?, ?> mo8484d(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1491u5
    /* renamed from: e */
    public final Object mo8485e(Object obj) {
        return C1449r5.zza().m8299a();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1491u5
    /* renamed from: f */
    public final Object mo8486f(Object obj) {
        ((C1449r5) obj).m8301b();
        return obj;
    }
}
