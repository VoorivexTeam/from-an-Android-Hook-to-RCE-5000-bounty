package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
/* loaded from: classes.dex */
final class C1377m5 extends AbstractC1287g5 {
    private C1377m5() {
        super();
    }

    /* renamed from: b */
    private static <E> InterfaceC1532x4<E> m8024b(Object obj, long j) {
        return (InterfaceC1532x4) C1409o7.m8146f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1287g5
    /* renamed from: a */
    public final void mo7850a(Object obj, long j) {
        m8024b(obj, j).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1287g5
    /* renamed from: a */
    public final <E> void mo7851a(Object obj, Object obj2, long j) {
        InterfaceC1532x4 m8024b = m8024b(obj, j);
        InterfaceC1532x4 m8024b2 = m8024b(obj2, j);
        int size = m8024b.size();
        int size2 = m8024b2.size();
        if (size > 0 && size2 > 0) {
            if (!m8024b.zza()) {
                m8024b = m8024b.mo7796a(size2 + size);
            }
            m8024b.addAll(m8024b2);
        }
        if (size > 0) {
            m8024b2 = m8024b;
        }
        C1409o7.m8124a(obj, j, m8024b2);
    }
}
