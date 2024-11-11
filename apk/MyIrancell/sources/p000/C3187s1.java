package p000;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: s1 */
/* loaded from: classes.dex */
public class C3187s1 {
    /* renamed from: a */
    public static int m15318a(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static boolean m15319a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
