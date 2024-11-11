package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.AbstractC0774f;
import com.google.android.datatransport.runtime.backends.AbstractC0775g;
import com.google.android.datatransport.runtime.backends.InterfaceC0773e;
import com.google.android.datatransport.runtime.backends.InterfaceC0781m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p000.AbstractC3266tl;
import p000.AbstractC3364vm;
import p000.C0485bm;
import p000.C3312un;
import p000.InterfaceC3132qm;
import p000.InterfaceC3365vn;
import p000.InterfaceC3404wn;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.m */
/* loaded from: classes.dex */
public class C0794m {

    /* renamed from: a */
    private final Context f5431a;

    /* renamed from: b */
    private final InterfaceC0773e f5432b;

    /* renamed from: c */
    private final InterfaceC3132qm f5433c;

    /* renamed from: d */
    private final InterfaceC0800s f5434d;

    /* renamed from: e */
    private final Executor f5435e;

    /* renamed from: f */
    private final InterfaceC3365vn f5436f;

    /* renamed from: g */
    private final InterfaceC3404wn f5437g;

    public C0794m(Context context, InterfaceC0773e interfaceC0773e, InterfaceC3132qm interfaceC3132qm, InterfaceC0800s interfaceC0800s, Executor executor, InterfaceC3365vn interfaceC3365vn, InterfaceC3404wn interfaceC3404wn) {
        this.f5431a = context;
        this.f5432b = interfaceC0773e;
        this.f5433c = interfaceC3132qm;
        this.f5434d = interfaceC0800s;
        this.f5435e = executor;
        this.f5436f = interfaceC3365vn;
        this.f5437g = interfaceC3404wn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m6326a(C0794m c0794m, AbstractC0775g abstractC0775g, Iterable iterable, AbstractC3266tl abstractC3266tl, int i) {
        if (abstractC0775g.mo6273b() == AbstractC0775g.a.TRANSIENT_ERROR) {
            c0794m.f5433c.mo14377b((Iterable<AbstractC3364vm>) iterable);
            c0794m.f5434d.mo6293a(abstractC3266tl, i + 1);
            return null;
        }
        c0794m.f5433c.mo14373a((Iterable<AbstractC3364vm>) iterable);
        if (abstractC0775g.mo6273b() == AbstractC0775g.a.OK) {
            c0794m.f5433c.mo14374a(abstractC3266tl, c0794m.f5437g.mo3178a() + abstractC0775g.mo6272a());
        }
        if (!c0794m.f5433c.mo14378c(abstractC3266tl)) {
            return null;
        }
        c0794m.f5434d.mo6293a(abstractC3266tl, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Object m6327a(C0794m c0794m, AbstractC3266tl abstractC3266tl, int i) {
        c0794m.f5434d.mo6293a(abstractC3266tl, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m6328a(C0794m c0794m, AbstractC3266tl abstractC3266tl, int i, Runnable runnable) {
        try {
            try {
                InterfaceC3365vn interfaceC3365vn = c0794m.f5436f;
                InterfaceC3132qm interfaceC3132qm = c0794m.f5433c;
                interfaceC3132qm.getClass();
                interfaceC3365vn.mo14371a(C0792k.m6323a(interfaceC3132qm));
                if (c0794m.m6331a()) {
                    c0794m.m6329a(abstractC3266tl, i);
                } else {
                    c0794m.f5436f.mo14371a(C0793l.m6324a(c0794m, abstractC3266tl, i));
                }
            } catch (C3312un unused) {
                c0794m.f5434d.mo6293a(abstractC3266tl, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: a */
    void m6329a(AbstractC3266tl abstractC3266tl, int i) {
        AbstractC0775g mo6263a;
        InterfaceC0781m mo6278a = this.f5432b.mo6278a(abstractC3266tl.mo13735a());
        Iterable iterable = (Iterable) this.f5436f.mo14371a(C0790i.m6320a(this, abstractC3266tl));
        if (iterable.iterator().hasNext()) {
            if (mo6278a == null) {
                C0485bm.m3430a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC3266tl);
                mo6263a = AbstractC0775g.m6281c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC3364vm) it.next()).mo14810a());
                }
                AbstractC0774f.a m6279c = AbstractC0774f.m6279c();
                m6279c.mo6269a(arrayList);
                m6279c.mo6270a(abstractC3266tl.mo13736b());
                mo6263a = mo6278a.mo6263a(m6279c.mo6271a());
            }
            this.f5436f.mo14371a(C0791j.m6322a(this, mo6263a, iterable, abstractC3266tl, i));
        }
    }

    /* renamed from: a */
    public void m6330a(AbstractC3266tl abstractC3266tl, int i, Runnable runnable) {
        this.f5435e.execute(RunnableC0789h.m6319a(this, abstractC3266tl, i, runnable));
    }

    /* renamed from: a */
    boolean m6331a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5431a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
