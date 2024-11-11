package p000;

/* loaded from: classes.dex */
public class wa0 extends RuntimeException {
    public wa0(fb0<?> fb0Var) {
        super(m16196a(fb0Var));
        fb0Var.m11752b();
        fb0Var.m11756f();
    }

    /* renamed from: a */
    private static String m16196a(fb0<?> fb0Var) {
        ib0.m12428a(fb0Var, "response == null");
        return "HTTP " + fb0Var.m11752b() + " " + fb0Var.m11756f();
    }
}
