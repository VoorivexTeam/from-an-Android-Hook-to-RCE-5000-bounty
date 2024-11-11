package p000;

import android.graphics.Bitmap;

/* renamed from: cc */
/* loaded from: classes.dex */
class C0517cc implements InterfaceC2892lc {

    /* renamed from: a */
    private final b f2992a = new b();

    /* renamed from: b */
    private final C2548hc<a, Bitmap> f2993b = new C2548hc<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC2938mc {

        /* renamed from: a */
        private final b f2994a;

        /* renamed from: b */
        private int f2995b;

        /* renamed from: c */
        private int f2996c;

        /* renamed from: d */
        private Bitmap.Config f2997d;

        public a(b bVar) {
            this.f2994a = bVar;
        }

        @Override // p000.InterfaceC2938mc
        /* renamed from: a */
        public void mo3657a() {
            this.f2994a.m11359a(this);
        }

        /* renamed from: a */
        public void m3658a(int i, int i2, Bitmap.Config config) {
            this.f2995b = i;
            this.f2996c = i2;
            this.f2997d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2995b == aVar.f2995b && this.f2996c == aVar.f2996c && this.f2997d == aVar.f2997d;
        }

        public int hashCode() {
            int i = ((this.f2995b * 31) + this.f2996c) * 31;
            Bitmap.Config config = this.f2997d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C0517cc.m3649c(this.f2995b, this.f2996c, this.f2997d);
        }
    }

    /* renamed from: cc$b */
    /* loaded from: classes.dex */
    static class b extends AbstractC2384dc<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.AbstractC2384dc
        /* renamed from: a */
        public a mo3659a() {
            return new a(this);
        }

        /* renamed from: a */
        a m3660a(int i, int i2, Bitmap.Config config) {
            a m11360b = m11360b();
            m11360b.m3658a(i, i2, config);
            return m11360b;
        }
    }

    /* renamed from: c */
    static String m3649c(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: d */
    private static String m3650d(Bitmap bitmap) {
        return m3649c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: a */
    public Bitmap mo3651a() {
        return this.f2993b.m12202a();
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: a */
    public Bitmap mo3652a(int i, int i2, Bitmap.Config config) {
        return this.f2993b.m12203a((C2548hc<a, Bitmap>) this.f2992a.m3660a(i, i2, config));
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: a */
    public void mo3653a(Bitmap bitmap) {
        this.f2993b.m12204a(this.f2992a.m3660a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: b */
    public int mo3654b(Bitmap bitmap) {
        return C2861ki.m13721a(bitmap);
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: b */
    public String mo3655b(int i, int i2, Bitmap.Config config) {
        return m3649c(i, i2, config);
    }

    @Override // p000.InterfaceC2892lc
    /* renamed from: c */
    public String mo3656c(Bitmap bitmap) {
        return m3650d(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f2993b;
    }
}
