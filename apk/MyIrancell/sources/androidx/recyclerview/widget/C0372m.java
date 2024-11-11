package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p000.C0500c0;
import p000.C2452f0;
import p000.C3327v1;
import p000.InterfaceC3283u1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public class C0372m {

    /* renamed from: a */
    final C0500c0<RecyclerView.AbstractC0330c0, a> f2368a = new C0500c0<>();

    /* renamed from: b */
    final C2452f0<RecyclerView.AbstractC0330c0> f2369b = new C2452f0<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.m$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        static InterfaceC3283u1<a> f2370d = new C3327v1(20);

        /* renamed from: a */
        int f2371a;

        /* renamed from: b */
        RecyclerView.AbstractC0339l.c f2372b;

        /* renamed from: c */
        RecyclerView.AbstractC0339l.c f2373c;

        private a() {
        }

        /* renamed from: a */
        static void m2910a() {
            do {
            } while (f2370d.mo13874a() != null);
        }

        /* renamed from: a */
        static void m2911a(a aVar) {
            aVar.f2371a = 0;
            aVar.f2372b = null;
            aVar.f2373c = null;
            f2370d.mo13875a(aVar);
        }

        /* renamed from: b */
        static a m2912b() {
            a mo13874a = f2370d.mo13874a();
            return mo13874a == null ? new a() : mo13874a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.m$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo2373a(RecyclerView.AbstractC0330c0 abstractC0330c0);

        /* renamed from: a */
        void mo2374a(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar, RecyclerView.AbstractC0339l.c cVar2);

        /* renamed from: b */
        void mo2375b(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar, RecyclerView.AbstractC0339l.c cVar2);

        /* renamed from: c */
        void mo2376c(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar, RecyclerView.AbstractC0339l.c cVar2);
    }

    /* renamed from: a */
    private RecyclerView.AbstractC0339l.c m2893a(RecyclerView.AbstractC0330c0 abstractC0330c0, int i) {
        a m12311d;
        RecyclerView.AbstractC0339l.c cVar;
        int m12306a = this.f2368a.m12306a(abstractC0330c0);
        if (m12306a >= 0 && (m12311d = this.f2368a.m12311d(m12306a)) != null) {
            int i2 = m12311d.f2371a;
            if ((i2 & i) != 0) {
                m12311d.f2371a = (i ^ (-1)) & i2;
                if (i == 4) {
                    cVar = m12311d.f2372b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = m12311d.f2373c;
                }
                if ((m12311d.f2371a & 12) == 0) {
                    this.f2368a.mo3398c(m12306a);
                    a.m2911a(m12311d);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public RecyclerView.AbstractC0330c0 m2894a(long j) {
        return this.f2369b.m11655c(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2895a() {
        this.f2368a.clear();
        this.f2369b.m11647a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2896a(long j, RecyclerView.AbstractC0330c0 abstractC0330c0) {
        this.f2369b.m11656c(j, abstractC0330c0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2897a(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        a aVar = this.f2368a.get(abstractC0330c0);
        if (aVar == null) {
            aVar = a.m2912b();
            this.f2368a.put(abstractC0330c0, aVar);
        }
        aVar.f2371a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2898a(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar) {
        a aVar = this.f2368a.get(abstractC0330c0);
        if (aVar == null) {
            aVar = a.m2912b();
            this.f2368a.put(abstractC0330c0, aVar);
        }
        aVar.f2371a |= 2;
        aVar.f2372b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2899a(b bVar) {
        RecyclerView.AbstractC0339l.c cVar;
        RecyclerView.AbstractC0339l.c cVar2;
        for (int size = this.f2368a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0330c0 m12310b = this.f2368a.m12310b(size);
            a mo3398c = this.f2368a.mo3398c(size);
            int i = mo3398c.f2371a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = mo3398c.f2372b;
                    cVar2 = cVar != null ? mo3398c.f2373c : null;
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.mo2376c(m12310b, mo3398c.f2372b, mo3398c.f2373c);
                        } else if ((i & 4) != 0) {
                            cVar = mo3398c.f2372b;
                        } else if ((i & 8) == 0) {
                        }
                        a.m2911a(mo3398c);
                    }
                    bVar.mo2374a(m12310b, mo3398c.f2372b, mo3398c.f2373c);
                    a.m2911a(mo3398c);
                }
                bVar.mo2375b(m12310b, cVar, cVar2);
                a.m2911a(mo3398c);
            }
            bVar.mo2373a(m12310b);
            a.m2911a(mo3398c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2900b() {
        a.m2910a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2901b(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar) {
        a aVar = this.f2368a.get(abstractC0330c0);
        if (aVar == null) {
            aVar = a.m2912b();
            this.f2368a.put(abstractC0330c0, aVar);
        }
        aVar.f2373c = cVar;
        aVar.f2371a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m2902b(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        a aVar = this.f2368a.get(abstractC0330c0);
        return (aVar == null || (aVar.f2371a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2903c(RecyclerView.AbstractC0330c0 abstractC0330c0, RecyclerView.AbstractC0339l.c cVar) {
        a aVar = this.f2368a.get(abstractC0330c0);
        if (aVar == null) {
            aVar = a.m2912b();
            this.f2368a.put(abstractC0330c0, aVar);
        }
        aVar.f2372b = cVar;
        aVar.f2371a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m2904c(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        a aVar = this.f2368a.get(abstractC0330c0);
        return (aVar == null || (aVar.f2371a & 4) == 0) ? false : true;
    }

    /* renamed from: d */
    public void m2905d(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        m2908g(abstractC0330c0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public RecyclerView.AbstractC0339l.c m2906e(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        return m2893a(abstractC0330c0, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public RecyclerView.AbstractC0339l.c m2907f(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        return m2893a(abstractC0330c0, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2908g(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        a aVar = this.f2368a.get(abstractC0330c0);
        if (aVar == null) {
            return;
        }
        aVar.f2371a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2909h(RecyclerView.AbstractC0330c0 abstractC0330c0) {
        int m11650b = this.f2369b.m11650b() - 1;
        while (true) {
            if (m11650b < 0) {
                break;
            }
            if (abstractC0330c0 == this.f2369b.m11654c(m11650b)) {
                this.f2369b.m11652b(m11650b);
                break;
            }
            m11650b--;
        }
        a remove = this.f2368a.remove(abstractC0330c0);
        if (remove != null) {
            a.m2911a(remove);
        }
    }
}
