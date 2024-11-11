package p000;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0794m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0798q;
import java.util.Collections;
import java.util.Set;
import p000.AbstractC3089pl;
import p000.AbstractC3266tl;
import p000.AbstractC3533zl;

/* renamed from: yl */
/* loaded from: classes.dex */
public class C3491yl implements InterfaceC3442xl {

    /* renamed from: e */
    private static volatile AbstractC3533zl f14269e;

    /* renamed from: a */
    private final InterfaceC3404wn f14270a;

    /* renamed from: b */
    private final InterfaceC3404wn f14271b;

    /* renamed from: c */
    private final InterfaceC2820jm f14272c;

    /* renamed from: d */
    private final C0794m f14273d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3491yl(InterfaceC3404wn interfaceC3404wn, InterfaceC3404wn interfaceC3404wn2, InterfaceC2820jm interfaceC2820jm, C0794m c0794m, C0798q c0798q) {
        this.f14270a = interfaceC3404wn;
        this.f14271b = interfaceC3404wn2;
        this.f14272c = interfaceC2820jm;
        this.f14273d = c0794m;
        c0798q.m6337a();
    }

    /* renamed from: a */
    private AbstractC3089pl m16648a(AbstractC3214sl abstractC3214sl) {
        AbstractC3089pl.a m14801i = AbstractC3089pl.m14801i();
        m14801i.mo12484a(this.f14270a.mo3178a());
        m14801i.mo12491b(this.f14271b.mo3178a());
        m14801i.mo12486a(abstractC3214sl.mo13504f());
        m14801i.mo12488a(new C3050ol(abstractC3214sl.mo13500a(), abstractC3214sl.m15444c()));
        m14801i.mo12485a(abstractC3214sl.mo13501b().mo11623a());
        return m14801i.mo12489a();
    }

    /* renamed from: a */
    public static void m16649a(Context context) {
        if (f14269e == null) {
            synchronized (C3491yl.class) {
                if (f14269e == null) {
                    AbstractC3533zl.a m13914d = C2901ll.m13914d();
                    m13914d.mo13917a(context);
                    f14269e = m13914d.mo13918a();
                }
            }
        }
    }

    /* renamed from: b */
    private static Set<C2476fk> m16650b(InterfaceC2947ml interfaceC2947ml) {
        return interfaceC2947ml instanceof InterfaceC2993nl ? Collections.unmodifiableSet(((InterfaceC2993nl) interfaceC2947ml).mo6251b()) : Collections.singleton(C2476fk.m11789a("proto"));
    }

    /* renamed from: b */
    public static C3491yl m16651b() {
        AbstractC3533zl abstractC3533zl = f14269e;
        if (abstractC3533zl != null) {
            return abstractC3533zl.mo13916c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: a */
    public C0794m m16652a() {
        return this.f14273d;
    }

    /* renamed from: a */
    public InterfaceC2863kk m16653a(InterfaceC2947ml interfaceC2947ml) {
        Set<C2476fk> m16650b = m16650b(interfaceC2947ml);
        AbstractC3266tl.a m15657d = AbstractC3266tl.m15657d();
        m15657d.mo13739a(interfaceC2947ml.mo6250a());
        m15657d.mo13740a(interfaceC2947ml.mo6252c());
        return new C3310ul(m16650b, m15657d.mo13741a(), this);
    }

    @Override // p000.InterfaceC3442xl
    /* renamed from: a */
    public void mo16500a(AbstractC3214sl abstractC3214sl, InterfaceC2900lk interfaceC2900lk) {
        this.f14272c.mo12239a(abstractC3214sl.mo13503e().m15658a(abstractC3214sl.mo13501b().mo11625c()), m16648a(abstractC3214sl), interfaceC2900lk);
    }
}
