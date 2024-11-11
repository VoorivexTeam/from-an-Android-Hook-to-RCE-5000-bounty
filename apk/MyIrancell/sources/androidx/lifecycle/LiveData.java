package androidx.lifecycle;

import androidx.lifecycle.AbstractC0299e;
import p000.C3065p;
import p000.C3229t;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j */
    static final Object f1880j = new Object();

    /* renamed from: g */
    private boolean f1887g;

    /* renamed from: h */
    private boolean f1888h;

    /* renamed from: a */
    final Object f1881a = new Object();

    /* renamed from: b */
    private C3229t<InterfaceC0307m<? super T>, LiveData<T>.AbstractC0294b> f1882b = new C3229t<>();

    /* renamed from: c */
    int f1883c = 0;

    /* renamed from: d */
    private volatile Object f1884d = f1880j;

    /* renamed from: e */
    volatile Object f1885e = f1880j;

    /* renamed from: f */
    private int f1886f = -1;

    /* renamed from: i */
    private final Runnable f1889i = new RunnableC0293a();

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.AbstractC0294b implements InterfaceC0298d {

        /* renamed from: e */
        final InterfaceC0301g f1890e;

        LifecycleBoundObserver(InterfaceC0301g interfaceC0301g, InterfaceC0307m<? super T> interfaceC0307m) {
            super(interfaceC0307m);
            this.f1890e = interfaceC0301g;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0294b
        /* renamed from: a */
        void mo2016a() {
            this.f1890e.mo1356a().mo2037b(this);
        }

        @Override // androidx.lifecycle.InterfaceC0298d
        /* renamed from: a */
        public void mo2004a(InterfaceC0301g interfaceC0301g, AbstractC0299e.a aVar) {
            if (this.f1890e.mo1356a().mo2035a() == AbstractC0299e.b.DESTROYED) {
                LiveData.this.mo2010a((InterfaceC0307m) this.f1893a);
            } else {
                m2019a(mo2017b());
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0294b
        /* renamed from: b */
        boolean mo2017b() {
            return this.f1890e.mo1356a().mo2035a().isAtLeast(AbstractC0299e.b.STARTED);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0294b
        /* renamed from: g */
        boolean mo2018g(InterfaceC0301g interfaceC0301g) {
            return this.f1890e == interfaceC0301g;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    class RunnableC0293a implements Runnable {
        RunnableC0293a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f1881a) {
                obj = LiveData.this.f1885e;
                LiveData.this.f1885e = LiveData.f1880j;
            }
            LiveData.this.mo2012b((LiveData) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    public abstract class AbstractC0294b {

        /* renamed from: a */
        final InterfaceC0307m<? super T> f1893a;

        /* renamed from: b */
        boolean f1894b;

        /* renamed from: c */
        int f1895c = -1;

        AbstractC0294b(InterfaceC0307m<? super T> interfaceC0307m) {
            this.f1893a = interfaceC0307m;
        }

        /* renamed from: a */
        void mo2016a() {
        }

        /* renamed from: a */
        void m2019a(boolean z) {
            if (z == this.f1894b) {
                return;
            }
            this.f1894b = z;
            boolean z2 = LiveData.this.f1883c == 0;
            LiveData.this.f1883c += this.f1894b ? 1 : -1;
            if (z2 && this.f1894b) {
                LiveData.this.mo2014c();
            }
            LiveData liveData = LiveData.this;
            if (liveData.f1883c == 0 && !this.f1894b) {
                liveData.mo2015d();
            }
            if (this.f1894b) {
                LiveData.this.m2008a(this);
            }
        }

        /* renamed from: b */
        abstract boolean mo2017b();

        /* renamed from: g */
        boolean mo2018g(InterfaceC0301g interfaceC0301g) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m2005a(String str) {
        if (C3065p.m14670b().mo14672a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: b */
    private void m2006b(LiveData<T>.AbstractC0294b abstractC0294b) {
        if (abstractC0294b.f1894b) {
            if (!abstractC0294b.mo2017b()) {
                abstractC0294b.m2019a(false);
                return;
            }
            int i = abstractC0294b.f1895c;
            int i2 = this.f1886f;
            if (i >= i2) {
                return;
            }
            abstractC0294b.f1895c = i2;
            abstractC0294b.f1893a.mo2060a((Object) this.f1884d);
        }
    }

    /* renamed from: a */
    public T m2007a() {
        T t = (T) this.f1884d;
        if (t != f1880j) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    void m2008a(LiveData<T>.AbstractC0294b abstractC0294b) {
        if (this.f1887g) {
            this.f1888h = true;
            return;
        }
        this.f1887g = true;
        do {
            this.f1888h = false;
            if (abstractC0294b != null) {
                m2006b((AbstractC0294b) abstractC0294b);
                abstractC0294b = null;
            } else {
                C3229t<InterfaceC0307m<? super T>, LiveData<T>.AbstractC0294b>.d m15465e = this.f1882b.m15465e();
                while (m15465e.hasNext()) {
                    m2006b((AbstractC0294b) m15465e.next().getValue());
                    if (this.f1888h) {
                        break;
                    }
                }
            }
        } while (this.f1888h);
        this.f1887g = false;
    }

    /* renamed from: a */
    public void m2009a(InterfaceC0301g interfaceC0301g, InterfaceC0307m<? super T> interfaceC0307m) {
        m2005a("observe");
        if (interfaceC0301g.mo1356a().mo2035a() == AbstractC0299e.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0301g, interfaceC0307m);
        LiveData<T>.AbstractC0294b mo15301b = this.f1882b.mo15301b(interfaceC0307m, lifecycleBoundObserver);
        if (mo15301b != null && !mo15301b.mo2018g(interfaceC0301g)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo15301b != null) {
            return;
        }
        interfaceC0301g.mo1356a().mo2036a(lifecycleBoundObserver);
    }

    /* renamed from: a */
    public void mo2010a(InterfaceC0307m<? super T> interfaceC0307m) {
        m2005a("removeObserver");
        LiveData<T>.AbstractC0294b remove = this.f1882b.remove(interfaceC0307m);
        if (remove == null) {
            return;
        }
        remove.mo2016a();
        remove.m2019a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2011a(T t) {
        boolean z;
        synchronized (this.f1881a) {
            z = this.f1885e == f1880j;
            this.f1885e = t;
        }
        if (z) {
            C3065p.m14670b().mo14673b(this.f1889i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2012b(T t) {
        m2005a("setValue");
        this.f1886f++;
        this.f1884d = t;
        m2008a((AbstractC0294b) null);
    }

    /* renamed from: b */
    public boolean m2013b() {
        return this.f1883c > 0;
    }

    /* renamed from: c */
    protected void mo2014c() {
    }

    /* renamed from: d */
    protected void mo2015d() {
    }
}
