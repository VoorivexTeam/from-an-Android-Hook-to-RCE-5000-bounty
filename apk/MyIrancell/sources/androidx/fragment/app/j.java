package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.c0;
import defpackage.q2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    private static final l b;
    private static final l c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        final /* synthetic */ ArrayList b;

        a(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a((ArrayList<View>) this.b, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        final /* synthetic */ Object b;
        final /* synthetic */ l c;
        final /* synthetic */ View d;
        final /* synthetic */ Fragment e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;

        b(Object obj, l lVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.b = obj;
            this.c = lVar;
            this.d = view;
            this.e = fragment;
            this.f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.b;
            if (obj != null) {
                this.c.b(obj, this.d);
                this.g.addAll(j.a(this.c, this.b, this.e, (ArrayList<View>) this.f, this.d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.d);
                    this.c.a(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        final /* synthetic */ Fragment b;
        final /* synthetic */ Fragment c;
        final /* synthetic */ boolean d;
        final /* synthetic */ c0 e;
        final /* synthetic */ View f;
        final /* synthetic */ l g;
        final /* synthetic */ Rect h;

        c(Fragment fragment, Fragment fragment2, boolean z, c0 c0Var, View view, l lVar, Rect rect) {
            this.b = fragment;
            this.c = fragment2;
            this.d = z;
            this.e = c0Var;
            this.f = view;
            this.g = lVar;
            this.h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(this.b, this.c, this.d, (c0<String, View>) this.e, false);
            View view = this.f;
            if (view != null) {
                this.g.a(view, this.h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements Runnable {
        final /* synthetic */ l b;
        final /* synthetic */ c0 c;
        final /* synthetic */ Object d;
        final /* synthetic */ e e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ View g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        d(l lVar, c0 c0Var, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.b = lVar;
            this.c = c0Var;
            this.d = obj;
            this.e = eVar;
            this.f = arrayList;
            this.g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0<String, View> a = j.a(this.b, (c0<String, String>) this.c, this.d, this.e);
            if (a != null) {
                this.f.addAll(a.values());
                this.f.add(this.g);
            }
            j.a(this.h, this.i, this.j, a, false);
            Object obj = this.d;
            if (obj != null) {
                this.b.b(obj, this.k, this.f);
                View a2 = j.a(a, this.e, this.l, this.j);
                if (a2 != null) {
                    this.b.a(a2, this.m);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {
        public Fragment a;
        public boolean b;
        public androidx.fragment.app.a c;
        public Fragment d;
        public boolean e;
        public androidx.fragment.app.a f;

        e() {
        }
    }

    static {
        b = Build.VERSION.SDK_INT >= 21 ? new k() : null;
        c = a();
    }

    static View a(c0<String, View> c0Var, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar = eVar.c;
        if (obj == null || c0Var == null || (arrayList = aVar.q) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0Var.get((z ? aVar.q : aVar.r).get(0));
    }

    private static e a(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    private static l a() {
        try {
            return (l) Class.forName("androidx.transition.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static l a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object n = fragment.n();
            if (n != null) {
                arrayList.add(n);
            }
            Object x = fragment.x();
            if (x != null) {
                arrayList.add(x);
            }
            Object z = fragment.z();
            if (z != null) {
                arrayList.add(z);
            }
        }
        if (fragment2 != null) {
            Object l = fragment2.l();
            if (l != null) {
                arrayList.add(l);
            }
            Object v = fragment2.v();
            if (v != null) {
                arrayList.add(v);
            }
            Object y = fragment2.y();
            if (y != null) {
                arrayList.add(y);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        l lVar = b;
        if (lVar != null && a(lVar, arrayList)) {
            return b;
        }
        l lVar2 = c;
        if (lVar2 != null && a(lVar2, arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static c0<String, String> a(int i, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        c0<String, String> c0Var = new c0<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (aVar.b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar.q;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar.q;
                        arrayList4 = aVar.r;
                    } else {
                        ArrayList<String> arrayList6 = aVar.q;
                        arrayList3 = aVar.r;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c0Var.remove(str2);
                        if (remove != null) {
                            c0Var.put(str, remove);
                        } else {
                            c0Var.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0Var;
    }

    static c0<String, View> a(l lVar, c0<String, String> c0Var, Object obj, e eVar) {
        androidx.core.app.j m;
        ArrayList<String> arrayList;
        String a2;
        Fragment fragment = eVar.a;
        View B = fragment.B();
        if (c0Var.isEmpty() || obj == null || B == null) {
            c0Var.clear();
            return null;
        }
        c0<String, View> c0Var2 = new c0<>();
        lVar.a((Map<String, View>) c0Var2, B);
        androidx.fragment.app.a aVar = eVar.c;
        if (eVar.b) {
            m = fragment.o();
            arrayList = aVar.q;
        } else {
            m = fragment.m();
            arrayList = aVar.r;
        }
        if (arrayList != null) {
            c0Var2.a((Collection<?>) arrayList);
            c0Var2.a((Collection<?>) c0Var.values());
        }
        if (m != null) {
            m.a(arrayList, c0Var2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0Var2.get(str);
                if (view == null) {
                    String a3 = a(c0Var, str);
                    if (a3 != null) {
                        c0Var.remove(a3);
                    }
                } else if (!str.equals(q2.p(view)) && (a2 = a(c0Var, str)) != null) {
                    c0Var.put(a2, q2.p(view));
                }
            }
        } else {
            a(c0Var, c0Var2);
        }
        return c0Var2;
    }

    private static Object a(l lVar, ViewGroup viewGroup, View view, c0<String, String> c0Var, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object a2;
        c0<String, String> c0Var2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.a;
        Fragment fragment2 = eVar.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.b;
        if (c0Var.isEmpty()) {
            c0Var2 = c0Var;
            a2 = null;
        } else {
            a2 = a(lVar, fragment, fragment2, z);
            c0Var2 = c0Var;
        }
        c0<String, View> b2 = b(lVar, c0Var2, a2, eVar);
        if (c0Var.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(b2.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj3 != null) {
            rect = new Rect();
            lVar.b(obj3, view, arrayList);
            a(lVar, obj3, obj2, b2, eVar.e, eVar.f);
            if (obj != null) {
                lVar.a(obj, rect);
            }
        } else {
            rect = null;
        }
        n.a(viewGroup, new d(lVar, c0Var, obj3, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object a(l lVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return lVar.c(lVar.b(z ? fragment2.z() : fragment.y()));
    }

    private static Object a(l lVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return lVar.b(z ? fragment.v() : fragment.l());
    }

    private static Object a(l lVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.g() : fragment.f() ? lVar.b(obj2, obj, obj3) : lVar.a(obj2, obj, obj3);
    }

    private static String a(c0<String, String> c0Var, String str) {
        int size = c0Var.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0Var.d(i))) {
                return c0Var.b(i);
            }
        }
        return null;
    }

    static ArrayList<View> a(l lVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View B = fragment.B();
        if (B != null) {
            lVar.a(arrayList2, B);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        lVar.a(obj, arrayList2);
        return arrayList2;
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z, c0<String, View> c0Var, boolean z2) {
        androidx.core.app.j m = z ? fragment2.m() : fragment.m();
        if (m != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c0Var == null ? 0 : c0Var.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(c0Var.b(i));
                arrayList.add(c0Var.d(i));
            }
            if (z2) {
                m.b(arrayList2, arrayList, null);
            } else {
                m.a(arrayList2, arrayList, null);
            }
        }
    }

    public static void a(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) {
        int size = aVar.b.size();
        for (int i = 0; i < size; i++) {
            a(aVar, aVar.b.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:
    
        if (r10.l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0092, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0090, code lost:
    
        if (r10.B == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(androidx.fragment.app.a r16, androidx.fragment.app.a.C0012a r17, android.util.SparseArray<androidx.fragment.app.j.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.a(androidx.fragment.app.a, androidx.fragment.app.a$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static void a(g gVar, int i, e eVar, View view, c0<String, String> c0Var) {
        Fragment fragment;
        Fragment fragment2;
        l a2;
        Object obj;
        ViewGroup viewGroup = gVar.o.a() ? (ViewGroup) gVar.o.a(i) : null;
        if (viewGroup == null || (a2 = a((fragment2 = eVar.d), (fragment = eVar.a))) == null) {
            return;
        }
        boolean z = eVar.b;
        boolean z2 = eVar.e;
        Object a3 = a(a2, fragment, z);
        Object b2 = b(a2, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object a4 = a(a2, viewGroup, view, c0Var, eVar, (ArrayList<View>) arrayList, arrayList2, a3, b2);
        if (a3 == null && a4 == null) {
            obj = b2;
            if (obj == null) {
                return;
            }
        } else {
            obj = b2;
        }
        ArrayList<View> a5 = a(a2, obj, fragment2, (ArrayList<View>) arrayList, view);
        Object obj2 = (a5 == null || a5.isEmpty()) ? null : obj;
        a2.a(a3, view);
        Object a6 = a(a2, a3, obj2, a4, fragment, eVar.b);
        if (a6 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            a2.a(a6, a3, arrayList3, obj2, a5, a4, arrayList2);
            a(a2, viewGroup, fragment, view, arrayList2, a3, arrayList3, obj2, a5);
            a2.a((View) viewGroup, arrayList2, (Map<String, String>) c0Var);
            a2.a(viewGroup, a6);
            a2.a(viewGroup, arrayList2, (Map<String, String>) c0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(g gVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (gVar.m < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                b(aVar, (SparseArray<e>) sparseArray, z);
            } else {
                a(aVar, (SparseArray<e>) sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(gVar.n.c());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                c0<String, String> a2 = a(keyAt, arrayList, arrayList2, i, i2);
                e eVar = (e) sparseArray.valueAt(i4);
                if (z) {
                    b(gVar, keyAt, eVar, view, a2);
                } else {
                    a(gVar, keyAt, eVar, view, a2);
                }
            }
        }
    }

    private static void a(l lVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        n.a(viewGroup, new b(obj, lVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void a(l lVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.l && fragment.B && fragment.P) {
            fragment.g(true);
            lVar.a(obj, fragment.B(), arrayList);
            n.a(fragment.I, new a(arrayList));
        }
    }

    private static void a(l lVar, Object obj, Object obj2, c0<String, View> c0Var, boolean z, androidx.fragment.app.a aVar) {
        ArrayList<String> arrayList = aVar.q;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0Var.get((z ? aVar.r : aVar.q).get(0));
        lVar.c(obj, view);
        if (obj2 != null) {
            lVar.c(obj2, view);
        }
    }

    private static void a(c0<String, String> c0Var, c0<String, View> c0Var2) {
        for (int size = c0Var.size() - 1; size >= 0; size--) {
            if (!c0Var2.containsKey(c0Var.d(size))) {
                c0Var.c(size);
            }
        }
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    private static void a(ArrayList<View> arrayList, c0<String, View> c0Var, Collection<String> collection) {
        for (int size = c0Var.size() - 1; size >= 0; size--) {
            View d2 = c0Var.d(size);
            if (collection.contains(q2.p(d2))) {
                arrayList.add(d2);
            }
        }
    }

    private static boolean a(l lVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!lVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static c0<String, View> b(l lVar, c0<String, String> c0Var, Object obj, e eVar) {
        androidx.core.app.j o;
        ArrayList<String> arrayList;
        if (c0Var.isEmpty() || obj == null) {
            c0Var.clear();
            return null;
        }
        Fragment fragment = eVar.d;
        c0<String, View> c0Var2 = new c0<>();
        lVar.a((Map<String, View>) c0Var2, fragment.B());
        androidx.fragment.app.a aVar = eVar.f;
        if (eVar.e) {
            o = fragment.m();
            arrayList = aVar.r;
        } else {
            o = fragment.o();
            arrayList = aVar.q;
        }
        c0Var2.a((Collection<?>) arrayList);
        if (o != null) {
            o.a(arrayList, c0Var2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0Var2.get(str);
                if (view == null) {
                    c0Var.remove(str);
                } else if (!str.equals(q2.p(view))) {
                    c0Var.put(q2.p(view), c0Var.remove(str));
                }
            }
        } else {
            c0Var.a((Collection<?>) c0Var2.keySet());
        }
        return c0Var2;
    }

    private static Object b(l lVar, ViewGroup viewGroup, View view, c0<String, String> c0Var, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.a;
        Fragment fragment2 = eVar.d;
        if (fragment != null) {
            fragment.B().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.b;
        Object a2 = c0Var.isEmpty() ? null : a(lVar, fragment, fragment2, z);
        c0<String, View> b2 = b(lVar, c0Var, a2, eVar);
        c0<String, View> a3 = a(lVar, c0Var, a2, eVar);
        if (c0Var.isEmpty()) {
            if (b2 != null) {
                b2.clear();
            }
            if (a3 != null) {
                a3.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, b2, c0Var.keySet());
            a(arrayList2, a3, c0Var.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            lVar.b(obj3, view, arrayList);
            a(lVar, obj3, obj2, b2, eVar.e, eVar.f);
            Rect rect2 = new Rect();
            View a4 = a(a3, eVar, obj, z);
            if (a4 != null) {
                lVar.a(obj, rect2);
            }
            rect = rect2;
            view2 = a4;
        } else {
            view2 = null;
            rect = null;
        }
        n.a(viewGroup, new c(fragment, fragment2, z, a3, view2, lVar, rect));
        return obj3;
    }

    private static Object b(l lVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return lVar.b(z ? fragment.x() : fragment.n());
    }

    public static void b(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) {
        if (aVar.a.o.a()) {
            for (int size = aVar.b.size() - 1; size >= 0; size--) {
                a(aVar, aVar.b.get(size), sparseArray, true, z);
            }
        }
    }

    private static void b(g gVar, int i, e eVar, View view, c0<String, String> c0Var) {
        Fragment fragment;
        Fragment fragment2;
        l a2;
        Object obj;
        ViewGroup viewGroup = gVar.o.a() ? (ViewGroup) gVar.o.a(i) : null;
        if (viewGroup == null || (a2 = a((fragment2 = eVar.d), (fragment = eVar.a))) == null) {
            return;
        }
        boolean z = eVar.b;
        boolean z2 = eVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object a3 = a(a2, fragment, z);
        Object b2 = b(a2, fragment2, z2);
        Object b3 = b(a2, viewGroup, view, c0Var, eVar, arrayList2, arrayList, a3, b2);
        if (a3 == null && b3 == null) {
            obj = b2;
            if (obj == null) {
                return;
            }
        } else {
            obj = b2;
        }
        ArrayList<View> a4 = a(a2, obj, fragment2, arrayList2, view);
        ArrayList<View> a5 = a(a2, a3, fragment, arrayList, view);
        a(a5, 4);
        Object a6 = a(a2, a3, obj, b3, fragment, z);
        if (a6 != null) {
            a(a2, obj, fragment2, a4);
            ArrayList<String> a7 = a2.a(arrayList);
            a2.a(a6, a3, a5, obj, a4, b3, arrayList);
            a2.a(viewGroup, a6);
            a2.a(viewGroup, arrayList2, arrayList, a7, c0Var);
            a(a5, 0);
            a2.b(b3, arrayList2, arrayList);
        }
    }
}
