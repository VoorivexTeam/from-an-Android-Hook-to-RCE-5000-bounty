package p000;

/* renamed from: bi */
/* loaded from: classes.dex */
public final class C0481bi<K, V> extends C0500c0<K, V> {

    /* renamed from: j */
    private int f2808j;

    @Override // p000.C2573i0
    /* renamed from: a */
    public V mo3396a(int i, V v) {
        this.f2808j = 0;
        return (V) super.mo3396a(i, (int) v);
    }

    @Override // p000.C2573i0
    /* renamed from: a */
    public void mo3397a(C2573i0<? extends K, ? extends V> c2573i0) {
        this.f2808j = 0;
        super.mo3397a((C2573i0) c2573i0);
    }

    @Override // p000.C2573i0
    /* renamed from: c */
    public V mo3398c(int i) {
        this.f2808j = 0;
        return (V) super.mo3398c(i);
    }

    @Override // p000.C2573i0, java.util.Map
    public void clear() {
        this.f2808j = 0;
        super.clear();
    }

    @Override // p000.C2573i0, java.util.Map
    public int hashCode() {
        if (this.f2808j == 0) {
            this.f2808j = super.hashCode();
        }
        return this.f2808j;
    }

    @Override // p000.C2573i0, java.util.Map
    public V put(K k, V v) {
        this.f2808j = 0;
        return (V) super.put(k, v);
    }
}
