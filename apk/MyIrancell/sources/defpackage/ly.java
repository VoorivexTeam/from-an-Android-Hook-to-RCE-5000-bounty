package defpackage;

/* loaded from: classes.dex */
public abstract class ly {
    private final my a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ly(my myVar) {
        this.a = myVar;
    }

    public static void a(String str, StringBuilder sb) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append('\n');
        }
        sb.append(str);
    }

    public static void a(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                a(str, sb);
            }
        }
    }

    public abstract String a();

    public final my b() {
        return this.a;
    }

    public final String toString() {
        return a();
    }
}
