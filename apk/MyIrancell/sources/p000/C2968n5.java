package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n5 */
/* loaded from: classes.dex */
public class C2968n5 {

    /* renamed from: a */
    private final List<AbstractC2538h5<C2540h7, Path>> f12214a;

    /* renamed from: b */
    private final List<AbstractC2538h5<Integer, Integer>> f12215b;

    /* renamed from: c */
    private final List<C0507c7> f12216c;

    public C2968n5(List<C0507c7> list) {
        this.f12216c = list;
        this.f12214a = new ArrayList(list.size());
        this.f12215b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f12214a.add(list.get(i).m3605b().mo12378a());
            this.f12215b.add(list.get(i).m3606c().mo12378a());
        }
    }

    /* renamed from: a */
    public List<AbstractC2538h5<C2540h7, Path>> m14232a() {
        return this.f12214a;
    }

    /* renamed from: b */
    public List<C0507c7> m14233b() {
        return this.f12216c;
    }

    /* renamed from: c */
    public List<AbstractC2538h5<Integer, Integer>> m14234c() {
        return this.f12215b;
    }
}
