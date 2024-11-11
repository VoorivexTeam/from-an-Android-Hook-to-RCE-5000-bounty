package p000;

import android.graphics.Paint;
import com.airbnb.lottie.C0540f;
import java.util.List;

/* renamed from: l7 */
/* loaded from: classes.dex */
public class C2887l7 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final String f11815a;

    /* renamed from: b */
    private final C2801j6 f11816b;

    /* renamed from: c */
    private final List<C2801j6> f11817c;

    /* renamed from: d */
    private final C2580i6 f11818d;

    /* renamed from: e */
    private final C2886l6 f11819e;

    /* renamed from: f */
    private final C2801j6 f11820f;

    /* renamed from: g */
    private final b f11821g;

    /* renamed from: h */
    private final c f11822h;

    /* renamed from: i */
    private final float f11823i;

    /* renamed from: j */
    private final boolean f11824j;

    /* renamed from: l7$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11825a;

        /* renamed from: b */
        static final /* synthetic */ int[] f11826b;

        static {
            int[] iArr = new int[c.values().length];
            f11826b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11826b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11826b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f11825a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11825a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11825a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: l7$b */
    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.f11825a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* renamed from: l7$c */
    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.f11826b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public C2887l7(String str, C2801j6 c2801j6, List<C2801j6> list, C2580i6 c2580i6, C2886l6 c2886l6, C2801j6 c2801j62, b bVar, c cVar, float f, boolean z) {
        this.f11815a = str;
        this.f11816b = c2801j6;
        this.f11817c = list;
        this.f11818d = c2580i6;
        this.f11819e = c2886l6;
        this.f11820f = c2801j62;
        this.f11821g = bVar;
        this.f11822h = cVar;
        this.f11823i = f;
        this.f11824j = z;
    }

    /* renamed from: a */
    public b m13819a() {
        return this.f11821g;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C2459f5(c0540f, abstractC2976n7, this);
    }

    /* renamed from: b */
    public C2580i6 m13820b() {
        return this.f11818d;
    }

    /* renamed from: c */
    public C2801j6 m13821c() {
        return this.f11816b;
    }

    /* renamed from: d */
    public c m13822d() {
        return this.f11822h;
    }

    /* renamed from: e */
    public List<C2801j6> m13823e() {
        return this.f11817c;
    }

    /* renamed from: f */
    public float m13824f() {
        return this.f11823i;
    }

    /* renamed from: g */
    public String m13825g() {
        return this.f11815a;
    }

    /* renamed from: h */
    public C2886l6 m13826h() {
        return this.f11819e;
    }

    /* renamed from: i */
    public C2801j6 m13827i() {
        return this.f11820f;
    }

    /* renamed from: j */
    public boolean m13828j() {
        return this.f11824j;
    }
}
