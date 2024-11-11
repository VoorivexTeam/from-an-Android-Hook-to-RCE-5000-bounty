package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.AbstractC0429a;
import com.comviva.webaxn.utils.C0755x1;
import java.util.ArrayList;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.i1 */
/* loaded from: classes.dex */
public class C0637i1 extends AbstractC0429a {

    /* renamed from: b */
    private int f3843b;

    /* renamed from: c */
    private C3489yj f3844c;

    /* renamed from: d */
    private C0755x1.p f3845d;

    /* renamed from: e */
    private String[] f3846e;

    /* renamed from: f */
    private String[] f3847f;

    /* renamed from: g */
    private ArrayList<ImageView> f3848g;

    /* renamed from: h */
    private String f3849h;

    /* renamed from: i */
    private String f3850i;

    /* renamed from: com.comviva.webaxn.ui.i1$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f3851b;

        a(int i) {
            this.f3851b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            int i2 = this.f3851b;
            if (i2 == 1) {
                i = 0;
            } else {
                i = (i2 == C0637i1.this.f3844c.f14195Z0 ? C0637i1.this.f3844c.f14195Z0 : this.f3851b) - 1;
            }
            if (C0637i1.this.f3846e != null) {
                C0637i1 c0637i1 = C0637i1.this;
                c0637i1.f3849h = Uri.decode(c0637i1.f3846e[i]);
            }
            if (C0637i1.this.f3847f != null) {
                C0637i1 c0637i12 = C0637i1.this;
                c0637i12.f3850i = Uri.decode(c0637i12.f3847f[i]);
            }
            C0637i1.this.f3845d.mo4840a(C0637i1.this.f3849h, C0637i1.this.f3850i, C0637i1.this.f3844c);
        }
    }

    public C0637i1(Context context, C3489yj c3489yj, C0755x1.p pVar, ArrayList<ImageView> arrayList) {
        this.f3848g = new ArrayList<>();
        this.f3844c = c3489yj;
        this.f3845d = pVar;
        if (!TextUtils.isEmpty(c3489yj.f14220i)) {
            this.f3846e = this.f3844c.f14220i.split(";");
        }
        if (!TextUtils.isEmpty(this.f3844c.f14193Y0)) {
            this.f3847f = this.f3844c.f14193Y0.split(";");
        }
        this.f3848g = arrayList;
        int i = this.f3844c.f14195Z0;
        this.f3843b = i > 1 ? i + 2 : i;
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public int mo3160a() {
        return this.f3843b;
    }

    @Override // androidx.viewpager.widget.AbstractC0429a
    /* renamed from: a */
    public Object mo3163a(ViewGroup viewGroup, int i) {
        ImageView imageView = this.f3848g.get(i);
        imageView.setOnClickListener(new a(i));
        viewGroup.addView(imageView);
        return imageView;
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
