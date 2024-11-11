package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.AbstractC0429a;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class InfiniteViewPager extends ViewPager {
    public InfiniteViewPager(Context context) {
        super(context);
    }

    public InfiniteViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getOffsetAmount() {
        if (getAdapter().mo3160a() != 0 && (getAdapter() instanceof C2348a)) {
            return ((C2348a) getAdapter()).m11204c() * 100;
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.ViewPager
    /* renamed from: a */
    public void mo3130a(int i, boolean z) {
        if (getAdapter().mo3160a() == 0) {
            super.mo3130a(i, z);
        } else {
            super.mo3130a(getOffsetAmount() + (i % getAdapter().mo3160a()), z);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        if (getAdapter().mo3160a() == 0) {
            return super.getCurrentItem();
        }
        return getAdapter() instanceof C2348a ? super.getCurrentItem() % ((C2348a) getAdapter()).m11204c() : super.getCurrentItem();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(AbstractC0429a abstractC0429a) {
        super.setAdapter(abstractC0429a);
        setCurrentItem(0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        mo3130a(i, false);
    }
}
