package p000;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p000.g80;
import p000.i80;
import p000.y70;

/* loaded from: classes.dex */
public final class s80 {

    /* renamed from: a */
    @Nullable
    public final g80 f13038a;

    /* renamed from: b */
    @Nullable
    public final i80 f13039b;

    /* renamed from: s80$a */
    /* loaded from: classes.dex */
    public static class C3198a {

        /* renamed from: a */
        final long f13040a;

        /* renamed from: b */
        final g80 f13041b;

        /* renamed from: c */
        final i80 f13042c;

        /* renamed from: d */
        private Date f13043d;

        /* renamed from: e */
        private String f13044e;

        /* renamed from: f */
        private Date f13045f;

        /* renamed from: g */
        private String f13046g;

        /* renamed from: h */
        private Date f13047h;

        /* renamed from: i */
        private long f13048i;

        /* renamed from: j */
        private long f13049j;

        /* renamed from: k */
        private String f13050k;

        /* renamed from: l */
        private int f13051l;

        public C3198a(long j, g80 g80Var, i80 i80Var) {
            this.f13051l = -1;
            this.f13040a = j;
            this.f13041b = g80Var;
            this.f13042c = i80Var;
            if (i80Var != null) {
                this.f13048i = i80Var.m12398n();
                this.f13049j = i80Var.m12396l();
                y70 m12391f = i80Var.m12391f();
                int m16595b = m12391f.m16595b();
                for (int i = 0; i < m16595b; i++) {
                    String m16592a = m12391f.m16592a(i);
                    String m16596b = m12391f.m16596b(i);
                    if ("Date".equalsIgnoreCase(m16592a)) {
                        this.f13043d = e90.m11568a(m16596b);
                        this.f13044e = m16596b;
                    } else if ("Expires".equalsIgnoreCase(m16592a)) {
                        this.f13047h = e90.m11568a(m16596b);
                    } else if ("Last-Modified".equalsIgnoreCase(m16592a)) {
                        this.f13045f = e90.m11568a(m16596b);
                        this.f13046g = m16596b;
                    } else if ("ETag".equalsIgnoreCase(m16592a)) {
                        this.f13050k = m16596b;
                    } else if ("Age".equalsIgnoreCase(m16592a)) {
                        this.f13051l = f90.m11713a(m16596b, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private static boolean m15380a(g80 g80Var) {
            return (g80Var.m11919a("If-Modified-Since") == null && g80Var.m11919a("If-None-Match") == null) ? false : true;
        }

        /* renamed from: b */
        private long m15381b() {
            Date date = this.f13043d;
            long max = date != null ? Math.max(0L, this.f13049j - date.getTime()) : 0L;
            int i = this.f13051l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f13049j;
            return max + (j - this.f13048i) + (this.f13040a - j);
        }

        /* renamed from: c */
        private long m15382c() {
            if (this.f13042c.m12388c().m13411c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m13411c());
            }
            if (this.f13047h != null) {
                Date date = this.f13043d;
                long time = this.f13047h.getTime() - (date != null ? date.getTime() : this.f13049j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f13045f == null || this.f13042c.m12397m().m11925g().m16817l() != null) {
                return 0L;
            }
            Date date2 = this.f13043d;
            long time2 = (date2 != null ? date2.getTime() : this.f13048i) - this.f13045f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        /* renamed from: d */
        private s80 m15383d() {
            if (this.f13042c == null) {
                return new s80(this.f13041b, null);
            }
            if ((!this.f13041b.m11922d() || this.f13042c.m12390e() != null) && s80.m15379a(this.f13042c, this.f13041b)) {
                j70 m11920b = this.f13041b.m11920b();
                if (m11920b.m13415g() || m15380a(this.f13041b)) {
                    return new s80(this.f13041b, null);
                }
                j70 m12388c = this.f13042c.m12388c();
                long m15381b = m15381b();
                long m15382c = m15382c();
                if (m11920b.m13411c() != -1) {
                    m15382c = Math.min(m15382c, TimeUnit.SECONDS.toMillis(m11920b.m13411c()));
                }
                long j = 0;
                long millis = m11920b.m13413e() != -1 ? TimeUnit.SECONDS.toMillis(m11920b.m13413e()) : 0L;
                if (!m12388c.m13414f() && m11920b.m13412d() != -1) {
                    j = TimeUnit.SECONDS.toMillis(m11920b.m13412d());
                }
                if (!m12388c.m13415g()) {
                    long j2 = millis + m15381b;
                    if (j2 < j + m15382c) {
                        i80.C2583a m12394j = this.f13042c.m12394j();
                        if (j2 >= m15382c) {
                            m12394j.m12408a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (m15381b > 86400000 && m15384e()) {
                            m12394j.m12408a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new s80(null, m12394j.m12411a());
                    }
                }
                String str = this.f13050k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f13045f != null) {
                    str = this.f13046g;
                } else {
                    if (this.f13043d == null) {
                        return new s80(this.f13041b, null);
                    }
                    str = this.f13044e;
                }
                y70.C3476a m16594a = this.f13041b.m11921c().m16594a();
                m80.f12098a.mo11328a(m16594a, str2, str);
                g80.C2502a m11924f = this.f13041b.m11924f();
                m11924f.m11930a(m16594a.m16600a());
                return new s80(m11924f.m11932a(), this.f13042c);
            }
            return new s80(this.f13041b, null);
        }

        /* renamed from: e */
        private boolean m15384e() {
            return this.f13042c.m12388c().m13411c() == -1 && this.f13047h == null;
        }

        /* renamed from: a */
        public s80 m15385a() {
            s80 m15383d = m15383d();
            return (m15383d.f13038a == null || !this.f13041b.m11920b().m13417i()) ? m15383d : new s80(null, null);
        }
    }

    s80(g80 g80Var, i80 i80Var) {
        this.f13038a = g80Var;
        this.f13039b = i80Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m12388c().m13409a() == false) goto L33;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m15379a(p000.i80 r3, p000.g80 r4) {
        /*
            int r0 = r3.m12389d()
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
            java.lang.String r0 = r3.m12386a(r0)
            if (r0 != 0) goto L5a
            j70 r0 = r3.m12388c()
            int r0 = r0.m13411c()
            r1 = -1
            if (r0 != r1) goto L5a
            j70 r0 = r3.m12388c()
            boolean r0 = r0.m13410b()
            if (r0 != 0) goto L5a
            j70 r0 = r3.m12388c()
            boolean r0 = r0.m13409a()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            j70 r3 = r3.m12388c()
            boolean r3 = r3.m13416h()
            if (r3 != 0) goto L6f
            j70 r3 = r4.m11920b()
            boolean r3 = r3.m13416h()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s80.m15379a(i80, g80):boolean");
    }
}
