package p000;

import java.io.Closeable;
import javax.annotation.Nullable;
import p000.y70;

/* loaded from: classes.dex */
public final class i80 implements Closeable {

    /* renamed from: b */
    final g80 f10577b;

    /* renamed from: c */
    final e80 f10578c;

    /* renamed from: d */
    final int f10579d;

    /* renamed from: e */
    final String f10580e;

    /* renamed from: f */
    @Nullable
    final x70 f10581f;

    /* renamed from: g */
    final y70 f10582g;

    /* renamed from: h */
    @Nullable
    final j80 f10583h;

    /* renamed from: i */
    @Nullable
    final i80 f10584i;

    /* renamed from: j */
    @Nullable
    final i80 f10585j;

    /* renamed from: k */
    @Nullable
    final i80 f10586k;

    /* renamed from: l */
    final long f10587l;

    /* renamed from: m */
    final long f10588m;

    /* renamed from: n */
    @Nullable
    private volatile j70 f10589n;

    /* renamed from: i80$a */
    /* loaded from: classes.dex */
    public static class C2583a {

        /* renamed from: a */
        @Nullable
        g80 f10590a;

        /* renamed from: b */
        @Nullable
        e80 f10591b;

        /* renamed from: c */
        int f10592c;

        /* renamed from: d */
        String f10593d;

        /* renamed from: e */
        @Nullable
        x70 f10594e;

        /* renamed from: f */
        y70.C3476a f10595f;

        /* renamed from: g */
        @Nullable
        j80 f10596g;

        /* renamed from: h */
        @Nullable
        i80 f10597h;

        /* renamed from: i */
        @Nullable
        i80 f10598i;

        /* renamed from: j */
        @Nullable
        i80 f10599j;

        /* renamed from: k */
        long f10600k;

        /* renamed from: l */
        long f10601l;

        public C2583a() {
            this.f10592c = -1;
            this.f10595f = new y70.C3476a();
        }

        C2583a(i80 i80Var) {
            this.f10592c = -1;
            this.f10590a = i80Var.f10577b;
            this.f10591b = i80Var.f10578c;
            this.f10592c = i80Var.f10579d;
            this.f10593d = i80Var.f10580e;
            this.f10594e = i80Var.f10581f;
            this.f10595f = i80Var.f10582g.m16594a();
            this.f10596g = i80Var.f10583h;
            this.f10597h = i80Var.f10584i;
            this.f10598i = i80Var.f10585j;
            this.f10599j = i80Var.f10586k;
            this.f10600k = i80Var.f10587l;
            this.f10601l = i80Var.f10588m;
        }

