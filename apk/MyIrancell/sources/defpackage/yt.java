package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import defpackage.xt;

/* loaded from: classes.dex */
public class yt extends u implements xt {
    private final wt g;

    @Override // defpackage.xt
    public void a() {
        this.g.b();
        throw null;
    }

    @Override // defpackage.xt
    public void b() {
        this.g.a();
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        wt wtVar = this.g;
        if (wtVar == null) {
            super.draw(canvas);
        } else {
            wtVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.g.c();
        throw null;
    }

    @Override // defpackage.xt
    public int getCircularRevealScrimColor() {
        this.g.d();
        throw null;
    }

    @Override // defpackage.xt
    public xt.e getRevealInfo() {
        this.g.e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        wt wtVar = this.g;
        if (wtVar == null) {
            return super.isOpaque();
        }
        wtVar.f();
        throw null;
    }

    @Override // defpackage.xt
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.g.a(drawable);
        throw null;
    }

    @Override // defpackage.xt
    public void setCircularRevealScrimColor(int i) {
        this.g.a(i);
        throw null;
    }

    @Override // defpackage.xt
    public void setRevealInfo(xt.e eVar) {
        this.g.a(eVar);
        throw null;
    }
}
