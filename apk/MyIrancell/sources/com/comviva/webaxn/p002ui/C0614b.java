package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.comviva.webaxn.utils.C0755x1;
import java.util.HashMap;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.b */
/* loaded from: classes.dex */
public class C0614b extends FrameLayout {

    /* renamed from: b */
    C0655o1 f3525b;

    /* renamed from: c */
    C3489yj f3526c;

    /* renamed from: d */
    private int f3527d;

    /* renamed from: e */
    private int f3528e;

    public C0614b(Context context) {
        super(context);
        new HashMap();
        this.f3527d = 1;
        this.f3528e = 1;
    }

    public C3489yj getMenu() {
        return this.f3526c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        C0655o1 c0655o1;
        C0755x1.q m4821o;
        C3489yj c3489yj;
        boolean z;
        C0655o1 c0655o12;
        int size = View.MeasureSpec.getSize(i2);
        int height = getHeight();
        if (height > size) {
            int i4 = this.f3528e;
            i3 = this.f3527d;
            if (i4 == i3) {
                if (height - size >= 150 && (c0655o12 = this.f3525b) != null) {
                    m4821o = c0655o12.m4821o();
                    c3489yj = this.f3526c;
                    z = true;
                    m4821o.mo4853a(c3489yj, z);
                }
            }
            this.f3528e = i3;
        } else if (height < size) {
            int i5 = this.f3528e;
            i3 = this.f3527d;
            if (i5 == i3) {
                if (size - height >= 150 && (c0655o1 = this.f3525b) != null) {
                    m4821o = c0655o1.m4821o();
                    c3489yj = this.f3526c;
                    z = false;
                    m4821o.mo4853a(c3489yj, z);
                }
            }
            this.f3528e = i3;
        }
        super.onMeasure(i, i2);
    }

    public void setMenu(C3489yj c3489yj) {
        this.f3526c = c3489yj;
    }

    public void setPageOrientation(int i) {
        this.f3527d = i;
    }

    public void setRenderingInstance(C0655o1 c0655o1) {
        this.f3525b = c0655o1;
    }
}
