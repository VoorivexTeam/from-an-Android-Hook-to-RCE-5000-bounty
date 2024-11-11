package p000;

import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import com.bumptech.glide.load.InterfaceC0573g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* renamed from: rd */
/* loaded from: classes.dex */
class C3162rd<Model, Data> implements InterfaceC3031od<Model, Data> {

    /* renamed from: a */
    private final List<InterfaceC3031od<Model, Data>> f12949a;

    /* renamed from: b */
    private final InterfaceC3283u1<List<Throwable>> f12950b;

    /* renamed from: rd$a */
    /* loaded from: classes.dex */
    static class a<Data> implements InterfaceC2853ka<Data>, InterfaceC2853ka.a<Data> {

        /* renamed from: b */
        private final List<InterfaceC2853ka<Data>> f12951b;

        /* renamed from: c */
        private final InterfaceC3283u1<List<Throwable>> f12952c;

        /* renamed from: d */
        private int f12953d;

        /* renamed from: e */
        private EnumC0562g f12954e;

        /* renamed from: f */
        private InterfaceC2853ka.a<? super Data> f12955f;

        /* renamed from: g */
        private List<Throwable> f12956g;

        /* renamed from: h */
        private boolean f12957h;

        a(List<InterfaceC2853ka<Data>> list, InterfaceC3283u1<List<Throwable>> interfaceC3283u1) {
            this.f12952c = interfaceC3283u1;
            C2816ji.m13462a(list);
            this.f12951b = list;
            this.f12953d = 0;
        }

        /* renamed from: d */
        private void m15259d() {
            if (this.f12957h) {
                return;
            }
            if (this.f12953d < this.f12951b.size() - 1) {
                this.f12953d++;
                mo3664a(this.f12954e, this.f12955f);
            } else {
                C2816ji.m13459a(this.f12956g);
                this.f12955f.mo3638a((Exception) new C3121qb("Fetch failed", new ArrayList(this.f12956g)));
            }
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public Class<Data> mo3663a() {
            return this.f12951b.get(0).mo3663a();
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super Data> aVar) {
            this.f12954e = enumC0562g;
            this.f12955f = aVar;
            this.f12956g = this.f12952c.mo13874a();
            this.f12951b.get(this.f12953d).mo3664a(enumC0562g, this);
            if (this.f12957h) {
                cancel();
            }
        }

        @Override // p000.InterfaceC2853ka.a
        /* renamed from: a */
        public void mo3638a(Exception exc) {
            List<Throwable> list = this.f12956g;
            C2816ji.m13459a(list);
            list.add(exc);
            m15259d();
        }

        @Override // p000.InterfaceC2853ka.a
        /* renamed from: a */
        public void mo3639a(Data data) {
            if (data != null) {
                this.f12955f.mo3639a((InterfaceC2853ka.a<? super Data>) data);
            } else {
                m15259d();
            }
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: b */
        public void mo3665b() {
            List<Throwable> list = this.f12956g;
            if (list != null) {
                this.f12952c.mo13875a(list);
            }
            this.f12956g = null;
            Iterator<InterfaceC2853ka<Data>> it = this.f12951b.iterator();
            while (it.hasNext()) {
                it.next().mo3665b();
            }
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: c */
        public EnumC0567a mo3666c() {
            return this.f12951b.get(0).mo3666c();
        }

        @Override // p000.InterfaceC2853ka
        public void cancel() {
            this.f12957h = true;
            Iterator<InterfaceC2853ka<Data>> it = this.f12951b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3162rd(List<InterfaceC3031od<Model, Data>> list, InterfaceC3283u1<List<Throwable>> interfaceC3283u1) {
        this.f12949a = list;
        this.f12950b = interfaceC3283u1;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a */
    public InterfaceC3031od.a<Data> mo137a(Model model, int i, int i2, C0575i c0575i) {
        InterfaceC3031od.a<Data> mo137a;
        int size = this.f12949a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC0573g interfaceC0573g = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC3031od<Model, Data> interfaceC3031od = this.f12949a.get(i3);
            if (interfaceC3031od.mo138a(model) && (mo137a = interfaceC3031od.mo137a(model, i, i2, c0575i)) != null) {
                interfaceC0573g = mo137a.f12454a;
                arrayList.add(mo137a.f12456c);
            }
        }
        if (arrayList.isEmpty() || interfaceC0573g == null) {
            return null;
        }
        return new InterfaceC3031od.a<>(interfaceC0573g, new a(arrayList, this.f12950b));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a */
    public boolean mo138a(Model model) {
        Iterator<InterfaceC3031od<Model, Data>> it = this.f12949a.iterator();
        while (it.hasNext()) {
            if (it.next().mo138a(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f12949a.toArray()) + '}';
    }
}
