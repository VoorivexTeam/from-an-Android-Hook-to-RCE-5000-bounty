package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: qh */
/* loaded from: classes.dex */
public class C3127qh {
    /* renamed from: a */
    public <Z> AbstractC3306uh<ImageView, Z> m15096a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C2989nh(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C3035oh(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
