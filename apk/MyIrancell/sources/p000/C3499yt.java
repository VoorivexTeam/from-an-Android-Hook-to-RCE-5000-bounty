package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p000.InterfaceC3450xt;

/* renamed from: yt */
/* loaded from: classes.dex */
public class C3499yt extends C3281u implements InterfaceC3450xt {

    /* renamed from: g */
    private final C3410wt f14281g;

    @Override // p000.InterfaceC3450xt
    /* renamed from: a */
    public void mo16054a() {
        this.f14281g.m16393b();
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    /* renamed from: b */
    public void mo16055b() {
        this.f14281g.m16388a();
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C3410wt c3410wt = this.f14281g;
        if (c3410wt == null) {
            super.draw(canvas);
        } else {
            c3410wt.m16390a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f14281g.m16394c();
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public int getCircularRevealScrimColor() {
        this.f14281g.m16395d();
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public InterfaceC3450xt.e getRevealInfo() {
        this.f14281g.m16396e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C3410wt c3410wt = this.f14281g;
        if (c3410wt == null) {
            return super.isOpaque();
        }
        c3410wt.m16397f();
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f14281g.m16391a(drawable);
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public void setCircularRevealScrimColor(int i) {
        this.f14281g.m16389a(i);
        throw null;
    }

    @Override // p000.InterfaceC3450xt
    public void setRevealInfo(InterfaceC3450xt.e eVar) {
        this.f14281g.m16392a(eVar);
        throw null;
    }
}
