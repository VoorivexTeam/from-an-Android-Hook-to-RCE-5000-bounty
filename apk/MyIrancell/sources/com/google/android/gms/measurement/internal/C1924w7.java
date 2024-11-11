package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.C1006h;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.C1088a;
import com.google.android.gms.internal.measurement.InterfaceC1428pc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* loaded from: classes.dex */
public final class C1924w7 extends AbstractC1688c3 {

    /* renamed from: c */
    private final ServiceConnectionC1837o8 f8139c;

    /* renamed from: d */
    private InterfaceC1920w3 f8140d;

    /* renamed from: e */
    private volatile Boolean f8141e;

    /* renamed from: f */
    private final AbstractC1732g f8142f;

    /* renamed from: g */
    private final C1802l9 f8143g;

    /* renamed from: h */
    private final List<Runnable> f8144h;

    /* renamed from: i */
    private final AbstractC1732g f8145i;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1924w7(C1774j5 c1774j5) {
        super(c1774j5);
        this.f8144h = new ArrayList();
        this.f8143g = new C1802l9(c1774j5.mo9321h());
        this.f8139c = new ServiceConnectionC1837o8(this);
        this.f8142f = new C1913v7(this, c1774j5);
        this.f8145i = new C1741g8(this, c1774j5);
    }

