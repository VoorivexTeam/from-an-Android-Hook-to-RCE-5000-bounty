package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import defpackage.b1;
import defpackage.c0;
import defpackage.c1;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
abstract class c<T> extends d<T> {
    final Context b;
    private Map<b1, MenuItem> c;
    private Map<c1, SubMenu> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, T t) {
        super(t);
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b1)) {
            return menuItem;
        }
        b1 b1Var = (b1) menuItem;
        if (this.c == null) {
            this.c = new c0();
        }
        MenuItem menuItem2 = this.c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = q.a(this.b, b1Var);
        this.c.put(b1Var, a);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof c1)) {
            return subMenu;
        }
        c1 c1Var = (c1) subMenu;
        if (this.d == null) {
            this.d = new c0();
        }
        SubMenu subMenu2 = this.d.get(c1Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu a = q.a(this.b, c1Var);
        this.d.put(c1Var, a);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        Map<b1, MenuItem> map = this.c;
        if (map == null) {
            return;
        }
        Iterator<b1> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Map<b1, MenuItem> map = this.c;
        if (map != null) {
            map.clear();
        }
        Map<c1, SubMenu> map2 = this.d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        Map<b1, MenuItem> map = this.c;
        if (map == null) {
            return;
        }
        Iterator<b1> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
