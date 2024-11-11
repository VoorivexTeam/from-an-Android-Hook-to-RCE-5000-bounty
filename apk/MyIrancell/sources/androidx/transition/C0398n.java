package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0500c0;
import p000.C3107q2;

/* renamed from: androidx.transition.n */
/* loaded from: classes.dex */
public class C0398n {

    /* renamed from: a */
    private static AbstractC0396l f2507a = new C0376b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0500c0<ViewGroup, ArrayList<AbstractC0396l>>>> f2508b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f2509c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.n$a */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        AbstractC0396l f2510b;

        /* renamed from: c */
        ViewGroup f2511c;

        /* renamed from: androidx.transition.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C3552a extends C0397m {

            /* renamed from: a */
            final /* synthetic */ C0500c0 f2512a;

            C3552a(C0500c0 c0500c0) {
                this.f2512a = c0500c0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.AbstractC0396l.f
            /* renamed from: d */
            public void mo2939d(AbstractC0396l abstractC0396l) {
                ((ArrayList) this.f2512a.get(a.this.f2511c)).remove(abstractC0396l);
            }
        }

        a(AbstractC0396l abstractC0396l, ViewGroup viewGroup) {
            this.f2510b = abstractC0396l;
            this.f2511c = viewGroup;
        }

        /* renamed from: a */
        private void m3043a() {
            this.f2511c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2511c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m3043a();
            if (!C0398n.f2509c.remove(this.f2511c)) {
                return true;
            }
            C0500c0<ViewGroup, ArrayList<AbstractC0396l>> m3039a = C0398n.m3039a();
            ArrayList<AbstractC0396l> arrayList = m3039a.get(this.f2511c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                m3039a.put(this.f2511c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f2510b);
            this.f2510b.mo3006a(new C3552a(m3039a));
            this.f2510b.m3013a(this.f2511c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0396l) it.next()).mo3027e(this.f2511c);
                }
            }
            this.f2510b.m3011a(this.f2511c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m3043a();
            C0398n.f2509c.remove(this.f2511c);
            ArrayList<AbstractC0396l> arrayList = C0398n.m3039a().get(this.f2511c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC0396l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo3027e(this.f2511c);
                }
            }
            this.f2510b.m3017a(true);
        }
    }

    /* renamed from: a */
    static C0500c0<ViewGroup, ArrayList<AbstractC0396l>> m3039a() {
        C0500c0<ViewGroup, ArrayList<AbstractC0396l>> c0500c0;
        WeakReference<C0500c0<ViewGroup, ArrayList<AbstractC0396l>>> weakReference = f2508b.get();
        if (weakReference != null && (c0500c0 = weakReference.get()) != null) {
            return c0500c0;
        }
        C0500c0<ViewGroup, ArrayList<AbstractC0396l>> c0500c02 = new C0500c0<>();
        f2508b.set(new WeakReference<>(c0500c02));
        return c0500c02;
    }

    /* renamed from: a */
    public static void m3040a(ViewGroup viewGroup, AbstractC0396l abstractC0396l) {
        if (f2509c.contains(viewGroup) || !C3107q2.m14932x(viewGroup)) {
            return;
        }
        f2509c.add(viewGroup);
        if (abstractC0396l == null) {
            abstractC0396l = f2507a;
        }
        AbstractC0396l mo16978clone = abstractC0396l.mo16978clone();
        m3042c(viewGroup, mo16978clone);
        C0394k.m2990a(viewGroup, null);
        m3041b(viewGroup, mo16978clone);
    }

    /* renamed from: b */
    private static void m3041b(ViewGroup viewGroup, AbstractC0396l abstractC0396l) {
        if (abstractC0396l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0396l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: c */
    private static void m3042c(ViewGroup viewGroup, AbstractC0396l abstractC0396l) {
        ArrayList<AbstractC0396l> arrayList = m3039a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC0396l> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo3025c(viewGroup);
            }
        }
        if (abstractC0396l != null) {
            abstractC0396l.m3013a(viewGroup, true);
        }
        C0394k m2989a = C0394k.m2989a(viewGroup);
        if (m2989a != null) {
            m2989a.m2991a();
        }
    }
}
