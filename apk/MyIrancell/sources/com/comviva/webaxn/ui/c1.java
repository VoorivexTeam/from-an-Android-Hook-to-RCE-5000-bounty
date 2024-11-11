package com.comviva.webaxn.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.dj;

/* loaded from: classes.dex */
public class c1 {
    private String a;
    private TextView b;
    private ImageView c;
    private dj d;
    private com.comviva.webaxn.utils.u e;

    public dj a() {
        return this.d;
    }

    public void a(View view) {
        n1.a(this.d, view);
    }

    public void a(ImageView imageView) {
        this.c = imageView;
    }

    public void a(TextView textView) {
        this.b = textView;
    }

    public void a(com.comviva.webaxn.utils.u uVar) {
        this.e = uVar;
    }

    public void a(dj djVar) {
        this.d = djVar;
    }

    public void a(String str) {
        this.a = str;
    }

    public ImageView b() {
        return this.c;
    }

    public com.comviva.webaxn.utils.u c() {
        return this.e;
    }

    public TextView d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }
}
