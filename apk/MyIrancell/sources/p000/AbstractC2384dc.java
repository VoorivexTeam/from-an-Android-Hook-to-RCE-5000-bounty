package p000;

import java.util.Queue;
import p000.InterfaceC2938mc;

/* renamed from: dc */
/* loaded from: classes.dex */
abstract class AbstractC2384dc<T extends InterfaceC2938mc> {

    /* renamed from: a */
    private final Queue<T> f9805a = C2861ki.m13727a(20);

    /* renamed from: a */
    abstract T mo3659a();

    /* renamed from: a */
    public void m11359a(T t) {
        if (this.f9805a.size() < 20) {
            this.f9805a.offer(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public T m11360b() {
        T poll = this.f9805a.poll();
        return poll == null ? mo3659a() : poll;
    }
}
