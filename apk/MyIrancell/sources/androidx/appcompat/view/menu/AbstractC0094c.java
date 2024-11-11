package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p000.C0500c0;
import p000.InterfaceMenuItemC0446b1;
import p000.InterfaceSubMenuC0501c1;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
abstract class AbstractC0094c<T> extends C0095d<T> {

    /* renamed from: b */
    final Context f538b;

    /* renamed from: c */
    private Map<InterfaceMenuItemC0446b1, MenuItem> f539c;

    /* renamed from: d */
    private Map<InterfaceSubMenuC0501c1, SubMenu> f540d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0094c(Context context, T t) {
        super(t);
        this.f538b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem m592a(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0446b1)) {
            return menuItem;
        }
        InterfaceMenuItemC0446b1 interfaceMenuItemC0446b1 = (InterfaceMenuItemC0446b1) menuItem;
        if (this.f539c == null) {
            this.f539c = new C0500c0();
        }
        MenuItem menuItem2 = this.f539c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem m732a = C0108q.m732a(this.f538b, interfaceMenuItemC0446b1);
        this.f539c.put(interfaceMenuItemC0446b1, m732a);
        return m732a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu m593a(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0501c1)) {
            return subMenu;
        }
        InterfaceSubMenuC0501c1 interfaceSubMenuC0501c1 = (InterfaceSubMenuC0501c1) subMenu;
        if (this.f540d == null) {
            this.f540d = new C0500c0();
        }
        SubMenu subMenu2 = this.f540d.get(interfaceSubMenuC0501c1);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu m733a = C0108q.m733a(this.f538b, interfaceSubMenuC0501c1);
        this.f540d.put(interfaceSubMenuC0501c1, m733a);
        return m733a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m594a(int i) {
        Map<InterfaceMenuItemC0446b1, MenuItem> map = this.f539c;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0446b1> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m595b() {
        Map<InterfaceMenuItemC0446b1, MenuItem> map = this.f539c;
        if (map != null) {
            map.clear();
        }
        Map<InterfaceSubMenuC0501c1, SubMenu> map2 = this.f540d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m596b(int i) {
        Map<InterfaceMenuItemC0446b1, MenuItem> map = this.f539c;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0446b1> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
