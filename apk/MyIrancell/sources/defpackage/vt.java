package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import defpackage.xt;

/* loaded from: classes.dex */
public class vt extends FrameLayout implements xt {
    private final wt b;

    @Override // defpackage.xt
    public void a() {
        this.b.b();
        throw null;
    }

    @Override // defpackage.xt
    public void b() {
        this.b.a();
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        wt wtVar = this.b;
        if (wtVar == null) {
            super.draw(canvas);
        } else {
            wtVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.b.c();
        throw null;
    }

    @Override // defpackage.xt
    public int getCircularRevealScrimColor() {
        this.b.d();
        throw null;
    }

    @Override // defpackage.xt
    public xt.e getRevealInfo() {
        this.b.e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        wt wtVar = this.b;
        if (wtVar == null) {
            return super.isOpaque();
        }
        wtVar.f();
        throw null;
    }

    @Override // defpackage.xt
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.b.a(drawable);
        throw null;
    }

    @Override // defpackage.xt
    public void setCircularRevealScrimColor(int i) {
        this.b.a(i);
        throw null;
    }

    @Override // defpackage.xt
    public void setRevealInfo(xt.e eVar) {
        this.b.a(eVar);
        throw null;
    }
}
