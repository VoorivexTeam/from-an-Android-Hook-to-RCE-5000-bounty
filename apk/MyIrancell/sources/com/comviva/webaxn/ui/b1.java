package com.comviva.webaxn.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b1 extends androidx.viewpager.widget.a {
    private ArrayList<View> b;

    public b1(Context context, ArrayList<View> arrayList) {
        this.b = new ArrayList<>();
        this.b = arrayList;
    }

    @Override // androidx.viewpager.widget.a
    public int a() {
        return this.b.size();
    }

    @Override // androidx.viewpager.widget.a
    public Object a(ViewGroup viewGroup, int i) {
        View view = this.b.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public boolean a(View view, Object obj) {
        return view == obj;
    }
}
