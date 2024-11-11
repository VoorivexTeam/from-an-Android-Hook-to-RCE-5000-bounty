package p000;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: g0 */
/* loaded from: classes.dex */
public class C2493g0<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f10174a;

    /* renamed from: b */
    private int f10175b;

    /* renamed from: c */
    private int f10176c;

    /* renamed from: d */
    private int f10177d;

    /* renamed from: e */
    private int f10178e;

    /* renamed from: f */
    private int f10179f;

    /* renamed from: g */
    private int f10180g;

    /* renamed from: h */
    private int f10181h;

    public C2493g0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f10176c = i;
        this.f10174a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: c */
    private int m11856c(K k, V v) {
        int mo5437b = mo5437b(k, v);
        if (mo5437b >= 0) {
            return mo5437b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V m11857a(K k) {
        return null;
    }

    /* renamed from: a */
    public final V m11858a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f10177d++;
            this.f10175b += m11856c(k, v);
            put = this.f10174a.put(k, v);
            if (put != null) {
                this.f10175b -= m11856c(k, put);
            }
        }
        if (put != null) {
            mo5436a(false, k, put, v);
        }
        m11860a(this.f10176c);
        return put;
    }

    /* renamed from: a */
    public final void m11859a() {
        m11860a(-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11860a(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f10175b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f10174a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f10175b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f10175b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f10174a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f10174a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f10174a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f10175b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m11856c(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f10175b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f10179f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f10179f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.mo5436a(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2493g0.m11860a(int):void");
    }

    /* renamed from: a */
    protected void mo5436a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: b */
    protected int mo5437b(K k, V v) {
        return 1;
    }

    /* renamed from: b */
    public final V m11861b(K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.f10174a.get(k);
            if (v2 != null) {
                this.f10180g++;
                return v2;
            }
            this.f10181h++;
            V m11857a = m11857a((C2493g0<K, V>) k);
            if (m11857a == null) {
                return null;
            }
            synchronized (this) {
                this.f10178e++;
                v = (V) this.f10174a.put(k, m11857a);
                if (v != null) {
                    this.f10174a.put(k, v);
                } else {
                    this.f10175b += m11856c(k, m11857a);
                }
            }
            if (v != null) {
                mo5436a(false, k, m11857a, v);
                return v;
            }
            m11860a(this.f10176c);
            return m11857a;
        }
    }

    public final synchronized String toString() {
        int i;
        i = this.f10180g + this.f10181h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f10176c), Integer.valueOf(this.f10180g), Integer.valueOf(this.f10181h), Integer.valueOf(i != 0 ? (this.f10180g * 100) / i : 0));
    }
}
