package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.measurement.u2 */
/* loaded from: classes.dex */
final class C1488u2 extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f6950a;

    public C1488u2(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f6950a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C1488u2.class) {
            if (this == obj) {
                return true;
            }
            C1488u2 c1488u2 = (C1488u2) obj;
            if (this.f6950a == c1488u2.f6950a && get() == c1488u2.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6950a;
    }
}
