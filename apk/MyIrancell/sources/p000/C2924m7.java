package p000;

import com.airbnb.lottie.C0540f;

/* renamed from: m7 */
/* loaded from: classes.dex */
public class C2924m7 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final String f12083a;

    /* renamed from: b */
    private final a f12084b;

    /* renamed from: c */
    private final C2801j6 f12085c;

    /* renamed from: d */
    private final C2801j6 f12086d;

    /* renamed from: e */
    private final C2801j6 f12087e;

    /* renamed from: f */
    private final boolean f12088f;

    /* renamed from: m7$a */
    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public C2924m7(String str, a aVar, C2801j6 c2801j6, C2801j6 c2801j62, C2801j6 c2801j63, boolean z) {
        this.f12083a = str;
        this.f12084b = aVar;
        this.f12085c = c2801j6;
        this.f12086d = c2801j62;
        this.f12087e = c2801j63;
        this.f12088f = z;
    }

    /* renamed from: a */
    public C2801j6 m14056a() {
        return this.f12086d;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C2498g5(abstractC2976n7, this);
    }

    /* renamed from: b */
    public String m14057b() {
        return this.f12083a;
    }

    /* renamed from: c */
    public C2801j6 m14058c() {
        return this.f12087e;
    }

    /* renamed from: d */
    public C2801j6 m14059d() {
        return this.f12085c;
    }

    /* renamed from: e */
    public a m14060e() {
        return this.f12084b;
    }

    /* renamed from: f */
    public boolean m14061f() {
        return this.f12088f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f12085c + ", end: " + this.f12086d + ", offset: " + this.f12087e + "}";
    }
}
