package com.neevar.neevarpaymentsdk;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
class b extends ArrayAdapter<c> {
    private int b;
    private Activity c;

    public b(Activity activity, int i, List<c> list) {
        super(activity, i, list);
        this.b = i;
        this.c = activity;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        c item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.b, viewGroup, false);
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.c.getAssets(), "fonts/iransansmobile.ttf");
        TextView textView = (TextView) view.findViewById(R$id.text_view_1);
        textView.setText(item.a);
        view.setTag(item.b);
        textView.setTypeface(createFromAsset);
        textView.setGravity(19);
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.b, viewGroup, false);
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.c.getAssets(), "fonts/iransansmobile.ttf");
        TextView textView = (TextView) view.findViewById(R$id.text_view_1);
        textView.setText(item.a);
        view.setTag(item.b);
        textView.setTypeface(createFromAsset);
        textView.setGravity(19);
        return view;
    }
}
