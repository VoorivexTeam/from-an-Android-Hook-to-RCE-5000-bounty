package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class o2 {
    private Object a;

    private o2(Object obj) {
        this.a = obj;
    }

    public static o2 a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new o2(PointerIcon.getSystemIcon(context, i)) : new o2(null);
    }

    public Object a() {
        return this.a;
    }
}
