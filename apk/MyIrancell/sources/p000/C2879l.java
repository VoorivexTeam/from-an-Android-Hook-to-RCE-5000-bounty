package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0108q;
import java.util.ArrayList;
import p000.AbstractC2532h;

/* renamed from: l */
/* loaded from: classes.dex */
public class C2879l extends ActionMode {

    /* renamed from: a */
    final Context f11778a;

    /* renamed from: b */
    final AbstractC2532h f11779b;

    /* renamed from: l$a */
    /* loaded from: classes.dex */
    public static class a implements AbstractC2532h.a {

        /* renamed from: a */
        final ActionMode.Callback f11780a;

        /* renamed from: b */
        final Context f11781b;

        /* renamed from: c */
        final ArrayList<C2879l> f11782c = new ArrayList<>();

        /* renamed from: d */
        final C2573i0<Menu, Menu> f11783d = new C2573i0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f11781b = context;
            this.f11780a = callback;
        }

        /* renamed from: a */
        private Menu m13764a(Menu menu) {
            Menu menu2 = this.f11783d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu m731a = C0108q.m731a(this.f11781b, (InterfaceMenuC0002a1) menu);
            this.f11783d.put(menu, m731a);
            return m731a;
        }

        @Override // p000.AbstractC2532h.a
        /* renamed from: a */
        public void mo452a(AbstractC2532h abstractC2532h) {
            this.f11780a.onDestroyActionMode(m13765b(abstractC2532h));
        }

        @Override // p000.AbstractC2532h.a
        /* renamed from: a */
        public boolean mo453a(AbstractC2532h abstractC2532h, Menu menu) {
            return this.f11780a.onPrepareActionMode(m13765b(abstractC2532h), m13764a(menu));
        }

        @Override // p000.AbstractC2532h.a
        /* renamed from: a */
        public boolean mo454a(AbstractC2532h abstractC2532h, MenuItem menuItem) {
            return this.f11780a.onActionItemClicked(m13765b(abstractC2532h), C0108q.m732a(this.f11781b, (InterfaceMenuItemC0446b1) menuItem));
        }

        /* renamed from: b */
        public ActionMode m13765b(AbstractC2532h abstractC2532h) {
            int size = this.f11782c.size();
            for (int i = 0; i < size; i++) {
                C2879l c2879l = this.f11782c.get(i);
                if (c2879l != null && c2879l.f11779b == abstractC2532h) {
                    return c2879l;
                }
            }
            C2879l c2879l2 = new C2879l(this.f11781b, abstractC2532h);
            this.f11782c.add(c2879l2);
            return c2879l2;
        }

        @Override // p000.AbstractC2532h.a
        /* renamed from: b */
        public boolean mo455b(AbstractC2532h abstractC2532h, Menu menu) {
            return this.f11780a.onCreateActionMode(m13765b(abstractC2532h), m13764a(menu));
        }
    }

    public C2879l(Context context, AbstractC2532h abstractC2532h) {
        this.f11778a = context;
        this.f11779b = abstractC2532h;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f11779b.mo540a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f11779b.mo545b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return C0108q.m731a(this.f11778a, (InterfaceMenuC0002a1) this.f11779b.mo548c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f11779b.mo549d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f11779b.mo550e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f11779b.m12057f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f11779b.mo551g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f11779b.m12058h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f11779b.mo552i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f11779b.mo553j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f11779b.mo542a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f11779b.mo541a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f11779b.mo543a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f11779b.m12056a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f11779b.mo546b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f11779b.mo547b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f11779b.mo544a(z);
    }
}
