package p000;

import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.InterfaceC0573g;
import java.util.Collections;
import java.util.List;

/* renamed from: od */
/* loaded from: classes.dex */
public interface InterfaceC3031od<Model, Data> {

    /* renamed from: od$a */
    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a */
        public final InterfaceC0573g f12454a;

        /* renamed from: b */
        public final List<InterfaceC0573g> f12455b;

        /* renamed from: c */
        public final InterfaceC2853ka<Data> f12456c;

        public a(InterfaceC0573g interfaceC0573g, List<InterfaceC0573g> list, InterfaceC2853ka<Data> interfaceC2853ka) {
            C2816ji.m13459a(interfaceC0573g);
            this.f12454a = interfaceC0573g;
            C2816ji.m13459a(list);
            this.f12455b = list;
            C2816ji.m13459a(interfaceC2853ka);
            this.f12456c = interfaceC2853ka;
        }

        public a(InterfaceC0573g interfaceC0573g, InterfaceC2853ka<Data> interfaceC2853ka) {
            this(interfaceC0573g, Collections.emptyList(), interfaceC2853ka);
        }
    }

    /* renamed from: a */
    a<Data> mo137a(Model model, int i, int i2, C0575i c0575i);

    /* renamed from: a */
    boolean mo138a(Model model);
}
