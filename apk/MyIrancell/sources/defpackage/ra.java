package defpackage;

import defpackage.la;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ra implements la<InputStream> {
    private final xe a;

    /* loaded from: classes.dex */
    public static final class a implements la.a<InputStream> {
        private final bc a;

        public a(bc bcVar) {
            this.a = bcVar;
        }

        @Override // la.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // la.a
        public la<InputStream> a(InputStream inputStream) {
            return new ra(inputStream, this.a);
        }
    }

    ra(InputStream inputStream, bc bcVar) {
        xe xeVar = new xe(inputStream, bcVar);
        this.a = xeVar;
        xeVar.mark(5242880);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.la
    public InputStream a() {
        this.a.reset();
        return this.a;
    }

    @Override // defpackage.la
    public void b() {
        this.a.c();
    }
}
