package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.q;
import defpackage.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends ActionMode {
    final Context a;
    final h b;

    /* loaded from: classes.dex */
    public static class a implements h.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<l> c = new ArrayList<>();
        final i0<Menu, Menu> d = new i0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = q.a(this.b, (a1) menu);
            this.d.put(menu, a);
            return a;
        }

        @Override // h.a
        public void a(h hVar) {
            this.a.onDestroyActionMode(b(hVar));
        }

        @Override // h.a
        public boolean a(h hVar, Menu menu) {
            return this.a.onPrepareActionMode(b(hVar), a(menu));
        }

        @Override // h.a
        public boolean a(h hVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(b(hVar), q.a(this.b, (b1) menuItem));
        }

        public ActionMode b(h hVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                l lVar = this.c.get(i);
                if (lVar != null && lVar.b == hVar) {
                    return lVar;
                }
            }
            l lVar2 = new l(this.b, hVar);
            this.c.add(lVar2);
            return lVar2;
        }

        @Override // h.a
        public boolean b(h hVar, Menu menu) {
            return this.a.onCreateActionMode(b(hVar), a(menu));
        }
    }

    public l(Context context, h hVar) {
        this.a = context;
        this.b = hVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return q.a(this.a, (a1) this.b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }
}
