package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$drawable;
import androidx.appcompat.R$id;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.Toolbar;
import defpackage.q2;
import defpackage.u2;
import defpackage.w2;

/* loaded from: classes.dex */
public class u0 implements a0 {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        final androidx.appcompat.view.menu.a b;

        a() {
            this.b = new androidx.appcompat.view.menu.a(u0.this.a.getContext(), 0, R.id.home, 0, 0, u0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u0 u0Var = u0.this;
            Window.Callback callback = u0Var.l;
            if (callback == null || !u0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.b);
        }
    }

    /* loaded from: classes.dex */
    class b extends w2 {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i) {
            this.b = i;
        }

        @Override // defpackage.w2, defpackage.v2
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.v2
        public void b(View view) {
            if (this.a) {
                return;
            }
            u0.this.a.setVisibility(this.b);
        }

        @Override // defpackage.w2, defpackage.v2
        public void c(View view) {
            u0.this.a.setVisibility(0);
        }
    }

    public u0(Toolbar toolbar, boolean z) {
        this(toolbar, z, R$string.abc_action_bar_up_description, R$drawable.abc_ic_ab_back_material);
    }

    public u0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        t0 a2 = t0.a(toolbar.getContext(), null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        this.q = a2.b(R$styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a2.e(R$styleable.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                setTitle(e);
            }
            CharSequence e2 = a2.e(R$styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                b(e2);
            }
            Drawable b2 = a2.b(R$styleable.ActionBar_logo);
            if (b2 != null) {
                a(b2);
            }
            Drawable b3 = a2.b(R$styleable.ActionBar_icon);
            if (b3 != null) {
                setIcon(b3);
            }
            if (this.g == null && (drawable = this.q) != null) {
                b(drawable);
            }
            b(a2.d(R$styleable.ActionBar_displayOptions, 0));
            int g = a2.g(R$styleable.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(g, (ViewGroup) this.a, false));
                b(this.b | 16);
            }
            int f = a2.f(R$styleable.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = f;
                this.a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(R$styleable.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(R$styleable.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                this.a.a(Math.max(b4, 0), Math.max(b5, 0));
            }
            int g2 = a2.g(R$styleable.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.b(toolbar2.getContext(), g2);
            }
            int g3 = a2.g(R$styleable.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.a(toolbar3.getContext(), g3);
            }
            int g4 = a2.g(R$styleable.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.a.setPopupTheme(g4);
            }
        } else {
            this.b = o();
        }
        a2.a();
        d(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    private void c(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private int o() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    private void p() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void q() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void r() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.a0
    public u2 a(int i, long j) {
        u2 a2 = q2.a(this.a);
        a2.a(i == 0 ? 1.0f : 0.0f);
        a2.a(j);
        a2.a(new b(i));
        return a2;
    }

    @Override // androidx.appcompat.widget.a0
    public void a(int i) {
        this.a.setVisibility(i);
    }

    public void a(Drawable drawable) {
        this.f = drawable;
        r();
    }

    @Override // androidx.appcompat.widget.a0
    public void a(Menu menu, o.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.a(R$id.action_menu_presenter);
        }
        this.n.a(aVar);
        this.a.a((androidx.appcompat.view.menu.h) menu, this.n);
    }

    public void a(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    @Override // androidx.appcompat.widget.a0
    public void a(l0 l0Var) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = l0Var;
        if (l0Var == null || this.o != 2) {
            return;
        }
        this.a.addView(l0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.a = 8388691;
        l0Var.setAllowCollapse(true);
    }

    public void a(CharSequence charSequence) {
        this.k = charSequence;
        p();
    }

    @Override // androidx.appcompat.widget.a0
    public void a(boolean z) {
    }

    @Override // androidx.appcompat.widget.a0
    public boolean a() {
        return this.a.i();
    }

    @Override // androidx.appcompat.widget.a0
    public void b() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.a0
    public void b(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i2 & 3) != 0) {
                r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    toolbar = this.a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    public void b(Drawable drawable) {
        this.g = drawable;
        q();
    }

    public void b(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public void b(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.a0
    public void c(int i) {
        a(i != 0 ? defpackage.a.c(i(), i) : null);
    }

    @Override // androidx.appcompat.widget.a0
    public boolean c() {
        return this.a.h();
    }

    @Override // androidx.appcompat.widget.a0
    public void collapseActionView() {
        this.a.c();
    }

    public void d(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            e(this.p);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public boolean d() {
        return this.a.g();
    }

    public void e(int i) {
        a(i == 0 ? null : i().getString(i));
    }

    @Override // androidx.appcompat.widget.a0
    public boolean e() {
        return this.a.k();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean f() {
        return this.a.b();
    }

    @Override // androidx.appcompat.widget.a0
    public void g() {
        this.a.d();
    }

    @Override // androidx.appcompat.widget.a0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.a0
    public ViewGroup h() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.a0
    public Context i() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean j() {
        return this.a.f();
    }

    @Override // androidx.appcompat.widget.a0
    public int k() {
        return this.b;
    }

    @Override // androidx.appcompat.widget.a0
    public int l() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.a0
    public void m() {
    }

    @Override // androidx.appcompat.widget.a0
    public void n() {
    }

    @Override // androidx.appcompat.widget.a0
    public void setIcon(int i) {
        setIcon(i != 0 ? defpackage.a.c(i(), i) : null);
    }

    @Override // androidx.appcompat.widget.a0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        r();
    }

    @Override // androidx.appcompat.widget.a0
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        c(charSequence);
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        c(charSequence);
    }
}
