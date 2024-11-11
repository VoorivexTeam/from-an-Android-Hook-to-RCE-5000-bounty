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
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.i0;
import defpackage.b2;
import defpackage.q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends m implements o, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = R$layout.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;
    private final Context c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    final Handler h;
    private View p;
    View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private o.a y;
    ViewTreeObserver z;
    private final List<h> i = new ArrayList();
    final List<d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final h0 m = new c();
    private int n = 0;
    private int o = 0;
    private boolean w = false;
    private int r = h();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!e.this.d() || e.this.j.size() <= 0 || e.this.j.get(0).a.k()) {
                return;
            }
            View view = e.this.q;
            if (view == null || !view.isShown()) {
                e.this.dismiss();
                return;
            }
            Iterator<d> it = e.this.j.iterator();
            while (it.hasNext()) {
                it.next().a.a();
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
            ViewTreeObserver viewTreeObserver = e.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    e.this.z = view.getViewTreeObserver();
                }
                e eVar = e.this;
                eVar.z.removeGlobalOnLayoutListener(eVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements h0 {

        /* loaded from: classes.dex */
        class a implements Runnable {
            final /* synthetic */ d b;
            final /* synthetic */ MenuItem c;
            final /* synthetic */ h d;

            a(d dVar, MenuItem menuItem, h hVar) {
                this.b = dVar;
                this.c = menuItem;
                this.d = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.b;
                if (dVar != null) {
                    e.this.B = true;
                    dVar.b.a(false);
                    e.this.B = false;
                }
                if (this.c.isEnabled() && this.c.hasSubMenu()) {
                    this.d.a(this.c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.h0
        public void a(h hVar, MenuItem menuItem) {
            e.this.h.removeCallbacksAndMessages(null);
            int size = e.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == e.this.j.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            e.this.h.postAtTime(new a(i2 < e.this.j.size() ? e.this.j.get(i2) : null, menuItem, hVar), hVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.h0
        public void b(h hVar, MenuItem menuItem) {
            e.this.h.removeCallbacksAndMessages(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        public final i0 a;
        public final h b;
        public final int c;

        public d(i0 i0Var, h hVar, int i) {
            this.a = i0Var;
            this.b = hVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.b();
        }
    }

    public e(Context context, View view, int i, int i2, boolean z) {
        this.c = context;
        this.p = view;
        this.e = i;
        this.f = i2;
        this.g = z;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    private MenuItem a(h hVar, h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(d dVar, h hVar) {
        g gVar;
        int i;
        int firstVisiblePosition;
        MenuItem a2 = a(dVar.b, hVar);
        if (a2 == null) {
            return null;
        }
        ListView a3 = dVar.a();
        ListAdapter adapter = a3.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (a2 == gVar.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a3.getChildCount()) {
            return a3.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int c(h hVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (hVar == this.j.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    private int d(int i) {
        List<d> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    private void d(h hVar) {
        d dVar;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.c);
        g gVar = new g(hVar, from, this.g, C);
        if (!d() && this.w) {
            gVar.a(true);
        } else if (d()) {
            gVar.a(m.b(hVar));
        }
        int a2 = m.a(gVar, null, this.c, this.d);
        i0 g = g();
        g.a((ListAdapter) gVar);
        g.b(a2);
        g.c(this.o);
        if (this.j.size() > 0) {
            List<d> list = this.j;
            dVar = list.get(list.size() - 1);
            view = a(dVar, hVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            g.c(false);
            g.a((Object) null);
            int d2 = d(a2);
            boolean z = d2 == 1;
            this.r = d2;
            if (Build.VERSION.SDK_INT >= 26) {
                g.a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                if (!z) {
                    a2 = view.getWidth();
                    i3 = i - a2;
                }
                i3 = i + a2;
            } else {
                if (z) {
                    a2 = view.getWidth();
                    i3 = i + a2;
                }
                i3 = i - a2;
            }
            g.d(i3);
            g.b(true);
            g.h(i2);
        } else {
            if (this.s) {
                g.d(this.u);
            }
            if (this.t) {
                g.h(this.v);
            }
            g.a(f());
        }
        this.j.add(new d(g, hVar, this.r));
        g.a();
        ListView b2 = g.b();
        b2.setOnKeyListener(this);
        if (dVar == null && this.x && hVar.h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) b2, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hVar.h());
            b2.addHeaderView(frameLayout, null, false);
            g.a();
        }
    }

    private i0 g() {
        i0 i0Var = new i0(this.c, null, this.e, this.f);
        i0Var.a(this.m);
        i0Var.a((AdapterView.OnItemClickListener) this);
        i0Var.a((PopupWindow.OnDismissListener) this);
        i0Var.a(this.p);
        i0Var.c(this.o);
        i0Var.a(true);
        i0Var.e(2);
        return i0Var;
    }

    private int h() {
        return q2.k(this.p) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.s
    public void a() {
        if (d()) {
            return;
        }
        Iterator<h> it = this.i.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = b2.a(i, q2.k(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = b2.a(this.n, q2.k(view));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(h hVar) {
        hVar.a(this, this.c);
        if (d()) {
            d(hVar);
        } else {
            this.i.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(h hVar, boolean z) {
        int c2 = c(hVar);
        if (c2 < 0) {
            return;
        }
        int i = c2 + 1;
        if (i < this.j.size()) {
            this.j.get(i).b.a(false);
        }
        d remove = this.j.remove(c2);
        remove.b.b(this);
        if (this.B) {
            remove.a.b((Object) null);
            remove.a.a(0);
        }
        remove.a.dismiss();
        int size = this.j.size();
        this.r = size > 0 ? this.j.get(size - 1).c : h();
        if (size != 0) {
            if (z) {
                this.j.get(0).b.a(false);
                return;
            }
            return;
        }
        dismiss();
        o.a aVar = this.y;
        if (aVar != null) {
            aVar.a(hVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(o.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(boolean z) {
        Iterator<d> it = this.j.iterator();
        while (it.hasNext()) {
            m.a(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean a(u uVar) {
        for (d dVar : this.j) {
            if (uVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        a((h) uVar);
        o.a aVar = this.y;
        if (aVar != null) {
            aVar.a(uVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.s
    public ListView b() {
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean d() {
        return this.j.size() > 0 && this.j.get(0).a.d();
    }

    @Override // androidx.appcompat.view.menu.s
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.j.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.d()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    protected boolean e() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.j.get(i);
            if (!dVar.a.d()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.a(false);
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
