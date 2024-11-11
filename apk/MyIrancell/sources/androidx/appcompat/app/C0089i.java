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
import androidx.appcompat.app.AbstractC0081a;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0182l0;
import androidx.appcompat.widget.InterfaceC0159a0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000.AbstractC2532h;
import p000.C2492g;
import p000.C2916m;
import p000.C2962n;
import p000.C3107q2;
import p000.C3284u2;
import p000.C3382w2;
import p000.InterfaceC3328v2;
import p000.InterfaceC3420x2;

/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes.dex */
public class C0089i extends AbstractC0081a implements ActionBarOverlayLayout.InterfaceC0118d {

    /* renamed from: B */
    private static final Interpolator f442B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f443C = new DecelerateInterpolator();

    /* renamed from: A */
    final InterfaceC3420x2 f444A;

    /* renamed from: a */
    Context f445a;

    /* renamed from: b */
    private Context f446b;

    /* renamed from: c */
    ActionBarOverlayLayout f447c;

    /* renamed from: d */
    ActionBarContainer f448d;

    /* renamed from: e */
    InterfaceC0159a0 f449e;

    /* renamed from: f */
    ActionBarContextView f450f;

    /* renamed from: g */
    View f451g;

    /* renamed from: h */
    C0182l0 f452h;

    /* renamed from: i */
    private boolean f453i;

    /* renamed from: j */
    d f454j;

    /* renamed from: k */
    AbstractC2532h f455k;

    /* renamed from: l */
    AbstractC2532h.a f456l;

    /* renamed from: m */
    private boolean f457m;

    /* renamed from: n */
    private ArrayList<AbstractC0081a.b> f458n;

    /* renamed from: o */
    private boolean f459o;

    /* renamed from: p */
    private int f460p;

    /* renamed from: q */
    boolean f461q;

    /* renamed from: r */
    boolean f462r;

    /* renamed from: s */
    boolean f463s;

    /* renamed from: t */
    private boolean f464t;

    /* renamed from: u */
    private boolean f465u;

    /* renamed from: v */
    C2962n f466v;

    /* renamed from: w */
    private boolean f467w;

    /* renamed from: x */
    boolean f468x;

    /* renamed from: y */
    final InterfaceC3328v2 f469y;

    /* renamed from: z */
    final InterfaceC3328v2 f470z;

