package defpackage;

import com.bumptech.glide.load.g;

/* loaded from: classes.dex */
public class ih extends dh<ih> {
    private static ih B;

    public static ih K() {
        if (B == null) {
            ih b = new ih().b();
            b.a();
            B = b;
        }
        return B;
    }

    public static ih b(g gVar) {
        return new ih().a(gVar);
    }

    public static ih b(Class<?> cls) {
        return new ih().a(cls);
    }

    public static ih b(jb jbVar) {
        return new ih().a(jbVar);
    }
}
