package defpackage;

/* loaded from: classes.dex */
public abstract class ni {

    /* loaded from: classes.dex */
    private static class b extends ni {
        private volatile boolean a;

        b() {
            super();
        }

        @Override // defpackage.ni
        public void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // defpackage.ni
        public void a(boolean z) {
            this.a = z;
        }
    }

    private ni() {
    }

    public static ni b() {
        return new b();
    }

    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(boolean z);
}
