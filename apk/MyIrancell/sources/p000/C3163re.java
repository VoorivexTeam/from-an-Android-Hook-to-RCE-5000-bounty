package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: re */
/* loaded from: classes.dex */
final class C3163re {

    /* renamed from: a */
    private static final InterfaceC2427ec f12958a = new a();

    /* renamed from: re$a */
    /* loaded from: classes.dex */
    class a extends C2468fc {
        a() {
        }

        @Override // p000.C2468fc, p000.InterfaceC2427ec
        /* renamed from: a */
        public void mo11591a(Bitmap bitmap) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC3353vb<Bitmap> m15260a(InterfaceC2427ec interfaceC2427ec, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = m15261b(interfaceC2427ec, current, i, i2);
            z = true;
        }
        if (!z) {
            interfaceC2427ec = f12958a;
        }
        return C2812je.m13456a(bitmap, interfaceC2427ec);
    }

    /* renamed from: b */
    private static Bitmap m15261b(InterfaceC2427ec interfaceC2427ec, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                String str = "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                String str2 = "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock m144a = C0019af.m144a();
        m144a.lock();
        Bitmap mo11588a = interfaceC2427ec.mo11588a(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(mo11588a);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return mo11588a;
        } finally {
            m144a.unlock();
        }
    }
}
