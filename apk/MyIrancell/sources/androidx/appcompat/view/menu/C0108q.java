package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000.InterfaceMenuC0002a1;
import p000.InterfaceMenuItemC0446b1;
import p000.InterfaceSubMenuC0501c1;

/* renamed from: androidx.appcompat.view.menu.q */
/* loaded from: classes.dex */
public final class C0108q {
    /* renamed from: a */
    public static Menu m731a(Context context, InterfaceMenuC0002a1 interfaceMenuC0002a1) {
        return new MenuC0109r(context, interfaceMenuC0002a1);
    }

    /* renamed from: a */
    public static MenuItem m732a(Context context, InterfaceMenuItemC0446b1 interfaceMenuItemC0446b1) {
        return Build.VERSION.SDK_INT >= 16 ? new C0103l(context, interfaceMenuItemC0446b1) : new MenuItemC0102k(context, interfaceMenuItemC0446b1);
    }

    /* renamed from: a */
    public static SubMenu m733a(Context context, InterfaceSubMenuC0501c1 interfaceSubMenuC0501c1) {
        return new SubMenuC0113v(context, interfaceSubMenuC0501c1);
    }
}
