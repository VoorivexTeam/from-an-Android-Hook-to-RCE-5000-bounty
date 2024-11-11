package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import defpackage.q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final g I = new a();
    private static ThreadLocal<defpackage.c0<Animator, d>> J = new ThreadLocal<>();
    o D;
    private e E;
    private defpackage.c0<String, String> F;
    private ArrayList<r> u;
    private ArrayList<r> v;
    private String b = getClass().getName();
    private long c = -1;
    long d = -1;
    private TimeInterpolator e = null;
    ArrayList<Integer> f = new ArrayList<>();
    ArrayList<View> g = new ArrayList<>();
    private ArrayList<String> h = null;
    private ArrayList<Class> i = null;
    private ArrayList<Integer> j = null;
    private ArrayList<View> k = null;
    private ArrayList<Class> l = null;
    private ArrayList<String> m = null;
    private ArrayList<Integer> n = null;
    private ArrayList<View> o = null;
    private ArrayList<Class> p = null;
    private s q = new s();
    private s r = new s();
    p s = null;
    private int[] t = H;
    boolean w = false;
    ArrayList<Animator> x = new ArrayList<>();
    private int y = 0;
    private boolean z = false;
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    private g G = I;

    /* loaded from: classes.dex */
    static class a extends g {
        a() {
        }

        @Override // androidx.transition.g
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        final /* synthetic */ defpackage.c0 a;

        b(defpackage.c0 c0Var) {
            this.a = c0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            l.this.x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.x.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.a();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        View a;
        String b;
        r c;
        k0 d;
        l e;

        d(View view, String str, l lVar, k0 k0Var, r rVar) {
            this.a = view;
            this.b = str;
            this.c = rVar;
            this.d = k0Var;
            this.e = lVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);
    }

    private void a(Animator animator, defpackage.c0<Animator, d> c0Var) {
        if (animator != null) {
            animator.addListener(new b(c0Var));
            a(animator);
        }
    }

    private static void a(s sVar, View view, r rVar) {
        sVar.a.put(view, rVar);
        int id = view.getId();
        if (id >= 0) {
            if (sVar.b.indexOfKey(id) >= 0) {
                sVar.b.put(id, null);
            } else {
                sVar.b.put(id, view);
            }
        }
        String p = q2.p(view);
        if (p != null) {
            if (sVar.d.containsKey(p)) {
                sVar.d.put(p, null);
            } else {
                sVar.d.put(p, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (sVar.c.d(itemIdAtPosition) < 0) {
                    q2.b(view, true);
                    sVar.c.c(itemIdAtPosition, view);
                    return;
                }
                View c2 = sVar.c.c(itemIdAtPosition);
                if (c2 != null) {
                    q2.b(c2, false);
                    sVar.c.c(itemIdAtPosition, null);
                }
            }
        }
    }

    private void a(s sVar, s sVar2) {
        defpackage.c0<View, r> c0Var = new defpackage.c0<>(sVar.a);
        defpackage.c0<View, r> c0Var2 = new defpackage.c0<>(sVar2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.t;
            if (i >= iArr.length) {
                a(c0Var, c0Var2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                b(c0Var, c0Var2);
            } else if (i2 == 2) {
                a(c0Var, c0Var2, sVar.d, sVar2.d);
            } else if (i2 == 3) {
                a(c0Var, c0Var2, sVar.b, sVar2.b);
            } else if (i2 == 4) {
                a(c0Var, c0Var2, sVar.c, sVar2.c);
            }
            i++;
        }
    }

    private void a(defpackage.c0<View, r> c0Var, defpackage.c0<View, r> c0Var2) {
        for (int i = 0; i < c0Var.size(); i++) {
            r d2 = c0Var.d(i);
            if (b(d2.b)) {
                this.u.add(d2);
                this.v.add(null);
            }
        }
        for (int i2 = 0; i2 < c0Var2.size(); i2++) {
            r d3 = c0Var2.d(i2);
            if (b(d3.b)) {
                this.v.add(d3);
                this.u.add(null);
            }
        }
    }

    private void a(defpackage.c0<View, r> c0Var, defpackage.c0<View, r> c0Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && b(view)) {
                r rVar = c0Var.get(valueAt);
                r rVar2 = c0Var2.get(view);
                if (rVar != null && rVar2 != null) {
                    this.u.add(rVar);
                    this.v.add(rVar2);
                    c0Var.remove(valueAt);
                    c0Var2.remove(view);
                }
            }
        }
    }

    private void a(defpackage.c0<View, r> c0Var, defpackage.c0<View, r> c0Var2, defpackage.c0<String, View> c0Var3, defpackage.c0<String, View> c0Var4) {
        View view;
        int size = c0Var3.size();
        for (int i = 0; i < size; i++) {
            View d2 = c0Var3.d(i);
            if (d2 != null && b(d2) && (view = c0Var4.get(c0Var3.b(i))) != null && b(view)) {
                r rVar = c0Var.get(d2);
                r rVar2 = c0Var2.get(view);
                if (rVar != null && rVar2 != null) {
                    this.u.add(rVar);
                    this.v.add(rVar2);
                    c0Var.remove(d2);
                    c0Var2.remove(view);
                }
            }
        }
    }

    private void a(defpackage.c0<View, r> c0Var, defpackage.c0<View, r> c0Var2, defpackage.f0<View> f0Var, defpackage.f0<View> f0Var2) {
        View c2;
        int b2 = f0Var.b();
        for (int i = 0; i < b2; i++) {
            View c3 = f0Var.c(i);
            if (c3 != null && b(c3) && (c2 = f0Var2.c(f0Var.a(i))) != null && b(c2)) {
                r rVar = c0Var.get(c3);
                r rVar2 = c0Var2.get(c2);
                if (rVar != null && rVar2 != null) {
                    this.u.add(rVar);
                    this.v.add(rVar2);
                    c0Var.remove(c3);
                    c0Var2.remove(c2);
                }
            }
        }
    }

    private static boolean a(r rVar, r rVar2, String str) {
        Object obj = rVar.a.get(str);
        Object obj2 = rVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void b(defpackage.c0<View, r> c0Var, defpackage.c0<View, r> c0Var2) {
        r remove;
        View view;
        for (int size = c0Var.size() - 1; size >= 0; size--) {
            View b2 = c0Var.b(size);
            if (b2 != null && b(b2) && (remove = c0Var2.remove(b2)) != null && (view = remove.b) != null && b(view)) {
                this.u.add(c0Var.c(size));
                this.v.add(remove);
            }
        }
    }

    private void c(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class> arrayList3 = this.l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.l.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    r rVar = new r();
                    rVar.b = view;
                    if (z) {
                        c(rVar);
                    } else {
                        a(rVar);
                    }
                    rVar.c.add(this);
                    b(rVar);
                    a(z ? this.q : this.r, view, rVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.o;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class> arrayList6 = this.p;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.p.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                c(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private static defpackage.c0<Animator, d> t() {
        defpackage.c0<Animator, d> c0Var = J.get();
        if (c0Var != null) {
            return c0Var;
        }
        defpackage.c0<Animator, d> c0Var2 = new defpackage.c0<>();
        J.set(c0Var2);
        return c0Var2;
    }

    public Animator a(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    public l a(long j) {
        this.d = j;
        return this;
    }

    public l a(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
        return this;
    }

    public l a(View view) {
        this.g.add(view);
        return this;
    }

    public l a(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r a(View view, boolean z) {
        p pVar = this.s;
        if (pVar != null) {
            return pVar.a(view, z);
        }
        ArrayList<r> arrayList = z ? this.u : this.v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            r rVar = arrayList.get(i2);
            if (rVar == null) {
                return null;
            }
            if (rVar.b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.v : this.u).get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.d != -1) {
            str2 = str2 + "dur(" + this.d + ") ";
        }
        if (this.c != -1) {
            str2 = str2 + "dly(" + this.c + ") ";
        }
        if (this.e != null) {
            str2 = str2 + "interp(" + this.e + ") ";
        }
        if (this.f.size() <= 0 && this.g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f.size() > 0) {
            for (int i = 0; i < this.f.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f.get(i);
            }
        }
        if (this.g.size() > 0) {
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.g.get(i2);
            }
        }
        return str3 + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).d(this);
                }
            }
            for (int i3 = 0; i3 < this.q.c.b(); i3++) {
                View c2 = this.q.c.c(i3);
                if (c2 != null) {
                    q2.b(c2, false);
                }
            }
            for (int i4 = 0; i4 < this.r.c.b(); i4++) {
                View c3 = this.r.c.c(i4);
                if (c3 != null) {
                    q2.b(c3, false);
                }
            }
            this.A = true;
        }
    }

    protected void a(Animator animator) {
        if (animator == null) {
            a();
            return;
        }
        if (b() >= 0) {
            animator.setDuration(b());
        }
        if (l() >= 0) {
            animator.setStartDelay(l());
        }
        if (g() != null) {
            animator.setInterpolator(g());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        a(this.q, this.r);
        defpackage.c0<Animator, d> t = t();
        int size = t.size();
        k0 d2 = c0.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b2 = t.b(i);
            if (b2 != null && (dVar = t.get(b2)) != null && dVar.a != null && d2.equals(dVar.d)) {
                r rVar = dVar.c;
                View view = dVar.a;
                r b3 = b(view, true);
                r a2 = a(view, true);
                if (!(b3 == null && a2 == null) && dVar.e.a(rVar, a2)) {
                    if (b2.isRunning() || b2.isStarted()) {
                        b2.cancel();
                    } else {
                        t.remove(b2);
                    }
                }
            }
        }
        a(viewGroup, this.q, this.r, this.u, this.v);
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        Animator a2;
        int i;
        int i2;
        View view;
        Animator animator;
        r rVar;
        Animator animator2;
        r rVar2;
        defpackage.c0<Animator, d> t = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            r rVar3 = arrayList.get(i3);
            r rVar4 = arrayList2.get(i3);
            if (rVar3 != null && !rVar3.c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.c.contains(this)) {
                rVar4 = null;
            }
            if (rVar3 != null || rVar4 != null) {
                if ((rVar3 == null || rVar4 == null || a(rVar3, rVar4)) && (a2 = a(viewGroup, rVar3, rVar4)) != null) {
                    if (rVar4 != null) {
                        view = rVar4.b;
                        String[] q = q();
                        if (view == null || q == null || q.length <= 0) {
                            i = size;
                            i2 = i3;
                            animator2 = a2;
                            rVar2 = null;
                        } else {
                            rVar2 = new r();
                            rVar2.b = view;
                            i = size;
                            r rVar5 = sVar2.a.get(view);
                            if (rVar5 != null) {
                                int i4 = 0;
                                while (i4 < q.length) {
                                    rVar2.a.put(q[i4], rVar5.a.get(q[i4]));
                                    i4++;
                                    i3 = i3;
                                    rVar5 = rVar5;
                                }
                            }
                            i2 = i3;
                            int size2 = t.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = a2;
                                    break;
                                }
                                d dVar = t.get(t.b(i5));
                                if (dVar.c != null && dVar.a == view && dVar.b.equals(h()) && dVar.c.equals(rVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        }
                        animator = animator2;
                        rVar = rVar2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = rVar3.b;
                        animator = a2;
                        rVar = null;
                    }
                    if (animator != null) {
                        o oVar = this.D;
                        if (oVar != null) {
                            long a3 = oVar.a(viewGroup, this, rVar3, rVar4);
                            sparseIntArray.put(this.C.size(), (int) a3);
                            j = Math.min(a3, j);
                        }
                        t.put(animator, new d(view, h(), this, c0.d(viewGroup), rVar));
                        this.C.add(animator);
                        j = j;
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (j != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.C.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((sparseIntArray.valueAt(i6) - j) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        defpackage.c0<String, String> c0Var;
        a(z);
        if ((this.f.size() > 0 || this.g.size() > 0) && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f.get(i).intValue());
                if (findViewById != null) {
                    r rVar = new r();
                    rVar.b = findViewById;
                    if (z) {
                        c(rVar);
                    } else {
                        a(rVar);
                    }
                    rVar.c.add(this);
                    b(rVar);
                    a(z ? this.q : this.r, findViewById, rVar);
                }
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                View view = this.g.get(i2);
                r rVar2 = new r();
                rVar2.b = view;
                if (z) {
                    c(rVar2);
                } else {
                    a(rVar2);
                }
                rVar2.c.add(this);
                b(rVar2);
                a(z ? this.q : this.r, view, rVar2);
            }
        } else {
            c(viewGroup, z);
        }
        if (z || (c0Var = this.F) == null) {
            return;
        }
        int size = c0Var.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.q.d.remove(this.F.b(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.q.d.put(this.F.d(i4), view2);
            }
        }
    }

    public void a(g gVar) {
        if (gVar == null) {
            gVar = I;
        }
        this.G = gVar;
    }

    public void a(e eVar) {
        this.E = eVar;
    }

    public void a(o oVar) {
        this.D = oVar;
    }

    public abstract void a(r rVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        s sVar;
        if (z) {
            this.q.a.clear();
            this.q.b.clear();
            sVar = this.q;
        } else {
            this.r.a.clear();
            this.r.b.clear();
            sVar = this.r;
        }
        sVar.c.a();
    }

    public boolean a(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] q = q();
        if (q == null) {
            Iterator<String> it = rVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (a(rVar, rVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : q) {
            if (!a(rVar, rVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public long b() {
        return this.d;
    }

    public l b(long j) {
        this.c = j;
        return this;
    }

    public l b(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public r b(View view, boolean z) {
        p pVar = this.s;
        if (pVar != null) {
            return pVar.b(view, z);
        }
        return (z ? this.q : this.r).a.get(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(r rVar) {
        String[] a2;
        if (this.D == null || rVar.a.isEmpty() || (a2 = this.D.a()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a2.length) {
                z = true;
                break;
            } else if (!rVar.a.containsKey(a2[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.D.a(rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.l.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.m != null && q2.p(view) != null && this.m.contains(q2.p(view))) {
            return false;
        }
        if ((this.f.size() == 0 && this.g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) || this.f.contains(Integer.valueOf(id)) || this.g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.h;
        if (arrayList6 != null && arrayList6.contains(q2.p(view))) {
            return true;
        }
        if (this.i != null) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                if (this.i.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public e c() {
        return this.E;
    }

    public void c(View view) {
        if (this.A) {
            return;
        }
        defpackage.c0<Animator, d> t = t();
        int size = t.size();
        k0 d2 = c0.d(view);
        for (int i = size - 1; i >= 0; i--) {
            d d3 = t.d(i);
            if (d3.a != null && d2.equals(d3.d)) {
                androidx.transition.a.a(t.b(i));
            }
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).b(this);
            }
        }
        this.z = true;
    }

    public abstract void c(r rVar);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public l mo0clone() {
        try {
            l lVar = (l) super.clone();
            lVar.C = new ArrayList<>();
            lVar.q = new s();
            lVar.r = new s();
            lVar.u = null;
            lVar.v = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public l d(View view) {
        this.g.remove(view);
        return this;
    }

    public void e(View view) {
        if (this.z) {
            if (!this.A) {
                defpackage.c0<Animator, d> t = t();
                int size = t.size();
                k0 d2 = c0.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d d3 = t.d(i);
                    if (d3.a != null && d2.equals(d3.d)) {
                        androidx.transition.a.b(t.b(i));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).c(this);
                    }
                }
            }
            this.z = false;
        }
    }

    public TimeInterpolator g() {
        return this.e;
    }

    public String h() {
        return this.b;
    }

    public g j() {
        return this.G;
    }

    public o k() {
        return this.D;
    }

    public long l() {
        return this.c;
    }

    public List<Integer> m() {
        return this.f;
    }

    public List<String> n() {
        return this.h;
    }

    public List<Class> o() {
        return this.i;
    }

    public List<View> p() {
        return this.g;
    }

    public String[] q() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        s();
        defpackage.c0<Animator, d> t = t();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (t.containsKey(next)) {
                s();
                a(next, t);
            }
        }
        this.C.clear();
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).a(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public String toString() {
        return a("");
    }
}
