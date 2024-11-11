package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.C3107q2;
import p000.C3188s2;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public abstract class AbstractC0288l {

    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f1852b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f1853c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f1854d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f1855e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f1856f;

        a(AbstractC0288l abstractC0288l, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1852b = i;
            this.f1853c = arrayList;
            this.f1854d = arrayList2;
            this.f1855e = arrayList3;
            this.f1856f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f1852b; i++) {
                C3107q2.m14894a((View) this.f1853c.get(i), (String) this.f1854d.get(i));
                C3107q2.m14894a((View) this.f1855e.get(i), (String) this.f1856f.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f1857b;

        /* renamed from: c */
        final /* synthetic */ Map f1858c;

        b(AbstractC0288l abstractC0288l, ArrayList arrayList, Map map) {
            this.f1857b = arrayList;
            this.f1858c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1857b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1857b.get(i);
                String m14924p = C3107q2.m14924p(view);
                if (m14924p != null) {
                    C3107q2.m14894a(view, AbstractC0288l.m1986a((Map<String, String>) this.f1858c, m14924p));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f1859b;

        /* renamed from: c */
        final /* synthetic */ Map f1860c;

        c(AbstractC0288l abstractC0288l, ArrayList arrayList, Map map) {
            this.f1859b = arrayList;
            this.f1860c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1859b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1859b.get(i);
                C3107q2.m14894a(view, (String) this.f1860c.get(C3107q2.m14924p(view)));
            }
        }
    }

    /* renamed from: a */
    static String m1986a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m1987a(List<View> list, View view) {
        int size = list.size();
        if (m1989a(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m1989a(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static boolean m1988a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m1989a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo1970a(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> m1990a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C3107q2.m14924p(view));
            C3107q2.m14894a(view, (String) null);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m1991a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1992a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m14924p = C3107q2.m14924p(view2);
            arrayList4.add(m14924p);
            if (m14924p != null) {
                C3107q2.m14894a(view2, (String) null);
                String str = map.get(m14924p);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        C3107q2.m14894a(arrayList2.get(i2), m14924p);
                        break;
                    }
                    i2++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0290n.m2002a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1993a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0290n.m2002a(view, new b(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo1971a(ViewGroup viewGroup, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1994a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0290n.m2002a(viewGroup, new c(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo1972a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo1973a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo1974a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo1975a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo1976a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo1977a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1995a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            View view2 = view;
            if (z) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean m15321a = C3188s2.m15321a(viewGroup);
                view2 = viewGroup;
                if (!m15321a) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m1995a(arrayList, viewGroup.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1996a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m14924p = C3107q2.m14924p(view);
            if (m14924p != null) {
                map.put(m14924p, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1996a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo1978a(Object obj);

    /* renamed from: b */
    public abstract Object mo1979b(Object obj);

    /* renamed from: b */
    public abstract Object mo1980b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo1981b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo1982b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo1983b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo1984c(Object obj);

    /* renamed from: c */
    public abstract void mo1985c(Object obj, View view);
}
