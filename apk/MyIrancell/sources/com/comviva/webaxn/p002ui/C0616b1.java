package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.AbstractC0429a;
import java.util.ArrayList;

/* renamed from: com.comviva.webaxn.ui.b1 */
/* loaded from: classes.dex */
public class C0616b1 extends AbstractC0429a {

    /* renamed from: b */
    private ArrayList<View> f3532b;

    public C0616b1(Context context, ArrayList<View> arrayList) {
        this.f3532b = new ArrayList<>();
        this.f3532b = arrayList;
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public int mo3160a() {
        return this.f3532b.size();
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public Object mo3163a(ViewGroup viewGroup, int i) {
        View view = this.f3532b.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public void mo3169a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public boolean mo3170a(View view, Object obj) {
        return view == obj;
    }
}
