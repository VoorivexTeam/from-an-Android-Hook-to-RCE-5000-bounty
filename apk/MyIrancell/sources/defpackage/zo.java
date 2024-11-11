package defpackage;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class zo implements ThreadFactory {
    private final String a;
    private final ThreadFactory b;

    public zo(String str) {
        this(str, 0);
    }

    private zo(String str, int i) {
        this.b = Executors.defaultThreadFactory();
        u.a(str, (Object) "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new bp(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
