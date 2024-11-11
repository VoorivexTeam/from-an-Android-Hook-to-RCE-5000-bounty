package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.q2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n {
    private static l a = new b();
    private static ThreadLocal<WeakReference<defpackage.c0<ViewGroup, ArrayList<l>>>> b = new ThreadLocal<>();
    static ArrayList<ViewGroup> c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        l b;
        ViewGroup c;

        /* renamed from: androidx.transition.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0021a extends m {
            final /* synthetic */ defpackage.c0 a;

            C0021a(defpackage.c0 c0Var) {
                this.a = c0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.l.f
            public void d(l lVar) {
                ((ArrayList) this.a.get(a.this.c)).remove(lVar);
            }
        }

        a(l lVar, ViewGroup viewGroup) {
            this.b = lVar;
            this.c = viewGroup;
        }

        private void a() {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!n.c.remove(this.c)) {
                return true;
            }
            defpackage.c0<ViewGroup, ArrayList<l>> a = n.a();
            ArrayList<l> arrayList = a.get(this.c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a.put(this.c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.b);
            this.b.a(new C0021a(a));
            this.b.a(this.c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).e(this.c);
                }
            }
            this.b.a(this.c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            n.c.remove(this.c);
            ArrayList<l> arrayList = n.a().get(this.c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e(this.c);
                }
            }
            this.b.a(true);
        }
    }

    static defpackage.c0<ViewGroup, ArrayList<l>> a() {
        defpackage.c0<ViewGroup, ArrayList<l>> c0Var;
        WeakReference<defpackage.c0<ViewGroup, ArrayList<l>>> weakReference = b.get();
        if (weakReference != null && (c0Var = weakReference.get()) != null) {
            return c0Var;
        }
        defpackage.c0<ViewGroup, ArrayList<l>> c0Var2 = new defpackage.c0<>();
        b.set(new WeakReference<>(c0Var2));
        return c0Var2;
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        if (c.contains(viewGroup) || !q2.x(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (lVar == null) {
            lVar = a;
        }
        l mo0clone = lVar.mo0clone();
        c(viewGroup, mo0clone);
        k.a(viewGroup, null);
        b(viewGroup, mo0clone);
    }

    private static void b(ViewGroup viewGroup, l lVar) {
        if (lVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(lVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void c(ViewGroup viewGroup, l lVar) {
        ArrayList<l> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<l> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.a(viewGroup, true);
        }
        k a2 = k.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }
}
