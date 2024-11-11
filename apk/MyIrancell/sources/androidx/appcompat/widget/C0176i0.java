package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0098g;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.view.menu.C0101j;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.i0 */
/* loaded from: classes.dex */
public class C0176i0 extends C0172g0 implements InterfaceC0174h0 {

    /* renamed from: K */
    private static Method f1086K;

    /* renamed from: J */
    private InterfaceC0174h0 f1087J;

    /* renamed from: androidx.appcompat.widget.i0$a */
    /* loaded from: classes.dex */
    public static class a extends C0164c0 {

        /* renamed from: p */
        final int f1088p;

        /* renamed from: q */
        final int f1089q;

        /* renamed from: r */
        private InterfaceC0174h0 f1090r;

        /* renamed from: s */
        private MenuItem f1091s;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1088p = 22;
                this.f1089q = 21;
            } else {
                this.f1088p = 21;
                this.f1089q = 22;
            }
        }

        @Override // androidx.appcompat.widget.C0164c0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1090r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0098g c0098g = (C0098g) adapter;
                C0101j c0101j = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0098g.getCount()) {
                    c0101j = c0098g.getItem(i2);
                }
                MenuItem menuItem = this.f1091s;
                if (menuItem != c0101j) {
                    C0099h m625b = c0098g.m625b();
                    if (menuItem != null) {
                        this.f1090r.mo618b(m625b, menuItem);
                    }
                    this.f1091s = c0101j;
                    if (c0101j != null) {
                        this.f1090r.mo617a(m625b, c0101j);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1088p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f1089q) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ((C0098g) getAdapter()).m625b().m648a(false);
            return true;
        }

        public void setHoverListener(InterfaceC0174h0 interfaceC0174h0) {
            this.f1090r = interfaceC0174h0;
        }

        @Override // androidx.appcompat.widget.C0164c0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f1086K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
    }

    public C0176i0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.appcompat.widget.C0172g0
    /* renamed from: a */
    C0164c0 mo980a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // androidx.appcompat.widget.InterfaceC0174h0
    /* renamed from: a */
    public void mo617a(C0099h c0099h, MenuItem menuItem) {
        InterfaceC0174h0 interfaceC0174h0 = this.f1087J;
        if (interfaceC0174h0 != null) {
            interfaceC0174h0.mo617a(c0099h, menuItem);
        }
    }

    /* renamed from: a */
    public void m1048a(InterfaceC0174h0 interfaceC0174h0) {
        this.f1087J = interfaceC0174h0;
    }

    /* renamed from: a */
    public void m1049a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1032F.setEnterTransition((Transition) obj);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0174h0
    /* renamed from: b */
    public void mo618b(C0099h c0099h, MenuItem menuItem) {
        InterfaceC0174h0 interfaceC0174h0 = this.f1087J;
        if (interfaceC0174h0 != null) {
            interfaceC0174h0.mo618b(c0099h, menuItem);
        }
    }

    /* renamed from: b */
    public void m1050b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1032F.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void m1051c(boolean z) {
        Method method = f1086K;
        if (method != null) {
            try {
                method.invoke(this.f1032F, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }
}
