package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gr */
/* loaded from: classes.dex */
final class C2523gr {

    /* renamed from: a */
    private final ConcurrentHashMap<C2825jr, List<Throwable>> f10337a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f10338b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m12039a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f10338b.poll();
            if (poll == null) {
                break;
            }
            this.f10337a.remove(poll);
        }
        List<Throwable> list = this.f10337a.get(new C2825jr(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f10337a.putIfAbsent(new C2825jr(th, this.f10338b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
