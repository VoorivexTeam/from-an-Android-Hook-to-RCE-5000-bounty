package ir.metrix.sdk;

/* loaded from: classes.dex */
public class w {
    private static w a;
    private String b = null;

    private w() {
    }

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (a == null) {
                a = new w();
            }
            wVar = a;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.b;
    }
}
