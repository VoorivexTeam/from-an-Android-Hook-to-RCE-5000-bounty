package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000.InterfaceSubMenuC0501c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.v */
/* loaded from: classes.dex */
public class SubMenuC0113v extends MenuC0109r implements SubMenu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0113v(Context context, InterfaceSubMenuC0501c1 interfaceSubMenuC0501c1) {
        super(context, interfaceSubMenuC0501c1);
    }

    /* renamed from: c */
    public InterfaceSubMenuC0501c1 m736c() {
        return (InterfaceSubMenuC0501c1) this.f541a;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        m736c().clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m592a(m736c().getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m736c().setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m736c().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m736c().setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m736c().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m736c().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        m736c().setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        m736c().setIcon(drawable);
        return this;
    }
}
