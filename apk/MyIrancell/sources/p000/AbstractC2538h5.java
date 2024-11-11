package p000;

import com.airbnb.lottie.C0537c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h5 */
/* loaded from: classes.dex */
public abstract class AbstractC2538h5<K, A> {

    /* renamed from: c */
    private final d<K> f10383c;

    /* renamed from: e */
    protected C3429x9<A> f10385e;

    /* renamed from: a */
    final List<b> f10381a = new ArrayList(1);

    /* renamed from: b */
    private boolean f10382b = false;

    /* renamed from: d */
    private float f10384d = 0.0f;

    /* renamed from: f */
    private A f10386f = null;

    /* renamed from: g */
    private float f10387g = -1.0f;

    /* renamed from: h */
    private float f10388h = -1.0f;

    /* renamed from: h5$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: b */
        void mo3322b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h5$c */
    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: a */
        public float mo12111a() {
            return 1.0f;
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: a */
        public boolean mo12112a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: b */
        public float mo12113b() {
            return 0.0f;
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: b */
        public boolean mo12114b(float f) {
            return false;
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: c */
        public C3346v9<T> mo12115c() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p000.AbstractC2538h5.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h5$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        /* renamed from: a */
        float mo12111a();

        /* renamed from: a */
        boolean mo12112a(float f);

        /* renamed from: b */
        float mo12113b();

        /* renamed from: b */
        boolean mo12114b(float f);

        /* renamed from: c */
        C3346v9<T> mo12115c();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h5$e */
    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a */
        private final List<? extends C3346v9<T>> f10389a;

        /* renamed from: c */
        private C3346v9<T> f10391c = null;

        /* renamed from: d */
        private float f10392d = -1.0f;

        /* renamed from: b */
        private C3346v9<T> f10390b = m12116c(0.0f);

        e(List<? extends C3346v9<T>> list) {
            this.f10389a = list;
        }

        /* renamed from: c */
        private C3346v9<T> m12116c(float f) {
            List<? extends C3346v9<T>> list = this.f10389a;
            C3346v9<T> c3346v9 = list.get(list.size() - 1);
            if (f >= c3346v9.m15977d()) {
                return c3346v9;
            }
            for (int size = this.f10389a.size() - 2; size >= 1; size--) {
                C3346v9<T> c3346v92 = this.f10389a.get(size);
                if (this.f10390b != c3346v92 && c3346v92.m15974a(f)) {
                    return c3346v92;
                }
            }
            return this.f10389a.get(0);
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: a */
        public float mo12111a() {
            return this.f10389a.get(r0.size() - 1).m15973a();
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: a */
        public boolean mo12112a(float f) {
            if (this.f10391c == this.f10390b && this.f10392d == f) {
                return true;
            }
            this.f10391c = this.f10390b;
            this.f10392d = f;
            return false;
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: b */
        public float mo12113b() {
            return this.f10389a.get(0).m15977d();
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: b */
        public boolean mo12114b(float f) {
            if (this.f10390b.m15974a(f)) {
                return !this.f10390b.m15980g();
            }
            this.f10390b = m12116c(f);
            return true;
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: c */
        public C3346v9<T> mo12115c() {
            return this.f10390b;
        }

        @Override // p000.AbstractC2538h5.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h5$f */
    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a */
        private final C3346v9<T> f10393a;

        /* renamed from: b */
        private float f10394b = -1.0f;

        f(List<? extends C3346v9<T>> list) {
            this.f10393a = list.get(0);
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: a */
        public float mo12111a() {
            return this.f10393a.m15973a();
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: a */
        public boolean mo12112a(float f) {
            if (this.f10394b == f) {
                return true;
            }
            this.f10394b = f;
            return false;
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: b */
        public float mo12113b() {
            return this.f10393a.m15977d();
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: b */
        public boolean mo12114b(float f) {
            return !this.f10393a.m15980g();
        }

        @Override // p000.AbstractC2538h5.d
        /* renamed from: c */
        public C3346v9<T> mo12115c() {
            return this.f10393a;
        }

        @Override // p000.AbstractC2538h5.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2538h5(List<? extends C3346v9<K>> list) {
        this.f10383c = m12097a(list);
    }

    /* renamed from: a */
    private static <T> d<T> m12097a(List<? extends C3346v9<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    /* renamed from: i */
    private float m12098i() {
        if (this.f10387g == -1.0f) {
            this.f10387g = this.f10383c.mo12113b();
        }
        return this.f10387g;
    }

    /* renamed from: a */
    abstract A mo12099a(C3346v9<K> c3346v9, float f2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C3346v9<K> m12100a() {
        C0537c.m3721a("BaseKeyframeAnimation#getCurrentKeyframe");
        C3346v9<K> mo12115c = this.f10383c.mo12115c();
        C0537c.m3722b("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo12115c;
    }

    /* renamed from: a */
    public void mo12101a(float f2) {
        if (this.f10383c.isEmpty()) {
            return;
        }
        if (f2 < m12098i()) {
            f2 = m12098i();
        } else if (f2 > mo12104b()) {
            f2 = mo12104b();
        }
        if (f2 == this.f10384d) {
            return;
        }
        this.f10384d = f2;
        if (this.f10383c.mo12114b(f2)) {
            mo12109g();
        }
    }

    /* renamed from: a */
    public void m12102a(b bVar) {
        this.f10381a.add(bVar);
    }

    /* renamed from: a */
    public void m12103a(C3429x9<A> c3429x9) {
        C3429x9<A> c3429x92 = this.f10385e;
        if (c3429x92 != null) {
            c3429x92.m16468a((AbstractC2538h5<?, ?>) null);
        }
        this.f10385e = c3429x9;
        if (c3429x9 != null) {
            c3429x9.m16468a((AbstractC2538h5<?, ?>) this);
        }
    }

    /* renamed from: b */
    float mo12104b() {
        if (this.f10388h == -1.0f) {
            this.f10388h = this.f10383c.mo12111a();
        }
        return this.f10388h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public float m12105c() {
        C3346v9<K> m12100a = m12100a();
        if (m12100a.m15980g()) {
            return 0.0f;
        }
        return m12100a.f13633d.getInterpolation(m12106d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m12106d() {
        if (this.f10382b) {
            return 0.0f;
        }
        C3346v9<K> m12100a = m12100a();
        if (m12100a.m15980g()) {
            return 0.0f;
        }
        return (this.f10384d - m12100a.m15977d()) / (m12100a.m15973a() - m12100a.m15977d());
    }

    /* renamed from: e */
    public float m12107e() {
        return this.f10384d;
    }

    /* renamed from: f */
    public A mo12108f() {
        float m12105c = m12105c();
        if (this.f10385e == null && this.f10383c.mo12112a(m12105c)) {
            return this.f10386f;
        }
        A mo12099a = mo12099a(m12100a(), m12105c);
        this.f10386f = mo12099a;
        return mo12099a;
    }

    /* renamed from: g */
    public void mo12109g() {
        for (int i = 0; i < this.f10381a.size(); i++) {
            this.f10381a.get(i).mo3322b();
        }
    }

    /* renamed from: h */
    public void m12110h() {
        this.f10382b = true;
    }
}
