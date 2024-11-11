package p000;

import android.graphics.Path;
import com.airbnb.lottie.C0540f;

/* renamed from: z6 */
/* loaded from: classes.dex */
public class C3513z6 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final EnumC0452b7 f14344a;

    /* renamed from: b */
    private final Path.FillType f14345b;

    /* renamed from: c */
    private final C2848k6 f14346c;

    /* renamed from: d */
    private final C2886l6 f14347d;

    /* renamed from: e */
    private final C2971n6 f14348e;

    /* renamed from: f */
    private final C2971n6 f14349f;

    /* renamed from: g */
    private final String f14350g;

    /* renamed from: h */
    private final boolean f14351h;

    public C3513z6(String str, EnumC0452b7 enumC0452b7, Path.FillType fillType, C2848k6 c2848k6, C2886l6 c2886l6, C2971n6 c2971n6, C2971n6 c2971n62, C2801j6 c2801j6, C2801j6 c2801j62, boolean z) {
        this.f14344a = enumC0452b7;
        this.f14345b = fillType;
        this.f14346c = c2848k6;
        this.f14347d = c2886l6;
        this.f14348e = c2971n6;
        this.f14349f = c2971n62;
        this.f14350g = str;
        this.f14351h = z;
    }

    /* renamed from: a */
    public C2971n6 m16777a() {
        return this.f14349f;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C3330v4(c0540f, abstractC2976n7, this);
    }

    /* renamed from: b */
    public Path.FillType m16778b() {
        return this.f14345b;
    }

    /* renamed from: c */
    public C2848k6 m16779c() {
        return this.f14346c;
    }

    /* renamed from: d */
    public EnumC0452b7 m16780d() {
        return this.f14344a;
    }

    /* renamed from: e */
    public String m16781e() {
        return this.f14350g;
    }

    /* renamed from: f */
    public C2886l6 m16782f() {
        return this.f14347d;
    }

    /* renamed from: g */
    public C2971n6 m16783g() {
        return this.f14348e;
    }

    /* renamed from: h */
    public boolean m16784h() {
        return this.f14351h;
    }
}
