package defpackage;

import defpackage.mc;
import java.util.Queue;

/* loaded from: classes.dex */
abstract class dc<T extends mc> {
    private final Queue<T> a = ki.a(20);

    abstract T a();

    public void a(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }
}
