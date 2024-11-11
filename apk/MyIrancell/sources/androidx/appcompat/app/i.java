package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.l0;
import defpackage.h;
import defpackage.m;
import defpackage.n;
import defpackage.q2;
import defpackage.u2;
import defpackage.v2;
import defpackage.w2;
import defpackage.x2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final x2 A;
    Context a;
    private Context b;
    ActionBarOverlayLayout c;
    ActionBarContainer d;
    a0 e;
    ActionBarContextView f;
    View g;
    l0 h;
    private boolean i;
    d j;
    defpackage.h k;
    h.a l;
    private boolean m;
    private ArrayList<a.b> n;
    private boolean o;
    private int p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;
    n v;
    private boolean w;
    boolean x;
    final v2 y;
    final v2 z;

    /* loaded from: classes.dex */
    class a extends w2 {
        a() {
        }

        @Override // defpackage.v2
        public void b(View view) {
            View view2;
            i iVar = i.this;
            if (iVar.q && (view2 = iVar.g) != null) {
                view2.setTranslationY(0.0f);
                i.this.d.setTranslationY(0.0f);
            }
            i.this.d.setVisibility(8);
            i.this.d.setTransitioning(false);
            i iVar2 = i.this;
            iVar2.v = null;
            iVar2.m();
            ActionBarOverlayLayout actionBarOverlayLayout = i.this.c;
            if (actionBarOverlayLayout != null) {
                q2.B(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends w2 {
        b() {
        }

        @Override // defpackage.v2
        public void b(View view) {
            i iVar = i.this;
            iVar.v = null;
            iVar.d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements x2 {
        c() {
        }

        @Override // defpackage.x2
        public void a(View view) {
            ((View) i.this.d.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends defpackage.h implements h.a {
        private final Context d;
        private final androidx.appcompat.view.menu.h e;
        private h.a f;
        private WeakReference<View> g;

        public d(Context context, h.a aVar) {
            this.d = context;
            this.f = aVar;
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            hVar.c(1);
            this.e = hVar;
            hVar.a(this);
        }

        @Override // defpackage.h
        public void a() {
            i iVar = i.this;
            if (iVar.j != this) {
                return;
            }
            if (i.a(iVar.r, iVar.s, false)) {
                this.f.a(this);
            } else {
                i iVar2 = i.this;
                iVar2.k = this;
                iVar2.l = this.f;
            }
            this.f = null;
            i.this.f(false);
            i.this.f.a();
            i.this.e.h().sendAccessibilityEvent(32);
            i iVar3 = i.this;
            iVar3.c.setHideOnContentScrollEnabled(iVar3.x);
            i.this.j = null;
        }

        @Override // defpackage.h
        public void a(int i) {
            a((CharSequence) i.this.a.getResources().getString(i));
        }

        @Override // defpackage.h
        public void a(View view) {
            i.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void a(androidx.appcompat.view.menu.h hVar) {
            if (this.f == null) {
                return;
            }
            i();
            i.this.f.d();
        }

        @Override // defpackage.h
        public void a(CharSequence charSequence) {
            i.this.f.setSubtitle(charSequence);
        }

        @Override // defpackage.h
        public void a(boolean z) {
            super.a(z);
            i.this.f.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            h.a aVar = this.f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // defpackage.h
        public View b() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.h
        public void b(int i) {
            b(i.this.a.getResources().getString(i));
        }

        @Override // defpackage.h
        public void b(CharSequence charSequence) {
            i.this.f.setTitle(charSequence);
        }

        @Override // defpackage.h
        public Menu c() {
            return this.e;
        }

        @Override // defpackage.h
        public MenuInflater d() {
            return new m(this.d);
        }

        @Override // defpackage.h
        public CharSequence e() {
            return i.this.f.getSubtitle();
        }

        @Override // defpackage.h
        public CharSequence g() {
            return i.this.f.getTitle();
        }

        @Override // defpackage.h
        public void i() {
            if (i.this.j != this) {
                return;
            }
            this.e.s();
            try {
                this.f.a(this, this.e);
            } finally {
                this.e.r();
            }
        }

        @Override // defpackage.h
        public boolean j() {
            return i.this.f.b();
        }

        public boolean k() {
            this.e.s();
            try {
                return this.f.b(this, this.e);
            } finally {
                this.e.r();
            }
        }
    }

    public i(Activity activity, boolean z) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public i(Dialog dialog) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        b(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a0 a(View view) {
        if (view instanceof a0) {
            return (a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void b(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R$id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.e = a(view.findViewById(R$id.action_bar));
        this.f = (ActionBarContextView) view.findViewById(R$id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R$id.action_bar_container);
        this.d = actionBarContainer;
        a0 a0Var = this.e;
        if (a0Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(i.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = a0Var.i();
        boolean z = (this.e.k() & 4) != 0;
        if (z) {
            this.i = true;
        }
        defpackage.g a2 = defpackage.g.a(this.a);
        j(a2.a() || z);
        k(a2.f());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
            i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void k(boolean z) {
        this.o = z;
        if (z) {
            this.d.setTabContainer(null);
            this.e.a(this.h);
        } else {
            this.e.a((l0) null);
            this.d.setTabContainer(this.h);
        }
        boolean z2 = n() == 2;
        l0 l0Var = this.h;
        if (l0Var != null) {
            if (z2) {
                l0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    q2.B(actionBarOverlayLayout);
                }
            } else {
                l0Var.setVisibility(8);
            }
        }
        this.e.b(!this.o && z2);
        this.c.setHasNonEmbeddedTabs(!this.o && z2);
    }

    private void l(boolean z) {
        if (a(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            h(z);
            return;
        }
        if (this.u) {
            this.u = false;
            g(z);
        }
    }

    private void o() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            l(false);
        }
    }

    private boolean p() {
        return q2.x(this.d);
    }

    private void q() {
        if (this.t) {
            return;
        }
        this.t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        l(false);
    }

    @Override // androidx.appcompat.app.a
    public defpackage.h a(h.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.c();
        d dVar2 = new d(this.f.getContext(), aVar);
        if (!dVar2.k()) {
            return null;
        }
        this.j = dVar2;
        dVar2.i();
        this.f.a(dVar2);
        f(true);
        this.f.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.s) {
            this.s = false;
            l(true);
        }
    }

    public void a(float f) {
        q2.a(this.d, f);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(int i) {
        this.p = i;
    }

    public void a(int i, int i2) {
        int k = this.e.k();
        if ((i2 & 4) != 0) {
            this.i = true;
        }
        this.e.b((i & i2) | ((i2 ^ (-1)) & k));
    }

    @Override // androidx.appcompat.app.a
    public void a(Configuration configuration) {
        k(defpackage.g.a(this.a).f());
    }

    @Override // androidx.appcompat.app.a
    public void a(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        Menu c2;
        d dVar = this.j;
        if (dVar == null || (c2 = dVar.c()) == null) {
            return false;
        }
        c2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c2.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        n nVar = this.v;
        if (nVar != null) {
            nVar.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void b(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void b(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z) {
        if (this.i) {
            return;
        }
        d(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.s) {
            return;
        }
        this.s = true;
        l(true);
    }

    @Override // androidx.appcompat.app.a
    public void d(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void e(boolean z) {
        n nVar;
        this.w = z;
        if (z || (nVar = this.v) == null) {
            return;
        }
        nVar.a();
    }

    public void f(boolean z) {
        u2 a2;
        u2 a3;
        if (z) {
            q();
        } else {
            o();
        }
        if (!p()) {
            if (z) {
                this.e.a(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.a(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            a3 = this.e.a(4, 100L);
            a2 = this.f.a(0, 200L);
        } else {
            a2 = this.e.a(0, 200L);
            a3 = this.f.a(8, 100L);
        }
        n nVar = new n();
        nVar.a(a3, a2);
        nVar.c();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        a0 a0Var = this.e;
        if (a0Var == null || !a0Var.j()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public int g() {
        return this.e.k();
    }

    public void g(boolean z) {
        View view;
        n nVar = this.v;
        if (nVar != null) {
            nVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.b(null);
            return;
        }
        this.d.setAlpha(1.0f);
        this.d.setTransitioning(true);
        n nVar2 = new n();
        float f = -this.d.getHeight();
        if (z) {
            this.d.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        u2 a2 = q2.a(this.d);
        a2.b(f);
        a2.a(this.A);
        nVar2.a(a2);
        if (this.q && (view = this.g) != null) {
            u2 a3 = q2.a(view);
            a3.b(f);
            nVar2.a(a3);
        }
        nVar2.a(B);
        nVar2.a(250L);
        nVar2.a(this.y);
        this.v = nVar2;
        nVar2.c();
    }

    @Override // androidx.appcompat.app.a
    public Context h() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public void h(boolean z) {
        View view;
        View view2;
        n nVar = this.v;
        if (nVar != null) {
            nVar.a();
        }
        this.d.setVisibility(0);
        if (this.p == 0 && (this.w || z)) {
            this.d.setTranslationY(0.0f);
            float f = -this.d.getHeight();
            if (z) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.d.setTranslationY(f);
            n nVar2 = new n();
            u2 a2 = q2.a(this.d);
            a2.b(0.0f);
            a2.a(this.A);
            nVar2.a(a2);
            if (this.q && (view2 = this.g) != null) {
                view2.setTranslationY(f);
                u2 a3 = q2.a(this.g);
                a3.b(0.0f);
                nVar2.a(a3);
            }
            nVar2.a(C);
            nVar2.a(250L);
            nVar2.a(this.z);
            this.v = nVar2;
            nVar2.c();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.q && (view = this.g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            q2.B(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.a
    public void i() {
        if (this.r) {
            return;
        }
        this.r = true;
        l(false);
    }

    public void i(boolean z) {
        if (z && !this.c.i()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.x = z;
        this.c.setHideOnContentScrollEnabled(z);
    }

    public void j(boolean z) {
        this.e.a(z);
    }

    void m() {
        h.a aVar = this.l;
        if (aVar != null) {
            aVar.a(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public int n() {
        return this.e.l();
    }
}
