package defpackage;

/* loaded from: classes.dex */
public final class eh implements gh, fh {
    private final gh b;
    private fh c;
    private fh d;

    public eh(gh ghVar) {
        this.b = ghVar;
    }

    private boolean g(fh fhVar) {
        return fhVar.equals(this.c) || (this.c.c() && fhVar.equals(this.d));
    }

    private boolean h() {
        gh ghVar = this.b;
        return ghVar == null || ghVar.f(this);
    }

    private boolean i() {
        gh ghVar = this.b;
        return ghVar == null || ghVar.c(this);
    }

    private boolean j() {
        gh ghVar = this.b;
        return ghVar == null || ghVar.d(this);
    }

    private boolean k() {
        gh ghVar = this.b;
        return ghVar != null && ghVar.e();
    }

    @Override // defpackage.fh
    public void a() {
        if (this.c.isRunning()) {
            return;
        }
        this.c.a();
    }

    @Override // defpackage.gh
    public void a(fh fhVar) {
        if (!fhVar.equals(this.d)) {
            if (this.d.isRunning()) {
                return;
            }
            this.d.a();
        } else {
            gh ghVar = this.b;
            if (ghVar != null) {
                ghVar.a(this);
            }
        }
    }

    public void a(fh fhVar, fh fhVar2) {
        this.c = fhVar;
        this.d = fhVar2;
    }

    @Override // defpackage.fh
    public void b() {
        this.c.b();
        this.d.b();
    }

    @Override // defpackage.fh
    public boolean b(fh fhVar) {
        if (!(fhVar instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) fhVar;
        return this.c.b(ehVar.c) && this.d.b(ehVar.d);
    }

    @Override // defpackage.fh
    public boolean c() {
        return this.c.c() && this.d.c();
    }

    @Override // defpackage.gh
    public boolean c(fh fhVar) {
        return i() && g(fhVar);
    }

    @Override // defpackage.fh
    public void clear() {
        this.c.clear();
        if (this.d.isRunning()) {
            this.d.clear();
        }
    }

    @Override // defpackage.fh
    public boolean d() {
        return (this.c.c() ? this.d : this.c).d();
    }

    @Override // defpackage.gh
    public boolean d(fh fhVar) {
        return j() && g(fhVar);
    }

    @Override // defpackage.gh
    public void e(fh fhVar) {
        gh ghVar = this.b;
        if (ghVar != null) {
            ghVar.e(this);
        }
    }

    @Override // defpackage.gh
    public boolean e() {
        return k() || f();
    }

    @Override // defpackage.fh
    public boolean f() {
        return (this.c.c() ? this.d : this.c).f();
    }

    @Override // defpackage.gh
    public boolean f(fh fhVar) {
        return h() && g(fhVar);
    }

    @Override // defpackage.fh
    public boolean g() {
        return (this.c.c() ? this.d : this.c).g();
    }

    @Override // defpackage.fh
    public boolean isRunning() {
        return (this.c.c() ? this.d : this.c).isRunning();
    }
}
