package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0099h;

/* renamed from: androidx.appcompat.view.menu.u */
/* loaded from: classes.dex */
public class SubMenuC0112u extends C0099h implements SubMenu {

    /* renamed from: B */
    private C0099h f703B;

    /* renamed from: C */
    private C0101j f704C;

    public SubMenuC0112u(Context context, C0099h c0099h, C0101j c0101j) {
        super(context);
        this.f703B = c0099h;
        this.f704C = c0101j;
    }

    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: a */
    public void mo644a(C0099h.a aVar) {
        this.f703B.mo644a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: a */
    public boolean mo651a(C0099h c0099h, MenuItem menuItem) {
        return super.mo651a(c0099h, menuItem) || this.f703B.mo651a(c0099h, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: a */
    public boolean mo652a(C0101j c0101j) {
        return this.f703B.mo652a(c0101j);
    }

    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: b */
    public boolean mo658b(C0101j c0101j) {
        return this.f703B.mo658b(c0101j);
    }

    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: d */
    public String mo664d() {
        C0101j c0101j = this.f704C;
        int itemId = c0101j != null ? c0101j.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo664d() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f704C;
    }

    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: m */
    public C0099h mo675m() {
        return this.f703B.mo675m();
    }

    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: o */
    public boolean mo677o() {
        return this.f703B.mo677o();
    }

    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: p */
    public boolean mo678p() {
        return this.f703B.mo678p();
    }

    @Override // androidx.appcompat.view.menu.C0099h
    /* renamed from: q */
    public boolean mo679q() {
        return this.f703B.mo679q();
    }

    @Override // androidx.appcompat.view.menu.C0099h, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f703B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.m663d(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m637a(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.m667e(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m639a(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.m638a(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f704C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f704C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0099h, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f703B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu m735t() {
        return this.f703B;
    }
}
