package com.comviva.webaxn.ui;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.comviva.webaxn.utils.x1;
import defpackage.yj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i1 extends androidx.viewpager.widget.a {
    private int b;
    private yj c;
    private x1.p d;
    private String[] e;
    private String[] f;
    private ArrayList<ImageView> g;
    private String h;
    private String i;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        final /* synthetic */ int b;

        a(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            int i2 = this.b;
            if (i2 == 1) {
                i = 0;
            } else {
                i = (i2 == i1.this.c.Z0 ? i1.this.c.Z0 : this.b) - 1;
            }
            if (i1.this.e != null) {
                i1 i1Var = i1.this;
                i1Var.h = Uri.decode(i1Var.e[i]);
            }
            if (i1.this.f != null) {
                i1 i1Var2 = i1.this;
                i1Var2.i = Uri.decode(i1Var2.f[i]);
            }
            i1.this.d.a(i1.this.h, i1.this.i, i1.this.c);
        }
    }

    public i1(Context context, yj yjVar, x1.p pVar, ArrayList<ImageView> arrayList) {
        this.g = new ArrayList<>();
        this.c = yjVar;
        this.d = pVar;
        if (!TextUtils.isEmpty(yjVar.i)) {
            this.e = this.c.i.split(";");
        }
        if (!TextUtils.isEmpty(this.c.Y0)) {
            this.f = this.c.Y0.split(";");
        }
        this.g = arrayList;
        int i = this.c.Z0;
        this.b = i > 1 ? i + 2 : i;
    }

    @Override // androidx.viewpager.widget.a
    public int a() {
        return this.b;
    }

    @Override // androidx.viewpager.widget.a
    public Object a(ViewGroup viewGroup, int i) {
        ImageView imageView = this.g.get(i);
        imageView.setOnClickListener(new a(i));
        viewGroup.addView(imageView);
        return imageView;
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
