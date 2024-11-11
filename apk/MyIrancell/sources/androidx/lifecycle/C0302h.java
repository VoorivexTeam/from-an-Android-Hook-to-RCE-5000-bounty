package androidx.lifecycle;

import androidx.lifecycle.AbstractC0299e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p000.C3185s;
import p000.C3229t;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public class C0302h extends AbstractC0299e {

    /* renamed from: c */
    private final WeakReference<InterfaceC0301g> f1909c;

    /* renamed from: a */
    private C3185s<InterfaceC0300f, b> f1907a = new C3185s<>();

    /* renamed from: d */
    private int f1910d = 0;

    /* renamed from: e */
    private boolean f1911e = false;

    /* renamed from: f */
    private boolean f1912f = false;

    /* renamed from: g */
    private ArrayList<AbstractC0299e.b> f1913g = new ArrayList<>();

    /* renamed from: b */
    private AbstractC0299e.b f1908b = AbstractC0299e.b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.h$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1914a;

        /* renamed from: b */
        static final /* synthetic */ int[] f1915b;

        static {
            int[] iArr = new int[AbstractC0299e.b.values().length];
            f1915b = iArr;
            try {
                iArr[AbstractC0299e.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1915b[AbstractC0299e.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1915b[AbstractC0299e.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1915b[AbstractC0299e.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1915b[AbstractC0299e.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[AbstractC0299e.a.values().length];
            f1914a = iArr2;
            try {
                iArr2[AbstractC0299e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1914a[AbstractC0299e.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1914a[AbstractC0299e.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1914a[AbstractC0299e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1914a[AbstractC0299e.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1914a[AbstractC0299e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1914a[AbstractC0299e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.h$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        AbstractC0299e.b f1916a;

        /* renamed from: b */
        InterfaceC0298d f1917b;

        b(InterfaceC0300f interfaceC0300f, AbstractC0299e.b bVar) {
            this.f1917b = C0304j.m2054a(interfaceC0300f);
            this.f1916a = bVar;
        }

        /* renamed from: a */
        void m2052a(InterfaceC0301g interfaceC0301g, AbstractC0299e.a aVar) {
            AbstractC0299e.b m2041b = C0302h.m2041b(aVar);
            this.f1916a = C0302h.m2038a(this.f1916a, m2041b);
            this.f1917b.mo2004a(interfaceC0301g, aVar);
            this.f1916a = m2041b;
        }
    }

    public C0302h(InterfaceC0301g interfaceC0301g) {
        this.f1909c = new WeakReference<>(interfaceC0301g);
    }

    /* renamed from: a */
    static AbstractC0299e.b m2038a(AbstractC0299e.b bVar, AbstractC0299e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m2039a(InterfaceC0301g interfaceC0301g) {
        Iterator<Map.Entry<InterfaceC0300f, b>> m15463b = this.f1907a.m15463b();
        while (m15463b.hasNext() && !this.f1912f) {
            Map.Entry<InterfaceC0300f, b> next = m15463b.next();
            b value = next.getValue();
            while (value.f1916a.compareTo(this.f1908b) > 0 && !this.f1912f && this.f1907a.contains(next.getKey())) {
                AbstractC0299e.a m2040b = m2040b(value.f1916a);
                m2048d(m2041b(m2040b));
                value.m2052a(interfaceC0301g, m2040b);
                m2045c();
            }
        }
    }

    /* renamed from: b */
    private static AbstractC0299e.a m2040b(AbstractC0299e.b bVar) {
        int i = a.f1915b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            return AbstractC0299e.a.ON_DESTROY;
        }
        if (i == 3) {
            return AbstractC0299e.a.ON_STOP;
        }
        if (i == 4) {
            return AbstractC0299e.a.ON_PAUSE;
        }
        if (i == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    /* renamed from: b */
    static AbstractC0299e.b m2041b(AbstractC0299e.a aVar) {
        switch (a.f1914a[aVar.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0299e.b.CREATED;
            case 3:
            case 4:
                return AbstractC0299e.b.STARTED;
            case 5:
                return AbstractC0299e.b.RESUMED;
            case 6:
                return AbstractC0299e.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m2042b(InterfaceC0301g interfaceC0301g) {
        C3229t<InterfaceC0300f, b>.d m15465e = this.f1907a.m15465e();
        while (m15465e.hasNext() && !this.f1912f) {
            Map.Entry next = m15465e.next();
            b bVar = (b) next.getValue();
            while (bVar.f1916a.compareTo(this.f1908b) < 0 && !this.f1912f && this.f1907a.contains(next.getKey())) {
                m2048d(bVar.f1916a);
                bVar.m2052a(interfaceC0301g, m2049e(bVar.f1916a));
                m2045c();
            }
        }
    }

    /* renamed from: b */
    private boolean m2043b() {
        if (this.f1907a.size() == 0) {
            return true;
        }
        AbstractC0299e.b bVar = this.f1907a.m15464d().getValue().f1916a;
        AbstractC0299e.b bVar2 = this.f1907a.m15466f().getValue().f1916a;
        return bVar == bVar2 && this.f1908b == bVar2;
    }

    /* renamed from: c */
    private AbstractC0299e.b m2044c(InterfaceC0300f interfaceC0300f) {
        Map.Entry<InterfaceC0300f, b> m15302b = this.f1907a.m15302b(interfaceC0300f);
        AbstractC0299e.b bVar = null;
        AbstractC0299e.b bVar2 = m15302b != null ? m15302b.getValue().f1916a : null;
        if (!this.f1913g.isEmpty()) {
            bVar = this.f1913g.get(r0.size() - 1);
        }
        return m2038a(m2038a(this.f1908b, bVar2), bVar);
    }

    /* renamed from: c */
    private void m2045c() {
        this.f1913g.remove(r0.size() - 1);
    }

    /* renamed from: c */
    private void m2046c(AbstractC0299e.b bVar) {
        if (this.f1908b == bVar) {
            return;
        }
        this.f1908b = bVar;
        if (this.f1911e || this.f1910d != 0) {
            this.f1912f = true;
            return;
        }
        this.f1911e = true;
        m2047d();
        this.f1911e = false;
    }

    /* renamed from: d */
    private void m2047d() {
        InterfaceC0301g interfaceC0301g = this.f1909c.get();
        if (interfaceC0301g == null) {
            return;
        }
        while (true) {
            boolean m2043b = m2043b();
            this.f1912f = false;
            if (m2043b) {
                return;
            }
            if (this.f1908b.compareTo(this.f1907a.m15464d().getValue().f1916a) < 0) {
                m2039a(interfaceC0301g);
            }
            Map.Entry<InterfaceC0300f, b> m15466f = this.f1907a.m15466f();
            if (!this.f1912f && m15466f != null && this.f1908b.compareTo(m15466f.getValue().f1916a) > 0) {
                m2042b(interfaceC0301g);
            }
        }
    }

    /* renamed from: d */
    private void m2048d(AbstractC0299e.b bVar) {
        this.f1913g.add(bVar);
    }

    /* renamed from: e */
    private static AbstractC0299e.a m2049e(AbstractC0299e.b bVar) {
        int i = a.f1915b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC0299e.a.ON_START;
            }
            if (i == 3) {
                return AbstractC0299e.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return AbstractC0299e.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.AbstractC0299e
    /* renamed from: a */
    public AbstractC0299e.b mo2035a() {
        return this.f1908b;
    }

    /* renamed from: a */
    public void m2050a(AbstractC0299e.a aVar) {
        m2046c(m2041b(aVar));
    }

    /* renamed from: a */
    public void m2051a(AbstractC0299e.b bVar) {
        m2046c(bVar);
    }

    @Override // androidx.lifecycle.AbstractC0299e
    /* renamed from: a */
    public void mo2036a(InterfaceC0300f interfaceC0300f) {
        InterfaceC0301g interfaceC0301g;
        AbstractC0299e.b bVar = this.f1908b;
        AbstractC0299e.b bVar2 = AbstractC0299e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0299e.b.INITIALIZED;
        }
        b bVar3 = new b(interfaceC0300f, bVar2);
        if (this.f1907a.mo15301b(interfaceC0300f, bVar3) == null && (interfaceC0301g = this.f1909c.get()) != null) {
            boolean z = this.f1910d != 0 || this.f1911e;
            AbstractC0299e.b m2044c = m2044c(interfaceC0300f);
            this.f1910d++;
            while (bVar3.f1916a.compareTo(m2044c) < 0 && this.f1907a.contains(interfaceC0300f)) {
                m2048d(bVar3.f1916a);
                bVar3.m2052a(interfaceC0301g, m2049e(bVar3.f1916a));
                m2045c();
                m2044c = m2044c(interfaceC0300f);
            }
            if (!z) {
                m2047d();
            }
            this.f1910d--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0299e
    /* renamed from: b */
    public void mo2037b(InterfaceC0300f interfaceC0300f) {
        this.f1907a.remove(interfaceC0300f);
    }
}
