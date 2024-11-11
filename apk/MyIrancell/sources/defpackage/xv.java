package defpackage;

/* loaded from: classes.dex */
public final class xv extends ew {
    private static final xv d;

    static {
        xv xvVar = new xv();
        d = xvVar;
        xvVar.setStackTrace(ew.c);
    }

    private xv() {
    }

    private xv(Throwable th) {
        super(th);
    }

    public static xv a() {
        return ew.b ? new xv() : d;
    }

    public static xv a(Throwable th) {
        return ew.b ? new xv(th) : d;
    }
}
