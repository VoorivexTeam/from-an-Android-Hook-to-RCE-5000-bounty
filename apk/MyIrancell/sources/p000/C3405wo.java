package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wo */
/* loaded from: classes.dex */
public class C3405wo {

    /* renamed from: a */
    private static a f13964a;

    /* renamed from: wo$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        ScheduledExecutorService mo16385a();
    }

    /* renamed from: a */
    public static synchronized a m16384a() {
        a aVar;
        synchronized (C3405wo.class) {
            if (f13964a == null) {
                f13964a = new C3445xo();
            }
            aVar = f13964a;
        }
        return aVar;
    }
}
