package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.r2 */
/* loaded from: classes.dex */
final class C1446r2 {

    /* renamed from: a */
    private final ConcurrentHashMap<C1488u2, List<Throwable>> f6859a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f6860b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m8285a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f6860b.poll();
            if (poll == null) {
                break;
            }
            this.f6859a.remove(poll);
        }
        List<Throwable> list = this.f6859a.get(new C1488u2(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f6859a.putIfAbsent(new C1488u2(th, this.f6860b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
