package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.InterfaceC0106o;
import androidx.appcompat.widget.C0176i0;
import androidx.appcompat.widget.InterfaceC0174h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C0447b2;
import p000.C3107q2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0096e extends AbstractC0104m implements InterfaceC0106o, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C */
    private static final int f542C = R$layout.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f543A;

    /* renamed from: B */
    boolean f544B;

    /* renamed from: c */
    private final Context f545c;

    /* renamed from: d */
    private final int f546d;

    /* renamed from: e */
    private final int f547e;

    /* renamed from: f */
    private final int f548f;

    /* renamed from: g */
    private final boolean f549g;

    /* renamed from: h */
    final Handler f550h;

    /* renamed from: p */
    private View f558p;

    /* renamed from: q */
    View f559q;

    /* renamed from: s */
    private boolean f561s;

    /* renamed from: t */
    private boolean f562t;

    /* renamed from: u */
    private int f563u;

    /* renamed from: v */
    private int f564v;

    /* renamed from: x */
    private boolean f566x;

    /* renamed from: y */
    private InterfaceC0106o.a f567y;

    /* renamed from: z */
    ViewTreeObserver f568z;

    /* renamed from: i */
    private final List<C0099h> f551i = new ArrayList();

    /* renamed from: j */
    final List<d> f552j = new ArrayList();

    /* renamed from: k */
    final ViewTreeObserver.OnGlobalLayoutListener f553k = new a();

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f554l = new b();

    /* renamed from: m */
    private final InterfaceC0174h0 f555m = new c();

    /* renamed from: n */
    private int f556n = 0;

    /* renamed from: o */
    private int f557o = 0;

    /* renamed from: w */
    private boolean f565w = false;

    /* renamed from: r */
    private int f560r = m603h();

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0096e.this.mo615d() || ViewOnKeyListenerC0096e.this.f552j.size() <= 0 || ViewOnKeyListenerC0096e.this.f552j.get(0).f576a.m1005k()) {
                return;
            }
            View view = ViewOnKeyListenerC0096e.this.f559q;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0096e.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0096e.this.f552j.iterator();
            while (it.hasNext()) {
                it.next().f576a.mo604a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0096e.this.f568z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0096e.this.f568z = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0096e viewOnKeyListenerC0096e = ViewOnKeyListenerC0096e.this;
                viewOnKeyListenerC0096e.f568z.removeGlobalOnLayoutListener(viewOnKeyListenerC0096e.f553k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.e$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC0174h0 {

        /* renamed from: androidx.appcompat.view.menu.e$c$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ d f572b;

            /* renamed from: c */
            final /* synthetic */ MenuItem f573c;

            /* renamed from: d */
            final /* synthetic */ C0099h f574d;

            a(d dVar, MenuItem menuItem, C0099h c0099h) {
                this.f572b = dVar;
                this.f573c = menuItem;
                this.f574d = c0099h;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f572b;
                if (dVar != null) {
                    ViewOnKeyListenerC0096e.this.f544B = true;
                    dVar.f577b.m648a(false);
                    ViewOnKeyListenerC0096e.this.f544B = false;
                }
                if (this.f573c.isEnabled() && this.f573c.hasSubMenu()) {
                    this.f574d.m649a(this.f573c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0174h0
        /* renamed from: a */
        public void mo617a(C0099h c0099h, MenuItem menuItem) {
            ViewOnKeyListenerC0096e.this.f550h.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0096e.this.f552j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0099h == ViewOnKeyListenerC0096e.this.f552j.get(i).f577b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC0096e.this.f550h.postAtTime(new a(i2 < ViewOnKeyListenerC0096e.this.f552j.size() ? ViewOnKeyListenerC0096e.this.f552j.get(i2) : null, menuItem, c0099h), c0099h, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0174h0
        /* renamed from: b */
        public void mo618b(C0099h c0099h, MenuItem menuItem) {
            ViewOnKeyListenerC0096e.this.f550h.removeCallbacksAndMessages(c0099h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.e$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final C0176i0 f576a;

        /* renamed from: b */
        public final C0099h f577b;

        /* renamed from: c */
        public final int f578c;

        public d(C0176i0 c0176i0, C0099h c0099h, int i) {
            this.f576a = c0176i0;
            this.f577b = c0099h;
            this.f578c = i;
        }

        /* renamed from: a */
        public ListView m619a() {
            return this.f576a.mo609b();
        }
    }

    public ViewOnKeyListenerC0096e(Context context, View view, int i, int i2, boolean z) {
        this.f545c = context;
        this.f558p = view;
        this.f547e = i;
        this.f548f = i2;
        this.f549g = z;
        Resources resources = context.getResources();
        this.f546d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f550h = new Handler();
    }

    /* renamed from: a */
    private MenuItem m597a(C0099h c0099h, C0099h c0099h2) {
        int size = c0099h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0099h.getItem(i);
            if (item.hasSubMenu() && c0099h2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m598a(d dVar, C0099h c0099h) {
        C0098g c0098g;
        int i;
        int firstVisiblePosition;
        MenuItem m597a = m597a(dVar.f577b, c0099h);
        if (m597a == null) {
            return null;
        }
        ListView m619a = dVar.m619a();
        ListAdapter adapter = m619a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0098g = (C0098g) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0098g = (C0098g) adapter;
            i = 0;
        }
        int count = c0098g.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (m597a == c0098g.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - m619a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m619a.getChildCount()) {
            return m619a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: c */
    private int m599c(C0099h c0099h) {
        int size = this.f552j.size();
        for (int i = 0; i < size; i++) {
            if (c0099h == this.f552j.get(i).f577b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m600d(int i) {
        List<d> list = this.f552j;
        ListView m619a = list.get(list.size() - 1).m619a();
        int[] iArr = new int[2];
        m619a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f559q.getWindowVisibleDisplayFrame(rect);
        return this.f560r == 1 ? (iArr[0] + m619a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private void m601d(C0099h c0099h) {
        d dVar;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f545c);
        C0098g c0098g = new C0098g(c0099h, from, this.f549g, f542C);
        if (!mo615d() && this.f565w) {
            c0098g.m624a(true);
        } else if (mo615d()) {
            c0098g.m624a(AbstractC0104m.m714b(c0099h));
        }
        int m712a = AbstractC0104m.m712a(c0098g, null, this.f545c, this.f546d);
        C0176i0 m602g = m602g();
        m602g.mo986a((ListAdapter) c0098g);
        m602g.m989b(m712a);
        m602g.m992c(this.f557o);
        if (this.f552j.size() > 0) {
            List<d> list = this.f552j;
            dVar = list.get(list.size() - 1);
            view = m598a(dVar, c0099h);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            m602g.m1051c(false);
            m602g.m1049a((Object) null);
            int m600d = m600d(m712a);
            boolean z = m600d == 1;
            this.f560r = m600d;
            if (Build.VERSION.SDK_INT >= 26) {
                m602g.m984a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f558p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f557o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f558p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f557o & 5) == 5) {
                if (!z) {
                    m712a = view.getWidth();
                    i3 = i - m712a;
                }
                i3 = i + m712a;
            } else {
                if (z) {
                    m712a = view.getWidth();
                    i3 = i + m712a;
                }
                i3 = i - m712a;
            }
            m602g.m993d(i3);
            m602g.m990b(true);
            m602g.m1001h(i2);
        } else {
            if (this.f561s) {
                m602g.m993d(this.f563u);
            }
            if (this.f562t) {
                m602g.m1001h(this.f564v);
            }
            m602g.m982a(m716f());
        }
        this.f552j.add(new d(m602g, c0099h, this.f560r));
        m602g.mo604a();
        ListView mo609b = m602g.mo609b();
        mo609b.setOnKeyListener(this);
        if (dVar == null && this.f566x && c0099h.m670h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) mo609b, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0099h.m670h());
            mo609b.addHeaderView(frameLayout, null, false);
            m602g.mo604a();
        }
    }

    /* renamed from: g */
    private C0176i0 m602g() {
        C0176i0 c0176i0 = new C0176i0(this.f545c, null, this.f547e, this.f548f);
        c0176i0.m1048a(this.f555m);
        c0176i0.m985a((AdapterView.OnItemClickListener) this);
        c0176i0.m987a((PopupWindow.OnDismissListener) this);
        c0176i0.m984a(this.f558p);
        c0176i0.m992c(this.f557o);
        c0176i0.m988a(true);
        c0176i0.m995e(2);
        return c0176i0;
    }

    /* renamed from: h */
    private int m603h() {
        return C3107q2.m14919k(this.f558p) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: a */
    public void mo604a() {
        if (mo615d()) {
            return;
        }
        Iterator<C0099h> it = this.f551i.iterator();
        while (it.hasNext()) {
            m601d(it.next());
        }
        this.f551i.clear();
        View view = this.f558p;
        this.f559q = view;
        if (view != null) {
            boolean z = this.f568z == null;
            ViewTreeObserver viewTreeObserver = this.f559q.getViewTreeObserver();
            this.f568z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f553k);
            }
            this.f559q.addOnAttachStateChangeListener(this.f554l);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: a */
    public void mo605a(int i) {
        if (this.f556n != i) {
            this.f556n = i;
            this.f557o = C0447b2.m3270a(i, C3107q2.m14919k(this.f558p));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: a */
    public void mo606a(View view) {
        if (this.f558p != view) {
            this.f558p = view;
            this.f557o = C0447b2.m3270a(this.f556n, C3107q2.m14919k(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: a */
    public void mo607a(PopupWindow.OnDismissListener onDismissListener) {
        this.f543A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: a */
    public void mo608a(C0099h c0099h) {
        c0099h.m646a(this, this.f545c);
        if (mo615d()) {
            m601d(c0099h);
        } else {
            this.f551i.add(c0099h);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo582a(C0099h c0099h, boolean z) {
        int m599c = m599c(c0099h);
        if (m599c < 0) {
            return;
        }
        int i = m599c + 1;
        if (i < this.f552j.size()) {
            this.f552j.get(i).f577b.m648a(false);
        }
        d remove = this.f552j.remove(m599c);
        remove.f577b.m656b(this);
        if (this.f544B) {
            remove.f576a.m1050b((Object) null);
            remove.f576a.m981a(0);
        }
        remove.f576a.dismiss();
        int size = this.f552j.size();
        this.f560r = size > 0 ? this.f552j.get(size - 1).f578c : m603h();
        if (size != 0) {
            if (z) {
                this.f552j.get(0).f577b.m648a(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0106o.a aVar = this.f567y;
        if (aVar != null) {
            aVar.mo450a(c0099h, true);
        }
        ViewTreeObserver viewTreeObserver = this.f568z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f568z.removeGlobalOnLayoutListener(this.f553k);
            }
            this.f568z = null;
        }
        this.f559q.removeOnAttachStateChangeListener(this.f554l);
        this.f543A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo584a(InterfaceC0106o.a aVar) {
        this.f567y = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo585a(boolean z) {
        Iterator<d> it = this.f552j.iterator();
        while (it.hasNext()) {
            AbstractC0104m.m713a(it.next().m619a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public boolean mo589a(SubMenuC0112u subMenuC0112u) {
        for (d dVar : this.f552j) {
            if (subMenuC0112u == dVar.f577b) {
                dVar.m619a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0112u.hasVisibleItems()) {
            return false;
        }
        mo608a((C0099h) subMenuC0112u);
        InterfaceC0106o.a aVar = this.f567y;
        if (aVar != null) {
            aVar.mo451a(subMenuC0112u);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: b */
    public ListView mo609b() {
        if (this.f552j.isEmpty()) {
            return null;
        }
        return this.f552j.get(r0.size() - 1).m619a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: b */
    public void mo610b(int i) {
        this.f561s = true;
        this.f563u = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: b */
    public void mo611b(boolean z) {
        this.f565w = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: c */
    public void mo612c(int i) {
        this.f562t = true;
        this.f564v = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: c */
    public void mo613c(boolean z) {
        this.f566x = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: c */
    public boolean mo614c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: d */
    public boolean mo615d() {
        return this.f552j.size() > 0 && this.f552j.get(0).f576a.mo615d();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    public void dismiss() {
        int size = this.f552j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f552j.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f576a.mo615d()) {
                    dVar.f576a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0104m
    /* renamed from: e */
    protected boolean mo616e() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f552j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f552j.get(i);
            if (!dVar.f576a.mo615d()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f577b.m648a(false);
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
