package p000;

/* renamed from: ly */
/* loaded from: classes.dex */
public abstract class AbstractC2914ly {

    /* renamed from: a */
    private final EnumC2960my f11931a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2914ly(EnumC2960my enumC2960my) {
        this.f11931a = enumC2960my;
    }

    /* renamed from: a */
    public static void m13942a(String str, StringBuilder sb) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append('\n');
        }
        sb.append(str);
    }

    /* renamed from: a */
    public static void m13943a(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                m13942a(str, sb);
            }
        }
    }

    /* renamed from: a */
    public abstract String mo3459a();

    /* renamed from: b */
    public final EnumC2960my m13944b() {
        return this.f11931a;
    }

    public final String toString() {
        return mo3459a();
    }
}