    /* renamed from: androidx.appcompat.app.i$a */
    /* loaded from: classes.dex */
    class a extends C3382w2 {
        a() {
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: b */
        public void mo448b(View view) {
            View view2;
            C0089i c0089i = C0089i.this;
            if (c0089i.f461q && (view2 = c0089i.f451g) != null) {
                view2.setTranslationY(0.0f);
                C0089i.this.f448d.setTranslationY(0.0f);
            }
            C0089i.this.f448d.setVisibility(8);
            C0089i.this.f448d.setTransitioning(false);
            C0089i c0089i2 = C0089i.this;
            c0089i2.f466v = null;
            c0089i2.m537m();
            ActionBarOverlayLayout actionBarOverlayLayout = C0089i.this.f447c;
            if (actionBarOverlayLayout != null) {
                C3107q2.m14878B(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.i$b */
    /* loaded from: classes.dex */
    class b extends C3382w2 {
        b() {
        }

        @Override // p000.InterfaceC3328v2
        /* renamed from: b */
        public void mo448b(View view) {
            C0089i c0089i = C0089i.this;
            c0089i.f466v = null;
            c0089i.f448d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.i$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC3420x2 {
        c() {
        }

        @Override // p000.InterfaceC3420x2
        /* renamed from: a */
        public void mo539a(View view) {
            ((View) C0089i.this.f448d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.i$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC2532h implements C0099h.a {

        /* renamed from: d */
        private final Context f474d;

        /* renamed from: e */
        private final C0099h f475e;

        /* renamed from: f */
        private AbstractC2532h.a f476f;

        /* renamed from: g */
        private WeakReference<View> f477g;

        public d(Context context, AbstractC2532h.a aVar) {
            this.f474d = context;
            this.f476f = aVar;
            C0099h c0099h = new C0099h(context);
            c0099h.m659c(1);
            this.f475e = c0099h;
            c0099h.mo644a(this);
        }

        @Override // p000.AbstractC2532h
        /* renamed from: a */
        public void mo540a() {
            C0089i c0089i = C0089i.this;
            if (c0089i.f454j != this) {
                return;
            }
            if (C0089i.m517a(c0089i.f462r, c0089i.f463s, false)) {
                this.f476f.mo452a(this);
            } else {
                C0089i c0089i2 = C0089i.this;
                c0089i2.f455k = this;
                c0089i2.f456l = this.f476f;
            }
            this.f476f = null;
            C0089i.this.m532f(false);
            C0089i.this.f450f.m740a();
            C0089i.this.f449e.mo913h().sendAccessibilityEvent(32);
            C0089i c0089i3 = C0089i.this;
            c0089i3.f447c.setHideOnContentScrollEnabled(c0089i3.f468x);
            C0089i.this.f454j = null;
        }

        @Override // p000.AbstractC2532h
        /* renamed from: a */
        public void mo541a(int i) {
            mo543a((CharSequence) C0089i.this.f445a.getResources().getString(i));
        }

        @Override // p000.AbstractC2532h
        /* renamed from: a */
        public void mo542a(View view) {
            C0089i.this.f450f.setCustomView(view);
            this.f477g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.C0099h.a
        /* renamed from: a */
        public void mo401a(C0099h c0099h) {
            if (this.f476f == null) {
                return;
            }
            mo552i();
            C0089i.this.f450f.m744d();
        }

        @Override // p000.AbstractC2532h
        /* renamed from: a */
        public void mo543a(CharSequence charSequence) {
            C0089i.this.f450f.setSubtitle(charSequence);
        }

        @Override // p000.AbstractC2532h
        /* renamed from: a */
        public void mo544a(boolean z) {
            super.mo544a(z);
            C0089i.this.f450f.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.C0099h.a
        /* renamed from: a */
        public boolean mo406a(C0099h c0099h, MenuItem menuItem) {
            AbstractC2532h.a aVar = this.f476f;
            if (aVar != null) {
                return aVar.mo454a(this, menuItem);
            }
            return false;
        }

        @Override // p000.AbstractC2532h
        /* renamed from: b */
        public View mo545b() {
            WeakReference<View> weakReference = this.f477g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p000.AbstractC2532h
        /* renamed from: b */
        public void mo546b(int i) {
            mo547b(C0089i.this.f445a.getResources().getString(i));
        }

        @Override // p000.AbstractC2532h
        /* renamed from: b */
        public void mo547b(CharSequence charSequence) {
            C0089i.this.f450f.setTitle(charSequence);
        }

        @Override // p000.AbstractC2532h
        /* renamed from: c */
        public Menu mo548c() {
            return this.f475e;
        }

        @Override // p000.AbstractC2532h
        /* renamed from: d */
        public MenuInflater mo549d() {
            return new C2916m(this.f474d);
        }

        @Override // p000.AbstractC2532h
        /* renamed from: e */
        public CharSequence mo550e() {
            return C0089i.this.f450f.getSubtitle();
        }

        @Override // p000.AbstractC2532h
        /* renamed from: g */
        public CharSequence mo551g() {
            return C0089i.this.f450f.getTitle();
        }

        @Override // p000.AbstractC2532h
        /* renamed from: i */
        public void mo552i() {
            if (C0089i.this.f454j != this) {
                return;
            }
            this.f475e.m681s();
            try {
                this.f476f.mo453a(this, this.f475e);
            } finally {
                this.f475e.m680r();
            }
        }

        @Override // p000.AbstractC2532h
        /* renamed from: j */
        public boolean mo553j() {
            return C0089i.this.f450f.m742b();
        }

        /* renamed from: k */
        public boolean m554k() {
            this.f475e.m681s();
            try {
                return this.f476f.mo455b(this, this.f475e);
            } finally {
                this.f475e.m680r();
            }
        }
    }

    public C0089i(Activity activity, boolean z) {
        new ArrayList();
        this.f458n = new ArrayList<>();
        this.f460p = 0;
        this.f461q = true;
        this.f465u = true;
        this.f469y = new a();
        this.f470z = new b();
        this.f444A = new c();
        View decorView = activity.getWindow().getDecorView();
        m518b(decorView);
        if (z) {
            return;
        }
        this.f451g = decorView.findViewById(R.id.content);
    }

    public C0089i(Dialog dialog) {
        new ArrayList();
        this.f458n = new ArrayList<>();
        this.f460p = 0;
        this.f461q = true;
        this.f465u = true;
        this.f469y = new a();
        this.f470z = new b();
        this.f444A = new c();
        m518b(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private InterfaceC0159a0 m516a(View view) {
        if (view instanceof InterfaceC0159a0) {
            return (InterfaceC0159a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m517a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: b */
    private void m518b(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R$id.decor_content_parent);
        this.f447c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f449e = m516a(view.findViewById(R$id.action_bar));
        this.f450f = (ActionBarContextView) view.findViewById(R$id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R$id.action_bar_container);
        this.f448d = actionBarContainer;
        InterfaceC0159a0 interfaceC0159a0 = this.f449e;
        if (interfaceC0159a0 == null || this.f450f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0089i.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f445a = interfaceC0159a0.mo914i();
        boolean z = (this.f449e.mo916k() & 4) != 0;
        if (z) {
            this.f453i = true;
        }
        C2492g m11848a = C2492g.m11848a(this.f445a);
        m536j(m11848a.m11849a() || z);
        m519k(m11848a.m11854f());
        TypedArray obtainStyledAttributes = this.f445a.obtainStyledAttributes(null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
            m535i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            m525a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m519k(boolean z) {
        this.f459o = z;
        if (z) {
            this.f448d.setTabContainer(null);
            this.f449e.mo901a(this.f452h);
        } else {
            this.f449e.mo901a((C0182l0) null);
            this.f448d.setTabContainer(this.f452h);
        }
        boolean z2 = m538n() == 2;
        C0182l0 c0182l0 = this.f452h;
        if (c0182l0 != null) {
            if (z2) {
                c0182l0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f447c;
                if (actionBarOverlayLayout != null) {
                    C3107q2.m14878B(actionBarOverlayLayout);
                }
            } else {
                c0182l0.setVisibility(8);
            }
        }
        this.f449e.mo906b(!this.f459o && z2);
        this.f447c.setHasNonEmbeddedTabs(!this.f459o && z2);
    }

    /* renamed from: l */
    private void m520l(boolean z) {
        if (m517a(this.f462r, this.f463s, this.f464t)) {
            if (this.f465u) {
                return;
            }
            this.f465u = true;
            m534h(z);
            return;
        }
        if (this.f465u) {
            this.f465u = false;
            m533g(z);
        }
    }

    /* renamed from: o */
    private void m521o() {
        if (this.f464t) {
            this.f464t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f447c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m520l(false);
        }
    }

    /* renamed from: p */
    private boolean m522p() {
        return C3107q2.m14932x(this.f448d);
    }

    /* renamed from: q */
    private void m523q() {
        if (this.f464t) {
            return;
        }
        this.f464t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f447c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m520l(false);
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: a */
    public AbstractC2532h mo463a(AbstractC2532h.a aVar) {
        d dVar = this.f454j;
        if (dVar != null) {
            dVar.mo540a();
        }
        this.f447c.setHideOnContentScrollEnabled(false);
        this.f450f.m743c();
        d dVar2 = new d(this.f450f.getContext(), aVar);
        if (!dVar2.m554k()) {
            return null;
        }
        this.f454j = dVar2;
        dVar2.mo552i();
        this.f450f.m741a(dVar2);
        m532f(true);
        this.f450f.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0118d
    /* renamed from: a */
    public void mo524a() {
        if (this.f463s) {
            this.f463s = false;
            m520l(true);
        }
    }

    /* renamed from: a */
    public void m525a(float f) {
        C3107q2.m14884a(this.f448d, f);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0118d
    /* renamed from: a */
    public void mo526a(int i) {
        this.f460p = i;
    }

    /* renamed from: a */
    public void m527a(int i, int i2) {
        int mo916k = this.f449e.mo916k();
        if ((i2 & 4) != 0) {
            this.f453i = true;
        }
        this.f449e.mo905b((i & i2) | ((i2 ^ (-1)) & mo916k));
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: a */
    public void mo464a(Configuration configuration) {
        m519k(C2492g.m11848a(this.f445a).m11854f());
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: a */
    public void mo465a(CharSequence charSequence) {
        this.f449e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0118d
    /* renamed from: a */
    public void mo528a(boolean z) {
        this.f461q = z;
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: a */
    public boolean mo466a(int i, KeyEvent keyEvent) {
        Menu mo548c;
        d dVar = this.f454j;
        if (dVar == null || (mo548c = dVar.mo548c()) == null) {
            return false;
        }
        mo548c.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo548c.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0118d
    /* renamed from: b */
    public void mo529b() {
        C2962n c2962n = this.f466v;
        if (c2962n != null) {
            c2962n.m14213a();
            this.f466v = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: b */
    public void mo468b(CharSequence charSequence) {
        this.f449e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: b */
    public void mo469b(boolean z) {
        if (z == this.f457m) {
            return;
        }
        this.f457m = z;
        int size = this.f458n.size();
        for (int i = 0; i < size; i++) {
            this.f458n.get(i).m481a(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0118d
    /* renamed from: c */
    public void mo530c() {
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: c */
    public void mo470c(boolean z) {
        if (this.f453i) {
            return;
        }
        mo471d(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0118d
    /* renamed from: d */
    public void mo531d() {
        if (this.f463s) {
            return;
        }
        this.f463s = true;
        m520l(true);
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: d */
    public void mo471d(boolean z) {
        m527a(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: e */
    public void mo472e(boolean z) {
        C2962n c2962n;
        this.f467w = z;
        if (z || (c2962n = this.f466v) == null) {
            return;
        }
        c2962n.m14213a();
    }

    /* renamed from: f */
    public void m532f(boolean z) {
        C3284u2 mo898a;
        C3284u2 a2;
        if (z) {
            m523q();
        } else {
            m521o();
        }
        if (!m522p()) {
            if (z) {
                this.f449e.mo899a(4);
                this.f450f.setVisibility(0);
                return;
            } else {
                this.f449e.mo899a(0);
                this.f450f.setVisibility(8);
                return;
            }
        }
        if (z) {
            a2 = this.f449e.mo898a(4, 100L);
            mo898a = this.f450f.m895a(0, 200L);
        } else {
            mo898a = this.f449e.mo898a(0, 200L);
            a2 = this.f450f.m895a(8, 100L);
        }
        C2962n c2962n = new C2962n();
        c2962n.m14211a(a2, mo898a);
        c2962n.m14215c();
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: f */
    public boolean mo474f() {
        InterfaceC0159a0 interfaceC0159a0 = this.f449e;
        if (interfaceC0159a0 == null || !interfaceC0159a0.mo915j()) {
            return false;
        }
        this.f449e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: g */
    public int mo475g() {
        return this.f449e.mo916k();
    }

    /* renamed from: g */
    public void m533g(boolean z) {
        View view;
        C2962n c2962n = this.f466v;
        if (c2962n != null) {
            c2962n.m14213a();
        }
        if (this.f460p != 0 || (!this.f467w && !z)) {
            this.f469y.mo448b(null);
            return;
        }
        this.f448d.setAlpha(1.0f);
        this.f448d.setTransitioning(true);
        C2962n c2962n2 = new C2962n();
        float f = -this.f448d.getHeight();
        if (z) {
            this.f448d.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        C3284u2 m14882a = C3107q2.m14882a(this.f448d);
        m14882a.m15711b(f);
        m14882a.m15708a(this.f444A);
        c2962n2.m14210a(m14882a);
        if (this.f461q && (view = this.f451g) != null) {
            C3284u2 m14882a2 = C3107q2.m14882a(view);
            m14882a2.m15711b(f);
            c2962n2.m14210a(m14882a2);
        }
        c2962n2.m14209a(f442B);
        c2962n2.m14208a(250L);
        c2962n2.m14212a(this.f469y);
        this.f466v = c2962n2;
        c2962n2.m14215c();
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: h */
    public Context mo476h() {
        if (this.f446b == null) {
            TypedValue typedValue = new TypedValue();
            this.f445a.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f446b = new ContextThemeWrapper(this.f445a, i);
            } else {
                this.f446b = this.f445a;
            }
        }
        return this.f446b;
    }

    /* renamed from: h */
    public void m534h(boolean z) {
        View view;
        View view2;
        C2962n c2962n = this.f466v;
        if (c2962n != null) {
            c2962n.m14213a();
        }
        this.f448d.setVisibility(0);
        if (this.f460p == 0 && (this.f467w || z)) {
            this.f448d.setTranslationY(0.0f);
            float f = -this.f448d.getHeight();
            if (z) {
                this.f448d.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.f448d.setTranslationY(f);
            C2962n c2962n2 = new C2962n();
            C3284u2 m14882a = C3107q2.m14882a(this.f448d);
            m14882a.m15711b(0.0f);
            m14882a.m15708a(this.f444A);
            c2962n2.m14210a(m14882a);
            if (this.f461q && (view2 = this.f451g) != null) {
                view2.setTranslationY(f);
                C3284u2 m14882a2 = C3107q2.m14882a(this.f451g);
                m14882a2.m15711b(0.0f);
                c2962n2.m14210a(m14882a2);
            }
            c2962n2.m14209a(f443C);
            c2962n2.m14208a(250L);
            c2962n2.m14212a(this.f470z);
            this.f466v = c2962n2;
            c2962n2.m14215c();
        } else {
            this.f448d.setAlpha(1.0f);
            this.f448d.setTranslationY(0.0f);
            if (this.f461q && (view = this.f451g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f470z.mo448b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f447c;
        if (actionBarOverlayLayout != null) {
            C3107q2.m14878B(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0081a
    /* renamed from: i */
    public void mo477i() {
        if (this.f462r) {
            return;
        }
        this.f462r = true;
        m520l(false);
    }

    /* renamed from: i */
    public void m535i(boolean z) {
        if (z && !this.f447c.m763i()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f468x = z;
        this.f447c.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: j */
    public void m536j(boolean z) {
        this.f449e.mo902a(z);
    }

    /* renamed from: m */
    void m537m() {
        AbstractC2532h.a aVar = this.f456l;
        if (aVar != null) {
            aVar.mo452a(this.f455k);
            this.f455k = null;
            this.f456l = null;
        }
    }

    /* renamed from: n */
    public int m538n() {
        return this.f449e.mo917l();
    }
}
