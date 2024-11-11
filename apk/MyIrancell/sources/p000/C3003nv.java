package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nv */
/* loaded from: classes.dex */
public class C3003nv {

    /* renamed from: b */
    private static volatile C3003nv f12357b;

    /* renamed from: a */
    private final Set<AbstractC3099pv> f12358a = new HashSet();

    C3003nv() {
    }

    /* renamed from: b */
    public static C3003nv m14392b() {
        C3003nv c3003nv = f12357b;
        if (c3003nv == null) {
            synchronized (C3003nv.class) {
                c3003nv = f12357b;
                if (c3003nv == null) {
                    c3003nv = new C3003nv();
                    f12357b = c3003nv;
                }
            }
        }
        return c3003nv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Set<AbstractC3099pv> m14393a() {
        Set<AbstractC3099pv> unmodifiableSet;
        synchronized (this.f12358a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f12358a);
        }
        return unmodifiableSet;
    }
}
