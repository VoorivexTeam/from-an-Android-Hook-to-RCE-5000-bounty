package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h5<K, A> {
    private final d<K> c;
    protected x9<A> e;
    final List<b> a = new ArrayList(1);
    private boolean b = false;
    private float d = 0.0f;
    private A f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    /* loaded from: classes.dex */
    public interface b {
        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // h5.d
        public float a() {
            return 1.0f;
        }

        @Override // h5.d
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // h5.d
        public float b() {
            return 0.0f;
        }

        @Override // h5.d
        public boolean b(float f) {
            return false;
        }

        @Override // h5.d
        public v9<T> c() {
            throw new IllegalStateException("not implemented");
        }

        @Override // h5.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d<T> {
        float a();

        boolean a(float f);

        float b();

        boolean b(float f);

        v9<T> c();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {
        private final List<? extends v9<T>> a;
        private v9<T> c = null;
        private float d = -1.0f;
        private v9<T> b = c(0.0f);

        e(List<? extends v9<T>> list) {
            this.a = list;
        }

        private v9<T> c(float f) {
            List<? extends v9<T>> list = this.a;
            v9<T> v9Var = list.get(list.size() - 1);
            if (f >= v9Var.d()) {
                return v9Var;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                v9<T> v9Var2 = this.a.get(size);
                if (this.b != v9Var2 && v9Var2.a(f)) {
                    return v9Var2;
                }
            }
            return this.a.get(0);
        }

        @Override // h5.d
        public float a() {
            return this.a.get(r0.size() - 1).a();
        }

        @Override // h5.d
        public boolean a(float f) {
            if (this.c == this.b && this.d == f) {
                return true;
            }
            this.c = this.b;
            this.d = f;
            return false;
        }

        @Override // h5.d
        public float b() {
            return this.a.get(0).d();
        }

        @Override // h5.d
        public boolean b(float f) {
            if (this.b.a(f)) {
                return !this.b.g();
            }
            this.b = c(f);
            return true;
        }

        @Override // h5.d
        public v9<T> c() {
            return this.b;
        }

        @Override // h5.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {
        private final v9<T> a;
        private float b = -1.0f;

        f(List<? extends v9<T>> list) {
            this.a = list.get(0);
        }

        @Override // h5.d
        public float a() {
            return this.a.a();
        }

        @Override // h5.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // h5.d
        public float b() {
            return this.a.d();
        }

        @Override // h5.d
        public boolean b(float f) {
            return !this.a.g();
        }

        @Override // h5.d
        public v9<T> c() {
            return this.a;
        }

        @Override // h5.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h5(List<? extends v9<K>> list) {
        this.c = a(list);
    }

    private static <T> d<T> a(List<? extends v9<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    private float i() {
        if (this.g == -1.0f) {
            this.g = this.c.b();
        }
        return this.g;
    }

    abstract A a(v9<K> v9Var, float f2);

    /* JADX INFO: Access modifiers changed from: protected */
    public v9<K> a() {
        com.airbnb.lottie.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        v9<K> c2 = this.c.c();
        com.airbnb.lottie.c.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return c2;
    }

    public void a(float f2) {
        if (this.c.isEmpty()) {
            return;
        }
        if (f2 < i()) {
            f2 = i();
        } else if (f2 > b()) {
            f2 = b();
        }
        if (f2 == this.d) {
            return;
        }
        this.d = f2;
        if (this.c.b(f2)) {
            g();
        }
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public void a(x9<A> x9Var) {
        x9<A> x9Var2 = this.e;
        if (x9Var2 != null) {
            x9Var2.a((h5<?, ?>) null);
        }
        this.e = x9Var;
        if (x9Var != null) {
            x9Var.a((h5<?, ?>) this);
        }
    }

    float b() {
        if (this.h == -1.0f) {
            this.h = this.c.a();
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float c() {
        v9<K> a2 = a();
        if (a2.g()) {
            return 0.0f;
        }
        return a2.d.getInterpolation(d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        if (this.b) {
            return 0.0f;
        }
        v9<K> a2 = a();
        if (a2.g()) {
            return 0.0f;
        }
        return (this.d - a2.d()) / (a2.a() - a2.d());
    }

    public float e() {
        return this.d;
    }

    public A f() {
        float c2 = c();
        if (this.e == null && this.c.a(c2)) {
            return this.f;
        }
        A a2 = a(a(), c2);
        this.f = a2;
        return a2;
    }

    public void g() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).b();
        }
    }

    public void h() {
        this.b = true;
    }
}
