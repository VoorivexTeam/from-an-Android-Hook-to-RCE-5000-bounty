package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* renamed from: f2 */
/* loaded from: classes.dex */
public final class C2454f2 {
    /* renamed from: a */
    public static MenuItem m11661a(MenuItem menuItem, AbstractC0003a2 abstractC0003a2) {
        return menuItem instanceof InterfaceMenuItemC0446b1 ? ((InterfaceMenuItemC0446b1) menuItem).mo575a(abstractC0003a2) : menuItem;
    }

    /* renamed from: a */
    public static void m11662a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC0446b1) {
            ((InterfaceMenuItemC0446b1) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m11663a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0446b1) {
            ((InterfaceMenuItemC0446b1) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m11664a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0446b1) {
            ((InterfaceMenuItemC0446b1) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m11665a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0446b1) {
            ((InterfaceMenuItemC0446b1) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m11666b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC0446b1) {
            ((InterfaceMenuItemC0446b1) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m11667b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0446b1) {
            ((InterfaceMenuItemC0446b1) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
