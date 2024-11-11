package p000;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: qc */
/* loaded from: classes.dex */
final class C3122qc {

    /* renamed from: a */
    private final Map<String, a> f12780a = new HashMap();

    /* renamed from: b */
    private final b f12781b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qc$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Lock f12782a = new ReentrantLock();

        /* renamed from: b */
        int f12783b;

        a() {
        }
    }

    /* renamed from: qc$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        private final Queue<a> f12784a = new ArrayDeque();

        b() {
        }

        /* renamed from: a */
        a m15055a() {
            a poll;
            synchronized (this.f12784a) {
                poll = this.f12784a.poll();
            }
            return poll == null ? new a() : poll;
        }

        /* renamed from: a */
        void m15056a(a aVar) {
            synchronized (this.f12784a) {
                if (this.f12784a.size() < 10) {
                    this.f12784a.offer(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15053a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f12780a.get(str);
            if (aVar == null) {
                aVar = this.f12781b.m15055a();
                this.f12780a.put(str, aVar);
            }
            aVar.f12783b++;
        }
        aVar.f12782a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15054b(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.f12780a.get(str);
            C2816ji.m13459a(aVar2);
            aVar = aVar2;
            if (aVar.f12783b < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f12783b);
            }
            int i = aVar.f12783b - 1;
            aVar.f12783b = i;
            if (i == 0) {
                a remove = this.f12780a.remove(str);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                this.f12781b.m15056a(remove);
            }
        }
        aVar.f12782a.unlock();
    }
}
