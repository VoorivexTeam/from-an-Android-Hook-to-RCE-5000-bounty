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
import androidx.appcompat.view.menu.C0092a;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.widget.Toolbar;
import p000.C0000a;
import p000.C3107q2;
import p000.C3284u2;
import p000.C3382w2;

/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes.dex */
public class C0200u0 implements InterfaceC0159a0 {

    /* renamed from: a */
    Toolbar f1226a;

    /* renamed from: b */
    private int f1227b;

    /* renamed from: c */
    private View f1228c;

    /* renamed from: d */
    private View f1229d;

    /* renamed from: e */
    private Drawable f1230e;

    /* renamed from: f */
    private Drawable f1231f;

    /* renamed from: g */
    private Drawable f1232g;

    /* renamed from: h */
    private boolean f1233h;

    /* renamed from: i */
    CharSequence f1234i;

    /* renamed from: j */
    private CharSequence f1235j;

    /* renamed from: k */
    private CharSequence f1236k;

    /* renamed from: l */
    Window.Callback f1237l;

    /* renamed from: m */
    boolean f1238m;

    /* renamed from: n */
    private ActionMenuPresenter f1239n;

    /* renamed from: o */
    private int f1240o;

    /* renamed from: p */
    private int f1241p;

    /* renamed from: q */
    private Drawable f1242q;

    /* renamed from: androidx.appcompat.widget.u0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: b */
        final C0092a f1243b;

