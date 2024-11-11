package p000;

import com.airbnb.lottie.C0538d;
import java.util.List;
import java.util.Locale;

/* renamed from: q7 */
/* loaded from: classes.dex */
public class C3112q7 {

    /* renamed from: a */
    private final List<InterfaceC3426x6> f12702a;

    /* renamed from: b */
    private final C0538d f12703b;

    /* renamed from: c */
    private final String f12704c;

    /* renamed from: d */
    private final long f12705d;

    /* renamed from: e */
    private final a f12706e;

    /* renamed from: f */
    private final long f12707f;

    /* renamed from: g */
    private final String f12708g;

    /* renamed from: h */
    private final List<C0507c7> f12709h;

    /* renamed from: i */
    private final C3240t6 f12710i;

    /* renamed from: j */
    private final int f12711j;

    /* renamed from: k */
    private final int f12712k;

    /* renamed from: l */
    private final int f12713l;

    /* renamed from: m */
    private final float f12714m;

    /* renamed from: n */
    private final float f12715n;

    /* renamed from: o */
    private final int f12716o;

    /* renamed from: p */
    private final int f12717p;

    /* renamed from: q */
    private final C3155r6 f12718q;

    /* renamed from: r */
    private final C3192s6 f12719r;

    /* renamed from: s */
    private final C2801j6 f12720s;

    /* renamed from: t */
    private final List<C3346v9<Float>> f12721t;

    /* renamed from: u */
    private final b f12722u;

    /* renamed from: v */
    private final boolean f12723v;

    /* renamed from: q7$a */
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

    /* renamed from: q7$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public C3112q7(List<InterfaceC3426x6> list, C0538d c0538d, String str, long j, a aVar, long j2, String str2, List<C0507c7> list2, C3240t6 c3240t6, int i, int i2, int i3, float f, float f2, int i4, int i5, C3155r6 c3155r6, C3192s6 c3192s6, List<C3346v9<Float>> list3, b bVar, C2801j6 c2801j6, boolean z) {
        this.f12702a = list;
        this.f12703b = c0538d;
        this.f12704c = str;
        this.f12705d = j;
        this.f12706e = aVar;
        this.f12707f = j2;
        this.f12708g = str2;
        this.f12709h = list2;
        this.f12710i = c3240t6;
        this.f12711j = i;
        this.f12712k = i2;
        this.f12713l = i3;
        this.f12714m = f;
        this.f12715n = f2;
        this.f12716o = i4;
        this.f12717p = i5;
        this.f12718q = c3155r6;
        this.f12719r = c3192s6;
        this.f12721t = list3;
        this.f12722u = bVar;
        this.f12720s = c2801j6;
        this.f12723v = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0538d m14957a() {
        return this.f12703b;
    }

    /* renamed from: a */
    public String m14958a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m14964g());
        sb.append("\n");
        C3112q7 m3724a = this.f12703b.m3724a(m14965h());
        if (m3724a != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sb.append(str2);
                sb.append(m3724a.m14964g());
                m3724a = this.f12703b.m3724a(m3724a.m14965h());
                if (m3724a == null) {
                    break;
                }
                str2 = "->";
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!m14962e().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(m14962e().size());
            sb.append("\n");
        }
        if (m14972o() != 0 && m14971n() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m14972o()), Integer.valueOf(m14971n()), Integer.valueOf(m14970m())));
        }
        if (!this.f12702a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (InterfaceC3426x6 interfaceC3426x6 : this.f12702a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(interfaceC3426x6);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public long m14959b() {
        return this.f12705d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C3346v9<Float>> m14960c() {
        return this.f12721t;
    }

    /* renamed from: d */
    public a m14961d() {
        return this.f12706e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public List<C0507c7> m14962e() {
        return this.f12709h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public b m14963f() {
        return this.f12722u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public String m14964g() {
        return this.f12704c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public long m14965h() {
        return this.f12707f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m14966i() {
        return this.f12717p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m14967j() {
        return this.f12716o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public String m14968k() {
        return this.f12708g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<InterfaceC3426x6> m14969l() {
        return this.f12702a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m14970m() {
        return this.f12713l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m14971n() {
        return this.f12712k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m14972o() {
        return this.f12711j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public float m14973p() {
        return this.f12715n / this.f12703b.m3734d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C3155r6 m14974q() {
        return this.f12718q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C3192s6 m14975r() {
        return this.f12719r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C2801j6 m14976s() {
        return this.f12720s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public float m14977t() {
        return this.f12714m;
    }

    public String toString() {
        return m14958a("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C3240t6 m14978u() {
        return this.f12710i;
    }

    /* renamed from: v */
    public boolean m14979v() {
        return this.f12723v;
    }
}
