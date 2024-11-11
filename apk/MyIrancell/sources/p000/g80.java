package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import p000.y70;

/* loaded from: classes.dex */
public final class g80 {

    /* renamed from: a */
    final z70 f10241a;

    /* renamed from: b */
    final String f10242b;

    /* renamed from: c */
    final y70 f10243c;

    /* renamed from: d */
    @Nullable
    final h80 f10244d;

    /* renamed from: e */
    final Map<Class<?>, Object> f10245e;

    /* renamed from: f */
    @Nullable
    private volatile j70 f10246f;

    /* renamed from: g80$a */
    /* loaded from: classes.dex */
    public static class C2502a {

        /* renamed from: a */
        @Nullable
        z70 f10247a;

        /* renamed from: b */
        String f10248b;

        /* renamed from: c */
        y70.C3476a f10249c;

        /* renamed from: d */
        @Nullable
        h80 f10250d;

        /* renamed from: e */
        Map<Class<?>, Object> f10251e;

        public C2502a() {
            this.f10251e = Collections.emptyMap();
            this.f10248b = "GET";
            this.f10249c = new y70.C3476a();
        }

        C2502a(g80 g80Var) {
            this.f10251e = Collections.emptyMap();
            this.f10247a = g80Var.f10241a;
            this.f10248b = g80Var.f10242b;
            this.f10250d = g80Var.f10244d;
            this.f10251e = g80Var.f10245e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(g80Var.f10245e);
            this.f10249c = g80Var.f10243c.m16594a();
        }

        /* renamed from: a */
        public <T> C2502a m11926a(Class<? super T> cls, @Nullable T t) {
            if (cls == null) {
                throw new NullPointerException("type == null");
            }
            if (t == null) {
                this.f10251e.remove(cls);
            } else {
                if (this.f10251e.isEmpty()) {
                    this.f10251e = new LinkedHashMap();
                }
                this.f10251e.put(cls, cls.cast(t));
            }
            return this;
        }

        /* renamed from: a */
        public C2502a m11927a(String str) {
            this.f10249c.m16601b(str);
            return this;
        }

        /* renamed from: a */
        public C2502a m11928a(String str, @Nullable h80 h80Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (h80Var != null && !g90.m11936b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (h80Var != null || !g90.m11939e(str)) {
                this.f10248b = str;
                this.f10250d = h80Var;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        /* renamed from: a */
        public C2502a m11929a(String str, String str2) {
            this.f10249c.m16599a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C2502a m11930a(y70 y70Var) {
            this.f10249c = y70Var.m16594a();
            return this;
        }

        /* renamed from: a */
        public C2502a m11931a(z70 z70Var) {
            if (z70Var == null) {
                throw new NullPointerException("url == null");
            }
            this.f10247a = z70Var;
            return this;
        }

        /* renamed from: a */
        public g80 m11932a() {
            if (this.f10247a != null) {
                return new g80(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public C2502a m11933b(String str, String str2) {
            this.f10249c.m16603c(str, str2);
            return this;
        }
    }

    g80(C2502a c2502a) {
        this.f10241a = c2502a.f10247a;
        this.f10242b = c2502a.f10248b;
        this.f10243c = c2502a.f10249c.m16600a();
        this.f10244d = c2502a.f10250d;
        this.f10245e = o80.m14453a(c2502a.f10251e);
    }

    @Nullable
    /* renamed from: a */
    public h80 m11918a() {
        return this.f10244d;
    }

    @Nullable
    /* renamed from: a */
    public String m11919a(String str) {
        return this.f10243c.m16593a(str);
    }

    /* renamed from: b */
    public j70 m11920b() {
        j70 j70Var = this.f10246f;
        if (j70Var != null) {
            return j70Var;
        }
        j70 m13407a = j70.m13407a(this.f10243c);
        this.f10246f = m13407a;
        return m13407a;
    }

    /* renamed from: c */
    public y70 m11921c() {
        return this.f10243c;
    }

    /* renamed from: d */
    public boolean m11922d() {
        return this.f10241a.m16813h();
    }

    /* renamed from: e */
    public String m11923e() {
        return this.f10242b;
    }

    /* renamed from: f */
    public C2502a m11924f() {
        return new C2502a(this);
    }

    /* renamed from: g */
    public z70 m11925g() {
        return this.f10241a;
    }

    public String toString() {
        return "Request{method=" + this.f10242b + ", url=" + this.f10241a + ", tags=" + this.f10245e + '}';
    }
}
