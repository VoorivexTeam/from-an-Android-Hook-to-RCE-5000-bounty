package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i5 */
/* loaded from: classes.dex */
final class C1317i5 extends AbstractC1287g5 {

    /* renamed from: c */
    private static final Class<?> f6664c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C1317i5() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <L> List<L> m7917a(Object obj, long j, int i) {
        List<L> mo7796a;
        C1257e5 c1257e5;
        List<L> m7918b = m7918b(obj, j);
        if (!m7918b.isEmpty()) {
            if (f6664c.isAssignableFrom(m7918b.getClass())) {
                ArrayList arrayList = new ArrayList(m7918b.size() + i);
                arrayList.addAll(m7918b);
                c1257e5 = arrayList;
            } else if (m7918b instanceof C1334j7) {
                C1257e5 c1257e52 = new C1257e5(m7918b.size() + i);
                c1257e52.addAll((C1334j7) m7918b);
                c1257e5 = c1257e52;
            } else {
                if (!(m7918b instanceof InterfaceC1333j6) || !(m7918b instanceof InterfaceC1532x4)) {
                    return m7918b;
                }
                InterfaceC1532x4 interfaceC1532x4 = (InterfaceC1532x4) m7918b;
                if (interfaceC1532x4.zza()) {
                    return m7918b;
                }
                mo7796a = interfaceC1532x4.mo7796a(m7918b.size() + i);
            }
            C1409o7.m8124a(obj, j, c1257e5);
            return c1257e5;
        }
        mo7796a = m7918b instanceof InterfaceC1302h5 ? new C1257e5(i) : ((m7918b instanceof InterfaceC1333j6) && (m7918b instanceof InterfaceC1532x4)) ? ((InterfaceC1532x4) m7918b).mo7796a(i) : new ArrayList<>(i);
        C1409o7.m8124a(obj, j, mo7796a);
        return mo7796a;
    }

    /* renamed from: b */
    private static <E> List<E> m7918b(Object obj, long j) {
        return (List) C1409o7.m8146f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1287g5
    /* renamed from: a */
    public final void mo7850a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C1409o7.m8146f(obj, j);
        if (list instanceof InterfaceC1302h5) {
            unmodifiableList = ((InterfaceC1302h5) list).mo7800c();
        } else {
            if (f6664c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1333j6) && (list instanceof InterfaceC1532x4)) {
                InterfaceC1532x4 interfaceC1532x4 = (InterfaceC1532x4) list;
                if (interfaceC1532x4.zza()) {
                    interfaceC1532x4.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C1409o7.m8124a(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1287g5
    /* renamed from: a */
    public final <E> void mo7851a(Object obj, Object obj2, long j) {
        List m7918b = m7918b(obj2, j);
        List m7917a = m7917a(obj, j, m7918b.size());
        int size = m7917a.size();
        int size2 = m7918b.size();
        if (size > 0 && size2 > 0) {
            m7917a.addAll(m7918b);
        }
        if (size > 0) {
            m7918b = m7917a;
        }
        C1409o7.m8124a(obj, j, m7918b);
    }
}
