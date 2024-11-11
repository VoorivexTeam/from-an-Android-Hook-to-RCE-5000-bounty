package p000;

import com.google.android.gms.common.internal.C1057u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ap */
/* loaded from: classes.dex */
public class ThreadFactoryC0431ap implements ThreadFactory {

    /* renamed from: a */
    private final String f2631a;

    /* renamed from: b */
    private final AtomicInteger f2632b;

    /* renamed from: c */
    private final ThreadFactory f2633c;

    public ThreadFactoryC0431ap(String str) {
        this(str, 0);
    }

    private ThreadFactoryC0431ap(String str, int i) {
        this.f2632b = new AtomicInteger();
        this.f2633c = Executors.defaultThreadFactory();
        C1057u.m7287a(str, (Object) "Name must not be null");
        this.f2631a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f2633c.newThread(new RunnableC0488bp(runnable, 0));
        String str = this.f2631a;
        int andIncrement = this.f2632b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
