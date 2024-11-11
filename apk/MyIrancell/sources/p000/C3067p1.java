package p000;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: p1 */
/* loaded from: classes.dex */
public final class C3067p1 {

    /* renamed from: a */
    private static final Locale f12550a = new Locale("", "");

    /* renamed from: a */
    private static int m14683a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m14684b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f12550a)) {
            return 0;
        }
        String m13784b = C2881l1.m13784b(locale);
        return m13784b == null ? m14683a(locale) : (m13784b.equalsIgnoreCase("Arab") || m13784b.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
