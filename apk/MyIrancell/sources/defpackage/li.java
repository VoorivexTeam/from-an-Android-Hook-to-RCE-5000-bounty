package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class li {
    private static final g<Object> a = new a();

    /* loaded from: classes.dex */
    class a implements g<Object> {
        a() {
        }

        @Override // li.g
        public void a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // li.d
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // li.g
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e<T> implements u1<T> {
        private final d<T> a;
        private final g<T> b;
        private final u1<T> c;

        e(u1<T> u1Var, d<T> dVar, g<T> gVar) {
            this.c = u1Var;
            this.a = dVar;
            this.b = gVar;
        }

        @Override // defpackage.u1
        public T a() {
            T a = this.c.a();
            if (a == null) {
                a = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    String str = "Created new " + a.getClass();
                }
            }
            if (a instanceof f) {
                a.e().a(false);
            }
            return (T) a;
        }

        @Override // defpackage.u1
        public boolean a(T t) {
            if (t instanceof f) {
                ((f) t).e().a(true);
            }
            this.b.a(t);
            return this.c.a(t);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        ni e();
    }

    /* loaded from: classes.dex */
    public interface g<T> {
        void a(T t);
    }

    private static <T> g<T> a() {
        return (g<T>) a;
    }

    public static <T> u1<List<T>> a(int i) {
        return a(new w1(i), new b(), new c());
    }

    public static <T extends f> u1<T> a(int i, d<T> dVar) {
        return a(new w1(i), dVar);
    }

    private static <T extends f> u1<T> a(u1<T> u1Var, d<T> dVar) {
        return a(u1Var, dVar, a());
    }

    private static <T> u1<T> a(u1<T> u1Var, d<T> dVar, g<T> gVar) {
        return new e(u1Var, dVar, gVar);
    }

    public static <T> u1<List<T>> b() {
        return a(20);
    }
}
