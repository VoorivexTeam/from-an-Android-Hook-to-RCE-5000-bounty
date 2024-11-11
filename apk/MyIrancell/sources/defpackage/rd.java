package defpackage;

import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ka;
import defpackage.od;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class rd<Model, Data> implements od<Model, Data> {
    private final List<od<Model, Data>> a;
    private final u1<List<Throwable>> b;

    /* loaded from: classes.dex */
    static class a<Data> implements ka<Data>, ka.a<Data> {
        private final List<ka<Data>> b;
        private final u1<List<Throwable>> c;
        private int d;
        private g e;
        private ka.a<? super Data> f;
        private List<Throwable> g;
        private boolean h;

        a(List<ka<Data>> list, u1<List<Throwable>> u1Var) {
            this.c = u1Var;
            ji.a(list);
            this.b = list;
            this.d = 0;
        }

        private void d() {
            if (this.h) {
                return;
            }
            if (this.d < this.b.size() - 1) {
                this.d++;
                a(this.e, this.f);
            } else {
                ji.a(this.g);
                this.f.a((Exception) new qb("Fetch failed", new ArrayList(this.g)));
            }
        }

        @Override // defpackage.ka
        public Class<Data> a() {
            return this.b.get(0).a();
        }

        @Override // defpackage.ka
        public void a(g gVar, ka.a<? super Data> aVar) {
            this.e = gVar;
            this.f = aVar;
            this.g = this.c.a();
            this.b.get(this.d).a(gVar, this);
            if (this.h) {
                cancel();
            }
        }

        @Override // ka.a
        public void a(Exception exc) {
            List<Throwable> list = this.g;
            ji.a(list);
            list.add(exc);
            d();
        }

        @Override // ka.a
        public void a(Data data) {
            if (data != null) {
                this.f.a((ka.a<? super Data>) data);
            } else {
                d();
            }
        }

        @Override // defpackage.ka
        public void b() {
            List<Throwable> list = this.g;
            if (list != null) {
                this.c.a(list);
            }
            this.g = null;
            Iterator<ka<Data>> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // defpackage.ka
        public com.bumptech.glide.load.a c() {
            return this.b.get(0).c();
        }

        @Override // defpackage.ka
        public void cancel() {
            this.h = true;
            Iterator<ka<Data>> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rd(List<od<Model, Data>> list, u1<List<Throwable>> u1Var) {
        this.a = list;
        this.b = u1Var;
    }

    @Override // defpackage.od
    public od.a<Data> a(Model model, int i, int i2, i iVar) {
        od.a<Data> a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            od<Model, Data> odVar = this.a.get(i3);
            if (odVar.a(model) && (a2 = odVar.a(model, i, i2, iVar)) != null) {
                gVar = a2.a;
                arrayList.add(a2.c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new od.a<>(gVar, new a(arrayList, this.b));
    }

    @Override // defpackage.od
    public boolean a(Model model) {
        Iterator<od<Model, Data>> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
