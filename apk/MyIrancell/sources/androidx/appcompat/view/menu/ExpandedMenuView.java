package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0099h;
import androidx.appcompat.widget.C0198t0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0099h.b, InterfaceC0107p, AdapterView.OnItemClickListener {

    /* renamed from: d */
    private static final int[] f491d = {R.attr.background, R.attr.divider};

    /* renamed from: b */
    private C0099h f492b;

    /* renamed from: c */
    private int f493c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0198t0 m1133a = C0198t0.m1133a(context, attributeSet, f491d, i, 0);
        if (m1133a.m1152g(0)) {
            setBackgroundDrawable(m1133a.m1142b(0));
        }
        if (m1133a.m1152g(1)) {
            setDivider(m1133a.m1142b(1));
        }
        m1133a.m1138a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0107p
    /* renamed from: a */
    public void mo565a(C0099h c0099h) {
        this.f492b = c0099h;
    }

    @Override // androidx.appcompat.view.menu.C0099h.b
    /* renamed from: a */
    public boolean mo566a(C0101j c0101j) {
        return this.f492b.m649a(c0101j, 0);
    }

    public int getWindowAnimations() {
        return this.f493c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo566a((C0101j) getAdapter().getItem(i));
    }
}
