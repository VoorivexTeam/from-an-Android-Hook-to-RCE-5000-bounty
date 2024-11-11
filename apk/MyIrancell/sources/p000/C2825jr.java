package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: jr */
/* loaded from: classes.dex */
final class C2825jr extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f11544a;

    public C2825jr(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f11544a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2825jr.class) {
            if (this == obj) {
                return true;
            }
            C2825jr c2825jr = (C2825jr) obj;
            if (this.f11544a == c2825jr.f11544a && get() == c2825jr.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11544a;
    }
}
