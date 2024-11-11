package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class wo {
    private static a a;

    /* loaded from: classes.dex */
    public interface a {
        ScheduledExecutorService a();
    }

    public static synchronized a a() {
        a aVar;
        synchronized (wo.class) {
            if (a == null) {
                a = new xo();
            }
            aVar = a;
        }
        return aVar;
    }
}
