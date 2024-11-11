package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w6 */
/* loaded from: classes.dex */
final class C1520w6 extends C1229c7 {

    /* renamed from: c */
    private final /* synthetic */ C1450r6 f6983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C1520w6(C1450r6 c1450r6) {
        super(c1450r6, null);
        this.f6983c = c1450r6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1520w6(C1450r6 c1450r6, C1492u6 c1492u6) {
        this(c1450r6);
    }

    @Override // com.google.android.gms.internal.measurement.C1229c7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C1478t6(this.f6983c, null);
    }
}
