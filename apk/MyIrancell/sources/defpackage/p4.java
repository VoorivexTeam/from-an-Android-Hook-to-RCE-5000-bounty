package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class p4 {
    private List<g5> a = new ArrayList();

    public void a(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            u9.a(path, this.a.get(size));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g5 g5Var) {
        this.a.add(g5Var);
    }
}
