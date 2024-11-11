package defpackage;

import com.airbnb.lottie.d;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class q7 {
    private final List<x6> a;
    private final d b;
    private final String c;
    private final long d;
    private final a e;
    private final long f;
    private final String g;
    private final List<c7> h;
    private final t6 i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final r6 q;
    private final s6 r;
    private final j6 s;
    private final List<v9<Float>> t;
    private final b u;
    private final boolean v;

    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public q7(List<x6> list, d dVar, String str, long j, a aVar, long j2, String str2, List<c7> list2, t6 t6Var, int i, int i2, int i3, float f, float f2, int i4, int i5, r6 r6Var, s6 s6Var, List<v9<Float>> list3, b bVar, j6 j6Var, boolean z) {
        this.a = list;
        this.b = dVar;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = t6Var;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = r6Var;
        this.r = s6Var;
        this.t = list3;
        this.u = bVar;
        this.s = j6Var;
        this.v = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d a() {
        return this.b;
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(g());
        sb.append("\n");
        q7 a2 = this.b.a(h());
        if (a2 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sb.append(str2);
                sb.append(a2.g());
                a2 = this.b.a(a2.h());
                if (a2 == null) {
                    break;
                }
                str2 = "->";
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!e().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(e().size());
            sb.append("\n");
        }
        if (o() != 0 && n() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(o()), Integer.valueOf(n()), Integer.valueOf(m())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (x6 x6Var : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(x6Var);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public long b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<v9<Float>> c() {
        return this.t;
    }

    public a d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<c7> e() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b f() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<x6> l() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p() {
        return this.n / this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r6 q() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s6 r() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j6 s() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float t() {
        return this.m;
    }

    public String toString() {
        return a("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t6 u() {
        return this.i;
    }

    public boolean v() {
        return this.v;
    }
}
