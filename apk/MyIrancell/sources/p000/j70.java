package p000;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class j70 {

    /* renamed from: a */
    private final boolean f11464a;

    /* renamed from: b */
    private final boolean f11465b;

    /* renamed from: c */
    private final int f11466c;

    /* renamed from: d */
    private final int f11467d;

    /* renamed from: e */
    private final boolean f11468e;

    /* renamed from: f */
    private final boolean f11469f;

    /* renamed from: g */
    private final boolean f11470g;

    /* renamed from: h */
    private final int f11471h;

    /* renamed from: i */
    private final int f11472i;

    /* renamed from: j */
    private final boolean f11473j;

    /* renamed from: k */
    private final boolean f11474k;

    /* renamed from: l */
    private final boolean f11475l;

    /* renamed from: m */
    @Nullable
    String f11476m;

    /* renamed from: j70$a */
    /* loaded from: classes.dex */
    public static final class C2803a {

        /* renamed from: a */
        boolean f11477a;

        /* renamed from: b */
        boolean f11478b;

        /* renamed from: c */
        int f11479c = -1;

        /* renamed from: d */
        int f11480d = -1;

        /* renamed from: e */
        int f11481e = -1;

        /* renamed from: f */
        boolean f11482f;

        /* renamed from: g */
        boolean f11483g;

        /* renamed from: h */
        boolean f11484h;

        /* renamed from: a */
        public C2803a m13418a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f11480d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: a */
        public j70 m13419a() {
            return new j70(this);
        }

        /* renamed from: b */
        public C2803a m13420b() {
            this.f11477a = true;
            return this;
        }

        /* renamed from: c */
        public C2803a m13421c() {
            this.f11482f = true;
            return this;
        }
    }

    static {
        C2803a c2803a = new C2803a();
        c2803a.m13420b();
        c2803a.m13419a();
        C2803a c2803a2 = new C2803a();
        c2803a2.m13421c();
        c2803a2.m13418a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        c2803a2.m13419a();
    }

    j70(C2803a c2803a) {
        this.f11464a = c2803a.f11477a;
        this.f11465b = c2803a.f11478b;
        this.f11466c = c2803a.f11479c;
        this.f11467d = -1;
        this.f11468e = false;
        this.f11469f = false;
        this.f11470g = false;
        this.f11471h = c2803a.f11480d;
        this.f11472i = c2803a.f11481e;
        this.f11473j = c2803a.f11482f;
        this.f11474k = c2803a.f11483g;
        this.f11475l = c2803a.f11484h;
    }

    private j70(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f11464a = z;
        this.f11465b = z2;
        this.f11466c = i;
        this.f11467d = i2;
        this.f11468e = z3;
        this.f11469f = z4;
        this.f11470g = z5;
        this.f11471h = i3;
        this.f11472i = i4;
        this.f11473j = z6;
        this.f11474k = z7;
        this.f11475l = z8;
        this.f11476m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.j70 m13407a(p000.y70 r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j70.m13407a(y70):j70");
    }

    /* renamed from: j */
    private String m13408j() {
        StringBuilder sb = new StringBuilder();
        if (this.f11464a) {
            sb.append("no-cache, ");
        }
        if (this.f11465b) {
            sb.append("no-store, ");
        }
        if (this.f11466c != -1) {
            sb.append("max-age=");
            sb.append(this.f11466c);
            sb.append(", ");
        }
        if (this.f11467d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f11467d);
            sb.append(", ");
        }
        if (this.f11468e) {
            sb.append("private, ");
        }
        if (this.f11469f) {
            sb.append("public, ");
        }
        if (this.f11470g) {
            sb.append("must-revalidate, ");
        }
        if (this.f11471h != -1) {
            sb.append("max-stale=");
            sb.append(this.f11471h);
            sb.append(", ");
        }
        if (this.f11472i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f11472i);
            sb.append(", ");
        }
        if (this.f11473j) {
            sb.append("only-if-cached, ");
        }
        if (this.f11474k) {
            sb.append("no-transform, ");
        }
        if (this.f11475l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* renamed from: a */
    public boolean m13409a() {
        return this.f11468e;
    }

    /* renamed from: b */
    public boolean m13410b() {
        return this.f11469f;
    }

    /* renamed from: c */
    public int m13411c() {
        return this.f11466c;
    }

    /* renamed from: d */
    public int m13412d() {
        return this.f11471h;
    }

    /* renamed from: e */
    public int m13413e() {
        return this.f11472i;
    }

    /* renamed from: f */
    public boolean m13414f() {
        return this.f11470g;
    }

    /* renamed from: g */
    public boolean m13415g() {
        return this.f11464a;
    }

    /* renamed from: h */
    public boolean m13416h() {
        return this.f11465b;
    }

    /* renamed from: i */
    public boolean m13417i() {
        return this.f11473j;
    }

    public String toString() {
        String str = this.f11476m;
        if (str != null) {
            return str;
        }
        String m13408j = m13408j();
        this.f11476m = m13408j;
        return m13408j;
    }
}
