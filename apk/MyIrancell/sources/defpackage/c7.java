package defpackage;

/* loaded from: classes.dex */
public class c7 {
    private final a a;
    private final p6 b;
    private final l6 c;
    private final boolean d;

    /* loaded from: classes.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public c7(a aVar, p6 p6Var, l6 l6Var, boolean z) {
        this.a = aVar;
        this.b = p6Var;
        this.c = l6Var;
        this.d = z;
    }

    public a a() {
        return this.a;
    }

    public p6 b() {
        return this.b;
    }

    public l6 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
