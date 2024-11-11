package defpackage;

import defpackage.y70;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class g80 {
    final z70 a;
    final String b;
    final y70 c;

    @Nullable
    final h80 d;
    final Map<Class<?>, Object> e;

    @Nullable
    private volatile j70 f;

    /* loaded from: classes.dex */
    public static class a {

        @Nullable
        z70 a;
        String b;
        y70.a c;

        @Nullable
        h80 d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = "GET";
            this.c = new y70.a();
        }

        a(g80 g80Var) {
            this.e = Collections.emptyMap();
            this.a = g80Var.a;
            this.b = g80Var.b;
            this.d = g80Var.d;
            this.e = g80Var.e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(g80Var.e);
            this.c = g80Var.c.a();
        }

        public <T> a a(Class<? super T> cls, @Nullable T t) {
            if (cls == null) {
                throw new NullPointerException("type == null");
            }
            if (t == null) {
                this.e.remove(cls);
            } else {
                if (this.e.isEmpty()) {
                    this.e = new LinkedHashMap();
                }
                this.e.put(cls, cls.cast(t));
            }
            return this;
        }

        public a a(String str) {
            this.c.b(str);
            return this;
        }

        public a a(String str, @Nullable h80 h80Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (h80Var != null && !g90.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (h80Var != null || !g90.e(str)) {
                this.b = str;
                this.d = h80Var;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        public a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public a a(y70 y70Var) {
            this.c = y70Var.a();
            return this;
        }

        public a a(z70 z70Var) {
            if (z70Var == null) {
                throw new NullPointerException("url == null");
            }
            this.a = z70Var;
            return this;
        }

        public g80 a() {
            if (this.a != null) {
                return new g80(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(String str, String str2) {
            this.c.c(str, str2);
            return this;
        }
    }

    g80(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = o80.a(aVar.e);
    }

    @Nullable
    public h80 a() {
        return this.d;
    }

    @Nullable
    public String a(String str) {
        return this.c.a(str);
    }

    public j70 b() {
        j70 j70Var = this.f;
        if (j70Var != null) {
            return j70Var;
        }
        j70 a2 = j70.a(this.c);
        this.f = a2;
        return a2;
    }

    public y70 c() {
        return this.c;
    }

    public boolean d() {
        return this.a.h();
    }

    public String e() {
        return this.b;
    }

    public a f() {
        return new a(this);
    }

    public z70 g() {
        return this.a;
    }

    public String toString() {
        return "Request{method=" + this.b + ", url=" + this.a + ", tags=" + this.e + '}';
    }
}
