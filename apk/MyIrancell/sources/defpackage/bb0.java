package defpackage;

import defpackage.c80;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class bb0<T> {

    /* loaded from: classes.dex */
    class a extends bb0<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bb0
        public void a(db0 db0Var, @Nullable Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                bb0.this.a(db0Var, it.next());
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends bb0<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                bb0.this.a(db0Var, Array.get(obj, i));
            }
        }
    }

    /* loaded from: classes.dex */
    static final class c<T> extends bb0<T> {
        private final ta0<T, h80> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(ta0<T, h80> ta0Var) {
            this.a = ta0Var;
        }

        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable T t) {
            if (t == null) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
            try {
                db0Var.a(this.a.a(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class d<T> extends bb0<T> {
        private final String a;
        private final ta0<T, String> b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, ta0<T, String> ta0Var, boolean z) {
            ib0.a(str, "name == null");
            this.a = str;
            this.b = ta0Var;
            this.c = z;
        }

        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable T t) {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            db0Var.a(this.a, a, this.c);
        }
    }

    /* loaded from: classes.dex */
    static final class e<T> extends bb0<Map<String, T>> {
        private final ta0<T, String> a;
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(ta0<T, String> ta0Var, boolean z) {
            this.a = ta0Var;
            this.b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bb0
        public void a(db0 db0Var, @Nullable Map<String, T> map) {
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
                String a = this.a.a(value);
                if (a == null) {
                    throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.a.getClass().getName() + " for key '" + key + "'.");
                }
                db0Var.a(key, a, this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class f<T> extends bb0<T> {
        private final String a;
        private final ta0<T, String> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(String str, ta0<T, String> ta0Var) {
            ib0.a(str, "name == null");
            this.a = str;
            this.b = ta0Var;
        }

        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable T t) {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            db0Var.a(this.a, a);
        }
    }

    /* loaded from: classes.dex */
    static final class g<T> extends bb0<Map<String, T>> {
        private final ta0<T, String> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(ta0<T, String> ta0Var) {
            this.a = ta0Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bb0
        public void a(db0 db0Var, @Nullable Map<String, T> map) {
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
                db0Var.a(key, this.a.a(value));
            }
        }
    }

    /* loaded from: classes.dex */
    static final class h<T> extends bb0<T> {
        private final y70 a;
        private final ta0<T, h80> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(y70 y70Var, ta0<T, h80> ta0Var) {
            this.a = y70Var;
            this.b = ta0Var;
        }

        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                db0Var.a(this.a, this.b.a(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class i<T> extends bb0<Map<String, T>> {
        private final ta0<T, h80> a;
        private final String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public i(ta0<T, h80> ta0Var, String str) {
            this.a = ta0Var;
            this.b = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bb0
        public void a(db0 db0Var, @Nullable Map<String, T> map) {
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
                db0Var.a(y70.a("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.b), this.a.a(value));
            }
        }
    }

    /* loaded from: classes.dex */
    static final class j<T> extends bb0<T> {
        private final String a;
        private final ta0<T, String> b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(String str, ta0<T, String> ta0Var, boolean z) {
            ib0.a(str, "name == null");
            this.a = str;
            this.b = ta0Var;
            this.c = z;
        }

        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable T t) {
            if (t != null) {
                db0Var.b(this.a, this.b.a(t), this.c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.a + "\" value must not be null.");
        }
    }

    /* loaded from: classes.dex */
    static final class k<T> extends bb0<T> {
        private final String a;
        private final ta0<T, String> b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public k(String str, ta0<T, String> ta0Var, boolean z) {
            ib0.a(str, "name == null");
            this.a = str;
            this.b = ta0Var;
            this.c = z;
        }

        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable T t) {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            db0Var.c(this.a, a, this.c);
        }
    }

    /* loaded from: classes.dex */
    static final class l<T> extends bb0<Map<String, T>> {
        private final ta0<T, String> a;
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public l(ta0<T, String> ta0Var, boolean z) {
            this.a = ta0Var;
            this.b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bb0
        public void a(db0 db0Var, @Nullable Map<String, T> map) {
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
                String a = this.a.a(value);
                if (a == null) {
                    throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.a.getClass().getName() + " for key '" + key + "'.");
                }
                db0Var.c(key, a, this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class m<T> extends bb0<T> {
        private final ta0<T, String> a;
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public m(ta0<T, String> ta0Var, boolean z) {
            this.a = ta0Var;
            this.b = z;
        }

        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable T t) {
            if (t == null) {
                return;
            }
            db0Var.c(this.a.a(t), null, this.b);
        }
    }

    /* loaded from: classes.dex */
    static final class n extends bb0<c80.b> {
        static final n a = new n();

        private n() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.bb0
        public void a(db0 db0Var, @Nullable c80.b bVar) {
            if (bVar != null) {
                db0Var.a(bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class o extends bb0<Object> {
        @Override // defpackage.bb0
        void a(db0 db0Var, @Nullable Object obj) {
            ib0.a(obj, "@Url parameter is null.");
            db0Var.a(obj);
        }
    }

    bb0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bb0<Object> a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(db0 db0Var, @Nullable T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bb0<Iterable<T>> b() {
        return new a();
    }
}
