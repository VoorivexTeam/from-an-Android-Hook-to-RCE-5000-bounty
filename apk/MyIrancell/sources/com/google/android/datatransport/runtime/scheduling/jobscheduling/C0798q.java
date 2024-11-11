package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p000.AbstractC3266tl;
import p000.InterfaceC3132qm;
import p000.InterfaceC3365vn;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
/* loaded from: classes.dex */
public class C0798q {

    /* renamed from: a */
    private final Executor f5447a;

    /* renamed from: b */
    private final InterfaceC3132qm f5448b;

    /* renamed from: c */
    private final InterfaceC0800s f5449c;

    /* renamed from: d */
    private final InterfaceC3365vn f5450d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0798q(Executor executor, InterfaceC3132qm interfaceC3132qm, InterfaceC0800s interfaceC0800s, InterfaceC3365vn interfaceC3365vn) {
        this.f5447a = executor;
        this.f5448b = interfaceC3132qm;
        this.f5449c = interfaceC0800s;
        this.f5450d = interfaceC3365vn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m6335a(C0798q c0798q) {
        Iterator<AbstractC3266tl> it = c0798q.f5448b.mo14379g().iterator();
        while (it.hasNext()) {
            c0798q.f5449c.mo6293a(it.next(), 1);
        }
        return null;
    }

    /* renamed from: a */
    public void m6337a() {
        this.f5447a.execute(RunnableC0796o.m6333a(this));
    }
}
