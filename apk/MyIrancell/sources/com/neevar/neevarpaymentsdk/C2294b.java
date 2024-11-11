package com.neevar.neevarpaymentsdk;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: com.neevar.neevarpaymentsdk.b */
/* loaded from: classes.dex */
class C2294b extends ArrayAdapter<C2295c> {

    /* renamed from: b */
    private int f9266b;

    /* renamed from: c */
    private Activity f9267c;

    public C2294b(Activity activity, int i, List<C2295c> list) {
        super(activity, i, list);
        this.f9266b = i;
        this.f9267c = activity;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C2295c item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.f9266b, viewGroup, false);
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f9267c.getAssets(), "fonts/iransansmobile.ttf");
        TextView textView = (TextView) view.findViewById(R$id.text_view_1);
        textView.setText(item.f9268a);
        view.setTag(item.f9269b);
        textView.setTypeface(createFromAsset);
        textView.setGravity(19);
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C2295c item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.f9266b, viewGroup, false);
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f9267c.getAssets(), "fonts/iransansmobile.ttf");
        TextView textView = (TextView) view.findViewById(R$id.text_view_1);
        textView.setText(item.f9268a);
        view.setTag(item.f9269b);
        textView.setTypeface(createFromAsset);
        textView.setGravity(19);
        return view;
    }
}
