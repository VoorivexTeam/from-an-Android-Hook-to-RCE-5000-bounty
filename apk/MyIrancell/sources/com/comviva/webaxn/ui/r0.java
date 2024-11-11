package com.comviva.webaxn.ui;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.widget.NestedScrollView;
import com.comviva.webaxn.utils.r1;
import com.comviva.webaxn.utils.x1;
import defpackage.d4;
import defpackage.zi;

/* loaded from: classes.dex */
public class r0 extends d4 {
    private NestedScrollView R;
    private x1.p S;
    private String T;
    private boolean U;
    private String V;
    private r1 W;

    /* loaded from: classes.dex */
    public class a implements d4.j {
        public a() {
        }

        @Override // d4.j
        public void a() {
            r0.this.d();
            x1.p pVar = r0.this.S;
            r0 r0Var = r0.this;
            pVar.a(r0Var, r0Var.T);
        }
    }

    public r0(Context context) {
        super(context);
        setOnRefreshListener(new a());
    }

    @Override // defpackage.d4
    public boolean a() {
        NestedScrollView nestedScrollView = this.R;
        if ((nestedScrollView == null || nestedScrollView.getScrollY() > 0) && !this.U) {
            return true;
        }
        return super.a();
    }

    public void d() {
        if (TextUtils.isEmpty(this.V) || zi.A == 0) {
            return;
        }
        r1 r1Var = new r1();
        this.W = r1Var;
        r1Var.a(this.V);
    }

    public r1 getUDXPAPMHandler() {
        return this.W;
    }

    public void setAPM(String str) {
        this.V = str;
    }

    public void setIsPullAllowed(boolean z) {
        this.U = z;
    }

    public void setPullToRefreshAction(String str) {
        this.T = str;
    }

    public void setRenderingEventCb(x1.p pVar) {
        this.S = pVar;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.R = nestedScrollView;
    }
}
