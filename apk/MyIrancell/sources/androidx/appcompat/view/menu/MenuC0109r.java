package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000.InterfaceMenuC0002a1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes.dex */
public class MenuC0109r extends AbstractC0094c<InterfaceMenuC0002a1> implements Menu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuC0109r(Context context, InterfaceMenuC0002a1 interfaceMenuC0002a1) {
        super(context, interfaceMenuC0002a1);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m592a(((InterfaceMenuC0002a1) this.f541a).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m592a(((InterfaceMenuC0002a1) this.f541a).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m592a(((InterfaceMenuC0002a1) this.f541a).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m592a(((InterfaceMenuC0002a1) this.f541a).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((InterfaceMenuC0002a1) this.f541a).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m592a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m593a(((InterfaceMenuC0002a1) this.f541a).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m593a(((InterfaceMenuC0002a1) this.f541a).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m593a(((InterfaceMenuC0002a1) this.f541a).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m593a(((InterfaceMenuC0002a1) this.f541a).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m595b();
        ((InterfaceMenuC0002a1) this.f541a).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((InterfaceMenuC0002a1) this.f541a).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m592a(((InterfaceMenuC0002a1) this.f541a).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m592a(((InterfaceMenuC0002a1) this.f541a).getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((InterfaceMenuC0002a1) this.f541a).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((InterfaceMenuC0002a1) this.f541a).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((InterfaceMenuC0002a1) this.f541a).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((InterfaceMenuC0002a1) this.f541a).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m594a(i);
        ((InterfaceMenuC0002a1) this.f541a).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m596b(i);
        ((InterfaceMenuC0002a1) this.f541a).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((InterfaceMenuC0002a1) this.f541a).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((InterfaceMenuC0002a1) this.f541a).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((InterfaceMenuC0002a1) this.f541a).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((InterfaceMenuC0002a1) this.f541a).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((InterfaceMenuC0002a1) this.f541a).size();
    }
}
