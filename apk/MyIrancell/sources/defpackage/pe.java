package defpackage;

import com.bumptech.glide.load.h;

/* loaded from: classes.dex */
public abstract class pe {
    public static final pe a = new e();
    public static final pe b = new d();
    public static final pe c;
    public static final pe d;
    public static final pe e;
    public static final h<pe> f;

    /* loaded from: classes.dex */
    private static class a extends pe {
        a() {
        }

        @Override // defpackage.pe
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // defpackage.pe
        public float b(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends pe {
        b() {
        }

        @Override // defpackage.pe
        public g a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        @Override // defpackage.pe
        public float b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* loaded from: classes.dex */
    private static class c extends pe {
        c() {
        }

        @Override // defpackage.pe
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // defpackage.pe
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, pe.a.b(i, i2, i3, i4));
        }
    }

    /* loaded from: classes.dex */
    private static class d extends pe {
        d() {
        }

        @Override // defpackage.pe
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // defpackage.pe
        public float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* loaded from: classes.dex */
    private static class e extends pe {
        e() {
        }

        @Override // defpackage.pe
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // defpackage.pe
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(i3 / i, i4 / i2);
        }
    }

    /* loaded from: classes.dex */
    private static class f extends pe {
        f() {
        }

        @Override // defpackage.pe
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // defpackage.pe
        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        new a();
        new b();
        c = new c();
        d = new f();
        pe peVar = b;
        e = peVar;
        f = h.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", peVar);
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
