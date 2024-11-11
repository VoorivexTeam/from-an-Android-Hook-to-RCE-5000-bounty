package defpackage;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class hm implements jm {
    private static final Logger f = Logger.getLogger(yl.class.getName());
    private final s a;
    private final Executor b;
    private final e c;
    private final qm d;
    private final vn e;

    public hm(Executor executor, e eVar, s sVar, qm qmVar, vn vnVar) {
        this.b = executor;
        this.c = eVar;
        this.a = sVar;
        this.d = qmVar;
        this.e = vnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(hm hmVar, tl tlVar, pl plVar) {
        hmVar.d.a(tlVar, plVar);
        hmVar.a.a(tlVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(hm hmVar, tl tlVar, lk lkVar, pl plVar) {
        try {
            m a = hmVar.c.a(tlVar.a());
            if (a != null) {
                hmVar.e.a(gm.a(hmVar, tlVar, a.a(plVar)));
                lkVar.a(null);
            } else {
                String format = String.format("Transport backend '%s' is not registered", tlVar.a());
                f.warning(format);
                lkVar.a(new IllegalArgumentException(format));
            }
        } catch (Exception e) {
            f.warning("Error scheduling event " + e.getMessage());
            lkVar.a(e);
        }
    }

    @Override // defpackage.jm
    public void a(tl tlVar, pl plVar, lk lkVar) {
        this.b.execute(fm.a(this, tlVar, lkVar, plVar));
    }
}
