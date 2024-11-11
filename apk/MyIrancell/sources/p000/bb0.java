package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import p000.c80;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class bb0<T> {

    /* renamed from: bb0$a */
    /* loaded from: classes.dex */
    class C0460a extends bb0<Iterable<T>> {
        C0460a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000.bb0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3368a(db0 db0Var, @Nullable Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                bb0.this.mo3368a(db0Var, it.next());
            }
        }
    }

    /* renamed from: bb0$b */
    /* loaded from: classes.dex */
    class C0461b extends bb0<Object> {
        C0461b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                bb0.this.mo3368a(db0Var, Array.get(obj, i));
            }
        }
    }

    /* renamed from: bb0$c */
    /* loaded from: classes.dex */
    static final class C0462c<T> extends bb0<T> {

        /* renamed from: a */
        private final ta0<T, h80> f2767a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0462c(ta0<T, h80> ta0Var) {
            this.f2767a = ta0Var;
        }

        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable T t) {
            if (t == null) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
            try {
                db0Var.m11352a(this.f2767a.mo133a(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* renamed from: bb0$d */
    /* loaded from: classes.dex */
    static final class C0463d<T> extends bb0<T> {

        /* renamed from: a */
        private final String f2768a;

        /* renamed from: b */
        private final ta0<T, String> f2769b;

        /* renamed from: c */
        private final boolean f2770c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0463d(String str, ta0<T, String> ta0Var, boolean z) {
            ib0.m12428a(str, "name == null");
            this.f2768a = str;
            this.f2769b = ta0Var;
            this.f2770c = z;
        }

        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable T t) {
            String mo133a;
            if (t == null || (mo133a = this.f2769b.mo133a(t)) == null) {
                return;
            }
            db0Var.m11355a(this.f2768a, mo133a, this.f2770c);
        }
    }

    /* renamed from: bb0$e */
    /* loaded from: classes.dex */
    static final class C0464e<T> extends bb0<Map<String, T>> {

        /* renamed from: a */
        private final ta0<T, String> f2771a;

        /* renamed from: b */
        private final boolean f2772b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0464e(ta0<T, String> ta0Var, boolean z) {
            this.f2771a = ta0Var;
            this.f2772b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000.bb0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3368a(db0 db0Var, @Nullable Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Field map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Field map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                }
                String mo133a = this.f2771a.mo133a(value);
                if (mo133a == null) {
                    throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.f2771a.getClass().getName() + " for key '" + key + "'.");
                }
                db0Var.m11355a(key, mo133a, this.f2772b);
            }
        }
    }

    /* renamed from: bb0$f */
    /* loaded from: classes.dex */
    static final class C0465f<T> extends bb0<T> {

        /* renamed from: a */
        private final String f2773a;

        /* renamed from: b */
        private final ta0<T, String> f2774b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0465f(String str, ta0<T, String> ta0Var) {
            ib0.m12428a(str, "name == null");
            this.f2773a = str;
            this.f2774b = ta0Var;
        }

        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable T t) {
            String mo133a;
            if (t == null || (mo133a = this.f2774b.mo133a(t)) == null) {
                return;
            }
            db0Var.m11354a(this.f2773a, mo133a);
        }
    }

    /* renamed from: bb0$g */
    /* loaded from: classes.dex */
    static final class C0466g<T> extends bb0<Map<String, T>> {

        /* renamed from: a */
        private final ta0<T, String> f2775a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0466g(ta0<T, String> ta0Var) {
            this.f2775a = ta0Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000.bb0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3368a(db0 db0Var, @Nullable Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Header map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Header map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Header map contained null value for key '" + key + "'.");
                }
                db0Var.m11354a(key, this.f2775a.mo133a(value));
            }
        }
    }

    /* renamed from: bb0$h */
    /* loaded from: classes.dex */
    static final class C0467h<T> extends bb0<T> {

        /* renamed from: a */
        private final y70 f2776a;

        /* renamed from: b */
        private final ta0<T, h80> f2777b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0467h(y70 y70Var, ta0<T, h80> ta0Var) {
            this.f2776a = y70Var;
            this.f2777b = ta0Var;
        }

        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                db0Var.m11356a(this.f2776a, this.f2777b.mo133a(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* renamed from: bb0$i */
    /* loaded from: classes.dex */
    static final class C0468i<T> extends bb0<Map<String, T>> {

        /* renamed from: a */
        private final ta0<T, h80> f2778a;

        /* renamed from: b */
        private final String f2779b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0468i(ta0<T, h80> ta0Var, String str) {
            this.f2778a = ta0Var;
            this.f2779b = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000.bb0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3368a(db0 db0Var, @Nullable Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Part map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Part map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                }
                db0Var.m11356a(y70.m16589a("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f2779b), this.f2778a.mo133a(value));
            }
        }
    }

    /* renamed from: bb0$j */
    /* loaded from: classes.dex */
    static final class C0469j<T> extends bb0<T> {

        /* renamed from: a */
        private final String f2780a;

        /* renamed from: b */
        private final ta0<T, String> f2781b;

        /* renamed from: c */
        private final boolean f2782c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0469j(String str, ta0<T, String> ta0Var, boolean z) {
            ib0.m12428a(str, "name == null");
            this.f2780a = str;
            this.f2781b = ta0Var;
            this.f2782c = z;
        }

        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable T t) {
            if (t != null) {
                db0Var.m11357b(this.f2780a, this.f2781b.mo133a(t), this.f2782c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f2780a + "\" value must not be null.");
        }
    }

    /* renamed from: bb0$k */
    /* loaded from: classes.dex */
    static final class C0470k<T> extends bb0<T> {

        /* renamed from: a */
        private final String f2783a;

        /* renamed from: b */
        private final ta0<T, String> f2784b;

        /* renamed from: c */
        private final boolean f2785c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0470k(String str, ta0<T, String> ta0Var, boolean z) {
            ib0.m12428a(str, "name == null");
            this.f2783a = str;
            this.f2784b = ta0Var;
            this.f2785c = z;
        }

        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable T t) {
            String mo133a;
            if (t == null || (mo133a = this.f2784b.mo133a(t)) == null) {
                return;
            }
            db0Var.m11358c(this.f2783a, mo133a, this.f2785c);
        }
    }

    /* renamed from: bb0$l */
    /* loaded from: classes.dex */
    static final class C0471l<T> extends bb0<Map<String, T>> {

        /* renamed from: a */
        private final ta0<T, String> f2786a;

        /* renamed from: b */
        private final boolean f2787b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0471l(ta0<T, String> ta0Var, boolean z) {
            this.f2786a = ta0Var;
            this.f2787b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000.bb0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3368a(db0 db0Var, @Nullable Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Query map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Query map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Query map contained null value for key '" + key + "'.");
                }
                String mo133a = this.f2786a.mo133a(value);
                if (mo133a == null) {
                    throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.f2786a.getClass().getName() + " for key '" + key + "'.");
                }
                db0Var.m11358c(key, mo133a, this.f2787b);
            }
        }
    }

    /* renamed from: bb0$m */
    /* loaded from: classes.dex */
    static final class C0472m<T> extends bb0<T> {

        /* renamed from: a */
        private final ta0<T, String> f2788a;

        /* renamed from: b */
        private final boolean f2789b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0472m(ta0<T, String> ta0Var, boolean z) {
            this.f2788a = ta0Var;
            this.f2789b = z;
        }

        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable T t) {
            if (t == null) {
                return;
            }
            db0Var.m11358c(this.f2788a.mo133a(t), null, this.f2789b);
        }
    }

    /* renamed from: bb0$n */
    /* loaded from: classes.dex */
    static final class C0473n extends bb0<c80.C0510b> {

        /* renamed from: a */
        static final C0473n f2790a = new C0473n();

        private C0473n() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000.bb0
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo3368a(db0 db0Var, @Nullable c80.C0510b c0510b) {
            if (c0510b != null) {
                db0Var.m11351a(c0510b);
            }
        }
    }

    /* renamed from: bb0$o */
    /* loaded from: classes.dex */
    static final class C0474o extends bb0<Object> {
        @Override // p000.bb0
        /* renamed from: a */
        void mo3368a(db0 db0Var, @Nullable Object obj) {
            ib0.m12428a(obj, "@Url parameter is null.");
            db0Var.m11353a(obj);
        }
    }

    bb0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final bb0<Object> m3367a() {
        return new C0461b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo3368a(db0 db0Var, @Nullable T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final bb0<Iterable<T>> m3369b() {
        return new C0460a();
    }
}
