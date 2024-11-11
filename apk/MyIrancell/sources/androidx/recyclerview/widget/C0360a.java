package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0366g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000.C3327v1;
import p000.InterfaceC3283u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public class C0360a implements C0366g.a {

    /* renamed from: a */
    private InterfaceC3283u1<b> f2225a;

    /* renamed from: b */
    final ArrayList<b> f2226b;

    /* renamed from: c */
    final ArrayList<b> f2227c;

    /* renamed from: d */
    final a f2228d;

    /* renamed from: e */
    Runnable f2229e;

    /* renamed from: f */
    final boolean f2230f;

    /* renamed from: g */
    final C0366g f2231g;

    /* renamed from: h */
    private int f2232h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        RecyclerView.AbstractC0330c0 mo2388a(int i);

        /* renamed from: a */
        void mo2389a(int i, int i2);

        /* renamed from: a */
        void mo2390a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo2391a(b bVar);

        /* renamed from: b */
        void mo2392b(int i, int i2);

        /* renamed from: b */
        void mo2393b(b bVar);

        /* renamed from: c */
        void mo2394c(int i, int i2);

        /* renamed from: d */
        void mo2396d(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        int f2233a;

        /* renamed from: b */
        int f2234b;

        /* renamed from: c */
        Object f2235c;

        /* renamed from: d */
        int f2236d;

        b(int i, int i2, int i3, Object obj) {
            this.f2233a = i;
            this.f2234b = i2;
            this.f2236d = i3;
            this.f2235c = obj;
        }

        /* renamed from: a */
        String m2759a() {
            int i = this.f2233a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f2233a;
            if (i != bVar.f2233a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2236d - this.f2234b) == 1 && this.f2236d == bVar.f2234b && this.f2234b == bVar.f2236d) {
                return true;
            }
            if (this.f2236d != bVar.f2236d || this.f2234b != bVar.f2234b) {
                return false;
            }
            Object obj2 = this.f2235c;
            Object obj3 = bVar.f2235c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2233a * 31) + this.f2234b) * 31) + this.f2236d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m2759a() + ",s:" + this.f2234b + "c:" + this.f2236d + ",p:" + this.f2235c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0360a(a aVar) {
        this(aVar, false);
    }

    C0360a(a aVar, boolean z) {
        this.f2225a = new C3327v1(30);
        this.f2226b = new ArrayList<>();
        this.f2227c = new ArrayList<>();
        this.f2232h = 0;
        this.f2228d = aVar;
        this.f2230f = z;
        this.f2231g = new C0366g(this);
    }

    /* renamed from: b */
    private int m2737b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f2227c.size() - 1; size >= 0; size--) {
            b bVar = this.f2227c.get(size);
            int i7 = bVar.f2233a;
            if (i7 == 8) {
                int i8 = bVar.f2234b;
                int i9 = bVar.f2236d;
                if (i8 >= i9) {
                    i9 = i8;
                    i8 = i9;
                }
                if (i < i8 || i > i9) {
                    int i10 = bVar.f2234b;
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f2234b = i10 + 1;
                            i4 = bVar.f2236d + 1;
                        } else if (i2 == 2) {
                            bVar.f2234b = i10 - 1;
                            i4 = bVar.f2236d - 1;
                        }
                        bVar.f2236d = i4;
                    }
                } else {
                    int i11 = bVar.f2234b;
                    if (i8 == i11) {
                        if (i2 == 1) {
                            i6 = bVar.f2236d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f2236d - 1;
                            }
                            i++;
                        }
                        bVar.f2236d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i11 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i11 - 1;
                            }
                            i--;
                        }
                        bVar.f2234b = i5;
                        i--;
                    }
                }
            } else {
                int i12 = bVar.f2234b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f2234b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f2236d;
                } else if (i7 == 2) {
                    i += bVar.f2236d;
                }
            }
        }
        for (int size2 = this.f2227c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2227c.get(size2);
            if (bVar2.f2233a == 8) {
                int i13 = bVar2.f2236d;
                if (i13 != bVar2.f2234b && i13 >= 0) {
                }
                this.f2227c.remove(size2);
                mo2749a(bVar2);
            } else {
                if (bVar2.f2236d > 0) {
                }
                this.f2227c.remove(size2);
                mo2749a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: b */
    private void m2738b(b bVar) {
        m2744g(bVar);
    }

    /* renamed from: c */
    private void m2739c(b bVar) {
        m2744g(bVar);
    }

    /* renamed from: d */
    private void m2740d(b bVar) {
        boolean z;
        char c;
        int i = bVar.f2234b;
        int i2 = bVar.f2236d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f2228d.mo2388a(i3) != null || m2741d(i3)) {
                if (c2 == 0) {
                    m2743f(mo2747a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m2744g(mo2747a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f2236d) {
            mo2749a(bVar);
            bVar = mo2747a(2, i, i4, null);
        }
        if (c2 == 0) {
            m2743f(bVar);
        } else {
            m2744g(bVar);
        }
    }

    /* renamed from: d */
    private boolean m2741d(int i) {
        int size = this.f2227c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2227c.get(i2);
            int i3 = bVar.f2233a;
            if (i3 == 8) {
                if (m2746a(bVar.f2236d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2234b;
                int i5 = bVar.f2236d + i4;
                while (i4 < i5) {
                    if (m2746a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m2742e(b bVar) {
        int i = bVar.f2234b;
        int i2 = bVar.f2236d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f2228d.mo2388a(i) != null || m2741d(i)) {
                if (c == 0) {
                    m2743f(mo2747a(4, i3, i4, bVar.f2235c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m2744g(mo2747a(4, i3, i4, bVar.f2235c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f2236d) {
            Object obj = bVar.f2235c;
            mo2749a(bVar);
            bVar = mo2747a(4, i3, i4, obj);
        }
        if (c == 0) {
            m2743f(bVar);
        } else {
            m2744g(bVar);
        }
    }

    /* renamed from: f */
    private void m2743f(b bVar) {
        int i;
        int i2 = bVar.f2233a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2737b = m2737b(bVar.f2234b, i2);
        int i3 = bVar.f2234b;
        int i4 = bVar.f2233a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f2236d; i6++) {
            int m2737b2 = m2737b(bVar.f2234b + (i * i6), bVar.f2233a);
            int i7 = bVar.f2233a;
            if (i7 == 2 ? m2737b2 == m2737b : i7 == 4 && m2737b2 == m2737b + 1) {
                i5++;
            } else {
                b mo2747a = mo2747a(bVar.f2233a, m2737b, i5, bVar.f2235c);
                m2750a(mo2747a, i3);
                mo2749a(mo2747a);
                if (bVar.f2233a == 4) {
                    i3 += i5;
                }
                m2737b = m2737b2;
                i5 = 1;
            }
        }
        Object obj = bVar.f2235c;
        mo2749a(bVar);
        if (i5 > 0) {
            b mo2747a2 = mo2747a(bVar.f2233a, m2737b, i5, obj);
            m2750a(mo2747a2, i3);
            mo2749a(mo2747a2);
        }
    }

    /* renamed from: g */
    private void m2744g(b bVar) {
        this.f2227c.add(bVar);
        int i = bVar.f2233a;
        if (i == 1) {
            this.f2228d.mo2394c(bVar.f2234b, bVar.f2236d);
            return;
        }
        if (i == 2) {
            this.f2228d.mo2392b(bVar.f2234b, bVar.f2236d);
            return;
        }
        if (i == 4) {
            this.f2228d.mo2390a(bVar.f2234b, bVar.f2236d, bVar.f2235c);
        } else {
            if (i == 8) {
                this.f2228d.mo2389a(bVar.f2234b, bVar.f2236d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: a */
    public int m2745a(int i) {
        int size = this.f2226b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2226b.get(i2);
            int i3 = bVar.f2233a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2234b;
                    if (i4 <= i) {
                        int i5 = bVar.f2236d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2234b;
                    if (i6 == i) {
                        i = bVar.f2236d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2236d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2234b <= i) {
                i += bVar.f2236d;
            }
        }
        return i;
    }

    /* renamed from: a */
    int m2746a(int i, int i2) {
        int size = this.f2227c.size();
        while (i2 < size) {
            b bVar = this.f2227c.get(i2);
            int i3 = bVar.f2233a;
            if (i3 == 8) {
                int i4 = bVar.f2234b;
                if (i4 == i) {
                    i = bVar.f2236d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2236d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2234b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2236d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2236d;
                }
            }
            i2++;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C0366g.a
    /* renamed from: a */
    public b mo2747a(int i, int i2, int i3, Object obj) {
        b mo13874a = this.f2225a.mo13874a();
        if (mo13874a == null) {
            return new b(i, i2, i3, obj);
        }
        mo13874a.f2233a = i;
        mo13874a.f2234b = i2;
        mo13874a.f2236d = i3;
        mo13874a.f2235c = obj;
        return mo13874a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2748a() {
        int size = this.f2227c.size();
        for (int i = 0; i < size; i++) {
            this.f2228d.mo2391a(this.f2227c.get(i));
        }
        m2751a(this.f2227c);
        this.f2232h = 0;
    }

    @Override // androidx.recyclerview.widget.C0366g.a
    /* renamed from: a */
    public void mo2749a(b bVar) {
        if (this.f2230f) {
            return;
        }
        bVar.f2235c = null;
        this.f2225a.mo13875a(bVar);
    }

    /* renamed from: a */
    void m2750a(b bVar, int i) {
        this.f2228d.mo2393b(bVar);
        int i2 = bVar.f2233a;
        if (i2 == 2) {
            this.f2228d.mo2396d(i, bVar.f2236d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f2228d.mo2390a(i, bVar.f2236d, bVar.f2235c);
        }
    }

    /* renamed from: a */
    void m2751a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo2749a(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m2752b(int i) {
        return m2746a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2753b() {
        m2748a();
        int size = this.f2226b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2226b.get(i);
            int i2 = bVar.f2233a;
            if (i2 == 1) {
                this.f2228d.mo2391a(bVar);
                this.f2228d.mo2394c(bVar.f2234b, bVar.f2236d);
            } else if (i2 == 2) {
                this.f2228d.mo2391a(bVar);
                this.f2228d.mo2396d(bVar.f2234b, bVar.f2236d);
            } else if (i2 == 4) {
                this.f2228d.mo2391a(bVar);
                this.f2228d.mo2390a(bVar.f2234b, bVar.f2236d, bVar.f2235c);
            } else if (i2 == 8) {
                this.f2228d.mo2391a(bVar);
                this.f2228d.mo2389a(bVar.f2234b, bVar.f2236d);
            }
            Runnable runnable = this.f2229e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m2751a(this.f2226b);
        this.f2232h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m2754c() {
        return this.f2226b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m2755c(int i) {
        return (i & this.f2232h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m2756d() {
        return (this.f2227c.isEmpty() || this.f2226b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2757e() {
        this.f2231g.m2843a(this.f2226b);
        int size = this.f2226b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2226b.get(i);
            int i2 = bVar.f2233a;
            if (i2 == 1) {
                m2738b(bVar);
            } else if (i2 == 2) {
                m2740d(bVar);
            } else if (i2 == 4) {
                m2742e(bVar);
            } else if (i2 == 8) {
                m2739c(bVar);
            }
            Runnable runnable = this.f2229e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2226b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2758f() {
        m2751a(this.f2226b);
        m2751a(this.f2227c);
        this.f2232h = 0;
    }
}