        a() {
            this.f1243b = new C0092a(C0200u0.this.f1226a.getContext(), 0, R.id.home, 0, 0, C0200u0.this.f1234i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0200u0 c0200u0 = C0200u0.this;
            Window.Callback callback = c0200u0.f1237l;
            if (callback == null || !c0200u0.f1238m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1243b);
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$b */
    /* loaded from: classes.dex */
    class b extends C3382w2 {

        /* renamed from: a */
        private boolean f1245a = false;

        /* renamed from: b */
        final /* synthetic */ int f1246b;

        b(int i) {
            this.f1246b = i;
        }

        @Override // p000.C3382w2, p000.InterfaceC3328v2
        /* renamed from: a */
        public void mo897a(View view) {
            this.f1245a = true;
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: b */
        public void mo448b(View view) {
            if (this.f1245a) {
                return;
            }
            C0200u0.this.f1226a.setVisibility(this.f1246b);
        }

        @Override // p000.C3382w2, p000.InterfaceC3328v2
        /* renamed from: c */
        public void mo449c(View view) {
            C0200u0.this.f1226a.setVisibility(0);
        }
    }

    public C0200u0(Toolbar toolbar, boolean z) {
        this(toolbar, z, R$string.abc_action_bar_up_description, R$drawable.abc_ic_ab_back_material);
    }

    public C0200u0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1240o = 0;
        this.f1241p = 0;
        this.f1226a = toolbar;
        this.f1234i = toolbar.getTitle();
        this.f1235j = toolbar.getSubtitle();
        this.f1233h = this.f1234i != null;
        this.f1232g = toolbar.getNavigationIcon();
        C0198t0 m1133a = C0198t0.m1133a(toolbar.getContext(), null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        this.f1242q = m1133a.m1142b(R$styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence m1148e = m1133a.m1148e(R$styleable.ActionBar_title);
            if (!TextUtils.isEmpty(m1148e)) {
                setTitle(m1148e);
            }
            CharSequence m1148e2 = m1133a.m1148e(R$styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m1148e2)) {
                m1167b(m1148e2);
            }
            Drawable m1142b = m1133a.m1142b(R$styleable.ActionBar_logo);
            if (m1142b != null) {
                m1163a(m1142b);
            }
            Drawable m1142b2 = m1133a.m1142b(R$styleable.ActionBar_icon);
            if (m1142b2 != null) {
                setIcon(m1142b2);
            }
            if (this.f1232g == null && (drawable = this.f1242q) != null) {
                m1166b(drawable);
            }
            mo905b(m1133a.m1145d(R$styleable.ActionBar_displayOptions, 0));
            int m1151g = m1133a.m1151g(R$styleable.ActionBar_customNavigationLayout, 0);
            if (m1151g != 0) {
                m1164a(LayoutInflater.from(this.f1226a.getContext()).inflate(m1151g, (ViewGroup) this.f1226a, false));
                mo905b(this.f1227b | 16);
            }
            int m1149f = m1133a.m1149f(R$styleable.ActionBar_height, 0);
            if (m1149f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1226a.getLayoutParams();
                layoutParams.height = m1149f;
                this.f1226a.setLayoutParams(layoutParams);
            }
            int m1141b = m1133a.m1141b(R$styleable.ActionBar_contentInsetStart, -1);
            int m1141b2 = m1133a.m1141b(R$styleable.ActionBar_contentInsetEnd, -1);
            if (m1141b >= 0 || m1141b2 >= 0) {
                this.f1226a.m873a(Math.max(m1141b, 0), Math.max(m1141b2, 0));
            }
            int m1151g2 = m1133a.m1151g(R$styleable.ActionBar_titleTextStyle, 0);
            if (m1151g2 != 0) {
                Toolbar toolbar2 = this.f1226a;
                toolbar2.m876b(toolbar2.getContext(), m1151g2);
            }
            int m1151g3 = m1133a.m1151g(R$styleable.ActionBar_subtitleTextStyle, 0);
            if (m1151g3 != 0) {
                Toolbar toolbar3 = this.f1226a;
                toolbar3.m874a(toolbar3.getContext(), m1151g3);
            }
            int m1151g4 = m1133a.m1151g(R$styleable.ActionBar_popupTheme, 0);
            if (m1151g4 != 0) {
                this.f1226a.setPopupTheme(m1151g4);
            }
        } else {
            this.f1227b = m1159o();
        }
        m1133a.m1138a();
        m1168d(i);
        this.f1236k = this.f1226a.getNavigationContentDescription();
        this.f1226a.setNavigationOnClickListener(new a());
    }

    /* renamed from: c */
    private void m1158c(CharSequence charSequence) {
        this.f1234i = charSequence;
        if ((this.f1227b & 8) != 0) {
            this.f1226a.setTitle(charSequence);
        }
    }

    /* renamed from: o */
    private int m1159o() {
        if (this.f1226a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1242q = this.f1226a.getNavigationIcon();
        return 15;
    }

    /* renamed from: p */
    private void m1160p() {
        if ((this.f1227b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1236k)) {
                this.f1226a.setNavigationContentDescription(this.f1241p);
            } else {
                this.f1226a.setNavigationContentDescription(this.f1236k);
            }
        }
    }

    /* renamed from: q */
    private void m1161q() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1227b & 4) != 0) {
            toolbar = this.f1226a;
            drawable = this.f1232g;
            if (drawable == null) {
                drawable = this.f1242q;
            }
        } else {
            toolbar = this.f1226a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: r */
    private void m1162r() {
        Drawable drawable;
        int i = this.f1227b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1231f) == null) {
            drawable = this.f1230e;
        }
        this.f1226a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: a */
    public C3284u2 mo898a(int i, long j) {
        C3284u2 m14882a = C3107q2.m14882a(this.f1226a);
        m14882a.m15704a(i == 0 ? 1.0f : 0.0f);
        m14882a.m15705a(j);
        m14882a.m15707a(new b(i));
        return m14882a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: a */
    public void mo899a(int i) {
        this.f1226a.setVisibility(i);
    }

    /* renamed from: a */
    public void m1163a(Drawable drawable) {
        this.f1231f = drawable;
        m1162r();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: a */
    public void mo900a(Menu menu, InterfaceC0106o.a aVar) {
        if (this.f1239n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1226a.getContext());
            this.f1239n = actionMenuPresenter;
            actionMenuPresenter.m579a(R$id.action_menu_presenter);
        }
        this.f1239n.mo584a(aVar);
        this.f1226a.m875a((C0099h) menu, this.f1239n);
    }

    /* renamed from: a */
    public void m1164a(View view) {
        View view2 = this.f1229d;
        if (view2 != null && (this.f1227b & 16) != 0) {
            this.f1226a.removeView(view2);
        }
        this.f1229d = view;
        if (view == null || (this.f1227b & 16) == 0) {
            return;
        }
        this.f1226a.addView(view);
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: a */
    public void mo901a(C0182l0 c0182l0) {
        View view = this.f1228c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1226a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1228c);
            }
        }
        this.f1228c = c0182l0;
        if (c0182l0 == null || this.f1240o != 2) {
            return;
        }
        this.f1226a.addView(c0182l0, 0);
        Toolbar.C0155e c0155e = (Toolbar.C0155e) this.f1228c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0155e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0155e).height = -2;
        c0155e.f412a = 8388691;
        c0182l0.setAllowCollapse(true);
    }

    /* renamed from: a */
    public void m1165a(CharSequence charSequence) {
        this.f1236k = charSequence;
        m1160p();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: a */
    public void mo902a(boolean z) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: a */
    public boolean mo903a() {
        return this.f1226a.m884i();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: b */
    public void mo904b() {
        this.f1238m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: b */
    public void mo905b(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1227b ^ i;
        this.f1227b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1160p();
                }
                m1161q();
            }
            if ((i2 & 3) != 0) {
                m1162r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1226a.setTitle(this.f1234i);
                    toolbar = this.f1226a;
                    charSequence = this.f1235j;
                } else {
                    charSequence = null;
                    this.f1226a.setTitle((CharSequence) null);
                    toolbar = this.f1226a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f1229d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1226a.addView(view);
            } else {
                this.f1226a.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public void m1166b(Drawable drawable) {
        this.f1232g = drawable;
        m1161q();
    }

    /* renamed from: b */
    public void m1167b(CharSequence charSequence) {
        this.f1235j = charSequence;
        if ((this.f1227b & 8) != 0) {
            this.f1226a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: b */
    public void mo906b(boolean z) {
        this.f1226a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: c */
    public void mo907c(int i) {
        m1163a(i != 0 ? C0000a.m4c(mo914i(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: c */
    public boolean mo908c() {
        return this.f1226a.m883h();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    public void collapseActionView() {
        this.f1226a.m878c();
    }

    /* renamed from: d */
    public void m1168d(int i) {
        if (i == this.f1241p) {
            return;
        }
        this.f1241p = i;
        if (TextUtils.isEmpty(this.f1226a.getNavigationContentDescription())) {
            m1169e(this.f1241p);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: d */
    public boolean mo909d() {
        return this.f1226a.m882g();
    }

    /* renamed from: e */
    public void m1169e(int i) {
        m1165a(i == 0 ? null : mo914i().getString(i));
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: e */
    public boolean mo910e() {
        return this.f1226a.m886k();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: f */
    public boolean mo911f() {
        return this.f1226a.m877b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: g */
    public void mo912g() {
        this.f1226a.m879d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    public CharSequence getTitle() {
        return this.f1226a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: h */
    public ViewGroup mo913h() {
        return this.f1226a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: i */
    public Context mo914i() {
        return this.f1226a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: j */
    public boolean mo915j() {
        return this.f1226a.m881f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: k */
    public int mo916k() {
        return this.f1227b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: l */
    public int mo917l() {
        return this.f1240o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: m */
    public void mo918m() {
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    /* renamed from: n */
    public void mo919n() {
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    public void setIcon(int i) {
        setIcon(i != 0 ? C0000a.m4c(mo914i(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    public void setIcon(Drawable drawable) {
        this.f1230e = drawable;
        m1162r();
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    public void setTitle(CharSequence charSequence) {
        this.f1233h = true;
        m1158c(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    public void setWindowCallback(Window.Callback callback) {
        this.f1237l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0159a0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1233h) {
            return;
        }
        m1158c(charSequence);
    }
}
