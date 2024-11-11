package defpackage;

import defpackage.g80;
import defpackage.i80;
import defpackage.y70;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class s80 {

    @Nullable
    public final g80 a;

    @Nullable
    public final i80 b;

    /* loaded from: classes.dex */
    public static class a {
        final long a;
        final g80 b;
        final i80 c;
        private Date d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l;

        public a(long j, g80 g80Var, i80 i80Var) {
            this.l = -1;
            this.a = j;
            this.b = g80Var;
            this.c = i80Var;
            if (i80Var != null) {
                this.i = i80Var.n();
                this.j = i80Var.l();
                y70 f = i80Var.f();
                int b = f.b();
                for (int i = 0; i < b; i++) {
                    String a = f.a(i);
                    String b2 = f.b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.d = e90.a(b2);
                        this.e = b2;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.h = e90.a(b2);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f = e90.a(b2);
                        this.g = b2;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.k = b2;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.l = f90.a(b2, -1);
                    }
                }
            }
        }

        private static boolean a(g80 g80Var) {
            return (g80Var.a("If-Modified-Since") == null && g80Var.a("If-None-Match") == null) ? false : true;
        }

        private long b() {
            Date date = this.d;
            long max = date != null ? Math.max(0L, this.j - date.getTime()) : 0L;
            int i = this.l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.j;
            return max + (j - this.i) + (this.a - j);
        }

        private long c() {
            if (this.c.c().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            if (this.h != null) {
                Date date = this.d;
                long time = this.h.getTime() - (date != null ? date.getTime() : this.j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f == null || this.c.m().g().l() != null) {
                return 0L;
            }
            Date date2 = this.d;
            long time2 = (date2 != null ? date2.getTime() : this.i) - this.f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private s80 d() {
            if (this.c == null) {
                return new s80(this.b, null);
            }
            if ((!this.b.d() || this.c.e() != null) && s80.a(this.c, this.b)) {
                j70 b = this.b.b();
                if (b.g() || a(this.b)) {
                    return new s80(this.b, null);
                }
                j70 c = this.c.c();
                long b2 = b();
                long c2 = c();
                if (b.c() != -1) {
                    c2 = Math.min(c2, TimeUnit.SECONDS.toMillis(b.c()));
                }
                long j = 0;
                long millis = b.e() != -1 ? TimeUnit.SECONDS.toMillis(b.e()) : 0L;
                if (!c.f() && b.d() != -1) {
                    j = TimeUnit.SECONDS.toMillis(b.d());
                }
                if (!c.g()) {
                    long j2 = millis + b2;
                    if (j2 < j + c2) {
                        i80.a j3 = this.c.j();
                        if (j2 >= c2) {
                            j3.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (b2 > 86400000 && e()) {
                            j3.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new s80(null, j3.a());
                    }
                }
                String str = this.k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f != null) {
                    str = this.g;
                } else {
                    if (this.d == null) {
                        return new s80(this.b, null);
                    }
                    str = this.e;
                }
                y70.a a = this.b.c().a();
                m80.a.a(a, str2, str);
                g80.a f = this.b.f();
                f.a(a.a());
                return new s80(f.a(), this.c);
            }
            return new s80(this.b, null);
        }

        private boolean e() {
            return this.c.c().c() == -1 && this.h == null;
        }

        public s80 a() {
            s80 d = d();
            return (d.a == null || !this.b.b().i()) ? d : new s80(null, null);
        }
    }

    s80(g80 g80Var, i80 i80Var) {
        this.a = g80Var;
        this.b = i80Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.c().a() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(defpackage.i80 r3, defpackage.g80 r4) {
        /*
            int r0 = r3.d()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.a(r0)
            if (r0 != 0) goto L5a
            j70 r0 = r3.c()
            int r0 = r0.c()
            r1 = -1
            if (r0 != r1) goto L5a
            j70 r0 = r3.c()
            boolean r0 = r0.b()
            if (r0 != 0) goto L5a
            j70 r0 = r3.c()
            boolean r0 = r0.a()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            j70 r3 = r3.c()
            boolean r3 = r3.h()
            if (r3 != 0) goto L6f
            j70 r3 = r4.b()
            boolean r3 = r3.h()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s80.a(i80, g80):boolean");
    }
}
