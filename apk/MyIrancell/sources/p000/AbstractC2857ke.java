package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0558c;
import com.bumptech.glide.load.InterfaceC0578l;

/* renamed from: ke */
/* loaded from: classes.dex */
public abstract class AbstractC2857ke implements InterfaceC0578l<Bitmap> {
    /* renamed from: a */
    protected abstract Bitmap mo13693a(InterfaceC2427ec interfaceC2427ec, Bitmap bitmap, int i, int i2);

    @Override // com.bumptech.glide.load.InterfaceC0578l
    /* renamed from: a */
    public final InterfaceC3353vb<Bitmap> mo3967a(Context context, InterfaceC3353vb<Bitmap> interfaceC3353vb, int i, int i2) {
        if (!C2861ki.m13732b(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC2427ec m3877c = ComponentCallbacks2C0558c.m3866b(context).m3877c();
        Bitmap bitmap = interfaceC3353vb.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap mo13693a = mo13693a(m3877c, bitmap, i, i2);
        return bitmap.equals(mo13693a) ? interfaceC3353vb : C2812je.m13456a(mo13693a, m3877c);
    }
}
