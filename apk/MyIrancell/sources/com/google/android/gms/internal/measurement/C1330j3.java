package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.j3 */
/* loaded from: classes.dex */
final class C1330j3 implements Comparator<AbstractC1300h3> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC1300h3 abstractC1300h3, AbstractC1300h3 abstractC1300h32) {
        int m7870b;
        int m7870b2;
        AbstractC1300h3 abstractC1300h33 = abstractC1300h3;
        AbstractC1300h3 abstractC1300h34 = abstractC1300h32;
        InterfaceC1375m3 interfaceC1375m3 = (InterfaceC1375m3) abstractC1300h33.iterator();
        InterfaceC1375m3 interfaceC1375m32 = (InterfaceC1375m3) abstractC1300h34.iterator();
        while (interfaceC1375m3.hasNext() && interfaceC1375m32.hasNext()) {
            m7870b = AbstractC1300h3.m7870b(interfaceC1375m3.zza());
            m7870b2 = AbstractC1300h3.m7870b(interfaceC1375m32.zza());
            int compare = Integer.compare(m7870b, m7870b2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(abstractC1300h33.zza(), abstractC1300h34.zza());
    }
}
