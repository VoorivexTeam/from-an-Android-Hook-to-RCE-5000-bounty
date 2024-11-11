package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: jc */
/* loaded from: classes.dex */
public final class C2810jc implements InterfaceC0475bc {

    /* renamed from: a */
    private final C2548hc<a, Object> f11503a = new C2548hc<>();

    /* renamed from: b */
    private final b f11504b = new b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f11505c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC0016ac<?>> f11506d = new HashMap();

    /* renamed from: e */
    private final int f11507e;

    /* renamed from: f */
    private int f11508f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jc$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2938mc {

        /* renamed from: a */
        private final b f11509a;

        /* renamed from: b */
        int f11510b;

        /* renamed from: c */
        private Class<?> f11511c;

        a(b bVar) {
            this.f11509a = bVar;
        }

        @Override // p000.InterfaceC2938mc
        /* renamed from: a */
        public void mo3657a() {
            this.f11509a.m11359a(this);
        }

        /* renamed from: a */
        void m13453a(int i, Class<?> cls) {
            this.f11510b = i;
            this.f11511c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11510b == aVar.f11510b && this.f11511c == aVar.f11511c;
        }

        public int hashCode() {
            int i = this.f11510b * 31;
            Class<?> cls = this.f11511c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f11510b + "array=" + this.f11511c + '}';
        }
    }

    /* renamed from: jc$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC2384dc<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC2384dc
        /* renamed from: a */
        public a mo3659a() {
            return new a(this);
        }

        /* renamed from: a */
        a m13454a(int i, Class<?> cls) {
            a m11360b = m11360b();
            m11360b.m13453a(i, cls);
            return m11360b;
        }
    }

    public C2810jc(int i) {
        this.f11507e = i;
    }

    /* renamed from: a */
    private <T> InterfaceC0016ac<T> m13442a(Class<T> cls) {
        InterfaceC0016ac<T> interfaceC0016ac = (InterfaceC0016ac) this.f11506d.get(cls);
        if (interfaceC0016ac == null) {
            if (cls.equals(int[].class)) {
                interfaceC0016ac = new C2590ic();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                interfaceC0016ac = new C2508gc();
            }
            this.f11506d.put(cls, interfaceC0016ac);
        }
        return interfaceC0016ac;
    }

    /* renamed from: a */
    private <T> T m13443a(a aVar) {
        return (T) this.f11503a.m12203a((C2548hc<a, Object>) aVar);
    }

    /* renamed from: a */
    private <T> T m13444a(a aVar, Class<T> cls) {
        InterfaceC0016ac<T> m13442a = m13442a((Class) cls);
        T t = (T) m13443a(aVar);
        if (t != null) {
            this.f11508f -= m13442a.mo134a(t) * m13442a.mo136b();
            m13450c(m13442a.mo134a(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(m13442a.mo135a(), 2)) {
            m13442a.mo135a();
            String str = "Allocated " + aVar.f11510b + " bytes";
        }
        return m13442a.newArray(aVar.f11510b);
    }

    /* renamed from: a */
    private boolean m13445a(int i, Integer num) {
        return num != null && (m13451c() || num.intValue() <= i * 8);
    }

    /* renamed from: b */
    private <T> InterfaceC0016ac<T> m13446b(T t) {
        return m13442a((Class) t.getClass());
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m13447b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f11505c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11505c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: b */
    private void m13448b() {
        m13449b(this.f11507e);
    }

    /* renamed from: b */
    private void m13449b(int i) {
        while (this.f11508f > i) {
            Object m12202a = this.f11503a.m12202a();
            C2816ji.m13459a(m12202a);
            InterfaceC0016ac m13446b = m13446b((C2810jc) m12202a);
            this.f11508f -= m13446b.mo134a(m12202a) * m13446b.mo136b();
            m13450c(m13446b.mo134a(m12202a), m12202a.getClass());
            if (Log.isLoggable(m13446b.mo135a(), 2)) {
                m13446b.mo135a();
                String str = "evicted: " + m13446b.mo134a(m12202a);
            }
        }
    }

    /* renamed from: c */
    private void m13450c(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m13447b = m13447b(cls);
        Integer num = (Integer) m13447b.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(i);
        if (intValue == 1) {
            m13447b.remove(valueOf);
        } else {
            m13447b.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: c */
    private boolean m13451c() {
        int i = this.f11508f;
        return i == 0 || this.f11507e / i >= 2;
    }

    /* renamed from: c */
    private boolean m13452c(int i) {
        return i <= this.f11507e / 2;
    }

    @Override // p000.InterfaceC0475bc
    /* renamed from: a */
    public synchronized <T> T mo3375a(int i, Class<T> cls) {
        return (T) m13444a(this.f11504b.m13454a(i, cls), cls);
    }

    @Override // p000.InterfaceC0475bc
    /* renamed from: a */
    public synchronized void mo3376a() {
        m13449b(0);
    }

    @Override // p000.InterfaceC0475bc
    /* renamed from: a */
    public synchronized void mo3377a(int i) {
        try {
            if (i >= 40) {
                mo3376a();
            } else if (i >= 20 || i == 15) {
                m13449b(this.f11507e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0475bc
    /* renamed from: a */
    public synchronized <T> void mo3378a(T t) {
        Class<?> cls = t.getClass();
        InterfaceC0016ac<T> m13442a = m13442a((Class) cls);
        int mo134a = m13442a.mo134a(t);
        int mo136b = m13442a.mo136b() * mo134a;
        if (m13452c(mo136b)) {
            a m13454a = this.f11504b.m13454a(mo134a, cls);
            this.f11503a.m12204a(m13454a, t);
            NavigableMap<Integer, Integer> m13447b = m13447b(cls);
            Integer num = (Integer) m13447b.get(Integer.valueOf(m13454a.f11510b));
            Integer valueOf = Integer.valueOf(m13454a.f11510b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m13447b.put(valueOf, Integer.valueOf(i));
            this.f11508f += mo136b;
            m13448b();
        }
    }

    @Override // p000.InterfaceC0475bc
    /* renamed from: b */
    public synchronized <T> T mo3379b(int i, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = m13447b((Class<?>) cls).ceilingKey(Integer.valueOf(i));
        return (T) m13444a(m13445a(i, ceilingKey) ? this.f11504b.m13454a(ceilingKey.intValue(), cls) : this.f11504b.m13454a(i, cls), cls);
    }
}
