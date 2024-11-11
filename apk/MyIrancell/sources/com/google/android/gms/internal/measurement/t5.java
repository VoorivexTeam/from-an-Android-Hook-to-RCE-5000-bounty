package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class t5 implements u5 {
    @Override // com.google.android.gms.internal.measurement.u5
    public final int a(int i, Object obj, Object obj2) {
        r5 r5Var = (r5) obj;
        if (r5Var.isEmpty()) {
            return 0;
        }
        Iterator it = r5Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.u5
    public final Object a(Object obj, Object obj2) {
        r5 r5Var = (r5) obj;
        r5 r5Var2 = (r5) obj2;
        if (!r5Var2.isEmpty()) {
            if (!r5Var.c()) {
                r5Var = r5Var.a();
            }
            r5Var.a(r5Var2);
        }
        return r5Var;
    }

    @Override // com.google.android.gms.internal.measurement.u5
    public final Map<?, ?> a(Object obj) {
        return (r5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.u5
    public final boolean b(Object obj) {
        return !((r5) obj).c();
    }

    @Override // com.google.android.gms.internal.measurement.u5
    public final Map<?, ?> c(Object obj) {
        return (r5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.u5
    public final s5<?, ?> d(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.u5
    public final Object e(Object obj) {
        return r5.zza().a();
    }

    @Override // com.google.android.gms.internal.measurement.u5
    public final Object f(Object obj) {
        ((r5) obj).b();
        return obj;
    }
}
