package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: li */
/* loaded from: classes.dex */
public final class C2898li {

    /* renamed from: a */
    private static final g<Object> f11877a = new a();

    /* renamed from: li$a */
    /* loaded from: classes.dex */
    class a implements g<Object> {
        a() {
        }

        @Override // p000.C2898li.g
        /* renamed from: a */
        public void mo13872a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: li$b */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // p000.C2898li.d
        /* renamed from: a */
        public List<T> mo13672a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: li$c */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // p000.C2898li.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13872a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: li$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        /* renamed from: a */
        T mo13672a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: li$e */
    /* loaded from: classes.dex */
    public static final class e<T> implements InterfaceC3283u1<T> {

        /* renamed from: a */
        private final d<T> f11878a;

        /* renamed from: b */
        private final g<T> f11879b;

        /* renamed from: c */
        private final InterfaceC3283u1<T> f11880c;

        e(InterfaceC3283u1<T> interfaceC3283u1, d<T> dVar, g<T> gVar) {
            this.f11880c = interfaceC3283u1;
            this.f11878a = dVar;
            this.f11879b = gVar;
        }

        @Override // p000.InterfaceC3283u1
        /* renamed from: a */
        public T mo13874a() {
            T mo13874a = this.f11880c.mo13874a();
            if (mo13874a == null) {
                mo13874a = this.f11878a.mo13672a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    String str = "Created new " + mo13874a.getClass();
                }
            }
            if (mo13874a instanceof f) {
                mo13874a.mo12179e().mo14336a(false);
            }
            return (T) mo13874a;
        }

        @Override // p000.InterfaceC3283u1
        /* renamed from: a */
        public boolean mo13875a(T t) {
            if (t instanceof f) {
                ((f) t).mo12179e().mo14336a(true);
            }
            this.f11879b.mo13872a(t);
            return this.f11880c.mo13875a(t);
        }
    }

    /* renamed from: li$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: e */
        AbstractC2990ni mo12179e();
    }

    /* renamed from: li$g */
    /* loaded from: classes.dex */
    public interface g<T> {
        /* renamed from: a */
        void mo13872a(T t);
    }

    /* renamed from: a */
    private static <T> g<T> m13866a() {
        return (g<T>) f11877a;
    }

    /* renamed from: a */
    public static <T> InterfaceC3283u1<List<T>> m13867a(int i) {
        return m13870a(new C3380w1(i), new b(), new c());
    }

    /* renamed from: a */
    public static <T extends f> InterfaceC3283u1<T> m13868a(int i, d<T> dVar) {
        return m13869a(new C3380w1(i), dVar);
    }

    /* renamed from: a */
    private static <T extends f> InterfaceC3283u1<T> m13869a(InterfaceC3283u1<T> interfaceC3283u1, d<T> dVar) {
        return m13870a(interfaceC3283u1, dVar, m13866a());
    }

    /* renamed from: a */
    private static <T> InterfaceC3283u1<T> m13870a(InterfaceC3283u1<T> interfaceC3283u1, d<T> dVar, g<T> gVar) {
        return new e(interfaceC3283u1, dVar, gVar);
    }

    /* renamed from: b */
    public static <T> InterfaceC3283u1<List<T>> m13871b() {
        return m13867a(20);
    }
}
