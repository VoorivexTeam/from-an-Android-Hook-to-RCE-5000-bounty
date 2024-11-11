package defpackage;

/* loaded from: classes.dex */
public class lh implements gh, fh {
    private final gh b;
    private fh c;
    private fh d;
    private boolean e;

    lh() {
        this(null);
    }

    public lh(gh ghVar) {
        this.b = ghVar;
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
        this.e = true;
        if (!this.c.g() && !this.d.isRunning()) {
            this.d.a();
        }
        if (!this.e || this.c.isRunning()) {
            return;
        }
        this.c.a();
    }

    @Override // defpackage.gh
    public void a(fh fhVar) {
        gh ghVar;
        if (fhVar.equals(this.c) && (ghVar = this.b) != null) {
            ghVar.a(this);
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
        if (!(fhVar instanceof lh)) {
            return false;
        }
        lh lhVar = (lh) fhVar;
        fh fhVar2 = this.c;
        if (fhVar2 == null) {
            if (lhVar.c != null) {
                return false;
            }
        } else if (!fhVar2.b(lhVar.c)) {
            return false;
        }
        fh fhVar3 = this.d;
        fh fhVar4 = lhVar.d;
        if (fhVar3 == null) {
            if (fhVar4 != null) {
                return false;
            }
        } else if (!fhVar3.b(fhVar4)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fh
    public boolean c() {
        return this.c.c();
    }

    @Override // defpackage.gh
    public boolean c(fh fhVar) {
        return i() && fhVar.equals(this.c) && !e();
    }

    @Override // defpackage.fh
    public void clear() {
        this.e = false;
        this.d.clear();
        this.c.clear();
    }

    @Override // defpackage.fh
    public boolean d() {
        return this.c.d();
    }

    @Override // defpackage.gh
    public boolean d(fh fhVar) {
        return j() && (fhVar.equals(this.c) || !this.c.f());
    }

    @Override // defpackage.gh
    public void e(fh fhVar) {
        if (fhVar.equals(this.d)) {
            return;
        }
        gh ghVar = this.b;
        if (ghVar != null) {
            ghVar.e(this);
        }
        if (this.d.g()) {
            return;
        }
        this.d.clear();
    }

    @Override // defpackage.gh
    public boolean e() {
        return k() || f();
    }

    @Override // defpackage.fh
    public boolean f() {
        return this.c.f() || this.d.f();
    }

    @Override // defpackage.gh
    public boolean f(fh fhVar) {
        return h() && fhVar.equals(this.c);
    }

    @Override // defpackage.fh
    public boolean g() {
        return this.c.g() || this.d.g();
    }

    @Override // defpackage.fh
    public boolean isRunning() {
        return this.c.isRunning();
    }
}
