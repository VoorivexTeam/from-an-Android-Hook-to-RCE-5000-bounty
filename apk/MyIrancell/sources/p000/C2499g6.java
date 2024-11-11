package p000;

/* renamed from: g6 */
/* loaded from: classes.dex */
public class C2499g6 {

    /* renamed from: d */
    private static String f10219d = "\r";

    /* renamed from: a */
    private final String f10220a;

    /* renamed from: b */
    public final float f10221b;

    /* renamed from: c */
    public final float f10222c;

    public C2499g6(String str, float f, float f2) {
        this.f10220a = str;
        this.f10222c = f2;
        this.f10221b = f;
    }

    /* renamed from: a */
    public boolean m11896a(String str) {
        if (this.f10220a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f10220a.endsWith(f10219d)) {
            String str2 = this.f10220a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
