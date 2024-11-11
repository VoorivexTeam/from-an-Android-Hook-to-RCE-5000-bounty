package defpackage;

/* loaded from: classes.dex */
public final class bi<K, V> extends c0<K, V> {
    private int j;

    @Override // defpackage.i0
    public V a(int i, V v) {
        this.j = 0;
        return (V) super.a(i, (int) v);
    }

    @Override // defpackage.i0
    public void a(i0<? extends K, ? extends V> i0Var) {
        this.j = 0;
        super.a((i0) i0Var);
    }

    @Override // defpackage.i0
    public V c(int i) {
        this.j = 0;
        return (V) super.c(i);
    }

    @Override // defpackage.i0, java.util.Map
    public void clear() {
        this.j = 0;
        super.clear();
    }

    @Override // defpackage.i0, java.util.Map
    public int hashCode() {
        if (this.j == 0) {
            this.j = super.hashCode();
        }
        return this.j;
    }

    @Override // defpackage.i0, java.util.Map
    public V put(K k, V v) {
        this.j = 0;
        return (V) super.put(k, v);
    }
}
