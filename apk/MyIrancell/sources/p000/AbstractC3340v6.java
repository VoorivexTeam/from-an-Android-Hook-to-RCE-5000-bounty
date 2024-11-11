package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: v6 */
/* loaded from: classes.dex */
abstract class AbstractC3340v6<V, O> implements InterfaceC3289u6<V, O> {

    /* renamed from: a */
    final List<C3346v9<V>> f13622a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3340v6(V v) {
        this(Collections.singletonList(new C3346v9(v)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3340v6(List<C3346v9<V>> list) {
        this.f13622a = list;
    }

    @Override // p000.InterfaceC3289u6
    /* renamed from: b */
    public List<C3346v9<V>> mo14046b() {
        return this.f13622a;
    }

    @Override // p000.InterfaceC3289u6
    /* renamed from: c */
    public boolean mo14047c() {
        return this.f13622a.isEmpty() || (this.f13622a.size() == 1 && this.f13622a.get(0).m15980g());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f13622a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f13622a.toArray()));
        }
        return sb.toString();
    }
}