        /* renamed from: a */
        private void m12399a(String str, i80 i80Var) {
            if (i80Var.f10583h != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (i80Var.f10584i != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (i80Var.f10585j != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (i80Var.f10586k == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        /* renamed from: d */
        private void m12400d(i80 i80Var) {
            if (i80Var.f10583h != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public C2583a m12401a(int i) {
            this.f10592c = i;
            return this;
        }

        /* renamed from: a */
        public C2583a m12402a(long j) {
            this.f10601l = j;
            return this;
        }

        /* renamed from: a */
        public C2583a m12403a(e80 e80Var) {
            this.f10591b = e80Var;
            return this;
        }

        /* renamed from: a */
        public C2583a m12404a(g80 g80Var) {
            this.f10590a = g80Var;
            return this;
        }

        /* renamed from: a */
        public C2583a m12405a(@Nullable i80 i80Var) {
            if (i80Var != null) {
                m12399a("cacheResponse", i80Var);
            }
            this.f10598i = i80Var;
            return this;
        }

        /* renamed from: a */
        public C2583a m12406a(@Nullable j80 j80Var) {
            this.f10596g = j80Var;
            return this;
        }

        /* renamed from: a */
        public C2583a m12407a(String str) {
            this.f10593d = str;
            return this;
        }

        /* renamed from: a */
        public C2583a m12408a(String str, String str2) {
            this.f10595f.m16599a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C2583a m12409a(@Nullable x70 x70Var) {
            this.f10594e = x70Var;
            return this;
        }

        /* renamed from: a */
        public C2583a m12410a(y70 y70Var) {
            this.f10595f = y70Var.m16594a();
            return this;
        }

        /* renamed from: a */
        public i80 m12411a() {
            if (this.f10590a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f10591b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f10592c >= 0) {
                if (this.f10593d != null) {
                    return new i80(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f10592c);
        }

        /* renamed from: b */
        public C2583a m12412b(long j) {
            this.f10600k = j;
            return this;
        }

        /* renamed from: b */
        public C2583a m12413b(@Nullable i80 i80Var) {
            if (i80Var != null) {
                m12399a("networkResponse", i80Var);
            }
            this.f10597h = i80Var;
            return this;
        }

        /* renamed from: b */
        public C2583a m12414b(String str, String str2) {
            this.f10595f.m16603c(str, str2);
            return this;
        }

        /* renamed from: c */
        public C2583a m12415c(@Nullable i80 i80Var) {
            if (i80Var != null) {
                m12400d(i80Var);
            }
            this.f10599j = i80Var;
            return this;
        }
    }

    i80(C2583a c2583a) {
        this.f10577b = c2583a.f10590a;
        this.f10578c = c2583a.f10591b;
        this.f10579d = c2583a.f10592c;
        this.f10580e = c2583a.f10593d;
        this.f10581f = c2583a.f10594e;
        this.f10582g = c2583a.f10595f.m16600a();
        this.f10583h = c2583a.f10596g;
        this.f10584i = c2583a.f10597h;
        this.f10585j = c2583a.f10598i;
        this.f10586k = c2583a.f10599j;
        this.f10587l = c2583a.f10600k;
        this.f10588m = c2583a.f10601l;
    }

    @Nullable
    /* renamed from: a */
    public j80 m12385a() {
        return this.f10583h;
    }

    @Nullable
    /* renamed from: a */
    public String m12386a(String str) {
        return m12387a(str, null);
    }

    @Nullable
    /* renamed from: a */
    public String m12387a(String str, @Nullable String str2) {
        String m16593a = this.f10582g.m16593a(str);
        return m16593a != null ? m16593a : str2;
    }

    /* renamed from: c */
    public j70 m12388c() {
        j70 j70Var = this.f10589n;
        if (j70Var != null) {
            return j70Var;
        }
        j70 m13407a = j70.m13407a(this.f10582g);
        this.f10589n = m13407a;
        return m13407a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j80 j80Var = this.f10583h;
        if (j80Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        j80Var.close();
    }

    /* renamed from: d */
    public int m12389d() {
        return this.f10579d;
    }

    @Nullable
    /* renamed from: e */
    public x70 m12390e() {
        return this.f10581f;
    }

    /* renamed from: f */
    public y70 m12391f() {
        return this.f10582g;
    }

    /* renamed from: h */
    public boolean m12392h() {
        int i = this.f10579d;
        return i >= 200 && i < 300;
    }

    /* renamed from: i */
    public String m12393i() {
        return this.f10580e;
    }

    /* renamed from: j */
    public C2583a m12394j() {
        return new C2583a(this);
    }

    @Nullable
    /* renamed from: k */
    public i80 m12395k() {
        return this.f10586k;
    }

    /* renamed from: l */
    public long m12396l() {
        return this.f10588m;
    }

    /* renamed from: m */
    public g80 m12397m() {
        return this.f10577b;
    }

    /* renamed from: n */
    public long m12398n() {
        return this.f10587l;
    }

    public String toString() {
        return "Response{protocol=" + this.f10578c + ", code=" + this.f10579d + ", message=" + this.f10580e + ", url=" + this.f10577b.m11925g() + '}';
    }
}
