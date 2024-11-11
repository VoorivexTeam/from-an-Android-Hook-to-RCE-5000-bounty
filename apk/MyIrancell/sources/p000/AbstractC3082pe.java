package p000;

import com.bumptech.glide.load.C0574h;

/* renamed from: pe */
/* loaded from: classes.dex */
public abstract class AbstractC3082pe {

    /* renamed from: a */
    public static final AbstractC3082pe f12595a = new e();

    /* renamed from: b */
    public static final AbstractC3082pe f12596b = new d();

    /* renamed from: c */
    public static final AbstractC3082pe f12597c;

    /* renamed from: d */
    public static final AbstractC3082pe f12598d;

    /* renamed from: e */
    public static final AbstractC3082pe f12599e;

    /* renamed from: f */
    public static final C0574h<AbstractC3082pe> f12600f;

    /* renamed from: pe$a */
    /* loaded from: classes.dex */
    private static class a extends AbstractC3082pe {
        a() {
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: a */
        public g mo14749a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: b */
        public float mo14750b(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: pe$b */
    /* loaded from: classes.dex */
    private static class b extends AbstractC3082pe {
        b() {
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: a */
        public g mo14749a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: b */
        public float mo14750b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* renamed from: pe$c */
    /* loaded from: classes.dex */
    private static class c extends AbstractC3082pe {
        c() {
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: a */
        public g mo14749a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: b */
        public float mo14750b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, AbstractC3082pe.f12595a.mo14750b(i, i2, i3, i4));
        }
    }

    /* renamed from: pe$d */
    /* loaded from: classes.dex */
    private static class d extends AbstractC3082pe {
        d() {
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: a */
        public g mo14749a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: b */
        public float mo14750b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* renamed from: pe$e */
    /* loaded from: classes.dex */
    private static class e extends AbstractC3082pe {
        e() {
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: a */
        public g mo14749a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: b */
        public float mo14750b(int i, int i2, int i3, int i4) {
            return Math.min(i3 / i, i4 / i2);
        }
    }

    /* renamed from: pe$f */
    /* loaded from: classes.dex */
    private static class f extends AbstractC3082pe {
        f() {
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: a */
        public g mo14749a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // p000.AbstractC3082pe
        /* renamed from: b */
        public float mo14750b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: pe$g */
    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        new a();
        new b();
        f12597c = new c();
        f12598d = new f();
        AbstractC3082pe abstractC3082pe = f12596b;
        f12599e = abstractC3082pe;
        f12600f = C0574h.m3956a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", abstractC3082pe);
    }

    /* renamed from: a */
    public abstract g mo14749a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo14750b(int i, int i2, int i3, int i4);
}
