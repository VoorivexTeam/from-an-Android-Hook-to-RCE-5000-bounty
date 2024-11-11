package p000;

import com.google.android.gms.common.internal.C1057u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: zo */
/* loaded from: classes.dex */
public class ThreadFactoryC3536zo implements ThreadFactory {

    /* renamed from: a */
    private final String f14530a;

    /* renamed from: b */
    private final ThreadFactory f14531b;

    public ThreadFactoryC3536zo(String str) {
        this(str, 0);
    }

    private ThreadFactoryC3536zo(String str, int i) {
        this.f14531b = Executors.defaultThreadFactory();
        C1057u.m7287a(str, (Object) "Name must not be null");
        this.f14530a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f14531b.newThread(new RunnableC0488bp(runnable, 0));
        newThread.setName(this.f14530a);
        return newThread;
    }
}
