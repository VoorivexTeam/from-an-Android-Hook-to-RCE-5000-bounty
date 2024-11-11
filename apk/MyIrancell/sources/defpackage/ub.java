package defpackage;

import defpackage.li;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ub<Z> implements vb<Z>, li.f {
    private static final u1<ub<?>> f = li.a(20, new a());
    private final ni b = ni.b();
    private vb<Z> c;
    private boolean d;
    private boolean e;

    /* loaded from: classes.dex */
    class a implements li.d<ub<?>> {
        a() {
        }

        @Override // li.d
        public ub<?> a() {
            return new ub<>();
        }
    }

    ub() {
    }

    private void a(vb<Z> vbVar) {
        this.e = false;
        this.d = true;
        this.c = vbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Z> ub<Z> b(vb<Z> vbVar) {
        ub a2 = f.a();
        ji.a(a2);
        ub ubVar = a2;
        ubVar.a(vbVar);
        return ubVar;
    }

    private void f() {
        this.c = null;
        f.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        this.b.a();
        if (!this.d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            b();
        }
    }

    @Override // defpackage.vb
    public synchronized void b() {
        this.b.a();
        this.e = true;
        if (!this.d) {
            this.c.b();
            f();
        }
    }

    @Override // defpackage.vb
    public int c() {
        return this.c.c();
    }

    @Override // defpackage.vb
    public Class<Z> d() {
        return this.c.d();
    }

    @Override // li.f
    public ni e() {
        return this.b;
    }

    @Override // defpackage.vb
    public Z get() {
        return this.c.get();
    }
}
