package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import defpackage.a1;
import defpackage.b1;
import defpackage.c1;

/* loaded from: classes.dex */
public final class q {
    public static Menu a(Context context, a1 a1Var) {
        return new r(context, a1Var);
    }

    public static MenuItem a(Context context, b1 b1Var) {
        return Build.VERSION.SDK_INT >= 16 ? new l(context, b1Var) : new k(context, b1Var);
    }

    public static SubMenu a(Context context, c1 c1Var) {
        return new v(context, c1Var);
    }
}
