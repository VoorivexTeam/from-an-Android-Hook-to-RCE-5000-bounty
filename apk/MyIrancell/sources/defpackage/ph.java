package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.wh;

/* loaded from: classes.dex */
public abstract class ph<Z> extends uh<ImageView, Z> implements wh.a {
    private Animatable h;

    public ph(ImageView imageView) {
        super(imageView);
    }

    private void b(Z z) {
        if (!(z instanceof Animatable)) {
            this.h = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.h = animatable;
        animatable.start();
    }

    private void c(Z z) {
        a((ph<Z>) z);
        b((ph<Z>) z);
    }

    @Override // defpackage.mh, defpackage.lg
    public void a() {
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.mh, defpackage.th
    public void a(Drawable drawable) {
        super.a(drawable);
        c((ph<Z>) null);
        d(drawable);
    }

    protected abstract void a(Z z);

    @Override // defpackage.th
    public void a(Z z, wh<? super Z> whVar) {
        if (whVar == null || !whVar.a(z, this)) {
            c((ph<Z>) z);
        } else {
            b((ph<Z>) z);
        }
    }

    @Override // defpackage.mh, defpackage.lg
    public void b() {
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.uh, defpackage.mh, defpackage.th
    public void b(Drawable drawable) {
        super.b(drawable);
        c((ph<Z>) null);
        d(drawable);
    }

    @Override // defpackage.uh, defpackage.mh, defpackage.th
    public void c(Drawable drawable) {
        super.c(drawable);
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.stop();
        }
        c((ph<Z>) null);
        d(drawable);
    }

    public void d(Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }
}
