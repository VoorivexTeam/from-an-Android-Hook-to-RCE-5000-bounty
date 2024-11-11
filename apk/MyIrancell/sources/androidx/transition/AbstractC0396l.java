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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C0500c0;
import p000.C2452f0;
import p000.C3107q2;

/* renamed from: androidx.transition.l */
/* loaded from: classes.dex */
public abstract class AbstractC0396l implements Cloneable {

    /* renamed from: H */
    private static final int[] f2464H = {2, 1, 3, 4};

    /* renamed from: I */
    private static final AbstractC0386g f2465I = new a();

    /* renamed from: J */
    private static ThreadLocal<C0500c0<Animator, d>> f2466J = new ThreadLocal<>();

    /* renamed from: D */
    AbstractC0399o f2470D;

    /* renamed from: E */
    private e f2471E;

    /* renamed from: F */
    private C0500c0<String, String> f2472F;

    /* renamed from: u */
    private ArrayList<C0402r> f2493u;

    /* renamed from: v */
    private ArrayList<C0402r> f2494v;

    /* renamed from: b */
    private String f2474b = getClass().getName();

    /* renamed from: c */
    private long f2475c = -1;

    /* renamed from: d */
    long f2476d = -1;

    /* renamed from: e */
    private TimeInterpolator f2477e = null;

    /* renamed from: f */
    ArrayList<Integer> f2478f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<View> f2479g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<String> f2480h = null;

    /* renamed from: i */
    private ArrayList<Class> f2481i = null;

    /* renamed from: j */
    private ArrayList<Integer> f2482j = null;

    /* renamed from: k */
    private ArrayList<View> f2483k = null;

    /* renamed from: l */
    private ArrayList<Class> f2484l = null;

    /* renamed from: m */
    private ArrayList<String> f2485m = null;

    /* renamed from: n */
    private ArrayList<Integer> f2486n = null;

    /* renamed from: o */
    private ArrayList<View> f2487o = null;

    /* renamed from: p */
    private ArrayList<Class> f2488p = null;

    /* renamed from: q */
    private C0403s f2489q = new C0403s();

    /* renamed from: r */
    private C0403s f2490r = new C0403s();

    /* renamed from: s */
    C0400p f2491s = null;

    /* renamed from: t */
    private int[] f2492t = f2464H;

    /* renamed from: w */
    boolean f2495w = false;

    /* renamed from: x */
    ArrayList<Animator> f2496x = new ArrayList<>();

    /* renamed from: y */
    private int f2497y = 0;

    /* renamed from: z */
    private boolean f2498z = false;

    /* renamed from: A */
    private boolean f2467A = false;

    /* renamed from: B */
    private ArrayList<f> f2468B = null;

    /* renamed from: C */
    private ArrayList<Animator> f2469C = new ArrayList<>();

    /* renamed from: G */
    private AbstractC0386g f2473G = f2465I;

    /* renamed from: androidx.transition.l$a */
    /* loaded from: classes.dex */
    static class a extends AbstractC0386g {
        a() {
        }

        @Override // androidx.transition.AbstractC0386g
        /* renamed from: a */
        public Path mo2977a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.l$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0500c0 f2499a;

        b(C0500c0 c0500c0) {
            this.f2499a = c0500c0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2499a.remove(animator);
            AbstractC0396l.this.f2496x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0396l.this.f2496x.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.l$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0396l.this.m3009a();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.l$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f2502a;

        /* renamed from: b */
        String f2503b;

        /* renamed from: c */
        C0402r f2504c;

        /* renamed from: d */
        InterfaceC0395k0 f2505d;

        /* renamed from: e */
        AbstractC0396l f2506e;

        d(View view, String str, AbstractC0396l abstractC0396l, InterfaceC0395k0 interfaceC0395k0, C0402r c0402r) {
            this.f2502a = view;
            this.f2503b = str;
            this.f2504c = c0402r;
            this.f2505d = interfaceC0395k0;
            this.f2506e = abstractC0396l;
        }
    }

    /* renamed from: androidx.transition.l$e */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* renamed from: androidx.transition.l$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo2969a(AbstractC0396l abstractC0396l);

        /* renamed from: b */
        void mo2937b(AbstractC0396l abstractC0396l);

        /* renamed from: c */
        void mo2938c(AbstractC0396l abstractC0396l);

        /* renamed from: d */
        void mo2939d(AbstractC0396l abstractC0396l);
    }

