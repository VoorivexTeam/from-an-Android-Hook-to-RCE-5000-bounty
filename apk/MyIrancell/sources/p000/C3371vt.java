package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p000.InterfaceC3450xt;

/* renamed from: vt */
/* loaded from: classes.dex */
public class C3371vt extends FrameLayout implements InterfaceC3450xt {

    /* renamed from: b */
    private final C3410wt f13717b;

    @Override // p000.InterfaceC3450xt
    /* renamed from: a */
    public void mo16054a() {
        this.f13717b.m16393b();
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    /* renamed from: b */
    public void mo16055b() {
        this.f13717b.m16388a();
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C3410wt c3410wt = this.f13717b;
        if (c3410wt == null) {
            super.draw(canvas);
        } else {
            c3410wt.m16390a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f13717b.m16394c();
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public int getCircularRevealScrimColor() {
        this.f13717b.m16395d();
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public InterfaceC3450xt.e getRevealInfo() {
        this.f13717b.m16396e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C3410wt c3410wt = this.f13717b;
        if (c3410wt == null) {
            return super.isOpaque();
        }
        c3410wt.m16397f();
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f13717b.m16391a(drawable);
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public void setCircularRevealScrimColor(int i) {
        this.f13717b.m16389a(i);
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public void setRevealInfo(InterfaceC3450xt.e eVar) {
        this.f13717b.m16392a(eVar);
        throw null;
    }
}
