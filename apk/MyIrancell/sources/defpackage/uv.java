package defpackage;

/* loaded from: classes.dex */
public final class uv {
    private final tv a;
    private hz b;

    public uv(tv tvVar) {
        if (tvVar == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.a = tvVar;
    }

    public gz a(int i, gz gzVar) {
        return this.a.a(i, gzVar);
    }

    public hz a() {
        if (this.b == null) {
            this.b = this.a.a();
        }
        return this.b;
    }

    public int b() {
        return this.a.b();
    }

    public int c() {
        return this.a.d();
    }

    public boolean d() {
        return this.a.c().d();
    }

    public uv e() {
        this.a.c().e();
        throw null;
    }

    public String toString() {
        try {
            return a().toString();
        } catch (aw unused) {
            return "";
        }
    }
}
