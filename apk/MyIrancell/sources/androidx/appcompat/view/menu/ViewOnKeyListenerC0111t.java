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
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.widget.C0176i0;
import p000.C3107q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.t */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0111t extends AbstractC0104m implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0106o, View.OnKeyListener {

    /* renamed from: w */
    private static final int f680w = R$layout.abc_popup_menu_item_layout;

    /* renamed from: c */
    private final Context f681c;

    /* renamed from: d */
    private final C0099h f682d;

    /* renamed from: e */
    private final C0098g f683e;

    /* renamed from: f */
    private final boolean f684f;

    /* renamed from: g */
    private final int f685g;

    /* renamed from: h */
    private final int f686h;

    /* renamed from: i */
    private final int f687i;

    /* renamed from: j */
    final C0176i0 f688j;

    /* renamed from: m */
    private PopupWindow.OnDismissListener f691m;

    /* renamed from: n */
    private View f692n;

    /* renamed from: o */
    View f693o;

    /* renamed from: p */
    private InterfaceC0106o.a f694p;

    /* renamed from: q */
    ViewTreeObserver f695q;

    /* renamed from: r */
    private boolean f696r;

    /* renamed from: s */
    private boolean f697s;

    /* renamed from: t */
    private int f698t;

    /* renamed from: v */
    private boolean f700v;

    /* renamed from: k */
    final ViewTreeObserver.OnGlobalLayoutListener f689k = new a();

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f690l = new b();

    /* renamed from: u */
    private int f699u = 0;

    /* renamed from: androidx.appcompat.view.menu.t$a */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0111t.this.mo615d() || ViewOnKeyListenerC0111t.this.f688j.m1005k()) {
                return;
            }
            View view = ViewOnKeyListenerC0111t.this.f693o;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0111t.this.dismiss();
            } else {
                ViewOnKeyListenerC0111t.this.f688j.mo604a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.t$b */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0111t.this.f695q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0111t.this.f695q = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0111t viewOnKeyListenerC0111t = ViewOnKeyListenerC0111t.this;
                viewOnKeyListenerC0111t.f695q.removeGlobalOnLayoutListener(viewOnKeyListenerC0111t.f689k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0111t(Context context, C0099h c0099h, View view, int i, int i2, boolean z) {
        this.f681c = context;
        this.f682d = c0099h;
        this.f684f = z;
        this.f683e = new C0098g(c0099h, LayoutInflater.from(context), this.f684f, f680w);
        this.f686h = i;
        this.f687i = i2;
        Resources resources = context.getResources();
        this.f685g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f692n = view;
        this.f688j = new C0176i0(this.f681c, null, this.f686h, this.f687i);
        c0099h.m646a(this, context);
    }

    /* renamed from: g */
    private boolean m734g() {
        View view;
        if (mo615d()) {
            return true;
        }
        if (this.f696r || (view = this.f692n) == null) {
            return false;
        }
        this.f693o = view;
        this.f688j.m987a((PopupWindow.OnDismissListener) this);
        this.f688j.m985a((AdapterView.OnItemClickListener) this);
        this.f688j.m988a(true);
        View view2 = this.f693o;
        boolean z = this.f695q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f695q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f689k);
        }
        view2.addOnAttachStateChangeListener(this.f690l);
        this.f688j.m984a(view2);
        this.f688j.m992c(this.f699u);
        if (!this.f697s) {
            this.f698t = AbstractC0104m.m712a(this.f683e, null, this.f681c, this.f685g);
            this.f697s = true;
        }
        this.f688j.m989b(this.f698t);
        this.f688j.m995e(2);
        this.f688j.m982a(m716f());
        this.f688j.mo604a();
        ListView mo609b = this.f688j.mo609b();
        mo609b.setOnKeyListener(this);
        if (this.f700v && this.f682d.m670h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f681c).inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) mo609b, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f682d.m670h());
            }
            frameLayout.setEnabled(false);
            mo609b.addHeaderView(frameLayout, null, false);
        }
        this.f688j.mo986a((ListAdapter) this.f683e);
        this.f688j.mo604a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: a */
    public void mo604a() {
        if (!m734g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: a */
    public void mo605a(int i) {
        this.f699u = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: a */
    public void mo606a(View view) {
        this.f692n = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: a */
    public void mo607a(PopupWindow.OnDismissListener onDismissListener) {
        this.f691m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: a */
    public void mo608a(C0099h c0099h) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo582a(C0099h c0099h, boolean z) {
        if (c0099h != this.f682d) {
            return;
        }
        dismiss();
        InterfaceC0106o.a aVar = this.f694p;
        if (aVar != null) {
            aVar.mo450a(c0099h, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo584a(InterfaceC0106o.a aVar) {
        this.f694p = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo585a(boolean z) {
        this.f697s = false;
        C0098g c0098g = this.f683e;
        if (c0098g != null) {
            c0098g.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public boolean mo589a(SubMenuC0112u subMenuC0112u) {
        if (subMenuC0112u.hasVisibleItems()) {
            C0105n c0105n = new C0105n(this.f681c, subMenuC0112u, this.f693o, this.f684f, this.f686h, this.f687i);
            c0105n.m723a(this.f694p);
            c0105n.m724a(AbstractC0104m.m714b(subMenuC0112u));
            c0105n.m722a(this.f691m);
            this.f691m = null;
            this.f682d.m648a(false);
            int m998g = this.f688j.m998g();
            int m1000h = this.f688j.m1000h();
            if ((Gravity.getAbsoluteGravity(this.f699u, C3107q2.m14919k(this.f692n)) & 7) == 5) {
                m998g += this.f692n.getWidth();
            }
            if (c0105n.m725a(m998g, m1000h)) {
                InterfaceC0106o.a aVar = this.f694p;
                if (aVar == null) {
                    return true;
                }
                aVar.mo451a(subMenuC0112u);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: b */
    public ListView mo609b() {
        return this.f688j.mo609b();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: b */
    public void mo610b(int i) {
        this.f688j.m993d(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: b */
    public void mo611b(boolean z) {
        this.f683e.m624a(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: c */
    public void mo612c(int i) {
        this.f688j.m1001h(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: c */
    public void mo613c(boolean z) {
        this.f700v = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: c */
    public boolean mo614c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: d */
    public boolean mo615d() {
        return !this.f696r && this.f688j.mo615d();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    public void dismiss() {
        if (mo615d()) {
            this.f688j.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f696r = true;
        this.f682d.close();
        ViewTreeObserver viewTreeObserver = this.f695q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f695q = this.f693o.getViewTreeObserver();
            }
            this.f695q.removeGlobalOnLayoutListener(this.f689k);
            this.f695q = null;
        }
        this.f693o.removeOnAttachStateChangeListener(this.f690l);
        PopupWindow.OnDismissListener onDismissListener = this.f691m;
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
