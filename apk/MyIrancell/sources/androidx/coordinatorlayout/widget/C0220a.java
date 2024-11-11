package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p000.C2573i0;
import p000.C3327v1;
import p000.InterfaceC3283u1;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0220a<T> {

    /* renamed from: a */
    private final InterfaceC3283u1<ArrayList<T>> f1365a = new C3327v1(10);

    /* renamed from: b */
    private final C2573i0<T, ArrayList<T>> f1366b = new C2573i0<>();

    /* renamed from: c */
    private final ArrayList<T> f1367c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f1368d = new HashSet<>();

    /* renamed from: a */
    private void m1342a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f1366b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m1342a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    /* renamed from: a */
    private void m1343a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1365a.mo13875a(arrayList);
    }

    /* renamed from: c */
    private ArrayList<T> m1344c() {
        ArrayList<T> mo13874a = this.f1365a.mo13874a();
        return mo13874a == null ? new ArrayList<>() : mo13874a;
    }

    /* renamed from: a */
    public void m1345a() {
        int size = this.f1366b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m12311d = this.f1366b.m12311d(i);
            if (m12311d != null) {
                m1343a((ArrayList) m12311d);
            }
        }
        this.f1366b.clear();
    }

    /* renamed from: a */
    public void m1346a(T t) {
        if (this.f1366b.containsKey(t)) {
            return;
        }
        this.f1366b.put(t, null);
    }

    /* renamed from: a */
    public void m1347a(T t, T t2) {
        if (!this.f1366b.containsKey(t) || !this.f1366b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f1366b.get(t);
        if (arrayList == null) {
            arrayList = m1344c();
            this.f1366b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public ArrayList<T> m1348b() {
        this.f1367c.clear();
        this.f1368d.clear();
        int size = this.f1366b.size();
        for (int i = 0; i < size; i++) {
            m1342a(this.f1366b.m12310b(i), this.f1367c, this.f1368d);
        }
        return this.f1367c;
    }

    /* renamed from: b */
    public boolean m1349b(T t) {
        return this.f1366b.containsKey(t);
    }

    /* renamed from: c */
    public List m1350c(T t) {
        return this.f1366b.get(t);
    }

    /* renamed from: d */
    public List<T> m1351d(T t) {
        int size = this.f1366b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m12311d = this.f1366b.m12311d(i);
            if (m12311d != null && m12311d.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1366b.m12310b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean m1352e(T t) {
        int size = this.f1366b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m12311d = this.f1366b.m12311d(i);
            if (m12311d != null && m12311d.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
