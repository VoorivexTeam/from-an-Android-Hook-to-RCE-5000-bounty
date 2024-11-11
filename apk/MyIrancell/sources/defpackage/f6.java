package defpackage;

import com.airbnb.lottie.d;

/* loaded from: classes.dex */
public class f6 {
    private static final f6 b = new f6();
    private final g0<String, d> a = new g0<>(20);

    f6() {
    }

    public static f6 a() {
        return b;
    }

    public d a(String str) {
        if (str == null) {
            return null;
        }
        return this.a.b(str);
    }

    public void a(String str, d dVar) {
        if (str == null) {
            return;
        }
        this.a.a(str, dVar);
    }
}
