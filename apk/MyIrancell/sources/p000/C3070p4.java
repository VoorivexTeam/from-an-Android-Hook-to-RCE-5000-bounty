package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p4 */
/* loaded from: classes.dex */
public class C3070p4 {

    /* renamed from: a */
    private List<C2498g5> f12554a = new ArrayList();

    /* renamed from: a */
    public void m14713a(Path path) {
        for (int size = this.f12554a.size() - 1; size >= 0; size--) {
            C3295u9.m15762a(path, this.f12554a.get(size));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14714a(C2498g5 c2498g5) {
        this.f12554a.add(c2498g5);
    }
}
