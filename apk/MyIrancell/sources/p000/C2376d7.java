package p000;

import com.airbnb.lottie.C0540f;

/* renamed from: d7 */
/* loaded from: classes.dex */
public class C2376d7 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final String f9713a;

    /* renamed from: b */
    private final a f9714b;

    /* renamed from: c */
    private final boolean f9715c;

    /* renamed from: d7$a */
    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public C2376d7(String str, a aVar, boolean z) {
        this.f9713a = str;
        this.f9714b = aVar;
        this.f9715c = z;
    }

    /* renamed from: a */
    public a m11289a() {
        return this.f9714b;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        if (c0540f.m3800c()) {
            return new C3511z4(this);
        }
        C3116q9.m15002b("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public String m11290b() {
        return this.f9713a;
    }

    /* renamed from: c */
    public boolean m11291c() {
        return this.f9715c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f9714b + '}';
    }
}
