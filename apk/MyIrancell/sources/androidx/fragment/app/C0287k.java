package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
class C0287k extends AbstractC0288l {

    /* renamed from: androidx.fragment.app.k$a */
    /* loaded from: classes.dex */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f1841a;

        a(C0287k c0287k, Rect rect) {
            this.f1841a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f1841a;
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    /* loaded from: classes.dex */
    class b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f1842a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f1843b;

        b(C0287k c0287k, View view, ArrayList arrayList) {
            this.f1842a = view;
            this.f1843b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1842a.setVisibility(8);
            int size = this.f1843b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1843b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.k$c */
    /* loaded from: classes.dex */
    class c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f1844a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f1845b;

        /* renamed from: c */
        final /* synthetic */ Object f1846c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f1847d;

        /* renamed from: e */
        final /* synthetic */ Object f1848e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f1849f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1844a = obj;
            this.f1845b = arrayList;
            this.f1846c = obj2;
            this.f1847d = arrayList2;
            this.f1848e = obj3;
            this.f1849f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f1844a;
            if (obj != null) {
                C0287k.this.mo1977a(obj, this.f1845b, (ArrayList<View>) null);
            }
            Object obj2 = this.f1846c;
            if (obj2 != null) {
                C0287k.this.mo1977a(obj2, this.f1847d, (ArrayList<View>) null);
            }
            Object obj3 = this.f1848e;
            if (obj3 != null) {
                C0287k.this.mo1977a(obj3, this.f1849f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$d */
    /* loaded from: classes.dex */
    class d extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f1851a;

        d(C0287k c0287k, Rect rect) {
            this.f1851a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1851a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1851a;
        }
    }

    /* renamed from: a */
    private static boolean m1969a(Transition transition) {
        return (AbstractC0288l.m1988a((List) transition.getTargetIds()) && AbstractC0288l.m1988a((List) transition.getTargetNames()) && AbstractC0288l.m1988a((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public Object mo1970a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1971a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1972a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new d(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1973a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1974a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1975a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1976a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1976a(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m1969a(transition) || !AbstractC0288l.m1988a((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public void mo1977a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1977a((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m1969a(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: a */
    public boolean mo1978a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public Object mo1979b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public Object mo1980b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public void mo1981b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public void mo1982b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0288l.m1987a(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1976a(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: b */
    public void mo1983b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo1977a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: c */
    public Object mo1984c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0288l
    /* renamed from: c */
    public void mo1985c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1991a(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }
}
