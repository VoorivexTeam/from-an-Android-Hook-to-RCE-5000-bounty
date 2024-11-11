package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class n5 {
    private final List<h5<h7, Path>> a;
    private final List<h5<Integer, Integer>> b;
    private final List<c7> c;

    public n5(List<c7> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<h5<h7, Path>> a() {
        return this.a;
    }

    public List<c7> b() {
        return this.c;
    }

    public List<h5<Integer, Integer>> c() {
        return this.b;
    }
}
