package p000;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: h1 */
/* loaded from: classes.dex */
public class C2534h1 {
    /* renamed from: a */
    public static boolean m12078a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
