package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p000.InterfaceC3398wh;

/* renamed from: ph */
/* loaded from: classes.dex */
public abstract class AbstractC3085ph<Z> extends AbstractC3306uh<ImageView, Z> implements InterfaceC3398wh.a {

    /* renamed from: h */
    private Animatable f12601h;

    public AbstractC3085ph(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    private void m14752b(Z z) {
        if (!(z instanceof Animatable)) {
            this.f12601h = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f12601h = animatable;
        animatable.start();
    }

    /* renamed from: c */
    private void m14753c(Z z) {
        mo14333a((AbstractC3085ph<Z>) z);
        m14752b((AbstractC3085ph<Z>) z);
    }

    @Override // p000.AbstractC2943mh, p000.InterfaceC2896lg
    /* renamed from: a */
    public void mo3931a() {
        Animatable animatable = this.f12601h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p000.AbstractC2943mh, p000.InterfaceC3262th
    /* renamed from: a */
    public void mo14104a(Drawable drawable) {
        super.mo14104a(drawable);
        m14753c((AbstractC3085ph<Z>) null);
        m14755d(drawable);
    }

    /* renamed from: a */
    protected abstract void mo14333a(Z z);

    @Override // p000.InterfaceC3262th
    /* renamed from: a */
    public void mo14754a(Z z, InterfaceC3398wh<? super Z> interfaceC3398wh) {
        if (interfaceC3398wh == null || !interfaceC3398wh.mo16018a(z, this)) {
            m14753c((AbstractC3085ph<Z>) z);
        } else {
            m14752b((AbstractC3085ph<Z>) z);
        }
    }

    @Override // p000.AbstractC2943mh, p000.InterfaceC2896lg
    /* renamed from: b */
    public void mo3936b() {
        Animatable animatable = this.f12601h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p000.AbstractC3306uh, p000.AbstractC2943mh, p000.InterfaceC3262th
    /* renamed from: b */
    public void mo14106b(Drawable drawable) {
        super.mo14106b(drawable);
        m14753c((AbstractC3085ph<Z>) null);
        m14755d(drawable);
    }

    @Override // p000.AbstractC3306uh, p000.AbstractC2943mh, p000.InterfaceC3262th
    /* renamed from: c */
    public void mo14108c(Drawable drawable) {
        super.mo14108c(drawable);
        Animatable animatable = this.f12601h;
        if (animatable != null) {
            animatable.stop();
        }
        m14753c((AbstractC3085ph<Z>) null);
        m14755d(drawable);
    }

    /* renamed from: d */
    public void m14755d(Drawable drawable) {
        ((ImageView) this.f13469b).setImageDrawable(drawable);
    }
}
