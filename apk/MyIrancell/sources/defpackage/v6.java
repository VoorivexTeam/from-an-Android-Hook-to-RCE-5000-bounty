package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class v6<V, O> implements u6<V, O> {
    final List<v9<V>> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v6(V v) {
        this(Collections.singletonList(new v9(v)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v6(List<v9<V>> list) {
        this.a = list;
    }

    @Override // defpackage.u6
    public List<v9<V>> b() {
        return this.a;
    }

    @Override // defpackage.u6
    public boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && this.a.get(0).g());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