    /* renamed from: a */
    private void m2992a(Animator animator, C0500c0<Animator, d> c0500c0) {
        if (animator != null) {
            animator.addListener(new b(c0500c0));
            m3010a(animator);
        }
    }

    /* renamed from: a */
    private static void m2993a(C0403s c0403s, View view, C0402r c0402r) {
        c0403s.f2527a.put(view, c0402r);
        int id = view.getId();
        if (id >= 0) {
            if (c0403s.f2528b.indexOfKey(id) >= 0) {
                c0403s.f2528b.put(id, null);
            } else {
                c0403s.f2528b.put(id, view);
            }
        }
        String m14924p = C3107q2.m14924p(view);
        if (m14924p != null) {
            if (c0403s.f2530d.containsKey(m14924p)) {
                c0403s.f2530d.put(m14924p, null);
            } else {
                c0403s.f2530d.put(m14924p, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0403s.f2529c.m11657d(itemIdAtPosition) < 0) {
                    C3107q2.m14903b(view, true);
                    c0403s.f2529c.m11656c(itemIdAtPosition, view);
                    return;
                }
                View m11655c = c0403s.f2529c.m11655c(itemIdAtPosition);
                if (m11655c != null) {
                    C3107q2.m14903b(m11655c, false);
                    c0403s.f2529c.m11656c(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2994a(C0403s c0403s, C0403s c0403s2) {
        C0500c0<View, C0402r> c0500c0 = new C0500c0<>(c0403s.f2527a);
        C0500c0<View, C0402r> c0500c02 = new C0500c0<>(c0403s2.f2527a);
        int i = 0;
        while (true) {
            int[] iArr = this.f2492t;
            if (i >= iArr.length) {
                m2995a(c0500c0, c0500c02);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                m3000b(c0500c0, c0500c02);
            } else if (i2 == 2) {
                m2997a(c0500c0, c0500c02, c0403s.f2530d, c0403s2.f2530d);
            } else if (i2 == 3) {
                m2996a(c0500c0, c0500c02, c0403s.f2528b, c0403s2.f2528b);
            } else if (i2 == 4) {
                m2998a(c0500c0, c0500c02, c0403s.f2529c, c0403s2.f2529c);
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m2995a(C0500c0<View, C0402r> c0500c0, C0500c0<View, C0402r> c0500c02) {
        for (int i = 0; i < c0500c0.size(); i++) {
            C0402r m12311d = c0500c0.m12311d(i);
            if (m3023b(m12311d.f2525b)) {
                this.f2493u.add(m12311d);
                this.f2494v.add(null);
            }
        }
        for (int i2 = 0; i2 < c0500c02.size(); i2++) {
            C0402r m12311d2 = c0500c02.m12311d(i2);
            if (m3023b(m12311d2.f2525b)) {
                this.f2494v.add(m12311d2);
                this.f2493u.add(null);
            }
        }
    }

    /* renamed from: a */
    private void m2996a(C0500c0<View, C0402r> c0500c0, C0500c0<View, C0402r> c0500c02, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && m3023b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m3023b(view)) {
                C0402r c0402r = c0500c0.get(valueAt);
                C0402r c0402r2 = c0500c02.get(view);
                if (c0402r != null && c0402r2 != null) {
                    this.f2493u.add(c0402r);
                    this.f2494v.add(c0402r2);
                    c0500c0.remove(valueAt);
                    c0500c02.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2997a(C0500c0<View, C0402r> c0500c0, C0500c0<View, C0402r> c0500c02, C0500c0<String, View> c0500c03, C0500c0<String, View> c0500c04) {
        View view;
        int size = c0500c03.size();
        for (int i = 0; i < size; i++) {
            View m12311d = c0500c03.m12311d(i);
            if (m12311d != null && m3023b(m12311d) && (view = c0500c04.get(c0500c03.m12310b(i))) != null && m3023b(view)) {
                C0402r c0402r = c0500c0.get(m12311d);
                C0402r c0402r2 = c0500c02.get(view);
                if (c0402r != null && c0402r2 != null) {
                    this.f2493u.add(c0402r);
                    this.f2494v.add(c0402r2);
                    c0500c0.remove(m12311d);
                    c0500c02.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2998a(C0500c0<View, C0402r> c0500c0, C0500c0<View, C0402r> c0500c02, C2452f0<View> c2452f0, C2452f0<View> c2452f02) {
        View m11655c;
        int m11650b = c2452f0.m11650b();
        for (int i = 0; i < m11650b; i++) {
            View m11654c = c2452f0.m11654c(i);
            if (m11654c != null && m3023b(m11654c) && (m11655c = c2452f02.m11655c(c2452f0.m11646a(i))) != null && m3023b(m11655c)) {
                C0402r c0402r = c0500c0.get(m11654c);
                C0402r c0402r2 = c0500c02.get(m11655c);
                if (c0402r != null && c0402r2 != null) {
                    this.f2493u.add(c0402r);
                    this.f2494v.add(c0402r2);
                    c0500c0.remove(m11654c);
                    c0500c02.remove(m11655c);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m2999a(C0402r c0402r, C0402r c0402r2, String str) {
        Object obj = c0402r.f2524a.get(str);
        Object obj2 = c0402r2.f2524a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: b */
    private void m3000b(C0500c0<View, C0402r> c0500c0, C0500c0<View, C0402r> c0500c02) {
        C0402r remove;
        View view;
        for (int size = c0500c0.size() - 1; size >= 0; size--) {
            View m12310b = c0500c0.m12310b(size);
            if (m12310b != null && m3023b(m12310b) && (remove = c0500c02.remove(m12310b)) != null && (view = remove.f2525b) != null && m3023b(view)) {
                this.f2493u.add(c0500c0.mo3398c(size));
                this.f2494v.add(remove);
            }
        }
    }

    /* renamed from: c */
    private void m3001c(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f2482j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f2483k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class> arrayList3 = this.f2484l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f2484l.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0402r c0402r = new C0402r();
                    c0402r.f2525b = view;
                    if (z) {
                        mo2923c(c0402r);
                    } else {
                        mo2922a(c0402r);
                    }
                    c0402r.f2526c.add(this);
                    mo3022b(c0402r);
                    m2993a(z ? this.f2489q : this.f2490r, view, c0402r);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f2486n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.f2487o;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class> arrayList6 = this.f2488p;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.f2488p.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m3001c(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    private static C0500c0<Animator, d> m3002t() {
        C0500c0<Animator, d> c0500c0 = f2466J.get();
        if (c0500c0 != null) {
            return c0500c0;
        }
        C0500c0<Animator, d> c0500c02 = new C0500c0<>();
        f2466J.set(c0500c02);
        return c0500c02;
    }

    /* renamed from: a */
    public Animator mo2921a(ViewGroup viewGroup, C0402r c0402r, C0402r c0402r2) {
        return null;
    }

    /* renamed from: a */
    public AbstractC0396l mo3003a(long j) {
        this.f2476d = j;
        return this;
    }

    /* renamed from: a */
    public AbstractC0396l mo3004a(TimeInterpolator timeInterpolator) {
        this.f2477e = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public AbstractC0396l mo3005a(View view) {
        this.f2479g.add(view);
        return this;
    }

    /* renamed from: a */
    public AbstractC0396l mo3006a(f fVar) {
        if (this.f2468B == null) {
            this.f2468B = new ArrayList<>();
        }
        this.f2468B.add(fVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0402r m3007a(View view, boolean z) {
        C0400p c0400p = this.f2491s;
        if (c0400p != null) {
            return c0400p.m3007a(view, z);
        }
        ArrayList<C0402r> arrayList = z ? this.f2493u : this.f2494v;
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
            C0402r c0402r = arrayList.get(i2);
            if (c0402r == null) {
                return null;
            }
            if (c0402r.f2525b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.f2494v : this.f2493u).get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo3008a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2476d != -1) {
            str2 = str2 + "dur(" + this.f2476d + ") ";
        }
        if (this.f2475c != -1) {
            str2 = str2 + "dly(" + this.f2475c + ") ";
        }
        if (this.f2477e != null) {
            str2 = str2 + "interp(" + this.f2477e + ") ";
        }
        if (this.f2478f.size() <= 0 && this.f2479g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f2478f.size() > 0) {
            for (int i = 0; i < this.f2478f.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f2478f.get(i);
            }
        }
        if (this.f2479g.size() > 0) {
            for (int i2 = 0; i2 < this.f2479g.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f2479g.get(i2);
            }
        }
        return str3 + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m3009a() {
        int i = this.f2497y - 1;
        this.f2497y = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.f2468B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2468B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).mo2939d(this);
                }
            }
            for (int i3 = 0; i3 < this.f2489q.f2529c.m11650b(); i3++) {
                View m11654c = this.f2489q.f2529c.m11654c(i3);
                if (m11654c != null) {
                    C3107q2.m14903b(m11654c, false);
                }
            }
            for (int i4 = 0; i4 < this.f2490r.f2529c.m11650b(); i4++) {
                View m11654c2 = this.f2490r.f2529c.m11654c(i4);
                if (m11654c2 != null) {
                    C3107q2.m14903b(m11654c2, false);
                }
            }
            this.f2467A = true;
        }
    }

    /* renamed from: a */
    protected void m3010a(Animator animator) {
        if (animator == null) {
            m3009a();
            return;
        }
        if (m3018b() >= 0) {
            animator.setDuration(m3018b());
        }
        if (m3032l() >= 0) {
            animator.setStartDelay(m3032l());
        }
        if (m3028g() != null) {
            animator.setInterpolator(m3028g());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3011a(ViewGroup viewGroup) {
        d dVar;
        this.f2493u = new ArrayList<>();
        this.f2494v = new ArrayList<>();
        m2994a(this.f2489q, this.f2490r);
        C0500c0<Animator, d> m3002t = m3002t();
        int size = m3002t.size();
        InterfaceC0395k0 m2952d = C0379c0.m2952d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator m12310b = m3002t.m12310b(i);
            if (m12310b != null && (dVar = m3002t.get(m12310b)) != null && dVar.f2502a != null && m2952d.equals(dVar.f2505d)) {
                C0402r c0402r = dVar.f2504c;
                View view = dVar.f2502a;
                C0402r m3021b = m3021b(view, true);
                C0402r m3007a = m3007a(view, true);
                if (!(m3021b == null && m3007a == null) && dVar.f2506e.mo2983a(c0402r, m3007a)) {
                    if (m12310b.isRunning() || m12310b.isStarted()) {
                        m12310b.cancel();
                    } else {
                        m3002t.remove(m12310b);
                    }
                }
            }
        }
        mo3012a(viewGroup, this.f2489q, this.f2490r, this.f2493u, this.f2494v);
        mo3037r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3012a(ViewGroup viewGroup, C0403s c0403s, C0403s c0403s2, ArrayList<C0402r> arrayList, ArrayList<C0402r> arrayList2) {
        Animator mo2921a;
        int i;
        int i2;
        View view;
        Animator animator;
        C0402r c0402r;
        Animator animator2;
        C0402r c0402r2;
        C0500c0<Animator, d> m3002t = m3002t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C0402r c0402r3 = arrayList.get(i3);
            C0402r c0402r4 = arrayList2.get(i3);
            if (c0402r3 != null && !c0402r3.f2526c.contains(this)) {
                c0402r3 = null;
            }
            if (c0402r4 != null && !c0402r4.f2526c.contains(this)) {
                c0402r4 = null;
            }
            if (c0402r3 != null || c0402r4 != null) {
                if ((c0402r3 == null || c0402r4 == null || mo2983a(c0402r3, c0402r4)) && (mo2921a = mo2921a(viewGroup, c0402r3, c0402r4)) != null) {
                    if (c0402r4 != null) {
                        view = c0402r4.f2525b;
                        String[] mo2924q = mo2924q();
                        if (view == null || mo2924q == null || mo2924q.length <= 0) {
                            i = size;
                            i2 = i3;
                            animator2 = mo2921a;
                            c0402r2 = null;
                        } else {
                            c0402r2 = new C0402r();
                            c0402r2.f2525b = view;
                            i = size;
                            C0402r c0402r5 = c0403s2.f2527a.get(view);
                            if (c0402r5 != null) {
                                int i4 = 0;
                                while (i4 < mo2924q.length) {
                                    c0402r2.f2524a.put(mo2924q[i4], c0402r5.f2524a.get(mo2924q[i4]));
                                    i4++;
                                    i3 = i3;
                                    c0402r5 = c0402r5;
                                }
                            }
                            i2 = i3;
                            int size2 = m3002t.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = mo2921a;
                                    break;
                                }
                                d dVar = m3002t.get(m3002t.m12310b(i5));
                                if (dVar.f2504c != null && dVar.f2502a == view && dVar.f2503b.equals(m3029h()) && dVar.f2504c.equals(c0402r2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        }
                        animator = animator2;
                        c0402r = c0402r2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c0402r3.f2525b;
                        animator = mo2921a;
                        c0402r = null;
                    }
                    if (animator != null) {
                        AbstractC0399o abstractC0399o = this.f2470D;
                        if (abstractC0399o != null) {
                            long m3044a = abstractC0399o.m3044a(viewGroup, this, c0402r3, c0402r4);
                            sparseIntArray.put(this.f2469C.size(), (int) m3044a);
                            j = Math.min(m3044a, j);
                        }
                        m3002t.put(animator, new d(view, m3029h(), this, C0379c0.m2952d(viewGroup), c0402r));
                        this.f2469C.add(animator);
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
                Animator animator3 = this.f2469C.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((sparseIntArray.valueAt(i6) - j) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3013a(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        C0500c0<String, String> c0500c0;
        m3017a(z);
        if ((this.f2478f.size() > 0 || this.f2479g.size() > 0) && (((arrayList = this.f2480h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2481i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f2478f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f2478f.get(i).intValue());
                if (findViewById != null) {
                    C0402r c0402r = new C0402r();
                    c0402r.f2525b = findViewById;
                    if (z) {
                        mo2923c(c0402r);
                    } else {
                        mo2922a(c0402r);
                    }
                    c0402r.f2526c.add(this);
                    mo3022b(c0402r);
                    m2993a(z ? this.f2489q : this.f2490r, findViewById, c0402r);
                }
            }
            for (int i2 = 0; i2 < this.f2479g.size(); i2++) {
                View view = this.f2479g.get(i2);
                C0402r c0402r2 = new C0402r();
                c0402r2.f2525b = view;
                if (z) {
                    mo2923c(c0402r2);
                } else {
                    mo2922a(c0402r2);
                }
                c0402r2.f2526c.add(this);
                mo3022b(c0402r2);
                m2993a(z ? this.f2489q : this.f2490r, view, c0402r2);
            }
        } else {
            m3001c(viewGroup, z);
        }
        if (z || (c0500c0 = this.f2472F) == null) {
            return;
        }
        int size = c0500c0.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.f2489q.f2530d.remove(this.f2472F.m12310b(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.f2489q.f2530d.put(this.f2472F.m12311d(i4), view2);
            }
        }
    }

    /* renamed from: a */
    public void mo3014a(AbstractC0386g abstractC0386g) {
        if (abstractC0386g == null) {
            abstractC0386g = f2465I;
        }
        this.f2473G = abstractC0386g;
    }

    /* renamed from: a */
    public void mo3015a(e eVar) {
        this.f2471E = eVar;
    }

    /* renamed from: a */
    public void mo3016a(AbstractC0399o abstractC0399o) {
        this.f2470D = abstractC0399o;
    }

    /* renamed from: a */
    public abstract void mo2922a(C0402r c0402r);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3017a(boolean z) {
        C0403s c0403s;
        if (z) {
            this.f2489q.f2527a.clear();
            this.f2489q.f2528b.clear();
            c0403s = this.f2489q;
        } else {
            this.f2490r.f2527a.clear();
            this.f2490r.f2528b.clear();
            c0403s = this.f2490r;
        }
        c0403s.f2529c.m11647a();
    }

    /* renamed from: a */
    public boolean mo2983a(C0402r c0402r, C0402r c0402r2) {
        if (c0402r == null || c0402r2 == null) {
            return false;
        }
        String[] mo2924q = mo2924q();
        if (mo2924q == null) {
            Iterator<String> it = c0402r.f2524a.keySet().iterator();
            while (it.hasNext()) {
                if (m2999a(c0402r, c0402r2, it.next())) {
                }
            }
            return false;
        }
        for (String str : mo2924q) {
            if (!m2999a(c0402r, c0402r2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: b */
    public long m3018b() {
        return this.f2476d;
    }

    /* renamed from: b */
    public AbstractC0396l mo3019b(long j) {
        this.f2475c = j;
        return this;
    }

    /* renamed from: b */
    public AbstractC0396l mo3020b(f fVar) {
        ArrayList<f> arrayList = this.f2468B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f2468B.size() == 0) {
            this.f2468B = null;
        }
        return this;
    }

    /* renamed from: b */
    public C0402r m3021b(View view, boolean z) {
        C0400p c0400p = this.f2491s;
        if (c0400p != null) {
            return c0400p.m3021b(view, z);
        }
        return (z ? this.f2489q : this.f2490r).f2527a.get(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3022b(C0402r c0402r) {
        String[] m3046a;
        if (this.f2470D == null || c0402r.f2524a.isEmpty() || (m3046a = this.f2470D.m3046a()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= m3046a.length) {
                z = true;
                break;
            } else if (!c0402r.f2524a.containsKey(m3046a[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.f2470D.m3045a(c0402r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m3023b(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f2482j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f2483k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f2484l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f2484l.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f2485m != null && C3107q2.m14924p(view) != null && this.f2485m.contains(C3107q2.m14924p(view))) {
            return false;
        }
        if ((this.f2478f.size() == 0 && this.f2479g.size() == 0 && (((arrayList = this.f2481i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2480h) == null || arrayList2.isEmpty()))) || this.f2478f.contains(Integer.valueOf(id)) || this.f2479g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f2480h;
        if (arrayList6 != null && arrayList6.contains(C3107q2.m14924p(view))) {
            return true;
        }
        if (this.f2481i != null) {
            for (int i2 = 0; i2 < this.f2481i.size(); i2++) {
                if (this.f2481i.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public e m3024c() {
        return this.f2471E;
    }

    /* renamed from: c */
    public void mo3025c(View view) {
        if (this.f2467A) {
            return;
        }
        C0500c0<Animator, d> m3002t = m3002t();
        int size = m3002t.size();
        InterfaceC0395k0 m2952d = C0379c0.m2952d(view);
        for (int i = size - 1; i >= 0; i--) {
            d m12311d = m3002t.m12311d(i);
            if (m12311d.f2502a != null && m2952d.equals(m12311d.f2505d)) {
                C0374a.m2913a(m3002t.m12310b(i));
            }
        }
        ArrayList<f> arrayList = this.f2468B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2468B.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).mo2937b(this);
            }
        }
        this.f2498z = true;
    }

    /* renamed from: c */
    public abstract void mo2923c(C0402r c0402r);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractC0396l mo16978clone() {
        try {
            AbstractC0396l abstractC0396l = (AbstractC0396l) super.clone();
            abstractC0396l.f2469C = new ArrayList<>();
            abstractC0396l.f2489q = new C0403s();
            abstractC0396l.f2490r = new C0403s();
            abstractC0396l.f2493u = null;
            abstractC0396l.f2494v = null;
            return abstractC0396l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public AbstractC0396l mo3026d(View view) {
        this.f2479g.remove(view);
        return this;
    }

    /* renamed from: e */
    public void mo3027e(View view) {
        if (this.f2498z) {
            if (!this.f2467A) {
                C0500c0<Animator, d> m3002t = m3002t();
                int size = m3002t.size();
                InterfaceC0395k0 m2952d = C0379c0.m2952d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d m12311d = m3002t.m12311d(i);
                    if (m12311d.f2502a != null && m2952d.equals(m12311d.f2505d)) {
                        C0374a.m2915b(m3002t.m12310b(i));
                    }
                }
                ArrayList<f> arrayList = this.f2468B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2468B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).mo2938c(this);
                    }
                }
            }
            this.f2498z = false;
        }
    }

    /* renamed from: g */
    public TimeInterpolator m3028g() {
        return this.f2477e;
    }

    /* renamed from: h */
    public String m3029h() {
        return this.f2474b;
    }

    /* renamed from: j */
    public AbstractC0386g m3030j() {
        return this.f2473G;
    }

    /* renamed from: k */
    public AbstractC0399o m3031k() {
        return this.f2470D;
    }

    /* renamed from: l */
    public long m3032l() {
        return this.f2475c;
    }

    /* renamed from: m */
    public List<Integer> m3033m() {
        return this.f2478f;
    }

    /* renamed from: n */
    public List<String> m3034n() {
        return this.f2480h;
    }

    /* renamed from: o */
    public List<Class> m3035o() {
        return this.f2481i;
    }

    /* renamed from: p */
    public List<View> m3036p() {
        return this.f2479g;
    }

    /* renamed from: q */
    public String[] mo2924q() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void mo3037r() {
        m3038s();
        C0500c0<Animator, d> m3002t = m3002t();
        Iterator<Animator> it = this.f2469C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m3002t.containsKey(next)) {
                m3038s();
                m2992a(next, m3002t);
            }
        }
        this.f2469C.clear();
        m3009a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void m3038s() {
        if (this.f2497y == 0) {
            ArrayList<f> arrayList = this.f2468B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2468B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).mo2969a(this);
                }
            }
            this.f2467A = false;
        }
        this.f2497y++;
    }

    public String toString() {
        return mo3008a("");
    }
}