    /* renamed from: I */
    private final boolean m9841I() {
        mo9317d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m9842J() {
        mo9194c();
        this.f8143g.m9469a();
        this.f8142f.m9330a(C1828o.f7810G.m9875a(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final void m9843K() {
        mo9194c();
        if (m9855B()) {
            mo9324k().m9304B().m9365a("Inactivity, disconnecting from the service");
            m9861H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m9844L() {
        mo9194c();
        mo9324k().m9304B().m9366a("Processing queued up service tasks", Integer.valueOf(this.f8144h.size()));
        Iterator<Runnable> it = this.f8144h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e) {
                mo9324k().m9309t().m9366a("Task exception while flushing queue", e);
            }
        }
        this.f8144h.clear();
        this.f8145i.m9332c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC1920w3 m9846a(C1924w7 c1924w7, InterfaceC1920w3 interfaceC1920w3) {
        c1924w7.f8140d = null;
        return null;
    }

    /* renamed from: a */
    private final zzm m9847a(boolean z) {
        mo9317d();
        return m9198q().m9107a(z ? mo9324k().m9305C() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m9848a(ComponentName componentName) {
        mo9194c();
        if (this.f8140d != null) {
            this.f8140d = null;
            mo9324k().m9304B().m9366a("Disconnected from device MeasurementService", componentName);
            mo9194c();
            m9859F();
        }
    }

    /* renamed from: a */
    private final void m9850a(Runnable runnable) {
        mo9194c();
        if (m9855B()) {
            runnable.run();
        } else {
            if (this.f8144h.size() >= 1000) {
                mo9324k().m9309t().m9365a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f8144h.add(runnable);
            this.f8145i.m9330a(60000L);
            m9859F();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1688c3
    /* renamed from: A */
    protected final boolean mo9090A() {
        return false;
    }

    /* renamed from: B */
    public final boolean m9855B() {
        mo9194c();
        m9110x();
        return this.f8140d != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final void m9856C() {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1729f8(this, m9847a(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final void m9857D() {
        mo9194c();
        mo9193a();
        m9110x();
        zzm m9847a = m9847a(false);
        if (m9841I()) {
            m9201t().m9091B();
        }
        m9850a(new RunnableC1957z7(this, m9847a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final void m9858E() {
        mo9194c();
        m9110x();
        zzm m9847a = m9847a(true);
        boolean m9480a = m9326m().m9480a(C1828o.f7899y0);
        if (m9480a) {
            m9201t().m9092C();
        }
        m9850a(new RunnableC1669a8(this, m9847a, m9480a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9859F() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1924w7.m9859F():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final Boolean m9860G() {
        return this.f8141e;
    }

    /* renamed from: H */
    public final void m9861H() {
        mo9194c();
        m9110x();
        this.f8139c.m9636a();
        try {
            C1088a.m7348a().m7349a(mo9325l(), this.f8139c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f8140d = null;
    }

    /* renamed from: a */
    public final void m9862a(InterfaceC1428pc interfaceC1428pc) {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1681b8(this, m9847a(false), interfaceC1428pc));
    }

    /* renamed from: a */
    public final void m9863a(InterfaceC1428pc interfaceC1428pc, zzan zzanVar, String str) {
        mo9194c();
        m9110x();
        if (m9322i().m9930a(C1006h.f6075a) == 0) {
            m9850a(new RunnableC1693c8(this, zzanVar, str, interfaceC1428pc));
        } else {
            mo9324k().m9312w().m9365a("Not bundling data. Service unavailable or out of date");
            m9322i().m9948a(interfaceC1428pc, new byte[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9864a(InterfaceC1428pc interfaceC1428pc, String str, String str2) {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1777j8(this, str, str2, m9847a(false), interfaceC1428pc));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9865a(InterfaceC1428pc interfaceC1428pc, String str, String str2, boolean z) {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1801l8(this, str, str2, z, m9847a(false), interfaceC1428pc));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9866a(C1880s7 c1880s7) {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1717e8(this, c1880s7));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9867a(InterfaceC1920w3 interfaceC1920w3) {
        mo9194c();
        C1057u.m7286a(interfaceC1920w3);
        this.f8140d = interfaceC1920w3;
        m9842J();
        m9844L();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9868a(InterfaceC1920w3 interfaceC1920w3, AbstractSafeParcelable abstractSafeParcelable, zzm zzmVar) {
        int i;
        C1749h4 m9309t;
        String str;
        List<AbstractSafeParcelable> m9094a;
        mo9194c();
        mo9193a();
        m9110x();
        boolean m9841I = m9841I();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!m9841I || (m9094a = m9201t().m9094a(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(m9094a);
                i = m9094a.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzan) {
                    try {
                        interfaceC1920w3.mo9622a((zzan) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e) {
                        e = e;
                        m9309t = mo9324k().m9309t();
                        str = "Failed to send event to the service";
                        m9309t.m9366a(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkq) {
                    try {
                        interfaceC1920w3.mo9624a((zzkq) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        m9309t = mo9324k().m9309t();
                        str = "Failed to send user property to the service";
                        m9309t.m9366a(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzv) {
                    try {
                        interfaceC1920w3.mo9627a((zzv) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        m9309t = mo9324k().m9309t();
                        str = "Failed to send conditional user property to the service";
                        m9309t.m9366a(str, e);
                    }
                } else {
                    mo9324k().m9309t().m9365a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9869a(zzan zzanVar, String str) {
        C1057u.m7286a(zzanVar);
        mo9194c();
        m9110x();
        boolean m9841I = m9841I();
        m9850a(new RunnableC1765i8(this, m9841I, m9841I && m9201t().m9095a(zzanVar), zzanVar, m9847a(true), str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9870a(zzkq zzkqVar) {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1935x7(this, m9841I() && m9201t().m9096a(zzkqVar), zzkqVar, m9847a(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9871a(zzv zzvVar) {
        C1057u.m7286a(zzvVar);
        mo9194c();
        m9110x();
        mo9317d();
        m9850a(new RunnableC1753h8(this, true, m9201t().m9097a(zzvVar), new zzv(zzvVar), m9847a(true), zzvVar));
    }

    /* renamed from: a */
    public final void m9872a(AtomicReference<String> atomicReference) {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1946y7(this, atomicReference, m9847a(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9873a(AtomicReference<List<zzv>> atomicReference, String str, String str2, String str3) {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1789k8(this, atomicReference, str, str2, str3, m9847a(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9874a(AtomicReference<List<zzkq>> atomicReference, String str, String str2, String str3, boolean z) {
        mo9194c();
        m9110x();
        m9850a(new RunnableC1813m8(this, atomicReference, str, str2, str3, z, m9847a(false)));
    }
}
