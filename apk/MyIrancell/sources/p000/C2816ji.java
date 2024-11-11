package p000;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: ji */
/* loaded from: classes.dex */
public final class C2816ji {
    /* renamed from: a */
    public static <T> T m13459a(T t) {
        m13460a(t, "Argument must not be null");
        return t;
    }

    /* renamed from: a */
    public static <T> T m13460a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m13461a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: a */
    public static <T extends Collection<Y>, Y> T m13462a(T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }

    /* renamed from: a */
    public static void m13463a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
