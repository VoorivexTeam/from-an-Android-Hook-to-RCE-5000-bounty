package defpackage;

import defpackage.y70;
import java.io.Closeable;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class i80 implements Closeable {
    final g80 b;
    final e80 c;
    final int d;
    final String e;

    @Nullable
    final x70 f;
    final y70 g;

    @Nullable
    final j80 h;

    @Nullable
    final i80 i;

    @Nullable
    final i80 j;

    @Nullable
    final i80 k;
    final long l;
    final long m;

    @Nullable
    private volatile j70 n;

    /* loaded from: classes.dex */
    public static class a {

        @Nullable
        g80 a;

        @Nullable
        e80 b;
        int c;
        String d;

        @Nullable
        x70 e;
        y70.a f;

        @Nullable
        j80 g;

        @Nullable
        i80 h;

        @Nullable
        i80 i;

        @Nullable
        i80 j;
        long k;
        long l;

        public a() {
            this.c = -1;
            this.f = new y70.a();
        }

        a(i80 i80Var) {
            this.c = -1;
            this.a = i80Var.b;
            this.b = i80Var.c;
            this.c = i80Var.d;
            this.d = i80Var.e;
            this.e = i80Var.f;
            this.f = i80Var.g.a();
            this.g = i80Var.h;
            this.h = i80Var.i;
            this.i = i80Var.j;
            this.j = i80Var.k;
            this.k = i80Var.l;
            this.l = i80Var.m;
        }

        private void a(String str, i80 i80Var) {
            if (i80Var.h != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (i80Var.i != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (i80Var.j != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (i80Var.k == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        private void d(i80 i80Var) {
            if (i80Var.h != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(int i) {
            this.c = i;
            return this;
        }

        public a a(long j) {
            this.l = j;
            return this;
        }

        public a a(e80 e80Var) {
            this.b = e80Var;
            return this;
        }

        public a a(g80 g80Var) {
            this.a = g80Var;
            return this;
        }

        public a a(@Nullable i80 i80Var) {
            if (i80Var != null) {
                a("cacheResponse", i80Var);
            }
            this.i = i80Var;
            return this;
        }

        public a a(@Nullable j80 j80Var) {
            this.g = j80Var;
            return this;
        }

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public a a(@Nullable x70 x70Var) {
            this.e = x70Var;
            return this;
        }

        public a a(y70 y70Var) {
            this.f = y70Var.a();
            return this;
        }

        public i80 a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.c >= 0) {
                if (this.d != null) {
                    return new i80(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.c);
        }

        public a b(long j) {
            this.k = j;
            return this;
        }

        public a b(@Nullable i80 i80Var) {
            if (i80Var != null) {
                a("networkResponse", i80Var);
            }
            this.h = i80Var;
            return this;
        }

        public a b(String str, String str2) {
            this.f.c(str, str2);
            return this;
        }

        public a c(@Nullable i80 i80Var) {
            if (i80Var != null) {
                d(i80Var);
            }
            this.j = i80Var;
            return this;
        }
    }

    i80(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f.a();
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
    }

    @Nullable
    public j80 a() {
        return this.h;
    }

    @Nullable
    public String a(String str) {
        return a(str, null);
    }

    @Nullable
    public String a(String str, @Nullable String str2) {
        String a2 = this.g.a(str);
        return a2 != null ? a2 : str2;
    }

    public j70 c() {
        j70 j70Var = this.n;
        if (j70Var != null) {
            return j70Var;
        }
        j70 a2 = j70.a(this.g);
        this.n = a2;
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j80 j80Var = this.h;
        if (j80Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        j80Var.close();
    }

    public int d() {
        return this.d;
    }

    @Nullable
    public x70 e() {
        return this.f;
    }

    public y70 f() {
        return this.g;
    }

    public boolean h() {
        int i = this.d;
        return i >= 200 && i < 300;
    }

    public String i() {
        return this.e;
    }

    public a j() {
        return new a(this);
    }

    @Nullable
    public i80 k() {
        return this.k;
    }

    public long l() {
        return this.m;
    }

    public g80 m() {
        return this.b;
    }

    public long n() {
        return this.l;
    }

    public String toString() {
        return "Response{protocol=" + this.c + ", code=" + this.d + ", message=" + this.e + ", url=" + this.b.g() + '}';
    }
}
