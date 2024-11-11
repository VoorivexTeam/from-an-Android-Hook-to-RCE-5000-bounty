package p000;

/* renamed from: ni */
/* loaded from: classes.dex */
public abstract class AbstractC2990ni {

    /* renamed from: ni$b */
    /* loaded from: classes.dex */
    private static class b extends AbstractC2990ni {

        /* renamed from: a */
        private volatile boolean f12338a;

        b() {
            super();
        }

        @Override // p000.AbstractC2990ni
        /* renamed from: a */
        public void mo14335a() {
            if (this.f12338a) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // p000.AbstractC2990ni
        /* renamed from: a */
        public void mo14336a(boolean z) {
            this.f12338a = z;
        }
    }

    private AbstractC2990ni() {
    }

    /* renamed from: b */
    public static AbstractC2990ni m14334b() {
        return new b();
    }

    /* renamed from: a */
    public abstract void mo14335a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo14336a(boolean z);
}
