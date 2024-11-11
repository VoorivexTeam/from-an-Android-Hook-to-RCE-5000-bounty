package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
class cc implements lc {
    private final b a = new b();
    private final hc<a, Bitmap> b = new hc<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements mc {
        private final b a;
        private int b;
        private int c;
        private Bitmap.Config d;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.mc
        public void a() {
            this.a.a(this);
        }

        public void a(int i, int i2, Bitmap.Config config) {
            this.b = i;
            this.c = i2;
            this.d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public int hashCode() {
            int i = ((this.b * 31) + this.c) * 31;
            Bitmap.Config config = this.d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return cc.c(this.b, this.c, this.d);
        }
    }

    /* loaded from: classes.dex */
    static class b extends dc<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.dc
        public a a() {
            return new a(this);
        }

        a a(int i, int i2, Bitmap.Config config) {
            a b = b();
            b.a(i, i2, config);
            return b;
        }
    }

    static String c(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    private static String d(Bitmap bitmap) {
        return c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // defpackage.lc
    public Bitmap a() {
        return this.b.a();
    }

    @Override // defpackage.lc
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.b.a((hc<a, Bitmap>) this.a.a(i, i2, config));
    }

    @Override // defpackage.lc
    public void a(Bitmap bitmap) {
        this.b.a(this.a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // defpackage.lc
    public int b(Bitmap bitmap) {
        return ki.a(bitmap);
    }

    @Override // defpackage.lc
    public String b(int i, int i2, Bitmap.Config config) {
        return c(i, i2, config);
    }

    @Override // defpackage.lc
    public String c(Bitmap bitmap) {
        return d(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.b;
    }
}
