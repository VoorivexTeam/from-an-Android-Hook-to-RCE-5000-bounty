package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.f */
/* loaded from: classes.dex */
public class C0254f extends AbstractViewOnTouchListenerC0249a {

    /* renamed from: t */
    private final ListView f1553t;

    public C0254f(ListView listView) {
        super(listView);
        this.f1553t = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0249a
    /* renamed from: a */
    public void mo1551a(int i, int i2) {
        C0255g.m1585b(this.f1553t, i2);
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0249a
    /* renamed from: a */
    public boolean mo1552a(int i) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0249a
    /* renamed from: b */
    public boolean mo1555b(int i) {
        ListView listView = this.f1553t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
