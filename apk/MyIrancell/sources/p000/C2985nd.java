package p000;

import java.util.Queue;

/* renamed from: nd */
/* loaded from: classes.dex */
public class C2985nd<A, B> {

    /* renamed from: a */
    private final C2514gi<b<A>, B> f12323a;

    /* renamed from: nd$a */
    /* loaded from: classes.dex */
    class a extends C2514gi<b<A>, B> {
        a(C2985nd c2985nd, long j) {
            super(j);
        }

        @Override // p000.C2514gi
        /* renamed from: a */
        protected /* bridge */ /* synthetic */ void mo12004a(Object obj, Object obj2) {
            m14319a((b) obj, (b<A>) obj2);
        }

        /* renamed from: a */
        protected void m14319a(b<A> bVar, B b) {
            bVar.m14322a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nd$b */
    /* loaded from: classes.dex */
    public static final class b<A> {

        /* renamed from: d */
        private static final Queue<b<?>> f12324d = C2861ki.m13727a(0);

        /* renamed from: a */
        private int f12325a;

        /* renamed from: b */
        private int f12326b;

        /* renamed from: c */
        private A f12327c;

        private b() {
        }

        /* renamed from: a */
        static <A> b<A> m14320a(A a, int i, int i2) {
            b<A> bVar;
            synchronized (f12324d) {
                bVar = (b) f12324d.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.m14321b(a, i, i2);
            return bVar;
        }

        /* renamed from: b */
        private void m14321b(A a, int i, int i2) {
            this.f12327c = a;
            this.f12326b = i;
            this.f12325a = i2;
        }

        /* renamed from: a */
        public void m14322a() {
            synchronized (f12324d) {
                f12324d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12326b == bVar.f12326b && this.f12325a == bVar.f12325a && this.f12327c.equals(bVar.f12327c);
        }

        public int hashCode() {
            return (((this.f12325a * 31) + this.f12326b) * 31) + this.f12327c.hashCode();
        }
    }

    public C2985nd(long j) {
        this.f12323a = new a(this, j);
    }

    /* renamed from: a */
    public B m14317a(A a2, int i, int i2) {
        b<A> m14320a = b.m14320a(a2, i, i2);
        B m12001a = this.f12323a.m12001a((C2514gi<b<A>, B>) m14320a);
        m14320a.m14322a();
        return m12001a;
    }

    /* renamed from: a */
    public void m14318a(A a2, int i, int i2, B b2) {
        this.f12323a.m12007b(b.m14320a(a2, i, i2), b2);
    }
}
