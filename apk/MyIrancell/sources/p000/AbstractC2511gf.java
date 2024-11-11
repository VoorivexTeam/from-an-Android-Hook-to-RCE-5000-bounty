package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: gf */
/* loaded from: classes.dex */
public abstract class AbstractC2511gf<T extends Drawable> implements InterfaceC3353vb<T>, InterfaceC3160rb {

    /* renamed from: b */
    protected final T f10318b;

    public AbstractC2511gf(T t) {
        C2816ji.m13459a(t);
        this.f10318b = t;
    }

    @Override // p000.InterfaceC3160rb
    /* renamed from: a */
    public void mo11998a() {
        Bitmap m14510c;
        T t = this.f10318b;
        if (t instanceof BitmapDrawable) {
            m14510c = ((BitmapDrawable) t).getBitmap();
        } else if (!(t instanceof C3033of)) {
            return;
        } else {
            m14510c = ((C3033of) t).m14510c();
        }
        m14510c.prepareToDraw();
    }

    @Override // p000.InterfaceC3353vb
    public final T get() {
        Drawable.ConstantState constantState = this.f10318b.getConstantState();
        return constantState == null ? this.f10318b : (T) constantState.newDrawable();
    }
}
