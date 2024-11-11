package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class jc implements bc {
    private final hc<a, Object> a = new hc<>();
    private final b b = new b();
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    private final Map<Class<?>, ac<?>> d = new HashMap();
    private final int e;
    private int f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements mc {
        private final b a;
        int b;
        private Class<?> c;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.mc
        public void a() {
            this.a.a(this);
        }

        void a(int i, Class<?> cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends dc<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.dc
        public a a() {
            return new a(this);
        }

        a a(int i, Class<?> cls) {
            a b = b();
            b.a(i, cls);
            return b;
        }
    }

    public jc(int i) {
        this.e = i;
    }

    private <T> ac<T> a(Class<T> cls) {
        ac<T> acVar = (ac) this.d.get(cls);
        if (acVar == null) {
            if (cls.equals(int[].class)) {
                acVar = new ic();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                acVar = new gc();
            }
            this.d.put(cls, acVar);
        }
        return acVar;
    }

    private <T> T a(a aVar) {
        return (T) this.a.a((hc<a, Object>) aVar);
    }

    private <T> T a(a aVar, Class<T> cls) {
        ac<T> a2 = a((Class) cls);
        T t = (T) a(aVar);
        if (t != null) {
            this.f -= a2.a(t) * a2.b();
            c(a2.a(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(a2.a(), 2)) {
            a2.a();
            String str = "Allocated " + aVar.b + " bytes";
        }
        return a2.newArray(aVar.b);
    }

    private boolean a(int i, Integer num) {
        return num != null && (c() || num.intValue() <= i * 8);
    }

    private <T> ac<T> b(T t) {
        return a((Class) t.getClass());
    }

    private NavigableMap<Integer, Integer> b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private void b() {
        b(this.e);
    }

    private void b(int i) {
        while (this.f > i) {
            Object a2 = this.a.a();
            ji.a(a2);
            ac b2 = b((jc) a2);
            this.f -= b2.a(a2) * b2.b();
            c(b2.a(a2), a2.getClass());
            if (Log.isLoggable(b2.a(), 2)) {
                b2.a();
                String str = "evicted: " + b2.a(a2);
            }
        }
    }

    private void c(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> b2 = b(cls);
        Integer num = (Integer) b2.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(i);
        if (intValue == 1) {
            b2.remove(valueOf);
        } else {
            b2.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    private boolean c() {
        int i = this.f;
        return i == 0 || this.e / i >= 2;
    }

    private boolean c(int i) {
        return i <= this.e / 2;
    }

    @Override // defpackage.bc
    public synchronized <T> T a(int i, Class<T> cls) {
        return (T) a(this.b.a(i, cls), cls);
    }

    @Override // defpackage.bc
    public synchronized void a() {
        b(0);
    }

    @Override // defpackage.bc
    public synchronized void a(int i) {
        try {
            if (i >= 40) {
                a();
            } else if (i >= 20 || i == 15) {
                b(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bc
    public synchronized <T> void a(T t) {
        Class<?> cls = t.getClass();
        ac<T> a2 = a((Class) cls);
        int a3 = a2.a(t);
        int b2 = a2.b() * a3;
        if (c(b2)) {
            a a4 = this.b.a(a3, cls);
            this.a.a(a4, t);
            NavigableMap<Integer, Integer> b3 = b(cls);
            Integer num = (Integer) b3.get(Integer.valueOf(a4.b));
            Integer valueOf = Integer.valueOf(a4.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            b3.put(valueOf, Integer.valueOf(i));
            this.f += b2;
            b();
        }
    }

    @Override // defpackage.bc
    public synchronized <T> T b(int i, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = b((Class<?>) cls).ceilingKey(Integer.valueOf(i));
        return (T) a(a(i, ceilingKey) ? this.b.a(ceilingKey.intValue(), cls) : this.b.a(i, cls), cls);
    }
}
