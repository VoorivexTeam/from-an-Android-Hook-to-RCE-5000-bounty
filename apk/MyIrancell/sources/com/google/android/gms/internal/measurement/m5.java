package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class m5 extends g5 {
    private m5() {
        super();
    }

    private static <E> x4<E> b(Object obj, long j) {
        return (x4) o7.f(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.g5
    public final void a(Object obj, long j) {
        b(obj, j).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.g5
    public final <E> void a(Object obj, Object obj2, long j) {
        x4 b = b(obj, j);
        x4 b2 = b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.zza()) {
                b = b.a(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        o7.a(obj, j, b2);
    }
}
