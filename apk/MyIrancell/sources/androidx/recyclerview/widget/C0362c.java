package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C3107q2;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C0362c extends AbstractC0370k {

    /* renamed from: s */
    private static TimeInterpolator f2242s;

    /* renamed from: h */
    private ArrayList<RecyclerView.AbstractC0330c0> f2243h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.AbstractC0330c0> f2244i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<j> f2245j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<i> f2246k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.AbstractC0330c0>> f2247l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<j>> f2248m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<i>> f2249n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.AbstractC0330c0> f2250o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.AbstractC0330c0> f2251p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.AbstractC0330c0> f2252q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.AbstractC0330c0> f2253r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2254b;

        a(ArrayList arrayList) {
            this.f2254b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2254b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                C0362c.this.m2797b(jVar.f2288a, jVar.f2289b, jVar.f2290c, jVar.f2291d, jVar.f2292e);
            }
            this.f2254b.clear();
            C0362c.this.f2248m.remove(this.f2254b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2256b;

        b(ArrayList arrayList) {
            this.f2256b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2256b.iterator();
            while (it.hasNext()) {
                C0362c.this.m2793a((i) it.next());
            }
            this.f2256b.clear();
            C0362c.this.f2249n.remove(this.f2256b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2258b;

        c(ArrayList arrayList) {
            this.f2258b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2258b.iterator();
            while (it.hasNext()) {
                C0362c.this.m2801t((RecyclerView.AbstractC0330c0) it.next());
            }
            this.f2258b.clear();
            C0362c.this.f2247l.remove(this.f2258b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0330c0 f2260a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2261b;

        /* renamed from: c */
        final /* synthetic */ View f2262c;

        d(RecyclerView.AbstractC0330c0 abstractC0330c0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2260a = abstractC0330c0;
            this.f2261b = viewPropertyAnimator;
            this.f2262c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2261b.setListener(null);
            this.f2262c.setAlpha(1.0f);
            C0362c.this.m2878l(this.f2260a);
            C0362c.this.f2252q.remove(this.f2260a);
            C0362c.this.m2800j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0362c.this.m2879m(this.f2260a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0330c0 f2264a;

        /* renamed from: b */
        final /* synthetic */ View f2265b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f2266c;

        e(RecyclerView.AbstractC0330c0 abstractC0330c0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2264a = abstractC0330c0;
            this.f2265b = view;
            this.f2266c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2265b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2266c.setListener(null);
            C0362c.this.m2874h(this.f2264a);
            C0362c.this.f2250o.remove(this.f2264a);
            C0362c.this.m2800j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0362c.this.m2875i(this.f2264a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0330c0 f2268a;

        /* renamed from: b */
        final /* synthetic */ int f2269b;

        /* renamed from: c */
        final /* synthetic */ View f2270c;

        /* renamed from: d */
        final /* synthetic */ int f2271d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f2272e;

        f(RecyclerView.AbstractC0330c0 abstractC0330c0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2268a = abstractC0330c0;
            this.f2269b = i;
            this.f2270c = view;
            this.f2271d = i2;
            this.f2272e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f2269b != 0) {
                this.f2270c.setTranslationX(0.0f);
            }
            if (this.f2271d != 0) {
                this.f2270c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2272e.setListener(null);
            C0362c.this.m2876j(this.f2268a);
            C0362c.this.f2251p.remove(this.f2268a);
            C0362c.this.m2800j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0362c.this.m2877k(this.f2268a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f2274a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2275b;

        /* renamed from: c */
        final /* synthetic */ View f2276c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2274a = iVar;
            this.f2275b = viewPropertyAnimator;
            this.f2276c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2275b.setListener(null);
            this.f2276c.setAlpha(1.0f);
            this.f2276c.setTranslationX(0.0f);
            this.f2276c.setTranslationY(0.0f);
            C0362c.this.m2870a(this.f2274a.f2282a, true);
            C0362c.this.f2253r.remove(this.f2274a.f2282a);
            C0362c.this.m2800j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0362c.this.m2871b(this.f2274a.f2282a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f2278a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2279b;

        /* renamed from: c */
        final /* synthetic */ View f2280c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2278a = iVar;
            this.f2279b = viewPropertyAnimator;
            this.f2280c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2279b.setListener(null);
            this.f2280c.setAlpha(1.0f);
            this.f2280c.setTranslationX(0.0f);
            this.f2280c.setTranslationY(0.0f);
            C0362c.this.m2870a(this.f2278a.f2283b, false);
            C0362c.this.f2253r.remove(this.f2278a.f2283b);
            C0362c.this.m2800j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0362c.this.m2871b(this.f2278a.f2283b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public RecyclerView.AbstractC0330c0 f2282a;

        /* renamed from: b */
        public RecyclerView.AbstractC0330c0 f2283b;

        /* renamed from: c */
        public int f2284c;

        /* renamed from: d */
        public int f2285d;

        /* renamed from: e */
        public int f2286e;

        /* renamed from: f */
        public int f2287f;

        private i(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0330c0 abstractC0330c02) {
            this.f2282a = abstractC0330c0;
            this.f2283b = abstractC0330c02;
        }

        i(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0330c0 abstractC0330c02, int i, int i2, int i3, int i4) {
            this(abstractC0330c0, abstractC0330c02);
            this.f2284c = i;
            this.f2285d = i2;
            this.f2286e = i3;
            this.f2287f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2282a + ", newHolder=" + this.f2283b + ", fromX=" + this.f2284c + ", fromY=" + this.f2285d + ", toX=" + this.f2286e + ", toY=" + this.f2287f + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a */
        public RecyclerView.AbstractC0330c0 f2288a;

        /* renamed from: b */
        public int f2289b;

        /* renamed from: c */
        public int f2290c;

        /* renamed from: d */
        public int f2291d;

        /* renamed from: e */
        public int f2292e;

        j(RecyclerView.AbstractC0330c0 abstractC0330c0, int i, int i2, int i3, int i4) {
            this.f2288a = abstractC0330c0;
            this.f2289b = i;
            this.f2290c = i2;
            this.f2291d = i3;
            this.f2292e = i4;
        }
    }

    /* renamed from: a */
    private void m2788a(List<i> list, RecyclerView.AbstractC0330c0 abstractC0330c0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (m2789a(iVar, abstractC0330c0) && iVar.f2282a == null && iVar.f2283b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m2789a(i iVar, RecyclerView.AbstractC0330c0 abstractC0330c0) {
        boolean z = false;
        if (iVar.f2283b == abstractC0330c0) {
            iVar.f2283b = null;
        } else {
            if (iVar.f2282a != abstractC0330c0) {
                return false;
            }
            iVar.f2282a = null;
            z = true;
        }
        abstractC0330c0.f2076a.setAlpha(1.0f);
        abstractC0330c0.f2076a.setTranslationX(0.0f);
        abstractC0330c0.f2076a.setTranslationY(0.0f);
        m2870a(abstractC0330c0, z);
        return true;
    }

    /* renamed from: b */
    private void m2790b(i iVar) {
        RecyclerView.AbstractC0330c0 abstractC0330c0 = iVar.f2282a;
        if (abstractC0330c0 != null) {
            m2789a(iVar, abstractC0330c0);
        }
        RecyclerView.AbstractC0330c0 abstractC0330c02 = iVar.f2283b;
        if (abstractC0330c02 != null) {
            m2789a(iVar, abstractC0330c02);
        }
    }

    /* renamed from: u */
    private void m2791u(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        View view = abstractC0330c0.f2076a;
        ViewPropertyAnimator animate = view.animate();
        this.f2252q.add(abstractC0330c0);
        animate.setDuration(m2437f()).alpha(0.0f).setListener(new d(abstractC0330c0, animate, view)).start();
    }

    /* renamed from: v */
    private void m2792v(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        if (f2242s == null) {
            f2242s = new ValueAnimator().getInterpolator();
        }
        abstractC0330c0.f2076a.animate().setInterpolator(f2242s);
        mo2432c(abstractC0330c0);
    }

    /* renamed from: a */
    void m2793a(i iVar) {
        RecyclerView.AbstractC0330c0 abstractC0330c0 = iVar.f2282a;
        View view = abstractC0330c0 == null ? null : abstractC0330c0.f2076a;
        RecyclerView.AbstractC0330c0 abstractC0330c02 = iVar.f2283b;
        View view2 = abstractC0330c02 != null ? abstractC0330c02.f2076a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m2434d());
            this.f2253r.add(iVar.f2282a);
            duration.translationX(iVar.f2286e - iVar.f2284c);
            duration.translationY(iVar.f2287f - iVar.f2285d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f2253r.add(iVar.f2283b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m2434d()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* renamed from: a */
    void m2794a(List<RecyclerView.AbstractC0330c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2076a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0370k
    /* renamed from: a */
    public boolean mo2795a(RecyclerView.AbstractC0330c0 abstractC0330c0, int i2, int i3, int i4, int i5) {
        View view = abstractC0330c0.f2076a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) abstractC0330c0.f2076a.getTranslationY());
        m2792v(abstractC0330c0);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            m2876j(abstractC0330c0);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f2245j.add(new j(abstractC0330c0, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0370k
    /* renamed from: a */
    public boolean mo2796a(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0330c0 abstractC0330c02, int i2, int i3, int i4, int i5) {
        if (abstractC0330c0 == abstractC0330c02) {
            return mo2795a(abstractC0330c0, i2, i3, i4, i5);
        }
        float translationX = abstractC0330c0.f2076a.getTranslationX();
        float translationY = abstractC0330c0.f2076a.getTranslationY();
        float alpha = abstractC0330c0.f2076a.getAlpha();
        m2792v(abstractC0330c0);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        abstractC0330c0.f2076a.setTranslationX(translationX);
        abstractC0330c0.f2076a.setTranslationY(translationY);
        abstractC0330c0.f2076a.setAlpha(alpha);
        if (abstractC0330c02 != null) {
            m2792v(abstractC0330c02);
            abstractC0330c02.f2076a.setTranslationX(-i6);
            abstractC0330c02.f2076a.setTranslationY(-i7);
            abstractC0330c02.f2076a.setAlpha(0.0f);
        }
        this.f2246k.add(new i(abstractC0330c0, abstractC0330c02, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: a */
    public boolean mo2427a(RecyclerView.AbstractC0330c0 abstractC0330c0, List<Object> list) {
        return !list.isEmpty() || super.mo2427a(abstractC0330c0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: b */
    public void mo2428b() {
        int size = this.f2245j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f2245j.get(size);
            View view = jVar.f2288a.f2076a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2876j(jVar.f2288a);
            this.f2245j.remove(size);
        }
        for (int size2 = this.f2243h.size() - 1; size2 >= 0; size2--) {
            m2878l(this.f2243h.get(size2));
            this.f2243h.remove(size2);
        }
        int size3 = this.f2244i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0330c0 abstractC0330c0 = this.f2244i.get(size3);
            abstractC0330c0.f2076a.setAlpha(1.0f);
            m2874h(abstractC0330c0);
            this.f2244i.remove(size3);
        }
        for (int size4 = this.f2246k.size() - 1; size4 >= 0; size4--) {
            m2790b(this.f2246k.get(size4));
        }
        this.f2246k.clear();
        if (mo2438g()) {
            for (int size5 = this.f2248m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f2248m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f2288a.f2076a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2876j(jVar2.f2288a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2248m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2247l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0330c0> arrayList2 = this.f2247l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0330c0 abstractC0330c02 = arrayList2.get(size8);
                    abstractC0330c02.f2076a.setAlpha(1.0f);
                    m2874h(abstractC0330c02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2247l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2249n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f2249n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m2790b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2249n.remove(arrayList3);
                    }
                }
            }
            m2794a(this.f2252q);
            m2794a(this.f2251p);
            m2794a(this.f2250o);
            m2794a(this.f2253r);
            m2422a();
        }
    }

    /* renamed from: b */
    void m2797b(RecyclerView.AbstractC0330c0 abstractC0330c0, int i2, int i3, int i4, int i5) {
        View view = abstractC0330c0.f2076a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f2251p.add(abstractC0330c0);
        animate.setDuration(m2436e()).setListener(new f(abstractC0330c0, i6, view, i7, animate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: c */
    public void mo2432c(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        View view = abstractC0330c0.f2076a;
        view.animate().cancel();
        int size = this.f2245j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f2245j.get(size).f2288a == abstractC0330c0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2876j(abstractC0330c0);
                this.f2245j.remove(size);
            }
        }
        m2788a(this.f2246k, abstractC0330c0);
        if (this.f2243h.remove(abstractC0330c0)) {
            view.setAlpha(1.0f);
            m2878l(abstractC0330c0);
        }
        if (this.f2244i.remove(abstractC0330c0)) {
            view.setAlpha(1.0f);
            m2874h(abstractC0330c0);
        }
        for (int size2 = this.f2249n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f2249n.get(size2);
            m2788a(arrayList, abstractC0330c0);
            if (arrayList.isEmpty()) {
                this.f2249n.remove(size2);
            }
        }
        for (int size3 = this.f2248m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f2248m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f2288a == abstractC0330c0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2876j(abstractC0330c0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2248m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2247l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0330c0> arrayList3 = this.f2247l.get(size5);
            if (arrayList3.remove(abstractC0330c0)) {
                view.setAlpha(1.0f);
                m2874h(abstractC0330c0);
                if (arrayList3.isEmpty()) {
                    this.f2247l.remove(size5);
                }
            }
        }
        this.f2252q.remove(abstractC0330c0);
        this.f2250o.remove(abstractC0330c0);
        this.f2253r.remove(abstractC0330c0);
        this.f2251p.remove(abstractC0330c0);
        m2800j();
    }

    @Override // androidx.recyclerview.widget.AbstractC0370k
    /* renamed from: f */
    public boolean mo2798f(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2792v(abstractC0330c0);
        abstractC0330c0.f2076a.setAlpha(0.0f);
        this.f2244i.add(abstractC0330c0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: g */
    public boolean mo2438g() {
        return (this.f2244i.isEmpty() && this.f2246k.isEmpty() && this.f2245j.isEmpty() && this.f2243h.isEmpty() && this.f2251p.isEmpty() && this.f2252q.isEmpty() && this.f2250o.isEmpty() && this.f2253r.isEmpty() && this.f2248m.isEmpty() && this.f2247l.isEmpty() && this.f2249n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0370k
    /* renamed from: g */
    public boolean mo2799g(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2792v(abstractC0330c0);
        this.f2243h.add(abstractC0330c0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l
    /* renamed from: i */
    public void mo2440i() {
        boolean z = !this.f2243h.isEmpty();
        boolean z2 = !this.f2245j.isEmpty();
        boolean z3 = !this.f2246k.isEmpty();
        boolean z4 = !this.f2244i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC0330c0> it = this.f2243h.iterator();
            while (it.hasNext()) {
                m2791u(it.next());
            }
            this.f2243h.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f2245j);
                this.f2248m.add(arrayList);
                this.f2245j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    C3107q2.m14893a(arrayList.get(0).f2288a.f2076a, aVar, m2437f());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f2246k);
                this.f2249n.add(arrayList2);
                this.f2246k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    C3107q2.m14893a(arrayList2.get(0).f2282a.f2076a, bVar, m2437f());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC0330c0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f2244i);
                this.f2247l.add(arrayList3);
                this.f2244i.clear();
                c cVar = new c(arrayList3);
                if (z || z2 || z3) {
                    C3107q2.m14893a(arrayList3.get(0).f2076a, cVar, (z ? m2437f() : 0L) + Math.max(z2 ? m2436e() : 0L, z3 ? m2434d() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* renamed from: j */
    void m2800j() {
        if (mo2438g()) {
            return;
        }
        m2422a();
    }

    /* renamed from: t */
    void m2801t(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        View view = abstractC0330c0.f2076a;
        ViewPropertyAnimator animate = view.animate();
        this.f2250o.add(abstractC0330c0);
        animate.alpha(1.0f).setDuration(m2431c()).setListener(new e(abstractC0330c0, view, animate)).start();
    }
}
