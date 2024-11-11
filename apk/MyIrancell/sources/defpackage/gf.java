package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class gf<T extends Drawable> implements vb<T>, rb {
    protected final T b;

    public gf(T t) {
        ji.a(t);
        this.b = t;
    }

    @Override // defpackage.rb
    public void a() {
        Bitmap c;
        T t = this.b;
        if (t instanceof BitmapDrawable) {
            c = ((BitmapDrawable) t).getBitmap();
        } else if (!(t instanceof of)) {
            return;
        } else {
            c = ((of) t).c();
        }
        c.prepareToDraw();
    }

    @Override // defpackage.vb
    public final T get() {
        Drawable.ConstantState constantState = this.b.getConstantState();
        return constantState == null ? this.b : (T) constantState.newDrawable();
    }
}
