package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.i0;
import defpackage.q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t extends m implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, o, View.OnKeyListener {
    private static final int w = R$layout.abc_popup_menu_item_layout;
    private final Context c;
    private final h d;
    private final g e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    final i0 j;
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private o.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean v;
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private int u = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!t.this.d() || t.this.j.k()) {
                return;
            }
            View view = t.this.o;
            if (view == null || !view.isShown()) {
                t.this.dismiss();
            } else {
                t.this.j.a();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = t.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    t.this.q = view.getViewTreeObserver();
                }
                t tVar = t.this;
                tVar.q.removeGlobalOnLayoutListener(tVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public t(Context context, h hVar, View view, int i, int i2, boolean z) {
        this.c = context;
        this.d = hVar;
        this.f = z;
        this.e = new g(hVar, LayoutInflater.from(context), this.f, w);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new i0(this.c, null, this.h, this.i);
        hVar.a(this, context);
    }

    private boolean g() {
        View view;
        if (d()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.a((PopupWindow.OnDismissListener) this);
        this.j.a((AdapterView.OnItemClickListener) this);
        this.j.a(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.a(view2);
        this.j.c(this.u);
        if (!this.s) {
            this.t = m.a(this.e, null, this.c, this.g);
            this.s = true;
        }
        this.j.b(this.t);
        this.j.e(2);
        this.j.a(f());
        this.j.a();
        ListView b2 = this.j.b();
        b2.setOnKeyListener(this);
        if (this.v && this.d.h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) b2, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.d.h());
            }
            frameLayout.setEnabled(false);
            b2.addHeaderView(frameLayout, null, false);
        }
        this.j.a((ListAdapter) this.e);
        this.j.a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.s
    public void a() {
        if (!g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(int i) {
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(View view) {
        this.n = view;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(h hVar) {
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(h hVar, boolean z) {
        if (hVar != this.d) {
            return;
        }
        dismiss();
        o.a aVar = this.p;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(o.a aVar) {
        this.p = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(boolean z) {
        this.s = false;
        g gVar = this.e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean a(u uVar) {
        if (uVar.hasVisibleItems()) {
            n nVar = new n(this.c, uVar, this.o, this.f, this.h, this.i);
            nVar.a(this.p);
            nVar.a(m.b(uVar));
            nVar.a(this.m);
            this.m = null;
            this.d.a(false);
            int g = this.j.g();
            int h = this.j.h();
            if ((Gravity.getAbsoluteGravity(this.u, q2.k(this.n)) & 7) == 5) {
                g += this.n.getWidth();
            }
            if (nVar.a(g, h)) {
                o.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.a(uVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.s
    public ListView b() {
        return this.j.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(int i) {
        this.j.d(i);
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(boolean z) {
        this.e.a(z);
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(int i) {
        this.j.h(i);
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean d() {
        return !this.r && this.j.d();
    }

    @Override // androidx.appcompat.view.menu.s
    public void dismiss() {
        if (d()) {
            this.j.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
