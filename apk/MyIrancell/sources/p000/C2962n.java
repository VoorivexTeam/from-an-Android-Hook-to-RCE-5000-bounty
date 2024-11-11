package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: n */
/* loaded from: classes.dex */
public class C2962n {

    /* renamed from: c */
    private Interpolator f12200c;

    /* renamed from: d */
    InterfaceC3328v2 f12201d;

    /* renamed from: e */
    private boolean f12202e;

    /* renamed from: b */
    private long f12199b = -1;

    /* renamed from: f */
    private final C3382w2 f12203f = new a();

    /* renamed from: a */
    final ArrayList<C3284u2> f12198a = new ArrayList<>();

    /* renamed from: n$a */
    /* loaded from: classes.dex */
    class a extends C3382w2 {

        /* renamed from: a */
        private boolean f12204a = false;

        /* renamed from: b */
        private int f12205b = 0;

        a() {
        }

        /* renamed from: a */
        void m14216a() {
            this.f12205b = 0;
            this.f12204a = false;
            C2962n.this.m14214b();
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: b */
        public void mo448b(View view) {
            int i = this.f12205b + 1;
            this.f12205b = i;
            if (i == C2962n.this.f12198a.size()) {
                InterfaceC3328v2 interfaceC3328v2 = C2962n.this.f12201d;
                if (interfaceC3328v2 != null) {
                    interfaceC3328v2.mo448b(null);
                }
                m14216a();
            }
        }

        @Override // p000.C3382w2, p000.InterfaceC3328v2
        /* renamed from: c */
        public void mo449c(View view) {
            if (this.f12204a) {
                return;
            }
            this.f12204a = true;
            InterfaceC3328v2 interfaceC3328v2 = C2962n.this.f12201d;
            if (interfaceC3328v2 != null) {
                interfaceC3328v2.mo449c(null);
            }
        }
    }

    /* renamed from: a */
    public C2962n m14208a(long j) {
        if (!this.f12202e) {
            this.f12199b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C2962n m14209a(Interpolator interpolator) {
        if (!this.f12202e) {
            this.f12200c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C2962n m14210a(C3284u2 c3284u2) {
        if (!this.f12202e) {
            this.f12198a.add(c3284u2);
        }
        return this;
    }

    /* renamed from: a */
    public C2962n m14211a(C3284u2 c3284u2, C3284u2 c3284u22) {
        this.f12198a.add(c3284u2);
        c3284u22.m15712b(c3284u2.m15710b());
        this.f12198a.add(c3284u22);
        return this;
    }

    /* renamed from: a */
    public C2962n m14212a(InterfaceC3328v2 interfaceC3328v2) {
        if (!this.f12202e) {
            this.f12201d = interfaceC3328v2;
        }
        return this;
    }

    /* renamed from: a */
    public void m14213a() {
        if (this.f12202e) {
            Iterator<C3284u2> it = this.f12198a.iterator();
            while (it.hasNext()) {
                it.next().m15709a();
            }
            this.f12202e = false;
        }
    }

    /* renamed from: b */
    void m14214b() {
        this.f12202e = false;
    }

    /* renamed from: c */
    public void m14215c() {
        if (this.f12202e) {
            return;
        }
        Iterator<C3284u2> it = this.f12198a.iterator();
        while (it.hasNext()) {
            C3284u2 next = it.next();
            long j = this.f12199b;
            if (j >= 0) {
                next.m15705a(j);
            }
            Interpolator interpolator = this.f12200c;
            if (interpolator != null) {
                next.m15706a(interpolator);
            }
            if (this.f12201d != null) {
                next.m15707a(this.f12203f);
            }
            next.m15713c();
        }
        this.f12202e = true;
    }
}
