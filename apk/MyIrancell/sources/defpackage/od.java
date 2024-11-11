package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface od<Model, Data> {

    /* loaded from: classes.dex */
    public static class a<Data> {
        public final g a;
        public final List<g> b;
        public final ka<Data> c;

        public a(g gVar, List<g> list, ka<Data> kaVar) {
            ji.a(gVar);
            this.a = gVar;
            ji.a(list);
            this.b = list;
            ji.a(kaVar);
            this.c = kaVar;
        }

        public a(g gVar, ka<Data> kaVar) {
            this(gVar, Collections.emptyList(), kaVar);
        }
    }

    a<Data> a(Model model, int i, int i2, i iVar);

    boolean a(Model model);
}
