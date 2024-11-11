package defpackage;

/* loaded from: classes.dex */
public abstract class ew extends Exception {
    protected static final boolean b;
    protected static final StackTraceElement[] c;

    static {
        b = System.getProperty("surefire.test.class.path") != null;
        c = new StackTraceElement[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ew() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ew(Throwable th) {
        super(th);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return null;
    }
}
