package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public abstract class AbstractC0104m implements InterfaceC0110s, InterfaceC0106o, AdapterView.OnItemClickListener {

    /* renamed from: b */
    private Rect f666b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m712a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static C0098g m713a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0098g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0098g) listAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static boolean m714b(C0099h c0099h) {
        int size = c0099h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0099h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo605a(int i);

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public void mo580a(Context context, C0099h c0099h) {
    }

    /* renamed from: a */
    public void m715a(Rect rect) {
        this.f666b = rect;
    }

    /* renamed from: a */
    public abstract void mo606a(View view);

    /* renamed from: a */
    public abstract void mo607a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo608a(C0099h c0099h);

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: a */
    public boolean mo588a(C0099h c0099h, C0101j c0101j) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo610b(int i);

    /* renamed from: b */
    public abstract void mo611b(boolean z);

    @Override // androidx.appcompat.view.menu.InterfaceC0106o
    /* renamed from: b */
    public boolean mo591b(C0099h c0099h, C0101j c0101j) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo612c(int i);

    /* renamed from: c */
    public abstract void mo613c(boolean z);

    /* renamed from: e */
    protected boolean mo616e() {
        return true;
    }

    /* renamed from: f */
    public Rect m716f() {
        return this.f666b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m713a(listAdapter).f590b.m650a((MenuItem) listAdapter.getItem(i), this, mo616e() ? 0 : 4);
    }
}
