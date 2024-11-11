package defpackage;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ap implements ThreadFactory {
    private final String a;
    private final AtomicInteger b;
    private final ThreadFactory c;

    public ap(String str) {
        this(str, 0);
    }

    private ap(String str, int i) {
        this.b = new AtomicInteger();
        this.c = Executors.defaultThreadFactory();
        u.a(str, (Object) "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new bp(runnable, 0));
        String str = this.a;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
