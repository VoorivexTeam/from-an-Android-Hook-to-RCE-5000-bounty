package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.c0;
import defpackage.f0;
import defpackage.u1;
import defpackage.v1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {
    final c0<RecyclerView.c0, a> a = new c0<>();
    final f0<RecyclerView.c0> b = new f0<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static u1<a> d = new v1(20);
        int a;
        RecyclerView.l.c b;
        RecyclerView.l.c c;

        private a() {
        }

        static void a() {
            do {
            } while (d.a() != null);
        }

        static void a(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }

        static a b() {
            a a = d.a();
            return a == null ? new a() : a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.c0 c0Var);

        void a(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    private RecyclerView.l.c a(RecyclerView.c0 c0Var, int i) {
        a d;
        RecyclerView.l.c cVar;
        int a2 = this.a.a(c0Var);
        if (a2 >= 0 && (d = this.a.d(a2)) != null) {
            int i2 = d.a;
            if ((i2 & i) != 0) {
                d.a = (i ^ (-1)) & i2;
                if (i == 4) {
                    cVar = d.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = d.c;
                }
                if ((d.a & 12) == 0) {
                    this.a.c(a2);
                    a.a(d);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.c0 a(long j) {
        return this.b.c(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a.clear();
        this.b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j, RecyclerView.c0 c0Var) {
        this.b.c(j, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        RecyclerView.l.c cVar;
        RecyclerView.l.c cVar2;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.c0 b2 = this.a.b(size);
            a c = this.a.c(size);
            int i = c.a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = c.b;
                    cVar2 = cVar != null ? c.c : null;
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.c(b2, c.b, c.c);
                        } else if ((i & 4) != 0) {
                            cVar = c.b;
                        } else if ((i & 8) == 0) {
                        }
                        a.a(c);
                    }
                    bVar.a(b2, c.b, c.c);
                    a.a(c);
                }
                bVar.b(b2, cVar, cVar2);
                a.a(c);
            }
            bVar.a(b2);
            a.a(c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void d(RecyclerView.c0 c0Var) {
        g(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.l.c e(RecyclerView.c0 c0Var) {
        return a(c0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.l.c f(RecyclerView.c0 c0Var) {
        return a(c0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(RecyclerView.c0 c0Var) {
        int b2 = this.b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            }
            if (c0Var == this.b.c(b2)) {
                this.b.b(b2);
                break;
            }
            b2--;
        }
        a remove = this.a.remove(c0Var);
        if (remove != null) {
            a.a(remove);
        }
    }
}
