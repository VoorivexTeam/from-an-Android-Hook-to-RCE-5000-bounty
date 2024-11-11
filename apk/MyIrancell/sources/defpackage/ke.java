package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.load.l;

/* loaded from: classes.dex */
public abstract class ke implements l<Bitmap> {
    protected abstract Bitmap a(ec ecVar, Bitmap bitmap, int i, int i2);

    @Override // com.bumptech.glide.load.l
    public final vb<Bitmap> a(Context context, vb<Bitmap> vbVar, int i, int i2) {
        if (!ki.b(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        ec c = c.b(context).c();
        Bitmap bitmap = vbVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap a = a(c, bitmap, i, i2);
        return bitmap.equals(a) ? vbVar : je.a(a, c);
    }
}
