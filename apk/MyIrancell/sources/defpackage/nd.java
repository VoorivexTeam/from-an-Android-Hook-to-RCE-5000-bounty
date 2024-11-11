package defpackage;

import java.util.Queue;

/* loaded from: classes.dex */
public class nd<A, B> {
    private final gi<b<A>, B> a;

    /* loaded from: classes.dex */
    class a extends gi<b<A>, B> {
        a(nd ndVar, long j) {
            super(j);
        }

        @Override // defpackage.gi
        protected /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            a((b) obj, (b<A>) obj2);
        }

        protected void a(b<A> bVar, B b) {
            bVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b<A> {
        private static final Queue<b<?>> d = ki.a(0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        static <A> b<A> a(A a, int i, int i2) {
            b<A> bVar;
            synchronized (d) {
                bVar = (b) d.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a, i, i2);
            return bVar;
        }

        private void b(A a, int i, int i2) {
            this.c = a;
            this.b = i;
            this.a = i2;
        }

        public void a() {
            synchronized (d) {
                d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c);
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public nd(long j) {
        this.a = new a(this, j);
    }

    public B a(A a2, int i, int i2) {
        b<A> a3 = b.a(a2, i, i2);
        B a4 = this.a.a((gi<b<A>, B>) a3);
        a3.a();
        return a4;
    }

    public void a(A a2, int i, int i2, B b2) {
        this.a.b(b.a(a2, i, i2), b2);
    }
}
