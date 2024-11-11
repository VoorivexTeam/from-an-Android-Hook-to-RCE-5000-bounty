package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.AbstractC0232j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000.C0500c0;
import p000.C3107q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public class C0286j {

    /* renamed from: a */
    private static final int[] f1804a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final AbstractC0288l f1805b;

    /* renamed from: c */
    private static final AbstractC0288l f1806c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f1807b;

        a(ArrayList arrayList) {
            this.f1807b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0286j.m1961a((ArrayList<View>) this.f1807b, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$b */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f1808b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0288l f1809c;

        /* renamed from: d */
        final /* synthetic */ View f1810d;

        /* renamed from: e */
        final /* synthetic */ Fragment f1811e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f1812f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f1813g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f1814h;

        /* renamed from: i */
        final /* synthetic */ Object f1815i;

        b(Object obj, AbstractC0288l abstractC0288l, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1808b = obj;
            this.f1809c = abstractC0288l;
            this.f1810d = view;
            this.f1811e = fragment;
            this.f1812f = arrayList;
            this.f1813g = arrayList2;
            this.f1814h = arrayList3;
            this.f1815i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f1808b;
            if (obj != null) {
                this.f1809c.mo1981b(obj, this.f1810d);
                this.f1813g.addAll(C0286j.m1951a(this.f1809c, this.f1808b, this.f1811e, (ArrayList<View>) this.f1812f, this.f1810d));
            }
            if (this.f1814h != null) {
                if (this.f1815i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1810d);
                    this.f1809c.mo1977a(this.f1815i, this.f1814h, arrayList);
                }
                this.f1814h.clear();
                this.f1814h.add(this.f1810d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$c */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Fragment f1816b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1817c;

        /* renamed from: d */
        final /* synthetic */ boolean f1818d;

        /* renamed from: e */
        final /* synthetic */ C0500c0 f1819e;

        /* renamed from: f */
        final /* synthetic */ View f1820f;

        /* renamed from: g */
        final /* synthetic */ AbstractC0288l f1821g;

        /* renamed from: h */
        final /* synthetic */ Rect f1822h;

        c(Fragment fragment, Fragment fragment2, boolean z, C0500c0 c0500c0, View view, AbstractC0288l abstractC0288l, Rect rect) {
            this.f1816b = fragment;
            this.f1817c = fragment2;
            this.f1818d = z;
            this.f1819e = c0500c0;
            this.f1820f = view;
            this.f1821g = abstractC0288l;
            this.f1822h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0286j.m1952a(this.f1816b, this.f1817c, this.f1818d, (C0500c0<String, View>) this.f1819e, false);
            View view = this.f1820f;
            if (view != null) {
                this.f1821g.m1991a(view, this.f1822h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$d */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AbstractC0288l f1823b;

        /* renamed from: c */
        final /* synthetic */ C0500c0 f1824c;

        /* renamed from: d */
        final /* synthetic */ Object f1825d;

        /* renamed from: e */
        final /* synthetic */ e f1826e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f1827f;

        /* renamed from: g */
        final /* synthetic */ View f1828g;

        /* renamed from: h */
        final /* synthetic */ Fragment f1829h;

        /* renamed from: i */
        final /* synthetic */ Fragment f1830i;

        /* renamed from: j */
        final /* synthetic */ boolean f1831j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f1832k;

        /* renamed from: l */
        final /* synthetic */ Object f1833l;

        /* renamed from: m */
        final /* synthetic */ Rect f1834m;

        d(AbstractC0288l abstractC0288l, C0500c0 c0500c0, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1823b = abstractC0288l;
            this.f1824c = c0500c0;
            this.f1825d = obj;
            this.f1826e = eVar;
            this.f1827f = arrayList;
            this.f1828g = view;
            this.f1829h = fragment;
            this.f1830i = fragment2;
            this.f1831j = z;
            this.f1832k = arrayList2;
            this.f1833l = obj2;
            this.f1834m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0500c0<String, View> m1945a = C0286j.m1945a(this.f1823b, (C0500c0<String, String>) this.f1824c, this.f1825d, this.f1826e);
            if (m1945a != null) {
                this.f1827f.addAll(m1945a.values());
                this.f1827f.add(this.f1828g);
            }
            C0286j.m1952a(this.f1829h, this.f1830i, this.f1831j, m1945a, false);
            Object obj = this.f1825d;
            if (obj != null) {
                this.f1823b.mo1983b(obj, this.f1832k, this.f1827f);
                View m1940a = C0286j.m1940a(m1945a, this.f1826e, this.f1833l, this.f1831j);
                if (m1940a != null) {
                    this.f1823b.m1991a(m1940a, this.f1834m);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public Fragment f1835a;

        /* renamed from: b */
        public boolean f1836b;

        /* renamed from: c */
        public C0277a f1837c;

        /* renamed from: d */
        public Fragment f1838d;

        /* renamed from: e */
        public boolean f1839e;

        /* renamed from: f */
        public C0277a f1840f;

        e() {
        }
    }

    static {
        f1805b = Build.VERSION.SDK_INT >= 21 ? new C0287k() : null;
        f1806c = m1942a();
    }

    /* renamed from: a */
    static View m1940a(C0500c0<String, View> c0500c0, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0277a c0277a = eVar.f1837c;
        if (obj == null || c0500c0 == null || (arrayList = c0277a.f1710q) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0500c0.get((z ? c0277a.f1710q : c0277a.f1711r).get(0));
    }

    /* renamed from: a */
    private static e m1941a(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    /* renamed from: a */
    private static AbstractC0288l m1942a() {
        try {
            return (AbstractC0288l) Class.forName("androidx.transition.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static AbstractC0288l m1943a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m1712n = fragment.m1712n();
            if (m1712n != null) {
                arrayList.add(m1712n);
            }
            Object m1722x = fragment.m1722x();
            if (m1722x != null) {
                arrayList.add(m1722x);
            }
            Object m1724z = fragment.m1724z();
            if (m1724z != null) {
                arrayList.add(m1724z);
            }
        }
        if (fragment2 != null) {
            Object m1708l = fragment2.m1708l();
            if (m1708l != null) {
                arrayList.add(m1708l);
            }
            Object m1720v = fragment2.m1720v();
            if (m1720v != null) {
                arrayList.add(m1720v);
            }
            Object m1723y = fragment2.m1723y();
            if (m1723y != null) {
                arrayList.add(m1723y);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0288l abstractC0288l = f1805b;
        if (abstractC0288l != null && m1963a(abstractC0288l, arrayList)) {
            return f1805b;
        }
        AbstractC0288l abstractC0288l2 = f1806c;
        if (abstractC0288l2 != null && m1963a(abstractC0288l2, arrayList)) {
            return f1806c;
        }
        if (f1805b == null && f1806c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0500c0<String, String> m1944a(int i, ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0500c0<String, String> c0500c0 = new C0500c0<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0277a c0277a = arrayList.get(i4);
            if (c0277a.m1768b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = c0277a.f1710q;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c0277a.f1710q;
                        arrayList4 = c0277a.f1711r;
                    } else {
                        ArrayList<String> arrayList6 = c0277a.f1710q;
                        arrayList3 = c0277a.f1711r;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c0500c0.remove(str2);
                        if (remove != null) {
                            c0500c0.put(str, remove);
                        } else {
                            c0500c0.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0500c0;
    }

    /* renamed from: a */
    static C0500c0<String, View> m1945a(AbstractC0288l abstractC0288l, C0500c0<String, String> c0500c0, Object obj, e eVar) {
        AbstractC0232j m1710m;
        ArrayList<String> arrayList;
        String m1950a;
        Fragment fragment = eVar.f1835a;
        View m1618B = fragment.m1618B();
        if (c0500c0.isEmpty() || obj == null || m1618B == null) {
            c0500c0.clear();
            return null;
        }
        C0500c0<String, View> c0500c02 = new C0500c0<>();
        abstractC0288l.m1996a((Map<String, View>) c0500c02, m1618B);
        C0277a c0277a = eVar.f1837c;
        if (eVar.f1836b) {
            m1710m = fragment.m1713o();
            arrayList = c0277a.f1710q;
        } else {
            m1710m = fragment.m1710m();
            arrayList = c0277a.f1711r;
        }
        if (arrayList != null) {
            c0500c02.m3506a((Collection<?>) arrayList);
            c0500c02.m3506a((Collection<?>) c0500c0.values());
        }
        if (m1710m != null) {
            m1710m.m1439a(arrayList, c0500c02);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0500c02.get(str);
                if (view == null) {
                    String m1950a2 = m1950a(c0500c0, str);
                    if (m1950a2 != null) {
                        c0500c0.remove(m1950a2);
                    }
                } else if (!str.equals(C3107q2.m14924p(view)) && (m1950a = m1950a(c0500c0, str)) != null) {
                    c0500c0.put(m1950a, C3107q2.m14924p(view));
                }
            }
        } else {
            m1960a(c0500c0, c0500c02);
        }
        return c0500c02;
    }

    /* renamed from: a */
    private static Object m1946a(AbstractC0288l abstractC0288l, ViewGroup viewGroup, View view, C0500c0<String, String> c0500c0, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m1947a;
        C0500c0<String, String> c0500c02;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f1835a;
        Fragment fragment2 = eVar.f1838d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f1836b;
        if (c0500c0.isEmpty()) {
            c0500c02 = c0500c0;
            m1947a = null;
        } else {
            m1947a = m1947a(abstractC0288l, fragment, fragment2, z);
            c0500c02 = c0500c0;
        }
        C0500c0<String, View> m1964b = m1964b(abstractC0288l, c0500c02, m1947a, eVar);
        if (c0500c0.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m1964b.values());
            obj3 = m1947a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1952a(fragment, fragment2, z, m1964b, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0288l.mo1982b(obj3, view, arrayList);
            m1959a(abstractC0288l, obj3, obj2, m1964b, eVar.f1839e, eVar.f1840f);
            if (obj != null) {
                abstractC0288l.mo1972a(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0290n.m2002a(viewGroup, new d(abstractC0288l, c0500c0, obj3, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: a */
    private static Object m1947a(AbstractC0288l abstractC0288l, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return abstractC0288l.mo1984c(abstractC0288l.mo1979b(z ? fragment2.m1724z() : fragment.m1723y()));
    }

    /* renamed from: a */
    private static Object m1948a(AbstractC0288l abstractC0288l, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return abstractC0288l.mo1979b(z ? fragment.m1720v() : fragment.m1708l());
    }

    /* renamed from: a */
    private static Object m1949a(AbstractC0288l abstractC0288l, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.m1699g() : fragment.m1696f() ? abstractC0288l.mo1980b(obj2, obj, obj3) : abstractC0288l.mo1970a(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m1950a(C0500c0<String, String> c0500c0, String str) {
        int size = c0500c0.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0500c0.m12311d(i))) {
                return c0500c0.m12310b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static ArrayList<View> m1951a(AbstractC0288l abstractC0288l, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View m1618B = fragment.m1618B();
        if (m1618B != null) {
            abstractC0288l.m1995a(arrayList2, m1618B);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0288l.mo1976a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m1952a(Fragment fragment, Fragment fragment2, boolean z, C0500c0<String, View> c0500c0, boolean z2) {
        AbstractC0232j m1710m = z ? fragment2.m1710m() : fragment.m1710m();
        if (m1710m != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c0500c0 == null ? 0 : c0500c0.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(c0500c0.m12310b(i));
                arrayList.add(c0500c0.m12311d(i));
            }
            if (z2) {
                m1710m.m1440b(arrayList2, arrayList, null);
            } else {
                m1710m.m1438a(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: a */
    public static void m1953a(C0277a c0277a, SparseArray<e> sparseArray, boolean z) {
        int size = c0277a.f1695b.size();
        for (int i = 0; i < size; i++) {
            m1954a(c0277a, c0277a.f1695b.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:
    
        if (r10.f1622l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0092, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0090, code lost:
    
        if (r10.f1590B == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m1954a(androidx.fragment.app.C0277a r16, androidx.fragment.app.C0277a.a r17, android.util.SparseArray<androidx.fragment.app.C0286j.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0286j.m1954a(androidx.fragment.app.a, androidx.fragment.app.a$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static void m1955a(LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g, int i, e eVar, View view, C0500c0<String, String> c0500c0) {
        Fragment fragment;
        Fragment fragment2;
        AbstractC0288l m1943a;
        Object obj;
        ViewGroup viewGroup = layoutInflaterFactory2C0283g.f1756o.mo1727a() ? (ViewGroup) layoutInflaterFactory2C0283g.f1756o.mo1725a(i) : null;
        if (viewGroup == null || (m1943a = m1943a((fragment2 = eVar.f1838d), (fragment = eVar.f1835a))) == null) {
            return;
        }
        boolean z = eVar.f1836b;
        boolean z2 = eVar.f1839e;
        Object m1948a = m1948a(m1943a, fragment, z);
        Object m1966b = m1966b(m1943a, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m1946a = m1946a(m1943a, viewGroup, view, c0500c0, eVar, (ArrayList<View>) arrayList, arrayList2, m1948a, m1966b);
        if (m1948a == null && m1946a == null) {
            obj = m1966b;
            if (obj == null) {
                return;
            }
        } else {
            obj = m1966b;
        }
        ArrayList<View> m1951a = m1951a(m1943a, obj, fragment2, (ArrayList<View>) arrayList, view);
        Object obj2 = (m1951a == null || m1951a.isEmpty()) ? null : obj;
        m1943a.mo1973a(m1948a, view);
        Object m1949a = m1949a(m1943a, m1948a, obj2, m1946a, fragment, eVar.f1836b);
        if (m1949a != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m1943a.mo1975a(m1949a, m1948a, arrayList3, obj2, m1951a, m1946a, arrayList2);
            m1957a(m1943a, viewGroup, fragment, view, arrayList2, m1948a, arrayList3, obj2, m1951a);
            m1943a.m1993a((View) viewGroup, arrayList2, (Map<String, String>) c0500c0);
            m1943a.mo1971a(viewGroup, m1949a);
            m1943a.m1994a(viewGroup, arrayList2, (Map<String, String>) c0500c0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1956a(LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g, ArrayList<C0277a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (layoutInflaterFactory2C0283g.f1754m < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0277a c0277a = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m1967b(c0277a, (SparseArray<e>) sparseArray, z);
            } else {
                m1953a(c0277a, (SparseArray<e>) sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(layoutInflaterFactory2C0283g.f1755n.m1805c());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C0500c0<String, String> m1944a = m1944a(keyAt, arrayList, arrayList2, i, i2);
                e eVar = (e) sparseArray.valueAt(i4);
                if (z) {
                    m1968b(layoutInflaterFactory2C0283g, keyAt, eVar, view, m1944a);
                } else {
                    m1955a(layoutInflaterFactory2C0283g, keyAt, eVar, view, m1944a);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1957a(AbstractC0288l abstractC0288l, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0290n.m2002a(viewGroup, new b(obj, abstractC0288l, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: a */
    private static void m1958a(AbstractC0288l abstractC0288l, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f1622l && fragment.f1590B && fragment.f1604P) {
            fragment.m1698g(true);
            abstractC0288l.mo1974a(obj, fragment.m1618B(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0290n.m2002a(fragment.f1597I, new a(arrayList));
        }
    }

    /* renamed from: a */
    private static void m1959a(AbstractC0288l abstractC0288l, Object obj, Object obj2, C0500c0<String, View> c0500c0, boolean z, C0277a c0277a) {
        ArrayList<String> arrayList = c0277a.f1710q;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0500c0.get((z ? c0277a.f1711r : c0277a.f1710q).get(0));
        abstractC0288l.mo1985c(obj, view);
        if (obj2 != null) {
            abstractC0288l.mo1985c(obj2, view);
        }
    }

    /* renamed from: a */
    private static void m1960a(C0500c0<String, String> c0500c0, C0500c0<String, View> c0500c02) {
        for (int size = c0500c0.size() - 1; size >= 0; size--) {
            if (!c0500c02.containsKey(c0500c0.m12311d(size))) {
                c0500c0.mo3398c(size);
            }
        }
    }

    /* renamed from: a */
    static void m1961a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* renamed from: a */
    private static void m1962a(ArrayList<View> arrayList, C0500c0<String, View> c0500c0, Collection<String> collection) {
        for (int size = c0500c0.size() - 1; size >= 0; size--) {
            View m12311d = c0500c0.m12311d(size);
            if (collection.contains(C3107q2.m14924p(m12311d))) {
                arrayList.add(m12311d);
            }
        }
    }

    /* renamed from: a */
    private static boolean m1963a(AbstractC0288l abstractC0288l, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0288l.mo1978a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0500c0<String, View> m1964b(AbstractC0288l abstractC0288l, C0500c0<String, String> c0500c0, Object obj, e eVar) {
        AbstractC0232j m1713o;
        ArrayList<String> arrayList;
        if (c0500c0.isEmpty() || obj == null) {
            c0500c0.clear();
            return null;
        }
        Fragment fragment = eVar.f1838d;
        C0500c0<String, View> c0500c02 = new C0500c0<>();
        abstractC0288l.m1996a((Map<String, View>) c0500c02, fragment.m1618B());
        C0277a c0277a = eVar.f1840f;
        if (eVar.f1839e) {
            m1713o = fragment.m1710m();
            arrayList = c0277a.f1711r;
        } else {
            m1713o = fragment.m1713o();
            arrayList = c0277a.f1710q;
        }
        c0500c02.m3506a((Collection<?>) arrayList);
        if (m1713o != null) {
            m1713o.m1439a(arrayList, c0500c02);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0500c02.get(str);
                if (view == null) {
                    c0500c0.remove(str);
                } else if (!str.equals(C3107q2.m14924p(view))) {
                    c0500c0.put(C3107q2.m14924p(view), c0500c0.remove(str));
                }
            }
        } else {
            c0500c0.m3506a((Collection<?>) c0500c02.keySet());
        }
        return c0500c02;
    }

    /* renamed from: b */
    private static Object m1965b(AbstractC0288l abstractC0288l, ViewGroup viewGroup, View view, C0500c0<String, String> c0500c0, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f1835a;
        Fragment fragment2 = eVar.f1838d;
        if (fragment != null) {
            fragment.m1618B().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f1836b;
        Object m1947a = c0500c0.isEmpty() ? null : m1947a(abstractC0288l, fragment, fragment2, z);
        C0500c0<String, View> m1964b = m1964b(abstractC0288l, c0500c0, m1947a, eVar);
        C0500c0<String, View> m1945a = m1945a(abstractC0288l, c0500c0, m1947a, eVar);
        if (c0500c0.isEmpty()) {
            if (m1964b != null) {
                m1964b.clear();
            }
            if (m1945a != null) {
                m1945a.clear();
            }
            obj3 = null;
        } else {
            m1962a(arrayList, m1964b, c0500c0.keySet());
            m1962a(arrayList2, m1945a, c0500c0.values());
            obj3 = m1947a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1952a(fragment, fragment2, z, m1964b, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0288l.mo1982b(obj3, view, arrayList);
            m1959a(abstractC0288l, obj3, obj2, m1964b, eVar.f1839e, eVar.f1840f);
            Rect rect2 = new Rect();
            View m1940a = m1940a(m1945a, eVar, obj, z);
            if (m1940a != null) {
                abstractC0288l.mo1972a(obj, rect2);
            }
            rect = rect2;
            view2 = m1940a;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0290n.m2002a(viewGroup, new c(fragment, fragment2, z, m1945a, view2, abstractC0288l, rect));
        return obj3;
    }

    /* renamed from: b */
    private static Object m1966b(AbstractC0288l abstractC0288l, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return abstractC0288l.mo1979b(z ? fragment.m1722x() : fragment.m1712n());
    }

    /* renamed from: b */
    public static void m1967b(C0277a c0277a, SparseArray<e> sparseArray, boolean z) {
        if (c0277a.f1694a.f1756o.mo1727a()) {
            for (int size = c0277a.f1695b.size() - 1; size >= 0; size--) {
                m1954a(c0277a, c0277a.f1695b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    private static void m1968b(LayoutInflaterFactory2C0283g layoutInflaterFactory2C0283g, int i, e eVar, View view, C0500c0<String, String> c0500c0) {
        Fragment fragment;
        Fragment fragment2;
        AbstractC0288l m1943a;
        Object obj;
        ViewGroup viewGroup = layoutInflaterFactory2C0283g.f1756o.mo1727a() ? (ViewGroup) layoutInflaterFactory2C0283g.f1756o.mo1725a(i) : null;
        if (viewGroup == null || (m1943a = m1943a((fragment2 = eVar.f1838d), (fragment = eVar.f1835a))) == null) {
            return;
        }
        boolean z = eVar.f1836b;
        boolean z2 = eVar.f1839e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m1948a = m1948a(m1943a, fragment, z);
        Object m1966b = m1966b(m1943a, fragment2, z2);
        Object m1965b = m1965b(m1943a, viewGroup, view, c0500c0, eVar, arrayList2, arrayList, m1948a, m1966b);
        if (m1948a == null && m1965b == null) {
            obj = m1966b;
            if (obj == null) {
                return;
            }
        } else {
            obj = m1966b;
        }
        ArrayList<View> m1951a = m1951a(m1943a, obj, fragment2, arrayList2, view);
        ArrayList<View> m1951a2 = m1951a(m1943a, m1948a, fragment, arrayList, view);
        m1961a(m1951a2, 4);
        Object m1949a = m1949a(m1943a, m1948a, obj, m1965b, fragment, z);
        if (m1949a != null) {
            m1958a(m1943a, obj, fragment2, m1951a);
            ArrayList<String> m1990a = m1943a.m1990a(arrayList);
            m1943a.mo1975a(m1949a, m1948a, m1951a2, obj, m1951a, m1965b, arrayList);
            m1943a.mo1971a(viewGroup, m1949a);
            m1943a.m1992a(viewGroup, arrayList2, arrayList, m1990a, c0500c0);
            m1961a(m1951a2, 0);
            m1943a.mo1983b(m1965b, arrayList2, arrayList);
        }
    }
}
