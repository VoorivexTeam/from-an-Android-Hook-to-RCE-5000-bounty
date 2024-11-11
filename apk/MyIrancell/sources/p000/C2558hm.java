package p000;

import com.google.android.datatransport.runtime.backends.InterfaceC0773e;
import com.google.android.datatransport.runtime.backends.InterfaceC0781m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC0800s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: hm */
/* loaded from: classes.dex */
public class C2558hm implements InterfaceC2820jm {

    /* renamed from: f */
    private static final Logger f10495f = Logger.getLogger(C3491yl.class.getName());

    /* renamed from: a */
    private final InterfaceC0800s f10496a;

    /* renamed from: b */
    private final Executor f10497b;

    /* renamed from: c */
    private final InterfaceC0773e f10498c;

    /* renamed from: d */
    private final InterfaceC3132qm f10499d;

    /* renamed from: e */
    private final InterfaceC3365vn f10500e;

    public C2558hm(Executor executor, InterfaceC0773e interfaceC0773e, InterfaceC0800s interfaceC0800s, InterfaceC3132qm interfaceC3132qm, InterfaceC3365vn interfaceC3365vn) {
        this.f10497b = executor;
        this.f10498c = interfaceC0773e;
        this.f10496a = interfaceC0800s;
        this.f10499d = interfaceC3132qm;
        this.f10500e = interfaceC3365vn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m12237a(C2558hm c2558hm, AbstractC3266tl abstractC3266tl, AbstractC3089pl abstractC3089pl) {
        c2558hm.f10499d.mo14372a(abstractC3266tl, abstractC3089pl);
        c2558hm.f10496a.mo6293a(abstractC3266tl, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m12238a(C2558hm c2558hm, AbstractC3266tl abstractC3266tl, InterfaceC2900lk interfaceC2900lk, AbstractC3089pl abstractC3089pl) {
        try {
            InterfaceC0781m mo6278a = c2558hm.f10498c.mo6278a(abstractC3266tl.mo13735a());
            if (mo6278a != null) {
                c2558hm.f10500e.mo14371a(C2518gm.m12034a(c2558hm, abstractC3266tl, mo6278a.mo6264a(abstractC3089pl)));
                interfaceC2900lk.mo13912a(null);
            } else {
                String format = String.format("Transport backend '%s' is not registered", abstractC3266tl.mo13735a());
                f10495f.warning(format);
                interfaceC2900lk.mo13912a(new IllegalArgumentException(format));
            }
        } catch (Exception e) {
            f10495f.warning("Error scheduling event " + e.getMessage());
            interfaceC2900lk.mo13912a(e);
        }
    }

    @Override // p000.InterfaceC2820jm
    /* renamed from: a */
    public void mo12239a(AbstractC3266tl abstractC3266tl, AbstractC3089pl abstractC3089pl, InterfaceC2900lk interfaceC2900lk) {
        this.f10497b.execute(RunnableC2478fm.m11793a(this, abstractC3266tl, interfaceC2900lk, abstractC3089pl));
    }
}
