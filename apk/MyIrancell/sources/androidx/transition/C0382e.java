package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0288l;
import androidx.transition.AbstractC0396l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.transition.e */
/* loaded from: classes.dex */
public class C0382e extends AbstractC0288l {

    /* renamed from: androidx.transition.e$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0396l.e {

        /* renamed from: a */
        final /* synthetic */ Rect f2420a;

        a(C0382e c0382e, Rect rect) {
            this.f2420a = rect;
        }
    }

    /* renamed from: androidx.transition.e$b */
    /* loaded from: classes.dex */
    class b implements AbstractC0396l.f {

        /* renamed from: a */
        final /* synthetic */ View f2421a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2422b;

        b(C0382e c0382e, View view, ArrayList arrayList) {
            this.f2421a = view;
            this.f2422b = arrayList;
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: a */
        public void mo2969a(AbstractC0396l abstractC0396l) {
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: b */
        public void mo2937b(AbstractC0396l abstractC0396l) {
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: c */
        public void mo2938c(AbstractC0396l abstractC0396l) {
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: d */
        public void mo2939d(AbstractC0396l abstractC0396l) {
            abstractC0396l.mo3020b(this);
            this.f2421a.setVisibility(8);
            int size = this.f2422b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2422b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: androidx.transition.e$c */
    /* loaded from: classes.dex */
    class c implements AbstractC0396l.f {

        /* renamed from: a */
        final /* synthetic */ Object f2423a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2424b;

        /* renamed from: c */
        final /* synthetic */ Object f2425c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2426d;

        /* renamed from: e */
        final /* synthetic */ Object f2427e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2428f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2423a = obj;
            this.f2424b = arrayList;
            this.f2425c = obj2;
            this.f2426d = arrayList2;
            this.f2427e = obj3;
            this.f2428f = arrayList3;
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: a */
        public void mo2969a(AbstractC0396l abstractC0396l) {
            Object obj = this.f2423a;
            if (obj != null) {
                C0382e.this.mo1977a(obj, this.f2424b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2425c;
            if (obj2 != null) {
                C0382e.this.mo1977a(obj2, this.f2426d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2427e;
            if (obj3 != null) {
                C0382e.this.mo1977a(obj3, this.f2428f, (ArrayList<View>) null);
            }
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: b */
        public void mo2937b(AbstractC0396l abstractC0396l) {
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: c */
        public void mo2938c(AbstractC0396l abstractC0396l) {
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: d */
        public void mo2939d(AbstractC0396l abstractC0396l) {
        }
    }

    /* renamed from: androidx.transition.e$d */
    /* loaded from: classes.dex */
    class d extends AbstractC0396l.e {

        /* renamed from: a */
        final /* synthetic */ Rect f2430a;

        d(C0382e c0382e, Rect rect) {
            this.f2430a = rect;
        }
    }

    /* renamed from: a */
    private static boolean m2968a(AbstractC0396l abstractC0396l) {
        return (AbstractC0288l.m1988a((List) abstractC0396l.m3033m()) && AbstractC0288l.m1988a((List) abstractC0396l.m3034n()) && AbstractC0288l.m1988a((List) abstractC0396l.m3035o())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public Object mo1970a(Object obj, Object obj2, Object obj3) {
        AbstractC0396l abstractC0396l = (AbstractC0396l) obj;
        AbstractC0396l abstractC0396l2 = (AbstractC0396l) obj2;
        AbstractC0396l abstractC0396l3 = (AbstractC0396l) obj3;
        if (abstractC0396l != null && abstractC0396l2 != null) {
            C0400p c0400p = new C0400p();
            c0400p.m3049a(abstractC0396l);
            c0400p.m3049a(abstractC0396l2);
            c0400p.m3050b(1);
            abstractC0396l = c0400p;
        } else if (abstractC0396l == null) {
            abstractC0396l = abstractC0396l2 != null ? abstractC0396l2 : null;
        }
        if (abstractC0396l3 == null) {
            return abstractC0396l;
        }
        C0400p c0400p2 = new C0400p();
        if (abstractC0396l != null) {
            c0400p2.m3049a(abstractC0396l);
        }
        c0400p2.m3049a(abstractC0396l3);
        return c0400p2;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1971a(ViewGroup viewGroup, Object obj) {
        C0398n.m3040a(viewGroup, (AbstractC0396l) obj);
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1972a(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0396l) obj).mo3015a(new d(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1973a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0396l) obj).mo3005a(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1974a(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC0396l) obj).mo3006a(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1975a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC0396l) obj).mo3006a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1976a(Object obj, ArrayList<View> arrayList) {
        AbstractC0396l abstractC0396l = (AbstractC0396l) obj;
        if (abstractC0396l == null) {
            return;
        }
        int i = 0;
        if (abstractC0396l instanceof C0400p) {
            C0400p c0400p = (C0400p) abstractC0396l;
            int m3051t = c0400p.m3051t();
            while (i < m3051t) {
                mo1976a(c0400p.m3048a(i), arrayList);
                i++;
            }
            return;
        }
        if (m2968a(abstractC0396l) || !AbstractC0288l.m1988a((List) abstractC0396l.m3036p())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            abstractC0396l.mo3005a(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1977a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC0396l abstractC0396l = (AbstractC0396l) obj;
        int i = 0;
        if (abstractC0396l instanceof C0400p) {
            C0400p c0400p = (C0400p) abstractC0396l;
            int m3051t = c0400p.m3051t();
            while (i < m3051t) {
                mo1977a((Object) c0400p.m3048a(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m2968a(abstractC0396l)) {
            return;
        }
        List<View> m3036p = abstractC0396l.m3036p();
        if (m3036p.size() == arrayList.size() && m3036p.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                abstractC0396l.mo3005a(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0396l.mo3026d(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public boolean mo1978a(Object obj) {
        return obj instanceof AbstractC0396l;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public Object mo1979b(Object obj) {
        if (obj != null) {
            return ((AbstractC0396l) obj).mo16978clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public Object mo1980b(Object obj, Object obj2, Object obj3) {
        C0400p c0400p = new C0400p();
        if (obj != null) {
            c0400p.m3049a((AbstractC0396l) obj);
        }
        if (obj2 != null) {
            c0400p.m3049a((AbstractC0396l) obj2);
        }
        if (obj3 != null) {
            c0400p.m3049a((AbstractC0396l) obj3);
        }
        return c0400p;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public void mo1981b(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0396l) obj).mo3026d(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public void mo1982b(Object obj, View view, ArrayList<View> arrayList) {
        C0400p c0400p = (C0400p) obj;
        List<View> m3036p = c0400p.m3036p();
        m3036p.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0288l.m1987a(m3036p, arrayList.get(i));
        }
        m3036p.add(view);
        arrayList.add(view);
        mo1976a(c0400p, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public void mo1983b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0400p c0400p = (C0400p) obj;
        if (c0400p != null) {
            c0400p.m3036p().clear();
            c0400p.m3036p().addAll(arrayList2);
            mo1977a((Object) c0400p, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: c */
    public Object mo1984c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0400p c0400p = new C0400p();
        c0400p.m3049a((AbstractC0396l) obj);
        return c0400p;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: c */
    public void mo1985c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1991a(view, rect);
            ((AbstractC0396l) obj).mo3015a(new a(this, rect));
        }
    }
}
