package com.comviva.webaxn.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.comviva.webaxn.utils.x1;
import defpackage.yj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends FrameLayout {
    o1 b;
    yj c;
    private int d;
    private int e;

    public b(Context context) {
        super(context);
        new HashMap();
        this.d = 1;
        this.e = 1;
    }

    public yj getMenu() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        o1 o1Var;
        x1.q o;
        yj yjVar;
        boolean z;
        o1 o1Var2;
        int size = View.MeasureSpec.getSize(i2);
        int height = getHeight();
        if (height > size) {
            int i4 = this.e;
            i3 = this.d;
            if (i4 == i3) {
                if (height - size >= 150 && (o1Var2 = this.b) != null) {
                    o = o1Var2.o();
                    yjVar = this.c;
                    z = true;
                    o.a(yjVar, z);
                }
            }
            this.e = i3;
        } else if (height < size) {
            int i5 = this.e;
            i3 = this.d;
            if (i5 == i3) {
                if (size - height >= 150 && (o1Var = this.b) != null) {
                    o = o1Var.o();
                    yjVar = this.c;
                    z = false;
                    o.a(yjVar, z);
                }
            }
            this.e = i3;
        }
        super.onMeasure(i, i2);
    }

    public void setMenu(yj yjVar) {
        this.c = yjVar;
    }

    public void setPageOrientation(int i) {
        this.d = i;
    }

    public void setRenderingInstance(o1 o1Var) {
        this.b = o1Var;
    }
}
