package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class i5 extends g5 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private i5() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> a(Object obj, long j, int i) {
        List<L> a;
        e5 e5Var;
        List<L> b = b(obj, j);
        if (!b.isEmpty()) {
            if (c.isAssignableFrom(b.getClass())) {
                ArrayList arrayList = new ArrayList(b.size() + i);
                arrayList.addAll(b);
                e5Var = arrayList;
            } else if (b instanceof j7) {
                e5 e5Var2 = new e5(b.size() + i);
                e5Var2.addAll((j7) b);
                e5Var = e5Var2;
            } else {
                if (!(b instanceof j6) || !(b instanceof x4)) {
                    return b;
                }
                x4 x4Var = (x4) b;
                if (x4Var.zza()) {
                    return b;
                }
                a = x4Var.a(b.size() + i);
            }
            o7.a(obj, j, e5Var);
            return e5Var;
        }
        a = b instanceof h5 ? new e5(i) : ((b instanceof j6) && (b instanceof x4)) ? ((x4) b).a(i) : new ArrayList<>(i);
        o7.a(obj, j, a);
        return a;
    }

    private static <E> List<E> b(Object obj, long j) {
        return (List) o7.f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.g5
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) o7.f(obj, j);
        if (list instanceof h5) {
            unmodifiableList = ((h5) list).c();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof j6) && (list instanceof x4)) {
                x4 x4Var = (x4) list;
                if (x4Var.zza()) {
                    x4Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        o7.a(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.g5
    public final <E> void a(Object obj, Object obj2, long j) {
        List b = b(obj2, j);
        List a = a(obj, j, b.size());
        int size = a.size();
        int size2 = b.size();
        if (size > 0 && size2 > 0) {
            a.addAll(b);
        }
        if (size > 0) {
            b = a;
        }
        o7.a(obj, j, b);
    }
}
