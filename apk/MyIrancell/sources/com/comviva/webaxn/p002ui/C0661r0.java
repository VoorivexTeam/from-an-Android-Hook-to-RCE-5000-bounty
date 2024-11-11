package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.widget.NestedScrollView;
import com.comviva.webaxn.utils.C0737r1;
import com.comviva.webaxn.utils.C0755x1;
import p000.C2373d4;
import p000.C3530zi;

/* renamed from: com.comviva.webaxn.ui.r0 */
/* loaded from: classes.dex */
public class C0661r0 extends C2373d4 {

    /* renamed from: R */
    private NestedScrollView f4302R;

    /* renamed from: S */
    private C0755x1.p f4303S;

    /* renamed from: T */
    private String f4304T;

    /* renamed from: U */
    private boolean f4305U;

    /* renamed from: V */
    private String f4306V;

    /* renamed from: W */
    private C0737r1 f4307W;

    /* renamed from: com.comviva.webaxn.ui.r0$a */
    /* loaded from: classes.dex */
    public class a implements C2373d4.j {
        public a() {
        }

        @Override // p000.C2373d4.j
        /* renamed from: a */
        public void mo4929a() {
            C0661r0.this.m4928d();
            C0755x1.p pVar = C0661r0.this.f4303S;
            C0661r0 c0661r0 = C0661r0.this;
            pVar.mo4837a(c0661r0, c0661r0.f4304T);
        }
    }

    public C0661r0(Context context) {
        super(context);
        setOnRefreshListener(new a());
    }

    @Override // p000.C2373d4
    /* renamed from: a */
    public boolean mo4927a() {
        NestedScrollView nestedScrollView = this.f4302R;
        if ((nestedScrollView == null || nestedScrollView.getScrollY() > 0) && !this.f4305U) {
            return true;
        }
        return super.mo4927a();
    }

    /* renamed from: d */
    public void m4928d() {
        if (TextUtils.isEmpty(this.f4306V) || C3530zi.f14454A == 0) {
            return;
        }
        C0737r1 c0737r1 = new C0737r1();
        this.f4307W = c0737r1;
        c0737r1.m6012a(this.f4306V);
    }

    public C0737r1 getUDXPAPMHandler() {
        return this.f4307W;
    }

    public void setAPM(String str) {
        this.f4306V = str;
    }

    public void setIsPullAllowed(boolean z) {
        this.f4305U = z;
    }

    public void setPullToRefreshAction(String str) {
        this.f4304T = str;
    }

    public void setRenderingEventCb(C0755x1.p pVar) {
        this.f4303S = pVar;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f4302R = nestedScrollView;
    }
}
