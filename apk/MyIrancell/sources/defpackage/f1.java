package defpackage;

/* loaded from: classes.dex */
public class f1 extends RuntimeException {
    public f1() {
        this(null);
    }

    public f1(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
