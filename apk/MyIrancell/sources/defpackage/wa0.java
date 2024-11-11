package defpackage;

/* loaded from: classes.dex */
public class wa0 extends RuntimeException {
    public wa0(fb0<?> fb0Var) {
        super(a(fb0Var));
        fb0Var.b();
        fb0Var.f();
    }

    private static String a(fb0<?> fb0Var) {
        ib0.a(fb0Var, "response == null");
        return "HTTP " + fb0Var.b() + " " + fb0Var.f();
    }
}
