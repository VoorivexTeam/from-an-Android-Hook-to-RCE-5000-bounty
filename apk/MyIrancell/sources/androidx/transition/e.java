package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e extends androidx.fragment.app.l {

    /* loaded from: classes.dex */
    class a extends l.e {
        final /* synthetic */ Rect a;

        a(e eVar, Rect rect) {
            this.a = rect;
        }
    }

    /* loaded from: classes.dex */
    class b implements l.f {
        final /* synthetic */ View a;
        final /* synthetic */ ArrayList b;

        b(e eVar, View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // androidx.transition.l.f
        public void a(l lVar) {
        }

        @Override // androidx.transition.l.f
        public void b(l lVar) {
        }

        @Override // androidx.transition.l.f
        public void c(l lVar) {
        }

        @Override // androidx.transition.l.f
        public void d(l lVar) {
            lVar.b(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements l.f {
        final /* synthetic */ Object a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ Object c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Object e;
        final /* synthetic */ ArrayList f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // androidx.transition.l.f
        public void a(l lVar) {
            Object obj = this.a;
            if (obj != null) {
                e.this.a(obj, this.b, (ArrayList<View>) null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                e.this.a(obj2, this.d, (ArrayList<View>) null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                e.this.a(obj3, this.f, (ArrayList<View>) null);
            }
        }

        @Override // androidx.transition.l.f
        public void b(l lVar) {
        }

        @Override // androidx.transition.l.f
        public void c(l lVar) {
        }

        @Override // androidx.transition.l.f
        public void d(l lVar) {
        }
    }

    /* loaded from: classes.dex */
    class d extends l.e {
        final /* synthetic */ Rect a;

        d(e eVar, Rect rect) {
            this.a = rect;
        }
    }

    private static boolean a(l lVar) {
        return (androidx.fragment.app.l.a((List) lVar.m()) && androidx.fragment.app.l.a((List) lVar.n()) && androidx.fragment.app.l.a((List) lVar.o())) ? false : true;
    }

    @Override // androidx.fragment.app.l
    public Object a(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        l lVar3 = (l) obj3;
        if (lVar != null && lVar2 != null) {
            p pVar = new p();
            pVar.a(lVar);
            pVar.a(lVar2);
            pVar.b(1);
            lVar = pVar;
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar2 = new p();
        if (lVar != null) {
            pVar2.a(lVar);
        }
        pVar2.a(lVar3);
        return pVar2;
    }

    @Override // androidx.fragment.app.l
    public void a(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    @Override // androidx.fragment.app.l
    public void a(Object obj, Rect rect) {
        if (obj != null) {
            ((l) obj).a(new d(this, rect));
        }
    }

    @Override // androidx.fragment.app.l
    public void a(Object obj, View view) {
        if (obj != null) {
            ((l) obj).a(view);
        }
    }

    @Override // androidx.fragment.app.l
    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ((l) obj).a(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.l
    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.l
    public void a(Object obj, ArrayList<View> arrayList) {
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        int i = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int t = pVar.t();
            while (i < t) {
                a(pVar.a(i), arrayList);
                i++;
            }
            return;
        }
        if (a(lVar) || !androidx.fragment.app.l.a((List) lVar.p())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            lVar.a(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.l
    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        l lVar = (l) obj;
        int i = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int t = pVar.t();
            while (i < t) {
                a((Object) pVar.a(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (a(lVar)) {
            return;
        }
        List<View> p = lVar.p();
        if (p.size() == arrayList.size() && p.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                lVar.a(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                lVar.d(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.l
    public boolean a(Object obj) {
        return obj instanceof l;
    }

    @Override // androidx.fragment.app.l
    public Object b(Object obj) {
        if (obj != null) {
            return ((l) obj).mo0clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.l
    public Object b(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.a((l) obj);
        }
        if (obj2 != null) {
            pVar.a((l) obj2);
        }
        if (obj3 != null) {
            pVar.a((l) obj3);
        }
        return pVar;
    }

    @Override // androidx.fragment.app.l
    public void b(Object obj, View view) {
        if (obj != null) {
            ((l) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.l
    public void b(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        List<View> p = pVar.p();
        p.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.l.a(p, arrayList.get(i));
        }
        p.add(view);
        arrayList.add(view);
        a(pVar, arrayList);
    }

    @Override // androidx.fragment.app.l
    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.p().clear();
            pVar.p().addAll(arrayList2);
            a((Object) pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.l
    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.a((l) obj);
        return pVar;
    }

    @Override // androidx.fragment.app.l
    public void c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((l) obj).a(new a(this, rect));
        }
    }
}
